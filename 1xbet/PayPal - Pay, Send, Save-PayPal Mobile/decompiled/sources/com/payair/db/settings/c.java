package com.payair.db.settings;

/* loaded from: classes10.dex */
public final class c extends androidx.room.SharedSQLiteStatement {
    public c(androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "DELETE FROM databaseSettings";
    }
}
