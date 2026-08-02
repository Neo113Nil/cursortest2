package P5;

import B5.g;
import android.graphics.PointF;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final g f21848a;

    /* renamed from: b, reason: collision with root package name */
    public final T f21849b;

    /* renamed from: c, reason: collision with root package name */
    public T f21850c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f21851d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f21852e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f21853f;

    /* renamed from: g, reason: collision with root package name */
    public final float f21854g;

    /* renamed from: h, reason: collision with root package name */
    public Float f21855h;

    /* renamed from: i, reason: collision with root package name */
    private float f21856i;

    /* renamed from: j, reason: collision with root package name */
    private float f21857j;

    /* renamed from: k, reason: collision with root package name */
    private int f21858k;

    /* renamed from: l, reason: collision with root package name */
    private int f21859l;

    /* renamed from: m, reason: collision with root package name */
    private float f21860m;

    /* renamed from: n, reason: collision with root package name */
    private float f21861n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f21862o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f21863p;

    public a(g gVar, T t2, T t11, Interpolator interpolator, float f7, Float f11) {
        this.f21856i = -3987645.8f;
        this.f21857j = -3987645.8f;
        this.f21858k = 784923401;
        this.f21859l = 784923401;
        this.f21860m = Float.MIN_VALUE;
        this.f21861n = Float.MIN_VALUE;
        this.f21862o = null;
        this.f21863p = null;
        this.f21848a = gVar;
        this.f21849b = t2;
        this.f21850c = t11;
        this.f21851d = interpolator;
        this.f21852e = null;
        this.f21853f = null;
        this.f21854g = f7;
        this.f21855h = f11;
    }

    public static a a(J5.d dVar, J5.d dVar2) {
        return new a(dVar, dVar2);
    }

    public final float b() {
        g gVar = this.f21848a;
        if (gVar == null) {
            return 1.0f;
        }
        if (this.f21861n == Float.MIN_VALUE) {
            if (this.f21855h == null) {
                this.f21861n = 1.0f;
            } else {
                this.f21861n = ((this.f21855h.floatValue() - this.f21854g) / gVar.e()) + e();
            }
        }
        return this.f21861n;
    }

    public final float c() {
        if (this.f21857j == -3987645.8f) {
            this.f21857j = ((Float) this.f21850c).floatValue();
        }
        return this.f21857j;
    }

    public final int d() {
        if (this.f21859l == 784923401) {
            this.f21859l = ((Integer) this.f21850c).intValue();
        }
        return this.f21859l;
    }

    public final float e() {
        g gVar = this.f21848a;
        if (gVar == null) {
            return 0.0f;
        }
        if (this.f21860m == Float.MIN_VALUE) {
            this.f21860m = (this.f21854g - gVar.o()) / gVar.e();
        }
        return this.f21860m;
    }

    public final float f() {
        if (this.f21856i == -3987645.8f) {
            this.f21856i = ((Float) this.f21849b).floatValue();
        }
        return this.f21856i;
    }

    public final int g() {
        if (this.f21858k == 784923401) {
            this.f21858k = ((Integer) this.f21849b).intValue();
        }
        return this.f21858k;
    }

    public final boolean h() {
        return this.f21851d == null && this.f21852e == null && this.f21853f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f21849b + ", endValue=" + this.f21850c + ", startFrame=" + this.f21854g + ", endFrame=" + this.f21855h + ", interpolator=" + this.f21851d + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(g gVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f7) {
        this.f21856i = -3987645.8f;
        this.f21857j = -3987645.8f;
        this.f21858k = 784923401;
        this.f21859l = 784923401;
        this.f21860m = Float.MIN_VALUE;
        this.f21861n = Float.MIN_VALUE;
        this.f21862o = null;
        this.f21863p = null;
        this.f21848a = gVar;
        this.f21849b = obj;
        this.f21850c = obj2;
        this.f21851d = null;
        this.f21852e = interpolator;
        this.f21853f = interpolator2;
        this.f21854g = f7;
        this.f21855h = null;
    }

    protected a(g gVar, T t2, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f7, Float f11) {
        this.f21856i = -3987645.8f;
        this.f21857j = -3987645.8f;
        this.f21858k = 784923401;
        this.f21859l = 784923401;
        this.f21860m = Float.MIN_VALUE;
        this.f21861n = Float.MIN_VALUE;
        this.f21862o = null;
        this.f21863p = null;
        this.f21848a = gVar;
        this.f21849b = t2;
        this.f21850c = t11;
        this.f21851d = interpolator;
        this.f21852e = interpolator2;
        this.f21853f = interpolator3;
        this.f21854g = f7;
        this.f21855h = f11;
    }

    public a(T t2) {
        this.f21856i = -3987645.8f;
        this.f21857j = -3987645.8f;
        this.f21858k = 784923401;
        this.f21859l = 784923401;
        this.f21860m = Float.MIN_VALUE;
        this.f21861n = Float.MIN_VALUE;
        this.f21862o = null;
        this.f21863p = null;
        this.f21848a = null;
        this.f21849b = t2;
        this.f21850c = t2;
        this.f21851d = null;
        this.f21852e = null;
        this.f21853f = null;
        this.f21854g = Float.MIN_VALUE;
        this.f21855h = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(J5.d dVar, J5.d dVar2) {
        this.f21856i = -3987645.8f;
        this.f21857j = -3987645.8f;
        this.f21858k = 784923401;
        this.f21859l = 784923401;
        this.f21860m = Float.MIN_VALUE;
        this.f21861n = Float.MIN_VALUE;
        this.f21862o = null;
        this.f21863p = null;
        this.f21848a = null;
        this.f21849b = dVar;
        this.f21850c = dVar2;
        this.f21851d = null;
        this.f21852e = null;
        this.f21853f = null;
        this.f21854g = Float.MIN_VALUE;
        this.f21855h = Float.valueOf(Float.MAX_VALUE);
    }
}
