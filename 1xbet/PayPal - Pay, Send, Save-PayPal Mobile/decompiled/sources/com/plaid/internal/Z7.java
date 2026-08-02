package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Z7 implements java.util.concurrent.Callable<java.util.List<com.plaid.internal.h8>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.RoomSQLiteQuery f5989a;
    public final /* synthetic */ com.plaid.internal.g8 b;

    public Z7(com.plaid.internal.g8 g8Var, androidx.room.RoomSQLiteQuery roomSQLiteQuery) {
        this.b = g8Var;
        this.f5989a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final java.util.List<com.plaid.internal.h8> call() {
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.b.f6422a, this.f5989a, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "workflow_id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "analytics_model");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.plaid.internal.h8(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getBlob(columnIndexOrThrow3)));
            }
            return arrayList;
        } finally {
            query.close();
            this.f5989a.release();
        }
    }
}
