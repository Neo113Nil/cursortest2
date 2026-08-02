package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl", f = "PersonalizedAdsRepositoryImpl.kt", i = {0}, l = {48}, m = "updatePersonalizedAdsPreference", n = {"enabled"}, nl = {50}, s = {"Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class PersonalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl Camera2StreamConfigurationMap;
    boolean getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.updatePersonalizedAdsPreference(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1(com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl personalizedAdsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = personalizedAdsRepositoryImpl;
    }
}
