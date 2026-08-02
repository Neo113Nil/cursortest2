package A1;

/* renamed from: A1.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0010b0 implements InterfaceC0027k {

    /* renamed from: f, reason: collision with root package name */
    public static final C0046u f325f;

    /* renamed from: a, reason: collision with root package name */
    public final long f326a;

    /* renamed from: b, reason: collision with root package name */
    public final long f327b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f328c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f329d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f330e;

    static {
        new C0008a0().a();
        f325f = new C0046u(8);
    }

    public AbstractC0010b0(C0008a0 c0008a0) {
        this.f326a = c0008a0.f317a;
        this.f327b = c0008a0.f318b;
        this.f328c = c0008a0.f319c;
        this.f329d = c0008a0.f320d;
        this.f330e = c0008a0.f321e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0010b0)) {
            return false;
        }
        AbstractC0010b0 abstractC0010b0 = (AbstractC0010b0) obj;
        return this.f326a == abstractC0010b0.f326a && this.f327b == abstractC0010b0.f327b && this.f328c == abstractC0010b0.f328c && this.f329d == abstractC0010b0.f329d && this.f330e == abstractC0010b0.f330e;
    }

    public final int hashCode() {
        long j = this.f326a;
        int i7 = ((int) (j ^ (j >>> 32))) * 31;
        long j3 = this.f327b;
        return ((((((i7 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.f328c ? 1 : 0)) * 31) + (this.f329d ? 1 : 0)) * 31) + (this.f330e ? 1 : 0);
    }
}
