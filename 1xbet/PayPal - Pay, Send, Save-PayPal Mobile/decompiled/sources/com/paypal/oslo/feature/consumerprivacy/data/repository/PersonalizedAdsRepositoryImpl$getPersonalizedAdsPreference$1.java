package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl", f = "PersonalizedAdsRepositoryImpl.kt", i = {}, l = {29}, m = "getPersonalizedAdsPreference", n = {}, nl = {71}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PersonalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getPersonalizedAdsPreference(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1(com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl personalizedAdsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = personalizedAdsRepositoryImpl;
    }
}
