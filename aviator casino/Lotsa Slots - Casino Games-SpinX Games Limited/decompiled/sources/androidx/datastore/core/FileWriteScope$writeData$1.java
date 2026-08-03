package androidx.datastore.core;

/* compiled from: FileStorage.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", i = {0}, l = {201}, m = "writeData", n = {"stream"}, s = {"L$1"})
/* loaded from: classes2.dex */
final class FileWriteScope$writeData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.datastore.core.FileWriteScope<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileWriteScope$writeData$1(androidx.datastore.core.FileWriteScope<T> fileWriteScope, kotlin.coroutines.Continuation<? super androidx.datastore.core.FileWriteScope$writeData$1> continuation) {
        super(continuation);
        this.this$0 = fileWriteScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeData(null, this);
    }
}
