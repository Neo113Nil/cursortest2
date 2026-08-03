package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzejo {
    public static void zza(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        zzi(sQLiteDatabase, "failed_requests", 0);
        zzi(sQLiteDatabase, "total_requests", 0);
        zzi(sQLiteDatabase, "completed_requests", 0);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (java.lang.Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void zzb(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        zzh(sQLiteDatabase, "failed_requests", 0);
        zzh(sQLiteDatabase, "total_requests", 0);
        zzh(sQLiteDatabase, "completed_requests", 0);
    }

    public static int zzc(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        android.database.Cursor zzg = zzg(sQLiteDatabase, i);
        if (zzg.getCount() > 0) {
            zzg.moveToNext();
            i2 = zzg.getInt(zzg.getColumnIndexOrThrow("value"));
        }
        zzg.close();
        return i2;
    }

    public static long zzd(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i) {
        long j;
        android.database.Cursor zzg = zzg(sQLiteDatabase, 2);
        if (zzg.getCount() > 0) {
            zzg.moveToNext();
            j = zzg.getLong(zzg.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        zzg.close();
        return j;
    }

    public static void zze(android.database.sqlite.SQLiteDatabase sQLiteDatabase, long j, byte[] bArr) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.ironsource.C4.a.d, java.lang.Long.valueOf(j));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new java.lang.String[]{java.lang.String.valueOf(j)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void zzf(android.database.sqlite.SQLiteDatabase sQLiteDatabase, boolean z, boolean z2) {
        if (!z2) {
            sQLiteDatabase.execSQL(java.lang.String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
            return;
        }
        sQLiteDatabase.execSQL(java.lang.String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
        if (z) {
            return;
        }
        sQLiteDatabase.execSQL(java.lang.String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
    }

    private static android.database.Cursor zzg(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i) {
        java.lang.String[] strArr = {"value"};
        java.lang.String[] strArr2 = new java.lang.String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    private static void zzh(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("value", (java.lang.Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new java.lang.String[]{str});
    }

    private static void zzi(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (java.lang.Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }
}
