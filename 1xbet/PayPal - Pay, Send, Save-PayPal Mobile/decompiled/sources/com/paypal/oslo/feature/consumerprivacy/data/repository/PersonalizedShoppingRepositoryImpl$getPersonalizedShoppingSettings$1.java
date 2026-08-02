package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl", f = "PersonalizedShoppingRepositoryImpl.kt", i = {}, l = {28}, m = "getPersonalizedShoppingSettings", n = {}, nl = {68}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PersonalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getPersonalizedShoppingSettings(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1(com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl personalizedShoppingRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = personalizedShoppingRepositoryImpl;
    }
}
