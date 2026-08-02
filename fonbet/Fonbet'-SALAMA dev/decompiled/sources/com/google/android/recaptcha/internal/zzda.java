package com.google.android.recaptcha.internal;

import Y4.D;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import g6.AbstractC1159h;
import g6.C1167p;
import java.util.ArrayList;
import java.util.List;
import t6.e;
import t6.h;

/* loaded from: classes.dex */
public final class zzda extends SQLiteOpenHelper {
    public static final zzcy zza = new zzcy(null);
    private static final int zzb;
    private static final String zzc;
    private static zzda zzd;

    static {
        int zzc2;
        String zzd2;
        zzc2 = zzcy.zzc("18.5.1");
        zzb = zzc2;
        zzd2 = zzcy.zzd("18.5.1");
        zzc = zzd2;
    }

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
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(AbstractC1159h.T0(list, ", ", "(", ")", zzcz.zza, 24))), null);
    }

    public final int zzb() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i7 = -1;
        try {
            if (rawQuery.moveToNext()) {
                i7 = rawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        rawQuery.close();
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [g6.p] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    public final List zzd() {
        Cursor query = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        ?? arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    int i7 = query.getInt(query.getColumnIndexOrThrow("id"));
                    String string = query.getString(query.getColumnIndexOrThrow("ss"));
                    long j = query.getLong(query.getColumnIndexOrThrow("ts"));
                    h.b(string);
                    arrayList.add(new zzdb(string, j, i7));
                } catch (Exception unused) {
                    arrayList = C1167p.f13302a;
                }
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(zzdb zzdbVar) {
        return zza(D.D(zzdbVar)) == 1;
    }
}
