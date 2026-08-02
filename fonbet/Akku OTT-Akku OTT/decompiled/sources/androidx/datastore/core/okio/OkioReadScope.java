package androidx.datastore.core.okio;

import androidx.datastore.core.DirectBootExceptionUtilKt;
import androidx.datastore.core.ReadScope;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.AbstractC1197l;
import okio.C;
import okio.F;
import okio.z;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/ReadScope;", "Lokio/l;", "fileSystem", "Lokio/C;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "<init>", "(Lokio/l;Lokio/C;Landroidx/datastore/core/okio/OkioSerializer;)V", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "checkClose", "Lokio/l;", "getFileSystem", "()Lokio/l;", "Lokio/C;", "getPath", "()Lokio/C;", "Landroidx/datastore/core/okio/OkioSerializer;", "getSerializer", "()Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/okio/AtomicBoolean;", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "datastore-core-okio"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n66#2:237\n52#2,4:239\n60#2,10:244\n56#2,3:254\n71#2,3:257\n66#2:260\n52#2,4:262\n60#2,10:267\n56#2,3:277\n71#2,3:280\n67#3:238\n68#3:243\n67#3:261\n68#3:266\n1#4:283\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n*L\n170#1:237\n170#1:239,4\n170#1:244,10\n170#1:254,3\n170#1:257,3\n177#1:260\n177#1:262,4\n177#1:267,10\n177#1:277,3\n177#1:280,3\n170#1:238\n170#1:243\n177#1:261\n177#1:266\n*E\n"})
/* loaded from: classes.dex */
public class OkioReadScope<T> implements ReadScope<T> {
    private final AtomicBoolean closed;
    private final AbstractC1197l fileSystem;
    private final C path;
    private final OkioSerializer<T> serializer;

