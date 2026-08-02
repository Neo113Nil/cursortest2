package Yf;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public final class o extends j<c> {

    /* renamed from: H, reason: collision with root package name */
    private static final HashSet f34979H;

    /* renamed from: A, reason: collision with root package name */
    private float f34980A;

    /* renamed from: B, reason: collision with root package name */
    private float f34981B;

    /* renamed from: C, reason: collision with root package name */
    private float f34982C;

    /* renamed from: D, reason: collision with root package name */
    private float f34983D;

    /* renamed from: E, reason: collision with root package name */
    private float f34984E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f34985F;

    /* renamed from: G, reason: collision with root package name */
    private float f34986G;

    /* renamed from: v, reason: collision with root package name */
    private final GestureDetector f34987v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f34988w;

    /* renamed from: x, reason: collision with root package name */
    private PointF f34989x;

    /* renamed from: y, reason: collision with root package name */
    private float f34990y;

    /* renamed from: z, reason: collision with root package name */
    private float f34991z;

    final class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                o oVar = o.this;
                oVar.f34988w = true;
                oVar.f34989x = new PointF(motionEvent.getX(), motionEvent.getY());
            }
            return true;
        }
    }

    public static class b implements c {
    }

    public interface c {
        void a(@NonNull o oVar);

        boolean b(@NonNull o oVar);

        void c(@NonNull o oVar, float f7, float f11);
    }

    static {
        HashSet hashSet = new HashSet();
        f34979H = hashSet;
        hashSet.add(1);
        hashSet.add(15);
    }

    public o(Context context, Yf.a aVar) {
        super(context, aVar);
        this.f34987v = new GestureDetector(context, new a());
    }

    public final boolean A() {
        return this.f34985F;
    }

    public final void B(float f7) {
        this.f34984E = f7;
    }

    public final void C() {
        this.f34984E = this.f34918a.getResources().getDimension(R.dimen.mapbox_defaultScaleSpanSinceStartThreshold);
    }

    @Override // Yf.j, Yf.f, Yf.b
    protected final boolean a(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f34988w) {
            if (actionMasked == 5 || actionMasked == 3) {
                if (t()) {
                    s();
                } else {
                    this.f34988w = false;
                }
            } else if (!t() && actionMasked == 1) {
                this.f34988w = false;
            }
        }
        return this.f34987v.onTouchEvent(motionEvent) | super.a(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    @Override // Yf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean h() {
        float f7;
        boolean t2 = t();
        ArrayList arrayList = this.f34947l;
        boolean z11 = false;
        if (t2 && this.f34988w && arrayList.size() > 1) {
            q();
            return false;
        }
        PointF i11 = this.f34988w ? this.f34989x : i();
        this.f34980A = 0.0f;
        this.f34981B = 0.0f;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f34980A = Math.abs(c().getX(i12) - i11.x) + this.f34980A;
            this.f34981B = Math.abs(c().getY(i12) - i11.y) + this.f34981B;
        }
        float f11 = this.f34980A * 2.0f;
        this.f34980A = f11;
        float f12 = this.f34981B * 2.0f;
        this.f34981B = f12;
        if (this.f34988w) {
            this.f34991z = f12;
        } else {
            this.f34991z = (float) Math.hypot(f11, f12);
        }
        if (this.f34990y == 0.0f) {
            this.f34990y = this.f34991z;
        }
        this.f34983D = Math.abs(this.f34990y - this.f34991z);
        if (!this.f34988w) {
            float f13 = this.f34982C;
            if (f13 > 0.0f) {
                f7 = this.f34991z / f13;
                this.f34986G = f7;
                this.f34985F = f7 >= 1.0f;
                if (!t()) {
                }
                if (b(this.f34988w ? 15 : 1)) {
                }
                this.f34982C = this.f34991z;
                return z11;
            }
            f7 = 1.0f;
            this.f34986G = f7;
            this.f34985F = f7 >= 1.0f;
            if (!t()) {
            }
            if (b(this.f34988w ? 15 : 1)) {
            }
            this.f34982C = this.f34991z;
            return z11;
        }
        boolean z12 = (c().getY() < this.f34989x.y && this.f34991z < this.f34982C) || (c().getY() > this.f34989x.y && this.f34991z > this.f34982C);
        float abs = Math.abs(1.0f - (this.f34991z / this.f34982C)) * 0.5f;
        if (this.f34982C > 0.0f) {
            f7 = z12 ? abs + 1.0f : 1.0f - abs;
            this.f34986G = f7;
            this.f34985F = f7 >= 1.0f;
            if (!t() && this.f34991z > 0.0f) {
                ((c) this.f34925h).a(this);
                z11 = true;
            } else if (b(this.f34988w ? 15 : 1) && this.f34983D >= this.f34984E && (z11 = ((c) this.f34925h).b(this))) {
                p();
            }
            this.f34982C = this.f34991z;
            return z11;
        }
        f7 = 1.0f;
        this.f34986G = f7;
        this.f34985F = f7 >= 1.0f;
        if (!t()) {
        }
        if (b(this.f34988w ? 15 : 1)) {
            p();
        }
        this.f34982C = this.f34991z;
        return z11;
    }

    @Override // Yf.f
    protected final int k() {
        return (!t() || this.f34988w) ? 1 : 2;
    }

    @Override // Yf.f
    protected final boolean l() {
        if (super.l()) {
            return true;
        }
        return !this.f34988w && this.f34947l.size() < 2;
    }

    @Override // Yf.f
    protected final void n() {
        this.f34990y = 0.0f;
        this.f34983D = 0.0f;
        this.f34991z = 0.0f;
        this.f34982C = 0.0f;
        this.f34986G = 1.0f;
    }

    @Override // Yf.j
    protected final void q() {
        super.q();
        ((c) this.f34925h).c(this, this.f34960t, this.f34961u);
        this.f34988w = false;
    }

    @Override // Yf.j
    @NonNull
    protected final HashSet u() {
        return f34979H;
    }

    public final float x() {
        return this.f34991z;
    }

    public final float y() {
        return this.f34982C;
    }

    public final float z() {
        return this.f34986G;
    }
}
