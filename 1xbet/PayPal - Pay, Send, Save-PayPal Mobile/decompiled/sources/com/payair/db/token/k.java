package com.payair.db.token;

/* loaded from: classes10.dex */
public final class k implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.RoomSQLiteQuery f4371a;
    public final /* synthetic */ com.payair.db.token.TokenDetailsDao_Impl b;

    public k(com.payair.db.token.TokenDetailsDao_Impl tokenDetailsDao_Impl, androidx.room.RoomSQLiteQuery roomSQLiteQuery) {
        this.b = tokenDetailsDao_Impl;
        this.f4371a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.b.f4362a, this.f4371a, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "networkTokenReference");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo);
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "tokenInfo");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "productConfig");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "scheme");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.payair.db.TokenDetailsDaoInternal.ASSET_FILE_NAME_PREFIX);
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "assetPath");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.payair.db.token.TokenDetailsEntry(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), com.payair.db.token.TokenDetailsDao_Impl.a(query.getString(columnIndexOrThrow2)), this.b.c.jsonToTokenInfo(query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3)), this.b.c.jsonToProductConfig(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4)), this.b.c.toCardScheme(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5)), this.b.c.jsonToAsset(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    public final void finalize() {
        this.f4371a.release();
    }
}
