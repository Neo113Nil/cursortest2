package H6;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements p065i6.d, p077k6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p065i6.d f3455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p065i6.i f3456b;

    public s(p065i6.d dVar, p065i6.i iVar) {
        this.f3455a = dVar;
        this.f3456b = iVar;
    }

    @Override // p077k6.d
    public final p077k6.d getCallerFrame() {
        p065i6.d dVar = this.f3455a;
        if (dVar instanceof p077k6.d) {
            return (p077k6.d) dVar;
        }
        return null;
    }

    @Override // p065i6.d
    public final p065i6.i getContext() {
        return this.f3456b;
    }

    @Override // p065i6.d
    public final void resumeWith(Object obj) {
        this.f3455a.resumeWith(obj);
    }
}
