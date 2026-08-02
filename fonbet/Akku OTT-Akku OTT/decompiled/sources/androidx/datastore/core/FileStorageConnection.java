package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
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

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JZ\u0010\u001d\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122B\u0010\u001c\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0013¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010!\u001a\u00020\n2-\u0010\u001c\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001f¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/StorageConnection;", "Ljava/io/File;", Constants.FILE, "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "checkNotClosed", "()V", "createParentDirectories", "(Ljava/io/File;)V", "R", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "readScope", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "writeScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "Ljava/io/File;", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlinx/coroutines/sync/a;", "transactionMutex", "Lkotlinx/coroutines/sync/a;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n36#2,24:233\n36#2,24:265\n116#3,8:257\n125#3,2:289\n1#4:291\n*S KotlinDebug\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n*L\n96#1:233,24\n112#1:265,24\n109#1:257,8\n109#1:289,2\n*E\n"})
/* loaded from: classes.dex */
public final class FileStorageConnection<T> implements StorageConnection<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final File file;
    private final Function0<Unit> onClose;
    private final Serializer<T> serializer;
    private final kotlinx.coroutines.sync.a transactionMutex;

    public FileStorageConnection(File file, Serializer<T> serializer, InterProcessCoordinator coordinator, Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = kotlinx.coroutines.sync.d.a();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void createParentDirectories(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
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
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x0075, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0075, blocks: (B:22:0x0074, B:28:0x0084, B:31:0x0081, B:27:0x007c), top: B:7:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> Object readScope(Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super R> continuation) {
        FileStorageConnection$readScope$1 fileStorageConnection$readScope$1;
        int i;
        Throwable th;
        Closeable closeable;
        try {
            if (continuation instanceof FileStorageConnection$readScope$1) {
                fileStorageConnection$readScope$1 = (FileStorageConnection$readScope$1) continuation;
                int i2 = fileStorageConnection$readScope$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fileStorageConnection$readScope$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = fileStorageConnection$readScope$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fileStorageConnection$readScope$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        checkNotClosed();
                        boolean a = this.transactionMutex.a(null);
                        try {
                            FileReadScope fileReadScope = new FileReadScope(this.file, this.serializer);
                            try {
                                Boolean boxBoolean = Boxing.boxBoolean(a);
                                fileStorageConnection$readScope$1.L$0 = fileReadScope;
                                fileStorageConnection$readScope$1.Z$0 = a;
                                fileStorageConnection$readScope$1.label = 1;
                                Object invoke = function3.invoke(fileReadScope, boxBoolean, fileStorageConnection$readScope$1);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj = invoke;
                                function3 = a ? 1 : 0;
                                closeable = fileReadScope;
                            } catch (Throwable th2) {
                                th = th2;
                                function3 = a ? 1 : 0;
                                closeable = fileReadScope;
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
                        function3 = (Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object>) fileStorageConnection$readScope$1.Z$0;
                        closeable = (Closeable) fileStorageConnection$readScope$1.L$0;
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
        fileStorageConnection$readScope$1 = new FileStorageConnection$readScope$1(this, continuation);
        Object obj2 = fileStorageConnection$readScope$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileStorageConnection$readScope$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(3:(5:(2:3|(11:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(2:24|25)|27|28|29)(1:30))(2:41|42))(1:43))(1:61)|44|45|46|48|49|(6:52|14|15|16|17|(0)(0))|51))|48|49|(0)|51)|45|46)|7|(0)(0)|44) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006b, code lost:
    
        if (r10.d(r1) == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e0, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad A[Catch: all -> 0x00dd, IOException -> 0x00e0, TRY_ENTER, TryCatch #3 {IOException -> 0x00e0, blocks: (B:19:0x00ad, B:21:0x00b3, B:24:0x00bc, B:25:0x00dc, B:30:0x00ec, B:37:0x00fa, B:40:0x00f7), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec A[Catch: all -> 0x00dd, IOException -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x00e0, blocks: (B:19:0x00ad, B:21:0x00b3, B:24:0x00bc, B:25:0x00dc, B:30:0x00ec, B:37:0x00fa, B:40:0x00f7), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeScope(Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$1;
        ?? r10;
        Object coroutine_suspended;
        int i;
        ?? r3;
        kotlinx.coroutines.sync.a aVar;
        FileWriteScope fileWriteScope;
        Throwable th;
        Closeable closeable;
        kotlinx.coroutines.sync.a aVar2;
        File file;
        try {
            try {
                try {
                    try {
                        if (continuation instanceof FileStorageConnection$writeScope$1) {
                            fileStorageConnection$writeScope$1 = (FileStorageConnection$writeScope$1) continuation;
                            int i2 = fileStorageConnection$writeScope$1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                fileStorageConnection$writeScope$1.label = i2 - Integer.MIN_VALUE;
                                r10 = fileStorageConnection$writeScope$1.result;
                                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = fileStorageConnection$writeScope$1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(r10);
                                    checkNotClosed();
                                    createParentDirectories(this.file);
                                    aVar = this.transactionMutex;
                                    fileStorageConnection$writeScope$1.L$0 = function2;
                                    fileStorageConnection$writeScope$1.L$1 = aVar;
                                    fileStorageConnection$writeScope$1.label = 1;
                                } else {
                                    if (i != 1) {
                                        if (i != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        closeable = (Closeable) fileStorageConnection$writeScope$1.L$2;
                                        file = (File) fileStorageConnection$writeScope$1.L$1;
                                        aVar2 = (kotlinx.coroutines.sync.a) fileStorageConnection$writeScope$1.L$0;
                                        try {
                                            ResultKt.throwOnFailure(r10);
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
                                            if (file.exists() && !FileMoves_androidKt.atomicMoveTo(file, this.file)) {
                                                throw new IOException("Unable to rename " + file + " to " + this.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
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
                                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) fileStorageConnection$writeScope$1.L$1;
                                    Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function22 = (Function2) fileStorageConnection$writeScope$1.L$0;
                                    ResultKt.throwOnFailure(r10);
                                    aVar = aVar3;
                                    function2 = function22;
                                }
                                r3 = new File(this.file.getAbsolutePath() + ".tmp");
                                fileWriteScope = new FileWriteScope(r3, this.serializer);
                                fileStorageConnection$writeScope$1.L$0 = aVar;
                                fileStorageConnection$writeScope$1.L$1 = r3;
                                fileStorageConnection$writeScope$1.L$2 = fileWriteScope;
                                fileStorageConnection$writeScope$1.label = 2;
                                if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                                    aVar2 = aVar;
                                    file = r3;
                                    closeable = fileWriteScope;
                                    Unit unit3 = Unit.INSTANCE;
                                    closeable.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                        }
                        fileStorageConnection$writeScope$1.L$0 = aVar;
                        fileStorageConnection$writeScope$1.L$1 = r3;
                        fileStorageConnection$writeScope$1.L$2 = fileWriteScope;
                        fileStorageConnection$writeScope$1.label = 2;
                        if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th5) {
                        th = th5;
                        closeable = fileWriteScope;
                        closeable.close();
                        throw th;
                    }
                    fileWriteScope = new FileWriteScope(r3, this.serializer);
                } catch (IOException e) {
                    e = e;
                    if (r3.exists()) {
                        r3.delete();
                    }
                    throw e;
                }
                if (i != 0) {
                }
                r3 = new File(this.file.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                r10.c(null);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            r10 = fileStorageConnection$writeScope$1;
            r10.c(null);
            throw th;
        }
        fileStorageConnection$writeScope$1 = new FileStorageConnection$writeScope$1(this, continuation);
        r10 = fileStorageConnection$writeScope$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileStorageConnection$writeScope$1.label;
    }
}
