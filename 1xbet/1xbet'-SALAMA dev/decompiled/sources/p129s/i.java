package p129s;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f16094y;

    public i(j jVar) {
        this.f16094y = jVar;
    }

    @Override // p129s.g
    public final String l() {
        h hVar = (h) this.f16094y.f16095a.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f16090a + "]";
    }
}
