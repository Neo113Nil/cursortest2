package com.plaid.internal;

/* loaded from: classes16.dex */
public final class O3 implements java.util.concurrent.Callable<java.lang.String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.RoomSQLiteQuery f5869a;
    public final /* synthetic */ com.plaid.internal.P3 b;

    public O3(com.plaid.internal.P3 p3, androidx.room.RoomSQLiteQuery roomSQLiteQuery) {
        this.b = p3;
        this.f5869a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.String call() {
        java.lang.String str = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.b.f5878a, this.f5869a, false, null);
        try {
            if (query.moveToFirst() && !query.isNull(0)) {
                str = query.getString(0);
            }
            return str;
        } finally {
            query.close();
            this.f5869a.release();
        }
    }
}
