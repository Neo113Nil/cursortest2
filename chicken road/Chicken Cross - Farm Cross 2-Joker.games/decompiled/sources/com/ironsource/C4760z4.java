package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4760z4 extends SQLiteOpenHelper implements A7 {
    private static C4760z4 f = null;
    private static final String g = " TEXT";
    private static final String h = " INTEGER";
    private static final String i = ",";

    /* renamed from: a, reason: collision with root package name */
    private final A4 f8789a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;

    /* renamed from: com.ironsource.z4$a */
    static abstract class a implements BaseColumns {

        /* renamed from: a, reason: collision with root package name */
        public static final String f8790a = "events";
        public static final int b = 4;
        public static final String c = "eventid";
        public static final String d = "timestamp";
        public static final String e = "type";
        public static final String f = "data";

        a() {
        }
    }

    public C4760z4(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.f8789a = new A4();
        this.b = 4;
        this.c = 400;
        this.d = "DROP TABLE IF EXISTS events";
        this.e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    public static synchronized C4760z4 a(Context context, String str, int i2) {
        C4760z4 c4760z4;
        synchronized (C4760z4.class) {
            if (f == null) {
                f = new C4760z4(context, str, i2);
            }
            c4760z4 = f;
        }
        return c4760z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r5.isOpen() != false) goto L17;
     */
    @Override // com.ironsource.A7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void b(String str) {
        SQLiteDatabase sQLiteDatabase;
        String[] strArr = {str};
        try {
            sQLiteDatabase = a(true);
            try {
                sQLiteDatabase.delete("events", "type = ?", strArr);
            } catch (Throwable th) {
                th = th;
                try {
                    C4491k4.d().a(th);
                    Log.e("IronSource", "Exception while clearing events: ", th);
                } finally {
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        sQLiteDatabase.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:
    
        if (r0.isOpen() != false) goto L29;
     */
    @Override // com.ironsource.A7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(List<C4689v5> list, String str) {
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase sQLiteDatabase2 = a(true);
                    try {
                        Iterator<C4689v5> it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues a2 = a(it.next(), str);
                            if (sQLiteDatabase2 != null && a2 != null) {
                                sQLiteDatabase2.insert("events", null, a2);
                            }
                        }
                        if (sQLiteDatabase2 != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = sQLiteDatabase2;
                        try {
                            C4491k4.d().a(th);
                            Log.e("IronSource", "Exception while saving events: ", th);
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase2 = sQLiteDatabase;
                                sQLiteDatabase2.close();
                            }
                        } catch (Throwable th2) {
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        if (r11.isOpen() != false) goto L40;
     */
    @Override // com.ironsource.A7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized ArrayList<C4689v5> a(String str) {
        ArrayList<C4689v5> arrayList;
        SQLiteDatabase sQLiteDatabase;
        arrayList = new ArrayList<>();
        Cursor cursor = null;
        try {
            sQLiteDatabase = a(false);
            try {
                cursor = sQLiteDatabase.query("events", null, "type = ?", new String[]{str}, null, null, "timestamp ASC");
                if (cursor.getCount() > 0) {
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        int columnIndex = cursor.getColumnIndex("eventid");
                        if (columnIndex >= 0) {
                            int i2 = cursor.getInt(columnIndex);
                            int columnIndex2 = cursor.getColumnIndex("timestamp");
                            if (columnIndex2 >= 0) {
                                long j = cursor.getLong(columnIndex2);
                                int columnIndex3 = cursor.getColumnIndex("data");
                                if (columnIndex3 >= 0) {
                                    arrayList.add(new C4689v5(i2, j, cursor.getString(columnIndex3)));
                                    cursor.moveToNext();
                                }
                            }
                        }
                    }
                    cursor.close();
                }
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C4491k4.d().a(th);
                    Log.e("IronSource", "Exception while loading events: ", th);
                    return arrayList;
                } finally {
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        sQLiteDatabase.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
        return arrayList;
    }

    private ContentValues a(C4689v5 c4689v5, String str) {
        if (c4689v5 == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(c4689v5.c()));
        contentValues.put("timestamp", Long.valueOf(c4689v5.d()));
        contentValues.put("type", str);
        contentValues.put("data", c4689v5.a());
        return contentValues;
    }

    private synchronized SQLiteDatabase a(boolean z) throws Throwable {
        int i2 = 0;
        while (true) {
            try {
                if (z) {
                    return this.f8789a.a(true, this);
                }
                return this.f8789a.a(false, this);
            } finally {
            }
        }
    }
}
