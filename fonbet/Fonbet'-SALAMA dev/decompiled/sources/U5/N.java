package U5;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class N {

    /* renamed from: b, reason: collision with root package name */
    public static final C0434a f6433b = new C0434a("internal:health-checking-config");

    /* renamed from: c, reason: collision with root package name */
    public static final C0443j f6434c = new C0443j(5);

    /* renamed from: d, reason: collision with root package name */
    public static final C0434a f6435d = new C0434a("internal:has-health-check-producer-listener");

    /* renamed from: e, reason: collision with root package name */
    public static final C0434a f6436e = new C0434a("io.grpc.IS_PETIOLE_POLICY");

    /* renamed from: a, reason: collision with root package name */
    public int f6437a;

    public l0 a(K k7) {
        List list = k7.f6430a;
        if (!list.isEmpty() || b()) {
            int i7 = this.f6437a;
            this.f6437a = i7 + 1;
            if (i7 == 0) {
                d(k7);
            }
            this.f6437a = 0;
            return l0.f6536e;
        }
        l0 g3 = l0.f6544n.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + k7.f6431b);
        c(g3);
        return g3;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(l0 l0Var);

    public void d(K k7) {
        int i7 = this.f6437a;
        this.f6437a = i7 + 1;
        if (i7 == 0) {
            a(k7);
        }
        this.f6437a = 0;
    }

    public abstract void f();

    public void e() {
    }
}
