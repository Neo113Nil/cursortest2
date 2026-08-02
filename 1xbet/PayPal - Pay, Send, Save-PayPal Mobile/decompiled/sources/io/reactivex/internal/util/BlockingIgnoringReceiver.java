package io.reactivex.internal.util;

/* loaded from: classes17.dex */
public final class BlockingIgnoringReceiver extends java.util.concurrent.CountDownLatch implements io.reactivex.functions.Consumer<java.lang.Throwable>, io.reactivex.functions.Action {
    public java.lang.Throwable error;

    public BlockingIgnoringReceiver() {
        super(1);
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(java.lang.Throwable th) {
        this.error = th;
        countDown();
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        countDown();
    }
}
