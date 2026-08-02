package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.SetupRequestContext$install$1", f = "HttpRequestLifecycle.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class SetupRequestContext$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.SetupRequestContext$install$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return io.ktor.client.plugins.SetupRequestContext$install$1.getHighSpeedVideoSizes((io.ktor.util.pipeline.PipelineContext) this.receiver, continuation);
        }

        AnonymousClass1(java.lang.Object obj) {
            super(1, obj, io.ktor.util.pipeline.PipelineContext.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.Camera2StreamConfigurationMap;
            java.lang.Object context = pipelineContext.getContext();
            io.ktor.client.plugins.SetupRequestContext$install$1.AnonymousClass1 anonymousClass1 = new io.ktor.client.plugins.SetupRequestContext$install$1.AnonymousClass1(pipelineContext);
            this.getHighSpeedVideoFpsRanges = 1;
            if (function3.invoke(context, anonymousClass1, this) == coroutine_suspended) {
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

    public static final /* synthetic */ java.lang.Object getHighSpeedVideoSizes(io.ktor.util.pipeline.PipelineContext pipelineContext, kotlin.coroutines.Continuation continuation) {
        java.lang.Object proceed = pipelineContext.proceed(continuation);
        return proceed == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? proceed : kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.SetupRequestContext$install$1 setupRequestContext$install$1 = new io.ktor.client.plugins.SetupRequestContext$install$1(this.Camera2StreamConfigurationMap, continuation);
        setupRequestContext$install$1.getHighSpeedVideoSizes = pipelineContext;
        return setupRequestContext$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SetupRequestContext$install$1(kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequestBuilder, ? super kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.SetupRequestContext$install$1> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = function3;
    }
}
