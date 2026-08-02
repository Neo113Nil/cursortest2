package com.zettle.sdk.commons.thread;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/zettle/sdk/commons/thread/ChainedUncaughtExceptionHandler;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/commons/thread/ChainedUncaughtExceptionHandler;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MonitoredThreadsKt {
    private static final com.zettle.sdk.commons.thread.ChainedUncaughtExceptionHandler getHighSpeedVideoSizes = new com.zettle.sdk.commons.thread.ChainedUncaughtExceptionHandler(new kotlin.jvm.functions.Function0<java.lang.Thread.UncaughtExceptionHandler>() { // from class: com.zettle.sdk.commons.thread.MonitoredThreadsKt$chainedHandler$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final java.lang.Thread.UncaughtExceptionHandler invoke() {
            java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultUncaughtExceptionHandler, "");
            return defaultUncaughtExceptionHandler;
        }
    });
}
