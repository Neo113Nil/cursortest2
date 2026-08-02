package com.plaid.internal;

/* loaded from: classes16.dex */
public final class G4 implements java.util.concurrent.Callable<com.plaid.internal.I4> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.RoomSQLiteQuery f5794a;
    public final /* synthetic */ com.plaid.internal.H4 b;

    public G4(com.plaid.internal.H4 h4, androidx.room.RoomSQLiteQuery roomSQLiteQuery) {
        this.b = h4;
        this.f5794a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final com.plaid.internal.I4 call() {
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.b.f5799a, this.f5794a, false, null);
        try {
            return query.moveToFirst() ? new com.plaid.internal.I4(query.getString(androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "workflow_id")), query.getString(androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id")), query.getBlob(androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "model"))) : null;
        } finally {
            query.close();
            this.f5794a.release();
        }
    }
}
