package U;

/* loaded from: classes.dex */
public class c extends X3.f {

    /* renamed from: m, reason: collision with root package name */
    public static final c f5810m = new c(n.f5834e, 0);

    /* renamed from: k, reason: collision with root package name */
    public final n f5811k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5812l;

    public c(n nVar, int i) {
        this.f5811k = nVar;
        this.f5812l = i;
    }

    public final c a(Object obj, V.a aVar) {
        C2.h u5 = this.f5811k.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return u5 == null ? this : new c((n) u5.f834m, this.f5812l + u5.f833l);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f5811k.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f5811k.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
