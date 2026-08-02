package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class n extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6786a;
    public final /* synthetic */ financial.atomic.muppet.Page b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(financial.atomic.muppet.Page page, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6786a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.content(this);
    }
}
