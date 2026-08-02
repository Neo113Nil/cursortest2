package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class b1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.Page f6754a;
    public final /* synthetic */ financial.atomic.muppet.http.Request b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(financial.atomic.muppet.Page page, financial.atomic.muppet.http.Request request, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6754a = page;
        this.b = request;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.b1(this.f6754a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.b1(this.f6754a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        android.webkit.WebView access$get_wv = financial.atomic.muppet.Page.access$get_wv(this.f6754a);
        java.lang.String https = financial.atomic.muppet.http.RequestKt.toHttps(this.b.getUrl());
        java.util.Map<java.lang.String, java.lang.String> headers = this.b.getHeaders();
        if (headers == null) {
            headers = kotlin.collections.MapsKt.emptyMap();
        }
        access$get_wv.loadUrl(https, headers);
        return kotlin.Unit.INSTANCE;
    }
}
