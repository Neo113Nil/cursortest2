package com.paypal.oslo.feature.identity.rememberedlogin.data.storage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile", f = "RememberedUserStorageWithProfile.kt", i = {0, 0}, l = {257}, m = "savePublicCredentialOnly", n = {"publicCredential", "userData"}, nl = {258}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class RememberedUserStorageWithProfile$savePublicCredentialOnly$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.savePublicCredentialOnly(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberedUserStorageWithProfile$savePublicCredentialOnly$1(com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$savePublicCredentialOnly$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = rememberedUserStorageWithProfile;
    }
}
