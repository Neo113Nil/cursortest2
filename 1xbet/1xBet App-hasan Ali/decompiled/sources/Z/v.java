package Z;

/* loaded from: classes.dex */
public abstract class v implements u {

    /* renamed from: k, reason: collision with root package name */
    public final X.a f6241k = new X.a(0);

    public final boolean b(int i) {
        return (i & this.f6241k.get()) != 0;
    }

    @Override // Z.u
    public /* synthetic */ w f(w wVar, w wVar2, w wVar3) {
        return null;
    }

    public final void g(int i) {
        X.a aVar;
        int i5;
        do {
            aVar = this.f6241k;
            i5 = aVar.get();
            if ((i5 & i) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i5, i5 | i));
    }
}
