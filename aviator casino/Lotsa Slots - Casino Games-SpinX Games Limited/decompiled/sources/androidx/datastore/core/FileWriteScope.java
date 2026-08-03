package androidx.datastore.core;

/* compiled from: FileStorage.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Landroidx/datastore/core/FileWriteScope;", "T", "Landroidx/datastore/core/FileReadScope;", "Landroidx/datastore/core/WriteScope;", "file", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileWriteScope<T> extends androidx.datastore.core.FileReadScope<T> implements androidx.datastore.core.WriteScope<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope(java.io.File file, androidx.datastore.core.Serializer<T> serializer) {
        super(file, serializer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object writeData(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.datastore.core.FileWriteScope$writeData$1 fileWriteScope$writeData$1;
        int i;
        java.io.Closeable closeable;
        java.io.FileOutputStream fileOutputStream;
        if (continuation instanceof androidx.datastore.core.FileWriteScope$writeData$1) {
            fileWriteScope$writeData$1 = (androidx.datastore.core.FileWriteScope$writeData$1) continuation;
            if ((fileWriteScope$writeData$1.label & Integer.MIN_VALUE) != 0) {
                fileWriteScope$writeData$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = fileWriteScope$writeData$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fileWriteScope$writeData$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    checkNotClosed();
                    java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(getFile());
                    try {
                        java.io.FileOutputStream fileOutputStream3 = fileOutputStream2;
                        androidx.datastore.core.Serializer<T> serializer = getSerializer();
                        androidx.datastore.core.UncloseableOutputStream uncloseableOutputStream = new androidx.datastore.core.UncloseableOutputStream(fileOutputStream3);
                        fileWriteScope$writeData$1.L$0 = fileOutputStream2;
                        fileWriteScope$writeData$1.L$1 = fileOutputStream3;
                        fileWriteScope$writeData$1.label = 1;
                        if (serializer.writeTo(t, uncloseableOutputStream, fileWriteScope$writeData$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        closeable = fileOutputStream2;
                        fileOutputStream = fileOutputStream3;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        closeable = fileOutputStream2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream = (java.io.FileOutputStream) fileWriteScope$writeData$1.L$1;
                    closeable = (java.io.Closeable) fileWriteScope$writeData$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            kotlin.io.CloseableKt.closeFinally(closeable, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream.getFD().sync();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(closeable, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        fileWriteScope$writeData$1 = new androidx.datastore.core.FileWriteScope$writeData$1(this, continuation);
        java.lang.Object obj2 = fileWriteScope$writeData$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileWriteScope$writeData$1.label;
        if (i != 0) {
        }
        fileOutputStream.getFD().sync();
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        kotlin.io.CloseableKt.closeFinally(closeable, null);
        return kotlin.Unit.INSTANCE;
    }
}
