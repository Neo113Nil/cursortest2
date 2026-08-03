package com.ironsource;

/* loaded from: classes5.dex */
public class C4 extends android.database.sqlite.SQLiteOpenHelper implements com.ironsource.D7 {
    private static com.ironsource.C4 f = null;
    private static final java.lang.String g = " TEXT";
    private static final java.lang.String h = " INTEGER";
    private static final java.lang.String i = ",";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.D4 f5646a;
    private final int b;
    private final int c;
    private final java.lang.String d;
    private final java.lang.String e;

    static abstract class a implements android.provider.BaseColumns {

        /* renamed from: a, reason: collision with root package name */
        public static final java.lang.String f5647a = "events";
        public static final int b = 4;
        public static final java.lang.String c = "eventid";
        public static final java.lang.String d = "timestamp";
        public static final java.lang.String e = "type";
        public static final java.lang.String f = "data";

        a() {
        }
    }

    public C4(android.content.Context context, java.lang.String str, int i2) {
        super(context, str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, i2);
        this.f5646a = new com.ironsource.D4();
        this.b = 4;
        this.c = 400;
        this.d = "DROP TABLE IF EXISTS events";
        this.e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    public static synchronized com.ironsource.C4 a(android.content.Context context, java.lang.String str, int i2) {
        com.ironsource.C4 c4;
        synchronized (com.ironsource.C4.class) {
            if (f == null) {
                f = new com.ironsource.C4(context, str, i2);
            }
            c4 = f;
        }
        return c4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r1.isOpen() != false) goto L18;
     */
    @Override // com.ironsource.D7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void b(java.lang.String str) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        java.lang.String[] strArr = {str};
        try {
            sQLiteDatabase = a(true);
            try {
                sQLiteDatabase.delete("events", "type = ?", strArr);
            } catch (java.lang.Throwable th) {
                th = th;
                try {
                    com.ironsource.C3180n4.d().a(th);
                    android.util.Log.e("IronSource", "Exception while clearing events: ", th);
                } finally {
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        sQLiteDatabase.close();
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:
    
        if (r0.isOpen() != false) goto L29;
     */
    @Override // com.ironsource.D7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(java.util.List<com.ironsource.C3360x5> list, java.lang.String str) {
        if (list != null) {
            if (!list.isEmpty()) {
                android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
                try {
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = a(true);
                    try {
                        java.util.Iterator<com.ironsource.C3360x5> it = list.iterator();
                        while (it.hasNext()) {
                            android.content.ContentValues a2 = a(it.next(), str);
                            if (sQLiteDatabase2 != null && a2 != null) {
                                sQLiteDatabase2.insert("events", null, a2);
                            }
                        }
                        if (sQLiteDatabase2 != null) {
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        sQLiteDatabase = sQLiteDatabase2;
                        try {
                            com.ironsource.C3180n4.d().a(th);
                            android.util.Log.e("IronSource", "Exception while saving events: ", th);
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase2 = sQLiteDatabase;
                                sQLiteDatabase2.close();
                            }
                        } catch (java.lang.Throwable th2) {
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
    
        if (r1.isOpen() != false) goto L40;
     */
    @Override // com.ironsource.D7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized java.util.ArrayList<com.ironsource.C3360x5> a(java.lang.String str) {
        java.util.ArrayList<com.ironsource.C3360x5> arrayList;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        arrayList = new java.util.ArrayList<>();
        android.database.Cursor cursor = null;
        try {
            sQLiteDatabase = a(false);
            try {
                cursor = sQLiteDatabase.query("events", null, "type = ?", new java.lang.String[]{str}, null, null, "timestamp ASC");
                if (cursor.getCount() > 0) {
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        int columnIndex = cursor.getColumnIndex("eventid");
                        if (columnIndex >= 0) {
                            int i2 = cursor.getInt(columnIndex);
                            int columnIndex2 = cursor.getColumnIndex(com.ironsource.C4.a.d);
                            if (columnIndex2 >= 0) {
                                long j = cursor.getLong(columnIndex2);
                                int columnIndex3 = cursor.getColumnIndex("data");
                                if (columnIndex3 >= 0) {
                                    arrayList.add(new com.ironsource.C3360x5(i2, j, cursor.getString(columnIndex3)));
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
            } catch (java.lang.Throwable th) {
                th = th;
                try {
                    com.ironsource.C3180n4.d().a(th);
                    android.util.Log.e("IronSource", "Exception while loading events: ", th);
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
        } catch (java.lang.Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
        return arrayList;
    }

    private android.content.ContentValues a(com.ironsource.C3360x5 c3360x5, java.lang.String str) {
        if (c3360x5 == null) {
            return null;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues(4);
        contentValues.put("eventid", java.lang.Integer.valueOf(c3360x5.c()));
        contentValues.put(com.ironsource.C4.a.d, java.lang.Long.valueOf(c3360x5.d()));
        contentValues.put("type", str);
        contentValues.put("data", c3360x5.a());
        return contentValues;
    }

    private synchronized android.database.sqlite.SQLiteDatabase a(boolean z) throws java.lang.Throwable {
        int i2 = 0;
        while (true) {
            try {
                if (z) {
                    return this.f5646a.a(true, this);
                }
                return this.f5646a.a(false, this);
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
                i2++;
                if (i2 < 4) {
                    android.os.SystemClock.sleep(i2 * 400);
                } else {
                    throw th;
                }
            }
        }
    }
}
