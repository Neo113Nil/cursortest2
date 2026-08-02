package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage", f = "AppStorage.kt", i = {0, 0, 0, 0, 0}, l = {869}, m = "getFloat", n = {"key", "this_$iv", "key$iv", "prefKey$iv", "$i$f$getValue"}, nl = {870}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class AppStorage$getFloat$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputFormats.getFloat(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStorage$getFloat$1(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.appstorage.AppStorage$getFloat$1> continuation) {
        super(continuation);
        this.getOutputFormats = appStorage;
    }
}
