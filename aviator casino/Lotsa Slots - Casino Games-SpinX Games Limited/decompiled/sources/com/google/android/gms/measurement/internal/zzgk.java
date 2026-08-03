package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgk extends com.google.android.gms.measurement.internal.zzg {
    private static final java.lang.String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final com.google.android.gms.measurement.internal.zzgi zzb;
    private boolean zzc;

    zzgk(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
        android.content.Context zzaY = this.zzu.zzaY();
        this.zzu.zzc();
        this.zzb = new com.google.android.gms.measurement.internal.zzgi(this, zzaY, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzs(int i, byte[] bArr) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        android.database.Cursor cursor;
        zzg();
        boolean z = false;
        z = false;
        if (!this.zzc) {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            com.google.android.gms.measurement.internal.zzal zzc = zzibVar.zzc();
            com.google.android.gms.measurement.internal.zzfw zzfwVar = com.google.android.gms.measurement.internal.zzfx.zzbc;
            android.database.Cursor cursor2 = null;
            com.google.android.gms.measurement.internal.zzr zzh = zzc.zzp(null, zzfwVar) ? this.zzu.zzv().zzh(null) : null;
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("type", java.lang.Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (zzibVar.zzc().zzp(null, zzfwVar) && zzh != null) {
                contentValues.put("app_version", zzh.zzc);
                contentValues.put("app_version_int", java.lang.Long.valueOf(zzh.zzj));
            }
            zzibVar.zzc();
            int i2 = 0;
            int i3 = 5;
            for (int i4 = 5; i2 < i4; i4 = 5) {
                try {
                    sQLiteDatabase = zzp();
                    if (sQLiteDatabase == null) {
                        this.zzc = true;
                    } else {
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        j = cursor.getLong(z ? 1 : 0);
                                    }
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException unused) {
                                    android.os.SystemClock.sleep(i3);
                                    i3 += 20;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i2++;
                                        z = false;
                                    }
                                    sQLiteDatabase.close();
                                    i2++;
                                    z = false;
                                } catch (android.database.sqlite.SQLiteFullException e) {
                                    e = e;
                                    this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                    this.zzc = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i2++;
                                        z = false;
                                    }
                                    sQLiteDatabase.close();
                                    i2++;
                                    z = false;
                                } catch (android.database.sqlite.SQLiteException e2) {
                                    e = e2;
                                    if (sQLiteDatabase != null) {
                                        try {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                    this.zzc = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i2++;
                                        z = false;
                                    }
                                    sQLiteDatabase.close();
                                    i2++;
                                    z = false;
                                }
                            }
                            if (j >= androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                zzibVar.zzaV().zzb().zza("Data loss, local db full");
                                java.lang.String[] strArr = new java.lang.String[1];
                                long j2 = 100001 - j;
                                strArr[z ? 1 : 0] = java.lang.Long.toString(j2);
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                                if (delete != j2) {
                                    zzibVar.zzaV().zzb().zzd("Different delete count than expected in local db. expected, received, difference", java.lang.Long.valueOf(j2), java.lang.Long.valueOf(delete), java.lang.Long.valueOf(j2 - delete));
                                }
                            }
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                                cursor.close();
                            }
                            sQLiteDatabase.close();
                            return true;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException unused2) {
                            cursor = null;
                        } catch (android.database.sqlite.SQLiteFullException e3) {
                            e = e3;
                            cursor = null;
                        } catch (android.database.sqlite.SQLiteException e4) {
                            e = e4;
                            cursor = null;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                } catch (android.database.sqlite.SQLiteDatabaseLockedException unused3) {
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (android.database.sqlite.SQLiteFullException e5) {
                    e = e5;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (android.database.sqlite.SQLiteException e6) {
                    e = e6;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    sQLiteDatabase = null;
                }
            }
            this.zzu.zzaV().zzk().zza("Failed to write entry to local database");
            return false;
        }
        return z;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    public final void zzh() {
        int delete;
        zzg();
        try {
            android.database.sqlite.SQLiteDatabase zzp = zzp();
            if (zzp == null || (delete = zzp.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzu.zzaV().zzk().zzb("Reset local analytics data. records", java.lang.Integer.valueOf(delete));
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzi(com.google.android.gms.measurement.internal.zzbg zzbgVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        com.google.android.gms.measurement.internal.zzbh.zza(zzbgVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzs(0, marshall);
        }
        this.zzu.zzaV().zzc().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzj(com.google.android.gms.measurement.internal.zzpk zzpkVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        com.google.android.gms.measurement.internal.zzpl.zza(zzpkVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzs(1, marshall);
        }
        this.zzu.zzaV().zzc().zza("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzk(com.google.android.gms.measurement.internal.zzah zzahVar) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        byte[] zzae = zzibVar.zzk().zzae(zzahVar);
        if (zzae.length <= 131072) {
            return zzs(2, zzae);
        }
        zzibVar.zzaV().zzc().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzl(com.google.android.gms.measurement.internal.zzbe zzbeVar) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        byte[] zzae = zzibVar.zzk().zzae(zzbeVar);
        if (zzae == null) {
            zzibVar.zzaV().zzc().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (zzae.length <= 131072) {
            return zzs(4, zzae);
        }
        zzibVar.zzaV().zzc().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List zzm(int i) {
        android.database.Cursor cursor;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        int i2;
        android.database.Cursor cursor2;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase2;
        android.database.Cursor cursor3;
        android.database.Cursor cursor4;
        android.database.Cursor cursor5;
        long j;
        java.lang.String str;
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        android.database.Cursor cursor6;
        long j2;
        java.lang.String str2;
        android.os.Parcel obtain;
        com.google.android.gms.measurement.internal.zzbe zzbeVar;
        com.google.android.gms.measurement.internal.zzah zzahVar;
        com.google.android.gms.measurement.internal.zzpk zzpkVar;
        zzg();
        ?? r6 = 0;
        if (this.zzc) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!zzq()) {
            return arrayList;
        }
        int i3 = 5;
        int i4 = 0;
        int i5 = 0;
        int i6 = 5;
        while (i5 < i3) {
            int i7 = 1;
            try {
                android.database.sqlite.SQLiteDatabase zzp = zzp();
                if (zzp == null) {
                    this.zzc = true;
                    return r6;
                }
                try {
                    zzp.beginTransaction();
                    try {
                        java.lang.String[] strArr3 = new java.lang.String[1];
                        strArr3[i4] = "rowid";
                        try {
                            cursor5 = zzp.query("messages", strArr3, "type=?", new java.lang.String[]{androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D}, null, null, "rowid desc", "1");
                            try {
                                long j3 = -1;
                                if (cursor5.moveToFirst()) {
                                    j = cursor5.getLong(i4);
                                    if (cursor5 != null) {
                                        try {
                                            cursor5.close();
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException unused) {
                                            sQLiteDatabase = zzp;
                                            sQLiteDatabase2 = sQLiteDatabase;
                                            i2 = i5;
                                            cursor2 = null;
                                            try {
                                                android.os.SystemClock.sleep(i6);
                                                i6 += 20;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase2 == null) {
                                                }
                                                i5 = i2 + 1;
                                                r6 = 0;
                                                i3 = 5;
                                                i4 = 0;
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                                cursor = cursor2;
                                                sQLiteDatabase = sQLiteDatabase2;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        } catch (android.database.sqlite.SQLiteFullException e) {
                                            e = e;
                                            sQLiteDatabase = zzp;
                                            i2 = i5;
                                            cursor4 = null;
                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                            this.zzc = true;
                                            if (cursor4 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            i5 = i2 + 1;
                                            r6 = 0;
                                            i3 = 5;
                                            i4 = 0;
                                        } catch (android.database.sqlite.SQLiteException e2) {
                                            e = e2;
                                            sQLiteDatabase = zzp;
                                            cursor3 = null;
                                            if (sQLiteDatabase != null) {
                                            }
                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                            this.zzc = true;
                                            if (cursor3 != null) {
                                            }
                                            if (sQLiteDatabase != null) {
                                            }
                                            i2 = i5;
                                            i5 = i2 + 1;
                                            r6 = 0;
                                            i3 = 5;
                                            i4 = 0;
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            sQLiteDatabase = zzp;
                                            cursor = null;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    if (cursor5 != null) {
                                        cursor5.close();
                                    }
                                    j = -1;
                                }
                                if (j != -1) {
                                    java.lang.String[] strArr4 = new java.lang.String[1];
                                    strArr4[i4] = java.lang.String.valueOf(j);
                                    str = "rowid<?";
                                    strArr = strArr4;
                                } else {
                                    str = r6;
                                    strArr = str;
                                }
                                java.lang.String[] strArr5 = new java.lang.String[3];
                                strArr5[i4] = "rowid";
                                strArr5[1] = "type";
                                strArr5[2] = "entry";
                                com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                                com.google.android.gms.measurement.internal.zzal zzc = zzibVar.zzc();
                                com.google.android.gms.measurement.internal.zzfw zzfwVar = com.google.android.gms.measurement.internal.zzfx.zzbc;
                                if (zzc.zzp(r6, zzfwVar)) {
                                    strArr2 = new java.lang.String[i3];
                                    strArr2[i4] = "rowid";
                                    strArr2[1] = "type";
                                    strArr2[2] = "entry";
                                    strArr2[3] = "app_version";
                                    strArr2[4] = "app_version_int";
                                } else {
                                    strArr2 = strArr5;
                                }
                                int i8 = 2;
                                android.database.Cursor query = zzp.query("messages", strArr2, str, strArr, null, null, "rowid asc", java.lang.Integer.toString(100));
                                while (query.moveToNext()) {
                                    try {
                                        try {
                                            j3 = query.getLong(i4);
                                            int i9 = query.getInt(i7);
                                            byte[] blob = query.getBlob(i8);
                                            if (zzibVar.zzc().zzp(null, zzfwVar)) {
                                                java.lang.String string = query.getString(3);
                                                j2 = query.getLong(4);
                                                str2 = string;
                                            } else {
                                                j2 = 0;
                                                str2 = null;
                                            }
                                            long j4 = j2;
                                            cursor6 = query;
                                            if (i9 == 0) {
                                                try {
                                                    obtain = android.os.Parcel.obtain();
                                                    try {
                                                        obtain.unmarshall(blob, i4, blob.length);
                                                        obtain.setDataPosition(i4);
                                                        com.google.android.gms.measurement.internal.zzbg createFromParcel = com.google.android.gms.measurement.internal.zzbg.CREATOR.createFromParcel(obtain);
                                                        if (createFromParcel != null) {
                                                            arrayList.add(new com.google.android.gms.measurement.internal.zzgj(createFromParcel, str2, j4));
                                                        }
                                                    } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException unused2) {
                                                        this.zzu.zzaV().zzb().zza("Failed to load event from local database");
                                                    } finally {
                                                    }
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException unused3) {
                                                    sQLiteDatabase = zzp;
                                                    sQLiteDatabase2 = sQLiteDatabase;
                                                    i2 = i5;
                                                    cursor2 = cursor6;
                                                    android.os.SystemClock.sleep(i6);
                                                    i6 += 20;
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    if (sQLiteDatabase2 == null) {
                                                        sQLiteDatabase2.close();
                                                    }
                                                    i5 = i2 + 1;
                                                    r6 = 0;
                                                    i3 = 5;
                                                    i4 = 0;
                                                } catch (android.database.sqlite.SQLiteFullException e3) {
                                                    e = e3;
                                                    sQLiteDatabase = zzp;
                                                    i2 = i5;
                                                    cursor4 = cursor6;
                                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                    this.zzc = true;
                                                    if (cursor4 != null) {
                                                        cursor4.close();
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                        sQLiteDatabase.close();
                                                    }
                                                    i5 = i2 + 1;
                                                    r6 = 0;
                                                    i3 = 5;
                                                    i4 = 0;
                                                } catch (android.database.sqlite.SQLiteException e4) {
                                                    e = e4;
                                                    sQLiteDatabase = zzp;
                                                    cursor3 = cursor6;
                                                    if (sQLiteDatabase != null) {
                                                        try {
                                                            if (sQLiteDatabase.inTransaction()) {
                                                                sQLiteDatabase.endTransaction();
                                                            }
                                                        } catch (java.lang.Throwable th3) {
                                                            th = th3;
                                                            cursor = cursor3;
                                                            if (cursor != null) {
                                                            }
                                                            if (sQLiteDatabase != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                    this.zzc = true;
                                                    if (cursor3 != null) {
                                                        cursor3.close();
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.close();
                                                    }
                                                    i2 = i5;
                                                    i5 = i2 + 1;
                                                    r6 = 0;
                                                    i3 = 5;
                                                    i4 = 0;
                                                } catch (java.lang.Throwable th4) {
                                                    th = th4;
                                                    sQLiteDatabase = zzp;
                                                    cursor = cursor6;
                                                    if (cursor != null) {
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    throw th;
                                                }
                                            } else if (i9 == 1) {
                                                obtain = android.os.Parcel.obtain();
                                                try {
                                                    try {
                                                        obtain.unmarshall(blob, i4, blob.length);
                                                        obtain.setDataPosition(i4);
                                                        zzpkVar = com.google.android.gms.measurement.internal.zzpk.CREATOR.createFromParcel(obtain);
                                                    } finally {
                                                    }
                                                } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException unused4) {
                                                    this.zzu.zzaV().zzb().zza("Failed to load user property from local database");
                                                    obtain.recycle();
                                                    zzpkVar = null;
                                                }
                                                if (zzpkVar != null) {
                                                    arrayList.add(new com.google.android.gms.measurement.internal.zzgj(zzpkVar, str2, j4));
                                                }
                                            } else if (i9 == 2) {
                                                obtain = android.os.Parcel.obtain();
                                                try {
                                                    try {
                                                        obtain.unmarshall(blob, i4, blob.length);
                                                        obtain.setDataPosition(i4);
                                                        zzahVar = com.google.android.gms.measurement.internal.zzah.CREATOR.createFromParcel(obtain);
                                                    } finally {
                                                    }
                                                } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException unused5) {
                                                    this.zzu.zzaV().zzb().zza("Failed to load conditional user property from local database");
                                                    obtain.recycle();
                                                    zzahVar = null;
                                                }
                                                if (zzahVar != null) {
                                                    arrayList.add(new com.google.android.gms.measurement.internal.zzgj(zzahVar, str2, j4));
                                                }
                                            } else if (i9 == 4) {
                                                obtain = android.os.Parcel.obtain();
                                                try {
                                                    try {
                                                        obtain.unmarshall(blob, i4, blob.length);
                                                        obtain.setDataPosition(i4);
                                                        zzbeVar = com.google.android.gms.measurement.internal.zzbe.CREATOR.createFromParcel(obtain);
                                                    } finally {
                                                    }
                                                } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException unused6) {
                                                    this.zzu.zzaV().zzb().zza("Failed to load default event parameters from local database");
                                                    obtain.recycle();
                                                    zzbeVar = null;
                                                }
                                                if (zzbeVar != null) {
                                                    arrayList.add(new com.google.android.gms.measurement.internal.zzgj(zzbeVar, str2, j4));
                                                }
                                            } else {
                                                if (i9 == 3) {
                                                    this.zzu.zzaV().zzk().zza("Skipping app launch break");
                                                } else {
                                                    this.zzu.zzaV().zzb().zza("Unknown record type in local database");
                                                }
                                                query = cursor6;
                                                i8 = 2;
                                                i7 = 1;
                                            }
                                            query = cursor6;
                                            i8 = 2;
                                            i7 = 1;
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException unused7) {
                                            cursor6 = query;
                                        } catch (android.database.sqlite.SQLiteFullException e5) {
                                            e = e5;
                                            cursor6 = query;
                                        } catch (android.database.sqlite.SQLiteException e6) {
                                            e = e6;
                                            cursor6 = query;
                                        } catch (java.lang.Throwable th5) {
                                            th = th5;
                                            cursor6 = query;
                                        }
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException unused8) {
                                        sQLiteDatabase = zzp;
                                        cursor6 = query;
                                    } catch (android.database.sqlite.SQLiteFullException e7) {
                                        e = e7;
                                        sQLiteDatabase = zzp;
                                        cursor6 = query;
                                    } catch (android.database.sqlite.SQLiteException e8) {
                                        e = e8;
                                        sQLiteDatabase = zzp;
                                        cursor6 = query;
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        sQLiteDatabase = zzp;
                                        cursor6 = query;
                                    }
                                }
                                cursor6 = query;
                                java.lang.String[] strArr6 = new java.lang.String[1];
                                strArr6[i4] = java.lang.Long.toString(j3);
                                sQLiteDatabase = zzp;
                                try {
                                    if (sQLiteDatabase.delete("messages", "rowid <= ?", strArr6) < arrayList.size()) {
                                        this.zzu.zzaV().zzb().zza("Fewer entries removed from local database than expected");
                                    }
                                    sQLiteDatabase.setTransactionSuccessful();
                                    sQLiteDatabase.endTransaction();
                                    if (cursor6 != null) {
                                        cursor6.close();
                                    }
                                    sQLiteDatabase.close();
                                    return arrayList;
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException unused9) {
                                    sQLiteDatabase2 = sQLiteDatabase;
                                    i2 = i5;
                                    cursor2 = cursor6;
                                    android.os.SystemClock.sleep(i6);
                                    i6 += 20;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase2 == null) {
                                    }
                                    i5 = i2 + 1;
                                    r6 = 0;
                                    i3 = 5;
                                    i4 = 0;
                                } catch (android.database.sqlite.SQLiteFullException e9) {
                                    e = e9;
                                    i2 = i5;
                                    cursor4 = cursor6;
                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                    this.zzc = true;
                                    if (cursor4 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    i5 = i2 + 1;
                                    r6 = 0;
                                    i3 = 5;
                                    i4 = 0;
                                } catch (android.database.sqlite.SQLiteException e10) {
                                    e = e10;
                                    cursor3 = cursor6;
                                    if (sQLiteDatabase != null) {
                                    }
                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                    this.zzc = true;
                                    if (cursor3 != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    i2 = i5;
                                    i5 = i2 + 1;
                                    r6 = 0;
                                    i3 = 5;
                                    i4 = 0;
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    cursor = cursor6;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                sQLiteDatabase = zzp;
                                if (cursor5 != null) {
                                    try {
                                        cursor5.close();
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException unused10) {
                                        sQLiteDatabase2 = sQLiteDatabase;
                                        i2 = i5;
                                        cursor2 = null;
                                        android.os.SystemClock.sleep(i6);
                                        i6 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase2 == null) {
                                        }
                                        i5 = i2 + 1;
                                        r6 = 0;
                                        i3 = 5;
                                        i4 = 0;
                                    } catch (android.database.sqlite.SQLiteFullException e11) {
                                        e = e11;
                                        i2 = i5;
                                        cursor4 = null;
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursor4 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        i5 = i2 + 1;
                                        r6 = 0;
                                        i3 = 5;
                                        i4 = 0;
                                    } catch (android.database.sqlite.SQLiteException e12) {
                                        e = e12;
                                        cursor3 = null;
                                        if (sQLiteDatabase != null) {
                                        }
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursor3 != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        i2 = i5;
                                        i5 = i2 + 1;
                                        r6 = 0;
                                        i3 = 5;
                                        i4 = 0;
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                        cursor = null;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                            sQLiteDatabase = zzp;
                            cursor5 = null;
                            if (cursor5 != null) {
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th11) {
                        th = th11;
                        sQLiteDatabase = zzp;
                    }
                } catch (android.database.sqlite.SQLiteDatabaseLockedException unused11) {
                    sQLiteDatabase = zzp;
                } catch (android.database.sqlite.SQLiteFullException e13) {
                    e = e13;
                    sQLiteDatabase = zzp;
                } catch (android.database.sqlite.SQLiteException e14) {
                    e = e14;
                    sQLiteDatabase = zzp;
                } catch (java.lang.Throwable th12) {
                    th = th12;
                    sQLiteDatabase = zzp;
                }
            } catch (android.database.sqlite.SQLiteDatabaseLockedException unused12) {
                i2 = i5;
                cursor2 = null;
                sQLiteDatabase2 = null;
            } catch (android.database.sqlite.SQLiteFullException e15) {
                e = e15;
                i2 = i5;
                sQLiteDatabase = null;
            } catch (android.database.sqlite.SQLiteException e16) {
                e = e16;
                sQLiteDatabase = null;
            } catch (java.lang.Throwable th13) {
                th = th13;
                cursor = null;
                sQLiteDatabase = null;
            }
        }
        this.zzu.zzaV().zze().zza("Failed to read events from database in reasonable time");
        return null;
    }

    public final boolean zzn() {
        return zzs(3, new byte[0]);
    }

    public final boolean zzo() {
        zzg();
        if (!this.zzc && zzq()) {
            int i = 0;
            int i2 = 5;
            while (true) {
                if (i >= 5) {
                    this.zzu.zzaV().zze().zza("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            android.database.sqlite.SQLiteDatabase zzp = zzp();
                            if (zzp != null) {
                                zzp.beginTransaction();
                                zzp.delete("messages", "type == ?", new java.lang.String[]{java.lang.Integer.toString(3)});
                                zzp.setTransactionSuccessful();
                                zzp.endTransaction();
                                zzp.close();
                                return true;
                            }
                            this.zzc = true;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException unused) {
                            android.os.SystemClock.sleep(i2);
                            i2 += 20;
                            if (0 == 0) {
                            }
                            sQLiteDatabase.close();
                        }
                    } catch (android.database.sqlite.SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (java.lang.Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e);
                        this.zzc = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (android.database.sqlite.SQLiteFullException e2) {
                    this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e2);
                    this.zzc = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
                i++;
            }
        }
        return false;
    }

    final android.database.sqlite.SQLiteDatabase zzp() throws android.database.sqlite.SQLiteException {
        if (this.zzc) {
            return null;
        }
        android.database.sqlite.SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    final boolean zzq() {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        android.content.Context zzaY = zzibVar.zzaY();
        zzibVar.zzc();
        return zzaY.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
