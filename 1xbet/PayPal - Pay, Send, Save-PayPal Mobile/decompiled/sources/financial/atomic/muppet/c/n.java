package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class n extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public io.ktor.utils.io.ByteWriteChannel f6851a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ financial.atomic.muppet.c.p c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(financial.atomic.muppet.c.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.writeTo(null, this);
    }
}
