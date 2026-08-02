package com.zettle.sdk;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.ReaderSettingsImpl", f = "ReaderSettings.kt", i = {}, l = {111}, m = "pairedReaders", n = {}, s = {})
/* loaded from: classes16.dex */
final class ReaderSettingsImpl$pairedReaders$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.ReaderSettingsImpl getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.pairedReaders(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReaderSettingsImpl$pairedReaders$1(com.zettle.sdk.ReaderSettingsImpl readerSettingsImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.ReaderSettingsImpl$pairedReaders$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = readerSettingsImpl;
    }
}
