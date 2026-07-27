package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Q4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final String f7312a = "sessions";

    /* renamed from: b, reason: collision with root package name */
    public final int f7313b = 200;

    /* renamed from: c, reason: collision with root package name */
    public final String f7314c = OutcomeConstants.OUTCOME_ID;

    /* renamed from: d, reason: collision with root package name */
    public final String f7315d = "start_time";

    /* renamed from: e, reason: collision with root package name */
    public final String f7316e = "report_request_parameters";

    /* renamed from: f, reason: collision with root package name */
    public final String f7317f = "server_time_offset";

    /* renamed from: g, reason: collision with root package name */
    public final String f7318g = WebViewManager.EVENT_TYPE_KEY;

    /* renamed from: h, reason: collision with root package name */
    public final String f7319h = "obtained_before_first_sync";

    /* renamed from: i, reason: collision with root package name */
    public final B7 f7320i = new B7(null, 1, 0 == true ? 1 : 0);

    public final A7 a(Cursor cursor) {
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7314c)));
            int i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7318g));
            EnumC0521al enumC0521al = EnumC0521al.FOREGROUND;
            boolean z = true;
            if (i2 != 0) {
                enumC0521al = EnumC0521al.BACKGROUND;
                if (i2 != 1) {
                    enumC0521al = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f7316e));
            Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7315d)));
            Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7317f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f7319h)) != 1) {
                z = false;
            }
            return new A7(valueOf, enumC0521al, string, new C1152z7(valueOf2, valueOf3, Boolean.valueOf(z)));
        } catch (Throwable unused) {
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
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        Long l2;
        String str;
        Long l6;
        ArrayList arrayList = new ArrayList();
        try {
            cursor = sQLiteDatabase.query(this.f7312a, null, null, null, null, null, null, String.valueOf(this.f7313b));
            while (cursor.moveToNext()) {
                try {
                    A7 a6 = a(cursor);
                    if (a6 != null && (l2 = a6.f6504a) != null && l2.longValue() >= 0 && a6.f6505b != null && (str = a6.f6506c) != null && str.length() != 0 && (l6 = a6.f6507d.f9620a) != null && l6.longValue() > 0) {
                        arrayList.add(this.f7320i.fromModel(a6));
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        cursor.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f7312a);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                sQLiteDatabase.insertOrThrow("sessions", null, (ContentValues) it.next());
            } catch (Throwable unused3) {
            }
        }
    }
}
