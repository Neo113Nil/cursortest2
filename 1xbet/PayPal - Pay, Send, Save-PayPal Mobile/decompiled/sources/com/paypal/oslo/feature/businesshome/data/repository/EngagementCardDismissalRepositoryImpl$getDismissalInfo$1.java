package com.paypal.oslo.feature.businesshome.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl", f = "EngagementCardDismissalRepositoryImpl.kt", i = {0}, l = {31}, m = "getDismissalInfo", n = {"cardId"}, nl = {32}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class EngagementCardDismissalRepositoryImpl$getDismissalInfo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getDismissalInfo(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngagementCardDismissalRepositoryImpl$getDismissalInfo$1(com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl engagementCardDismissalRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl$getDismissalInfo$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = engagementCardDismissalRepositoryImpl;
    }
}
