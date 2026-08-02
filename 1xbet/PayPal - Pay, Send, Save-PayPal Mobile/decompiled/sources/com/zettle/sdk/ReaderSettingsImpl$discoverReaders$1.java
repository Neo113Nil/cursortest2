package com.zettle.sdk;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.ReaderSettingsImpl", f = "ReaderSettings.kt", i = {}, l = {102}, m = "discoverReaders", n = {}, s = {})
/* loaded from: classes16.dex */
final class ReaderSettingsImpl$discoverReaders$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.zettle.sdk.ReaderSettingsImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.discoverReaders(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReaderSettingsImpl$discoverReaders$1(com.zettle.sdk.ReaderSettingsImpl readerSettingsImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.ReaderSettingsImpl$discoverReaders$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = readerSettingsImpl;
    }
}
