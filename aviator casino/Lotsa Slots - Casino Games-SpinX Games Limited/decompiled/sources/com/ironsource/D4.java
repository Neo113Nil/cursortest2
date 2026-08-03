package com.ironsource;

/* loaded from: classes5.dex */
public final class D4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.D4.a f5666a = new com.ironsource.D4.a(null);
    private static final java.lang.Object b = new java.lang.Object();

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final android.database.sqlite.SQLiteDatabase a(android.database.sqlite.SQLiteOpenHelper sqliteOpenHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sqliteOpenHelper, 1, null);
    }

    public static /* synthetic */ android.database.sqlite.SQLiteDatabase a(com.ironsource.D4 d4, boolean z, android.database.sqlite.SQLiteOpenHelper sQLiteOpenHelper, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return d4.a(z, sQLiteOpenHelper);
    }

    public final android.database.sqlite.SQLiteDatabase a(boolean z, android.database.sqlite.SQLiteOpenHelper sqliteOpenHelper) {
        android.database.sqlite.SQLiteDatabase readableDatabase;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (b) {
            if (z) {
                readableDatabase = sqliteOpenHelper.getWritableDatabase();
            } else {
                readableDatabase = sqliteOpenHelper.getReadableDatabase();
            }
        }
        return readableDatabase;
    }
}
