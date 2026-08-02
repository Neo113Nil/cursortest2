package com.paypal.oslo.feature.businesshome.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl", f = "EngagementCardDismissalRepositoryImpl.kt", i = {}, l = {36}, m = "getAllDismissals", n = {}, nl = {42}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class EngagementCardDismissalRepositoryImpl$getAllDismissals$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getAllDismissals(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngagementCardDismissalRepositoryImpl$getAllDismissals$1(com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl engagementCardDismissalRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl$getAllDismissals$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = engagementCardDismissalRepositoryImpl;
    }
}
