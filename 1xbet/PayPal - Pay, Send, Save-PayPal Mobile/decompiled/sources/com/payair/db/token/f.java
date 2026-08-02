package com.payair.db.token;

/* loaded from: classes10.dex */
public final class f extends androidx.room.SharedSQLiteStatement {
    public f(androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "DELETE FROM TokenDetails";
    }
}
