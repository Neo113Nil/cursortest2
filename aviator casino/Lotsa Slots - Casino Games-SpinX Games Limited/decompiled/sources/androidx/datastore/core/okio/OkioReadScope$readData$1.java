package androidx.datastore.core.okio;

/* compiled from: OkioStorage.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", i = {0, 0, 1}, l = {180, 187}, m = "readData$suspendImpl", n = {"$this", "$this$use$iv$iv", "$this$use$iv$iv"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes2.dex */
final class OkioReadScope$readData$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.datastore.core.okio.OkioReadScope<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkioReadScope$readData$1(androidx.datastore.core.okio.OkioReadScope<T> okioReadScope, kotlin.coroutines.Continuation<? super androidx.datastore.core.okio.OkioReadScope$readData$1> continuation) {
        super(continuation);
        this.this$0 = okioReadScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return androidx.datastore.core.okio.OkioReadScope.readData$suspendImpl(this.this$0, this);
    }
}
