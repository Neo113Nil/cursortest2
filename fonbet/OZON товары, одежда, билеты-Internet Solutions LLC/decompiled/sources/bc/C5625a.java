package bc;

import B4.V;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* renamed from: bc.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5625a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final String f55844a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5626b f55845b;

    /* renamed from: c, reason: collision with root package name */
    private final C5636l f55846c;

    /* renamed from: d, reason: collision with root package name */
    private final C5637m f55847d;

    /* renamed from: e, reason: collision with root package name */
    private final Drawable f55848e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f55849f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable.Callback f55850g;

    /* renamed from: h, reason: collision with root package name */
    private int f55851h;

    /* renamed from: i, reason: collision with root package name */
    private float f55852i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f55853j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f55854k = false;

    /* renamed from: bc.a$a, reason: collision with other inner class name */
    private class C0833a implements Drawable.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.Callback f55855a;

        C0833a(@NonNull Drawable.Callback callback) {
            this.f55855a = callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(@NonNull Drawable drawable) {
            this.f55855a.invalidateDrawable(C5625a.this);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j11) {
            this.f55855a.scheduleDrawable(C5625a.this, runnable, j11);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            this.f55855a.unscheduleDrawable(C5625a.this, runnable);
        }
    }

    public C5625a(@NonNull String str, @NonNull AbstractC5626b abstractC5626b, @NonNull C5637m c5637m, C5636l c5636l) {
        this.f55844a = str;
        this.f55845b = abstractC5626b;
        this.f55847d = c5637m;
        this.f55846c = c5636l;
        abstractC5626b.getClass();
        this.f55848e = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r3.isEmpty() == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c() {
        Rect rect;
        if (this.f55851h == 0) {
            this.f55853j = true;
            Drawable drawable = this.f55849f;
            if (drawable != null) {
                rect = drawable.getBounds();
                if (rect.isEmpty()) {
                    rect = new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                }
                setBounds(rect);
                return;
            }
            rect = new Rect(0, 0, 1, 1);
            setBounds(rect);
            return;
        }
        this.f55853j = false;
        this.f55847d.getClass();
        Rect bounds = this.f55849f.getBounds();
        int i11 = this.f55851h;
        if (this.f55846c == null) {
            int width = bounds.width();
            if (width > i11) {
                bounds = new Rect(0, 0, i11, (int) ((bounds.height() / (width / i11)) + 0.5f));
            }
        } else {
            bounds.width();
            bounds.height();
        }
        this.f55849f.setBounds(bounds);
        this.f55849f.setCallback(this.f55850g);
        setBounds(bounds);
        invalidateSelf();
    }

    @NonNull
    public final String a() {
        return this.f55844a;
    }

    public final boolean b() {
        return this.f55849f != null;
    }

    public final void d(float f7, int i11) {
        this.f55851h = i11;
        this.f55852i = f7;
        if (this.f55853j) {
            c();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (b()) {
            this.f55849f.draw(canvas);
        }
    }

    public final void e(Drawable.Callback callback) {
        this.f55850g = callback == null ? null : new C0833a(callback);
        setCallback(callback);
        Drawable.Callback callback2 = this.f55850g;
        AbstractC5626b abstractC5626b = this.f55845b;
        if (callback2 == null) {
            Drawable drawable = this.f55849f;
            if (drawable != null) {
                drawable.setCallback(null);
                Object obj = this.f55849f;
                if (obj instanceof Animatable) {
                    Animatable animatable = (Animatable) obj;
                    boolean isRunning = animatable.isRunning();
                    this.f55854k = isRunning;
                    if (isRunning) {
                        animatable.stop();
                    }
                }
            }
            abstractC5626b.a(this);
            return;
        }
        Drawable drawable2 = this.f55849f;
        if (drawable2 != null && drawable2.getCallback() == null) {
            this.f55849f.setCallback(this.f55850g);
        }
        Drawable drawable3 = this.f55849f;
        boolean z11 = drawable3 == null || drawable3 == this.f55848e;
        if (drawable3 != null) {
            drawable3.setCallback(this.f55850g);
            Object obj2 = this.f55849f;
            if ((obj2 instanceof Animatable) && this.f55854k) {
                ((Animatable) obj2).start();
            }
        }
        if (z11) {
            abstractC5626b.b(this);
        }
    }

    public final void f(@NonNull Drawable drawable) {
        this.f55854k = false;
        Drawable drawable2 = this.f55849f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f55849f = drawable;
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (b()) {
            return this.f55849f.getIntrinsicHeight();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (b()) {
            return this.f55849f.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (b()) {
            return this.f55849f.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AsyncDrawable{destination='");
        sb2.append(this.f55844a);
        sb2.append("', imageSize=");
        sb2.append(this.f55846c);
        sb2.append(", result=");
        sb2.append(this.f55849f);
        sb2.append(", canvasWidth=");
        sb2.append(this.f55851h);
        sb2.append(", textSize=");
        sb2.append(this.f55852i);
        sb2.append(", waitingForDimensions=");
        return V.d(sb2, this.f55853j, '}');
    }
}
