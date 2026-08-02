package com.bbflight.background_downloader;

import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1117w;

/* loaded from: classes3.dex */
public final class Y<T> implements MethodChannel.Result {
    public final C1117w a;

    public Y(C1117w completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        this.a = completer;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void error(String errorCode, String str, Object obj) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.a.M(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void notImplemented() {
        this.a.M(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void success(Object obj) {
        if (obj == null) {
            obj = null;
        }
        this.a.M(obj);
    }
}
