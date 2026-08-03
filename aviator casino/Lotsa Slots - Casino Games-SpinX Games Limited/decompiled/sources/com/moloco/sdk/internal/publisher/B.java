package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class B {
    public static final com.moloco.sdk.internal.publisher.z a(com.moloco.sdk.publisher.AdShowListener adShowListener, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, kotlin.jvm.functions.Function0<com.moloco.sdk.internal.ortb.model.B> provideSdkEvents, kotlin.jvm.functions.Function0<com.moloco.sdk.internal.publisher.C3427k> provideBUrlData, com.moloco.sdk.internal.w sdkEventUrlTracker, com.moloco.sdk.internal.f bUrlTracker, com.moloco.sdk.publisher.AdFormatType adType, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.internal.client_metrics_data.a acmClickDeduper, kotlin.jvm.functions.Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bUrlTracker, "bUrlTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "adType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acmClickDeduper, "acmClickDeduper");
        return new com.moloco.sdk.internal.publisher.A(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, sdkEventUrlTracker, bUrlTracker, adType, metricsRecorder, acmClickDeduper, function0);
    }
}
