package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public class SyncBaseCallbackResultImpl<T> extends BaseCallbackResultImpl<T> {
    public final CountDownLatch latch = new CountDownLatch(1);
    public T result = null;

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
    public void defaultBehaviour(T t7) {
        this.latch.countDown();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
    public void error(String str, String str2, Object obj) {
        this.latch.countDown();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
    public void notImplemented() {
        defaultBehaviour(null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
    public void success(Object obj) {
        T tDecodeResult = decodeResult(obj);
        this.result = tDecodeResult;
        if (tDecodeResult == null ? nullSuccess() : nonNullSuccess(tDecodeResult)) {
            defaultBehaviour(tDecodeResult);
        } else {
            this.latch.countDown();
        }
    }
}
