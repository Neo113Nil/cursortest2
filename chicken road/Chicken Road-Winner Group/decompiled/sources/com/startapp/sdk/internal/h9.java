package com.startapp.sdk.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class h9 extends l6 {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f3828d = {"rowid", "timestamp", "sdkVersion", "category", "appActivity", "value", "details", "detailsJson", "dParam", "service", "tag"};

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f3829c;

    public h9(Context context) {
        super(context);
        this.f3829c = new LinkedList();
    }

    public static boolean a(d9 d9Var, j9 j9Var, SQLiteDatabase sQLiteDatabase, HashMap hashMap, long j3) {
        if (j9Var.f3909a.size() > 0 && !j9Var.f3909a.contains(d9Var.f3574d)) {
            return false;
        }
        if (j9Var.f3910b.size() > 0 && j9Var.f3910b.contains(d9Var.f3574d)) {
            return false;
        }
        if (j9Var.f3911c.size() > 0 && !j9Var.f3911c.contains(d9Var.f3578i)) {
            return false;
        }
        if (j9Var.f3912d.size() > 0 && j9Var.f3912d.contains(d9Var.f3578i)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (hashMap.containsKey("sdkVersion")) {
            linkedHashMap.put("sdkVersion", (String) hashMap.get("sdkVersion"));
        }
        if (hashMap.containsKey("category")) {
            linkedHashMap.put("category", (String) hashMap.get("category"));
        }
        for (String str : j9Var.f3913e) {
            if (hashMap.containsKey(str)) {
                linkedHashMap.put(str, (String) hashMap.get(str));
            }
        }
        int size = linkedHashMap.size();
        if (size < 1) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(size);
        String str2 = "";
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb.append(str2);
            sb.append((String) entry.getKey());
            if (entry.getValue() == null) {
                sb.append(" IS NULL");
            } else {
                sb.append(" = ?");
                arrayList.add((String) entry.getValue());
            }
            str2 = " AND ";
        }
        Pair pair = new Pair(sb.toString(), (String[]) arrayList.toArray(new String[0]));
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("events", new String[]{"sendSuccess"}, (String) pair.first, (String[]) pair.second, null, null, "sendSuccess DESC");
            if (cursor.moveToFirst()) {
                long j4 = cursor.getLong(0);
                if (j4 <= 0) {
                    a(cursor);
                    return true;
                }
                long j5 = j3 - j4;
                long j6 = j9Var.f;
                if (j6 > 0 && j5 < j6) {
                    a(cursor);
                    return true;
                }
            }
            a(cursor);
            return false;
        } catch (Throwable th) {
            a(cursor);
            throw th;
        }
    }

    public static d9 b(Cursor cursor) {
        long j3 = cursor.getLong(0);
        long j4 = cursor.getLong(1);
        a(j3, j4);
        String string = cursor.getString(2);
        e9 e9Var = (e9) e9.f3616c.get(cursor.getString(3));
        String string2 = cursor.getString(4);
        String string3 = cursor.getString(5);
        String string4 = cursor.getString(6);
        String string5 = cursor.getString(7);
        String string6 = cursor.getString(8);
        boolean z3 = cursor.getInt(9) == 1;
        String string7 = cursor.getString(10);
        if (string == null || string.trim().length() < 1) {
            throw new IllegalArgumentException();
        }
        if (e9Var == null) {
            throw new IllegalArgumentException();
        }
        Object obj = null;
        if (string5 != null) {
            try {
                obj = new JSONTokener(string5).nextValue();
            } catch (JSONException unused) {
            }
        }
        d9 d9Var = new d9(e9Var, j3);
        d9Var.f3577h = Long.valueOf(j4);
        d9Var.f3573c = string;
        d9Var.f3578i = string2;
        d9Var.f3574d = string3;
        d9Var.f3575e = string4;
        d9Var.f = obj;
        d9Var.f3576g = string6;
        d9Var.f3579j = z3;
        d9Var.f3580k = string7;
        return d9Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events ( timestamp INTEGER NOT NULL, validTill INTEGER NOT NULL, sdkVersion TEXT NOT NULL, category TEXT NOT NULL, appActivity TEXT, value TEXT, details TEXT, detailsJson TEXT, dParam TEXT, service INTEGER NOT NULL DEFAULT 0, tag TEXT, priority INTEGER NOT NULL, attempt INTEGER NOT NULL DEFAULT 0, send INTEGER NOT NULL DEFAULT 0, sendFailure INTEGER NOT NULL DEFAULT 0, sendSuccess INTEGER NOT NULL DEFAULT 0, CHECK (attempt >= 0), CHECK (send >= 0), CHECK (sendFailure >= 0), CHECK (sendSuccess >= 0));");
    }

    public final void a(s9 s9Var, int i3, int i4) {
        Cursor cursor = null;
        try {
            cursor = a().query("events", f3828d, "attempt < " + i3 + " AND validTill >= " + System.currentTimeMillis() + " AND sendSuccess = 0  AND send <= sendFailure", null, null, null, "priority DESC, timestamp ASC", String.valueOf(Math.max(1, i4)));
            while (cursor.moveToNext()) {
                s9Var.a(b(cursor));
            }
        } finally {
            a(cursor);
        }
    }

    public final boolean a(d9 d9Var, g9 g9Var) {
        long j3;
        SQLiteDatabase a3 = a();
        a3.beginTransaction();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = g9Var.f3759e + currentTimeMillis;
            Long l3 = d9Var.f3577h;
            if (l3 != null) {
                j3 = l3.longValue();
            } else {
                d9Var.f3577h = Long.valueOf(currentTimeMillis);
                j3 = currentTimeMillis;
            }
            Object obj = d9Var.f;
            String obj2 = obj != null ? obj.toString() : null;
            String str = d9Var.f3573c;
            if (str == null) {
                str = "5.3.0";
            }
            String str2 = str;
            List list = g9Var.f3760g;
            if (list.size() > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("sdkVersion", str2);
                hashMap.put("category", d9Var.f3571a.f3629a);
                hashMap.put("appActivity", d9Var.f3578i);
                hashMap.put("value", d9Var.f3574d);
                hashMap.put("details", d9Var.f3575e);
                hashMap.put("detailsJson", obj2);
                hashMap.put("dParam", d9Var.f3576g);
                hashMap.put("service", d9Var.f3579j ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (a(d9Var, (j9) it.next(), a3, hashMap, currentTimeMillis)) {
                        a3.endTransaction();
                        return false;
                    }
                }
            }
            a3.delete("events", "validTill < " + currentTimeMillis, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(j3));
            contentValues.put("validTill", Long.valueOf(j4));
            contentValues.put("sdkVersion", str2);
            contentValues.put("category", d9Var.f3571a.f3629a);
            contentValues.put("appActivity", d9Var.f3578i);
            contentValues.put("value", d9Var.f3574d);
            contentValues.put("details", d9Var.f3575e);
            contentValues.put("detailsJson", obj2);
            contentValues.put("dParam", d9Var.f3576g);
            contentValues.put("service", Integer.valueOf(d9Var.f3579j ? 1 : 0));
            contentValues.put("tag", d9Var.f3580k);
            contentValues.put("priority", Integer.valueOf(g9Var.f3757c));
            a3.insertOrThrow("events", null, contentValues);
            a3.setTransactionSuccessful();
            a3.endTransaction();
            synchronized (this) {
                Iterator it2 = this.f3829c.iterator();
                while (it2.hasNext()) {
                    ((i7) it2.next()).a();
                }
            }
            return true;
        } catch (Throwable th) {
            a3.endTransaction();
            throw th;
        }
    }

    public static void a(long j3, long j4) {
        if (j3 <= 0) {
            throw new IllegalArgumentException();
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int a(SQLiteDatabase sQLiteDatabase, long j3) {
        try {
            Cursor query = sQLiteDatabase.query("events", new String[]{"attempt"}, "rowid = ?", new String[]{String.valueOf(j3)}, null, null, null);
            if (query.moveToFirst()) {
                int i3 = query.getInt(0);
                a(query);
                return i3;
            }
            throw new IllegalStateException();
        } catch (Throwable th) {
            a(null);
            throw th;
        }
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }
}
