package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/room/RoomTrackingLiveData$observer$1;", "Landroidx/room/InvalidationTracker$Observer;", "", "", "tables", "", "onInvalidated", "(Ljava/util/Set;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RoomTrackingLiveData$observer$1 extends androidx.room.InvalidationTracker.Observer {
    final /* synthetic */ androidx.room.RoomTrackingLiveData<T> getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomTrackingLiveData$observer$1(java.lang.String[] strArr, androidx.room.RoomTrackingLiveData<T> roomTrackingLiveData) {
        super(strArr);
        this.getHighSpeedVideoFpsRanges = roomTrackingLiveData;
    }

    @Override // androidx.room.InvalidationTracker.Observer
    public final void onInvalidated(java.util.Set<java.lang.String> tables) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "");
        androidx.arch.core.executor.ArchTaskExecutor archTaskExecutor = androidx.arch.core.executor.ArchTaskExecutor.getInstance();
        final androidx.room.RoomTrackingLiveData<T> roomTrackingLiveData = this.getHighSpeedVideoFpsRanges;
        archTaskExecutor.executeOnMainThread(new java.lang.Runnable() { // from class: androidx.room.RoomTrackingLiveData$observer$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.RoomTrackingLiveData.access$invalidated(androidx.room.RoomTrackingLiveData.this);
            }
        });
    }
}
