package androidx.datastore.core.okio;

import androidx.datastore.core.Closeable;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.ReadScope;
import androidx.datastore.core.StorageConnection;
import androidx.datastore.core.WriteScope;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.d;
import okio.AbstractC1197l;
import okio.C;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JZ\u0010\u001d\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122B\u0010\u001c\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0013¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010!\u001a\u00020\f2-\u0010\u001c\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001f¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/StorageConnection;", "Lokio/l;", "fileSystem", "Lokio/C;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Lokio/l;Lokio/C;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "checkNotClosed", "()V", "R", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "readScope", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "writeScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "Lokio/l;", "Lokio/C;", "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "Lkotlin/jvm/functions/Function0;", "Landroidx/datastore/core/okio/AtomicBoolean;", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "Lkotlinx/coroutines/sync/a;", "transactionMutex", "Lkotlinx/coroutines/sync/a;", "datastore-core-okio"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n36#2,24:237\n36#2,24:269\n116#3,8:261\n125#3,2:293\n1#4:295\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n*L\n112#1:237,24\n131#1:269,24\n127#1:261,8\n127#1:293,2\n*E\n"})
/* loaded from: classes.dex */
public final class OkioStorageConnection<T> implements StorageConnection<T> {
    private final AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final AbstractC1197l fileSystem;
    private final Function0<Unit> onClose;
    private final C path;
    private final OkioSerializer<T> serializer;
    private final kotlinx.coroutines.sync.a transactionMutex;

