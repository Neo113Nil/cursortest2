package io.ktor.client.plugins.api;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.api.TransformResponseBodyHook$install$1", f = "KtorCallContexts.kt", i = {0, 0}, l = {113, 120}, m = "invokeSuspend", n = {"$this$intercept", "typeInfo"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class TransformResponseBodyHook$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall>, io.ktor.client.statement.HttpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function5<io.ktor.client.plugins.api.TransformResponseBodyContext, io.ktor.client.statement.HttpResponse, io.ktor.utils.io.ByteReadChannel, io.ktor.util.reflect.TypeInfo, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        if (r3.proceedWith(new io.ktor.client.statement.HttpResponseContainer(r1, r12), r11) == r0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.pipeline.PipelineContext pipelineContext;
        io.ktor.util.reflect.TypeInfo typeInfo;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.Camera2StreamConfigurationMap;
            io.ktor.client.statement.HttpResponseContainer httpResponseContainer = (io.ktor.client.statement.HttpResponseContainer) pipelineContext2.getSubject();
            io.ktor.util.reflect.TypeInfo expectedType = httpResponseContainer.getExpectedType();
            java.lang.Object response = httpResponseContainer.getResponse();
            if (!(response instanceof io.ktor.utils.io.ByteReadChannel)) {
                return kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.functions.Function5<io.ktor.client.plugins.api.TransformResponseBodyContext, io.ktor.client.statement.HttpResponse, io.ktor.utils.io.ByteReadChannel, io.ktor.util.reflect.TypeInfo, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> function5 = this.getHighResolutionOutputSizeshNQ4ISI;
            io.ktor.client.plugins.api.TransformResponseBodyContext transformResponseBodyContext = new io.ktor.client.plugins.api.TransformResponseBodyContext();
            io.ktor.client.statement.HttpResponse response2 = ((io.ktor.client.call.HttpClientCall) pipelineContext2.getContext()).getResponse();
            this.Camera2StreamConfigurationMap = pipelineContext2;
            this.getHighSpeedVideoSizes = expectedType;
            this.getHighSpeedVideoFpsRangesFor = 1;
            java.lang.Object invoke = function5.invoke(transformResponseBodyContext, response2, response, expectedType, this);
            if (invoke != coroutine_suspended) {
                pipelineContext = pipelineContext2;
                obj = invoke;
                typeInfo = expectedType;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        typeInfo = (io.ktor.util.reflect.TypeInfo) this.getHighSpeedVideoSizes;
        pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        if (obj == null) {
            return kotlin.Unit.INSTANCE;
        }
        if (!(obj instanceof io.ktor.http.content.NullBody) && !typeInfo.getType().isInstance(obj)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("transformResponseBody returned ");
            sb.append(obj);
            sb.append(" but expected value of type ");
            sb.append(typeInfo);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall> pipelineContext, io.ktor.client.statement.HttpResponseContainer httpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.api.TransformResponseBodyHook$install$1 transformResponseBodyHook$install$1 = new io.ktor.client.plugins.api.TransformResponseBodyHook$install$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        transformResponseBodyHook$install$1.Camera2StreamConfigurationMap = pipelineContext;
        return transformResponseBodyHook$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransformResponseBodyHook$install$1(kotlin.jvm.functions.Function5<? super io.ktor.client.plugins.api.TransformResponseBodyContext, ? super io.ktor.client.statement.HttpResponse, ? super io.ktor.utils.io.ByteReadChannel, ? super io.ktor.util.reflect.TypeInfo, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function5, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.api.TransformResponseBodyHook$install$1> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function5;
    }
}
