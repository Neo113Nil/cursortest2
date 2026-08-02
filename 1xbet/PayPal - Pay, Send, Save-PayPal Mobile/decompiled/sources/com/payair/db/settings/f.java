package com.payair.db.settings;

/* loaded from: classes10.dex */
public final class f implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.RoomSQLiteQuery f4359a;
    public final /* synthetic */ com.payair.db.settings.DatabaseSettingsDao_Impl b;

    public f(com.payair.db.settings.DatabaseSettingsDao_Impl databaseSettingsDao_Impl, androidx.room.RoomSQLiteQuery roomSQLiteQuery) {
        this.b = databaseSettingsDao_Impl;
        this.f4359a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.b.f4355a, this.f4359a, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "key");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.payair.db.settings.DatabaseSettingsEntry(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2)));
            }
            return arrayList;
        } finally {
            query.close();
            this.f4359a.release();
        }
    }
}
