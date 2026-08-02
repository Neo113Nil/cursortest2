package financial.atomic.muppet.http;

/* loaded from: classes17.dex */
public final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3 {

    /* renamed from: a, reason: collision with root package name */
    public int f6873a;
    public final /* synthetic */ financial.atomic.muppet.http.HttpCookies c;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        financial.atomic.muppet.http.a aVar = new financial.atomic.muppet.http.a(this.c, (kotlin.coroutines.Continuation) obj3);
        aVar.getHighResolutionOutputSizeshNQ4ISI = (io.ktor.util.pipeline.PipelineContext) obj;
        return aVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6873a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighResolutionOutputSizeshNQ4ISI;
            financial.atomic.muppet.http.HttpCookies httpCookies = this.c;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext();
            this.f6873a = 1;
            if (httpCookies.captureHeaderCookies$core_release(httpRequestBuilder, this) == coroutine_suspended) {
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
    public a(financial.atomic.muppet.http.HttpCookies httpCookies, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.c = httpCookies;
    }
}
