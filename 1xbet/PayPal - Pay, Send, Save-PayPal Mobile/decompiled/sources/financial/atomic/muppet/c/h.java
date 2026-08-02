package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class h extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public io.ktor.client.statement.HttpResponse f6845a;
    public io.ktor.http.Url b;
    public java.util.Iterator c;
    public java.lang.String d;
    public /* synthetic */ java.lang.Object e;
    public final /* synthetic */ financial.atomic.muppet.http.HttpCookies f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(financial.atomic.muppet.http.HttpCookies httpCookies, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f = httpCookies;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.saveCookiesFrom$core_release(null, this);
    }
}
