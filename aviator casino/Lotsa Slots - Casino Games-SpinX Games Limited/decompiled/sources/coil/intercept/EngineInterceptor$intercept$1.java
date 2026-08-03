package coil.intercept;

/* compiled from: EngineInterceptor.kt */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0}, l = {75}, m = "intercept", n = {"this", "chain"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class EngineInterceptor$intercept$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ coil.intercept.EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$intercept$1(coil.intercept.EngineInterceptor engineInterceptor, kotlin.coroutines.Continuation<? super coil.intercept.EngineInterceptor$intercept$1> continuation) {
        super(continuation);
        this.this$0 = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.intercept(null, this);
    }
}
