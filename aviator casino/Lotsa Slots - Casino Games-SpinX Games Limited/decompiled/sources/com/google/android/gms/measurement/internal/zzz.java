package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzz {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzad zza;
    private com.google.android.gms.internal.measurement.zzhs zzb;
    private java.lang.Long zzc;
    private long zzd;

    /* synthetic */ zzz(com.google.android.gms.measurement.internal.zzad zzadVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d8, code lost:
    
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f2, code lost:
    
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dd  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.google.android.gms.internal.measurement.zzhs zza(java.lang.String str, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        ?? r7;
        android.database.Cursor cursor;
        android.util.Pair pair;
        java.lang.String zzd = zzhsVar.zzd();
        java.util.List zza = zzhsVar.zza();
        com.google.android.gms.measurement.internal.zzad zzadVar = this.zza;
        com.google.android.gms.measurement.internal.zzpf zzpfVar = zzadVar.zzg;
        zzpfVar.zzp();
        java.lang.Long l = (java.lang.Long) com.google.android.gms.measurement.internal.zzpj.zzI(zzhsVar, "_eid");
        if (l != null) {
            if (zzd.equals("_ep")) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(l);
                zzpfVar.zzp();
                java.lang.String str2 = (java.lang.String) com.google.android.gms.measurement.internal.zzpj.zzI(zzhsVar, "_en");
                if (android.text.TextUtils.isEmpty(str2)) {
                    zzadVar.zzu.zzaV().zzc().zzb("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.zzb == null || this.zzc == null || l.longValue() != this.zzc.longValue()) {
                    com.google.android.gms.measurement.internal.zzav zzj = zzpfVar.zzj();
                    zzj.zzg();
                    zzj.zzay();
                    try {
                        try {
                            cursor = zzj.zze().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new java.lang.String[]{str, l.toString()});
                            try {
                            } catch (android.database.sqlite.SQLiteException e) {
                                e = e;
                                zzj.zzu.zzaV().zzb().zzb("Error selecting main event", e);
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            r7 = zzpfVar;
                            if (r7 != 0) {
                                r7.close();
                            }
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteException e2) {
                        e = e2;
                        cursor = null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        r7 = 0;
                        if (r7 != 0) {
                        }
                        throw th;
                    }
                    if (cursor.moveToFirst()) {
                        try {
                            pair = android.util.Pair.create((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursor.getBlob(0))).zzbc(), java.lang.Long.valueOf(cursor.getLong(1)));
                            if (cursor != null) {
                                cursor.close();
                            }
                        } catch (java.io.IOException e3) {
                            zzj.zzu.zzaV().zzb().zzd("Failed to merge main event. appId, eventId", com.google.android.gms.measurement.internal.zzgt.zzl(str), l, e3);
                        }
                        if (pair != null) {
                        }
                        this.zza.zzu.zzaV().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    }
                    zzj.zzu.zzaV().zzk().zza("Main event not found");
                    if (cursor != null) {
                        cursor.close();
                    }
                    pair = null;
                    if (pair != null || pair.first == null) {
                        this.zza.zzu.zzaV().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    }
                    this.zzb = (com.google.android.gms.internal.measurement.zzhs) pair.first;
                    this.zzd = ((java.lang.Long) pair.second).longValue();
                    this.zza.zzg.zzp();
                    this.zzc = (java.lang.Long) com.google.android.gms.measurement.internal.zzpj.zzI(this.zzb, "_eid");
                }
                long j = this.zzd - 1;
                this.zzd = j;
                if (j <= 0) {
                    com.google.android.gms.measurement.internal.zzav zzj2 = this.zza.zzg.zzj();
                    zzj2.zzg();
                    zzj2.zzu.zzaV().zzk().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzj2.zze().execSQL("delete from main_event_params where app_id=?", new java.lang.String[]{str});
                    } catch (android.database.sqlite.SQLiteException e4) {
                        zzj2.zzu.zzaV().zzb().zzb("Error clearing complex main event", e4);
                    }
                } else {
                    this.zza.zzg.zzj().zzV(str, l, this.zzd, this.zzb);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : this.zzb.zza()) {
                    this.zza.zzg.zzp();
                    if (com.google.android.gms.measurement.internal.zzpj.zzF(zzhsVar, zzhwVar.zzb()) == null) {
                        arrayList.add(zzhwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzu.zzaV().zzc().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(zza);
                    zza = arrayList;
                }
                zzd = str2;
            } else {
                this.zzc = l;
                this.zzb = zzhsVar;
                zzpfVar.zzp();
                long longValue = ((java.lang.Long) com.google.android.gms.measurement.internal.zzpj.zzJ(zzhsVar, "_epc", 0L)).longValue();
                this.zzd = longValue;
                if (longValue <= 0) {
                    zzadVar.zzu.zzaV().zzc().zzb("Complex event with zero extra param count. eventName", zzd);
                } else {
                    zzpfVar.zzj().zzV(str, (java.lang.Long) com.google.android.gms.common.internal.Preconditions.checkNotNull(l), this.zzd, zzhsVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzhsVar.zzcl();
        zzhrVar.zzl(zzd);
        zzhrVar.zzi();
        zzhrVar.zzh(zza);
        return (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc();
    }
}
