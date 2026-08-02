package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class q extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public io.ktor.client.HttpClient f6854a;
    public kotlin.jvm.internal.Ref.ObjectRef b;
    public financial.atomic.muppet.http.Request c;
    public kotlin.jvm.internal.Ref.ObjectRef d;
    public boolean e;
    public int f;
    public /* synthetic */ java.lang.Object g;
    public int h;

    public q(kotlin.coroutines.Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.g = obj;
        this.h |= Integer.MIN_VALUE;
        return financial.atomic.muppet.http.RequestKt.request(null, null, null, null, null, false, null, this);
    }
}
