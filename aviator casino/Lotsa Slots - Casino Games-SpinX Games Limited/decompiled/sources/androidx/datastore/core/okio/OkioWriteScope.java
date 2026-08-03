package androidx.datastore.core.okio;

/* compiled from: OkioStorage.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", "T", "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OkioWriteScope<T> extends androidx.datastore.core.okio.OkioReadScope<T> implements androidx.datastore.core.WriteScope<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(okio.FileSystem fileSystem, okio.Path path, androidx.datastore.core.okio.OkioSerializer<T> serializer) {
        super(fileSystem, path, serializer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #5 {all -> 0x009b, blocks: (B:16:0x00a2, B:27:0x00af, B:40:0x0097, B:37:0x0092), top: B:36:0x0092, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af A[Catch: all -> 0x009b, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x009b, blocks: (B:16:0x00a2, B:27:0x00af, B:40:0x0097, B:37:0x0092), top: B:36:0x0092, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object writeData(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.datastore.core.okio.OkioWriteScope$writeData$1 okioWriteScope$writeData$1;
        int i;
        okio.FileHandle openReadWrite;
        ?? r0;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        okio.FileHandle fileHandle;
        kotlin.Unit unit;
        java.lang.Throwable th2;
        kotlin.Unit unit2;
        if (continuation instanceof androidx.datastore.core.okio.OkioWriteScope$writeData$1) {
            okioWriteScope$writeData$1 = (androidx.datastore.core.okio.OkioWriteScope$writeData$1) continuation;
            if ((okioWriteScope$writeData$1.label & Integer.MIN_VALUE) != 0) {
                okioWriteScope$writeData$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = okioWriteScope$writeData$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = okioWriteScope$writeData$1.label;
                java.lang.Throwable th3 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    checkClose();
                    openReadWrite = getFileSystem().openReadWrite(getPath());
                    try {
                        okio.FileHandle fileHandle2 = openReadWrite;
                        okio.BufferedSink buffer = okio.Okio.buffer(okio.FileHandle.sink$default(fileHandle2, 0L, 1, null));
                        try {
                            androidx.datastore.core.okio.OkioSerializer<T> serializer = getSerializer();
                            okioWriteScope$writeData$1.L$0 = openReadWrite;
                            okioWriteScope$writeData$1.L$1 = fileHandle2;
                            okioWriteScope$writeData$1.L$2 = buffer;
                            okioWriteScope$writeData$1.label = 1;
                            if (serializer.writeTo(t, buffer, okioWriteScope$writeData$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r0 = openReadWrite;
                            fileHandle = fileHandle2;
                            closeable = buffer;
                        } catch (java.lang.Throwable th4) {
                            r0 = openReadWrite;
                            th = th4;
                            closeable = buffer;
                            if (closeable != null) {
                            }
                            th2 = th;
                            unit2 = null;
                            if (th2 == null) {
                            }
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        if (openReadWrite != null) {
                            try {
                                openReadWrite.close();
                            } catch (java.lang.Throwable th6) {
                                kotlin.ExceptionsKt.addSuppressed(th, th6);
                            }
                        }
                        th3 = th;
                        unit = null;
                        if (th3 != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (java.io.Closeable) okioWriteScope$writeData$1.L$2;
                    fileHandle = (okio.FileHandle) okioWriteScope$writeData$1.L$1;
                    r0 = (java.io.Closeable) okioWriteScope$writeData$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        r0 = r0;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        if (closeable != null) {
                            try {
                                try {
                                    closeable.close();
                                } catch (java.lang.Throwable th8) {
                                    kotlin.ExceptionsKt.addSuppressed(th, th8);
                                }
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                                openReadWrite = r0;
                                if (openReadWrite != null) {
                                }
                                th3 = th;
                                unit = null;
                                if (th3 != null) {
                                }
                            }
                        }
                        th2 = th;
                        unit2 = null;
                        if (th2 == null) {
                        }
                    }
                }
                fileHandle.flush();
                unit2 = kotlin.Unit.INSTANCE;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (java.lang.Throwable th10) {
                        th2 = th10;
                    }
                }
                th2 = null;
                if (th2 == null) {
                    throw th2;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(unit2);
                unit = kotlin.Unit.INSTANCE;
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable th11) {
                        th3 = th11;
                    }
                }
                if (th3 != null) {
                    throw th3;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(unit);
                return kotlin.Unit.INSTANCE;
            }
        }
        okioWriteScope$writeData$1 = new androidx.datastore.core.okio.OkioWriteScope$writeData$1(this, continuation);
        java.lang.Object obj2 = okioWriteScope$writeData$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okioWriteScope$writeData$1.label;
        java.lang.Throwable th32 = null;
        if (i != 0) {
        }
        fileHandle.flush();
        unit2 = kotlin.Unit.INSTANCE;
        if (closeable != null) {
        }
        th2 = null;
        if (th2 == null) {
        }
    }
}
