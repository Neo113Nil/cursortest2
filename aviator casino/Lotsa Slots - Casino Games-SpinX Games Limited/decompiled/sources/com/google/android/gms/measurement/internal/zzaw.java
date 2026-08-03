package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzaw {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r3 == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void zza(com.google.android.gms.measurement.internal.zzgt zzgtVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) throws android.database.sqlite.SQLiteException {
        android.database.sqlite.SQLiteException e;
        android.database.Cursor cursor;
        if (zzgtVar == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        android.database.Cursor cursor2 = null;
        try {
            cursor = sQLiteDatabase.query("SQLITE_MASTER", new java.lang.String[]{"name"}, "name=?", new java.lang.String[]{str}, null, null, null);
            try {
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    zzgtVar.zze().zzc("Error querying for table", str, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase.execSQL(str2);
                    try {
                        java.util.HashSet hashSet = new java.util.HashSet();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 22);
                        sb.append("SELECT * FROM ");
                        sb.append(str);
                        sb.append(" LIMIT 0");
                        android.database.Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
                        try {
                            java.util.Collections.addAll(hashSet, rawQuery.getColumnNames());
                            rawQuery.close();
                            for (java.lang.String str4 : str3.split(",")) {
                                if (!hashSet.remove(str4)) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str.length() + 35 + java.lang.String.valueOf(str4).length());
                                    sb2.append("Table ");
                                    sb2.append(str);
                                    sb2.append(" is missing required column: ");
                                    sb2.append(str4);
                                    throw new android.database.sqlite.SQLiteException(sb2.toString());
                                }
                            }
                            if (strArr != null) {
                                for (int i = 0; i < strArr.length; i += 2) {
                                    if (!hashSet.remove(strArr[i])) {
                                        sQLiteDatabase.execSQL(strArr[i + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                return;
                            }
                            zzgtVar.zze().zzc("Table has extra columns. table, columns", str, android.text.TextUtils.join(", ", hashSet));
                        } catch (java.lang.Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteException e3) {
                        zzgtVar.zzb().zzb("Failed to verify columns on table that was just created", str);
                        throw e3;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e4) {
            e = e4;
            cursor = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    static void zzb(com.google.android.gms.measurement.internal.zzgt zzgtVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (zzgtVar == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        com.google.android.gms.internal.measurement.zzbv.zza();
        java.lang.String path = sQLiteDatabase.getPath();
        int i = com.google.android.gms.internal.measurement.zzca.zzb;
        java.io.File file = new java.io.File(path);
        if (!file.setReadable(false, false)) {
            zzgtVar.zze().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzgtVar.zze().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzgtVar.zze().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzgtVar.zze().zza("Failed to turn on database write permission for owner");
    }
}
