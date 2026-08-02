package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class k51 implements Callable {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ k51 f4288k = new k51(4);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ k51 f4289l = new k51(5);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4290j;

    public /* synthetic */ k51(int i) {
        this.f4290j = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4290j) {
            case 0:
                return j51.f3823a;
            case 1:
                return l51.f4684a;
            case 2:
                return m51.f4978a;
            case 3:
                return n51.f5300a;
            case 4:
                m42 m42Var = new m42("internal.platform", 4);
                m42Var.f975k.put("getVersion", new m42("getVersion", 3));
                return m42Var;
            default:
                return null;
        }
    }
}
