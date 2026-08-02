package com.gemalto.mfs.mwsdk.utils.async;

/* loaded from: classes3.dex */
public abstract class AbstractAsyncHandler<T> extends android.os.Handler {
    public abstract void onComplete(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> asyncResult);

    public AbstractAsyncHandler() {
    }

    public AbstractAsyncHandler(android.os.Handler.Callback callback) {
        super(callback);
    }

    public AbstractAsyncHandler(android.os.Looper looper) {
        super(looper);
    }

    public AbstractAsyncHandler(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
    }
}
