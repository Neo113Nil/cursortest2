package com.paypal.oslo.feature.activity.data.repository.ledger.source;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl", f = "ActivityWidgetUserFilteredActivitiesPagingSourceImpl.kt", i = {0, 0, 0}, l = {74}, m = "load", n = {"params", "cursor", "paginatedQuery"}, nl = {75}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityWidgetUserFilteredActivitiesPagingSourceImpl$load$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getOutputFormats.load(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityWidgetUserFilteredActivitiesPagingSourceImpl$load$1(com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl activityWidgetUserFilteredActivitiesPagingSourceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl$load$1> continuation) {
        super(continuation);
        this.getOutputFormats = activityWidgetUserFilteredActivitiesPagingSourceImpl;
    }
}
