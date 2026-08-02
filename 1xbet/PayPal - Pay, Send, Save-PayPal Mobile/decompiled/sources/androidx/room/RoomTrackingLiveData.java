package androidx.room;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000H¦@¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00038\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00078\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010)\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010(\u0082\u0001\u0002*+"}, d2 = {"Landroidx/room/RoomTrackingLiveData;", "T", "Landroidx/lifecycle/LiveData;", "Landroidx/room/RoomDatabase;", "p0", "Landroidx/room/InvalidationLiveDataContainer;", "p1", "", "p2", "", "", "p3", "<init>", "(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationLiveDataContainer;Z[Ljava/lang/String;)V", "", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compute", "onActive", "()V", "onInactive", "database", "Landroidx/room/RoomDatabase;", "getDatabase", "()Landroidx/room/RoomDatabase;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/room/InvalidationLiveDataContainer;", "inTransaction", "Z", "getInTransaction", "()Z", "Landroidx/room/InvalidationTracker$Observer;", "Landroidx/room/InvalidationTracker$Observer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getInputFormats", "Landroidx/room/RoomCallableTrackingLiveData;", "Landroidx/room/RoomLambdaTrackingLiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RoomTrackingLiveData<T> extends androidx.view.LiveData<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes;
    private final androidx.room.RoomDatabase database;
    private final androidx.room.InvalidationLiveDataContainer getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges;
    private final androidx.room.InvalidationTracker.Observer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap;
    private final boolean inTransaction;

    public abstract java.lang.Object compute(kotlin.coroutines.Continuation<? super T> continuation);

    protected final androidx.room.RoomDatabase getDatabase() {
        return this.database;
    }

    protected final boolean getInTransaction() {
        return this.inTransaction;
    }

    private RoomTrackingLiveData(androidx.room.RoomDatabase roomDatabase, androidx.room.InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, java.lang.String[] strArr) {
        kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext;
        this.database = roomDatabase;
        this.getHighResolutionOutputSizeshNQ4ISI = invalidationLiveDataContainer;
        this.inTransaction = z;
        this.getHighSpeedVideoFpsRangesFor = new androidx.room.RoomTrackingLiveData$observer$1(strArr, this);
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean(false);
        if (!roomDatabase.inCompatibilityMode()) {
            emptyCoroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        } else if (z) {
            emptyCoroutineContext = roomDatabase.getTransactionContext$room_runtime();
        } else {
            emptyCoroutineContext = roomDatabase.getQueryContext();
        }
        this.getInputFormats = emptyCoroutineContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[Catch: all -> 0x002d, Exception -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x0029, B:15:0x0061), top: B:10:0x0029, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:11:0x0029, B:13:0x0059, B:15:0x0061, B:24:0x007a, B:36:0x006e, B:37:0x0077), top: B:10:0x0029, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0057 -> B:12:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0089 -> B:23:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.room.RoomTrackingLiveData$refresh$1 roomTrackingLiveData$refresh$1;
        int i;
        if (continuation instanceof androidx.room.RoomTrackingLiveData$refresh$1) {
            roomTrackingLiveData$refresh$1 = (androidx.room.RoomTrackingLiveData$refresh$1) continuation;
            if ((roomTrackingLiveData$refresh$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                roomTrackingLiveData$refresh$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = roomTrackingLiveData$refresh$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = roomTrackingLiveData$refresh$1.Camera2StreamConfigurationMap;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = roomTrackingLiveData$refresh$1.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            while (this.getHighSpeedVideoFpsRanges.compareAndSet(true, false)) {
                                roomTrackingLiveData$refresh$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                roomTrackingLiveData$refresh$1.Camera2StreamConfigurationMap = 1;
                                obj = compute(roomTrackingLiveData$refresh$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                postValue(obj);
                            }
                            if (i2 != 0 || !this.getHighSpeedVideoFpsRanges.get()) {
                                return kotlin.Unit.INSTANCE;
                            }
                            if (!this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                                obj = null;
                                i2 = 0;
                                while (this.getHighSpeedVideoFpsRanges.compareAndSet(true, false)) {
                                }
                                if (i2 != 0) {
                                }
                                if (i2 != 0) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            i2 = 0;
                            if (i2 != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Exception e) {
                            throw new java.lang.RuntimeException("Exception while computing database live data.", e);
                        }
                    } finally {
                        this.getHighSpeedVideoSizes.set(false);
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.Camera2StreamConfigurationMap.compareAndSet(false, true)) {
                    this.database.getInvalidationTracker().addWeakObserver(this.getHighSpeedVideoFpsRangesFor);
                }
                if (!this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                }
            }
        }
        roomTrackingLiveData$refresh$1 = new androidx.room.RoomTrackingLiveData$refresh$1(this, continuation);
        java.lang.Object obj2 = roomTrackingLiveData$refresh$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = roomTrackingLiveData$refresh$1.Camera2StreamConfigurationMap;
        if (i == 0) {
        }
    }

    @Override // androidx.view.LiveData
    public void onActive() {
        super.onActive();
        this.getHighResolutionOutputSizeshNQ4ISI.onActive(this);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.database.getCoroutineScope(), this.getInputFormats, null, new androidx.room.RoomTrackingLiveData$onActive$1(this, null), 2, null);
    }

    @Override // androidx.view.LiveData
    public void onInactive() {
        super.onInactive();
        this.getHighResolutionOutputSizeshNQ4ISI.onInactive(this);
    }

    public static final /* synthetic */ void access$invalidated(androidx.room.RoomTrackingLiveData roomTrackingLiveData) {
        boolean hasActiveObservers = roomTrackingLiveData.hasActiveObservers();
        if (roomTrackingLiveData.getHighSpeedVideoFpsRanges.compareAndSet(false, true) && hasActiveObservers) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(roomTrackingLiveData.database.getCoroutineScope(), roomTrackingLiveData.getInputFormats, null, new androidx.room.RoomTrackingLiveData$invalidated$1(roomTrackingLiveData, null), 2, null);
        }
    }

    public /* synthetic */ RoomTrackingLiveData(androidx.room.RoomDatabase roomDatabase, androidx.room.InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, java.lang.String[] strArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(roomDatabase, invalidationLiveDataContainer, z, strArr);
    }
}
