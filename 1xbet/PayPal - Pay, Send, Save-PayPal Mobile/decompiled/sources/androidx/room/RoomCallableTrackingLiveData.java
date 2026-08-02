package androidx.room;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/room/RoomCallableTrackingLiveData;", "T", "Landroidx/room/RoomTrackingLiveData;", "Landroidx/room/RoomDatabase;", "database", "Landroidx/room/InvalidationLiveDataContainer;", "container", "", "inTransaction", "", "", "tableNames", "Ljava/util/concurrent/Callable;", "callableFunction", "<init>", "(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationLiveDataContainer;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)V", "compute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/Callable;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RoomCallableTrackingLiveData<T> extends androidx.room.RoomTrackingLiveData<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.Callable<T> getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomCallableTrackingLiveData(androidx.room.RoomDatabase roomDatabase, androidx.room.InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, java.lang.String[] strArr, java.util.concurrent.Callable<T> callable) {
        super(roomDatabase, invalidationLiveDataContainer, z, strArr, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invalidationLiveDataContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callable, "");
        this.getHighSpeedVideoFpsRanges = callable;
    }

    @Override // androidx.room.RoomTrackingLiveData
    public final java.lang.Object compute(kotlin.coroutines.Continuation<? super T> continuation) {
        return this.getHighSpeedVideoFpsRanges.call();
    }
}
