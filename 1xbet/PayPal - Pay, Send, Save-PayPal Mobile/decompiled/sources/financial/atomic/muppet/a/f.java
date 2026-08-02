package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class f extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6764a;
    public int b;
    public final /* synthetic */ financial.atomic.muppet.a.g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(financial.atomic.muppet.a.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6764a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
