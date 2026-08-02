package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class f extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public io.ktor.http.Url f6843a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ financial.atomic.muppet.http.HttpCookies c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(financial.atomic.muppet.http.HttpCookies httpCookies, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = httpCookies;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.get(null, this);
    }
}
