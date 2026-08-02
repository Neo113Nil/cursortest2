package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$2", f = "SSE.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class SSEKt$SSE$2$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall>, io.ktor.client.statement.HttpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.client.plugins.sse.ClientSSESession clientSSESession;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRanges;
            io.ktor.client.statement.HttpResponseContainer httpResponseContainer = (io.ktor.client.statement.HttpResponseContainer) this.Camera2StreamConfigurationMap;
            io.ktor.util.reflect.TypeInfo expectedType = httpResponseContainer.getExpectedType();
            final java.lang.Object response = httpResponseContainer.getResponse();
            io.ktor.client.statement.HttpResponse response2 = ((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getResponse();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(io.ktor.client.statement.HttpResponseKt.getRequest(response2).getGetHighResolutionOutputSizeshNQ4ISI().getOrNull(io.ktor.client.plugins.sse.BuildersKt.getSseRequestAttr()), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                org.slf4j.Logger logger = io.ktor.client.plugins.sse.SSEKt.getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Skipping non SSE response from ");
                    sb.append(io.ktor.client.statement.HttpResponseKt.getRequest(response2).getGetHighSpeedVideoFpsRanges());
                    logger.trace(sb.toString());
                }
                return kotlin.Unit.INSTANCE;
            }
            io.ktor.client.plugins.sse.SSEKt.checkResponse(response2);
            if (!(response instanceof io.ktor.client.plugins.sse.SSESession)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected ");
                sb2.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.sse.SSESession.class).getSimpleName());
                sb2.append(" content but was ");
                sb2.append(response);
                throw new io.ktor.client.plugins.sse.SSEClientException(response2, null, sb2.toString(), 2, null);
            }
            org.slf4j.Logger logger2 = io.ktor.client.plugins.sse.SSEKt.getLOGGER();
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Receive SSE session from ");
                sb3.append(io.ktor.client.statement.HttpResponseKt.getRequest(response2).getGetHighSpeedVideoFpsRanges());
                sb3.append(": ");
                sb3.append(response);
                logger2.trace(sb3.toString());
            }
            final kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) io.ktor.client.statement.HttpResponseKt.getRequest(response2).getGetHighResolutionOutputSizeshNQ4ISI().getOrNull(io.ktor.client.plugins.sse.BuildersKt.getDeserializerAttr());
            if (function2 != null) {
                clientSSESession = new io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization((io.ktor.client.call.HttpClientCall) pipelineContext.getContext(), new io.ktor.client.plugins.sse.SSESessionWithDeserialization(response, function2) { // from class: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1
                    private final kotlin.coroutines.CoroutineContext coroutineContext;
                    private final kotlin.jvm.functions.Function2<io.ktor.util.reflect.TypeInfo, java.lang.String, java.lang.Object> deserializer;
                    private final kotlinx.coroutines.flow.Flow<io.ktor.sse.TypedServerSentEvent<java.lang.String>> incoming;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        io.ktor.client.plugins.sse.SSESession sSESession = (io.ktor.client.plugins.sse.SSESession) response;
                        final kotlinx.coroutines.flow.Flow<io.ktor.sse.ServerSentEvent> incoming = sSESession.getIncoming();
                        this.incoming = new kotlinx.coroutines.flow.Flow<io.ktor.sse.TypedServerSentEvent<java.lang.String>>() { // from class: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super io.ktor.sse.TypedServerSentEvent<java.lang.String>> flowCollector, kotlin.coroutines.Continuation continuation) {
                                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                            }

                            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                    io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                    int i;
                                    if (continuation instanceof io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                        anonymousClass1 = (io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                        if ((anonymousClass1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.getHighSpeedVideoSizes -= 2147483648;
                                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            i = anonymousClass1.getHighSpeedVideoSizes;
                                            if (i != 0) {
                                                kotlin.ResultKt.throwOnFailure(obj2);
                                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                                io.ktor.sse.ServerSentEvent serverSentEvent = (io.ktor.sse.ServerSentEvent) obj;
                                                io.ktor.sse.TypedServerSentEvent typedServerSentEvent = new io.ktor.sse.TypedServerSentEvent(serverSentEvent.getData(), serverSentEvent.getEvent(), serverSentEvent.getId(), serverSentEvent.getRetry(), serverSentEvent.getComments());
                                                anonymousClass1.getHighSpeedVideoSizes = 1;
                                                if (flowCollector.emit(typedServerSentEvent, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                kotlin.ResultKt.throwOnFailure(obj2);
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    }
                                    anonymousClass1 = new io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getHighSpeedVideoSizes;
                                    if (i != 0) {
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }

                                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2", f = "SSE.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                                /* renamed from: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
                                    int getHighSpeedVideoSizes;

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                        this.getHighSpeedVideoFpsRanges = obj;
                                        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
                                        return io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                                    }

                                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                        super(continuation);
                                    }
                                }

                                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                                    this.getHighSpeedVideoFpsRanges = flowCollector;
                                }
                            }
                        };
                        this.deserializer = function2;
                        this.coroutineContext = sSESession.getCoroutineContext();
                    }

                    @Override // io.ktor.client.plugins.sse.SSESessionWithDeserialization
                    public final kotlinx.coroutines.flow.Flow<io.ktor.sse.TypedServerSentEvent<java.lang.String>> getIncoming() {
                        return this.incoming;
                    }

                    @Override // io.ktor.client.plugins.sse.SSESessionWithDeserialization
                    public final kotlin.jvm.functions.Function2<io.ktor.util.reflect.TypeInfo, java.lang.String, java.lang.Object> getDeserializer() {
                        return this.deserializer;
                    }

                    @Override // kotlinx.coroutines.CoroutineScope
                    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
                        return this.coroutineContext;
                    }
                });
            } else {
                clientSSESession = new io.ktor.client.plugins.sse.ClientSSESession((io.ktor.client.call.HttpClientCall) pipelineContext.getContext(), (io.ktor.client.plugins.sse.SSESession) response);
            }
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (pipelineContext.proceedWith(new io.ktor.client.statement.HttpResponseContainer(expectedType, clientSSESession), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall> pipelineContext, io.ktor.client.statement.HttpResponseContainer httpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.sse.SSEKt$SSE$2$2 sSEKt$SSE$2$2 = new io.ktor.client.plugins.sse.SSEKt$SSE$2$2(continuation);
        sSEKt$SSE$2$2.getHighSpeedVideoFpsRanges = pipelineContext;
        sSEKt$SSE$2$2.Camera2StreamConfigurationMap = httpResponseContainer;
        return sSEKt$SSE$2$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    SSEKt$SSE$2$2(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.SSEKt$SSE$2$2> continuation) {
        super(3, continuation);
    }
}
