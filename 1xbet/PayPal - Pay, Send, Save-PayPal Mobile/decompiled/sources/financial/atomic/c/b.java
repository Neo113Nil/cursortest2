package financial.atomic.c;

/* loaded from: classes17.dex */
public final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public financial.atomic.transact.Transact f6740a;
    public java.lang.String b;
    public /* synthetic */ java.lang.Object c;
    public int d;

    public b(kotlin.coroutines.Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return financial.atomic.c.c.storageGet(null, null, this);
    }
}
