package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class J4 extends io.appmetrica.analytics.coreapi.internal.db.DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4478a = "sessions";

    /* renamed from: b, reason: collision with root package name */
    public final int f4479b = 200;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f4480c = "id";

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f4481d = "start_time";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f4482e = "report_request_parameters";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f4483f = "server_time_offset";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f4484g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f4485h = "obtained_before_first_sync";

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0712t7 f4486i = new io.appmetrica.analytics.impl.C0712t7(null, 1, 0 == true ? 1 : 0);

    public final io.appmetrica.analytics.impl.C0686s7 a(android.database.Cursor cursor) {
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4480c)));
            int i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4484g));
            io.appmetrica.analytics.impl.Vk vk = io.appmetrica.analytics.impl.Vk.FOREGROUND;
            boolean z2 = true;
            if (i2 != 0) {
                vk = io.appmetrica.analytics.impl.Vk.BACKGROUND;
                if (i2 != 1) {
                    vk = null;
                }
            }
            java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f4482e));
            java.lang.Long valueOf2 = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4481d)));
            java.lang.Long valueOf3 = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4483f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f4485h)) != 1) {
                z2 = false;
            }
            return new io.appmetrica.analytics.impl.C0686s7(valueOf, vk, string, new io.appmetrica.analytics.impl.C0660r7(valueOf2, valueOf3, java.lang.Boolean.valueOf(z2)));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x005b, code lost:
    
        if (r2 == null) goto L28;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runScript(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.database.Cursor cursor;
        java.lang.Long l2;
        java.lang.String str;
        java.lang.Long l3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            cursor = sQLiteDatabase.query(this.f4478a, null, null, null, null, null, null, java.lang.String.valueOf(this.f4479b));
            while (cursor.moveToNext()) {
                try {
                    io.appmetrica.analytics.impl.C0686s7 a2 = a(cursor);
                    if (a2 != null && (l2 = a2.f6792a) != null && l2.longValue() >= 0 && a2.f6793b != null && (str = a2.f6794c) != null && str.length() != 0 && (l3 = a2.f6795d.f6721a) != null && l3.longValue() > 0) {
                        arrayList.add(this.f4486i.fromModel(a2));
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        } catch (java.lang.Throwable unused2) {
            cursor = null;
        }
        cursor.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f4478a);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                sQLiteDatabase.insertOrThrow("sessions", null, (android.content.ContentValues) it.next());
            } catch (java.lang.Throwable unused3) {
            }
        }
    }
}
