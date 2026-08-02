package androidx.content.core.okio;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", "T", "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "<init>", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "writeData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OkioWriteScope<T> extends androidx.content.core.okio.OkioReadScope<T> implements androidx.content.core.WriteScope<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(okio.FileSystem fileSystem, okio.Path path, androidx.content.core.okio.OkioSerializer<T> okioSerializer) {
        super(fileSystem, path, okioSerializer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okioSerializer, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #7 {all -> 0x00aa, blocks: (B:16:0x009f, B:27:0x00a9, B:41:0x009a, B:63:0x0055, B:38:0x0095), top: B:62:0x0055, outer: #2, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[Catch: all -> 0x00aa, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00aa, blocks: (B:16:0x009f, B:27:0x00a9, B:41:0x009a, B:63:0x0055, B:38:0x0095), top: B:62:0x0055, outer: #2, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // androidx.content.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object writeData(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.content.core.okio.OkioWriteScope$writeData$1 okioWriteScope$writeData$1;
        int i;
        okio.FileHandle openReadWrite;
        okio.BufferedSink buffer;
        ?? r0;
        okio.FileHandle fileHandle;
        ?? r9;
        if (continuation instanceof androidx.content.core.okio.OkioWriteScope$writeData$1) {
            okioWriteScope$writeData$1 = (androidx.content.core.okio.OkioWriteScope$writeData$1) continuation;
            if ((okioWriteScope$writeData$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                okioWriteScope$writeData$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = okioWriteScope$writeData$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = okioWriteScope$writeData$1.getHighSpeedVideoSizes;
                java.lang.Throwable th = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    checkClose();
                    try {
                        openReadWrite = getFileSystem().openReadWrite(getPath());
                        try {
                            okio.FileHandle fileHandle2 = openReadWrite;
                            buffer = okio.Okio.buffer(okio.FileHandle.sink$default(fileHandle2, 0L, 1, null));
                            try {
                                androidx.content.core.okio.OkioSerializer<T> serializer = getSerializer();
                                okioWriteScope$writeData$1.getHighSpeedVideoFpsRangesFor = openReadWrite;
                                okioWriteScope$writeData$1.getHighResolutionOutputSizeshNQ4ISI = fileHandle2;
                                okioWriteScope$writeData$1.getHighSpeedVideoFpsRanges = buffer;
                                okioWriteScope$writeData$1.getHighSpeedVideoSizes = 1;
                                if (serializer.writeTo(t, buffer, okioWriteScope$writeData$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r0 = openReadWrite;
                                fileHandle = fileHandle2;
                                r9 = buffer;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                if (buffer != null) {
                                    try {
                                        buffer.close();
                                    } catch (java.lang.Throwable th3) {
                                        kotlin.ExceptionsKt.addSuppressed(th, th3);
                                    }
                                }
                                if (th != null) {
                                }
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (openReadWrite != null) {
                                try {
                                    openReadWrite.close();
                                } catch (java.lang.Throwable th5) {
                                    kotlin.ExceptionsKt.addSuppressed(th, th5);
                                }
                            }
                        }
                    } catch (java.lang.Exception e) {
                        if (e instanceof java.io.FileNotFoundException) {
                            throw androidx.content.core.DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(java.lang.String.valueOf(getPath().parent()), e);
                        }
                        throw e;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r9 = (java.io.Closeable) okioWriteScope$writeData$1.getHighSpeedVideoFpsRanges;
                    fileHandle = (okio.FileHandle) okioWriteScope$writeData$1.getHighResolutionOutputSizeshNQ4ISI;
                    r0 = (java.io.Closeable) okioWriteScope$writeData$1.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        r0 = r0;
                        r9 = r9;
                    } catch (java.lang.Throwable th6) {
                        buffer = r9;
                        th = th6;
                        openReadWrite = r0;
                        if (buffer != null) {
                        }
                        if (th != null) {
                        }
                    }
                }
                fileHandle.flush();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (r9 != 0) {
                    try {
                        r9.close();
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        openReadWrite = r0;
                    }
                }
                openReadWrite = r0;
                th = null;
                if (th != null) {
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    if (openReadWrite != null) {
                        try {
                            openReadWrite.close();
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                        }
                    }
                    if (th == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    throw th;
                }
                throw th;
            }
        }
        okioWriteScope$writeData$1 = new androidx.content.core.okio.OkioWriteScope$writeData$1(this, continuation);
        java.lang.Object obj2 = okioWriteScope$writeData$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okioWriteScope$writeData$1.getHighSpeedVideoSizes;
        java.lang.Throwable th9 = null;
        if (i != 0) {
        }
        fileHandle.flush();
        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
        if (r9 != 0) {
        }
        openReadWrite = r0;
        th = null;
        if (th != null) {
        }
    }
}
