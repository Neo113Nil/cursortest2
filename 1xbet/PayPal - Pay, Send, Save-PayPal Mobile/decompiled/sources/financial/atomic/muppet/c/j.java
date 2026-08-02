package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class j extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6847a;
    public int b;

    public j(kotlin.coroutines.Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6847a = obj;
        this.b |= Integer.MIN_VALUE;
        return financial.atomic.muppet.http.HttpCookiesKt.cookies((io.ktor.client.HttpClient) null, (io.ktor.http.Url) null, this);
    }
}
