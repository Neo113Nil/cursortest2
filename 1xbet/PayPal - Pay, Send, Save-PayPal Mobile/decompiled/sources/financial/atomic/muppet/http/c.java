package financial.atomic.muppet.http;

/* loaded from: classes17.dex */
public final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3 {

    /* renamed from: a, reason: collision with root package name */
    public int f6875a;
    public /* synthetic */ io.ktor.client.statement.HttpResponse b;
    public final /* synthetic */ financial.atomic.muppet.http.HttpCookies c;

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        financial.atomic.muppet.http.c cVar = new financial.atomic.muppet.http.c(this.c, (kotlin.coroutines.Continuation) obj3);
        cVar.b = (io.ktor.client.statement.HttpResponse) obj2;
        return cVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6875a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.statement.HttpResponse httpResponse = this.b;
            financial.atomic.muppet.http.HttpCookies httpCookies = this.c;
            this.f6875a = 1;
            if (httpCookies.saveCookiesFrom$core_release(httpResponse, this) == coroutine_suspended) {
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
    public c(financial.atomic.muppet.http.HttpCookies httpCookies, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.c = httpCookies;
    }
}
