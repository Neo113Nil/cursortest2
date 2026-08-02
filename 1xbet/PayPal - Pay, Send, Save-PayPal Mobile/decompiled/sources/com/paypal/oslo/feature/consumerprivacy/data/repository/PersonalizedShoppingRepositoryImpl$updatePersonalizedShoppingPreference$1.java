package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl", f = "PersonalizedShoppingRepositoryImpl.kt", i = {0}, l = {47}, m = "updatePersonalizedShoppingPreference", n = {"enabled"}, nl = {68}, s = {"Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class PersonalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.updatePersonalizedShoppingPreference(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1(com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl personalizedShoppingRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = personalizedShoppingRepositoryImpl;
    }
}
