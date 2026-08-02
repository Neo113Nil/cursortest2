package I3;

/* loaded from: classes.dex */
public final class S implements F3.z {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2605k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f2606l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F3.y f2607m;

    public /* synthetic */ S(Class cls, F3.y yVar, int i) {
        this.f2605k = i;
        this.f2606l = cls;
        this.f2607m = yVar;
    }

    @Override // F3.z
    public final F3.y a(F3.m mVar, M3.a aVar) {
        switch (this.f2605k) {
            case 0:
                if (aVar.f3616a == this.f2606l) {
                    return this.f2607m;
                }
                return null;
            default:
                Class cls = this.f2606l;
                Class<?> cls2 = aVar.f3616a;
                if (cls.isAssignableFrom(cls2)) {
                    return new C0173c(this, cls2);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f2605k) {
            case 0:
                return "Factory[type=" + this.f2606l.getName() + ",adapter=" + this.f2607m + "]";
            default:
                return "Factory[typeHierarchy=" + this.f2606l.getName() + ",adapter=" + this.f2607m + "]";
        }
    }
}
