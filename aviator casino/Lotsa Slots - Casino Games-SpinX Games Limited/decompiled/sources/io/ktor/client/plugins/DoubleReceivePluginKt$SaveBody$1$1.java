package io.ktor.client.plugins;

/* compiled from: SaveBody.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", com.ironsource.Ve.n}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1", f = "SaveBody.kt", i = {0, 0, 0}, l = {45, 52}, m = "invokeSuspend", n = {"$this$intercept", com.ironsource.Ve.n, "attributes"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class DoubleReceivePluginKt$SaveBody$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit>, io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    DoubleReceivePluginKt$SaveBody$1$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit> pipelineContext, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1 doubleReceivePluginKt$SaveBody$1$1 = new io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1(continuation);
        doubleReceivePluginKt$SaveBody$1$1.L$0 = pipelineContext;
        doubleReceivePluginKt$SaveBody$1$1.L$1 = httpResponse;
        return doubleReceivePluginKt$SaveBody$1$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|2|(1:(1:(3:6|7|8)(2:10|11))(2:12|13))(2:27|(4:29|(1:31)|32|33)(4:34|(1:36)|37|(1:39)(1:40)))|14|16|17|18|(1:20)|21|(1:23)|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(r2));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [io.ktor.client.statement.HttpResponse] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.client.statement.HttpResponse] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.AttributeKey<?> attributeKey;
        org.slf4j.Logger logger;
        io.ktor.util.pipeline.PipelineContext pipelineContext;
        io.ktor.util.Attributes attributes;
        org.slf4j.Logger logger2;
        io.ktor.util.AttributeKey attributeKey2;
        org.slf4j.Logger logger3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = this.label;
        try {
            if (r2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.util.pipeline.PipelineContext pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.L$0;
                io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) this.L$1;
                io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                io.ktor.util.Attributes attributes2 = call.getAttributes();
                attributeKey = io.ktor.client.plugins.DoubleReceivePluginKt.SKIP_SAVE_BODY;
                if (attributes2.contains(attributeKey)) {
                    logger2 = io.ktor.client.plugins.DoubleReceivePluginKt.getLOGGER();
                    if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
                        logger2.trace("Skipping body saving for " + call.getRequest().getUrl());
                    }
                    return kotlin.Unit.INSTANCE;
                }
                logger = io.ktor.client.plugins.DoubleReceivePluginKt.getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                    logger.trace("Saving body for " + call.getRequest().getUrl());
                }
                this.L$0 = pipelineContext2;
                this.L$1 = httpResponse;
                this.L$2 = attributes2;
                this.label = 1;
                java.lang.Object save = io.ktor.client.call.SavedCallKt.save(call, this);
                if (save == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pipelineContext = pipelineContext2;
                obj = save;
                attributes = attributes2;
                r2 = httpResponse;
            } else {
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                attributes = (io.ktor.util.Attributes) this.L$2;
                io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) this.L$1;
                pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                r2 = httpResponse2;
            }
            io.ktor.client.statement.HttpResponse response = ((io.ktor.client.call.HttpClientCall) obj).getResponse();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            io.ktor.utils.io.ByteReadChannelKt.cancel(r2.getRawContent());
            java.lang.Object m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
            java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
            if (m10801exceptionOrNullimpl != null) {
                logger3 = io.ktor.client.plugins.DoubleReceivePluginKt.getLOGGER();
                logger3.debug("Failed to cancel response body", m10801exceptionOrNullimpl);
            }
            attributeKey2 = io.ktor.client.plugins.DoubleReceivePluginKt.RESPONSE_BODY_SAVED;
            attributes.put(attributeKey2, kotlin.Unit.INSTANCE);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (pipelineContext.proceedWith(response, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        } finally {
        }
    }
}
