package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iw1 implements Executor {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ iw1 f3684k = new iw1(0);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ iw1 f3685l = new iw1(1);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ iw1 f3686m = new iw1(5);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3687j;

    public /* synthetic */ iw1(int i) {
        this.f3687j = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3687j) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            case 3:
                zg1.m5899j().post(runnable);
                break;
            case 4:
                runnable.run();
                break;
            case 5:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
