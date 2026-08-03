package androidx.datastore.core;

/* compiled from: FileStorage.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", i = {0}, l = {169, 178}, m = "readData$suspendImpl", n = {"$this"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class FileReadScope$readData$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.datastore.core.FileReadScope<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileReadScope$readData$1(androidx.datastore.core.FileReadScope<T> fileReadScope, kotlin.coroutines.Continuation<? super androidx.datastore.core.FileReadScope$readData$1> continuation) {
        super(continuation);
        this.this$0 = fileReadScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return androidx.datastore.core.FileReadScope.readData$suspendImpl(this.this$0, this);
    }
}
