package com.payair.db.transactionhistory;

/* loaded from: classes10.dex */
public final class e implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.RoomSQLiteQuery f4382a;
    public final /* synthetic */ com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl b;

    public e(com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl transactionHistoryEntryDao_Impl, androidx.room.RoomSQLiteQuery roomSQLiteQuery) {
        this.b = transactionHistoryEntryDao_Impl;
        this.f4382a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.util.Date date = null;
        java.lang.Long valueOf = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.b.f4377a, this.f4382a, false, null);
        try {
            if (query.moveToFirst()) {
                if (!query.isNull(0)) {
                    valueOf = java.lang.Long.valueOf(query.getLong(0));
                }
                date = this.b.c.dateFromTimestamp(valueOf);
            }
            return date;
        } finally {
            query.close();
            this.f4382a.release();
        }
    }
}
