package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzat {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzav zza;
    private final java.lang.String zzb;
    private long zzc;

    public zzat(com.google.android.gms.measurement.internal.zzav zzavVar, java.lang.String str) {
        java.util.Objects.requireNonNull(zzavVar);
        this.zza = zzavVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List zza() {
        android.database.Cursor cursor;
        android.database.Cursor cursor2;
        java.util.List arrayList = new java.util.ArrayList();
        try {
            int i = 0;
            cursor2 = this.zza.zze().query("raw_events", new java.lang.String[]{"rowid", "name", com.ironsource.C4.a.d, "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new java.lang.String[]{this.zzb, java.lang.String.valueOf(this.zzc)}, null, null, "rowid", "1000");
            try {
                if (cursor2.moveToFirst()) {
                    while (true) {
                        long j = cursor2.getLong(i);
                        long j2 = cursor2.getLong(3);
                        boolean z = cursor2.getLong(5) == 1;
                        byte[] blob = cursor2.getBlob(4);
                        if (j > this.zzc) {
                            this.zzc = j;
                        }
                        try {
                            com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), blob);
                            java.lang.String string = cursor2.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            zzhrVar.zzl(string);
                            zzhrVar.zzo(cursor2.getLong(2));
                            arrayList.add(new com.google.android.gms.measurement.internal.zzas(j, j2, z, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc()));
                        } catch (java.io.IOException e) {
                            this.zza.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(this.zzb), e);
                        }
                        if (!cursor2.moveToNext()) {
                            break;
                        }
                        i = 0;
                    }
                } else {
                    arrayList = java.util.Collections.emptyList();
                }
            } catch (android.database.sqlite.SQLiteException e2) {
                e = e2;
                cursor = cursor2;
                try {
                    this.zza.zzu.zzaV().zzb().zzc("Data loss. Error querying raw events batch. appId", com.google.android.gms.measurement.internal.zzgt.zzl(this.zzb), e);
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                cursor = cursor2;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return arrayList;
    }

    public zzat(com.google.android.gms.measurement.internal.zzav zzavVar, java.lang.String str, long j) {
        java.util.Objects.requireNonNull(zzavVar);
        this.zza = zzavVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = zzavVar.zzaj("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new java.lang.String[]{str, java.lang.String.valueOf(j)}, -1L);
    }
}
