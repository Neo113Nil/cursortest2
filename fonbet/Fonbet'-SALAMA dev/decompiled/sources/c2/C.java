package c2;

/* loaded from: classes.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10162b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10163c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10164d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10165e;

    public C(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean a() {
        return this.f10162b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c3 = (C) obj;
        return this.f10161a.equals(c3.f10161a) && this.f10162b == c3.f10162b && this.f10163c == c3.f10163c && this.f10164d == c3.f10164d && this.f10165e == c3.f10165e;
    }

    public final int hashCode() {
        return ((((((((this.f10161a.hashCode() + 527) * 31) + this.f10162b) * 31) + this.f10163c) * 31) + ((int) this.f10164d)) * 31) + this.f10165e;
    }

    public C(C c3) {
        this.f10161a = c3.f10161a;
        this.f10162b = c3.f10162b;
        this.f10163c = c3.f10163c;
        this.f10164d = c3.f10164d;
        this.f10165e = c3.f10165e;
    }

    public C(Object obj, int i7, int i8, long j, int i9) {
        this.f10161a = obj;
        this.f10162b = i7;
        this.f10163c = i8;
        this.f10164d = j;
        this.f10165e = i9;
    }
}
