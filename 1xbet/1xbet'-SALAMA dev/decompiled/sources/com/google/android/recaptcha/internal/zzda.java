package com.google.android.recaptcha.internal;

import Y4.D;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
import p050g6.h;
import p050g6.p;
import t6.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzda extends SQLiteOpenHelper {
    public static final zzcy zza = new zzcy(null);
    private static final int zzb = zzcy.zzc("18.5.1");
    private static final String zzc = zzcy.zzd("18.5.1");
    private static zzda zzd;

    public /* synthetic */ zzda(Context context, e eVar) {
        super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(h.T0(list, ", ", "(", ")", zzcz.zza, 24))), null);
    }

    public final int zzb() {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i7 = -1;
        try {
            if (cursorRawQuery.moveToNext()) {
                i7 = cursorRawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } finally {
            cursorRawQuery.close();
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [g6.p] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    public final List zzd() {
        Cursor cursorQuery = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        ?? arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    int i7 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("id"));
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("ss"));
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("ts"));
                    t6.h.b(string);
                    arrayList.add(new zzdb(string, j, i7));
                } catch (Exception unused) {
                    arrayList = p.f13308a;
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final boolean zzf(zzdb zzdbVar) {
        return zza(D.D(zzdbVar)) == 1;
    }
}
