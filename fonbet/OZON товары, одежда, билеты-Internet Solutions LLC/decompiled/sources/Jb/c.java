package Jb;

/* loaded from: classes.dex */
public final class c<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    private Pc.a<T> f14332a;

    public static <T> void a(Pc.a<T> aVar, Pc.a<T> aVar2) {
        aVar2.getClass();
        c cVar = (c) aVar;
        if (cVar.f14332a != null) {
            throw new IllegalStateException();
        }
        cVar.f14332a = aVar2;
    }

    @Override // Pc.a
    public final T get() {
        Pc.a<T> aVar = this.f14332a;
        if (aVar != null) {
            return aVar.get();
        }
        throw new IllegalStateException();
    }
}
