package financial.atomic.a;

/* loaded from: classes17.dex */
public final class c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f6730a;
    public java.lang.String b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ financial.atomic.a.e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(financial.atomic.a.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.d = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.get(null, null, this);
    }
}
