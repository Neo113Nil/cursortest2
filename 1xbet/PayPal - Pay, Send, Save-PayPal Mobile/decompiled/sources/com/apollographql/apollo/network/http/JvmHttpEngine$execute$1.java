package com.apollographql.apollo.network.http;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.http.JvmHttpEngine", f = "DefaultHttpEngine.jvm.kt", i = {}, l = {53}, m = "execute", n = {}, s = {})
/* loaded from: classes3.dex */
final class JvmHttpEngine$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.network.http.JvmHttpEngine getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.execute(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JvmHttpEngine$execute$1(com.apollographql.apollo.network.http.JvmHttpEngine jvmHttpEngine, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.http.JvmHttpEngine$execute$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = jvmHttpEngine;
    }
}
