package com.paypal.oslo.feature.identity.rememberedlogin.data.storage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile", f = "RememberedUserStorageWithProfile.kt", i = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6}, l = {306, 307, 308, 309, 310, 311, 316}, m = "getRememberedUserFromStorage", n = {"displayName", "displayName", "publicCredential", "displayName", "publicCredential", "userId", "displayName", "publicCredential", "userId", "avatarUrl", "displayName", "publicCredential", "userId", "avatarUrl", "primaryPhone", "displayName", "publicCredential", "userId", "avatarUrl", "primaryPhone", "loginType"}, nl = {307, 308, 309, 310, 311, 312, 317}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes5.dex */
final class RememberedUserStorageWithProfile$getRememberedUserFromStorage$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberedUserStorageWithProfile$getRememberedUserFromStorage$1(com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUserFromStorage$1> continuation) {
        super(continuation);
        this.getInputFormats = rememberedUserStorageWithProfile;
    }
}
