package com.gemalto.mfs.mwsdk.mobilegateway.utils;

/* loaded from: classes8.dex */
public abstract class MGAbstractAsyncHandler<T> extends android.os.Handler {
    public abstract void onComplete(com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAsyncResult<T> mGAsyncResult);

    public MGAbstractAsyncHandler() {
    }

    public MGAbstractAsyncHandler(android.os.Handler.Callback callback) {
        super(callback);
    }

    public MGAbstractAsyncHandler(android.os.Looper looper) {
        super(looper);
    }

    public MGAbstractAsyncHandler(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
    }
}
