package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall>, io.ktor.client.statement.HttpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoSizes;
            io.ktor.client.statement.HttpResponseContainer httpResponseContainer = (io.ktor.client.statement.HttpResponseContainer) this.getHighSpeedVideoFpsRanges;
            io.ktor.util.reflect.TypeInfo expectedType = httpResponseContainer.getExpectedType();
            java.lang.Object response = httpResponseContainer.getResponse();
            if (!(response instanceof io.ktor.utils.io.ByteReadChannel)) {
                return kotlin.Unit.INSTANCE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(expectedType.getType(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.io.InputStream.class))) {
                final java.io.InputStream inputStream = io.ktor.utils.io.jvm.javaio.BlockingKt.toInputStream((io.ktor.utils.io.ByteReadChannel) response, (kotlinx.coroutines.Job) ((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE));
                this.getHighSpeedVideoSizes = null;
                this.Camera2StreamConfigurationMap = 1;
                if (pipelineContext.proceedWith(new io.ktor.client.statement.HttpResponseContainer(expectedType, new java.io.InputStream() { // from class: io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1$response$1
                    @Override // java.io.InputStream
                    public final int read() {
                        return inputStream.read();
                    }

                    @Override // java.io.InputStream
                    public final int read(byte[] b, int off, int len) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "");
                        return inputStream.read(b, off, len);
                    }

                    @Override // java.io.InputStream
                    public final int available() {
                        return inputStream.available();
                    }

                    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
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

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall> pipelineContext, io.ktor.client.statement.HttpResponseContainer httpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 defaultTransformersJvmKt$platformResponseDefaultTransformers$1 = new io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(continuation);
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.getHighSpeedVideoSizes = pipelineContext;
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.getHighSpeedVideoFpsRanges = httpResponseContainer;
        return defaultTransformersJvmKt$platformResponseDefaultTransformers$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1> continuation) {
        super(3, continuation);
    }
}
