package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$run$2", f = "GraphQLWsProtocol.kt", i = {0}, l = {103}, m = "invokeSuspend", n = {"map"}, s = {"L$0"})
/* loaded from: classes.dex */
final class GraphQLWsProtocol$run$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.network.ws.GraphQLWsProtocol getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0057 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0055 -> B:5:0x0058). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.getHighSpeedVideoSizes
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r5.getHighSpeedVideoFpsRanges
            java.util.Map r1 = (java.util.Map) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L58
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "type"
            java.lang.String r1 = "ping"
            kotlin.Pair r6 = kotlin.TuplesKt.to(r6, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[r2]
            r3 = 0
            r1[r3] = r6
            java.util.Map r6 = kotlin.collections.MapsKt.mutableMapOf(r1)
            com.apollographql.apollo.network.ws.GraphQLWsProtocol r1 = r5.getHighResolutionOutputSizeshNQ4ISI
            java.util.Map r1 = com.apollographql.apollo.network.ws.GraphQLWsProtocol.access$getPingPayload$p(r1)
            if (r1 == 0) goto L43
            com.apollographql.apollo.network.ws.GraphQLWsProtocol r1 = r5.getHighResolutionOutputSizeshNQ4ISI
            java.util.Map r1 = com.apollographql.apollo.network.ws.GraphQLWsProtocol.access$getPingPayload$p(r1)
            java.lang.String r3 = "payload"
            r6.put(r3, r1)
        L43:
            r1 = r6
        L44:
            com.apollographql.apollo.network.ws.GraphQLWsProtocol r6 = r5.getHighResolutionOutputSizeshNQ4ISI
            long r3 = com.apollographql.apollo.network.ws.GraphQLWsProtocol.access$getPingIntervalMillis$p(r6)
            r6 = r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r5.getHighSpeedVideoFpsRanges = r1
            r5.getHighSpeedVideoSizes = r2
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r6)
            if (r6 != r0) goto L58
            return r0
        L58:
            com.apollographql.apollo.network.ws.GraphQLWsProtocol r6 = r5.getHighResolutionOutputSizeshNQ4ISI
            com.apollographql.apollo.network.ws.WsFrameType r3 = com.apollographql.apollo.network.ws.GraphQLWsProtocol.access$getFrameType$p(r6)
            r6.sendMessageMap(r1, r3)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.GraphQLWsProtocol$run$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.network.ws.GraphQLWsProtocol$run$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.apollographql.apollo.network.ws.GraphQLWsProtocol$run$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLWsProtocol$run$2(com.apollographql.apollo.network.ws.GraphQLWsProtocol graphQLWsProtocol, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.GraphQLWsProtocol$run$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = graphQLWsProtocol;
    }
}
