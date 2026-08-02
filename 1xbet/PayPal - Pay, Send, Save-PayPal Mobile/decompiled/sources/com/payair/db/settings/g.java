package com.payair.db.settings;

/* loaded from: classes10.dex */
public final class g implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.RoomSQLiteQuery f4360a;
    public final /* synthetic */ com.payair.db.settings.DatabaseSettingsDao_Impl b;

    public g(com.payair.db.settings.DatabaseSettingsDao_Impl databaseSettingsDao_Impl, androidx.room.RoomSQLiteQuery roomSQLiteQuery) {
        this.b = databaseSettingsDao_Impl;
        this.f4360a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String str = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.b.f4355a, this.f4360a, false, null);
        try {
            if (query.moveToFirst() && !query.isNull(0)) {
                str = query.getString(0);
            }
            return str;
        } finally {
            query.close();
            this.f4360a.release();
        }
    }
}
