package financial.atomic.muppet;

/* loaded from: classes17.dex */
public final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public financial.atomic.muppet.Emitter.Event f6812a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ financial.atomic.muppet.Emitter c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return financial.atomic.muppet.Emitter.emit$suspendImpl(this.c, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(financial.atomic.muppet.Emitter emitter, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = emitter;
    }
}
