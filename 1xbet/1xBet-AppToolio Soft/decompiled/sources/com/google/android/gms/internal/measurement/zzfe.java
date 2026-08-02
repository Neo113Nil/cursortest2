package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfe extends zzdz {
    private final zzff zzakf;
    private boolean zzakg;

    zzfe(zzgn zzgnVar) {
        super(zzgnVar);
        this.zzakf = new zzff(this, getContext(), "google_app_measurement_local.db");
    }

    @WorkerThread
    @VisibleForTesting
    private final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        if (this.zzakg) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzakf.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzakg = true;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zza(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        zzfv();
        zzab();
        ?? r2 = 0;
        if (this.zzakg) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(AppMeasurement.Param.TYPE, Integer.valueOf(i));
        contentValues.put("entry", bArr);
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            SQLiteDatabase sQLiteDatabase2 = null;
            r7 = null;
            r7 = null;
            Cursor cursor4 = null;
            Cursor cursor5 = null;
            try {
                sQLiteDatabase = getWritableDatabase();
                try {
                    if (sQLiteDatabase == null) {
                        this.zzakg = true;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        return r2;
                    }
                    sQLiteDatabase.beginTransaction();
                    long j = 0;
                    Cursor rawQuery = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                    if (rawQuery != 0) {
                        try {
                            if (rawQuery.moveToFirst()) {
                                j = rawQuery.getLong(r2);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            cursor4 = rawQuery;
                            SystemClock.sleep(i3);
                            i3 += 20;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            if (sQLiteDatabase == null) {
                                i2++;
                                r2 = 0;
                            }
                            sQLiteDatabase.close();
                            i2++;
                            r2 = 0;
                        } catch (SQLiteFullException e) {
                            e = e;
                            cursor5 = rawQuery;
                            try {
                                zzgi().zziv().zzg("Error writing entry to local database", e);
                                this.zzakg = true;
                                if (cursor5 != null) {
                                    cursor5.close();
                                }
                                if (sQLiteDatabase == null) {
                                    i2++;
                                    r2 = 0;
                                }
                                sQLiteDatabase.close();
                                i2++;
                                r2 = 0;
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursor5;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            cursor3 = rawQuery;
                            sQLiteDatabase2 = sQLiteDatabase;
                            cursor2 = cursor3;
                            if (sQLiteDatabase2 != null) {
                                try {
                                    if (sQLiteDatabase2.inTransaction()) {
                                        sQLiteDatabase2.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabase = sQLiteDatabase2;
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
                            zzgi().zziv().zzg("Error writing entry to local database", e);
                            this.zzakg = true;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = rawQuery;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                    if (j >= 100000) {
                        zzgi().zziv().log("Data loss, local db full");
                        long j2 = (100000 - j) + 1;
                        String[] strArr = new String[1];
                        strArr[r2] = Long.toString(j2);
                        long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (delete != j2) {
                            zzgi().zziv().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                        }
                    }
                    sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    if (rawQuery != 0) {
                        rawQuery.close();
                    }
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e3) {
                    e = e3;
                } catch (SQLiteException e4) {
                    e = e4;
                    cursor3 = null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabase = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                sQLiteDatabase = null;
            } catch (SQLiteException e6) {
                e = e6;
                cursor2 = null;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabase = null;
                cursor = null;
            }
        }
        zzgi().zziy().log("Failed to write entry to local database");
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @WorkerThread
    public final void resetAnalyticsData() {
        zzfv();
        zzab();
        try {
            int delete = getWritableDatabase().delete("messages", null, null) + 0;
            if (delete > 0) {
                zzgi().zzjc().zzg("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzgi().zziv().zzg("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zza(zzex zzexVar) {
        Parcel obtain = Parcel.obtain();
        zzexVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zza(0, marshall);
        }
        zzgi().zziy().log("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zza(zzka zzkaVar) {
        Parcel obtain = Parcel.obtain();
        zzkaVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zza(1, marshall);
        }
        zzgi().zziy().log("User property too long for local database. Sending directly to service");
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy, com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    public final boolean zzc(zzef zzefVar) {
        zzgg();
        byte[] zza = zzkd.zza(zzefVar);
        if (zza.length <= 131072) {
            return zza(2, zza);
        }
        zzgi().zziy().log("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy, com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfu() {
        super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy, com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfv() {
        super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy, com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfw() {
        super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzdu zzfx() {
        return super.zzfx();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzhm zzfy() {
        return super.zzfy();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzfd zzfz() {
        return super.zzfz();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzik zzga() {
        return super.zzga();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzih zzgb() {
        return super.zzgb();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzfe zzgc() {
        return super.zzgc();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzjj zzgd() {
        return super.zzgd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzer zzge() {
        return super.zzge();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzfg zzgf() {
        return super.zzgf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzkd zzgg() {
        return super.zzgg();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ zzgi zzgh() {
        return super.zzgh();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ zzfi zzgi() {
        return super.zzgi();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzft zzgj() {
        return super.zzgj();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzeh zzgk() {
        return super.zzgk();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ zzee zzgl() {
        return super.zzgl();
    }

    @Override // com.google.android.gms.internal.measurement.zzdz
    protected final boolean zzgn() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AbstractSafeParcelable> zzp(int i) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        Parcel obtain;
        SafeParcelable safeParcelable;
        zzab();
        zzfv();
        if (this.zzakg) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!getContext().getDatabasePath("google_app_measurement_local.db").exists()) {
            return arrayList;
        }
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    if (writableDatabase == null) {
                        try {
                            this.zzakg = true;
                            if (writableDatabase != null) {
                                writableDatabase.close();
                            }
                            return null;
                        } catch (SQLiteFullException e) {
                            e = e;
                            cursor = null;
                            sQLiteDatabase = writableDatabase;
                            zzgi().zziv().zzg("Error reading entries from local database", e);
                            this.zzakg = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.close();
                            i2++;
                        } catch (SQLiteException e2) {
                            e = e2;
                            cursor = null;
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                            }
                            zzgi().zziv().zzg("Error reading entries from local database", e);
                            this.zzakg = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.close();
                            i2++;
                        } catch (Throwable th) {
                            th = th;
                            cursor = null;
                            sQLiteDatabase = writableDatabase;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    } else {
                        try {
                            writableDatabase.beginTransaction();
                            sQLiteDatabase = writableDatabase;
                        } catch (SQLiteFullException e3) {
                            e = e3;
                            sQLiteDatabase = writableDatabase;
                        } catch (SQLiteException e4) {
                            e = e4;
                            sQLiteDatabase = writableDatabase;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteDatabase = writableDatabase;
                        }
                        try {
                            cursor = writableDatabase.query("messages", new String[]{"rowid", AppMeasurement.Param.TYPE, "entry"}, null, null, null, null, "rowid asc", Integer.toString(100));
                            long j = -1;
                            while (cursor.moveToNext()) {
                                try {
                                    j = cursor.getLong(0);
                                    int i5 = cursor.getInt(1);
                                    byte[] blob = cursor.getBlob(2);
                                    if (i5 == 0) {
                                        obtain = Parcel.obtain();
                                        try {
                                            try {
                                                obtain.unmarshall(blob, 0, blob.length);
                                                obtain.setDataPosition(0);
                                                safeParcelable = (zzex) zzex.CREATOR.createFromParcel(obtain);
                                            } catch (SafeParcelReader.ParseException unused) {
                                                zzgi().zziv().log("Failed to load event from local database");
                                                obtain.recycle();
                                            }
                                            if (safeParcelable != null) {
                                            }
                                        } finally {
                                        }
                                    } else if (i5 == 1) {
                                        obtain = Parcel.obtain();
                                        try {
                                            try {
                                                obtain.unmarshall(blob, 0, blob.length);
                                                obtain.setDataPosition(0);
                                                safeParcelable = (zzka) zzka.CREATOR.createFromParcel(obtain);
                                            } catch (SafeParcelReader.ParseException unused2) {
                                                zzgi().zziv().log("Failed to load user property from local database");
                                                obtain.recycle();
                                                safeParcelable = null;
                                            }
                                            if (safeParcelable != null) {
                                            }
                                        } finally {
                                        }
                                    } else if (i5 == 2) {
                                        obtain = Parcel.obtain();
                                        try {
                                            try {
                                                obtain.unmarshall(blob, 0, blob.length);
                                                obtain.setDataPosition(0);
                                                safeParcelable = (zzef) zzef.CREATOR.createFromParcel(obtain);
                                            } finally {
                                            }
                                        } catch (SafeParcelReader.ParseException unused3) {
                                            zzgi().zziv().log("Failed to load user property from local database");
                                            obtain.recycle();
                                            safeParcelable = null;
                                        }
                                        if (safeParcelable != null) {
                                        }
                                    } else {
                                        zzgi().zziv().log("Unknown record type in local database");
                                    }
                                    arrayList.add(safeParcelable);
                                } catch (SQLiteDatabaseLockedException unused4) {
                                    SystemClock.sleep(i3);
                                    i3 += 20;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i2++;
                                    }
                                    sQLiteDatabase.close();
                                    i2++;
                                } catch (SQLiteFullException e5) {
                                    e = e5;
                                    zzgi().zziv().zzg("Error reading entries from local database", e);
                                    this.zzakg = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i2++;
                                    }
                                    sQLiteDatabase.close();
                                    i2++;
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    if (sQLiteDatabase != null) {
                                        try {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    zzgi().zziv().zzg("Error reading entries from local database", e);
                                    this.zzakg = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i2++;
                                    }
                                    sQLiteDatabase.close();
                                    i2++;
                                }
                            }
                            if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                                zzgi().zziv().log("Fewer entries removed from local database than expected");
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            return arrayList;
                        } catch (SQLiteDatabaseLockedException unused5) {
                            cursor = null;
                            SystemClock.sleep(i3);
                            i3 += 20;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.close();
                            i2++;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            cursor = null;
                            zzgi().zziv().zzg("Error reading entries from local database", e);
                            this.zzakg = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.close();
                            i2++;
                        } catch (SQLiteException e8) {
                            e = e8;
                            cursor = null;
                            if (sQLiteDatabase != null) {
                            }
                            zzgi().zziv().zzg("Error reading entries from local database", e);
                            this.zzakg = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.close();
                            i2++;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor = null;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused6) {
                    sQLiteDatabase = writableDatabase;
                }
            } catch (SQLiteDatabaseLockedException unused7) {
                sQLiteDatabase = null;
                cursor = null;
            } catch (SQLiteFullException e9) {
                e = e9;
                sQLiteDatabase = null;
                cursor = null;
            } catch (SQLiteException e10) {
                e = e10;
                sQLiteDatabase = null;
                cursor = null;
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabase = null;
                cursor = null;
            }
        }
        zzgi().zziy().log("Failed to read events from database in reasonable time");
        return null;
    }
}
