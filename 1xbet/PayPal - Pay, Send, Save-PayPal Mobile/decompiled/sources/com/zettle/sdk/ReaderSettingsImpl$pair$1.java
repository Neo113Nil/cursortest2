package com.zettle.sdk;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.ReaderSettingsImpl", f = "ReaderSettings.kt", i = {}, l = {105}, m = "pair", n = {}, s = {})
/* loaded from: classes16.dex */
final class ReaderSettingsImpl$pair$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.zettle.sdk.ReaderSettingsImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.pair(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReaderSettingsImpl$pair$1(com.zettle.sdk.ReaderSettingsImpl readerSettingsImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.ReaderSettingsImpl$pair$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = readerSettingsImpl;
    }
}
