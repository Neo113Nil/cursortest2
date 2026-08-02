package com.paypal.pds.core;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.core.FlagProvider", f = "Flag.kt", i = {0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m = "getOrLoadSpriteCache$pds_release", n = {"context", "$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {238}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes16.dex */
final class FlagProvider$getOrLoadSpriteCache$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.pds.core.FlagProvider getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.getOrLoadSpriteCache$pds_release(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlagProvider$getOrLoadSpriteCache$1(com.paypal.pds.core.FlagProvider flagProvider, kotlin.coroutines.Continuation<? super com.paypal.pds.core.FlagProvider$getOrLoadSpriteCache$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = flagProvider;
    }
}
