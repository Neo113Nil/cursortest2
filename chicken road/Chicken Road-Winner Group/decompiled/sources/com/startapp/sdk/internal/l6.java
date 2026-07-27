package com.startapp.sdk.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
public abstract class l6 extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public volatile SQLiteDatabase f3980a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3981b;

    public l6(Context context) {
        super(context, "StartApp-d6864f2502af7851", (SQLiteDatabase.CursorFactory) null, 1);
        this.f3981b = new Object();
    }

    public final SQLiteDatabase a() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = this.f3980a;
        if (sQLiteDatabase2 != null) {
            return sQLiteDatabase2;
        }
        synchronized (this.f3981b) {
            try {
                sQLiteDatabase = this.f3980a;
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = getWritableDatabase();
                    this.f3980a = sQLiteDatabase;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
    }
}
