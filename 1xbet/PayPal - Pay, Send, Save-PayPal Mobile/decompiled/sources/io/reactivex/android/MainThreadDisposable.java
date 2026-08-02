package io.reactivex.android;

/* loaded from: classes17.dex */
public abstract class MainThreadDisposable implements io.reactivex.disposables.Disposable {
    private final java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean();

    protected abstract void onDispose();

    public static void verifyMainThread() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected to be called on the main thread but was ");
        sb.append(java.lang.Thread.currentThread().getName());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.Camera2StreamConfigurationMap.get();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.Camera2StreamConfigurationMap.compareAndSet(false, true)) {
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                onDispose();
            } else {
                io.reactivex.android.schedulers.AndroidSchedulers.mainThread().scheduleDirect(new java.lang.Runnable() { // from class: io.reactivex.android.MainThreadDisposable.1
                    @Override // java.lang.Runnable
                    public void run() {
                        io.reactivex.android.MainThreadDisposable.this.onDispose();
                    }
                });
            }
        }
    }
}
