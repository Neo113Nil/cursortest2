package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lio/ktor/sse/ServerSentEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1", f = "DefaultClientSSESession.kt", i = {0, 1, 2}, l = {48, 53, 57}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class DefaultClientSSESession$_incoming$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super io.ktor.sse.ServerSentEvent>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.plugins.sse.DefaultClientSSESession Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0076 -> B:9:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0086 -> B:9:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0094 -> B:9:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ac -> B:7:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00af -> B:7:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.getHighResolutionOutputSizeshNQ4ISI
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r7.getHighSpeedVideoSizes
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L39
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            java.lang.Object r1 = r7.getHighSpeedVideoSizes
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L45
        L29:
            java.lang.Object r1 = r7.getHighSpeedVideoSizes
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L64
        L31:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.getHighSpeedVideoSizes
            r1 = r8
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
        L39:
            io.ktor.client.plugins.sse.DefaultClientSSESession r8 = r7.Camera2StreamConfigurationMap
            kotlin.coroutines.CoroutineContext r8 = r8.getCoroutineContext()
            boolean r8 = kotlinx.coroutines.JobKt.isActive(r8)
            if (r8 == 0) goto Lb5
        L45:
            io.ktor.client.plugins.sse.DefaultClientSSESession r8 = r7.Camera2StreamConfigurationMap
            kotlin.coroutines.CoroutineContext r8 = r8.getCoroutineContext()
            boolean r8 = kotlinx.coroutines.JobKt.isActive(r8)
            if (r8 == 0) goto L97
            io.ktor.client.plugins.sse.DefaultClientSSESession r8 = r7.Camera2StreamConfigurationMap
            io.ktor.utils.io.ByteReadChannel r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getInput$p(r8)
            r6 = r7
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r7.getHighSpeedVideoSizes = r1
            r7.getHighResolutionOutputSizeshNQ4ISI = r4
            java.lang.Object r8 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$tryParseEvent(r8, r5, r6)
            if (r8 == r0) goto Lae
        L64:
            io.ktor.sse.ServerSentEvent r8 = (io.ktor.sse.ServerSentEvent) r8
            if (r8 == 0) goto L97
            io.ktor.client.plugins.sse.DefaultClientSSESession r5 = r7.Camera2StreamConfigurationMap
            boolean r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$isCommentsEvent(r5, r8)
            if (r5 == 0) goto L78
            io.ktor.client.plugins.sse.DefaultClientSSESession r5 = r7.Camera2StreamConfigurationMap
            boolean r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getShowCommentEvents$p(r5)
            if (r5 == 0) goto L45
        L78:
            io.ktor.client.plugins.sse.DefaultClientSSESession r5 = r7.Camera2StreamConfigurationMap
            boolean r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$isRetryEvent(r5, r8)
            if (r5 == 0) goto L89
            io.ktor.client.plugins.sse.DefaultClientSSESession r5 = r7.Camera2StreamConfigurationMap
            boolean r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getShowRetryEvents$p(r5)
            if (r5 != 0) goto L89
            goto L45
        L89:
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r7.getHighSpeedVideoSizes = r1
            r7.getHighResolutionOutputSizeshNQ4ISI = r3
            java.lang.Object r8 = r1.emit(r8, r5)
            if (r8 != r0) goto L45
            goto Lae
        L97:
            io.ktor.client.plugins.sse.DefaultClientSSESession r8 = r7.Camera2StreamConfigurationMap
            boolean r8 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getNeedToReconnect$p(r8)
            if (r8 == 0) goto Laf
            io.ktor.client.plugins.sse.DefaultClientSSESession r8 = r7.Camera2StreamConfigurationMap
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r7.getHighSpeedVideoSizes = r1
            r7.getHighResolutionOutputSizeshNQ4ISI = r2
            java.lang.Object r8 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$doReconnection(r8, r5)
            if (r8 != r0) goto L39
        Lae:
            return r0
        Laf:
            io.ktor.client.plugins.sse.DefaultClientSSESession r8 = r7.Camera2StreamConfigurationMap
            io.ktor.client.plugins.sse.DefaultClientSSESession.access$close(r8)
            goto L39
        Lb5:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super io.ktor.sse.ServerSentEvent> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1 defaultClientSSESession$_incoming$1 = new io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1(this.Camera2StreamConfigurationMap, continuation);
        defaultClientSSESession$_incoming$1.getHighSpeedVideoSizes = obj;
        return defaultClientSSESession$_incoming$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultClientSSESession$_incoming$1(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = defaultClientSSESession;
    }
}
