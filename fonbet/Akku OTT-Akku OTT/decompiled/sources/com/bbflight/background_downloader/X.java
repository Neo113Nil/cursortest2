package com.bbflight.background_downloader;

import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1117w;

/* loaded from: classes3.dex */
public final class X implements MethodChannel.Result {
    public final C1117w a;

    public X(C1117w completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        this.a = completer;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void error(String errorCode, String str, Object obj) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.a.M(Boolean.FALSE);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void notImplemented() {
        this.a.M(Boolean.FALSE);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void success(Object obj) {
        this.a.M(Boolean.valueOf(Intrinsics.areEqual(obj, Boolean.TRUE)));
    }
}
