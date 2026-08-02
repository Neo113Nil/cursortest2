package com.payair.db.transactionhistory;

/* loaded from: classes10.dex */
public final class h extends androidx.room.EntityDeletionOrUpdateAdapter {
    public h(androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    @Override // androidx.room.EntityDeletionOrUpdateAdapter
    public final void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, java.lang.Object obj) {
        supportSQLiteStatement.bindLong(1, ((com.payair.db.transactionhistory.TransactionHistoryEntry) obj).getId());
    }

    @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "DELETE FROM `transactionHistory` WHERE `id` = ?";
    }
}
