package p000;

/* JADX INFO: renamed from: qj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0620qj implements InterfaceC0808vm {

    /* JADX INFO: renamed from: k */
    public static final C0620qj f6506k = new C0620qj(0);

    /* JADX INFO: renamed from: l */
    public static final C0620qj f6507l = new C0620qj(1);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6508j;

    public /* synthetic */ C0620qj(int i) {
        this.f6508j = i;
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: d */
    public final InterfaceC0180en mo475d() {
        switch (this.f6508j) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return C0301hw.f3348j;
        }
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: f */
    public final void mo476f(Object obj) {
        switch (this.f6508j) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.f6508j) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m4100a(Object obj) {
    }
}
