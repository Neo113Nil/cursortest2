package F6;

import J6.b;
import M6.c;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class a<Decoder extends J6.b<?, ?>> extends Drawable implements Animatable, b.h {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f9081a;

    /* renamed from: b, reason: collision with root package name */
    private final Decoder f9082b;

    /* renamed from: c, reason: collision with root package name */
    private final PaintFlagsDrawFilter f9083c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f9084d;

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f9085e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f9086f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f9087g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f9088h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9089i;

    /* renamed from: j, reason: collision with root package name */
    private final HashSet f9090j;

    /* renamed from: F6.a$a, reason: collision with other inner class name */
    final class HandlerC0191a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G6.a f9091a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        HandlerC0191a(G6.a aVar, Looper looper) {
            super(looper);
            this.f9091a = aVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i11 = message.what;
            G6.a aVar = this.f9091a;
            if (i11 == 1) {
                Iterator it = new ArrayList(((a) aVar).f9085e).iterator();
                while (it.hasNext()) {
                    ((androidx.vectordrawable.graphics.drawable.b) it.next()).getClass();
                }
            } else {
                if (i11 != 2) {
                    return;
                }
                Iterator it2 = new ArrayList(((a) aVar).f9085e).iterator();
                while (it2.hasNext()) {
                    ((androidx.vectordrawable.graphics.drawable.b) it2.next()).getClass();
                }
            }
        }
    }

    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G6.a f9092a;

        b(G6.a aVar) {
            this.f9092a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f9092a.invalidateSelf();
        }
    }

    public a(c cVar) {
        Paint paint = new Paint();
        this.f9081a = paint;
        this.f9083c = new PaintFlagsDrawFilter(0, 3);
        this.f9084d = new Matrix();
        this.f9085e = new HashSet();
        G6.a aVar = (G6.a) this;
        this.f9087g = new HandlerC0191a(aVar, Looper.getMainLooper());
        this.f9088h = new b(aVar);
        this.f9089i = true;
        this.f9090j = new HashSet();
        paint.setAntiAlias(true);
        this.f9082b = new H6.b(cVar, this);
    }

    @Override // J6.b.h
    public final void a(ByteBuffer byteBuffer) {
        Decoder decoder = this.f9082b;
        if (decoder.z()) {
            Bitmap bitmap = this.f9086f;
            if (bitmap == null || bitmap.isRecycled()) {
                this.f9086f = Bitmap.createBitmap(decoder.q().width() / decoder.u(), decoder.q().height() / decoder.u(), Bitmap.Config.ARGB_8888);
            }
            byteBuffer.rewind();
            if (byteBuffer.remaining() < this.f9086f.getByteCount()) {
                Log.e("a", "onRender:Buffer not large enough for pixels");
            } else {
                this.f9086f.copyPixelsFromBuffer(byteBuffer);
                this.f9087g.post(this.f9088h);
            }
        }
    }

    @Override // J6.b.h
    public final void b() {
        Message.obtain(this.f9087g, 2).sendToTarget();
    }

    public final Decoder d() {
        return this.f9082b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f9086f;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.setDrawFilter(this.f9083c);
        canvas.drawBitmap(this.f9086f, this.f9084d, this.f9081a);
    }

    public final void e() {
        this.f9089i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        try {
            return this.f9082b.q().height();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        try {
            return this.f9082b.q().width();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        Iterator it = new HashSet(this.f9090j).iterator();
        while (it.hasNext()) {
            Drawable.Callback callback = (Drawable.Callback) ((WeakReference) it.next()).get();
            if (callback != null && callback != super.getCallback()) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f9082b.z();
    }

    @Override // J6.b.h
    public final void onStart() {
        Message.obtain(this.f9087g, 1).sendToTarget();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f9081a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i11, int i12, int i13, int i14) {
        super.setBounds(i11, i12, i13, i14);
        Decoder decoder = this.f9082b;
        int u11 = decoder.u();
        int H11 = decoder.H(getBounds().width(), getBounds().height());
        float f7 = H11;
        this.f9084d.setScale(((getBounds().width() * 1.0f) * f7) / decoder.q().width(), ((getBounds().height() * 1.0f) * f7) / decoder.q().height());
        if (H11 != u11) {
            this.f9086f = Bitmap.createBitmap(decoder.q().width() / H11, decoder.q().height() / H11, Bitmap.Config.ARGB_8888);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9081a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        Drawable.Callback callback = super.getCallback();
        HashSet hashSet = this.f9090j;
        Iterator it = new HashSet(hashSet).iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            Drawable.Callback callback2 = (Drawable.Callback) weakReference.get();
            if (callback2 == null) {
                arrayList.add(weakReference);
            } else if (callback2 == callback) {
                z13 = true;
            } else {
                callback2.invalidateDrawable(this);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            hashSet.remove((WeakReference) it2.next());
        }
        if (!z13) {
            hashSet.add(new WeakReference(callback));
        }
        if (this.f9089i) {
            Decoder decoder = this.f9082b;
            if (z11) {
                if (!decoder.z()) {
                    decoder.o(this);
                    if (this.f9089i) {
                        decoder.I();
                    } else if (!decoder.z()) {
                        decoder.I();
                    }
                }
            } else if (decoder.z()) {
                decoder.E(this);
                if (this.f9089i) {
                    decoder.K();
                } else {
                    decoder.L();
                }
            }
        }
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Decoder decoder = this.f9082b;
        if (decoder.z()) {
            decoder.K();
        }
        decoder.G();
        decoder.o(this);
        if (this.f9089i) {
            decoder.I();
        } else {
            if (decoder.z()) {
                return;
            }
            decoder.I();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Decoder decoder = this.f9082b;
        decoder.E(this);
        if (this.f9089i) {
            decoder.K();
        } else {
            decoder.L();
        }
    }
}
