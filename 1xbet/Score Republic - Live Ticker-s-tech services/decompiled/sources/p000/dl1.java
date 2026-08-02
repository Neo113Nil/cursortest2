package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dl1 implements InterfaceC0870xa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ l90 f1680a;

    public dl1(l90 l90Var) {
        this.f1680a = l90Var;
    }

    @Override // p000.InterfaceC0870xa
    /* JADX INFO: renamed from: a */
    public final void mo1232a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        l90 l90Var = this.f1680a;
        l90Var.f4734m.sendMessage(l90Var.f4734m.obtainMessage(1, boolValueOf));
    }
}
