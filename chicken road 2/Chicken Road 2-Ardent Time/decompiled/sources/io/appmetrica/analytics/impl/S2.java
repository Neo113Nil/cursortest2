package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class S2 implements io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0841y6 f4932a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4933b;

    public S2(io.appmetrica.analytics.impl.InterfaceC0841y6 interfaceC0841y6, java.lang.String str) {
        this.f4932a = interfaceC0841y6;
        this.f4933b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final byte[] get(java.lang.String str) {
        android.database.Cursor cursor;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f4932a.a();
        } catch (java.lang.Throwable unused) {
            cursor = null;
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase != null) {
            try {
                cursor = sQLiteDatabase.query(this.f4933b, null, "data_key = ?", new java.lang.String[]{str}, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                            byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("value"));
                            io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
                            this.f4932a.a(sQLiteDatabase);
                            return blob;
                        }
                    } catch (java.lang.Throwable unused2) {
                    }
                }
                if (cursor != null) {
                    cursor.getCount();
                }
            } catch (java.lang.Throwable unused3) {
            }
            io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
            this.f4932a.a(sQLiteDatabase);
            return null;
        }
        cursor = null;
        io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
        this.f4932a.a(sQLiteDatabase);
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(java.lang.String str, byte[] bArr) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.f4932a.a();
            if (sQLiteDatabase != null) {
                try {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabase.insertWithOnConflict(this.f4933b, null, contentValues, 5);
                } catch (java.lang.Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    this.f4932a.a(sQLiteDatabase);
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
        this.f4932a.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(java.lang.String str) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f4932a.a();
            if (sQLiteDatabase != null) {
                try {
                    new android.content.ContentValues().put("data_key", str);
                    sQLiteDatabase.delete(this.f4933b, "data_key = ?", new java.lang.String[]{str});
                } catch (java.lang.Throwable unused) {
                }
            }
        } catch (java.lang.Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f4932a.a(sQLiteDatabase);
    }
}
