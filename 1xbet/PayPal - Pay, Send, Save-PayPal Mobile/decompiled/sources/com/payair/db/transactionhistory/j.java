package com.payair.db.transactionhistory;

/* loaded from: classes10.dex */
public final class j extends androidx.room.SharedSQLiteStatement {
    public j(androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "DELETE FROM transactionHistory";
    }
}
