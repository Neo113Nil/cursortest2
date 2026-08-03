package androidx.work.impl.utils;

/* loaded from: classes2.dex */
public class StartWorkRunnable implements java.lang.Runnable {
    private androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;
    private androidx.work.impl.WorkManagerImpl mWorkManagerImpl;
    private androidx.work.impl.StartStopToken mWorkSpecId;

    public StartWorkRunnable(androidx.work.impl.WorkManagerImpl workManagerImpl, androidx.work.impl.StartStopToken workSpecId, androidx.work.WorkerParameters.RuntimeExtras runtimeExtras) {
        this.mWorkManagerImpl = workManagerImpl;
        this.mWorkSpecId = workSpecId;
        this.mRuntimeExtras = runtimeExtras;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.mWorkManagerImpl.getProcessor().startWork(this.mWorkSpecId, this.mRuntimeExtras);
    }
}
