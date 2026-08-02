package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class s extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6856a;
    public final /* synthetic */ financial.atomic.muppet.http.Response b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(financial.atomic.muppet.http.Response response, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = response;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6856a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.bytes(this);
    }
}
