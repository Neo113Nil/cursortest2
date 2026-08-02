package com.payair.db.transactionhistory;

/* loaded from: classes10.dex */
public final class b implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.RoomSQLiteQuery f4379a;
    public final /* synthetic */ com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl b;

    public b(com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl transactionHistoryEntryDao_Impl, androidx.room.RoomSQLiteQuery roomSQLiteQuery) {
        this.b = transactionHistoryEntryDao_Impl;
        this.f4379a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i;
        java.lang.String string;
        int i2;
        java.lang.String string2;
        int i3;
        java.lang.String string3;
        int i4;
        java.lang.String string4;
        int i5;
        java.lang.String string5;
        int i6;
        java.lang.String string6;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.b.f4377a, this.f4379a, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "recordId");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "transactionId");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "merchantName");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "amount");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "currencyCode");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "authorizationStatus");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "transactionType");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "networkTokenReference");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "merchantType");
            int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "merchantCity");
            int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "transactionCountryCode");
            int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "industryCatgCode");
            int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "industryCatgName");
            int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "industryName");
            int i7 = columnIndexOrThrow13;
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                long j = query.getLong(columnIndexOrThrow);
                java.lang.String string7 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                java.lang.String string8 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                if (query.isNull(columnIndexOrThrow4)) {
                    i2 = columnIndexOrThrow3;
                    i = columnIndexOrThrow4;
                    string = null;
                } else {
                    i = columnIndexOrThrow4;
                    string = query.getString(columnIndexOrThrow4);
                    i2 = columnIndexOrThrow3;
                }
                int i8 = columnIndexOrThrow;
                java.math.BigDecimal decimalFromLong = this.b.c.decimalFromLong(query.getLong(columnIndexOrThrow5));
                java.util.Date dateFromTimestamp = this.b.c.dateFromTimestamp(query.isNull(columnIndexOrThrow6) ? null : java.lang.Long.valueOf(query.getLong(columnIndexOrThrow6)));
                java.lang.String string9 = query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7);
                com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus a2 = com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl.a(query.getString(columnIndexOrThrow8));
                com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType b = com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl.b(query.getString(columnIndexOrThrow9));
                java.lang.String string10 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                java.lang.String string11 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                if (query.isNull(columnIndexOrThrow12)) {
                    i3 = i7;
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow12);
                    i3 = i7;
                }
                if (query.isNull(i3)) {
                    i4 = columnIndexOrThrow14;
                    string3 = null;
                } else {
                    string3 = query.getString(i3);
                    i4 = columnIndexOrThrow14;
                }
                if (query.isNull(i4)) {
                    i5 = columnIndexOrThrow15;
                    string4 = null;
                } else {
                    string4 = query.getString(i4);
                    i5 = columnIndexOrThrow15;
                }
                if (query.isNull(i5)) {
                    i7 = i3;
                    i6 = columnIndexOrThrow16;
                    string5 = null;
                } else {
                    i7 = i3;
                    string5 = query.getString(i5);
                    i6 = columnIndexOrThrow16;
                }
                if (query.isNull(i6)) {
                    columnIndexOrThrow16 = i6;
                    string6 = null;
                } else {
                    columnIndexOrThrow16 = i6;
                    string6 = query.getString(i6);
                }
                arrayList.add(new com.payair.db.transactionhistory.TransactionHistoryEntry(j, string7, string8, string, decimalFromLong, dateFromTimestamp, string9, a2, b, string10, string11, string2, string3, string4, string5, string6));
                columnIndexOrThrow14 = i4;
                columnIndexOrThrow15 = i5;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow4 = i;
                columnIndexOrThrow = i8;
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    public final void finalize() {
        this.f4379a.release();
    }
}
