package com.payair.db.transactionhistory;

/* loaded from: classes10.dex */
public final class TransactionHistoryEntryDao_Impl implements com.payair.db.transactionhistory.TransactionHistoryEntryDao {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.room.RoomDatabase f4377a;
    public final com.payair.db.transactionhistory.g b;
    public final com.payair.db.Converters c = new com.payair.db.Converters();
    public final com.payair.db.transactionhistory.h d;
    public final com.payair.db.transactionhistory.i e;
    public final com.payair.db.transactionhistory.j f;
    public final com.payair.db.transactionhistory.k g;

    public TransactionHistoryEntryDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        this.f4377a = roomDatabase;
        this.b = new com.payair.db.transactionhistory.g(this, roomDatabase);
        this.d = new com.payair.db.transactionhistory.h(roomDatabase);
        this.e = new com.payair.db.transactionhistory.i(roomDatabase);
        this.f = new com.payair.db.transactionhistory.j(roomDatabase);
        this.g = new com.payair.db.transactionhistory.k(roomDatabase);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus a(java.lang.String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1015619173:
                if (str.equals("AUTHORIZED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 518126018:
                if (str.equals("REVERSED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1350822958:
                if (str.equals("DECLINED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1574760332:
                if (str.equals("CLEARED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.AUTHORIZED;
        }
        if (c == 1) {
            return com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.REVERSED;
        }
        if (c == 2) {
            return com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.DECLINED;
        }
        if (c == 3) {
            return com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.CLEARED;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType b(java.lang.String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1881484424:
                if (str.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1769016063:
                if (str.equals("PURCHASE")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1564332615:
                if (str.equals("ATM_DEPOSIT")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -912227312:
                if (str.equals("ATM_TRANSFER")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -379334758:
                if (str.equals("ATM_WITHDRAWAL")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -68698650:
                if (str.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2089988781:
                if (str.equals("CASH_DISBURSEMENT")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.REFUND;
            case 1:
                return com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.PURCHASE;
            case 2:
                return com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.ATM_DEPOSIT;
            case 3:
                return com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.ATM_TRANSFER;
            case 4:
                return com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.ATM_WITHDRAWAL;
            case 5:
                return com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.PAYMENT;
            case 6:
                return com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.CASH_DISBURSEMENT;
            default:
                throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.EMPTY_LIST;
    }

    @Override // com.payair.db.transactionhistory.TransactionHistoryEntryDao
    public final java.lang.Object delete(com.payair.db.transactionhistory.TransactionHistoryEntry transactionHistoryEntry, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.CoroutinesRoom.execute(this.f4377a, true, new com.payair.db.transactionhistory.m(this, transactionHistoryEntry), continuation);
    }

    @Override // com.payair.db.transactionhistory.TransactionHistoryEntryDao
    public final void deleteAll() {
        this.f4377a.assertNotSuspendingTransaction();
        androidx.database.db.SupportSQLiteStatement acquire = this.f.acquire();
        try {
            this.f4377a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.f4377a.setTransactionSuccessful();
            } finally {
                this.f4377a.endTransaction();
            }
        } finally {
            this.f.release(acquire);
        }
    }

    @Override // com.payair.db.transactionhistory.TransactionHistoryEntryDao
    public final java.lang.Object deleteExpired(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.CoroutinesRoom.execute(this.f4377a, true, new com.payair.db.transactionhistory.o(this), continuation);
    }

    @Override // com.payair.db.transactionhistory.TransactionHistoryEntryDao
    public final java.lang.Object getAll(java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> continuation) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM transactionHistory WHERE (? IS NULL OR date >= ?) AND (? IS NULL OR date <= ?) ORDER BY date DESC", 4);
        java.lang.Long dateToTimestamp = this.c.dateToTimestamp(date);
        if (dateToTimestamp == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindLong(1, dateToTimestamp.longValue());
        }
        java.lang.Long dateToTimestamp2 = this.c.dateToTimestamp(date);
        if (dateToTimestamp2 == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindLong(2, dateToTimestamp2.longValue());
        }
        java.lang.Long dateToTimestamp3 = this.c.dateToTimestamp(date2);
        if (dateToTimestamp3 == null) {
            acquire.bindNull(3);
        } else {
            acquire.bindLong(3, dateToTimestamp3.longValue());
        }
        java.lang.Long dateToTimestamp4 = this.c.dateToTimestamp(date2);
        if (dateToTimestamp4 == null) {
            acquire.bindNull(4);
        } else {
            acquire.bindLong(4, dateToTimestamp4.longValue());
        }
        return androidx.room.CoroutinesRoom.execute(this.f4377a, false, androidx.room.util.DBUtil.createCancellationSignal(), new com.payair.db.transactionhistory.a(this, acquire), continuation);
    }

    @Override // com.payair.db.transactionhistory.TransactionHistoryEntryDao
    public final java.lang.Object getEntriesForToken(java.lang.String str, java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> continuation) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM transactionHistory WHERE networkTokenReference = ? AND (? IS NULL OR date >= ?) AND (? IS NULL OR date <= ?) ORDER BY date DESC", 5);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        java.lang.Long dateToTimestamp = this.c.dateToTimestamp(date);
        if (dateToTimestamp == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindLong(2, dateToTimestamp.longValue());
        }
        java.lang.Long dateToTimestamp2 = this.c.dateToTimestamp(date);
        if (dateToTimestamp2 == null) {
            acquire.bindNull(3);
        } else {
            acquire.bindLong(3, dateToTimestamp2.longValue());
        }
        java.lang.Long dateToTimestamp3 = this.c.dateToTimestamp(date2);
        if (dateToTimestamp3 == null) {
            acquire.bindNull(4);
        } else {
            acquire.bindLong(4, dateToTimestamp3.longValue());
        }
        java.lang.Long dateToTimestamp4 = this.c.dateToTimestamp(date2);
        if (dateToTimestamp4 == null) {
            acquire.bindNull(5);
        } else {
            acquire.bindLong(5, dateToTimestamp4.longValue());
        }
        return androidx.room.CoroutinesRoom.execute(this.f4377a, false, androidx.room.util.DBUtil.createCancellationSignal(), new com.payair.db.transactionhistory.c(this, acquire), continuation);
    }

    @Override // com.payair.db.transactionhistory.TransactionHistoryEntryDao
    public final java.lang.Object insert(com.payair.db.transactionhistory.TransactionHistoryEntry[] transactionHistoryEntryArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.CoroutinesRoom.execute(this.f4377a, true, new com.payair.db.transactionhistory.l(this, transactionHistoryEntryArr), continuation);
    }

    @Override // com.payair.db.transactionhistory.TransactionHistoryEntryDao
    public final java.lang.Object latestUpdate(kotlin.coroutines.Continuation<? super java.util.Date> continuation) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT MAX(date) FROM transactionHistory", 0);
        return androidx.room.CoroutinesRoom.execute(this.f4377a, false, androidx.room.util.DBUtil.createCancellationSignal(), new com.payair.db.transactionhistory.e(this, acquire), continuation);
    }

    @Override // com.payair.db.transactionhistory.TransactionHistoryEntryDao
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> observeAll(java.util.Date date, java.util.Date date2) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM transactionHistory WHERE (? IS NULL OR date >= ?) AND (? IS NULL OR date <= ?) ORDER BY date DESC", 4);
        java.lang.Long dateToTimestamp = this.c.dateToTimestamp(date);
        if (dateToTimestamp == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindLong(1, dateToTimestamp.longValue());
        }
        java.lang.Long dateToTimestamp2 = this.c.dateToTimestamp(date);
        if (dateToTimestamp2 == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindLong(2, dateToTimestamp2.longValue());
        }
        java.lang.Long dateToTimestamp3 = this.c.dateToTimestamp(date2);
        if (dateToTimestamp3 == null) {
            acquire.bindNull(3);
        } else {
            acquire.bindLong(3, dateToTimestamp3.longValue());
        }
        java.lang.Long dateToTimestamp4 = this.c.dateToTimestamp(date2);
        if (dateToTimestamp4 == null) {
            acquire.bindNull(4);
        } else {
            acquire.bindLong(4, dateToTimestamp4.longValue());
        }
        return androidx.room.CoroutinesRoom.createFlow(this.f4377a, false, new java.lang.String[]{"transactionHistory"}, new com.payair.db.transactionhistory.b(this, acquire));
    }

    @Override // com.payair.db.transactionhistory.TransactionHistoryEntryDao
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> observeEntriesForToken(java.lang.String str, java.util.Date date, java.util.Date date2) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM transactionHistory WHERE networkTokenReference = ? AND (? IS NULL OR date >= ?) AND (? IS NULL OR date <= ?) ORDER BY date DESC", 5);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        java.lang.Long dateToTimestamp = this.c.dateToTimestamp(date);
        if (dateToTimestamp == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindLong(2, dateToTimestamp.longValue());
        }
        java.lang.Long dateToTimestamp2 = this.c.dateToTimestamp(date);
        if (dateToTimestamp2 == null) {
            acquire.bindNull(3);
        } else {
            acquire.bindLong(3, dateToTimestamp2.longValue());
        }
        java.lang.Long dateToTimestamp3 = this.c.dateToTimestamp(date2);
        if (dateToTimestamp3 == null) {
            acquire.bindNull(4);
        } else {
            acquire.bindLong(4, dateToTimestamp3.longValue());
        }
        java.lang.Long dateToTimestamp4 = this.c.dateToTimestamp(date2);
        if (dateToTimestamp4 == null) {
            acquire.bindNull(5);
        } else {
            acquire.bindLong(5, dateToTimestamp4.longValue());
        }
        return androidx.room.CoroutinesRoom.createFlow(this.f4377a, false, new java.lang.String[]{"transactionHistory"}, new com.payair.db.transactionhistory.d(this, acquire));
    }

    @Override // com.payair.db.transactionhistory.TransactionHistoryEntryDao
    public final java.lang.Object delete(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.CoroutinesRoom.execute(this.f4377a, true, new com.payair.db.transactionhistory.n(this, str), continuation);
    }
}
