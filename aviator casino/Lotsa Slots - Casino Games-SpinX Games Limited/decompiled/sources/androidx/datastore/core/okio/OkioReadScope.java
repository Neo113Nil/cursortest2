package androidx.datastore.core.okio;

/* compiled from: OkioStorage.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0004J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", "T", "Landroidx/datastore/core/ReadScope;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "getFileSystem", "()Lokio/FileSystem;", "getPath", "()Lokio/Path;", "getSerializer", "()Landroidx/datastore/core/okio/OkioSerializer;", "checkClose", "", "close", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OkioReadScope<T> implements androidx.datastore.core.ReadScope<T> {
    private final androidx.datastore.core.okio.AtomicBoolean closed;
    private final okio.FileSystem fileSystem;
    private final okio.Path path;
    private final androidx.datastore.core.okio.OkioSerializer<T> serializer;

    @Override // androidx.datastore.core.ReadScope
    public java.lang.Object readData(kotlin.coroutines.Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }

    public OkioReadScope(okio.FileSystem fileSystem, okio.Path path, androidx.datastore.core.okio.OkioSerializer<T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.closed = new androidx.datastore.core.okio.AtomicBoolean(false);
    }

    protected final okio.FileSystem getFileSystem() {
        return this.fileSystem;
    }

    protected final okio.Path getPath() {
        return this.path;
    }

    protected final androidx.datastore.core.okio.OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(5:11|12|13|(2:20|21)|(2:16|17)(1:19))(2:33|34))(3:35|36|37))(6:57|58|59|60|61|(1:63)(1:64))|(2:44|45)|39|(2:41|42)(1:43)))|84|6|7|(0)(0)|(0)|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0090, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[Catch: FileNotFoundException -> 0x0090, TryCatch #1 {FileNotFoundException -> 0x0090, blocks: (B:41:0x0097, B:43:0x009b, B:56:0x008c, B:53:0x0087), top: B:7:0x0024, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b A[Catch: FileNotFoundException -> 0x0090, TRY_LEAVE, TryCatch #1 {FileNotFoundException -> 0x0090, blocks: (B:41:0x0097, B:43:0x009b, B:56:0x008c, B:53:0x0087), top: B:7:0x0024, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.datastore.core.okio.OkioReadScope] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <T> java.lang.Object readData$suspendImpl(androidx.datastore.core.okio.OkioReadScope<T> okioReadScope, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.datastore.core.okio.OkioReadScope$readData$1 okioReadScope$readData$1;
        ?? r2;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        java.lang.Object readFrom;
        java.io.Closeable closeable2;
        java.lang.Throwable th2;
        java.lang.Throwable th3;
        if (continuation instanceof androidx.datastore.core.okio.OkioReadScope$readData$1) {
            okioReadScope$readData$1 = (androidx.datastore.core.okio.OkioReadScope$readData$1) continuation;
            if ((okioReadScope$readData$1.label & Integer.MIN_VALUE) != 0) {
                okioReadScope$readData$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = okioReadScope$readData$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = okioReadScope$readData$1.label;
                java.lang.Throwable th4 = null;
                if (r2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    okioReadScope.checkClose();
                    try {
                        okio.BufferedSource buffer = okio.Okio.buffer(((androidx.datastore.core.okio.OkioReadScope) okioReadScope).fileSystem.source(((androidx.datastore.core.okio.OkioReadScope) okioReadScope).path));
                        try {
                            androidx.datastore.core.okio.OkioSerializer<T> okioSerializer = ((androidx.datastore.core.okio.OkioReadScope) okioReadScope).serializer;
                            okioReadScope$readData$1.L$0 = okioReadScope;
                            okioReadScope$readData$1.L$1 = buffer;
                            okioReadScope$readData$1.label = 1;
                            java.lang.Object readFrom2 = okioSerializer.readFrom(buffer, okioReadScope$readData$1);
                            if (readFrom2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            closeable2 = buffer;
                            obj = readFrom2;
                        } catch (java.lang.Throwable th5) {
                            r2 = okioReadScope;
                            closeable2 = buffer;
                            th2 = th5;
                            if (closeable2 != null) {
                                try {
                                    closeable2.close();
                                } catch (java.lang.Throwable th6) {
                                    kotlin.ExceptionsKt.addSuppressed(th2, th6);
                                }
                            }
                            th3 = th2;
                            obj = null;
                            if (th3 == null) {
                            }
                        }
                    } catch (java.io.FileNotFoundException unused) {
                        if (!((androidx.datastore.core.okio.OkioReadScope) okioReadScope).fileSystem.exists(((androidx.datastore.core.okio.OkioReadScope) okioReadScope).path)) {
                            return ((androidx.datastore.core.okio.OkioReadScope) okioReadScope).serializer.getDefaultValue();
                        }
                        okio.BufferedSource buffer2 = okio.Okio.buffer(((androidx.datastore.core.okio.OkioReadScope) okioReadScope).fileSystem.source(((androidx.datastore.core.okio.OkioReadScope) okioReadScope).path));
                        try {
                            androidx.datastore.core.okio.OkioSerializer<T> okioSerializer2 = ((androidx.datastore.core.okio.OkioReadScope) okioReadScope).serializer;
                            okioReadScope$readData$1.L$0 = buffer2;
                            okioReadScope$readData$1.L$1 = null;
                            okioReadScope$readData$1.label = 2;
                            readFrom = okioSerializer2.readFrom(buffer2, okioReadScope$readData$1);
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            closeable = buffer2;
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (java.lang.Throwable th8) {
                                    kotlin.ExceptionsKt.addSuppressed(th, th8);
                                }
                            }
                            th4 = th;
                            obj = null;
                            if (th4 == null) {
                            }
                        }
                        if (readFrom == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = readFrom;
                        closeable = buffer2;
                        if (closeable != null) {
                        }
                        if (th4 == null) {
                        }
                    }
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (java.io.Closeable) okioReadScope$readData$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (java.lang.Throwable th9) {
                                    th4 = th9;
                                }
                            }
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                            if (closeable != null) {
                            }
                            th4 = th;
                            obj = null;
                            if (th4 == null) {
                            }
                        }
                        if (th4 == null) {
                            throw th4;
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                        return obj;
                    }
                    closeable2 = (java.io.Closeable) okioReadScope$readData$1.L$1;
                    r2 = (androidx.datastore.core.okio.OkioReadScope) okioReadScope$readData$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th11) {
                        th2 = th11;
                        if (closeable2 != null) {
                        }
                        th3 = th2;
                        obj = null;
                        if (th3 == null) {
                        }
                    }
                }
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (java.lang.Throwable th12) {
                        th3 = th12;
                    }
                }
                th3 = null;
                if (th3 == null) {
                    throw th3;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                return obj;
            }
        }
        okioReadScope$readData$1 = new androidx.datastore.core.okio.OkioReadScope$readData$1(okioReadScope, continuation);
        java.lang.Object obj2 = okioReadScope$readData$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = okioReadScope$readData$1.label;
        java.lang.Throwable th42 = null;
        if (r2 != 0) {
        }
        if (closeable2 != null) {
        }
        th3 = null;
        if (th3 == null) {
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    protected final void checkClose() {
        if (!(!this.closed.get())) {
            throw new java.lang.IllegalStateException("This scope has already been closed.".toString());
        }
    }
}
