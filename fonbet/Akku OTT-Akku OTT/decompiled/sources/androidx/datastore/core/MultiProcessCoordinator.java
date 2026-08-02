package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.W;
import kotlinx.coroutines.flow.InterfaceC1060e;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ<\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102$\b\u0004\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011H\u0082H¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u001c\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011H\u0096@¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001dH\u0096@¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00104\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010$R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0012058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u001b\u0010;\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b7\u00108*\u0004\b9\u0010:¨\u0006="}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/io/File;", Constants.FILE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V", "", "suffix", "fileWithSuffix", "(Ljava/lang/String;)Ljava/io/File;", "", "createIfNotExists", "(Ljava/io/File;)V", "createParentDirectories", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Landroidx/datastore/core/SharedCounter;", "Lkotlin/coroutines/Continuation;", "", "block", "withLazyCounter", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "lock", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryLock", "", "getVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "Lkotlinx/coroutines/flow/e;", "updateNotifications", "Lkotlinx/coroutines/flow/e;", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/e;", "LOCK_SUFFIX", "Ljava/lang/String;", "VERSION_SUFFIX", "LOCK_ERROR_MESSAGE", "Lkotlinx/coroutines/sync/a;", "inMemoryMutex", "Lkotlinx/coroutines/sync/a;", "lockFile$delegate", "Lkotlin/Lazy;", "getLockFile", "lockFile", "Lkotlin/Lazy;", "lazySharedCounter", "getSharedCounter", "()Landroidx/datastore/core/SharedCounter;", "getSharedCounter$delegate", "(Landroidx/datastore/core/MultiProcessCoordinator;)Ljava/lang/Object;", "sharedCounter", "Companion", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,207:1\n163#1,6:226\n163#1,6:232\n116#2,10:208\n32#3,8:218\n*S KotlinDebug\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n*L\n104#1:226,6\n111#1:232,6\n43#1:208,10\n60#1:218,8\n*E\n"})
/* loaded from: classes.dex */
public final class MultiProcessCoordinator implements InterProcessCoordinator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;
    private final String LOCK_ERROR_MESSAGE;
    private final String LOCK_SUFFIX;
    private final String VERSION_SUFFIX;
    private final CoroutineContext context;
    private final File file;
    private final kotlinx.coroutines.sync.a inMemoryMutex;
    private final Lazy<SharedCounter> lazySharedCounter;

    /* renamed from: lockFile$delegate, reason: from kotlin metadata */
    private final Lazy lockFile;
    private final InterfaceC1060e<Unit> updateNotifications;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "<init>", "()V", "getExclusiveFileLockWithRetryIfDeadlock", "Ljava/nio/channels/FileLock;", "lockFileStream", "Ljava/io/FileOutputStream;", "(Ljava/io/FileOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DEADLOCK_ERROR_MESSAGE", "", "INITIAL_WAIT_MILLIS", "", "MAX_WAIT_MILLIS", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0079 -> B:10:0x007c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getExclusiveFileLockWithRetryIfDeadlock(FileOutputStream fileOutputStream, Continuation<? super FileLock> continuation) {
            MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
            int i;
            long j;
            MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12;
            boolean contains$default;
            if (continuation instanceof MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) {
                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = (MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) continuation;
                int i2 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.J$0;
                        fileOutputStream = (FileOutputStream) multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
                        j *= 2;
                        if (j <= MultiProcessCoordinator.MAX_WAIT_MILLIS) {
                            FileLock lock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                            Intrinsics.checkNotNullExpressionValue(lock, "lock(...)");
                            return lock;
                        }
                        try {
                        } catch (IOException e) {
                            String message = e.getMessage();
                            if (message != null) {
                                contains$default = StringsKt__StringsKt.contains$default(message, MultiProcessCoordinator.DEADLOCK_ERROR_MESSAGE, false, 2, (Object) null);
                                if (contains$default) {
                                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12.L$0 = fileOutputStream;
                                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12.J$0 = j;
                                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12.label = 1;
                                    if (W.b(j, multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                            throw e;
                        }
                        FileLock lock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                        Intrinsics.checkNotNullExpressionValue(lock2, "lock(...)");
                        return lock2;
                    }
                    ResultKt.throwOnFailure(obj);
                    j = MultiProcessCoordinator.INITIAL_WAIT_MILLIS;
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
                    if (j <= MultiProcessCoordinator.MAX_WAIT_MILLIS) {
                    }
                }
            }
            multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = new MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(this, continuation);
            Object obj2 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
            if (i == 0) {
            }
        }

        private Companion() {
        }
    }

    public MultiProcessCoordinator(CoroutineContext context, File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.INSTANCE.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = kotlinx.coroutines.sync.d.a();
        this.lockFile = LazyKt.lazy(new Function0() { // from class: androidx.datastore.core.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                File lockFile_delegate$lambda$0;
                lockFile_delegate$lambda$0 = MultiProcessCoordinator.lockFile_delegate$lambda$0(MultiProcessCoordinator.this);
                return lockFile_delegate$lambda$0;
            }
        });
        this.lazySharedCounter = LazyKt.lazy(new h(this, 0));
    }

    private final void createIfNotExists(File file) {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
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

    private final File fileWithSuffix(String suffix) {
        return new File(this.file.getAbsolutePath() + suffix);
    }

    private final File getLockFile() {
        return (File) this.lockFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter getSharedCounter() {
        return this.lazySharedCounter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedCounter lazySharedCounter$lambda$0(MultiProcessCoordinator multiProcessCoordinator) {
        return SharedCounter.INSTANCE.create$datastore_core(new i(multiProcessCoordinator, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File lazySharedCounter$lambda$0$0(MultiProcessCoordinator multiProcessCoordinator) {
        File fileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.VERSION_SUFFIX);
        multiProcessCoordinator.createIfNotExists(fileWithSuffix);
        return fileWithSuffix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File lockFile_delegate$lambda$0(MultiProcessCoordinator multiProcessCoordinator) {
        File fileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.LOCK_SUFFIX);
        multiProcessCoordinator.createIfNotExists(fileWithSuffix);
        return fileWithSuffix;
    }

    private final <T> Object withLazyCounter(Function2<? super SharedCounter, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return function2.invoke(getSharedCounter(), continuation);
        }
        CoroutineContext coroutineContext = this.context;
        MultiProcessCoordinator$withLazyCounter$2 multiProcessCoordinator$withLazyCounter$2 = new MultiProcessCoordinator$withLazyCounter$2(function2, this, null);
        InlineMarker.mark(0);
        Object f = C1082i.f(multiProcessCoordinator$withLazyCounter$2, coroutineContext, continuation);
        InlineMarker.mark(1);
        return f;
    }

    public final File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public InterfaceC1060e<Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(Continuation<? super Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return Boxing.boxInt(getSharedCounter().getValue());
        }
        return C1082i.f(new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), this.context, continuation);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(Continuation<? super Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return Boxing.boxInt(getSharedCounter().incrementAndGetValue());
        }
        return C1082i.f(new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), this.context, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x007b, code lost:
    
        if (r2 == r1) goto L38;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4 A[Catch: all -> 0x00b8, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b8, blocks: (B:16:0x00b4, B:30:0x00d2, B:31:0x00d5), top: B:7:0x0024, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2 A[Catch: all -> 0x00b8, TRY_ENTER, TryCatch #4 {all -> 0x00b8, blocks: (B:16:0x00b4, B:30:0x00d2, B:31:0x00d5), top: B:7:0x0024, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object lock(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        MultiProcessCoordinator$lock$1 multiProcessCoordinator$lock$1;
        ?? r10;
        ?? coroutine_suspended;
        int i;
        Throwable th;
        Object exclusiveFileLockWithRetryIfDeadlock;
        Function1<? super Continuation<? super T>, ? extends Object> function12;
        java.io.Closeable closeable;
        kotlinx.coroutines.sync.a aVar;
        Object obj;
        FileLock fileLock;
        FileLock fileLock2;
        Object invoke;
        java.io.Closeable closeable2;
        Object obj2;
        kotlinx.coroutines.sync.a aVar2;
        try {
            try {
                try {
                    if (continuation instanceof MultiProcessCoordinator$lock$1) {
                        multiProcessCoordinator$lock$1 = (MultiProcessCoordinator$lock$1) continuation;
                        int i2 = multiProcessCoordinator$lock$1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            multiProcessCoordinator$lock$1.label = i2 - Integer.MIN_VALUE;
                            r10 = multiProcessCoordinator$lock$1.result;
                            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = multiProcessCoordinator$lock$1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(r10);
                                kotlinx.coroutines.sync.a aVar3 = this.inMemoryMutex;
                                multiProcessCoordinator$lock$1.L$0 = function1;
                                multiProcessCoordinator$lock$1.L$1 = aVar3;
                                multiProcessCoordinator$lock$1.label = 1;
                                Object d = aVar3.d(multiProcessCoordinator$lock$1);
                                r10 = aVar3;
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        fileLock = (FileLock) multiProcessCoordinator$lock$1.L$2;
                                        closeable2 = (java.io.Closeable) multiProcessCoordinator$lock$1.L$1;
                                        aVar2 = (kotlinx.coroutines.sync.a) multiProcessCoordinator$lock$1.L$0;
                                        try {
                                            ResultKt.throwOnFailure(r10);
                                            obj2 = r10;
                                            if (fileLock != null) {
                                                fileLock.release();
                                            }
                                            try {
                                                kotlin.io.CloseableKt.closeFinally(closeable2, null);
                                                aVar2.c(null);
                                                return obj2;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r10 = aVar2;
                                                r10.c(null);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (fileLock != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    closeable = (java.io.Closeable) multiProcessCoordinator$lock$1.L$2;
                                    aVar = (kotlinx.coroutines.sync.a) multiProcessCoordinator$lock$1.L$1;
                                    function12 = (Function1) multiProcessCoordinator$lock$1.L$0;
                                    try {
                                        ResultKt.throwOnFailure(r10);
                                        obj = r10;
                                        fileLock2 = (FileLock) obj;
                                        try {
                                            multiProcessCoordinator$lock$1.L$0 = aVar;
                                            multiProcessCoordinator$lock$1.L$1 = closeable;
                                            multiProcessCoordinator$lock$1.L$2 = fileLock2;
                                            multiProcessCoordinator$lock$1.label = 3;
                                            invoke = function12.invoke(multiProcessCoordinator$lock$1);
                                            if (invoke != coroutine_suspended) {
                                                closeable2 = closeable;
                                                fileLock = fileLock2;
                                                obj2 = invoke;
                                                aVar2 = aVar;
                                                if (fileLock != null) {
                                                }
                                                kotlin.io.CloseableKt.closeFinally(closeable2, null);
                                                aVar2.c(null);
                                                return obj2;
                                            }
                                            return coroutine_suspended;
                                        } catch (Throwable th4) {
                                            fileLock = fileLock2;
                                            th = th4;
                                            if (fileLock != null) {
                                                fileLock.release();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fileLock = null;
                                        if (fileLock != null) {
                                        }
                                        throw th;
                                    }
                                }
                                kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) multiProcessCoordinator$lock$1.L$1;
                                Function1<? super Continuation<? super T>, ? extends Object> function13 = (Function1) multiProcessCoordinator$lock$1.L$0;
                                ResultKt.throwOnFailure(r10);
                                r10 = aVar4;
                                function1 = function13;
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(getLockFile());
                            Companion companion = INSTANCE;
                            multiProcessCoordinator$lock$1.L$0 = function1;
                            multiProcessCoordinator$lock$1.L$1 = r10;
                            multiProcessCoordinator$lock$1.L$2 = fileOutputStream;
                            multiProcessCoordinator$lock$1.label = 2;
                            exclusiveFileLockWithRetryIfDeadlock = companion.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream, multiProcessCoordinator$lock$1);
                            if (exclusiveFileLockWithRetryIfDeadlock != coroutine_suspended) {
                                function12 = function1;
                                closeable = fileOutputStream;
                                aVar = r10;
                                obj = exclusiveFileLockWithRetryIfDeadlock;
                                fileLock2 = (FileLock) obj;
                                multiProcessCoordinator$lock$1.L$0 = aVar;
                                multiProcessCoordinator$lock$1.L$1 = closeable;
                                multiProcessCoordinator$lock$1.L$2 = fileLock2;
                                multiProcessCoordinator$lock$1.label = 3;
                                invoke = function12.invoke(multiProcessCoordinator$lock$1);
                                if (invoke != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    Companion companion2 = INSTANCE;
                    multiProcessCoordinator$lock$1.L$0 = function1;
                    multiProcessCoordinator$lock$1.L$1 = r10;
                    multiProcessCoordinator$lock$1.L$2 = fileOutputStream;
                    multiProcessCoordinator$lock$1.label = 2;
                    exclusiveFileLockWithRetryIfDeadlock = companion2.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream, multiProcessCoordinator$lock$1);
                    if (exclusiveFileLockWithRetryIfDeadlock != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                    }
                    throw th;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(getLockFile());
            } catch (Throwable th7) {
                th = th7;
                r10.c(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th8) {
            r10 = multiProcessCoordinator$lock$1;
            try {
                throw th8;
            } catch (Throwable th9) {
                kotlin.io.CloseableKt.closeFinally(coroutine_suspended, th8);
                throw th9;
            }
        }
        multiProcessCoordinator$lock$1 = new MultiProcessCoordinator$lock$1(this, continuation);
        r10 = multiProcessCoordinator$lock$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multiProcessCoordinator$lock$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c4, code lost:
    
        if (r12 == true) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6 A[Catch: all -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00ea, blocks: (B:15:0x00e6, B:24:0x0101, B:25:0x0104), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0101 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #7 {all -> 0x00ea, blocks: (B:15:0x00e6, B:24:0x0101, B:25:0x0104), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object tryLock(Function2<? super Boolean, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        kotlinx.coroutines.sync.a aVar;
        ?? r5;
        boolean startsWith$default;
        FileLock fileLock;
        boolean startsWith$default2;
        FileLock fileLock2;
        kotlinx.coroutines.sync.a aVar2;
        boolean z;
        java.io.Closeable closeable;
        kotlinx.coroutines.sync.a aVar3;
        boolean z2;
        Function2<? super Boolean, ? super Continuation<? super T>, ? extends Object> function22 = function2;
        try {
            try {
                if (continuation instanceof MultiProcessCoordinator$tryLock$1) {
                    MultiProcessCoordinator$tryLock$1 multiProcessCoordinator$tryLock$1 = (MultiProcessCoordinator$tryLock$1) continuation;
                    int i = multiProcessCoordinator$tryLock$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        multiProcessCoordinator$tryLock$1.label = i - Integer.MIN_VALUE;
                        aVar = multiProcessCoordinator$tryLock$1;
                        Object obj = ((MultiProcessCoordinator$tryLock$1) aVar).result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        r5 = ((MultiProcessCoordinator$tryLock$1) aVar).label;
                        if (r5 == 0) {
                            if (r5 == 1) {
                                z2 = ((MultiProcessCoordinator$tryLock$1) aVar).Z$0;
                                aVar3 = (kotlinx.coroutines.sync.a) ((MultiProcessCoordinator$tryLock$1) aVar).L$0;
                                ResultKt.throwOnFailure(obj);
                                if (z2) {
                                    aVar3.c(null);
                                }
                                return obj;
                            }
                            if (r5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z = ((MultiProcessCoordinator$tryLock$1) aVar).Z$0;
                            fileLock2 = (FileLock) ((MultiProcessCoordinator$tryLock$1) aVar).L$2;
                            closeable = (java.io.Closeable) ((MultiProcessCoordinator$tryLock$1) aVar).L$1;
                            aVar2 = (kotlinx.coroutines.sync.a) ((MultiProcessCoordinator$tryLock$1) aVar).L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                if (fileLock2 != null) {
                                    fileLock2.release();
                                }
                                kotlin.io.CloseableKt.closeFinally(closeable, null);
                                if (z) {
                                    aVar2.c(null);
                                }
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                if (fileLock2 != null) {
                                }
                                throw th;
                            }
                        }
                        ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.a aVar4 = this.inMemoryMutex;
                        boolean a = aVar4.a(null);
                        try {
                            if (a) {
                                FileInputStream fileInputStream = new FileInputStream(getLockFile());
                                try {
                                    try {
                                        fileLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileLock2 = null;
                                        if (fileLock2 != null) {
                                            fileLock2.release();
                                        }
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    String message = e.getMessage();
                                    if (message != null) {
                                        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(message, this.LOCK_ERROR_MESSAGE, false, 2, null);
                                        if (startsWith$default2) {
                                            fileLock = null;
                                        }
                                    }
                                    String message2 = e.getMessage();
                                    if (message2 != null) {
                                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(message2, DEADLOCK_ERROR_MESSAGE, false, 2, null);
                                    }
                                    throw e;
                                }
                                try {
                                    Boolean boxBoolean = Boxing.boxBoolean(fileLock != null);
                                    ((MultiProcessCoordinator$tryLock$1) aVar).L$0 = aVar4;
                                    ((MultiProcessCoordinator$tryLock$1) aVar).L$1 = fileInputStream;
                                    ((MultiProcessCoordinator$tryLock$1) aVar).L$2 = fileLock;
                                    ((MultiProcessCoordinator$tryLock$1) aVar).Z$0 = a;
                                    ((MultiProcessCoordinator$tryLock$1) aVar).label = 2;
                                    obj = function22.invoke(boxBoolean, (Object) aVar);
                                    if (obj != coroutine_suspended) {
                                        aVar2 = aVar4;
                                        z = a ? 1 : 0;
                                        closeable = fileInputStream;
                                        fileLock2 = fileLock;
                                        if (fileLock2 != null) {
                                        }
                                        kotlin.io.CloseableKt.closeFinally(closeable, null);
                                        if (z) {
                                        }
                                        return obj;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileLock2 = fileLock;
                                    if (fileLock2 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                Boolean boxBoolean2 = Boxing.boxBoolean(false);
                                ((MultiProcessCoordinator$tryLock$1) aVar).L$0 = aVar4;
                                ((MultiProcessCoordinator$tryLock$1) aVar).Z$0 = a;
                                ((MultiProcessCoordinator$tryLock$1) aVar).label = 1;
                                obj = function22.invoke(boxBoolean2, (Object) aVar);
                                if (obj != coroutine_suspended) {
                                    aVar3 = aVar4;
                                    z2 = a ? 1 : 0;
                                    if (z2) {
                                    }
                                    return obj;
                                }
                            }
                            return coroutine_suspended;
                        } catch (Throwable th4) {
                            th = th4;
                            aVar = aVar4;
                            function22 = a ? 1 : 0;
                            if (function22 != null) {
                                aVar.c(null);
                            }
                            throw th;
                        }
                    }
                }
                if (r5 == 0) {
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            Object obj2 = (??[OBJECT, ARRAY]) aVar;
            try {
                throw th6;
            } catch (Throwable th7) {
                try {
                    kotlin.io.CloseableKt.closeFinally(r5, th6);
                    throw th7;
                } catch (Throwable th8) {
                    th = th8;
                    function22 = function22;
                    aVar = (Object) obj2;
                    if (function22 != null) {
                    }
                    throw th;
                }
            }
        }
        aVar = new MultiProcessCoordinator$tryLock$1(this, continuation);
        Object obj3 = ((MultiProcessCoordinator$tryLock$1) aVar).result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = ((MultiProcessCoordinator$tryLock$1) aVar).label;
    }
}
