package financial.atomic.muppet.d;

/* loaded from: classes17.dex */
public final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6863a;
    public final /* synthetic */ financial.atomic.muppet.impl.Page b;
    public final /* synthetic */ kotlin.jvm.functions.Function1 c;
    public final /* synthetic */ io.ktor.http.Cookie d;
    public final /* synthetic */ io.ktor.http.Url e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(financial.atomic.muppet.impl.Page page, kotlin.jvm.functions.Function1 function1, io.ktor.http.Cookie cookie, io.ktor.http.Url url, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = page;
        this.c = function1;
        this.d = cookie;
        this.e = url;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.d.f(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((financial.atomic.muppet.d.f) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.http.Cookie copy;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6863a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.muppet.impl.Page page = this.b;
            kotlin.jvm.functions.Function1 function1 = this.c;
            io.ktor.http.Cookie cookie = this.d;
            java.lang.String domain = cookie.getDomain();
            if (domain == null) {
                domain = io.ktor.http.URLUtilsKt.getHostWithPort(this.e);
            }
            java.lang.String str = domain;
            java.lang.String path = this.d.getPath();
            if (path == null) {
                path = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
            }
            copy = cookie.copy((r22 & 1) != 0 ? cookie.name : null, (r22 & 2) != 0 ? cookie.value : null, (r22 & 4) != 0 ? cookie.encoding : null, (r22 & 8) != 0 ? cookie.maxAge : null, (r22 & 16) != 0 ? cookie.expires : null, (r22 & 32) != 0 ? cookie.domain : str, (r22 & 64) != 0 ? cookie.path : path, (r22 & 128) != 0 ? cookie.secure : false, (r22 & 256) != 0 ? cookie.httpOnly : false, (r22 & 512) != 0 ? cookie.extensions : null);
            io.ktor.http.Cookie cookie2 = (io.ktor.http.Cookie) function1.invoke(copy);
            this.f6863a = 1;
            if (page.setCookie(cookie2, this) == coroutine_suspended) {
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
}
