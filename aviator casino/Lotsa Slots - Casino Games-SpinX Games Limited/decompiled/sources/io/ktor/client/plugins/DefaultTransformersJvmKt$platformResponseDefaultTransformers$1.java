package io.ktor.client.plugins;

/* compiled from: DefaultTransformersJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall>, io.ktor.client.statement.HttpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall> pipelineContext, io.ktor.client.statement.HttpResponseContainer httpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 defaultTransformersJvmKt$platformResponseDefaultTransformers$1 = new io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(continuation);
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.L$0 = pipelineContext;
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.L$1 = httpResponseContainer;
        return defaultTransformersJvmKt$platformResponseDefaultTransformers$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
            io.ktor.client.statement.HttpResponseContainer httpResponseContainer = (io.ktor.client.statement.HttpResponseContainer) this.L$1;
            io.ktor.util.reflect.TypeInfo expectedType = httpResponseContainer.getExpectedType();
            java.lang.Object response = httpResponseContainer.getResponse();
            if (!(response instanceof io.ktor.utils.io.ByteReadChannel)) {
                return kotlin.Unit.INSTANCE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(expectedType.getType(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.io.InputStream.class))) {
                final java.io.InputStream inputStream = io.ktor.utils.io.jvm.javaio.BlockingKt.toInputStream((io.ktor.utils.io.ByteReadChannel) response, (kotlinx.coroutines.Job) ((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE));
                this.L$0 = null;
                this.label = 1;
                if (pipelineContext.proceedWith(new io.ktor.client.statement.HttpResponseContainer(expectedType, new java.io.InputStream() { // from class: io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1$response$1
                    @Override // java.io.InputStream
                    public int read() {
                        return inputStream.read();
                    }

                    @Override // java.io.InputStream
                    public int read(byte[] b, int off, int len) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
                        return inputStream.read(b, off, len);
                    }

                    @Override // java.io.InputStream
                    public int available() {
                        return inputStream.available();
                    }

                    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                        super.close();
                        inputStream.close();
                    }
                }), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
