package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class m extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6850a;
    public int b;

    public m(kotlin.coroutines.Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.f6850a = obj;
        this.b |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = financial.atomic.muppet.http.RequestKt.getHighSpeedVideoFpsRangesFor(null, null, this);
        return highSpeedVideoFpsRangesFor;
    }
}
