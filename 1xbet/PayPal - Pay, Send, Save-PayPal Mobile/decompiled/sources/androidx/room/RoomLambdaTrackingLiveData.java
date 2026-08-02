package androidx.room;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/room/RoomLambdaTrackingLiveData;", "T", "Landroidx/room/RoomTrackingLiveData;", "Landroidx/room/RoomDatabase;", "database", "Landroidx/room/InvalidationLiveDataContainer;", "container", "", "inTransaction", "", "", "tableNames", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteConnection;", "lambdaFunction", "<init>", "(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationLiveDataContainer;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "compute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RoomLambdaTrackingLiveData<T> extends androidx.room.RoomTrackingLiveData<T> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.database.SQLiteConnection, T> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomLambdaTrackingLiveData(androidx.room.RoomDatabase roomDatabase, androidx.room.InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, java.lang.String[] strArr, kotlin.jvm.functions.Function1<? super androidx.database.SQLiteConnection, ? extends T> function1) {
        super(roomDatabase, invalidationLiveDataContainer, z, strArr, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invalidationLiveDataContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @Override // androidx.room.RoomTrackingLiveData
    public final java.lang.Object compute(kotlin.coroutines.Continuation<? super T> continuation) {
        return androidx.room.util.DBUtil.performSuspending(getDatabase(), true, getInTransaction(), this.getHighSpeedVideoFpsRangesFor, continuation);
    }
}
