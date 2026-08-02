package p000;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: oe */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0541oe implements Callable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5705j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5706k;

    public /* synthetic */ CallableC0541oe(int i, Object obj) {
        this.f5705j = i;
        this.f5706k = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f5705j;
        Object obj = this.f5706k;
        switch (i) {
            case 0:
                return ((C0652re) obj).f6829d;
            default:
                ((qc1) obj).m4061b(null);
                return null;
        }
    }
}
