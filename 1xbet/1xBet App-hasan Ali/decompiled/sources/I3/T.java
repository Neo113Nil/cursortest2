package I3;

/* loaded from: classes.dex */
public final class T implements F3.z {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Class f2608k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f2609l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F3.y f2610m;

    public T(Class cls, Class cls2, F3.y yVar) {
        this.f2608k = cls;
        this.f2609l = cls2;
        this.f2610m = yVar;
    }

    @Override // F3.z
    public final F3.y a(F3.m mVar, M3.a aVar) {
        Class cls = this.f2608k;
        Class cls2 = aVar.f3616a;
        if (cls2 == cls || cls2 == this.f2609l) {
            return this.f2610m;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f2609l.getName() + "+" + this.f2608k.getName() + ",adapter=" + this.f2610m + "]";
    }
}