    public OkioReadScope(AbstractC1197l fileSystem, C path, OkioSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(7:11|12|13|(2:30|31)|15|16|(2:18|19)(1:21))(2:45|46))(3:47|48|49))(7:70|71|72|74|75|(1:77)|78)|(2:57|58)|51|(2:53|54)(1:55)))|97|6|7|(0)(0)|(0)|51|(0)(0)|(1:(1:43))) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x008e, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2 A[Catch: Exception -> 0x00e3, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x00e3, blocks: (B:21:0x00e2, B:88:0x00a1), top: B:87:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096 A[Catch: FileNotFoundException -> 0x008e, TRY_LEAVE, TryCatch #0 {FileNotFoundException -> 0x008e, blocks: (B:55:0x0096, B:69:0x008a, B:66:0x0085), top: B:7:0x0023, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.datastore.core.okio.OkioReadScope] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <T> Object readData$suspendImpl(OkioReadScope<T> okioReadScope, Continuation<? super T> continuation) {
        OkioReadScope$readData$1 okioReadScope$readData$1;
        ?? r2;
        OkioReadScope<T> okioReadScope2;
        Closeable closeable;
        ?? th;
        Object readFrom;
        F b;
        Closeable closeable2;
        Throwable th2;
        Throwable th3;
        if (continuation instanceof OkioReadScope$readData$1) {
            okioReadScope$readData$1 = (OkioReadScope$readData$1) continuation;
            int i = okioReadScope$readData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                okioReadScope$readData$1.label = i - Integer.MIN_VALUE;
                Object obj = okioReadScope$readData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = okioReadScope$readData$1.label;
                Object th4 = null;
                if (r2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    okioReadScope.checkClose();
                    try {
                        b = z.b(((OkioReadScope) okioReadScope).fileSystem.source(((OkioReadScope) okioReadScope).path));
                    } catch (FileNotFoundException unused) {
                        if (!((OkioReadScope) okioReadScope).fileSystem.exists(((OkioReadScope) okioReadScope).path)) {
                            return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
                        }
                        try {
                            F b2 = z.b(((OkioReadScope) okioReadScope).fileSystem.source(((OkioReadScope) okioReadScope).path));
                            try {
                                OkioSerializer<T> okioSerializer = ((OkioReadScope) okioReadScope).serializer;
                                okioReadScope$readData$1.L$0 = okioReadScope;
                                okioReadScope$readData$1.L$1 = b2;
                                okioReadScope$readData$1.label = 2;
                                readFrom = okioSerializer.readFrom(b2, okioReadScope$readData$1);
                            } catch (Throwable th5) {
                                okioReadScope2 = okioReadScope;
                                closeable = b2;
                                th = th5;
                                if (closeable != null) {
                                }
                                okioReadScope = okioReadScope2;
                                if (th != 0) {
                                }
                            }
                            if (readFrom != coroutine_suspended) {
                                okioReadScope2 = okioReadScope;
                                closeable = b2;
                                obj = readFrom;
                                if (closeable != null) {
                                }
                                Object obj2 = th4;
                                th4 = obj;
                                th = obj2;
                                okioReadScope = okioReadScope2;
                                if (th != 0) {
                                }
                            }
                            return coroutine_suspended;
                        } catch (Exception e) {
                            okioReadScope2 = okioReadScope;
                            e = e;
                            if (e instanceof FileNotFoundException) {
                            }
                        }
                    }
                    try {
                        OkioSerializer<T> okioSerializer2 = ((OkioReadScope) okioReadScope).serializer;
                        okioReadScope$readData$1.L$0 = okioReadScope;
                        okioReadScope$readData$1.L$1 = b;
                        okioReadScope$readData$1.label = 1;
                        Object readFrom2 = okioSerializer2.readFrom(b, okioReadScope$readData$1);
                        if (readFrom2 != coroutine_suspended) {
                            r2 = okioReadScope;
                            closeable2 = b;
                            obj = readFrom2;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th6) {
                        r2 = okioReadScope;
                        closeable2 = b;
                        th2 = th6;
                        if (closeable2 != null) {
                        }
                        th3 = th2;
                        obj = null;
                        if (th3 != null) {
                        }
                    }
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) okioReadScope$readData$1.L$1;
                        okioReadScope2 = (OkioReadScope) okioReadScope$readData$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (Throwable th7) {
                                    th4 = th7;
                                }
                            }
                            Object obj22 = th4;
                            th4 = obj;
                            th = obj22;
                        } catch (Throwable th8) {
                            th = th8;
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (Throwable th9) {
                                    try {
                                        ExceptionsKt.addSuppressed(th, th9);
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (e instanceof FileNotFoundException) {
                                            throw e;
                                        }
                                        throw DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(String.valueOf(((OkioReadScope) okioReadScope2).path.c()), e);
                                    }
                                }
                            }
                            okioReadScope = okioReadScope2;
                            if (th != 0) {
                            }
                        }
                        okioReadScope = okioReadScope2;
                        if (th != 0) {
                            return th4;
                        }
                        throw th;
                    }
                    closeable2 = (Closeable) okioReadScope$readData$1.L$1;
                    r2 = (OkioReadScope) okioReadScope$readData$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r2 = r2;
                    } catch (Throwable th10) {
                        th2 = th10;
                        if (closeable2 != null) {
                            try {
                                closeable2.close();
                            } catch (Throwable th11) {
                                ExceptionsKt.addSuppressed(th2, th11);
                            }
                        }
                        th3 = th2;
                        obj = null;
                        if (th3 != null) {
                        }
                    }
                }
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th12) {
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
        okioReadScope$readData$1 = new OkioReadScope$readData$1(okioReadScope, continuation);
        Object obj3 = okioReadScope$readData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = okioReadScope$readData$1.label;
        Object th42 = null;
        if (r2 != 0) {
        }
        if (closeable2 != null) {
        }
        th3 = null;
        if (th3 != null) {
        }
    }

    public final void checkClose() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    public final AbstractC1197l getFileSystem() {
        return this.fileSystem;
    }

    public final C getPath() {
        return this.path;
    }

    public final OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    public Object readData(Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }
}
