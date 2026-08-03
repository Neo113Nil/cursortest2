package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeju {
    private final com.google.android.gms.internal.ads.zzbhp zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzeiz zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;

    public zzeju(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbhp zzbhpVar, com.google.android.gms.internal.ads.zzeiz zzeizVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbhpVar;
        this.zzc = zzeizVar;
    }

    public final void zza(final boolean z) {
        try {
            this.zzc.zza(new com.google.android.gms.internal.ads.zzfok() { // from class: com.google.android.gms.internal.ads.zzejt
                @Override // com.google.android.gms.internal.ads.zzfok
                public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
                    com.google.android.gms.internal.ads.zzeju.this.zzb(z, (android.database.sqlite.SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            java.lang.String.valueOf(message);
            java.lang.String valueOf = java.lang.String.valueOf(message);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in offline signals database startup: ".concat(valueOf));
        }
    }

    final /* synthetic */ java.lang.Void zzb(boolean z, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.database.Cursor query = sQLiteDatabase.query("offline_signal_contents", new java.lang.String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(com.google.android.gms.internal.ads.zzbhv.zzaf.zza.zzk(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (com.google.android.gms.internal.ads.zziet e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(e.getMessage());
                }
            }
            query.close();
            android.content.Context context = this.zzb;
            com.google.android.gms.internal.ads.zzbhv.zzaf.zzc zzB = com.google.android.gms.internal.ads.zzbhv.zzaf.zzB();
            zzB.zzB(context.getPackageName());
            zzB.zzH(android.os.Build.MODEL);
            zzB.zzo(com.google.android.gms.internal.ads.zzejo.zzc(sQLiteDatabase, 0));
            zzB.zzj(arrayList);
            zzB.zzs(com.google.android.gms.internal.ads.zzejo.zzc(sQLiteDatabase, 1));
            zzB.zzQ(com.google.android.gms.internal.ads.zzejo.zzc(sQLiteDatabase, 3));
            zzB.zzw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            zzB.zzM(com.google.android.gms.internal.ads.zzejo.zzd(sQLiteDatabase, 2));
            final com.google.android.gms.internal.ads.zzbhv.zzaf zzbu = zzB.zzbu();
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                com.google.android.gms.internal.ads.zzbhv.zzaf.zza zzaVar = (com.google.android.gms.internal.ads.zzbhv.zzaf.zza) arrayList.get(i2);
                if (zzaVar.zzf() == com.google.android.gms.internal.ads.zzbhv.zzq.ENUM_TRUE && zzaVar.zzb() > j) {
                    j = zzaVar.zzb();
                }
            }
            if (j != 0) {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("value", java.lang.Long.valueOf(j));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            com.google.android.gms.internal.ads.zzbhp zzbhpVar = this.zza;
            zzbhpVar.zzb(new com.google.android.gms.internal.ads.zzbho() { // from class: com.google.android.gms.internal.ads.zzejr
                @Override // com.google.android.gms.internal.ads.zzbho
                public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbhv.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(com.google.android.gms.internal.ads.zzbhv.zzaf.this);
                }
            });
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzd;
            com.google.android.gms.internal.ads.zzbhv.zzar.zza zzs = com.google.android.gms.internal.ads.zzbhv.zzar.zzs();
            zzs.zzc(versionInfoParcel.buddyApkVersion);
            zzs.zzg(versionInfoParcel.clientJarVersion);
            zzs.zzk(true == versionInfoParcel.isClientJar ? 0 : 2);
            final com.google.android.gms.internal.ads.zzbhv.zzar zzbu2 = zzs.zzbu();
            zzbhpVar.zzb(new com.google.android.gms.internal.ads.zzbho() { // from class: com.google.android.gms.internal.ads.zzejs
                @Override // com.google.android.gms.internal.ads.zzbho
                public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbhv.zzt.zza zzaVar2) {
                    com.google.android.gms.internal.ads.zzbhv.zzm.zza zzcc = zzaVar2.zzG().zzcc();
                    zzcc.zzs(com.google.android.gms.internal.ads.zzbhv.zzar.this);
                    zzaVar2.zzI(zzcc);
                }
            });
            zzbhpVar.zzc(com.google.android.gms.games.GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
            com.google.android.gms.internal.ads.zzejo.zzb(sQLiteDatabase);
        }
        return null;
    }
}
