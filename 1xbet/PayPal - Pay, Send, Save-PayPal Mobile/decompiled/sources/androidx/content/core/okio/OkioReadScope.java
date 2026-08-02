package androidx.content.core.okio;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", "T", "Landroidx/datastore/core/ReadScope;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "<init>", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "checkClose", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "Lokio/Path;", "getPath", "()Lokio/Path;", "Landroidx/datastore/core/okio/OkioSerializer;", "getSerializer", "()Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/okio/AtomicBoolean;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/datastore/core/okio/AtomicBoolean;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class OkioReadScope<T> implements androidx.content.core.ReadScope<T> {
    private final okio.FileSystem fileSystem;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.content.core.okio.AtomicBoolean getHighSpeedVideoFpsRanges;
    private final okio.Path path;
    private final androidx.content.core.okio.OkioSerializer<T> serializer;

    public OkioReadScope(okio.FileSystem fileSystem, okio.Path path, androidx.content.core.okio.OkioSerializer<T> okioSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okioSerializer, "");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = okioSerializer;
        this.getHighSpeedVideoFpsRanges = new androidx.content.core.okio.AtomicBoolean(false);
    }

    protected final okio.FileSystem getFileSystem() {
        return this.fileSystem;
    }

    protected final okio.Path getPath() {
        return this.path;
    }

    protected final androidx.content.core.okio.OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(2:29|30)|15|(1:28)(1:17))(2:45|46))(3:47|48|49))(7:70|71|72|73|74|(1:76)|77)|(2:57|58)|51|(2:53|54)(1:55)))|97|6|7|(0)(0)|(0)|51|(0)(0)|(1:(1:43))) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0099, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ea A[Catch: Exception -> 0x00eb, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00eb, blocks: (B:17:0x00ea, B:88:0x00a4), top: B:87:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098 A[Catch: FileNotFoundException -> 0x0099, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0099, blocks: (B:55:0x0098, B:69:0x008f, B:66:0x008a), top: B:7:0x0024, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.datastore.core.okio.OkioReadScope] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <T> java.lang.Object getHighSpeedVideoSizes(androidx.content.core.okio.OkioReadScope<T> okioReadScope, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.content.core.okio.OkioReadScope$readData$1 okioReadScope$readData$1;
        ?? r2;
        androidx.content.core.okio.OkioReadScope<T> okioReadScope2;
        java.io.Closeable closeable;
        java.lang.Throwable th;
        java.lang.Object readFrom;
        java.io.Closeable closeable2;
        java.lang.Throwable th2;
        java.lang.Throwable th3;
        if (continuation instanceof androidx.content.core.okio.OkioReadScope$readData$1) {
            okioReadScope$readData$1 = (androidx.content.core.okio.OkioReadScope$readData$1) continuation;
            if ((okioReadScope$readData$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                okioReadScope$readData$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = okioReadScope$readData$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = okioReadScope$readData$1.getHighSpeedVideoFpsRanges;
                java.lang.Throwable th4 = null;
                if (r2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    okioReadScope.checkClose();
                    try {
                        okio.BufferedSource buffer = okio.Okio.buffer(((androidx.content.core.okio.OkioReadScope) okioReadScope).fileSystem.source(((androidx.content.core.okio.OkioReadScope) okioReadScope).path));
                        try {
                            androidx.content.core.okio.OkioSerializer<T> okioSerializer = ((androidx.content.core.okio.OkioReadScope) okioReadScope).serializer;
                            okioReadScope$readData$1.getHighResolutionOutputSizeshNQ4ISI = okioReadScope;
                            okioReadScope$readData$1.getHighSpeedVideoSizes = buffer;
                            okioReadScope$readData$1.getHighSpeedVideoFpsRanges = 1;
                            java.lang.Object readFrom2 = okioSerializer.readFrom(buffer, okioReadScope$readData$1);
                            if (readFrom2 != coroutine_suspended) {
                                r2 = okioReadScope;
                                closeable2 = buffer;
                                obj = readFrom2;
                            }
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
                            if (th3 != null) {
                            }
                        }
                    } catch (java.io.FileNotFoundException unused) {
                        if (!((androidx.content.core.okio.OkioReadScope) okioReadScope).fileSystem.exists(((androidx.content.core.okio.OkioReadScope) okioReadScope).path)) {
                            return ((androidx.content.core.okio.OkioReadScope) okioReadScope).serializer.getDefaultValue();
                        }
                        try {
                            okio.BufferedSource buffer2 = okio.Okio.buffer(((androidx.content.core.okio.OkioReadScope) okioReadScope).fileSystem.source(((androidx.content.core.okio.OkioReadScope) okioReadScope).path));
                            try {
                                androidx.content.core.okio.OkioSerializer<T> okioSerializer2 = ((androidx.content.core.okio.OkioReadScope) okioReadScope).serializer;
                                okioReadScope$readData$1.getHighResolutionOutputSizeshNQ4ISI = okioReadScope;
                                okioReadScope$readData$1.getHighSpeedVideoSizes = buffer2;
                                okioReadScope$readData$1.getHighSpeedVideoFpsRanges = 2;
                                readFrom = okioSerializer2.readFrom(buffer2, okioReadScope$readData$1);
                            } catch (java.lang.Throwable th7) {
                                okioReadScope2 = okioReadScope;
                                closeable = buffer2;
                                th = th7;
                                if (closeable != null) {
                                    try {
                                        closeable.close();
                                    } catch (java.lang.Throwable th8) {
                                        try {
                                            kotlin.ExceptionsKt.addSuppressed(th, th8);
                                        } catch (java.lang.Exception e) {
                                            e = e;
                                            if (!(e instanceof java.io.FileNotFoundException)) {
                                            }
                                        }
                                    }
                                }
                                okioReadScope = okioReadScope2;
                                th4 = th;
                                obj = null;
                                if (th4 != null) {
                                }
                            }
                            if (readFrom != coroutine_suspended) {
                                okioReadScope2 = okioReadScope;
                                closeable = buffer2;
                                obj = readFrom;
                                if (closeable != null) {
                                }
                                okioReadScope = okioReadScope2;
                                if (th4 != null) {
                                }
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Exception e2) {
                            androidx.content.core.okio.OkioReadScope<T> okioReadScope3 = okioReadScope;
                            e = e2;
                            okioReadScope2 = okioReadScope3;
                            if (!(e instanceof java.io.FileNotFoundException)) {
                                throw androidx.content.core.DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(java.lang.String.valueOf(((androidx.content.core.okio.OkioReadScope) okioReadScope2).path.parent()), e);
                            }
                            throw e;
                        }
                    }
                    return coroutine_suspended;
                }
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (java.io.Closeable) okioReadScope$readData$1.getHighSpeedVideoSizes;
                    okioReadScope2 = (androidx.content.core.okio.OkioReadScope) okioReadScope$readData$1.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (java.lang.Throwable th9) {
                                th4 = th9;
                            }
                        }
                        okioReadScope = okioReadScope2;
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                        if (closeable != null) {
                        }
                        okioReadScope = okioReadScope2;
                        th4 = th;
                        obj = null;
                        if (th4 != null) {
                        }
                    }
                    if (th4 != null) {
                        return obj;
                    }
                    throw th4;
                }
                closeable2 = (java.io.Closeable) okioReadScope$readData$1.getHighSpeedVideoSizes;
                r2 = (androidx.content.core.okio.OkioReadScope) okioReadScope$readData$1.getHighResolutionOutputSizeshNQ4ISI;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    r2 = r2;
                } catch (java.lang.Throwable th11) {
                    th2 = th11;
                    if (closeable2 != null) {
                    }
                    th3 = th2;
                    obj = null;
                    if (th3 != null) {
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
                if (th3 != null) {
                    return obj;
                }
                throw th3;
            }
        }
        okioReadScope$readData$1 = new androidx.content.core.okio.OkioReadScope$readData$1(okioReadScope, continuation);
        java.lang.Object obj2 = okioReadScope$readData$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = okioReadScope$readData$1.getHighSpeedVideoFpsRanges;
        java.lang.Throwable th42 = null;
        if (r2 != 0) {
        }
        if (closeable2 != null) {
        }
        th3 = null;
        if (th3 != null) {
        }
    }

    @Override // androidx.content.core.Closeable
    public void close() {
        this.getHighSpeedVideoFpsRanges.set(true);
    }

    protected final void checkClose() {
        if (this.getHighSpeedVideoFpsRanges.get()) {
            throw new java.lang.IllegalStateException("This scope has already been closed.".toString());
        }
    }

    @Override // androidx.content.core.ReadScope
    public java.lang.Object readData(kotlin.coroutines.Continuation<? super T> continuation) {
        return getHighSpeedVideoSizes(this, continuation);
    }
}
