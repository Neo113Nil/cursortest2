package androidx.datastore.core;

/* compiled from: DataStoreImpl.kt */
@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 V*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002VWBn\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012?\b\u0002\u0010\u0005\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00070\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u000e\u00103\u001a\u00020\rH\u0082@¢\u0006\u0002\u00104JG\u00105\u001a\u0002H6\"\u0004\b\u0001\u001062\u0006\u00107\u001a\u0002082\u001c\u00109\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H60\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0:H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010;J\u001c\u0010<\u001a\u00020\r2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0082@¢\u0006\u0002\u0010>J\u000e\u0010?\u001a\u00020\rH\u0082@¢\u0006\u0002\u00104J\u000e\u0010@\u001a\u00020\rH\u0082@¢\u0006\u0002\u00104J\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000B2\u0006\u0010C\u001a\u000208H\u0082@¢\u0006\u0002\u0010DJ\u000e\u0010E\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u00104J\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000G2\u0006\u00107\u001a\u000208H\u0082@¢\u0006\u0002\u0010DJ\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000B2\u0006\u0010C\u001a\u000208H\u0082@¢\u0006\u0002\u0010DJI\u0010I\u001a\u00028\u000021\u0010J\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(K\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00072\u0006\u0010L\u001a\u00020MH\u0082@¢\u0006\u0002\u0010NJA\u0010O\u001a\u00028\u000021\u0010J\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(K\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007H\u0096@¢\u0006\u0002\u0010PJ \u0010Q\u001a\u00020\u00152\u0006\u0010R\u001a\u00028\u00002\u0006\u0010S\u001a\u000208H\u0080@¢\u0006\u0004\bT\u0010UR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010&\u001a\f0'R\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b,\u0010-*\u0004\b*\u0010+R\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)0/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000201X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Landroidx/datastore/core/DataStoreImpl;", "T", "Landroidx/datastore/core/DataStore;", com.ironsource.X3.a.k, "Landroidx/datastore/core/Storage;", "initTasksList", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "corruptionHandler", "Landroidx/datastore/core/CorruptionHandler;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/datastore/core/Storage;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;)V", "collectorCounter", "", "collectorJob", "Lkotlinx/coroutines/Job;", "collectorMutex", "Lkotlinx/coroutines/sync/Mutex;", "coordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "coordinator$delegate", "Lkotlin/Lazy;", "data", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "inMemoryCache", "Landroidx/datastore/core/DataStoreInMemoryCache;", "readAndInit", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "storageConnection", "Landroidx/datastore/core/StorageConnection;", "getStorageConnection$datastore_core_release$delegate", "(Landroidx/datastore/core/DataStoreImpl;)Ljava/lang/Object;", "getStorageConnection$datastore_core_release", "()Landroidx/datastore/core/StorageConnection;", "storageConnectionDelegate", "Lkotlin/Lazy;", "writeActor", "Landroidx/datastore/core/SimpleActor;", "Landroidx/datastore/core/Message$Update;", "decrementCollector", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doWithWriteFileLock", "R", "hasWriteFileLock", "", "block", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUpdate", "update", "(Landroidx/datastore/core/Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementCollector", "readAndInitOrPropagateAndThrowFailure", "readDataAndUpdateCache", "Landroidx/datastore/core/State;", "requireLock", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readDataFromFileOrDefault", "readDataOrHandleCorruption", "Landroidx/datastore/core/Data;", "readState", "transformAndWrite", "transform", "t", "callerContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "newData", "updateCache", "writeData$datastore_core_release", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "InitDataStore", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DataStoreImpl<T> implements androidx.datastore.core.DataStore<T> {
    private static final java.lang.String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    private int collectorCounter;
    private kotlinx.coroutines.Job collectorJob;
    private final kotlinx.coroutines.sync.Mutex collectorMutex;

    /* renamed from: coordinator$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy coordinator;
    private final androidx.datastore.core.CorruptionHandler<T> corruptionHandler;
    private final kotlinx.coroutines.flow.Flow<T> data;
    private final androidx.datastore.core.DataStoreInMemoryCache<T> inMemoryCache;
    private final androidx.datastore.core.DataStoreImpl<T>.InitDataStore readAndInit;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final androidx.datastore.core.Storage<T> storage;
    private final kotlin.Lazy<androidx.datastore.core.StorageConnection<T>> storageConnectionDelegate;
    private final androidx.datastore.core.SimpleActor<androidx.datastore.core.Message.Update<T>> writeActor;

    public DataStoreImpl(androidx.datastore.core.Storage<T> storage, java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> initTasksList, androidx.datastore.core.CorruptionHandler<T> corruptionHandler, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = kotlinx.coroutines.flow.FlowKt.flow(new androidx.datastore.core.DataStoreImpl$data$1(this, null));
        this.collectorMutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.inMemoryCache = new androidx.datastore.core.DataStoreInMemoryCache<>();
        this.readAndInit = new androidx.datastore.core.DataStoreImpl.InitDataStore(this, initTasksList);
        this.storageConnectionDelegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.StorageConnection<T>>(this) { // from class: androidx.datastore.core.DataStoreImpl$storageConnectionDelegate$1
            final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final androidx.datastore.core.StorageConnection<T> invoke() {
                androidx.datastore.core.Storage storage2;
                storage2 = ((androidx.datastore.core.DataStoreImpl) this.this$0).storage;
                return storage2.createConnection();
            }
        });
        this.coordinator = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.InterProcessCoordinator>(this) { // from class: androidx.datastore.core.DataStoreImpl$coordinator$2
            final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.datastore.core.InterProcessCoordinator invoke() {
                return this.this$0.getStorageConnection$datastore_core_release().getCoordinator();
            }
        });
        this.writeActor = new androidx.datastore.core.SimpleActor<>(scope, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>(this) { // from class: androidx.datastore.core.DataStoreImpl$writeActor$1
            final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                kotlin.Lazy lazy;
                if (th != null) {
                    ((androidx.datastore.core.DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(new androidx.datastore.core.Final(th));
                }
                lazy = ((androidx.datastore.core.DataStoreImpl) this.this$0).storageConnectionDelegate;
                if (lazy.isInitialized()) {
                    this.this$0.getStorageConnection$datastore_core_release().close();
                }
            }
        }, new kotlin.jvm.functions.Function2<androidx.datastore.core.Message.Update<T>, java.lang.Throwable, kotlin.Unit>() { // from class: androidx.datastore.core.DataStoreImpl$writeActor$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Throwable th) {
                invoke((androidx.datastore.core.Message.Update) obj, th);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.datastore.core.Message.Update<T> msg, java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                kotlinx.coroutines.CompletableDeferred<T> ack = msg.getAck();
                if (th == null) {
                    th = new java.util.concurrent.CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ack.completeExceptionally(th);
            }
        }, new androidx.datastore.core.DataStoreImpl$writeActor$3(this, null));
    }

    public /* synthetic */ DataStoreImpl(androidx.datastore.core.Storage storage, java.util.List list, androidx.datastore.core.handlers.NoOpCorruptionHandler noOpCorruptionHandler, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(storage, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? new androidx.datastore.core.handlers.NoOpCorruptionHandler() : noOpCorruptionHandler, (i & 8) != 0 ? kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(androidx.datastore.core.Actual_jvmKt.ioDispatcher().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null))) : coroutineScope);
    }

    @Override // androidx.datastore.core.DataStore
    public kotlinx.coroutines.flow.Flow<T> getData() {
        return this.data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:11:0x004f, B:13:0x0056, B:14:0x006a), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object incrementCollector(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.datastore.core.DataStoreImpl$incrementCollector$1 dataStoreImpl$incrementCollector$1;
        int i;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl;
        kotlinx.coroutines.sync.Mutex mutex;
        int i2;
        kotlinx.coroutines.Job launch$default;
        try {
            if (continuation instanceof androidx.datastore.core.DataStoreImpl$incrementCollector$1) {
                dataStoreImpl$incrementCollector$1 = (androidx.datastore.core.DataStoreImpl$incrementCollector$1) continuation;
                if ((dataStoreImpl$incrementCollector$1.label & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$incrementCollector$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = dataStoreImpl$incrementCollector$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$incrementCollector$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.collectorMutex;
                        dataStoreImpl$incrementCollector$1.L$0 = this;
                        dataStoreImpl$incrementCollector$1.L$1 = mutex2;
                        dataStoreImpl$incrementCollector$1.label = 1;
                        if (mutex2.lock(null, dataStoreImpl$incrementCollector$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dataStoreImpl = this;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) dataStoreImpl$incrementCollector$1.L$1;
                        dataStoreImpl = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$incrementCollector$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    i2 = dataStoreImpl.collectorCounter + 1;
                    dataStoreImpl.collectorCounter = i2;
                    if (i2 == 1) {
                        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(dataStoreImpl.scope, null, null, new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1(dataStoreImpl, null), 3, null);
                        dataStoreImpl.collectorJob = launch$default;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            i2 = dataStoreImpl.collectorCounter + 1;
            dataStoreImpl.collectorCounter = i2;
            if (i2 == 1) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        dataStoreImpl$incrementCollector$1 = new androidx.datastore.core.DataStoreImpl$incrementCollector$1(this, continuation);
        java.lang.Object obj2 = dataStoreImpl$incrementCollector$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$incrementCollector$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x004f, B:13:0x0057, B:15:0x005b, B:16:0x005e, B:17:0x0060), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object decrementCollector(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.datastore.core.DataStoreImpl$decrementCollector$1 dataStoreImpl$decrementCollector$1;
        int i;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl;
        kotlinx.coroutines.sync.Mutex mutex;
        int i2;
        try {
            if (continuation instanceof androidx.datastore.core.DataStoreImpl$decrementCollector$1) {
                dataStoreImpl$decrementCollector$1 = (androidx.datastore.core.DataStoreImpl$decrementCollector$1) continuation;
                if ((dataStoreImpl$decrementCollector$1.label & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$decrementCollector$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = dataStoreImpl$decrementCollector$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$decrementCollector$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.collectorMutex;
                        dataStoreImpl$decrementCollector$1.L$0 = this;
                        dataStoreImpl$decrementCollector$1.L$1 = mutex2;
                        dataStoreImpl$decrementCollector$1.label = 1;
                        if (mutex2.lock(null, dataStoreImpl$decrementCollector$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dataStoreImpl = this;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) dataStoreImpl$decrementCollector$1.L$1;
                        dataStoreImpl = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$decrementCollector$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    i2 = dataStoreImpl.collectorCounter - 1;
                    dataStoreImpl.collectorCounter = i2;
                    if (i2 == 0) {
                        kotlinx.coroutines.Job job = dataStoreImpl.collectorJob;
                        if (job != null) {
                            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                        }
                        dataStoreImpl.collectorJob = null;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            i2 = dataStoreImpl.collectorCounter - 1;
            dataStoreImpl.collectorCounter = i2;
            if (i2 == 0) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        dataStoreImpl$decrementCollector$1 = new androidx.datastore.core.DataStoreImpl$decrementCollector$1(this, continuation);
        java.lang.Object obj2 = dataStoreImpl$decrementCollector$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$decrementCollector$1.label;
        if (i != 0) {
        }
    }

    @Override // androidx.datastore.core.DataStore
    public java.lang.Object updateData(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.datastore.core.UpdatingDataContextElement updatingDataContextElement = (androidx.datastore.core.UpdatingDataContextElement) continuation.getContext().get(androidx.datastore.core.UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return kotlinx.coroutines.BuildersKt.withContext(new androidx.datastore.core.UpdatingDataContextElement(updatingDataContextElement, this), new androidx.datastore.core.DataStoreImpl$updateData$2(this, function2, null), continuation);
    }

    public final androidx.datastore.core.StorageConnection<T> getStorageConnection$datastore_core_release() {
        return this.storageConnectionDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.datastore.core.InterProcessCoordinator getCoordinator() {
        return (androidx.datastore.core.InterProcessCoordinator) this.coordinator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object readState(boolean z, kotlin.coroutines.Continuation<? super androidx.datastore.core.State<T>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.scope.getCoroutineContext(), new androidx.datastore.core.DataStoreImpl$readState$2(this, z, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(4:36|(2:49|(2:51|52)(2:53|54))|39|(2:41|(1:43)(1:44))(2:45|46)))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0053, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.DataStoreImpl, androidx.datastore.core.DataStoreImpl<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object handleUpdate(androidx.datastore.core.Message.Update<T> update, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.datastore.core.DataStoreImpl$handleUpdate$1 dataStoreImpl$handleUpdate$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Object m10798constructorimpl;
        ?? r9;
        kotlinx.coroutines.CompletableDeferred<T> ack;
        androidx.datastore.core.State<T> currentState;
        androidx.datastore.core.DataStoreImpl dataStoreImpl;
        java.lang.Object transformAndWrite;
        androidx.datastore.core.Message.Update<T> update2;
        androidx.datastore.core.Message.Update<T> update3;
        if (continuation instanceof androidx.datastore.core.DataStoreImpl$handleUpdate$1) {
            dataStoreImpl$handleUpdate$1 = (androidx.datastore.core.DataStoreImpl$handleUpdate$1) continuation;
            if ((dataStoreImpl$handleUpdate$1.label & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$handleUpdate$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dataStoreImpl$handleUpdate$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreImpl$handleUpdate$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    ack = update.getAck();
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        currentState = this.inMemoryCache.getCurrentState();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        update = ack;
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                        r9 = update;
                        kotlinx.coroutines.CompletableDeferredKt.completeWith(r9, m10798constructorimpl);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (currentState instanceof androidx.datastore.core.Data) {
                        kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> transform = update.getTransform();
                        kotlin.coroutines.CoroutineContext callerContext = update.getCallerContext();
                        dataStoreImpl$handleUpdate$1.L$0 = ack;
                        dataStoreImpl$handleUpdate$1.label = 1;
                        transformAndWrite = transformAndWrite(transform, callerContext, dataStoreImpl$handleUpdate$1);
                        if (transformAndWrite == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidx.datastore.core.Message.Update<T> update4 = ack;
                        obj = transformAndWrite;
                        update = update4;
                        m10798constructorimpl = kotlin.Result.m10798constructorimpl(obj);
                        r9 = update;
                        kotlinx.coroutines.CompletableDeferredKt.completeWith(r9, m10798constructorimpl);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (!(currentState instanceof androidx.datastore.core.ReadException) && !(currentState instanceof androidx.datastore.core.UnInitialized)) {
                        if (currentState instanceof androidx.datastore.core.Final) {
                            throw ((androidx.datastore.core.Final) currentState).getFinalException();
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (currentState == update.getLastState()) {
                        dataStoreImpl$handleUpdate$1.L$0 = update;
                        dataStoreImpl$handleUpdate$1.L$1 = this;
                        dataStoreImpl$handleUpdate$1.L$2 = ack;
                        dataStoreImpl$handleUpdate$1.label = 2;
                        if (readAndInitOrPropagateAndThrowFailure(dataStoreImpl$handleUpdate$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dataStoreImpl = this;
                        update2 = update;
                    } else {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(currentState, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                        throw ((androidx.datastore.core.ReadException) currentState).getReadException();
                    }
                } else {
                    if (i == 1) {
                        update3 = (kotlinx.coroutines.CompletableDeferred) dataStoreImpl$handleUpdate$1.L$0;
                    } else if (i == 2) {
                        kotlinx.coroutines.CompletableDeferred<T> completableDeferred = (kotlinx.coroutines.CompletableDeferred) dataStoreImpl$handleUpdate$1.L$2;
                        dataStoreImpl = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$handleUpdate$1.L$1;
                        androidx.datastore.core.Message.Update<T> update5 = (androidx.datastore.core.Message.Update) dataStoreImpl$handleUpdate$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        ack = completableDeferred;
                        update2 = update5;
                    } else {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        update3 = (androidx.datastore.core.Message.Update<T>) ((kotlinx.coroutines.CompletableDeferred) dataStoreImpl$handleUpdate$1.L$0);
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    update = update3;
                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(obj);
                    r9 = update;
                    kotlinx.coroutines.CompletableDeferredKt.completeWith(r9, m10798constructorimpl);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> transform2 = update2.getTransform();
                kotlin.coroutines.CoroutineContext callerContext2 = update2.getCallerContext();
                dataStoreImpl$handleUpdate$1.L$0 = ack;
                dataStoreImpl$handleUpdate$1.L$1 = null;
                dataStoreImpl$handleUpdate$1.L$2 = null;
                dataStoreImpl$handleUpdate$1.label = 3;
                transformAndWrite = dataStoreImpl.transformAndWrite(transform2, callerContext2, dataStoreImpl$handleUpdate$1);
                if (transformAndWrite == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidx.datastore.core.Message.Update<T> update42 = ack;
                obj = transformAndWrite;
                update = update42;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(obj);
                r9 = update;
                kotlinx.coroutines.CompletableDeferredKt.completeWith(r9, m10798constructorimpl);
                return kotlin.Unit.INSTANCE;
            }
        }
        dataStoreImpl$handleUpdate$1 = new androidx.datastore.core.DataStoreImpl$handleUpdate$1(this, continuation);
        java.lang.Object obj2 = dataStoreImpl$handleUpdate$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$handleUpdate$1.label;
        if (i != 0) {
        }
        kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> transform22 = update2.getTransform();
        kotlin.coroutines.CoroutineContext callerContext22 = update2.getCallerContext();
        dataStoreImpl$handleUpdate$1.L$0 = ack;
        dataStoreImpl$handleUpdate$1.L$1 = null;
        dataStoreImpl$handleUpdate$1.L$2 = null;
        dataStoreImpl$handleUpdate$1.label = 3;
        transformAndWrite = dataStoreImpl.transformAndWrite(transform22, callerContext22, dataStoreImpl$handleUpdate$1);
        if (transformAndWrite == coroutine_suspended) {
        }
        androidx.datastore.core.Message.Update<T> update422 = ack;
        obj2 = transformAndWrite;
        update = update422;
        m10798constructorimpl = kotlin.Result.m10798constructorimpl(obj2);
        r9 = update;
        kotlinx.coroutines.CompletableDeferredKt.completeWith(r9, m10798constructorimpl);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1;
        java.lang.Object coroutine_suspended;
        int i;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl;
        int intValue;
        int i2;
        java.lang.Throwable th;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl2;
        androidx.datastore.core.DataStoreImpl<T>.InitDataStore initDataStore;
        try {
            if (continuation instanceof androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) {
                dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 = (androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) continuation;
                if ((dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.datastore.core.InterProcessCoordinator coordinator = getCoordinator();
                        dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.L$0 = this;
                        dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = 1;
                        obj = coordinator.getVersion(dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dataStoreImpl = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i2 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.I$0;
                            dataStoreImpl2 = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                dataStoreImpl2.inMemoryCache.tryUpdate(new androidx.datastore.core.ReadException(th, i2));
                                throw th;
                            }
                        }
                        dataStoreImpl = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    intValue = ((java.lang.Number) obj).intValue();
                    initDataStore = dataStoreImpl.readAndInit;
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.L$0 = dataStoreImpl;
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.I$0 = intValue;
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = 2;
                    if (initDataStore.runIfNeeded(dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            initDataStore = dataStoreImpl.readAndInit;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.L$0 = dataStoreImpl;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.I$0 = intValue;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = 2;
            if (initDataStore.runIfNeeded(dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) == coroutine_suspended) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th3) {
            i2 = intValue;
            th = th3;
            dataStoreImpl2 = dataStoreImpl;
            dataStoreImpl2.inMemoryCache.tryUpdate(new androidx.datastore.core.ReadException(th, i2));
            throw th;
        }
        dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1(this, continuation);
        java.lang.Object obj2 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label;
        if (i != 0) {
        }
        intValue = ((java.lang.Number) obj2).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object readDataAndUpdateCache(boolean z, kotlin.coroutines.Continuation<? super androidx.datastore.core.State<T>> continuation) {
        androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 dataStoreImpl$readDataAndUpdateCache$1;
        int i;
        androidx.datastore.core.State<T> state;
        java.lang.Object obj;
        boolean z2;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl;
        boolean z3;
        kotlin.Pair pair;
        if (continuation instanceof androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1) {
            dataStoreImpl$readDataAndUpdateCache$1 = (androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1) continuation;
            if ((dataStoreImpl$readDataAndUpdateCache$1.label & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readDataAndUpdateCache$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj2 = dataStoreImpl$readDataAndUpdateCache$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreImpl$readDataAndUpdateCache$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    androidx.datastore.core.State<T> currentState = this.inMemoryCache.getCurrentState();
                    if (!(!(currentState instanceof androidx.datastore.core.UnInitialized))) {
                        throw new java.lang.IllegalStateException(BUG_MESSAGE.toString());
                    }
                    androidx.datastore.core.InterProcessCoordinator coordinator = getCoordinator();
                    dataStoreImpl$readDataAndUpdateCache$1.L$0 = this;
                    dataStoreImpl$readDataAndUpdateCache$1.L$1 = currentState;
                    dataStoreImpl$readDataAndUpdateCache$1.Z$0 = z;
                    dataStoreImpl$readDataAndUpdateCache$1.label = 1;
                    java.lang.Object version = coordinator.getVersion(dataStoreImpl$readDataAndUpdateCache$1);
                    if (version == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    state = currentState;
                    obj = version;
                    z2 = z;
                    dataStoreImpl = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            dataStoreImpl = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$readDataAndUpdateCache$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            pair = (kotlin.Pair) obj2;
                            androidx.datastore.core.State<T> state2 = (androidx.datastore.core.State) pair.component1();
                            if (((java.lang.Boolean) pair.component2()).booleanValue()) {
                            }
                            return state2;
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dataStoreImpl = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$readDataAndUpdateCache$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        pair = (kotlin.Pair) obj2;
                        androidx.datastore.core.State<T> state22 = (androidx.datastore.core.State) pair.component1();
                        if (((java.lang.Boolean) pair.component2()).booleanValue()) {
                            dataStoreImpl.inMemoryCache.tryUpdate(state22);
                        }
                        return state22;
                    }
                    boolean z4 = dataStoreImpl$readDataAndUpdateCache$1.Z$0;
                    androidx.datastore.core.State<T> state3 = (androidx.datastore.core.State) dataStoreImpl$readDataAndUpdateCache$1.L$1;
                    androidx.datastore.core.DataStoreImpl<T> dataStoreImpl2 = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$readDataAndUpdateCache$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    z2 = z4;
                    dataStoreImpl = dataStoreImpl2;
                    state = state3;
                    obj = obj2;
                }
                int intValue = ((java.lang.Number) obj).intValue();
                z3 = state instanceof androidx.datastore.core.Data;
                int version2 = !z3 ? state.getVersion() : -1;
                if (!z3 && intValue == version2) {
                    return state;
                }
                if (!z2) {
                    androidx.datastore.core.InterProcessCoordinator coordinator2 = dataStoreImpl.getCoordinator();
                    androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3 dataStoreImpl$readDataAndUpdateCache$3 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3(dataStoreImpl, null);
                    dataStoreImpl$readDataAndUpdateCache$1.L$0 = dataStoreImpl;
                    dataStoreImpl$readDataAndUpdateCache$1.L$1 = null;
                    dataStoreImpl$readDataAndUpdateCache$1.label = 2;
                    obj2 = coordinator2.lock(dataStoreImpl$readDataAndUpdateCache$3, dataStoreImpl$readDataAndUpdateCache$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pair = (kotlin.Pair) obj2;
                    androidx.datastore.core.State<T> state222 = (androidx.datastore.core.State) pair.component1();
                    if (((java.lang.Boolean) pair.component2()).booleanValue()) {
                    }
                    return state222;
                }
                androidx.datastore.core.InterProcessCoordinator coordinator3 = dataStoreImpl.getCoordinator();
                androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4(dataStoreImpl, version2, null);
                dataStoreImpl$readDataAndUpdateCache$1.L$0 = dataStoreImpl;
                dataStoreImpl$readDataAndUpdateCache$1.L$1 = null;
                dataStoreImpl$readDataAndUpdateCache$1.label = 3;
                obj2 = coordinator3.tryLock(dataStoreImpl$readDataAndUpdateCache$4, dataStoreImpl$readDataAndUpdateCache$1);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pair = (kotlin.Pair) obj2;
                androidx.datastore.core.State<T> state2222 = (androidx.datastore.core.State) pair.component1();
                if (((java.lang.Boolean) pair.component2()).booleanValue()) {
                }
                return state2222;
            }
        }
        dataStoreImpl$readDataAndUpdateCache$1 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1(this, continuation);
        java.lang.Object obj22 = dataStoreImpl$readDataAndUpdateCache$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$readDataAndUpdateCache$1.label;
        if (i != 0) {
        }
        int intValue2 = ((java.lang.Number) obj).intValue();
        z3 = state instanceof androidx.datastore.core.Data;
        if (!z3) {
        }
        if (!z3) {
        }
        if (!z2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object readDataFromFileOrDefault(kotlin.coroutines.Continuation<? super T> continuation) {
        return androidx.datastore.core.StorageConnectionKt.readData(getStorageConnection$datastore_core_release(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object transformAndWrite(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super T> continuation) {
        return getCoordinator().lock(new androidx.datastore.core.DataStoreImpl$transformAndWrite$2(this, coroutineContext, function2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object writeData$datastore_core_release(T t, boolean z, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        androidx.datastore.core.DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        int i;
        kotlin.jvm.internal.Ref.IntRef intRef;
        if (continuation instanceof androidx.datastore.core.DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (androidx.datastore.core.DataStoreImpl$writeData$1) continuation;
            if ((dataStoreImpl$writeData$1.label & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$writeData$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = dataStoreImpl$writeData$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreImpl$writeData$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                    androidx.datastore.core.StorageConnection<T> storageConnection$datastore_core_release = getStorageConnection$datastore_core_release();
                    androidx.datastore.core.DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new androidx.datastore.core.DataStoreImpl$writeData$2(intRef2, this, t, z, null);
                    dataStoreImpl$writeData$1.L$0 = intRef2;
                    dataStoreImpl$writeData$1.label = 1;
                    if (storageConnection$datastore_core_release.writeScope(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    intRef = intRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = (kotlin.jvm.internal.Ref.IntRef) dataStoreImpl$writeData$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
            }
        }
        dataStoreImpl$writeData$1 = new androidx.datastore.core.DataStoreImpl$writeData$1(this, continuation);
        java.lang.Object obj2 = dataStoreImpl$writeData$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$writeData$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|85|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0091, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0092, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object readDataOrHandleCorruption(boolean z, kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>> continuation) {
        androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 dataStoreImpl$readDataOrHandleCorruption$1;
        ?? r2;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Object handleCorruption;
        androidx.datastore.core.CorruptionException corruptionException;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        androidx.datastore.core.CorruptionException corruptionException2;
        androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3;
        kotlin.jvm.internal.Ref.IntRef intRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl2;
        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl3;
        int hashCode;
        java.lang.Object version;
        boolean z2;
        int i;
        java.lang.Object obj;
        if (continuation instanceof androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1) {
            dataStoreImpl$readDataOrHandleCorruption$1 = (androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1) continuation;
            if ((dataStoreImpl$readDataOrHandleCorruption$1.label & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readDataOrHandleCorruption$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj2 = (T) dataStoreImpl$readDataOrHandleCorruption$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = dataStoreImpl$readDataOrHandleCorruption$1.label;
                switch (r2) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj2);
                        try {
                            if (z) {
                                dataStoreImpl$readDataOrHandleCorruption$1.L$0 = this;
                                dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                                dataStoreImpl$readDataOrHandleCorruption$1.label = 1;
                                obj2 = (T) readDataFromFileOrDefault(dataStoreImpl$readDataOrHandleCorruption$1);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dataStoreImpl3 = this;
                                if (obj2 == null) {
                                    try {
                                        hashCode = obj2.hashCode();
                                    } catch (androidx.datastore.core.CorruptionException e) {
                                        e = e;
                                        dataStoreImpl = dataStoreImpl3;
                                        objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                                        androidx.datastore.core.CorruptionHandler<T> corruptionHandler = dataStoreImpl.corruptionHandler;
                                        dataStoreImpl$readDataOrHandleCorruption$1.L$0 = dataStoreImpl;
                                        dataStoreImpl$readDataOrHandleCorruption$1.L$1 = e;
                                        dataStoreImpl$readDataOrHandleCorruption$1.L$2 = objectRef;
                                        dataStoreImpl$readDataOrHandleCorruption$1.L$3 = objectRef;
                                        dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                                        dataStoreImpl$readDataOrHandleCorruption$1.label = 5;
                                        handleCorruption = corruptionHandler.handleCorruption(e, dataStoreImpl$readDataOrHandleCorruption$1);
                                        if (handleCorruption == coroutine_suspended) {
                                        }
                                    }
                                } else {
                                    hashCode = 0;
                                }
                                androidx.datastore.core.InterProcessCoordinator coordinator = dataStoreImpl3.getCoordinator();
                                dataStoreImpl$readDataOrHandleCorruption$1.L$0 = dataStoreImpl3;
                                dataStoreImpl$readDataOrHandleCorruption$1.L$1 = obj2;
                                dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                                dataStoreImpl$readDataOrHandleCorruption$1.I$0 = hashCode;
                                dataStoreImpl$readDataOrHandleCorruption$1.label = 2;
                                version = coordinator.getVersion(dataStoreImpl$readDataOrHandleCorruption$1);
                                if (version != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                int i2 = hashCode;
                                z2 = z;
                                i = i2;
                                obj = obj2;
                                obj2 = (T) version;
                                return new androidx.datastore.core.Data(obj, i, ((java.lang.Number) obj2).intValue());
                            }
                            androidx.datastore.core.InterProcessCoordinator coordinator2 = getCoordinator();
                            dataStoreImpl$readDataOrHandleCorruption$1.L$0 = this;
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 3;
                            obj2 = (T) coordinator2.getVersion(dataStoreImpl$readDataOrHandleCorruption$1);
                            if (obj2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            dataStoreImpl2 = this;
                            int intValue = ((java.lang.Number) obj2).intValue();
                            androidx.datastore.core.InterProcessCoordinator coordinator3 = dataStoreImpl2.getCoordinator();
                            androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2(dataStoreImpl2, intValue, null);
                            dataStoreImpl$readDataOrHandleCorruption$1.L$0 = dataStoreImpl2;
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 4;
                            obj2 = (T) coordinator3.tryLock(dataStoreImpl$readDataOrHandleCorruption$2, dataStoreImpl$readDataOrHandleCorruption$1);
                            if (obj2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return (androidx.datastore.core.Data) obj2;
                        } catch (androidx.datastore.core.CorruptionException e2) {
                            e = e2;
                            dataStoreImpl = this;
                            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                            androidx.datastore.core.CorruptionHandler<T> corruptionHandler2 = dataStoreImpl.corruptionHandler;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$0 = dataStoreImpl;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$1 = e;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$2 = objectRef;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$3 = objectRef;
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 5;
                            handleCorruption = corruptionHandler2.handleCorruption(e, dataStoreImpl$readDataOrHandleCorruption$1);
                            if (handleCorruption == coroutine_suspended) {
                            }
                        }
                        break;
                    case 1:
                        z = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl4 = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        dataStoreImpl3 = dataStoreImpl4;
                        if (obj2 == null) {
                        }
                        androidx.datastore.core.InterProcessCoordinator coordinator4 = dataStoreImpl3.getCoordinator();
                        dataStoreImpl$readDataOrHandleCorruption$1.L$0 = dataStoreImpl3;
                        dataStoreImpl$readDataOrHandleCorruption$1.L$1 = obj2;
                        dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.I$0 = hashCode;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 2;
                        version = coordinator4.getVersion(dataStoreImpl$readDataOrHandleCorruption$1);
                        if (version != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        i = dataStoreImpl$readDataOrHandleCorruption$1.I$0;
                        z2 = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        obj = dataStoreImpl$readDataOrHandleCorruption$1.L$1;
                        dataStoreImpl3 = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            return new androidx.datastore.core.Data(obj, i, ((java.lang.Number) obj2).intValue());
                        } catch (androidx.datastore.core.CorruptionException e3) {
                            e = e3;
                            z = z2;
                            dataStoreImpl = dataStoreImpl3;
                            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                            androidx.datastore.core.CorruptionHandler<T> corruptionHandler22 = dataStoreImpl.corruptionHandler;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$0 = dataStoreImpl;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$1 = e;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$2 = objectRef;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$3 = objectRef;
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 5;
                            handleCorruption = corruptionHandler22.handleCorruption(e, dataStoreImpl$readDataOrHandleCorruption$1);
                            if (handleCorruption == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            corruptionException = e;
                            obj2 = (T) handleCorruption;
                            objectRef2 = objectRef;
                            objectRef2.element = (T) obj2;
                            kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                            try {
                                dataStoreImpl$readDataOrHandleCorruption$3 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3(objectRef, dataStoreImpl, intRef2, null);
                                dataStoreImpl$readDataOrHandleCorruption$1.L$0 = corruptionException;
                                dataStoreImpl$readDataOrHandleCorruption$1.L$1 = objectRef;
                                dataStoreImpl$readDataOrHandleCorruption$1.L$2 = intRef2;
                                dataStoreImpl$readDataOrHandleCorruption$1.L$3 = null;
                                dataStoreImpl$readDataOrHandleCorruption$1.label = 6;
                                if (dataStoreImpl.doWithWriteFileLock(z, dataStoreImpl$readDataOrHandleCorruption$3, dataStoreImpl$readDataOrHandleCorruption$1) != coroutine_suspended) {
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                corruptionException2 = corruptionException;
                                kotlin.ExceptionsKt.addSuppressed(corruptionException2, th);
                                throw corruptionException2;
                            }
                        }
                        break;
                    case 3:
                        z = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        dataStoreImpl2 = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        int intValue2 = ((java.lang.Number) obj2).intValue();
                        androidx.datastore.core.InterProcessCoordinator coordinator32 = dataStoreImpl2.getCoordinator();
                        androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$22 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2(dataStoreImpl2, intValue2, null);
                        dataStoreImpl$readDataOrHandleCorruption$1.L$0 = dataStoreImpl2;
                        dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 4;
                        obj2 = (T) coordinator32.tryLock(dataStoreImpl$readDataOrHandleCorruption$22, dataStoreImpl$readDataOrHandleCorruption$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        return (androidx.datastore.core.Data) obj2;
                    case 4:
                        boolean z3 = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return (androidx.datastore.core.Data) obj2;
                    case 5:
                        z = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.L$3;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.L$2;
                        corruptionException = (androidx.datastore.core.CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.L$1;
                        dataStoreImpl = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        objectRef2 = objectRef4;
                        objectRef = objectRef5;
                        objectRef2.element = (T) obj2;
                        kotlin.jvm.internal.Ref.IntRef intRef22 = new kotlin.jvm.internal.Ref.IntRef();
                        dataStoreImpl$readDataOrHandleCorruption$3 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3(objectRef, dataStoreImpl, intRef22, null);
                        dataStoreImpl$readDataOrHandleCorruption$1.L$0 = corruptionException;
                        dataStoreImpl$readDataOrHandleCorruption$1.L$1 = objectRef;
                        dataStoreImpl$readDataOrHandleCorruption$1.L$2 = intRef22;
                        dataStoreImpl$readDataOrHandleCorruption$1.L$3 = null;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 6;
                        if (dataStoreImpl.doWithWriteFileLock(z, dataStoreImpl$readDataOrHandleCorruption$3, dataStoreImpl$readDataOrHandleCorruption$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        intRef = intRef22;
                        objectRef3 = objectRef;
                        T t = objectRef3.element;
                        T t2 = objectRef3.element;
                        return new androidx.datastore.core.Data(t, t2 != null ? t2.hashCode() : 0, intRef.element);
                    case 6:
                        intRef = (kotlin.jvm.internal.Ref.IntRef) dataStoreImpl$readDataOrHandleCorruption$1.L$2;
                        objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.L$1;
                        corruptionException2 = (androidx.datastore.core.CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            T t3 = objectRef3.element;
                            T t22 = objectRef3.element;
                            return new androidx.datastore.core.Data(t3, t22 != null ? t22.hashCode() : 0, intRef.element);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            kotlin.ExceptionsKt.addSuppressed(corruptionException2, th);
                            throw corruptionException2;
                        }
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dataStoreImpl$readDataOrHandleCorruption$1 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1(this, continuation);
        java.lang.Object obj22 = (T) dataStoreImpl$readDataOrHandleCorruption$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = dataStoreImpl$readDataOrHandleCorruption$1.label;
        switch (r2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> java.lang.Object doWithWriteFileLock(boolean z, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        if (z) {
            return function1.invoke(continuation);
        }
        return getCoordinator().lock(new androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3(function1, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001BD\u0012=\u0010\u0002\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00040\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u000e\u001a\u00020\nH\u0094@¢\u0006\u0002\u0010\u000fRG\u0010\r\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/RunOnce;", "initTasksList", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "(Landroidx/datastore/core/DataStoreImpl;Ljava/util/List;)V", "initTasks", "doRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class InitDataStore extends androidx.datastore.core.RunOnce {
        private java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> initTasks;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public InitDataStore(androidx.datastore.core.DataStoreImpl dataStoreImpl, java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> initTasksList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.this$0 = dataStoreImpl;
            this.initTasks = kotlin.collections.CollectionsKt.toList(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // androidx.datastore.core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected java.lang.Object doRun(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 dataStoreImpl$InitDataStore$doRun$1;
            int i;
            androidx.datastore.core.DataStoreImpl.InitDataStore initDataStore;
            androidx.datastore.core.Data data;
            if (continuation instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) {
                dataStoreImpl$InitDataStore$doRun$1 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) continuation;
                if ((dataStoreImpl$InitDataStore$doRun$1.label & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$InitDataStore$doRun$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = dataStoreImpl$InitDataStore$doRun$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$InitDataStore$doRun$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list = this.initTasks;
                        if (list != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
                            if (!list.isEmpty()) {
                                androidx.datastore.core.InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 dataStoreImpl$InitDataStore$doRun$initData$1 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this, null);
                                dataStoreImpl$InitDataStore$doRun$1.L$0 = this;
                                dataStoreImpl$InitDataStore$doRun$1.label = 2;
                                obj = coordinator.lock(dataStoreImpl$InitDataStore$doRun$initData$1, dataStoreImpl$InitDataStore$doRun$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                initDataStore = this;
                                data = (androidx.datastore.core.Data) obj;
                            }
                        }
                        androidx.datastore.core.DataStoreImpl<T> dataStoreImpl = this.this$0;
                        dataStoreImpl$InitDataStore$doRun$1.L$0 = this;
                        dataStoreImpl$InitDataStore$doRun$1.label = 1;
                        obj = dataStoreImpl.readDataOrHandleCorruption(false, dataStoreImpl$InitDataStore$doRun$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        initDataStore = this;
                        data = (androidx.datastore.core.Data) obj;
                    } else if (i == 1) {
                        initDataStore = (androidx.datastore.core.DataStoreImpl.InitDataStore) dataStoreImpl$InitDataStore$doRun$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        data = (androidx.datastore.core.Data) obj;
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        initDataStore = (androidx.datastore.core.DataStoreImpl.InitDataStore) dataStoreImpl$InitDataStore$doRun$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        data = (androidx.datastore.core.Data) obj;
                    }
                    ((androidx.datastore.core.DataStoreImpl) initDataStore.this$0).inMemoryCache.tryUpdate(data);
                    return kotlin.Unit.INSTANCE;
                }
            }
            dataStoreImpl$InitDataStore$doRun$1 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1(this, continuation);
            java.lang.Object obj2 = dataStoreImpl$InitDataStore$doRun$1.result;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = dataStoreImpl$InitDataStore$doRun$1.label;
            if (i != 0) {
            }
            ((androidx.datastore.core.DataStoreImpl) initDataStore.this$0).inMemoryCache.tryUpdate(data);
            return kotlin.Unit.INSTANCE;
        }
    }
}
