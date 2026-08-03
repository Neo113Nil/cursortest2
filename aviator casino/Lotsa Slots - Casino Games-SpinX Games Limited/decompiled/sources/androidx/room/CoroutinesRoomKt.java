package androidx.room;

/* compiled from: CoroutinesRoom.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0007\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"transactionDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroidx/room/RoomDatabase;", "getTransactionDispatcher", "(Landroidx/room/RoomDatabase;)Lkotlinx/coroutines/CoroutineDispatcher;", "getQueryDispatcher", "room-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CoroutinesRoomKt {
    public static final kotlinx.coroutines.CoroutineDispatcher getQueryDispatcher(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
        java.util.Map<java.lang.String, java.lang.Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        java.lang.Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = kotlinx.coroutines.ExecutorsKt.from(roomDatabase.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (kotlinx.coroutines.CoroutineDispatcher) obj;
    }

    public static final kotlinx.coroutines.CoroutineDispatcher getTransactionDispatcher(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
        java.util.Map<java.lang.String, java.lang.Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        java.lang.Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = kotlinx.coroutines.ExecutorsKt.from(roomDatabase.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (kotlinx.coroutines.CoroutineDispatcher) obj;
    }
}
