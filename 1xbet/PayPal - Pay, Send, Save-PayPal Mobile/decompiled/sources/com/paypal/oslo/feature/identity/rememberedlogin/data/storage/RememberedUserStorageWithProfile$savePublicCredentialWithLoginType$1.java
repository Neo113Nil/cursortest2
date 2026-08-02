package com.paypal.oslo.feature.identity.rememberedlogin.data.storage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile", f = "RememberedUserStorageWithProfile.kt", i = {0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 236}, m = "savePublicCredentialWithLoginType", n = {"publicCredential", "loginType", "publicCredential", "loginType"}, nl = {236, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class RememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.savePublicCredentialWithLoginType(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1(com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = rememberedUserStorageWithProfile;
    }
}
