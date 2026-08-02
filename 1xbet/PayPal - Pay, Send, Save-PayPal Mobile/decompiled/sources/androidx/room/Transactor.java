package androidx.room;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0010JM\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032-\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/room/Transactor;", "Landroidx/room/PooledConnection;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/room/Transactor$SQLiteTransactionType;", "type", "Lkotlin/Function2;", "Landroidx/room/TransactionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "withTransaction", "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "inTransaction", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SQLiteTransactionType"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Transactor extends androidx.room.PooledConnection {
    java.lang.Object inTransaction(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    <R> java.lang.Object withTransaction(androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType, kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/room/Transactor$SQLiteTransactionType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFERRED", "IMMEDIATE", "EXCLUSIVE"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SQLiteTransactionType {
        private static final /* synthetic */ androidx.room.Transactor.SQLiteTransactionType[] Camera2StreamConfigurationMap;
        public static final androidx.room.Transactor.SQLiteTransactionType DEFERRED;
        public static final androidx.room.Transactor.SQLiteTransactionType EXCLUSIVE;
        public static final androidx.room.Transactor.SQLiteTransactionType IMMEDIATE;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

        private SQLiteTransactionType(java.lang.String str, int i) {
        }

        static {
            androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType = new androidx.room.Transactor.SQLiteTransactionType("DEFERRED", 0);
            DEFERRED = sQLiteTransactionType;
            androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType2 = new androidx.room.Transactor.SQLiteTransactionType("IMMEDIATE", 1);
            IMMEDIATE = sQLiteTransactionType2;
            androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType3 = new androidx.room.Transactor.SQLiteTransactionType("EXCLUSIVE", 2);
            EXCLUSIVE = sQLiteTransactionType3;
            androidx.room.Transactor.SQLiteTransactionType[] sQLiteTransactionTypeArr = {sQLiteTransactionType, sQLiteTransactionType2, sQLiteTransactionType3};
            Camera2StreamConfigurationMap = sQLiteTransactionTypeArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(sQLiteTransactionTypeArr);
        }

        public static androidx.room.Transactor.SQLiteTransactionType[] values() {
            return (androidx.room.Transactor.SQLiteTransactionType[]) Camera2StreamConfigurationMap.clone();
        }

        public static androidx.room.Transactor.SQLiteTransactionType valueOf(java.lang.String str) {
            return (androidx.room.Transactor.SQLiteTransactionType) java.lang.Enum.valueOf(androidx.room.Transactor.SQLiteTransactionType.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.room.Transactor.SQLiteTransactionType> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }
}
