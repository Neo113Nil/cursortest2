package androidx.datastore.core;

/* compiled from: FileStorage.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", i = {0, 0, 0}, l = {101}, m = "readScope", n = {"this", "$this$use$iv", "lock"}, s = {"L$0", "L$1", "Z$0"})
/* loaded from: classes2.dex */
final class FileStorageConnection$readScope$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.datastore.core.FileStorageConnection<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileStorageConnection$readScope$1(androidx.datastore.core.FileStorageConnection<T> fileStorageConnection, kotlin.coroutines.Continuation<? super androidx.datastore.core.FileStorageConnection$readScope$1> continuation) {
        super(continuation);
        this.this$0 = fileStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readScope(null, this);
    }
}
