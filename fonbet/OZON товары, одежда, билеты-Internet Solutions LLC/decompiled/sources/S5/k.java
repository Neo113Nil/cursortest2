package S5;

import S5.o;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class k extends Drawable implements o.b, Animatable {

    /* renamed from: a, reason: collision with root package name */
    private final a f25824a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25825b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25826c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25827d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25828e;

    /* renamed from: f, reason: collision with root package name */
    private int f25829f;

    /* renamed from: g, reason: collision with root package name */
    private int f25830g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25831h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f25832i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f25833j;

    /* loaded from: classes8.dex */
    static class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        final o f25834a;

        public a(W5.d dVar, o oVar) {
            this.f25834a = oVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new k(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new k(this);
        }
    }

    public k() {
        throw null;
    }

    k(a aVar) {
        this.f25830g = -1;
        this.f25828e = true;
        this.f25824a = aVar;
        int h11 = aVar.f25834a.h();
        this.f25830g = h11 != 0 ? h11 : -1;
    }

    private void g() {
        p6.k.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f25827d);
        a aVar = this.f25824a;
        if (aVar.f25834a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f25825b) {
                return;
            }
            this.f25825b = true;
            aVar.f25834a.n(this);
            invalidateSelf();
        }
    }

    @Override // S5.o.b
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (this.f25824a.f25834a.d() == r0.f25834a.f() - 1) {
            this.f25829f++;
        }
        int i11 = this.f25830g;
        if (i11 == -1 || this.f25829f < i11) {
            return;
        }
        stop();
    }

    public final ByteBuffer b() {
        return this.f25824a.f25834a.b();
    }

    public final Bitmap c() {
        return this.f25824a.f25834a.e();
    }

    public final int d() {
        return this.f25824a.f25834a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f25827d) {
            return;
        }
        if (this.f25831h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f25833j == null) {
                this.f25833j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f25833j);
            this.f25831h = false;
        }
        Bitmap c11 = this.f25824a.f25834a.c();
        if (this.f25833j == null) {
            this.f25833j = new Rect();
        }
        Rect rect = this.f25833j;
        if (this.f25832i == null) {
            this.f25832i = new Paint(2);
        }
        canvas.drawBitmap(c11, (Rect) null, rect, this.f25832i);
    }

    public final void e() {
        this.f25827d = true;
        this.f25824a.f25834a.a();
    }

    public final void f(T5.m<Bitmap> mVar, Bitmap bitmap) {
        this.f25824a.f25834a.m(mVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f25824a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f25824a.f25834a.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f25824a.f25834a.j();
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f25825b;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f25831h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        if (this.f25832i == null) {
            this.f25832i = new Paint(2);
        }
        this.f25832i.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f25832i == null) {
            this.f25832i = new Paint(2);
        }
        this.f25832i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        p6.k.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f25827d);
        this.f25828e = z11;
        if (!z11) {
            this.f25825b = false;
            this.f25824a.f25834a.o(this);
        } else if (this.f25826c) {
            g();
        }
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f25826c = true;
        this.f25829f = 0;
        if (this.f25828e) {
            g();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f25826c = false;
        this.f25825b = false;
        this.f25824a.f25834a.o(this);
    }
}
