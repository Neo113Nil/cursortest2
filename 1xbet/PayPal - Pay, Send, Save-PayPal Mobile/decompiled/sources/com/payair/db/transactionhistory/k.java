package com.payair.db.transactionhistory;

/* loaded from: classes10.dex */
public final class k extends androidx.room.SharedSQLiteStatement {
    public k(androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "DELETE FROM transactionHistory WHERE date < DATE('-1 month')";
    }
}
