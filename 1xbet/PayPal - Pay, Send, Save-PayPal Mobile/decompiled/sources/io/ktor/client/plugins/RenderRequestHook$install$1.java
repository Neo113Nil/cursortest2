package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.RenderRequestHook$install$1", f = "HttpPlainText.kt", i = {0}, l = {155, 156}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class RenderRequestHook$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, java.lang.Object, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, java.lang.Object> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r1.proceedWith(r7, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r7 != r0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.pipeline.PipelineContext pipelineContext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoSizes;
            java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, java.lang.Object, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRanges;
            java.lang.Object context = pipelineContext.getContext();
            this.getHighSpeedVideoSizes = pipelineContext;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = function3.invoke(context, obj2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        io.ktor.http.content.OutgoingContent outgoingContent = (io.ktor.http.content.OutgoingContent) obj;
        if (outgoingContent != null) {
            this.getHighSpeedVideoSizes = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.RenderRequestHook$install$1 renderRequestHook$install$1 = new io.ktor.client.plugins.RenderRequestHook$install$1(this.getHighSpeedVideoFpsRanges, continuation);
        renderRequestHook$install$1.getHighSpeedVideoSizes = pipelineContext;
        renderRequestHook$install$1.Camera2StreamConfigurationMap = obj;
        return renderRequestHook$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RenderRequestHook$install$1(kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequestBuilder, java.lang.Object, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.RenderRequestHook$install$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = function3;
    }
}
