package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 N*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002ONBf\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00125\b\u0002\u0010\f\u001a/\u0012+\u0012)\b\u0001\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\b\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00060\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0016\u0010\u0014J9\u0010\u0018\u001a\u00028\u00002'\u0010\u0017\u001a#\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0015\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0082@¢\u0006\u0004\b\u0015\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u001d\u0010\u0014J \u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001fH\u0080@¢\u0006\u0004\b\"\u0010#J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u001b\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b\u0016\u0010%JI\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0001\u0010&2\u0006\u0010\u001b\u001a\u00020\u001f2\u001c\u0010(\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0'H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0015\u0010)R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00102\u001a\b\u0012\u0004\u0012\u00028\u0000018\u0017X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010\u0015\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u00107R\u0016\u0010\u001d\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00108R\u0018\u0010;\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000<8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010=R\u001e\u0010*\u001a\f0?R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010@R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000B0A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000B8AX\u0080\u0084\u0002¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001b\u0010.\u001a\u00020H8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\b,\u0010IR \u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010L"}, d2 = {"Landroidx/datastore/core/DataStoreImpl;", "T", "Landroidx/datastore/core/CurrentDataProviderStore;", "Landroidx/datastore/core/Storage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "Landroidx/datastore/core/CorruptionHandler;", "corruptionHandler", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Landroidx/datastore/core/Storage;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;)V", "currentData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/Message$Update;", "p0", "(Landroidx/datastore/core/Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "newData", "", "updateCache", "", "writeData$datastore_core", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/Data;", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "p1", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOutputFormats", "Landroidx/datastore/core/Storage;", "getHighSpeedVideoSizes", "Landroidx/datastore/core/CorruptionHandler;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/Flow;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", com.visa.cbp.getEncExpo.warmup, "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizesFor", "Landroidx/datastore/core/DataStoreInMemoryCache;", "Landroidx/datastore/core/DataStoreInMemoryCache;", "getInputFormats", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Lkotlin/Lazy;", "Landroidx/datastore/core/StorageConnection;", "getInputSizeshNQ4ISI", "Lkotlin/Lazy;", "getStorageConnection$datastore_core", "()Landroidx/datastore/core/StorageConnection;", "storageConnection", "Landroidx/datastore/core/InterProcessCoordinator;", "()Landroidx/datastore/core/InterProcessCoordinator;", "Landroidx/datastore/core/SimpleActor;", "getOutputMinFrameDurationlomOqCM", "Landroidx/datastore/core/SimpleActor;", "getOutputSizes", "Companion", "InitDataStore"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DataStoreImpl<T> implements androidx.content.core.CurrentDataProviderStore<T> {
    public static final java.lang.String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputMinFrameDuration;
    private final kotlinx.coroutines.flow.Flow<T> data;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoSizesFor;
    private final androidx.content.core.CorruptionHandler<T> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.content.core.DataStoreInMemoryCache<T> getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.content.core.DataStoreImpl<T>.InitDataStore getOutputFormats;
    private final kotlin.Lazy<androidx.content.core.StorageConnection<T>> getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.content.core.Storage<T> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.content.core.SimpleActor<androidx.datastore.core.Message.Update<T>> getOutputSizes;

    public DataStoreImpl(androidx.content.core.Storage<T> storage, java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.content.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list, androidx.content.core.CorruptionHandler<T> corruptionHandler, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(corruptionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRangesFor = storage;
        this.getHighSpeedVideoSizes = corruptionHandler;
        this.getHighSpeedVideoFpsRanges = coroutineScope;
        this.data = kotlinx.coroutines.flow.FlowKt.flow(new androidx.content.core.DataStoreImpl$data$1(this, null));
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.getInputFormats = new androidx.content.core.DataStoreInMemoryCache<>();
        this.getOutputFormats = new androidx.datastore.core.DataStoreImpl.InitDataStore(this, list);
        this.getInputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.datastore.core.DataStoreImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.content.core.StorageConnection createConnection;
                createConnection = androidx.content.core.DataStoreImpl.this.getHighSpeedVideoFpsRangesFor.createConnection();
                return createConnection;
            }
        });
        this.getOutputMinFrameDuration = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.datastore.core.DataStoreImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.content.core.InterProcessCoordinator coordinator;
                coordinator = androidx.content.core.DataStoreImpl.this.getStorageConnection$datastore_core().getCoordinator();
                return coordinator;
            }
        });
        this.getOutputSizes = new androidx.content.core.SimpleActor<>(coroutineScope, new kotlin.jvm.functions.Function1() { // from class: androidx.datastore.core.DataStoreImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.content.core.DataStoreImpl.$r8$lambda$G5ElBZMU4r_BzNYCG9q0_dZ2E1g(androidx.content.core.DataStoreImpl.this, (java.lang.Throwable) obj);
            }
        }, new kotlin.jvm.functions.Function2() { // from class: androidx.datastore.core.DataStoreImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.content.core.DataStoreImpl.m9145$r8$lambda$hyalUUIpmxPFmKmfd6JxCrsEh8((androidx.datastore.core.Message.Update) obj, (java.lang.Throwable) obj2);
            }
        }, new androidx.content.core.DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r9 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r9 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0062, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$readDataAndUpdateCache(androidx.content.core.DataStoreImpl dataStoreImpl, boolean z, kotlin.coroutines.Continuation continuation) {
        androidx.content.core.DataStoreImpl$readDataAndUpdateCache$1 dataStoreImpl$readDataAndUpdateCache$1;
        int i;
        androidx.content.core.State<T> currentState;
        boolean z2;
        kotlin.Pair pair;
        if (continuation instanceof androidx.content.core.DataStoreImpl$readDataAndUpdateCache$1) {
            dataStoreImpl$readDataAndUpdateCache$1 = (androidx.content.core.DataStoreImpl$readDataAndUpdateCache$1) continuation;
            if ((dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    currentState = dataStoreImpl.getInputFormats.getCurrentState();
                    if (currentState instanceof androidx.content.core.UnInitialized) {
                        throw new java.lang.IllegalStateException(BUG_MESSAGE.toString());
                    }
                    androidx.content.core.InterProcessCoordinator highSpeedVideoSizes = dataStoreImpl.getHighSpeedVideoSizes();
                    dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoSizes = currentState;
                    dataStoreImpl$readDataAndUpdateCache$1.Camera2StreamConfigurationMap = z;
                    dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoFpsRanges = 1;
                    obj = highSpeedVideoSizes.getVersion(dataStoreImpl$readDataAndUpdateCache$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            pair = (kotlin.Pair) obj;
                            androidx.content.core.State<T> state = (androidx.content.core.State) pair.component1();
                            if (((java.lang.Boolean) pair.component2()).booleanValue()) {
                            }
                            return state;
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        pair = (kotlin.Pair) obj;
                        androidx.content.core.State<T> state2 = (androidx.content.core.State) pair.component1();
                        if (((java.lang.Boolean) pair.component2()).booleanValue()) {
                            dataStoreImpl.getInputFormats.tryUpdate(state2);
                        }
                        return state2;
                    }
                    z = dataStoreImpl$readDataAndUpdateCache$1.Camera2StreamConfigurationMap;
                    currentState = (androidx.content.core.State) dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                int intValue = ((java.lang.Number) obj).intValue();
                z2 = currentState instanceof androidx.content.core.Data;
                int version = !z2 ? ((androidx.content.core.Data) currentState).getVersion() : -1;
                if (!z2 && intValue == version) {
                    return currentState;
                }
                if (!z) {
                    androidx.content.core.InterProcessCoordinator highSpeedVideoSizes2 = dataStoreImpl.getHighSpeedVideoSizes();
                    androidx.content.core.DataStoreImpl$readDataAndUpdateCache$3 dataStoreImpl$readDataAndUpdateCache$3 = new androidx.content.core.DataStoreImpl$readDataAndUpdateCache$3(dataStoreImpl, null);
                    dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoSizes = null;
                    dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoFpsRanges = 2;
                    obj = highSpeedVideoSizes2.lock(dataStoreImpl$readDataAndUpdateCache$3, dataStoreImpl$readDataAndUpdateCache$1);
                } else {
                    androidx.content.core.InterProcessCoordinator highSpeedVideoSizes3 = dataStoreImpl.getHighSpeedVideoSizes();
                    androidx.content.core.DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new androidx.content.core.DataStoreImpl$readDataAndUpdateCache$4(dataStoreImpl, version, null);
                    dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoSizes = null;
                    dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoFpsRanges = 3;
                    obj = highSpeedVideoSizes3.tryLock(dataStoreImpl$readDataAndUpdateCache$4, dataStoreImpl$readDataAndUpdateCache$1);
                }
                return coroutine_suspended;
            }
        }
        dataStoreImpl$readDataAndUpdateCache$1 = new androidx.content.core.DataStoreImpl$readDataAndUpdateCache$1(dataStoreImpl, continuation);
        java.lang.Object obj2 = dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$readDataAndUpdateCache$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        int intValue2 = ((java.lang.Number) obj2).intValue();
        z2 = currentState instanceof androidx.content.core.Data;
        if (!z2) {
        }
        if (!z2) {
        }
        if (!z) {
        }
        return coroutine_suspended2;
    }

    public /* synthetic */ DataStoreImpl(androidx.content.core.Storage storage, java.util.List list, androidx.content.core.handlers.NoOpCorruptionHandler noOpCorruptionHandler, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(storage, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? new androidx.content.core.handlers.NoOpCorruptionHandler() : noOpCorruptionHandler, (i & 8) != 0 ? kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(androidx.content.core.Actual_jvmKt.ioDispatcher().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null))) : coroutineScope);
    }

    @Override // androidx.content.core.DataStore
    public final kotlinx.coroutines.flow.Flow<T> getData() {
        return this.data;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.content.core.CurrentDataProviderStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object currentData(kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.content.core.DataStoreImpl$currentData$1 dataStoreImpl$currentData$1;
        int i;
        androidx.content.core.State state;
        if (continuation instanceof androidx.content.core.DataStoreImpl$currentData$1) {
            dataStoreImpl$currentData$1 = (androidx.content.core.DataStoreImpl$currentData$1) continuation;
            if ((dataStoreImpl$currentData$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$currentData$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = dataStoreImpl$currentData$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreImpl$currentData$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    dataStoreImpl$currentData$1.getHighSpeedVideoFpsRanges = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRanges.getCoroutineContext(), new androidx.content.core.DataStoreImpl$readState$2(this, false, null), dataStoreImpl$currentData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                state = (androidx.content.core.State) obj;
                if (!(state instanceof androidx.content.core.Data)) {
                    return ((androidx.content.core.Data) state).getValue();
                }
                if (state instanceof androidx.content.core.UnInitialized) {
                    throw new java.lang.IllegalStateException(BUG_MESSAGE.toString());
                }
                if (state instanceof androidx.content.core.ReadException) {
                    throw ((androidx.content.core.ReadException) state).getReadException();
                }
                if (state instanceof androidx.content.core.Final) {
                    throw ((androidx.content.core.Final) state).getFinalException();
                }
                if (state instanceof androidx.content.core.NoValueDataState) {
                    throw new java.lang.IllegalStateException(BUG_MESSAGE.toString());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        dataStoreImpl$currentData$1 = new androidx.content.core.DataStoreImpl$currentData$1(this, continuation);
        java.lang.Object obj2 = dataStoreImpl$currentData$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$currentData$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        state = (androidx.content.core.State) obj2;
        if (!(state instanceof androidx.content.core.Data)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x0048, B:13:0x004f, B:14:0x0063), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.content.core.DataStoreImpl$incrementCollector$1 dataStoreImpl$incrementCollector$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        int i2;
        kotlinx.coroutines.Job launch$default;
        try {
            if (continuation instanceof androidx.content.core.DataStoreImpl$incrementCollector$1) {
                dataStoreImpl$incrementCollector$1 = (androidx.content.core.DataStoreImpl$incrementCollector$1) continuation;
                if ((dataStoreImpl$incrementCollector$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$incrementCollector$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = dataStoreImpl$incrementCollector$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$incrementCollector$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.Camera2StreamConfigurationMap;
                        dataStoreImpl$incrementCollector$1.Camera2StreamConfigurationMap = mutex2;
                        dataStoreImpl$incrementCollector$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex2.lock(null, dataStoreImpl$incrementCollector$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) dataStoreImpl$incrementCollector$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    i2 = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                    this.getHighResolutionOutputSizeshNQ4ISI = i2;
                    if (i2 == 1) {
                        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new androidx.content.core.DataStoreImpl$incrementCollector$2$1(this, null), 3, null);
                        this.getHighSpeedVideoSizesFor = launch$default;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            i2 = this.getHighResolutionOutputSizeshNQ4ISI + 1;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            if (i2 == 1) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        dataStoreImpl$incrementCollector$1 = new androidx.content.core.DataStoreImpl$incrementCollector$1(this, continuation);
        java.lang.Object obj2 = dataStoreImpl$incrementCollector$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$incrementCollector$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:11:0x0048, B:13:0x004f, B:15:0x0053, B:16:0x0056, B:17:0x0058), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.content.core.DataStoreImpl$decrementCollector$1 dataStoreImpl$decrementCollector$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        int i2;
        try {
            if (continuation instanceof androidx.content.core.DataStoreImpl$decrementCollector$1) {
                dataStoreImpl$decrementCollector$1 = (androidx.content.core.DataStoreImpl$decrementCollector$1) continuation;
                if ((dataStoreImpl$decrementCollector$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$decrementCollector$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = dataStoreImpl$decrementCollector$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$decrementCollector$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.Camera2StreamConfigurationMap;
                        dataStoreImpl$decrementCollector$1.getHighSpeedVideoFpsRangesFor = mutex2;
                        dataStoreImpl$decrementCollector$1.getHighSpeedVideoSizes = 1;
                        if (mutex2.lock(null, dataStoreImpl$decrementCollector$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) dataStoreImpl$decrementCollector$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    i2 = this.getHighResolutionOutputSizeshNQ4ISI - 1;
                    this.getHighResolutionOutputSizeshNQ4ISI = i2;
                    if (i2 == 0) {
                        kotlinx.coroutines.Job job = this.getHighSpeedVideoSizesFor;
                        if (job != null) {
                            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                        }
                        this.getHighSpeedVideoSizesFor = null;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            i2 = this.getHighResolutionOutputSizeshNQ4ISI - 1;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            if (i2 == 0) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        dataStoreImpl$decrementCollector$1 = new androidx.content.core.DataStoreImpl$decrementCollector$1(this, continuation);
        java.lang.Object obj2 = dataStoreImpl$decrementCollector$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$decrementCollector$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
    }

    @Override // androidx.content.core.DataStore
    public final java.lang.Object updateData(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.content.core.UpdatingDataContextElement updatingDataContextElement = (androidx.content.core.UpdatingDataContextElement) continuation.getGetInputFormats().get(androidx.datastore.core.UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return kotlinx.coroutines.BuildersKt.withContext(new androidx.content.core.UpdatingDataContextElement(updatingDataContextElement, this), new androidx.content.core.DataStoreImpl$updateData$2(this, function2, null), continuation);
    }

    public final androidx.content.core.StorageConnection<T> getStorageConnection$datastore_core() {
        return this.getInputSizeshNQ4ISI.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.content.core.InterProcessCoordinator getHighSpeedVideoSizes() {
        return (androidx.content.core.InterProcessCoordinator) this.getOutputMinFrameDuration.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(androidx.datastore.core.Message.Update<T> update, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.content.core.DataStoreImpl$handleUpdate$1 dataStoreImpl$handleUpdate$1;
        int i;
        java.lang.Throwable th;
        kotlinx.coroutines.CompletableDeferred<T> completableDeferred;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof androidx.content.core.DataStoreImpl$handleUpdate$1) {
            dataStoreImpl$handleUpdate$1 = (androidx.content.core.DataStoreImpl$handleUpdate$1) continuation;
            if ((dataStoreImpl$handleUpdate$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$handleUpdate$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = dataStoreImpl$handleUpdate$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreImpl$handleUpdate$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CompletableDeferred<T> ack = update.getAck();
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        androidx.content.core.DataStoreImpl<T> dataStoreImpl = this;
                        kotlin.coroutines.CoroutineContext plus = update.getCallerContext().plus(dataStoreImpl$handleUpdate$1.getGetInputFormats());
                        androidx.content.core.DataStoreImpl$handleUpdate$2$1 dataStoreImpl$handleUpdate$2$1 = new androidx.content.core.DataStoreImpl$handleUpdate$2$1(this, update, null);
                        dataStoreImpl$handleUpdate$1.Camera2StreamConfigurationMap = ack;
                        dataStoreImpl$handleUpdate$1.getHighSpeedVideoSizes = 1;
                        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(plus, dataStoreImpl$handleUpdate$2$1, dataStoreImpl$handleUpdate$1);
                        if (withContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = withContext;
                        completableDeferred = ack;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        completableDeferred = ack;
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                        kotlinx.coroutines.CompletableDeferredKt.completeWith(completableDeferred, m23436constructorimpl);
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred = (kotlinx.coroutines.CompletableDeferred) dataStoreImpl$handleUpdate$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                        kotlinx.coroutines.CompletableDeferredKt.completeWith(completableDeferred, m23436constructorimpl);
                        return kotlin.Unit.INSTANCE;
                    }
                }
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(obj);
                kotlinx.coroutines.CompletableDeferredKt.completeWith(completableDeferred, m23436constructorimpl);
                return kotlin.Unit.INSTANCE;
            }
        }
        dataStoreImpl$handleUpdate$1 = new androidx.content.core.DataStoreImpl$handleUpdate$1(this, continuation);
        java.lang.Object obj2 = dataStoreImpl$handleUpdate$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$handleUpdate$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        m23436constructorimpl = kotlin.Result.m23436constructorimpl(obj2);
        kotlinx.coroutines.CompletableDeferredKt.completeWith(completableDeferred, m23436constructorimpl);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r2.runIfNeeded(r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.content.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1;
        int i;
        int intValue;
        int i2;
        java.lang.Throwable th;
        try {
            if (continuation instanceof androidx.content.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) {
                dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 = (androidx.content.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) continuation;
                if ((dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.content.core.InterProcessCoordinator highSpeedVideoSizes = getHighSpeedVideoSizes();
                        dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.getHighSpeedVideoFpsRanges = 1;
                        obj = highSpeedVideoSizes.getVersion(dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i2 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.Camera2StreamConfigurationMap;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                this.getInputFormats.tryUpdate(new androidx.content.core.ReadException(th, i2));
                                throw th;
                            }
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    intValue = ((java.lang.Number) obj).intValue();
                    androidx.content.core.DataStoreImpl<T>.InitDataStore initDataStore = this.getOutputFormats;
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.Camera2StreamConfigurationMap = intValue;
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.getHighSpeedVideoFpsRanges = 2;
                }
            }
            androidx.content.core.DataStoreImpl<T>.InitDataStore initDataStore2 = this.getOutputFormats;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.Camera2StreamConfigurationMap = intValue;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.getHighSpeedVideoFpsRanges = 2;
        } catch (java.lang.Throwable th3) {
            i2 = intValue;
            th = th3;
            this.getInputFormats.tryUpdate(new androidx.content.core.ReadException(th, i2));
            throw th;
        }
        dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 = new androidx.content.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1(this, continuation);
        java.lang.Object obj2 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        intValue = ((java.lang.Number) obj2).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object writeData$datastore_core(T t, boolean z, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        androidx.content.core.DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        int i;
        kotlin.jvm.internal.Ref.IntRef intRef;
        if (continuation instanceof androidx.content.core.DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (androidx.content.core.DataStoreImpl$writeData$1) continuation;
            if ((dataStoreImpl$writeData$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$writeData$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = dataStoreImpl$writeData$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreImpl$writeData$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                    androidx.content.core.StorageConnection<T> storageConnection$datastore_core = getStorageConnection$datastore_core();
                    androidx.content.core.DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new androidx.content.core.DataStoreImpl$writeData$2(intRef2, this, t, z, null);
                    dataStoreImpl$writeData$1.Camera2StreamConfigurationMap = intRef2;
                    dataStoreImpl$writeData$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (storageConnection$datastore_core.writeScope(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    intRef = intRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = (kotlin.jvm.internal.Ref.IntRef) dataStoreImpl$writeData$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
            }
        }
        dataStoreImpl$writeData$1 = new androidx.content.core.DataStoreImpl$writeData$1(this, continuation);
        java.lang.Object obj2 = dataStoreImpl$writeData$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$writeData$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|68|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r11 != r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x008b, code lost:
    
        if (r11 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        if (r11 != r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0076, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e8, code lost:
    
        r2 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(boolean z, kotlin.coroutines.Continuation<? super androidx.content.core.Data<T>> continuation) {
        androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$1 dataStoreImpl$readDataOrHandleCorruption$1;
        boolean z2;
        androidx.content.core.CorruptionException corruptionException;
        boolean z3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        androidx.content.core.CorruptionException corruptionException2;
        androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3;
        kotlin.jvm.internal.Ref.IntRef intRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        int i;
        java.lang.Object obj;
        if (continuation instanceof androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$1) {
            dataStoreImpl$readDataOrHandleCorruption$1 = (androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$1) continuation;
            if ((dataStoreImpl$readDataOrHandleCorruption$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readDataOrHandleCorruption$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj2 = (T) dataStoreImpl$readDataOrHandleCorruption$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (dataStoreImpl$readDataOrHandleCorruption$1.getInputSizeshNQ4ISI) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj2);
                        if (z) {
                            dataStoreImpl$readDataOrHandleCorruption$1.Camera2StreamConfigurationMap = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.getInputSizeshNQ4ISI = 1;
                            obj2 = (T) androidx.content.core.StorageConnectionKt.readData(getStorageConnection$datastore_core(), dataStoreImpl$readDataOrHandleCorruption$1);
                            break;
                        } else {
                            androidx.content.core.InterProcessCoordinator highSpeedVideoSizes = getHighSpeedVideoSizes();
                            dataStoreImpl$readDataOrHandleCorruption$1.Camera2StreamConfigurationMap = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.getInputSizeshNQ4ISI = 3;
                            obj2 = (T) highSpeedVideoSizes.getVersion(dataStoreImpl$readDataOrHandleCorruption$1);
                            break;
                        }
                        return coroutine_suspended;
                    case 1:
                        z = dataStoreImpl$readDataOrHandleCorruption$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        int hashCode = obj2 != null ? obj2.hashCode() : 0;
                        androidx.content.core.InterProcessCoordinator highSpeedVideoSizes2 = getHighSpeedVideoSizes();
                        dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoFpsRanges = obj2;
                        dataStoreImpl$readDataOrHandleCorruption$1.Camera2StreamConfigurationMap = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoSizes = hashCode;
                        dataStoreImpl$readDataOrHandleCorruption$1.getInputSizeshNQ4ISI = 2;
                        java.lang.Object version = highSpeedVideoSizes2.getVersion(dataStoreImpl$readDataOrHandleCorruption$1);
                        if (version != coroutine_suspended) {
                            int i2 = hashCode;
                            z2 = z;
                            i = i2;
                            obj = obj2;
                            obj2 = (T) version;
                            return new androidx.content.core.Data(obj, i, ((java.lang.Number) obj2).intValue());
                        }
                        return coroutine_suspended;
                    case 2:
                        i = dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoSizes;
                        z2 = dataStoreImpl$readDataOrHandleCorruption$1.Camera2StreamConfigurationMap;
                        obj = dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoFpsRanges;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            return new androidx.content.core.Data(obj, i, ((java.lang.Number) obj2).intValue());
                        } catch (androidx.content.core.CorruptionException e) {
                            androidx.content.core.CorruptionException e2 = e;
                            kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                            androidx.content.core.CorruptionHandler<T> corruptionHandler = this.getHighSpeedVideoSizes;
                            dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoFpsRanges = e2;
                            dataStoreImpl$readDataOrHandleCorruption$1.getHighResolutionOutputSizeshNQ4ISI = objectRef4;
                            dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoFpsRangesFor = objectRef4;
                            dataStoreImpl$readDataOrHandleCorruption$1.Camera2StreamConfigurationMap = z2;
                            dataStoreImpl$readDataOrHandleCorruption$1.getInputSizeshNQ4ISI = 5;
                            java.lang.Object handleCorruption = corruptionHandler.handleCorruption(e2, dataStoreImpl$readDataOrHandleCorruption$1);
                            if (handleCorruption != coroutine_suspended) {
                                corruptionException = e2;
                                z3 = z2;
                                objectRef = objectRef4;
                                obj2 = (T) handleCorruption;
                                objectRef2 = objectRef;
                                objectRef.element = (T) obj2;
                                kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                                try {
                                    dataStoreImpl$readDataOrHandleCorruption$3 = new androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$3(objectRef2, this, intRef2, null);
                                    dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoFpsRanges = corruptionException;
                                    dataStoreImpl$readDataOrHandleCorruption$1.getHighResolutionOutputSizeshNQ4ISI = objectRef2;
                                    dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoFpsRangesFor = intRef2;
                                    dataStoreImpl$readDataOrHandleCorruption$1.getInputSizeshNQ4ISI = 6;
                                    if (Camera2StreamConfigurationMap(z3, dataStoreImpl$readDataOrHandleCorruption$3, dataStoreImpl$readDataOrHandleCorruption$1) != coroutine_suspended) {
                                    }
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    corruptionException2 = corruptionException;
                                    kotlin.ExceptionsKt.addSuppressed(corruptionException2, th);
                                    throw corruptionException2;
                                }
                            }
                            return coroutine_suspended;
                        }
                    case 3:
                        z = dataStoreImpl$readDataOrHandleCorruption$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        int intValue = ((java.lang.Number) obj2).intValue();
                        androidx.content.core.InterProcessCoordinator highSpeedVideoSizes3 = getHighSpeedVideoSizes();
                        androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$2(this, intValue, null);
                        dataStoreImpl$readDataOrHandleCorruption$1.Camera2StreamConfigurationMap = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.getInputSizeshNQ4ISI = 4;
                        obj2 = (T) highSpeedVideoSizes3.tryLock(dataStoreImpl$readDataOrHandleCorruption$2, dataStoreImpl$readDataOrHandleCorruption$1);
                        break;
                    case 4:
                        boolean z4 = dataStoreImpl$readDataOrHandleCorruption$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return (androidx.content.core.Data) obj2;
                    case 5:
                        z3 = dataStoreImpl$readDataOrHandleCorruption$1.Camera2StreamConfigurationMap;
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoFpsRangesFor;
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.getHighResolutionOutputSizeshNQ4ISI;
                        corruptionException = (androidx.content.core.CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        objectRef.element = (T) obj2;
                        kotlin.jvm.internal.Ref.IntRef intRef22 = new kotlin.jvm.internal.Ref.IntRef();
                        dataStoreImpl$readDataOrHandleCorruption$3 = new androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$3(objectRef2, this, intRef22, null);
                        dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoFpsRanges = corruptionException;
                        dataStoreImpl$readDataOrHandleCorruption$1.getHighResolutionOutputSizeshNQ4ISI = objectRef2;
                        dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoFpsRangesFor = intRef22;
                        dataStoreImpl$readDataOrHandleCorruption$1.getInputSizeshNQ4ISI = 6;
                        if (Camera2StreamConfigurationMap(z3, dataStoreImpl$readDataOrHandleCorruption$3, dataStoreImpl$readDataOrHandleCorruption$1) != coroutine_suspended) {
                            intRef = intRef22;
                            objectRef3 = objectRef2;
                            T t = objectRef3.element;
                            T t2 = objectRef3.element;
                            return new androidx.content.core.Data(t, t2 != null ? t2.hashCode() : 0, intRef.element);
                        }
                        return coroutine_suspended;
                    case 6:
                        intRef = (kotlin.jvm.internal.Ref.IntRef) dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoFpsRangesFor;
                        objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.getHighResolutionOutputSizeshNQ4ISI;
                        corruptionException2 = (androidx.content.core.CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.getHighSpeedVideoFpsRanges;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            T t3 = objectRef3.element;
                            T t22 = objectRef3.element;
                            return new androidx.content.core.Data(t3, t22 != null ? t22.hashCode() : 0, intRef.element);
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
        dataStoreImpl$readDataOrHandleCorruption$1 = new androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$1(this, continuation);
        java.lang.Object obj22 = (T) dataStoreImpl$readDataOrHandleCorruption$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (dataStoreImpl$readDataOrHandleCorruption$1.getInputSizeshNQ4ISI) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> java.lang.Object Camera2StreamConfigurationMap(boolean z, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        if (z) {
            return function1.invoke(continuation);
        }
        return getHighSpeedVideoSizes().lock(new androidx.content.core.DataStoreImpl$doWithWriteFileLock$2(function1, null), continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B<\u00123\u0010\t\u001a/\u0012+\u0012)\b\u0001\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007H\u0094@¢\u0006\u0004\b\f\u0010\rRE\u0010\u0010\u001a1\u0012+\u0012)\b\u0001\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/RunOnce;", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "p0", "<init>", "(Landroidx/datastore/core/DataStoreImpl;Ljava/util/List;)V", "doRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class InitDataStore extends androidx.content.core.RunOnce {
        final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.content.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> getHighSpeedVideoFpsRanges;

        public InitDataStore(androidx.content.core.DataStoreImpl dataStoreImpl, java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.content.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.getHighSpeedVideoFpsRanges = dataStoreImpl;
            this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.toList(list);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        
            if (r7 != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        
            if (r7 == r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // androidx.content.core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected final java.lang.Object doRun(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.content.core.DataStoreImpl$InitDataStore$doRun$1 dataStoreImpl$InitDataStore$doRun$1;
            int i;
            androidx.content.core.Data data;
            if (continuation instanceof androidx.content.core.DataStoreImpl$InitDataStore$doRun$1) {
                dataStoreImpl$InitDataStore$doRun$1 = (androidx.content.core.DataStoreImpl$InitDataStore$doRun$1) continuation;
                if ((dataStoreImpl$InitDataStore$doRun$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$InitDataStore$doRun$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = dataStoreImpl$InitDataStore$doRun$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$InitDataStore$doRun$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.content.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list = this.getHighSpeedVideoFpsRanges;
                        if (list != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
                            if (!list.isEmpty()) {
                                androidx.content.core.InterProcessCoordinator highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
                                androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1 dataStoreImpl$InitDataStore$doRun$initData$1 = new androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1(this.getHighSpeedVideoFpsRanges, this, null);
                                dataStoreImpl$InitDataStore$doRun$1.getHighSpeedVideoFpsRangesFor = 2;
                                obj = highSpeedVideoSizes.lock(dataStoreImpl$InitDataStore$doRun$initData$1, dataStoreImpl$InitDataStore$doRun$1);
                            }
                        }
                        androidx.content.core.DataStoreImpl<T> dataStoreImpl = this.getHighSpeedVideoFpsRanges;
                        dataStoreImpl$InitDataStore$doRun$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = dataStoreImpl.getHighSpeedVideoFpsRangesFor(false, dataStoreImpl$InitDataStore$doRun$1);
                    } else if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        data = (androidx.content.core.Data) obj;
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        data = (androidx.content.core.Data) obj;
                    }
                    ((androidx.content.core.DataStoreImpl) this.getHighSpeedVideoFpsRanges).getInputFormats.tryUpdate(data);
                    return kotlin.Unit.INSTANCE;
                }
            }
            dataStoreImpl$InitDataStore$doRun$1 = new androidx.content.core.DataStoreImpl$InitDataStore$doRun$1(this, continuation);
            java.lang.Object obj2 = dataStoreImpl$InitDataStore$doRun$1.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = dataStoreImpl$InitDataStore$doRun$1.getHighSpeedVideoFpsRangesFor;
            if (i != 0) {
            }
            ((androidx.content.core.DataStoreImpl) this.getHighSpeedVideoFpsRanges).getInputFormats.tryUpdate(data);
            return kotlin.Unit.INSTANCE;
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G5ElBZMU4r_BzNYCG9q0_dZ2E1g(androidx.content.core.DataStoreImpl dataStoreImpl, java.lang.Throwable th) {
        if (th != null) {
            dataStoreImpl.getInputFormats.tryUpdate(new androidx.content.core.Final(th));
        }
        if (dataStoreImpl.getInputSizeshNQ4ISI.isInitialized()) {
            dataStoreImpl.getStorageConnection$datastore_core().close();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hya-lUUIpmxPFmKmfd6JxCrsEh8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9145$r8$lambda$hyalUUIpmxPFmKmfd6JxCrsEh8(androidx.datastore.core.Message.Update update, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(update, "");
        kotlinx.coroutines.CompletableDeferred<T> ack = update.getAck();
        if (th == null) {
            th = new java.util.concurrent.CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        ack.completeExceptionally(th);
        return kotlin.Unit.INSTANCE;
    }
}
