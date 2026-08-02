package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ma2 extends sq1 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f5017k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma2(int i) {
        super(9);
        this.f5017k = i;
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object mo3366n() {
        switch (this.f5017k) {
            case 0:
                return new na2();
            case 1:
                return new pa2();
            case 2:
                return new gb2();
            default:
                return new ib2();
        }
    }
}
