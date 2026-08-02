package s;

/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f16088y;

    public i(j jVar) {
        this.f16088y = jVar;
    }

    @Override // s.g
    public final String l() {
        h hVar = (h) this.f16088y.f16089a.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f16084a + "]";
    }
}
