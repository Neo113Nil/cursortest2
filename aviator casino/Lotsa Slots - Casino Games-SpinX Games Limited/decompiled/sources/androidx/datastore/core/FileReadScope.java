package androidx.datastore.core;

/* compiled from: FileStorage.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0004J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0011\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/FileReadScope;", "T", "Landroidx/datastore/core/ReadScope;", "file", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getFile", "()Ljava/io/File;", "getSerializer", "()Landroidx/datastore/core/Serializer;", "checkNotClosed", "", "close", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class FileReadScope<T> implements androidx.datastore.core.ReadScope<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final java.io.File file;
    private final androidx.datastore.core.Serializer<T> serializer;

    @Override // androidx.datastore.core.ReadScope
    public java.lang.Object readData(kotlin.coroutines.Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }

    public FileReadScope(java.io.File file, androidx.datastore.core.Serializer<T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    protected final java.io.File getFile() {
        return this.file;
    }

    protected final androidx.datastore.core.Serializer<T> getSerializer() {
        return this.serializer;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(6:40|41|42|44|45|(1:47)(1:48))|30|31))|67|6|7|(0)(0)|30|31|(3:(0)|(1:21)|(1:36))) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0077, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.datastore.core.FileReadScope] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <T> java.lang.Object readData$suspendImpl(androidx.datastore.core.FileReadScope<T> fileReadScope, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.datastore.core.FileReadScope$readData$1 fileReadScope$readData$1;
        ?? r2;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        java.lang.Throwable th2;
        java.io.Closeable closeable2;
        if (continuation instanceof androidx.datastore.core.FileReadScope$readData$1) {
            fileReadScope$readData$1 = (androidx.datastore.core.FileReadScope$readData$1) continuation;
            if ((fileReadScope$readData$1.label & Integer.MIN_VALUE) != 0) {
                fileReadScope$readData$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = fileReadScope$readData$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = fileReadScope$readData$1.label;
                if (r2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    fileReadScope.checkNotClosed();
                    try {
                        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(((androidx.datastore.core.FileReadScope) fileReadScope).file);
                        try {
                            fileReadScope$readData$1.L$0 = fileReadScope;
                            fileReadScope$readData$1.L$1 = fileInputStream;
                            fileReadScope$readData$1.label = 1;
                            java.lang.Object readFrom = ((androidx.datastore.core.FileReadScope) fileReadScope).serializer.readFrom(fileInputStream, fileReadScope$readData$1);
                            if (readFrom == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            closeable2 = fileInputStream;
                            obj = readFrom;
                        } catch (java.lang.Throwable th3) {
                            r2 = fileReadScope;
                            closeable2 = fileInputStream;
                            th2 = th3;
                            throw th2;
                        }
                    } catch (java.io.FileNotFoundException unused) {
                        if (!((androidx.datastore.core.FileReadScope) fileReadScope).file.exists()) {
                            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(((androidx.datastore.core.FileReadScope) fileReadScope).file);
                            try {
                                fileReadScope$readData$1.L$0 = fileInputStream2;
                                fileReadScope$readData$1.L$1 = null;
                                fileReadScope$readData$1.label = 2;
                                java.lang.Object readFrom2 = ((androidx.datastore.core.FileReadScope) fileReadScope).serializer.readFrom(fileInputStream2, fileReadScope$readData$1);
                                if (readFrom2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj = readFrom2;
                                closeable = fileInputStream2;
                                kotlin.io.CloseableKt.closeFinally(closeable, null);
                                return obj;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                closeable = fileInputStream2;
                                throw th2;
                            }
                        }
                        return ((androidx.datastore.core.FileReadScope) fileReadScope).serializer.getDefaultValue();
                    }
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (java.io.Closeable) fileReadScope$readData$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.io.CloseableKt.closeFinally(closeable, null);
                            return obj;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            try {
                                throw th2;
                            } finally {
                            }
                        }
                    }
                    closeable2 = (java.io.Closeable) fileReadScope$readData$1.L$1;
                    r2 = (androidx.datastore.core.FileReadScope) fileReadScope$readData$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th6) {
                        th2 = th6;
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                kotlin.io.CloseableKt.closeFinally(closeable2, null);
                return obj;
            }
        }
        fileReadScope$readData$1 = new androidx.datastore.core.FileReadScope$readData$1(fileReadScope, continuation);
        java.lang.Object obj2 = fileReadScope$readData$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = fileReadScope$readData$1.label;
        if (r2 != 0) {
        }
        kotlin.io.CloseableKt.closeFinally(closeable2, null);
        return obj2;
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    protected final void checkNotClosed() {
        if (!(!this.closed.get())) {
            throw new java.lang.IllegalStateException("This scope has already been closed.".toString());
        }
    }
}
