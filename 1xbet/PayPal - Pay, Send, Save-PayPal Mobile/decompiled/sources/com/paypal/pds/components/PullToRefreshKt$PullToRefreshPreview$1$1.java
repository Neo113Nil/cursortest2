package com.paypal.pds.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class PullToRefreshKt$PullToRefreshPreview$1$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    final /* synthetic */ kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        com.paypal.pds.components.PullToRefreshKt.access$PullToRefreshPreview$refresh(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullToRefreshKt$PullToRefreshPreview$1$1(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> mutableState2) {
        super(0, kotlin.jvm.internal.Intrinsics.Kotlin.class, com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "PullToRefreshPreview$refresh(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;", 8);
        this.Camera2StreamConfigurationMap = coroutineScope;
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighSpeedVideoSizes = mutableState2;
    }
}
