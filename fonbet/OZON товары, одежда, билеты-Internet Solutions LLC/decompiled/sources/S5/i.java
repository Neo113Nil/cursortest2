package S5;

import R5.a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.LruCache;
import com.bumptech.glide.integration.webp.WebpFrame;
import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class i implements R5.a {

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f25802a;

    /* renamed from: b, reason: collision with root package name */
    private WebpImage f25803b;

    /* renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0488a f25804c;

    /* renamed from: d, reason: collision with root package name */
    private int f25805d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f25806e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.integration.webp.a[] f25807f;

    /* renamed from: g, reason: collision with root package name */
    private int f25808g;

    /* renamed from: h, reason: collision with root package name */
    private int f25809h;

    /* renamed from: i, reason: collision with root package name */
    private int f25810i;

    /* renamed from: j, reason: collision with root package name */
    private final Paint f25811j;

    /* renamed from: k, reason: collision with root package name */
    private n f25812k;

    /* renamed from: l, reason: collision with root package name */
    private Bitmap.Config f25813l;

    /* renamed from: m, reason: collision with root package name */
    private final LruCache<Integer, Bitmap> f25814m;

    final class a extends LruCache<Integer, Bitmap> {
        a(int i11) {
            super(i11);
        }

        @Override // android.util.LruCache
        protected final void entryRemoved(boolean z11, Integer num, Bitmap bitmap, Bitmap bitmap2) {
            Bitmap bitmap3 = bitmap;
            if (bitmap3 != null) {
                ((g6.b) i.this.f25804c).d(bitmap3);
            }
        }
    }

    public i(a.InterfaceC0488a interfaceC0488a, WebpImage webpImage, ByteBuffer byteBuffer, int i11) {
        this(interfaceC0488a, webpImage, byteBuffer, i11, n.f25836b);
    }

    private void e(Canvas canvas, com.bumptech.glide.integration.webp.a aVar) {
        int i11 = this.f25808g;
        int i12 = aVar.f57586b;
        int i13 = aVar.f57587c;
        canvas.drawRect(i12 / i11, i13 / i11, (i12 + aVar.f57588d) / i11, (i13 + aVar.f57589e) / i11, this.f25811j);
    }

    private boolean m(com.bumptech.glide.integration.webp.a aVar) {
        if (aVar.f57586b != 0 || aVar.f57587c != 0) {
            return false;
        }
        if (aVar.f57588d == this.f25803b.getWidth()) {
            return aVar.f57589e == this.f25803b.getHeight();
        }
        return false;
    }

    private boolean n(int i11) {
        if (i11 == 0) {
            return true;
        }
        com.bumptech.glide.integration.webp.a[] aVarArr = this.f25807f;
        com.bumptech.glide.integration.webp.a aVar = aVarArr[i11];
        com.bumptech.glide.integration.webp.a aVar2 = aVarArr[i11 - 1];
        if (aVar.f57591g || !m(aVar)) {
            return aVar2.f57592h && m(aVar2);
        }
        return true;
    }

    private void o(Canvas canvas, int i11) {
        a.InterfaceC0488a interfaceC0488a = this.f25804c;
        com.bumptech.glide.integration.webp.a aVar = this.f25807f[i11];
        int i12 = aVar.f57588d;
        int i13 = this.f25808g;
        int i14 = i12 / i13;
        int i15 = aVar.f57589e / i13;
        int i16 = aVar.f57586b / i13;
        int i17 = aVar.f57587c / i13;
        if (i14 == 0 || i15 == 0) {
            return;
        }
        WebpFrame frame = this.f25803b.getFrame(i11);
        try {
            Bitmap a11 = ((g6.b) interfaceC0488a).a(i14, i15, this.f25813l);
            a11.eraseColor(0);
            a11.setDensity(canvas.getDensity());
            frame.renderFrame(i14, i15, a11);
            canvas.drawBitmap(a11, i16, i17, (Paint) null);
            ((g6.b) interfaceC0488a).d(a11);
        } catch (IllegalArgumentException | IllegalStateException unused) {
            Log.e("WebpDecoder", "Rendering of frame failed. Frame number: " + i11);
        } finally {
            frame.dispose();
        }
    }

    @Override // R5.a
    public final Bitmap a() {
        int i11;
        Bitmap bitmap;
        int i12 = this.f25805d;
        int i13 = this.f25810i;
        int i14 = this.f25809h;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        a.InterfaceC0488a interfaceC0488a = this.f25804c;
        Bitmap a11 = ((g6.b) interfaceC0488a).a(i13, i14, config);
        a11.eraseColor(0);
        a11.setDensity(DisplayMetrics.DENSITY_DEVICE_STABLE);
        Canvas canvas = new Canvas(a11);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        boolean b11 = this.f25812k.b();
        LruCache<Integer, Bitmap> lruCache = this.f25814m;
        if (!b11 && (bitmap = lruCache.get(Integer.valueOf(i12))) != null) {
            if (Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "hit frame bitmap from memory cache, frameNumber=" + i12);
            }
            bitmap.setDensity(canvas.getDensity());
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return a11;
        }
        boolean n11 = n(i12);
        com.bumptech.glide.integration.webp.a[] aVarArr = this.f25807f;
        if (n11) {
            i11 = i12;
        } else {
            i11 = i12 - 1;
            while (true) {
                if (i11 < 0) {
                    i11 = 0;
                    break;
                }
                com.bumptech.glide.integration.webp.a aVar = aVarArr[i11];
                if (aVar.f57592h && m(aVar)) {
                    break;
                }
                Bitmap bitmap2 = lruCache.get(Integer.valueOf(i11));
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmap2.setDensity(canvas.getDensity());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                    if (aVar.f57592h) {
                        e(canvas, aVar);
                    }
                } else {
                    if (n(i11)) {
                        break;
                    }
                    i11--;
                }
            }
            i11++;
        }
        if (Log.isLoggable("WebpDecoder", 3)) {
            Log.d("WebpDecoder", "frameNumber=" + i12 + ", nextIndex=" + i11);
        }
        while (i11 < i12) {
            com.bumptech.glide.integration.webp.a aVar2 = aVarArr[i11];
            if (!aVar2.f57591g) {
                e(canvas, aVar2);
            }
            o(canvas, i11);
            boolean isLoggable = Log.isLoggable("WebpDecoder", 3);
            boolean z11 = aVar2.f57592h;
            if (isLoggable) {
                StringBuilder f7 = P4.f.f(i11, "renderFrame, index=", ", blend=");
                f7.append(aVar2.f57591g);
                f7.append(", dispose=");
                f7.append(z11);
                Log.d("WebpDecoder", f7.toString());
            }
            if (z11) {
                e(canvas, aVar2);
            }
            i11++;
        }
        com.bumptech.glide.integration.webp.a aVar3 = aVarArr[i12];
        if (!aVar3.f57591g) {
            e(canvas, aVar3);
        }
        o(canvas, i12);
        if (Log.isLoggable("WebpDecoder", 3)) {
            StringBuilder f11 = P4.f.f(i12, "renderFrame, index=", ", blend=");
            f11.append(aVar3.f57591g);
            f11.append(", dispose=");
            f11.append(aVar3.f57592h);
            Log.d("WebpDecoder", f11.toString());
        }
        lruCache.remove(Integer.valueOf(i12));
        Bitmap a12 = ((g6.b) interfaceC0488a).a(a11.getWidth(), a11.getHeight(), a11.getConfig());
        a12.eraseColor(0);
        a12.setDensity(a11.getDensity());
        Canvas canvas2 = new Canvas(a12);
        canvas2.drawColor(0, PorterDuff.Mode.SRC);
        canvas2.drawBitmap(a11, 0.0f, 0.0f, (Paint) null);
        lruCache.put(Integer.valueOf(i12), a12);
        return a11;
    }

    public final void c() {
        this.f25805d = (this.f25805d + 1) % this.f25803b.getFrameCount();
    }

    public final void d() {
        this.f25803b.dispose();
        this.f25803b = null;
        this.f25814m.evictAll();
        this.f25802a = null;
    }

    public final int f() {
        return this.f25803b.getSizeInBytes();
    }

    public final n g() {
        return this.f25812k;
    }

    public final int h() {
        return this.f25805d;
    }

    public final ByteBuffer i() {
        return this.f25802a;
    }

    public final int j() {
        return this.f25803b.getFrameCount();
    }

    public final int k() {
        int i11;
        int[] iArr = this.f25806e;
        if (iArr.length == 0 || (i11 = this.f25805d) < 0) {
            return 0;
        }
        if (i11 < 0 || i11 >= iArr.length) {
            return -1;
        }
        return iArr[i11];
    }

    public final int l() {
        if (this.f25803b.getLoopCount() == 0) {
            return 0;
        }
        return this.f25803b.getLoopCount();
    }

    public i(a.InterfaceC0488a interfaceC0488a, WebpImage webpImage, ByteBuffer byteBuffer, int i11, n nVar) {
        this.f25805d = -1;
        this.f25813l = Bitmap.Config.ARGB_8888;
        this.f25804c = interfaceC0488a;
        this.f25803b = webpImage;
        this.f25806e = webpImage.getFrameDurations();
        this.f25807f = new com.bumptech.glide.integration.webp.a[webpImage.getFrameCount()];
        for (int i12 = 0; i12 < this.f25803b.getFrameCount(); i12++) {
            this.f25807f[i12] = this.f25803b.getFrameInfo(i12);
            if (Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "mFrameInfos: " + this.f25807f[i12].toString());
            }
        }
        this.f25812k = nVar;
        Paint paint = new Paint();
        this.f25811j = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f25814m = new a(nVar.a() ? webpImage.getFrameCount() : Math.max(5, 0));
        new R5.c();
        if (i11 <= 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Sample size must be >=0, not: "));
        }
        int highestOneBit = Integer.highestOneBit(i11);
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f25802a = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f25808g = highestOneBit;
        this.f25810i = this.f25803b.getWidth() / highestOneBit;
        this.f25809h = this.f25803b.getHeight() / highestOneBit;
    }
}
