package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public financial.atomic.muppet.http.HttpCookies f6844a;
    public java.util.Iterator b;
    public int c;
    public final /* synthetic */ financial.atomic.muppet.http.HttpCookies d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(financial.atomic.muppet.http.HttpCookies httpCookies, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.d = httpCookies;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.c.g(this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.c.g(this.d, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        financial.atomic.muppet.http.HttpCookies httpCookies;
        java.util.Iterator it;
        io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            list = this.d.getHighSpeedVideoSizes;
            httpCookies = this.d;
            it = list.iterator();
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.b;
            httpCookies = this.f6844a;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) it.next();
            cookiesStorage = httpCookies.getHighSpeedVideoFpsRangesFor;
            this.f6844a = httpCookies;
            this.b = it;
            this.c = 1;
            if (function2.invoke(cookiesStorage, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
