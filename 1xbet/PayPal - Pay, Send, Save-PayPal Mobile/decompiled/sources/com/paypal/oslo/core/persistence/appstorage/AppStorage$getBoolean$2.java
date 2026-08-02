package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage", f = "AppStorage.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE}, m = "getBoolean", n = {"key", "defaultValue"}, nl = {-1}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class AppStorage$getBoolean$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStorage$getBoolean$2(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.appstorage.AppStorage$getBoolean$2> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = appStorage;
    }
}
