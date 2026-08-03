package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702sn implements io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0841y6 f6827a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f6828b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f6829c = new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider();

    public C0702sn(io.appmetrica.analytics.impl.InterfaceC0841y6 interfaceC0841y6, java.lang.String str) {
        this.f6827a = interfaceC0841y6;
        this.f6828b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.List<io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry> get(java.lang.String str, int i2) {
        android.database.Cursor cursor;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase2;
        io.appmetrica.analytics.impl.C0754un c0754un;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursor2 = null;
        try {
            sQLiteDatabase = this.f6827a.a();
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (java.lang.Throwable unused) {
            cursor = null;
        }
        if (sQLiteDatabase != 0) {
            try {
                cursor = sQLiteDatabase.query(false, this.f6828b, null, "scope=?", new java.lang.String[]{str}, null, null, "id", java.lang.String.valueOf(i2));
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        try {
                            try {
                                c0754un = new io.appmetrica.analytics.impl.C0754un(cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getString(cursor.getColumnIndexOrThrow("scope")), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), cursor.getBlob(cursor.getColumnIndexOrThrow("data")));
                            } catch (java.lang.Throwable unused2) {
                                c0754un = null;
                            }
                            if (c0754un != null) {
                                arrayList.add(c0754un);
                            }
                        } catch (java.lang.Throwable unused3) {
                            cursor2 = sQLiteDatabase;
                            sQLiteDatabase = cursor2;
                            cursor2 = cursor;
                            sQLiteDatabase2 = sQLiteDatabase;
                            io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor2);
                            this.f6827a.a(sQLiteDatabase2);
                            return arrayList;
                        }
                    }
                }
            } catch (java.lang.Throwable unused4) {
                cursor = null;
            }
            cursor2 = cursor;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor2);
        this.f6827a.a(sQLiteDatabase2);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(java.lang.String str, long j2, byte[] bArr) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.f6827a.a();
            if (sQLiteDatabase != null) {
                try {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("scope", str);
                    contentValues.put("timestamp", java.lang.Long.valueOf(j2));
                    contentValues.put("data", bArr);
                    long insertOrThrow = sQLiteDatabase.insertOrThrow(this.f6828b, null, contentValues);
                    this.f6827a.a(sQLiteDatabase);
                    return insertOrThrow;
                } catch (java.lang.Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    this.f6827a.a(sQLiteDatabase);
                    return -1L;
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
        this.f6827a.a(sQLiteDatabase);
        return -1L;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j2) {
        a("id=?", new java.lang.String[]{java.lang.String.valueOf(j2)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(java.lang.String str, long j2) {
        a("scope=? AND timestamp<?", new java.lang.String[]{str, java.lang.String.valueOf(this.f6829c.currentTimeMillis() - j2)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry get(java.lang.String str) {
        return (io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry) i1.AbstractC0190i.N(get(str, 1));
    }

    public final void a(java.lang.String str, java.lang.String[] strArr) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f6827a.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.delete(this.f6828b, str, strArr);
                } catch (java.lang.Throwable unused) {
                }
            }
        } catch (java.lang.Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f6827a.a(sQLiteDatabase);
    }
}
