package com.pichillilorenzo.flutter_inappwebview_android.types;

/* loaded from: classes2.dex */
public class BaseCallbackResultImpl<T> implements ICallbackResult<T> {
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
    public T decodeResult(Object obj) {
        return null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
    public void defaultBehaviour(T t7) {
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
    public void error(String str, String str2, Object obj) {
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
    public boolean nonNullSuccess(T t7) {
        return true;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
    public void notImplemented() {
        defaultBehaviour(null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
    public boolean nullSuccess() {
        return true;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
    public void success(Object obj) {
        T decodeResult = decodeResult(obj);
        if (decodeResult == null ? nullSuccess() : nonNullSuccess(decodeResult)) {
            defaultBehaviour(decodeResult);
        }
    }
}
