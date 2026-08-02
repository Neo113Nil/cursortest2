package financial.atomic.transact;

/* loaded from: classes17.dex */
public final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public financial.atomic.transact.Emitter.Event f6894a;
    public java.util.Iterator b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ financial.atomic.transact.Emitter d;
    public int e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(financial.atomic.transact.Emitter emitter, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.d = emitter;
    }
}