    public OkioStorageConnection(AbstractC1197l fileSystem, C path, OkioSerializer<T> serializer, InterProcessCoordinator coordinator, Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = d.a();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    @Override // androidx.datastore.core.StorageConnection
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|38|39|(1:41)(1:42))|14|15|16|(2:(1:19)|20)(1:22)))|52|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x0077, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0077, blocks: (B:22:0x0076, B:28:0x0086, B:31:0x0083, B:27:0x007e), top: B:7:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> Object readScope(Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super R> continuation) {
        OkioStorageConnection$readScope$1 okioStorageConnection$readScope$1;
        int i;
        Throwable th;
        Closeable closeable;
        try {
            if (continuation instanceof OkioStorageConnection$readScope$1) {
                okioStorageConnection$readScope$1 = (OkioStorageConnection$readScope$1) continuation;
                int i2 = okioStorageConnection$readScope$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    okioStorageConnection$readScope$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = okioStorageConnection$readScope$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = okioStorageConnection$readScope$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        checkNotClosed();
                        boolean a = this.transactionMutex.a(null);
                        try {
                            OkioReadScope okioReadScope = new OkioReadScope(this.fileSystem, this.path, this.serializer);
                            try {
                                Boolean boxBoolean = Boxing.boxBoolean(a);
                                okioStorageConnection$readScope$1.L$0 = okioReadScope;
                                okioStorageConnection$readScope$1.Z$0 = a;
                                okioStorageConnection$readScope$1.label = 1;
                                Object invoke = function3.invoke(okioReadScope, boxBoolean, okioStorageConnection$readScope$1);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj = invoke;
                                function3 = a ? 1 : 0;
                                closeable = okioReadScope;
                            } catch (Throwable th2) {
                                th = th2;
                                function3 = a ? 1 : 0;
                                closeable = okioReadScope;
                                closeable.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            function3 = a ? 1 : 0;
                            if (function3 != null) {
                                this.transactionMutex.c(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function3 = (Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object>) okioStorageConnection$readScope$1.Z$0;
                        closeable = (Closeable) okioStorageConnection$readScope$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                closeable.close();
                            } catch (Throwable th5) {
                                ExceptionsKt.addSuppressed(th, th5);
                            }
                            throw th;
                        }
                    }
                    closeable.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (function3 != null) {
                        this.transactionMutex.c(null);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            closeable.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (function3 != null) {
            }
            throw th;
        }
        okioStorageConnection$readScope$1 = new OkioStorageConnection$readScope$1(this, continuation);
        Object obj2 = okioStorageConnection$readScope$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okioStorageConnection$readScope$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(7:(2:3|(11:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(1:21)|22|23|24)(1:26))(2:37|38))(1:39))(2:60|(1:62)(2:64|65))|40|41|42|43|44|(6:47|14|15|16|17|(0)(0))|46))|41|42|43|44|(0)|46)|7|(0)(0)|40) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x007b, code lost:
    
        if (r10.d(r1) == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c8, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5 A[Catch: all -> 0x00c5, IOException -> 0x00c8, TRY_ENTER, TryCatch #2 {IOException -> 0x00c8, blocks: (B:19:0x00b5, B:21:0x00bd, B:26:0x00d3, B:33:0x00e0, B:36:0x00dd), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3 A[Catch: all -> 0x00c5, IOException -> 0x00c8, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x00c8, blocks: (B:19:0x00b5, B:21:0x00bd, B:26:0x00d3, B:33:0x00e0, B:36:0x00dd), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [okio.C] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, okio.C] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r1v3, types: [okio.l] */
    /* JADX WARN: Type inference failed for: r1v5, types: [okio.l] */
    /* JADX WARN: Type inference failed for: r3v3, types: [okio.l] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeScope(Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        OkioStorageConnection$writeScope$1 okioStorageConnection$writeScope$1;
        ?? r10;
        Object coroutine_suspended;
        int i;
        C c;
        kotlinx.coroutines.sync.a aVar;
        OkioWriteScope okioWriteScope;
        Throwable th;
        Closeable closeable;
        kotlinx.coroutines.sync.a aVar2;
        C c2;
        ?? r0 = ".tmp";
        try {
            try {
                try {
                    try {
                        if (continuation instanceof OkioStorageConnection$writeScope$1) {
                            okioStorageConnection$writeScope$1 = (OkioStorageConnection$writeScope$1) continuation;
                            int i2 = okioStorageConnection$writeScope$1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                okioStorageConnection$writeScope$1.label = i2 - Integer.MIN_VALUE;
                                r10 = okioStorageConnection$writeScope$1.result;
                                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = okioStorageConnection$writeScope$1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(r10);
                                    checkNotClosed();
                                    c = this.path.c();
                                    if (c == null) {
                                        throw new IllegalStateException("must have a parent path");
                                    }
                                    this.fileSystem.createDirectories(c, false);
                                    aVar = this.transactionMutex;
                                    okioStorageConnection$writeScope$1.L$0 = function2;
                                    okioStorageConnection$writeScope$1.L$1 = c;
                                    okioStorageConnection$writeScope$1.L$2 = aVar;
                                    okioStorageConnection$writeScope$1.label = 1;
                                } else {
                                    if (i != 1) {
                                        if (i != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        closeable = (Closeable) okioStorageConnection$writeScope$1.L$2;
                                        C c3 = (C) okioStorageConnection$writeScope$1.L$1;
                                        aVar2 = (kotlinx.coroutines.sync.a) okioStorageConnection$writeScope$1.L$0;
                                        try {
                                            ResultKt.throwOnFailure(r10);
                                            c2 = c3;
                                            Unit unit = Unit.INSTANCE;
                                            try {
                                                closeable.close();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (this.fileSystem.exists(c2)) {
                                                this.fileSystem.atomicMove(c2, this.path);
                                            }
                                            Unit unit2 = Unit.INSTANCE;
                                            aVar2.c(null);
                                            return Unit.INSTANCE;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                closeable.close();
                                            } catch (Throwable th4) {
                                                ExceptionsKt.addSuppressed(th, th4);
                                            }
                                            throw th;
                                        }
                                    }
                                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) okioStorageConnection$writeScope$1.L$2;
                                    c = (C) okioStorageConnection$writeScope$1.L$1;
                                    Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function22 = (Function2) okioStorageConnection$writeScope$1.L$0;
                                    ResultKt.throwOnFailure(r10);
                                    aVar = aVar3;
                                    function2 = function22;
                                }
                                r0 = c.e(this.path.b().concat(".tmp"));
                                this.fileSystem.delete(r0, false);
                                okioWriteScope = new OkioWriteScope(this.fileSystem, r0, this.serializer);
                                okioStorageConnection$writeScope$1.L$0 = aVar;
                                okioStorageConnection$writeScope$1.L$1 = r0;
                                okioStorageConnection$writeScope$1.L$2 = okioWriteScope;
                                okioStorageConnection$writeScope$1.label = 2;
                                if (function2.invoke(okioWriteScope, okioStorageConnection$writeScope$1) != coroutine_suspended) {
                                    aVar2 = aVar;
                                    closeable = okioWriteScope;
                                    c2 = r0;
                                    Unit unit3 = Unit.INSTANCE;
                                    closeable.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                        }
                        okioStorageConnection$writeScope$1.L$0 = aVar;
                        okioStorageConnection$writeScope$1.L$1 = r0;
                        okioStorageConnection$writeScope$1.L$2 = okioWriteScope;
                        okioStorageConnection$writeScope$1.label = 2;
                        if (function2.invoke(okioWriteScope, okioStorageConnection$writeScope$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th5) {
                        th = th5;
                        closeable = okioWriteScope;
                        closeable.close();
                        throw th;
                    }
                    this.fileSystem.delete(r0, false);
                    okioWriteScope = new OkioWriteScope(this.fileSystem, r0, this.serializer);
                } catch (IOException e) {
                    e = e;
                    if (this.fileSystem.exists(r0)) {
                        try {
                            this.fileSystem.delete(r0);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                if (i != 0) {
                }
                r0 = c.e(this.path.b().concat(".tmp"));
            } catch (Throwable th6) {
                th = th6;
                r10.c(null);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            r10 = okioStorageConnection$writeScope$1;
            r10.c(null);
            throw th;
        }
        okioStorageConnection$writeScope$1 = new OkioStorageConnection$writeScope$1(this, continuation);
        r10 = okioStorageConnection$writeScope$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okioStorageConnection$writeScope$1.label;
    }
}
