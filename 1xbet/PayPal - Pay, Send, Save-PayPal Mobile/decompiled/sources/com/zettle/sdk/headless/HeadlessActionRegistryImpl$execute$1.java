package com.zettle.sdk.headless;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.headless.HeadlessActionRegistryImpl", f = "HeadlessActionRegistry.kt", i = {0, 0}, l = {65, 75}, m = "execute", n = {"this", "action"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class HeadlessActionRegistryImpl$execute$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.zettle.sdk.headless.HeadlessActionRegistryImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.execute(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeadlessActionRegistryImpl$execute$1(com.zettle.sdk.headless.HeadlessActionRegistryImpl headlessActionRegistryImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.headless.HeadlessActionRegistryImpl$execute$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = headlessActionRegistryImpl;
    }
}
