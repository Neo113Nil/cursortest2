package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bd0 implements r60, InterfaceC0254gm {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0948ze f834j;

    @Override // p000.InterfaceC0254gm
    public void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        C0948ze c0948ze = this.f834j;
        if (AbstractC0024an.m278a(c0948ze.m5884r(), 1)) {
            n80.m3497f("Already impressed campaign " + c0948ze.m5887u().m185p() + " ? : " + bool);
            return;
        }
        if (AbstractC0024an.m278a(c0948ze.m5884r(), 2)) {
            n80.m3497f("Already impressed experiment " + c0948ze.m5882p().m5627p() + " ? : " + bool);
        }
    }

    @Override // p000.r60
    public Object apply(Object obj) {
        return this.f834j;
    }
}
