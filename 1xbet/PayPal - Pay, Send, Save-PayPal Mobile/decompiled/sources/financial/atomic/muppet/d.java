package financial.atomic.muppet;

/* loaded from: classes17.dex */
public final class d extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6858a;
    public final /* synthetic */ financial.atomic.muppet.e b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6858a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(financial.atomic.muppet.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = eVar;
    }
}
