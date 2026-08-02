package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper", f = "RecentActivitiesSectionUiStateMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {33}, m = "mapToRecentActivitiesUiState", n = {"accountSummaryOverView", "creditProductIdentifier", "activities", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "$i$f$map", "$i$f$mapTo", "$i$a$-map-RecentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$2"}, nl = {45}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes14.dex */
final class RecentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper isOutputSupportedForhNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.isOutputSupportedForhNQ4ISI.mapToRecentActivitiesUiState(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper recentActivitiesSectionUiStateMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1> continuation) {
        super(continuation);
        this.isOutputSupportedForhNQ4ISI = recentActivitiesSectionUiStateMapper;
    }
}
