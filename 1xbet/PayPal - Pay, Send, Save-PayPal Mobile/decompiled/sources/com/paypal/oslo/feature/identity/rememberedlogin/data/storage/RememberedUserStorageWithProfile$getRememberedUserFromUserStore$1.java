package com.paypal.oslo.feature.identity.rememberedlogin.data.storage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile", f = "RememberedUserStorageWithProfile.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {156}, m = "getRememberedUserFromUserStore", n = {"currentState", "user", "displayName", "publicCredential", "userId", "avatarUrl", "primaryPhone", "loginType", "userData", "hasValidCredential"}, nl = {157}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class RememberedUserStorageWithProfile$getRememberedUserFromUserStore$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputStallDuration.getHighSpeedVideoSizes(this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberedUserStorageWithProfile$getRememberedUserFromUserStore$1(com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUserFromUserStore$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = rememberedUserStorageWithProfile;
    }
}
