package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.AfterRender$install$1", f = "SSE.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class AfterRender$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, io.ktor.http.content.OutgoingContent, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, java.lang.Object> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r1.proceedWith(r7, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r7 != r0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.pipeline.PipelineContext pipelineContext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (!(obj2 instanceof io.ktor.http.content.OutgoingContent)) {
                return kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, io.ktor.http.content.OutgoingContent, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, java.lang.Object> function3 = this.Camera2StreamConfigurationMap;
            java.lang.Object context = pipelineContext.getContext();
            this.getHighSpeedVideoFpsRangesFor = pipelineContext;
            this.getHighSpeedVideoSizes = 1;
            obj = function3.invoke(context, obj2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = 2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.sse.AfterRender$install$1 afterRender$install$1 = new io.ktor.client.plugins.sse.AfterRender$install$1(this.Camera2StreamConfigurationMap, continuation);
        afterRender$install$1.getHighSpeedVideoFpsRangesFor = pipelineContext;
        afterRender$install$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return afterRender$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AfterRender$install$1(kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequestBuilder, ? super io.ktor.http.content.OutgoingContent, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.AfterRender$install$1> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = function3;
    }
}
