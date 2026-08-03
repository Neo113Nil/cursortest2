package com.moloco.sdk.internal.publisher;

/* renamed from: com.moloco.sdk.internal.publisher.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3421e {
    public static final com.moloco.sdk.publisher.AdLoad a(kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.time.Duration> timeout, java.lang.String adUnitId, kotlin.jvm.functions.Function1<? super com.moloco.sdk.internal.ortb.model.C3415e, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b> recreateXenossAdLoader, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.internal.services.L webViewChecker, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.jvm.functions.Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "timeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recreateXenossAdLoader, "recreateXenossAdLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewChecker, "webViewChecker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.internal.publisher.C3420d(scope, timeout, adUnitId, recreateXenossAdLoader, com.moloco.sdk.internal.ortb.d.a(), com.moloco.sdk.internal.publisher.r.a(), adFormatType, webViewChecker, metricsRecorder, function0);
    }
}
