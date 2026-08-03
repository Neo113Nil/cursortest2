package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzgi extends com.google.android.gms.internal.measurement.zzby {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzgk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgi(com.google.android.gms.measurement.internal.zzgk zzgkVar, android.content.Context context, java.lang.String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        java.util.Objects.requireNonNull(zzgkVar);
        this.zza = zzgkVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() throws android.database.sqlite.SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
            throw e;
        } catch (android.database.sqlite.SQLiteException unused) {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zza.zzu;
            zzibVar.zzaV().zzb().zza("Opening the local database failed, dropping and recreating it");
            zzibVar.zzc();
            if (!zzibVar.zzaY().getDatabasePath("google_app_measurement_local.db").delete()) {
                zzibVar.zzaV().zzb().zzb("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (android.database.sqlite.SQLiteException e2) {
                this.zza.zzu.zzaV().zzb().zzb("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.google.android.gms.measurement.internal.zzaw.zzb(this.zza.zzu.zzaV(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.lang.String[] strArr;
        strArr = com.google.android.gms.measurement.internal.zzgk.zza;
        com.google.android.gms.measurement.internal.zzaw.zza(this.zza.zzu.zzaV(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", strArr);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
