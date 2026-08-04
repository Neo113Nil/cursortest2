package com.pichillilorenzo.flutter_inappwebview_android.types;

import A5.r;

/* JADX INFO: loaded from: classes2.dex */
public interface ICallbackResult<T> extends r {
    T decodeResult(Object obj);

    void defaultBehaviour(T t7);

    @Override // A5.r
    /* synthetic */ void error(String str, String str2, Object obj);

    boolean nonNullSuccess(T t7);

    @Override // A5.r
    /* synthetic */ void notImplemented();

    boolean nullSuccess();

    @Override // A5.r
    /* synthetic */ void success(Object obj);
}
