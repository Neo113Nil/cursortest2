package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: x2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0862x2 implements ThreadFactory {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ ThreadFactoryC0862x2 f8751k = new ThreadFactoryC0862x2(3);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8752j;

    public /* synthetic */ ThreadFactoryC0862x2(int i) {
        this.f8752j = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f8752j) {
            case 0:
                return new Thread(new RunnableC0825w2(runnable, 0), "glide-active-resources");
            case 1:
                return new u80(runnable);
            case 2:
                return new l11(runnable);
            default:
                Object obj = x22.f8759j;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
