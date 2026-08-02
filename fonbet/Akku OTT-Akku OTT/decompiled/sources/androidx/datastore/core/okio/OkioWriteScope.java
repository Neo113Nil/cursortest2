package androidx.datastore.core.okio;

import androidx.datastore.core.DirectBootExceptionUtilKt;
import androidx.datastore.core.WriteScope;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.AbstractC1195j;
import okio.AbstractC1197l;
import okio.C;
import okio.E;
import okio.z;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "Lokio/l;", "fileSystem", "Lokio/C;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "<init>", "(Lokio/l;Lokio/C;Landroidx/datastore/core/okio/OkioSerializer;)V", "value", "", "writeData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,236:1\n66#2:237\n52#2,4:238\n66#2:242\n52#2,22:243\n60#2,10:265\n56#2,3:275\n71#2,3:278\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n*L\n212#1:237\n212#1:238,4\n213#1:242\n213#1:243,22\n212#1:265,10\n212#1:275,3\n212#1:278,3\n*E\n"})
/* loaded from: classes.dex */
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(AbstractC1197l fileSystem, C path, OkioSerializer<T> serializer) {
        super(fileSystem, path, serializer);
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096 A[Catch: all -> 0x00a0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a0, blocks: (B:17:0x0096, B:35:0x00a2, B:66:0x0052), top: B:65:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6 A[Catch: Exception -> 0x00ae, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00ae, blocks: (B:23:0x00b6, B:59:0x00aa, B:64:0x0046, B:56:0x00a5), top: B:63:0x0046, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[Catch: all -> 0x00a0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a0, blocks: (B:17:0x0096, B:35:0x00a2, B:66:0x0052), top: B:65:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeData(T t, Continuation<? super Unit> continuation) {
        OkioWriteScope$writeData$1 okioWriteScope$writeData$1;
        int i;
        ?? r0;
        Throwable th;
        Closeable closeable;
        AbstractC1195j abstractC1195j;
        Throwable th2;
        if (continuation instanceof OkioWriteScope$writeData$1) {
            okioWriteScope$writeData$1 = (OkioWriteScope$writeData$1) continuation;
            int i2 = okioWriteScope$writeData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okioWriteScope$writeData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = okioWriteScope$writeData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = okioWriteScope$writeData$1.label;
                Throwable th3 = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    checkClose();
                    try {
                        AbstractC1195j openReadWrite = getFileSystem().openReadWrite(getPath());
                        try {
                            E a = z.a(AbstractC1195j.u(openReadWrite));
                            try {
                                OkioSerializer<T> serializer = getSerializer();
                                okioWriteScope$writeData$1.L$0 = openReadWrite;
                                okioWriteScope$writeData$1.L$1 = openReadWrite;
                                okioWriteScope$writeData$1.L$2 = a;
                                okioWriteScope$writeData$1.label = 1;
                                if (serializer.writeTo(t, a, okioWriteScope$writeData$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                AbstractC1195j abstractC1195j2 = openReadWrite;
                                abstractC1195j = abstractC1195j2;
                                closeable = a;
                                r0 = abstractC1195j2;
                            } catch (Throwable th4) {
                                r0 = openReadWrite;
                                th = th4;
                                closeable = a;
                                if (closeable != null) {
                                    try {
                                        closeable.close();
                                    } catch (Throwable th5) {
                                        try {
                                            ExceptionsKt.addSuppressed(th, th5);
                                        } catch (Throwable th6) {
                                            th = th6;
                                            openReadWrite = r0;
                                            if (openReadWrite != null) {
                                            }
                                            th3 = th;
                                            if (th3 == null) {
                                            }
                                        }
                                    }
                                }
                                th2 = th;
                                Closeable closeable2 = r0;
                                if (th2 == null) {
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            if (openReadWrite != null) {
                                try {
                                    openReadWrite.close();
                                } catch (Throwable th8) {
                                    ExceptionsKt.addSuppressed(th, th8);
                                }
                            }
                            th3 = th;
                            if (th3 == null) {
                            }
                        }
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(String.valueOf(getPath().c()), e);
                        }
                        throw e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) okioWriteScope$writeData$1.L$2;
                    abstractC1195j = (AbstractC1195j) okioWriteScope$writeData$1.L$1;
                    r0 = (Closeable) okioWriteScope$writeData$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r0 = r0;
                    } catch (Throwable th9) {
                        th = th9;
                        if (closeable != null) {
                        }
                        th2 = th;
                        Closeable closeable22 = r0;
                        if (th2 == null) {
                        }
                    }
                }
                abstractC1195j.flush();
                Unit unit = Unit.INSTANCE;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th10) {
                        th2 = th10;
                    }
                }
                th2 = null;
                Closeable closeable222 = r0;
                if (th2 == null) {
                    throw th2;
                }
                Unit unit2 = Unit.INSTANCE;
                if (closeable222 != null) {
                    try {
                        closeable222.close();
                    } catch (Throwable th11) {
                        th3 = th11;
                    }
                }
                if (th3 == null) {
                    return Unit.INSTANCE;
                }
                throw th3;
            }
        }
        okioWriteScope$writeData$1 = new OkioWriteScope$writeData$1(this, continuation);
        Object obj2 = okioWriteScope$writeData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okioWriteScope$writeData$1.label;
        Throwable th32 = null;
        if (i != 0) {
        }
        abstractC1195j.flush();
        Unit unit3 = Unit.INSTANCE;
        if (closeable != null) {
        }
        th2 = null;
        Closeable closeable2222 = r0;
        if (th2 == null) {
        }
    }
}
