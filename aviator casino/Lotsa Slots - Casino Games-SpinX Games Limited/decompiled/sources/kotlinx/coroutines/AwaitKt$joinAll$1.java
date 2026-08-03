package kotlinx.coroutines;

/* compiled from: Await.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {47}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class AwaitKt$joinAll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int I$1;
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    AwaitKt$joinAll$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.AwaitKt$joinAll$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return kotlinx.coroutines.AwaitKt.joinAll((kotlinx.coroutines.Job[]) null, this);
    }
}
