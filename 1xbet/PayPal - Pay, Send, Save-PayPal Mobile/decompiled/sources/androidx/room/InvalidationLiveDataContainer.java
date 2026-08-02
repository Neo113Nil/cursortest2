package androidx.room;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00062\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00062\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011¢\u0006\u0004\b\u000f\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u001d8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/room/InvalidationLiveDataContainer;", "", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "T", "", "", "tableNames", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callableFunction", "Landroidx/lifecycle/LiveData;", "create", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteConnection;", "lambdaFunction", "([Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "liveData", "", "onActive", "(Landroidx/lifecycle/LiveData;)V", "onInactive", "Camera2StreamConfigurationMap", "Landroidx/room/RoomDatabase;", "getHighSpeedVideoFpsRangesFor", "", "liveDataSet", "Ljava/util/Set;", "getLiveDataSet$room_runtime", "()Ljava/util/Set;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InvalidationLiveDataContainer {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase getHighSpeedVideoFpsRangesFor;
    private final java.util.Set<androidx.view.LiveData<?>> liveDataSet;

    public InvalidationLiveDataContainer(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighSpeedVideoFpsRangesFor = roomDatabase;
        java.util.Set<androidx.view.LiveData<?>> newSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSetFromMap, "");
        this.liveDataSet = newSetFromMap;
    }

    public final java.util.Set<androidx.view.LiveData<?>> getLiveDataSet$room_runtime() {
        return this.liveDataSet;
    }

    public final <T> androidx.view.LiveData<T> create(java.lang.String[] tableNames, boolean inTransaction, java.util.concurrent.Callable<T> callableFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableNames, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableFunction, "");
        return new androidx.room.RoomCallableTrackingLiveData(this.getHighSpeedVideoFpsRangesFor, this, inTransaction, tableNames, callableFunction);
    }

    public final <T> androidx.view.LiveData<T> create(java.lang.String[] tableNames, boolean inTransaction, kotlin.jvm.functions.Function1<? super androidx.database.SQLiteConnection, ? extends T> lambdaFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableNames, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lambdaFunction, "");
        return new androidx.room.RoomLambdaTrackingLiveData(this.getHighSpeedVideoFpsRangesFor, this, inTransaction, tableNames, lambdaFunction);
    }

    public final void onActive(androidx.view.LiveData<?> liveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        this.liveDataSet.add(liveData);
    }

    public final void onInactive(androidx.view.LiveData<?> liveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        this.liveDataSet.remove(liveData);
    }
}
