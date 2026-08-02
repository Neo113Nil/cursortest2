package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage", f = "AppStorage.kt", i = {0, 0}, l = {403}, m = "getFloat", n = {"key", "defaultValue"}, nl = {-1}, s = {"L$0", "F$0"}, v = 2)
/* loaded from: classes5.dex */
final class AppStorage$getFloat$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRangesFor;
    float getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getFloat(null, 0.0f, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStorage$getFloat$2(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloat$2> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = appStorage;
    }
}
