package com.payair.db.token;

/* loaded from: classes10.dex */
public final class d extends androidx.room.EntityDeletionOrUpdateAdapter {
    public d(androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    @Override // androidx.room.EntityDeletionOrUpdateAdapter
    public final void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, java.lang.Object obj) {
        com.payair.db.token.TokenDetailsEntry tokenDetailsEntry = (com.payair.db.token.TokenDetailsEntry) obj;
        if (tokenDetailsEntry.getNetworkTokenReference() == null) {
            supportSQLiteStatement.bindNull(1);
        } else {
            supportSQLiteStatement.bindString(1, tokenDetailsEntry.getNetworkTokenReference());
        }
    }

    @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "DELETE FROM `TokenDetails` WHERE `networkTokenReference` = ?";
    }
}
