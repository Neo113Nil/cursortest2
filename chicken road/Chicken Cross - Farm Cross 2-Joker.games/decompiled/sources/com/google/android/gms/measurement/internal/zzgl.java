package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@23.0.0 */
/* loaded from: classes8.dex */
public final class zzgl extends zzg {
    private static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final zzgj zzb;
    private boolean zzc;

    zzgl(zzic zzicVar) {
        super(zzicVar);
        Context zzaY = this.zzu.zzaY();
        this.zzu.zzc();
        this.zzb = new zzgj(this, zzaY, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzs(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        zzg();
        boolean z = false;
        z = false;
        if (!this.zzc) {
            zzic zzicVar = this.zzu;
            zzal zzc = zzicVar.zzc();
            zzfx zzfxVar = zzfy.zzbb;
            Cursor cursor2 = null;
            zzr zzh = zzc.zzp(null, zzfxVar) ? this.zzu.zzv().zzh(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (zzicVar.zzc().zzp(null, zzfxVar) && zzh != null) {
                contentValues.put("app_version", zzh.zzc);
                contentValues.put("app_version_int", Long.valueOf(zzh.zzj));
            }
            zzicVar.zzc();
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
                                } catch (SQLiteDatabaseLockedException unused) {
                                    SystemClock.sleep(i3);
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
                                } catch (SQLiteFullException e) {
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
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    if (sQLiteDatabase != null) {
                                        try {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        } catch (Throwable th) {
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
                            if (j >= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                zzicVar.zzaV().zzb().zza("Data loss, local db full");
                                String[] strArr = new String[1];
                                long j2 = 100001 - j;
                                strArr[z ? 1 : 0] = Long.toString(j2);
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                                if (delete != j2) {
                                    zzicVar.zzaV().zzb().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
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
                        } catch (SQLiteDatabaseLockedException unused2) {
                            cursor = null;
                        } catch (SQLiteFullException e3) {
                            e = e3;
                            cursor = null;
                        } catch (SQLiteException e4) {
                            e = e4;
                            cursor = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused3) {
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e5) {
                    e = e5;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e6) {
                    e = e6;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th3) {
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
            SQLiteDatabase zzp = zzp();
            if (zzp == null || (delete = zzp.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzu.zzaV().zzk().zzb("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            this.zzu.zzaV().zzb().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzi(zzbg zzbgVar) {
        Parcel obtain = Parcel.obtain();
        zzbh.zza(zzbgVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzs(0, marshall);
        }
        this.zzu.zzaV().zzc().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzj(zzpl zzplVar) {
        Parcel obtain = Parcel.obtain();
        zzpm.zza(zzplVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzs(1, marshall);
        }
        this.zzu.zzaV().zzc().zza("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzk(zzah zzahVar) {
        zzic zzicVar = this.zzu;
        byte[] zzae = zzicVar.zzk().zzae(zzahVar);
        if (zzae.length <= 131072) {
            return zzs(2, zzae);
        }
        zzicVar.zzaV().zzc().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzl(zzbe zzbeVar) {
        zzic zzicVar = this.zzu;
        byte[] zzae = zzicVar.zzk().zzae(zzbeVar);
        if (zzae == null) {
            zzicVar.zzaV().zzc().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (zzae.length <= 131072) {
            return zzs(4, zzae);
        }
        zzicVar.zzaV().zzc().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0325 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0361 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03cb  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzm(int i) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        int i2;
        int i3;
        int i4;
        Cursor cursor2;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor3;
        long j;
        String str;
        String[] strArr;
        int i5;
        SQLiteDatabase sQLiteDatabase3;
        String[] strArr2;
        long j2;
        String str2;
        Parcel obtain;
        zzbe zzbeVar;
        zzah zzahVar;
        zzpl zzplVar;
        zzg();
        ?? r6 = 0;
        if (this.zzc) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzq()) {
            return arrayList;
        }
        int i6 = 5;
        int i7 = 0;
        int i8 = 5;
        int i9 = 0;
        while (i9 < i6) {
            int i10 = 1;
            try {
                SQLiteDatabase zzp = zzp();
                if (zzp == null) {
                    this.zzc = true;
                    return r6;
                }
                try {
                    zzp.beginTransaction();
                    try {
                        String[] strArr3 = new String[1];
                        strArr3[i7] = "rowid";
                        try {
                            String[] strArr4 = new String[1];
                            strArr4[i7] = ExifInterface.GPS_MEASUREMENT_3D;
                            try {
                                cursor3 = zzp.query("messages", strArr3, "type=?", strArr4, null, null, "rowid desc", "1");
                                try {
                                    long j3 = -1;
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            j = cursor3.getLong(i7);
                                            if (cursor3 != null) {
                                                try {
                                                    cursor3.close();
                                                } catch (SQLiteDatabaseLockedException unused) {
                                                    i3 = i7;
                                                    i4 = i9;
                                                    sQLiteDatabase2 = zzp;
                                                    i2 = 5;
                                                    sQLiteDatabase = sQLiteDatabase2;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i8);
                                                    i8 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i9 = i4 + 1;
                                                    i7 = i3;
                                                    i6 = i2;
                                                    r6 = 0;
                                                } catch (SQLiteFullException e) {
                                                    e = e;
                                                    i3 = i7;
                                                    i4 = i9;
                                                    sQLiteDatabase2 = zzp;
                                                    i2 = 5;
                                                    sQLiteDatabase = sQLiteDatabase2;
                                                    cursor2 = null;
                                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                    this.zzc = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i9 = i4 + 1;
                                                    i7 = i3;
                                                    i6 = i2;
                                                    r6 = 0;
                                                } catch (SQLiteException e2) {
                                                    e = e2;
                                                    i3 = i7;
                                                    i4 = i9;
                                                    sQLiteDatabase2 = zzp;
                                                    i2 = 5;
                                                    sQLiteDatabase = sQLiteDatabase2;
                                                    cursor2 = null;
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                    this.zzc = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i9 = i4 + 1;
                                                    i7 = i3;
                                                    i6 = i2;
                                                    r6 = 0;
                                                }
                                            }
                                        } else {
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            j = -1;
                                        }
                                        if (j != -1) {
                                            String[] strArr5 = new String[1];
                                            strArr5[i7] = String.valueOf(j);
                                            str = "rowid<?";
                                            strArr = strArr5;
                                        } else {
                                            str = r6;
                                            strArr = str;
                                        }
                                        String[] strArr6 = new String[3];
                                        strArr6[i7] = "rowid";
                                        strArr6[1] = "type";
                                        strArr6[2] = "entry";
                                        zzic zzicVar = this.zzu;
                                        zzal zzc = zzicVar.zzc();
                                        zzfx zzfxVar = zzfy.zzbb;
                                        if (zzc.zzp(r6, zzfxVar)) {
                                            i5 = 5;
                                            try {
                                                strArr6 = new String[5];
                                                strArr6[i7] = "rowid";
                                                strArr6[1] = "type";
                                                strArr6[2] = "entry";
                                                strArr6[3] = "app_version";
                                                strArr6[4] = "app_version_int";
                                            } catch (SQLiteDatabaseLockedException unused2) {
                                                i3 = i7;
                                                i4 = i9;
                                                i2 = i5;
                                                sQLiteDatabase2 = zzp;
                                                sQLiteDatabase = sQLiteDatabase2;
                                                cursor2 = null;
                                                SystemClock.sleep(i8);
                                                i8 += 20;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i9 = i4 + 1;
                                                i7 = i3;
                                                i6 = i2;
                                                r6 = 0;
                                            } catch (SQLiteFullException e3) {
                                                e = e3;
                                                i3 = i7;
                                                i4 = i9;
                                                i2 = i5;
                                                sQLiteDatabase2 = zzp;
                                                sQLiteDatabase = sQLiteDatabase2;
                                                cursor2 = null;
                                                this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                this.zzc = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i9 = i4 + 1;
                                                i7 = i3;
                                                i6 = i2;
                                                r6 = 0;
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                i3 = i7;
                                                i4 = i9;
                                                i2 = i5;
                                                sQLiteDatabase2 = zzp;
                                                sQLiteDatabase = sQLiteDatabase2;
                                                cursor2 = null;
                                                if (sQLiteDatabase != null) {
                                                }
                                                this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                this.zzc = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i9 = i4 + 1;
                                                i7 = i3;
                                                i6 = i2;
                                                r6 = 0;
                                            }
                                        } else {
                                            i5 = 5;
                                        }
                                        i2 = i5;
                                        int i11 = 2;
                                        try {
                                            cursor2 = zzp.query("messages", strArr6, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                            while (cursor2.moveToNext()) {
                                                try {
                                                    try {
                                                        try {
                                                            j3 = cursor2.getLong(i7);
                                                            int i12 = cursor2.getInt(i10);
                                                            byte[] blob = cursor2.getBlob(i11);
                                                            if (zzicVar.zzc().zzp(null, zzfxVar)) {
                                                                str2 = cursor2.getString(3);
                                                                j2 = cursor2.getLong(4);
                                                            } else {
                                                                j2 = 0;
                                                                str2 = null;
                                                            }
                                                            if (i12 == 0) {
                                                                obtain = Parcel.obtain();
                                                                try {
                                                                    obtain.unmarshall(blob, i7, blob.length);
                                                                    obtain.setDataPosition(i7);
                                                                    zzbg createFromParcel = zzbg.CREATOR.createFromParcel(obtain);
                                                                    if (createFromParcel != null) {
                                                                        i4 = i9;
                                                                        try {
                                                                            arrayList.add(new zzgk(createFromParcel, str2, j2));
                                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                                            sQLiteDatabase3 = zzp;
                                                                            i3 = 0;
                                                                            sQLiteDatabase = sQLiteDatabase3;
                                                                            SystemClock.sleep(i8);
                                                                            i8 += 20;
                                                                            if (cursor2 != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i9 = i4 + 1;
                                                                            i7 = i3;
                                                                            i6 = i2;
                                                                            r6 = 0;
                                                                        } catch (SQLiteFullException e5) {
                                                                            e = e5;
                                                                            sQLiteDatabase3 = zzp;
                                                                            i3 = 0;
                                                                            sQLiteDatabase = sQLiteDatabase3;
                                                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                            this.zzc = true;
                                                                            if (cursor2 != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i9 = i4 + 1;
                                                                            i7 = i3;
                                                                            i6 = i2;
                                                                            r6 = 0;
                                                                        } catch (SQLiteException e6) {
                                                                            e = e6;
                                                                            sQLiteDatabase3 = zzp;
                                                                            i3 = 0;
                                                                            sQLiteDatabase = sQLiteDatabase3;
                                                                            if (sQLiteDatabase != null) {
                                                                            }
                                                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                            this.zzc = true;
                                                                            if (cursor2 != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i9 = i4 + 1;
                                                                            i7 = i3;
                                                                            i6 = i2;
                                                                            r6 = 0;
                                                                        }
                                                                    } else {
                                                                        i4 = i9;
                                                                    }
                                                                } catch (SafeParcelReader.ParseException unused4) {
                                                                    i4 = i9;
                                                                    try {
                                                                        this.zzu.zzaV().zzb().zza("Failed to load event from local database");
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    throw th;
                                                                }
                                                            } else {
                                                                i4 = i9;
                                                                long j4 = j2;
                                                                if (i12 == i10) {
                                                                    obtain = Parcel.obtain();
                                                                    try {
                                                                        try {
                                                                            obtain.unmarshall(blob, 0, blob.length);
                                                                            obtain.setDataPosition(0);
                                                                            zzplVar = zzpl.CREATOR.createFromParcel(obtain);
                                                                        } catch (SafeParcelReader.ParseException unused5) {
                                                                            this.zzu.zzaV().zzb().zza("Failed to load user property from local database");
                                                                            obtain.recycle();
                                                                            zzplVar = null;
                                                                        }
                                                                        if (zzplVar != null) {
                                                                            arrayList.add(new zzgk(zzplVar, str2, j4));
                                                                        }
                                                                    } finally {
                                                                    }
                                                                } else if (i12 == 2) {
                                                                    obtain = Parcel.obtain();
                                                                    try {
                                                                        try {
                                                                            obtain.unmarshall(blob, 0, blob.length);
                                                                            obtain.setDataPosition(0);
                                                                            zzahVar = zzah.CREATOR.createFromParcel(obtain);
                                                                        } finally {
                                                                        }
                                                                    } catch (SafeParcelReader.ParseException unused6) {
                                                                        this.zzu.zzaV().zzb().zza("Failed to load conditional user property from local database");
                                                                        obtain.recycle();
                                                                        zzahVar = null;
                                                                    }
                                                                    if (zzahVar != null) {
                                                                        arrayList.add(new zzgk(zzahVar, str2, j4));
                                                                    }
                                                                } else if (i12 == 4) {
                                                                    obtain = Parcel.obtain();
                                                                    try {
                                                                        try {
                                                                            obtain.unmarshall(blob, 0, blob.length);
                                                                            obtain.setDataPosition(0);
                                                                            zzbeVar = zzbe.CREATOR.createFromParcel(obtain);
                                                                        } catch (SafeParcelReader.ParseException unused7) {
                                                                            this.zzu.zzaV().zzb().zza("Failed to load default event parameters from local database");
                                                                            obtain.recycle();
                                                                            zzbeVar = null;
                                                                        }
                                                                        if (zzbeVar != null) {
                                                                            arrayList.add(new zzgk(zzbeVar, str2, j4));
                                                                        }
                                                                    } finally {
                                                                    }
                                                                } else {
                                                                    if (i12 == 3) {
                                                                        this.zzu.zzaV().zzk().zza("Skipping app launch break");
                                                                    } else {
                                                                        this.zzu.zzaV().zzb().zza("Unknown record type in local database");
                                                                    }
                                                                    i9 = i4;
                                                                    i11 = 2;
                                                                    i7 = 0;
                                                                    i10 = 1;
                                                                }
                                                            }
                                                            i9 = i4;
                                                            i11 = 2;
                                                            i7 = 0;
                                                            i10 = 1;
                                                        } catch (SQLiteDatabaseLockedException unused8) {
                                                            i4 = i9;
                                                            i3 = i7;
                                                            sQLiteDatabase3 = zzp;
                                                            sQLiteDatabase = sQLiteDatabase3;
                                                            SystemClock.sleep(i8);
                                                            i8 += 20;
                                                            if (cursor2 != null) {
                                                                cursor2.close();
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                                i9 = i4 + 1;
                                                                i7 = i3;
                                                                i6 = i2;
                                                                r6 = 0;
                                                            }
                                                            sQLiteDatabase.close();
                                                            i9 = i4 + 1;
                                                            i7 = i3;
                                                            i6 = i2;
                                                            r6 = 0;
                                                        } catch (SQLiteFullException e7) {
                                                            e = e7;
                                                            i4 = i9;
                                                        } catch (SQLiteException e8) {
                                                            e = e8;
                                                            i4 = i9;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        sQLiteDatabase3 = zzp;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused9) {
                                                    i3 = i7;
                                                    i4 = i9;
                                                } catch (SQLiteFullException e9) {
                                                    e = e9;
                                                    i3 = i7;
                                                    i4 = i9;
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    i3 = i7;
                                                    i4 = i9;
                                                }
                                            }
                                            i4 = i9;
                                            strArr2 = new String[1];
                                            i3 = 0;
                                        } catch (SQLiteDatabaseLockedException unused10) {
                                            i3 = i7;
                                            i4 = i9;
                                            sQLiteDatabase2 = zzp;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            cursor2 = null;
                                            SystemClock.sleep(i8);
                                            i8 += 20;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i9 = i4 + 1;
                                            i7 = i3;
                                            i6 = i2;
                                            r6 = 0;
                                        } catch (SQLiteFullException e11) {
                                            e = e11;
                                            i3 = i7;
                                            i4 = i9;
                                            sQLiteDatabase2 = zzp;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            cursor2 = null;
                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                            this.zzc = true;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i9 = i4 + 1;
                                                i7 = i3;
                                                i6 = i2;
                                                r6 = 0;
                                            }
                                            sQLiteDatabase.close();
                                            i9 = i4 + 1;
                                            i7 = i3;
                                            i6 = i2;
                                            r6 = 0;
                                        } catch (SQLiteException e12) {
                                            e = e12;
                                            i3 = i7;
                                            i4 = i9;
                                            sQLiteDatabase2 = zzp;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            cursor2 = null;
                                            if (sQLiteDatabase != null) {
                                                try {
                                                    if (sQLiteDatabase.inTransaction()) {
                                                        sQLiteDatabase.endTransaction();
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    cursor = cursor2;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.close();
                                                    }
                                                    throw th;
                                                }
                                            }
                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                            this.zzc = true;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i9 = i4 + 1;
                                                i7 = i3;
                                                i6 = i2;
                                                r6 = 0;
                                            }
                                            sQLiteDatabase.close();
                                            i9 = i4 + 1;
                                            i7 = i3;
                                            i6 = i2;
                                            r6 = 0;
                                        }
                                        try {
                                            strArr2[0] = Long.toString(j3);
                                            sQLiteDatabase3 = zzp;
                                        } catch (SQLiteDatabaseLockedException unused11) {
                                            sQLiteDatabase3 = zzp;
                                            sQLiteDatabase = sQLiteDatabase3;
                                            SystemClock.sleep(i8);
                                            i8 += 20;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i9 = i4 + 1;
                                            i7 = i3;
                                            i6 = i2;
                                            r6 = 0;
                                        } catch (SQLiteFullException e13) {
                                            e = e13;
                                            sQLiteDatabase3 = zzp;
                                            sQLiteDatabase = sQLiteDatabase3;
                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                            this.zzc = true;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i9 = i4 + 1;
                                            i7 = i3;
                                            i6 = i2;
                                            r6 = 0;
                                        } catch (SQLiteException e14) {
                                            e = e14;
                                            sQLiteDatabase3 = zzp;
                                            sQLiteDatabase = sQLiteDatabase3;
                                            if (sQLiteDatabase != null) {
                                            }
                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                            this.zzc = true;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i9 = i4 + 1;
                                            i7 = i3;
                                            i6 = i2;
                                            r6 = 0;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        sQLiteDatabase2 = zzp;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        cursor = null;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    i3 = i7;
                                    i4 = i9;
                                    sQLiteDatabase2 = zzp;
                                    i2 = 5;
                                    if (cursor3 != null) {
                                        try {
                                            cursor3.close();
                                        } catch (SQLiteDatabaseLockedException unused12) {
                                            sQLiteDatabase = sQLiteDatabase2;
                                            cursor2 = null;
                                            SystemClock.sleep(i8);
                                            i8 += 20;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i9 = i4 + 1;
                                            i7 = i3;
                                            i6 = i2;
                                            r6 = 0;
                                        } catch (SQLiteFullException e15) {
                                            e = e15;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            cursor2 = null;
                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                            this.zzc = true;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i9 = i4 + 1;
                                            i7 = i3;
                                            i6 = i2;
                                            r6 = 0;
                                        } catch (SQLiteException e16) {
                                            e = e16;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            cursor2 = null;
                                            if (sQLiteDatabase != null) {
                                            }
                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                            this.zzc = true;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i9 = i4 + 1;
                                            i7 = i3;
                                            i6 = i2;
                                            r6 = 0;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            sQLiteDatabase = sQLiteDatabase2;
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
                            } catch (Throwable th8) {
                                th = th8;
                                i3 = i7;
                                i4 = i9;
                                sQLiteDatabase2 = zzp;
                                i2 = 5;
                                cursor3 = null;
                                if (cursor3 != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            i3 = i7;
                            i4 = i9;
                            sQLiteDatabase2 = zzp;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        i2 = i6;
                        i3 = i7;
                        i4 = i9;
                        sQLiteDatabase2 = zzp;
                    }
                } catch (SQLiteDatabaseLockedException unused13) {
                    i2 = i6;
                    i3 = i7;
                    i4 = i9;
                    sQLiteDatabase2 = zzp;
                } catch (SQLiteFullException e17) {
                    e = e17;
                    i2 = i6;
                    i3 = i7;
                    i4 = i9;
                    sQLiteDatabase2 = zzp;
                } catch (SQLiteException e18) {
                    e = e18;
                    i2 = i6;
                    i3 = i7;
                    i4 = i9;
                    sQLiteDatabase2 = zzp;
                } catch (Throwable th11) {
                    th = th11;
                    sQLiteDatabase2 = zzp;
                }
                try {
                    if (sQLiteDatabase3.delete("messages", "rowid <= ?", strArr2) < arrayList.size()) {
                        this.zzu.zzaV().zzb().zza("Fewer entries removed from local database than expected");
                    }
                    sQLiteDatabase3.setTransactionSuccessful();
                    sQLiteDatabase3.endTransaction();
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    sQLiteDatabase3.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused14) {
                    sQLiteDatabase = sQLiteDatabase3;
                    SystemClock.sleep(i8);
                    i8 += 20;
                    if (cursor2 != null) {
                    }
                    if (sQLiteDatabase == null) {
                    }
                    sQLiteDatabase.close();
                    i9 = i4 + 1;
                    i7 = i3;
                    i6 = i2;
                    r6 = 0;
                } catch (SQLiteFullException e19) {
                    e = e19;
                    sQLiteDatabase = sQLiteDatabase3;
                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                    this.zzc = true;
                    if (cursor2 != null) {
                    }
                    if (sQLiteDatabase == null) {
                    }
                    sQLiteDatabase.close();
                    i9 = i4 + 1;
                    i7 = i3;
                    i6 = i2;
                    r6 = 0;
                } catch (SQLiteException e20) {
                    e = e20;
                    sQLiteDatabase = sQLiteDatabase3;
                    if (sQLiteDatabase != null) {
                    }
                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                    this.zzc = true;
                    if (cursor2 != null) {
                    }
                    if (sQLiteDatabase == null) {
                    }
                    sQLiteDatabase.close();
                    i9 = i4 + 1;
                    i7 = i3;
                    i6 = i2;
                    r6 = 0;
                } catch (Throwable th12) {
                    th = th12;
                    cursor = cursor2;
                    sQLiteDatabase = sQLiteDatabase3;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused15) {
                i2 = i6;
                i3 = i7;
                i4 = i9;
                cursor2 = null;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e21) {
                e = e21;
                i2 = i6;
                i3 = i7;
                i4 = i9;
                cursor2 = null;
                sQLiteDatabase = null;
            } catch (SQLiteException e22) {
                e = e22;
                i2 = i6;
                i3 = i7;
                i4 = i9;
                cursor2 = null;
                sQLiteDatabase = null;
            } catch (Throwable th13) {
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
            int i = 5;
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    this.zzu.zzaV().zze().zza("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase zzp = zzp();
                            if (zzp != null) {
                                zzp.beginTransaction();
                                zzp.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                zzp.setTransactionSuccessful();
                                zzp.endTransaction();
                                zzp.close();
                                return true;
                            }
                            this.zzc = true;
                        } catch (SQLiteDatabaseLockedException unused) {
                            SystemClock.sleep(i);
                            i += 20;
                            if (0 == 0) {
                            }
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
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
                } catch (SQLiteFullException e2) {
                    this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e2);
                    this.zzc = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
                i2++;
            }
        }
        return false;
    }

    final SQLiteDatabase zzp() throws SQLiteException {
        if (this.zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    final boolean zzq() {
        zzic zzicVar = this.zzu;
        Context zzaY = zzicVar.zzaY();
        zzicVar.zzc();
        return zzaY.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
