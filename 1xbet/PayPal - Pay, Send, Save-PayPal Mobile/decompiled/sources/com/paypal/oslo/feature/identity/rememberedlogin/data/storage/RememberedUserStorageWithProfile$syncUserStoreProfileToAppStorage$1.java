package com.paypal.oslo.feature.identity.rememberedlogin.data.storage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile", f = "RememberedUserStorageWithProfile.kt", i = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {72, 90}, m = "syncUserStoreProfileToAppStorage", n = {"this_$iv", "user", "displayName", "publicCredential", "userId", "avatarUrl", "primaryPhone", "userData", "$i$f$fold", "$i$a$-fold-RememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$3", "hasValidCredential"}, nl = {375, 91}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes5.dex */
final class RememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.syncUserStoreProfileToAppStorage(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1(com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = rememberedUserStorageWithProfile;
    }
}
