package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class e extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public io.ktor.http.Url f6842a;
    public java.util.Iterator b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ financial.atomic.muppet.http.HttpCookies d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(financial.atomic.muppet.http.HttpCookies httpCookies, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.d = httpCookies;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.captureHeaderCookies$core_release(null, this);
    }
}
