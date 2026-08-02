package financial.atomic.muppet.http;

/* loaded from: classes17.dex */
public final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3 {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;

    /* renamed from: a, reason: collision with root package name */
    public int f6874a;
    public final /* synthetic */ financial.atomic.muppet.http.HttpCookies c;

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        financial.atomic.muppet.http.b bVar = new financial.atomic.muppet.http.b(this.c, (kotlin.coroutines.Continuation) obj3);
        bVar.Camera2StreamConfigurationMap = (io.ktor.util.pipeline.PipelineContext) obj;
        return bVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6874a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.Camera2StreamConfigurationMap;
            financial.atomic.muppet.http.HttpCookies httpCookies = this.c;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext();
            this.f6874a = 1;
            if (httpCookies.sendCookiesWith$core_release(httpRequestBuilder, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(financial.atomic.muppet.http.HttpCookies httpCookies, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.c = httpCookies;
    }
}
