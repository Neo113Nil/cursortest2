package com.zettle.sdk;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.ReaderSettingsImpl", f = "ReaderSettings.kt", i = {}, l = {108}, m = "forget", n = {}, s = {})
/* loaded from: classes16.dex */
final class ReaderSettingsImpl$forget$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.zettle.sdk.ReaderSettingsImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.forget(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReaderSettingsImpl$forget$1(com.zettle.sdk.ReaderSettingsImpl readerSettingsImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.ReaderSettingsImpl$forget$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = readerSettingsImpl;
    }
}
