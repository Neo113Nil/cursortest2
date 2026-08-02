package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: al */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0022al implements ThreadFactory {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f230j;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f230j);
        thread.setPriority(10);
        return thread;
    }
}
