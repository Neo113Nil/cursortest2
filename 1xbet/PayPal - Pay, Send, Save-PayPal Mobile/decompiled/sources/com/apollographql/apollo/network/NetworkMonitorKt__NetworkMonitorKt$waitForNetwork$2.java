package com.apollographql.apollo.network;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2", f = "NetworkMonitor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Boolean) this.getHighSpeedVideoFpsRangesFor, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.apollographql.apollo.network.NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2) create(bool, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.network.NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2 networkMonitorKt__NetworkMonitorKt$waitForNetwork$2 = new com.apollographql.apollo.network.NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2(continuation);
        networkMonitorKt__NetworkMonitorKt$waitForNetwork$2.getHighSpeedVideoFpsRangesFor = obj;
        return networkMonitorKt__NetworkMonitorKt$waitForNetwork$2;
    }

    NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2> continuation) {
        super(2, continuation);
    }
}
