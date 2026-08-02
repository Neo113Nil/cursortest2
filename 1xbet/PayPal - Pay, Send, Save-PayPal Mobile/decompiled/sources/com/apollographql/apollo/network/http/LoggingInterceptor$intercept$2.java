package com.apollographql.apollo.network.http;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.http.LoggingInterceptor", f = "LoggingInterceptor.kt", i = {1, 1}, l = {119, 147}, m = "intercept", n = {"logHeaders", "logBody"}, s = {"I$0", "I$1"})
/* loaded from: classes7.dex */
final class LoggingInterceptor$intercept$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.apollographql.apollo.network.http.LoggingInterceptor Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.intercept(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoggingInterceptor$intercept$2(com.apollographql.apollo.network.http.LoggingInterceptor loggingInterceptor, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.http.LoggingInterceptor$intercept$2> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = loggingInterceptor;
    }
}
