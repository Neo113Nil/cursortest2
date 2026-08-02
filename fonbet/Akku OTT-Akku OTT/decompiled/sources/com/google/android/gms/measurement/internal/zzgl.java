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
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.f;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzgl extends zzg {
    private static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final zzgj zzb;
    private boolean zzc;

    public zzgl(zzic zzicVar) {
        super(zzicVar);
        Context zzaY = this.zzu.zzaY();
        this.zzu.zzc();
        this.zzb = new zzgj(this, zzaY, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzs(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        boolean z2;
        Cursor cursor;
        zzg();
        boolean z3 = false;
        z3 = false;
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
                                        j = cursor.getLong(z3 ? 1 : 0);
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z = z3 ? 1 : 0;
                                    SystemClock.sleep(i3);
                                    i3 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i2++;
                                    z3 = z;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    z = z3 ? 1 : 0;
                                    this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                    this.zzc = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i2++;
                                    z3 = z;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                    if (sQLiteDatabase != null) {
                                    }
                                    this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                    this.zzc = z2;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i2++;
                                    z3 = z;
                                }
                            }
                            if (j >= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                zzicVar.zzaV().zzb().zza("Data loss, local db full");
                                long j2 = 100001 - j;
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (delete != j2) {
                                    zzgs zzb = zzicVar.zzaV().zzb();
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i3);
                                            i3 += 20;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i2++;
                                                z3 = z;
                                            }
                                            sQLiteDatabase.close();
                                            i2++;
                                            z3 = z;
                                        }
                                        try {
                                            zzb.zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                            sQLiteDatabase.setTransactionSuccessful();
                                            sQLiteDatabase.endTransaction();
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            sQLiteDatabase.close();
                                            return z2;
                                        } catch (SQLiteFullException e3) {
                                            e = e3;
                                            this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                            this.zzc = true;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i2++;
                                                z3 = z;
                                            }
                                            sQLiteDatabase.close();
                                            i2++;
                                            z3 = z;
                                        } catch (SQLiteException e4) {
                                            e = e4;
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
                                            this.zzc = z2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i2++;
                                                z3 = z;
                                            }
                                            sQLiteDatabase.close();
                                            i2++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                        this.zzc = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i2++;
                                        z3 = z;
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        z2 = true;
                                        if (sQLiteDatabase != null) {
                                        }
                                        this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                        this.zzc = z2;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i2++;
                                        z3 = z;
                                    }
                                }
                            }
                            z = z3 ? 1 : 0;
                            z2 = true;
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                            }
                            sQLiteDatabase.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
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
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            this.zzu.zzaV().zzk().zza("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    @WorkerThread
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
    /* JADX WARN: Removed duplicated region for block: B:115:0x0218 A[Catch: SQLiteDatabaseLockedException -> 0x0121, SQLiteException -> 0x01f5, SQLiteFullException -> 0x01f8, all -> 0x036a, TryCatch #4 {all -> 0x036a, blocks: (B:75:0x00de, B:77:0x00e4, B:80:0x00f7, B:82:0x00fd, B:169:0x0134, B:178:0x014c, B:180:0x0151, B:46:0x032f, B:48:0x0335, B:40:0x0338, B:19:0x035a, B:31:0x0376, B:188:0x0186, B:189:0x0189, B:192:0x0182, B:87:0x019c, B:90:0x01b0, B:96:0x01cb, B:99:0x01d4, B:100:0x01d7, B:102:0x01c5, B:105:0x01db, B:113:0x01f1, B:115:0x0218, B:123:0x0222, B:124:0x0225, B:129:0x0212, B:136:0x022b, B:144:0x023f, B:146:0x0264, B:153:0x026e, B:154:0x0271, B:157:0x025e, B:164:0x0276, B:166:0x0286, B:211:0x02c5, B:213:0x02e2, B:214:0x02f1), top: B:45:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0264 A[Catch: SQLiteException -> 0x0243, SQLiteFullException -> 0x0246, SQLiteDatabaseLockedException -> 0x0359, all -> 0x036a, TryCatch #4 {all -> 0x036a, blocks: (B:75:0x00de, B:77:0x00e4, B:80:0x00f7, B:82:0x00fd, B:169:0x0134, B:178:0x014c, B:180:0x0151, B:46:0x032f, B:48:0x0335, B:40:0x0338, B:19:0x035a, B:31:0x0376, B:188:0x0186, B:189:0x0189, B:192:0x0182, B:87:0x019c, B:90:0x01b0, B:96:0x01cb, B:99:0x01d4, B:100:0x01d7, B:102:0x01c5, B:105:0x01db, B:113:0x01f1, B:115:0x0218, B:123:0x0222, B:124:0x0225, B:129:0x0212, B:136:0x022b, B:144:0x023f, B:146:0x0264, B:153:0x026e, B:154:0x0271, B:157:0x025e, B:164:0x0276, B:166:0x0286, B:211:0x02c5, B:213:0x02e2, B:214:0x02f1), top: B:45:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x032f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a2  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzm(int i) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        String str;
        String str2;
        String str3;
        int i2;
        Cursor cursor2;
        Cursor cursor3;
        long j;
        String str4;
        String[] strArr;
        long j2;
        String str5;
        Parcel obtain;
        zzic zzicVar;
        int i3;
        int i4;
        zzbe zzbeVar;
        zzah zzahVar;
        zzpl zzplVar;
        String str6 = "entry";
        String str7 = "type";
        String str8 = "rowid";
        zzg();
        ?? r6 = 0;
        if (this.zzc) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzq()) {
            return arrayList;
        }
        int i5 = 0;
        int i6 = 5;
        int i7 = 0;
        for (int i8 = 5; i7 < i8; i8 = 5) {
            try {
                sQLiteDatabase = zzp();
                try {
                    if (sQLiteDatabase == null) {
                        this.zzc = true;
                        return r6;
                    }
                    try {
                        sQLiteDatabase.beginTransaction();
                        try {
                            cursor3 = sQLiteDatabase.query("messages", new String[]{str8}, "type=?", new String[]{ExifInterface.GPS_MEASUREMENT_3D}, null, null, "rowid desc", "1");
                            try {
                                long j3 = -1;
                                if (cursor3.moveToFirst()) {
                                    j = cursor3.getLong(i5);
                                    cursor3.close();
                                } else {
                                    cursor3.close();
                                    j = -1;
                                }
                                if (j != -1) {
                                    String[] strArr2 = new String[1];
                                    strArr2[i5] = String.valueOf(j);
                                    str4 = "rowid<?";
                                    strArr = strArr2;
                                } else {
                                    str4 = r6;
                                    strArr = str4;
                                }
                                String[] strArr3 = {str8, str7, str6};
                                zzic zzicVar2 = this.zzu;
                                zzal zzc = zzicVar2.zzc();
                                int i9 = 1;
                                zzfx zzfxVar = zzfy.zzbb;
                                boolean zzp = zzc.zzp(r6, zzfxVar);
                                int i10 = 4;
                                int i11 = 3;
                                int i12 = 2;
                                if (zzp) {
                                    strArr3 = new String[i8];
                                    strArr3[i5] = str8;
                                    strArr3[1] = str7;
                                    strArr3[2] = str6;
                                    strArr3[3] = "app_version";
                                    strArr3[4] = "app_version_int";
                                }
                                String[] strArr4 = strArr3;
                                zzic zzicVar3 = zzicVar2;
                                cursor2 = sQLiteDatabase.query("messages", strArr4, str4, strArr, null, null, "rowid asc", Integer.toString(100));
                                while (cursor2.moveToNext()) {
                                    try {
                                        j3 = cursor2.getLong(i5);
                                        int i13 = cursor2.getInt(i9);
                                        byte[] blob = cursor2.getBlob(i12);
                                        try {
                                            if (zzicVar3.zzc().zzp(null, zzfxVar)) {
                                                str5 = cursor2.getString(i11);
                                                j2 = cursor2.getLong(i10);
                                            } else {
                                                j2 = 0;
                                                str5 = null;
                                            }
                                            String str9 = str6;
                                            long j4 = j2;
                                            str2 = str7;
                                            if (i13 == 0) {
                                                try {
                                                    obtain = Parcel.obtain();
                                                    zzicVar = zzicVar3;
                                                    try {
                                                        str3 = str8;
                                                        try {
                                                            try {
                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                obtain.setDataPosition(0);
                                                                zzbg createFromParcel = zzbg.CREATOR.createFromParcel(obtain);
                                                                try {
                                                                    if (createFromParcel != null) {
                                                                        arrayList.add(new zzgk(createFromParcel, str5, j4));
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused) {
                                                                    str = str9;
                                                                    i2 = 0;
                                                                    SystemClock.sleep(i6);
                                                                    i6 += 20;
                                                                    if (cursor2 != null) {
                                                                        cursor2.close();
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                        i7++;
                                                                        i5 = i2;
                                                                        str6 = str;
                                                                        str7 = str2;
                                                                        str8 = str3;
                                                                        r6 = 0;
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i7++;
                                                                    i5 = i2;
                                                                    str6 = str;
                                                                    str7 = str2;
                                                                    str8 = str3;
                                                                    r6 = 0;
                                                                } catch (SQLiteFullException e) {
                                                                    e = e;
                                                                    str = str9;
                                                                    i2 = 0;
                                                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                    this.zzc = true;
                                                                    if (cursor2 != null) {
                                                                        cursor2.close();
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                        i7++;
                                                                        i5 = i2;
                                                                        str6 = str;
                                                                        str7 = str2;
                                                                        str8 = str3;
                                                                        r6 = 0;
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i7++;
                                                                    i5 = i2;
                                                                    str6 = str;
                                                                    str7 = str2;
                                                                    str8 = str3;
                                                                    r6 = 0;
                                                                } catch (SQLiteException e2) {
                                                                    e = e2;
                                                                    str = str9;
                                                                    i2 = 0;
                                                                    if (sQLiteDatabase != null) {
                                                                        try {
                                                                            if (sQLiteDatabase.inTransaction()) {
                                                                                sQLiteDatabase.endTransaction();
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            th = th;
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
                                                                        i7++;
                                                                        i5 = i2;
                                                                        str6 = str;
                                                                        str7 = str2;
                                                                        str8 = str3;
                                                                        r6 = 0;
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i7++;
                                                                    i5 = i2;
                                                                    str6 = str;
                                                                    str7 = str2;
                                                                    str8 = str3;
                                                                    r6 = 0;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                throw th;
                                                            }
                                                        } catch (b.a unused2) {
                                                            this.zzu.zzaV().zzb().zza("Failed to load event from local database");
                                                            obtain.recycle();
                                                            str = str9;
                                                            i4 = 2;
                                                            i3 = 3;
                                                            i2 = 0;
                                                            i11 = i3;
                                                            i5 = i2;
                                                            str6 = str;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            i9 = 1;
                                                            i10 = 4;
                                                            i12 = i4;
                                                            zzicVar3 = zzicVar;
                                                        }
                                                    } catch (b.a unused3) {
                                                        str3 = str8;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused4) {
                                                    str3 = str8;
                                                } catch (SQLiteFullException e3) {
                                                    e = e3;
                                                    str3 = str8;
                                                } catch (SQLiteException e4) {
                                                    e = e4;
                                                    str3 = str8;
                                                }
                                            } else {
                                                zzicVar = zzicVar3;
                                                str3 = str8;
                                                if (i13 == 1) {
                                                    obtain = Parcel.obtain();
                                                    try {
                                                        try {
                                                            obtain.unmarshall(blob, 0, blob.length);
                                                            obtain.setDataPosition(0);
                                                            zzplVar = zzpl.CREATOR.createFromParcel(obtain);
                                                        } finally {
                                                            obtain.recycle();
                                                        }
                                                    } catch (b.a unused5) {
                                                        this.zzu.zzaV().zzb().zza("Failed to load user property from local database");
                                                        obtain.recycle();
                                                        zzplVar = null;
                                                    }
                                                    if (zzplVar != null) {
                                                        arrayList.add(new zzgk(zzplVar, str5, j4));
                                                    }
                                                } else {
                                                    i4 = 2;
                                                    if (i13 == 2) {
                                                        obtain = Parcel.obtain();
                                                        try {
                                                            str = str9;
                                                            try {
                                                                try {
                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                    obtain.setDataPosition(0);
                                                                    zzahVar = zzah.CREATOR.createFromParcel(obtain);
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    throw th;
                                                                }
                                                            } catch (b.a unused6) {
                                                                this.zzu.zzaV().zzb().zza("Failed to load conditional user property from local database");
                                                                obtain.recycle();
                                                                zzahVar = null;
                                                                if (zzahVar != null) {
                                                                }
                                                                i3 = 3;
                                                                i2 = 0;
                                                                i11 = i3;
                                                                i5 = i2;
                                                                str6 = str;
                                                                str7 = str2;
                                                                str8 = str3;
                                                                i9 = 1;
                                                                i10 = 4;
                                                                i12 = i4;
                                                                zzicVar3 = zzicVar;
                                                            }
                                                        } catch (b.a unused7) {
                                                            str = str9;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            str = str9;
                                                        }
                                                        try {
                                                            if (zzahVar != null) {
                                                                arrayList.add(new zzgk(zzahVar, str5, j4));
                                                            }
                                                            i3 = 3;
                                                            i2 = 0;
                                                            i11 = i3;
                                                            i5 = i2;
                                                            str6 = str;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            i9 = 1;
                                                            i10 = 4;
                                                            i12 = i4;
                                                            zzicVar3 = zzicVar;
                                                        } catch (SQLiteDatabaseLockedException unused8) {
                                                            i2 = 0;
                                                            SystemClock.sleep(i6);
                                                            i6 += 20;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i7++;
                                                            i5 = i2;
                                                            str6 = str;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            r6 = 0;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            i2 = 0;
                                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                            this.zzc = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i7++;
                                                            i5 = i2;
                                                            str6 = str;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            r6 = 0;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            i2 = 0;
                                                            if (sQLiteDatabase != null) {
                                                            }
                                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                            this.zzc = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i7++;
                                                            i5 = i2;
                                                            str6 = str;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            r6 = 0;
                                                        }
                                                    } else {
                                                        str = str9;
                                                        if (i13 == 4) {
                                                            obtain = Parcel.obtain();
                                                            try {
                                                                i2 = 0;
                                                                try {
                                                                    try {
                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                        obtain.setDataPosition(0);
                                                                        zzbeVar = zzbe.CREATOR.createFromParcel(obtain);
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        throw th;
                                                                    }
                                                                } catch (b.a unused9) {
                                                                    this.zzu.zzaV().zzb().zza("Failed to load default event parameters from local database");
                                                                    obtain.recycle();
                                                                    zzbeVar = null;
                                                                    if (zzbeVar != null) {
                                                                    }
                                                                    i3 = 3;
                                                                    i11 = i3;
                                                                    i5 = i2;
                                                                    str6 = str;
                                                                    str7 = str2;
                                                                    str8 = str3;
                                                                    i9 = 1;
                                                                    i10 = 4;
                                                                    i12 = i4;
                                                                    zzicVar3 = zzicVar;
                                                                }
                                                            } catch (b.a unused10) {
                                                                i2 = 0;
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                            }
                                                            try {
                                                                if (zzbeVar != null) {
                                                                    arrayList.add(new zzgk(zzbeVar, str5, j4));
                                                                }
                                                                i3 = 3;
                                                            } catch (SQLiteDatabaseLockedException unused11) {
                                                                SystemClock.sleep(i6);
                                                                i6 += 20;
                                                                if (cursor2 != null) {
                                                                }
                                                                if (sQLiteDatabase == null) {
                                                                }
                                                                sQLiteDatabase.close();
                                                                i7++;
                                                                i5 = i2;
                                                                str6 = str;
                                                                str7 = str2;
                                                                str8 = str3;
                                                                r6 = 0;
                                                            } catch (SQLiteFullException e7) {
                                                                e = e7;
                                                                this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                this.zzc = true;
                                                                if (cursor2 != null) {
                                                                }
                                                                if (sQLiteDatabase == null) {
                                                                }
                                                                sQLiteDatabase.close();
                                                                i7++;
                                                                i5 = i2;
                                                                str6 = str;
                                                                str7 = str2;
                                                                str8 = str3;
                                                                r6 = 0;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                if (sQLiteDatabase != null) {
                                                                }
                                                                this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                this.zzc = true;
                                                                if (cursor2 != null) {
                                                                }
                                                                if (sQLiteDatabase == null) {
                                                                }
                                                                sQLiteDatabase.close();
                                                                i7++;
                                                                i5 = i2;
                                                                str6 = str;
                                                                str7 = str2;
                                                                str8 = str3;
                                                                r6 = 0;
                                                            }
                                                        } else {
                                                            i3 = 3;
                                                            i2 = 0;
                                                            if (i13 == 3) {
                                                                this.zzu.zzaV().zzk().zza("Skipping app launch break");
                                                            } else {
                                                                this.zzu.zzaV().zzb().zza("Unknown record type in local database");
                                                            }
                                                        }
                                                        i11 = i3;
                                                        i5 = i2;
                                                        str6 = str;
                                                        str7 = str2;
                                                        str8 = str3;
                                                        i9 = 1;
                                                        i10 = 4;
                                                        i12 = i4;
                                                        zzicVar3 = zzicVar;
                                                    }
                                                }
                                            }
                                            str = str9;
                                            i4 = 2;
                                            i3 = 3;
                                            i2 = 0;
                                            i11 = i3;
                                            i5 = i2;
                                            str6 = str;
                                            str7 = str2;
                                            str8 = str3;
                                            i9 = 1;
                                            i10 = 4;
                                            i12 = i4;
                                            zzicVar3 = zzicVar;
                                        } catch (SQLiteDatabaseLockedException unused12) {
                                            str = str6;
                                            str2 = str7;
                                            str3 = str8;
                                        } catch (SQLiteFullException e9) {
                                            e = e9;
                                            str = str6;
                                            str2 = str7;
                                            str3 = str8;
                                        } catch (SQLiteException e10) {
                                            e = e10;
                                            str = str6;
                                            str2 = str7;
                                            str3 = str8;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused13) {
                                        str = str6;
                                        str2 = str7;
                                        str3 = str8;
                                        i2 = i5;
                                    } catch (SQLiteFullException e11) {
                                        e = e11;
                                        str = str6;
                                        str2 = str7;
                                        str3 = str8;
                                        i2 = i5;
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        str = str6;
                                        str2 = str7;
                                        str3 = str8;
                                        i2 = i5;
                                    }
                                }
                                if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j3)}) < arrayList.size()) {
                                    this.zzu.zzaV().zzb().zza("Fewer entries removed from local database than expected");
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                cursor2.close();
                                sQLiteDatabase.close();
                                return arrayList;
                            } catch (Throwable th8) {
                                th = th8;
                                str = str6;
                                str2 = str7;
                                str3 = str8;
                                i2 = i5;
                                if (cursor3 != null) {
                                    try {
                                        cursor3.close();
                                    } catch (SQLiteDatabaseLockedException unused14) {
                                        cursor2 = null;
                                        SystemClock.sleep(i6);
                                        i6 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i7++;
                                        i5 = i2;
                                        str6 = str;
                                        str7 = str2;
                                        str8 = str3;
                                        r6 = 0;
                                    } catch (SQLiteFullException e13) {
                                        e = e13;
                                        cursor2 = null;
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i7++;
                                        i5 = i2;
                                        str6 = str;
                                        str7 = str2;
                                        str8 = str3;
                                        r6 = 0;
                                    } catch (SQLiteException e14) {
                                        e = e14;
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
                                        i7++;
                                        i5 = i2;
                                        str6 = str;
                                        str7 = str2;
                                        str8 = str3;
                                        r6 = 0;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            str = str6;
                            str2 = str7;
                            str3 = str8;
                            i2 = i5;
                            cursor3 = null;
                        }
                    } catch (SQLiteDatabaseLockedException unused15) {
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        i2 = i5;
                    } catch (SQLiteFullException e15) {
                        e = e15;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        i2 = i5;
                    } catch (SQLiteException e16) {
                        e = e16;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        i2 = i5;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    cursor = null;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused16) {
                str = str6;
                str2 = str7;
                str3 = str8;
                i2 = i5;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e17) {
                e = e17;
                str = str6;
                str2 = str7;
                str3 = str8;
                i2 = i5;
                sQLiteDatabase = null;
            } catch (SQLiteException e18) {
                e = e18;
                str = str6;
                str2 = str7;
                str3 = str8;
                i2 = i5;
                sQLiteDatabase = null;
            } catch (Throwable th11) {
                th = th11;
                cursor = null;
                sQLiteDatabase = null;
            }
        }
        f.c(this.zzu, "Failed to read events from database in reasonable time");
        return null;
    }

    @WorkerThread
    public final boolean zzn() {
        return zzs(3, new byte[0]);
    }

    @WorkerThread
    public final boolean zzo() {
        zzg();
        if (!this.zzc && zzq()) {
            int i = 5;
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    f.c(this.zzu, "Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
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
                } catch (SQLiteFullException e) {
                    this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e);
                    this.zzc = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e2) {
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
                    this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e2);
                    this.zzc = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
                i2++;
            }
        }
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase zzp() throws SQLiteException {
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

    @VisibleForTesting
    public final boolean zzq() {
        zzic zzicVar = this.zzu;
        Context zzaY = zzicVar.zzaY();
        zzicVar.zzc();
        return zzaY.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
