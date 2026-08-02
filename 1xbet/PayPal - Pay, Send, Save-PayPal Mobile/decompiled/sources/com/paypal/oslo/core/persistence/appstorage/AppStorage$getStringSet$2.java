package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage", f = "AppStorage.kt", i = {0, 0}, l = {509}, m = "getStringSet", n = {"key", "defaultValue"}, nl = {-1}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class AppStorage$getStringSet$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getStringSet(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStorage$getStringSet$2(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.appstorage.AppStorage$getStringSet$2> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = appStorage;
    }
}
