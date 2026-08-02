package com.apollographql.apollo.network.websocket.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$1", f = "SubscribableWebSocket.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class SubscribableWebSocket$onMessage$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket getHighSpeedVideoFpsRanges;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002d -> B:5:0x0030). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.getHighResolutionOutputSizeshNQ4ISI
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L30
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
        L1a:
            com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket r6 = r5.getHighSpeedVideoFpsRanges
            kotlin.time.Duration r6 = com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket.access$getPingInterval$p(r6)
            long r3 = r6.getGetHighResolutionOutputSizeshNQ4ISI()
            r6 = r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r5.getHighResolutionOutputSizeshNQ4ISI = r2
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.m24057delayVtjQ1oo(r3, r6)
            if (r6 != r0) goto L30
            return r0
        L30:
            com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket r6 = r5.getHighSpeedVideoFpsRanges
            com.apollographql.apollo.network.websocket.WsProtocol r6 = com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket.access$getWsProtocol$p(r6)
            com.apollographql.apollo.network.websocket.ClientMessage r6 = r6.ping()
            if (r6 == 0) goto L1a
            com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket r1 = r5.getHighSpeedVideoFpsRanges
            com.apollographql.apollo.network.websocket.WebSocket r1 = com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket.access$getWebSocket$p(r1)
            com.apollographql.apollo.network.websocket.internal.SubscribableWebSocketKt.access$send(r1, r6)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribableWebSocket$onMessage$1$1(com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket subscribableWebSocket, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = subscribableWebSocket;
    }
}
