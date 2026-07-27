package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Q4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final String f6453a = "sessions";

    /* renamed from: b, reason: collision with root package name */
    public final int f6454b = 200;

    /* renamed from: c, reason: collision with root package name */
    public final String f6455c = "id";

    /* renamed from: d, reason: collision with root package name */
    public final String f6456d = "start_time";

    /* renamed from: e, reason: collision with root package name */
    public final String f6457e = "report_request_parameters";
    public final String f = "server_time_offset";

    /* renamed from: g, reason: collision with root package name */
    public final String f6458g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f6459h = "obtained_before_first_sync";

    /* renamed from: i, reason: collision with root package name */
    public final B7 f6460i = new B7(null, 1, 0 == true ? 1 : 0);

    public final A7 a(Cursor cursor) {
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6455c)));
            int i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6458g));
            EnumC0372al enumC0372al = EnumC0372al.FOREGROUND;
            boolean z3 = true;
            if (i3 != 0) {
                enumC0372al = EnumC0372al.BACKGROUND;
                if (i3 != 1) {
                    enumC0372al = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f6457e));
            Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6456d)));
            Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f6459h)) != 1) {
                z3 = false;
            }
            return new A7(valueOf, enumC0372al, string, new C1003z7(valueOf2, valueOf3, Boolean.valueOf(z3)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x005c, code lost:
    
        if (r12 != null) goto L30;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        Long l3;
        String str;
        Long l4;
        ArrayList arrayList = new ArrayList();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable unused) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            cursor = sQLiteDatabase2.query(this.f6453a, null, null, null, null, null, null, String.valueOf(this.f6454b));
            while (cursor.moveToNext()) {
                try {
                    A7 a3 = a(cursor);
                    if (a3 != null && (l3 = a3.f5674a) != null && l3.longValue() >= 0 && a3.f5675b != null && (str = a3.f5676c) != null && str.length() != 0 && (l4 = a3.f5677d.f8660a) != null && l4.longValue() > 0) {
                        arrayList.add(this.f6460i.fromModel(a3));
                    }
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f6453a);
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                sQLiteDatabase2.insertOrThrow("sessions", null, (ContentValues) it.next());
            } catch (Throwable unused4) {
            }
        }
    }
}
