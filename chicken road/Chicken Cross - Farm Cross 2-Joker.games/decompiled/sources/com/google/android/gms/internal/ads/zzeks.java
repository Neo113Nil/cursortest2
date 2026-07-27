package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.internal.ads.zzbil;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeks {
    private final zzbif zza;
    private final Context zzb;
    private final zzejx zzc;
    private final VersionInfoParcel zzd;

    public zzeks(Context context, VersionInfoParcel versionInfoParcel, zzbif zzbifVar, zzejx zzejxVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbifVar;
        this.zzc = zzejxVar;
    }

    public final void zza(final boolean z) {
        try {
            this.zzc.zza(new zzfpi() { // from class: com.google.android.gms.internal.ads.zzekr
                @Override // com.google.android.gms.internal.ads.zzfpi
                public final /* synthetic */ Object zza(Object obj) {
                    zzeks.this.zzb(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            String message = e.getMessage();
            String.valueOf(message);
            String valueOf = String.valueOf(message);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in offline signals database startup: ".concat(valueOf));
        }
    }

    final /* synthetic */ Void zzb(boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbil.zzaf.zza.zzk(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzige e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(e.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbil.zzaf.zzc zzB = zzbil.zzaf.zzB();
            zzB.zzB(context.getPackageName());
            zzB.zzH(Build.MODEL);
            zzB.zzo(zzekm.zzc(sQLiteDatabase, 0));
            zzB.zzj(arrayList);
            zzB.zzs(zzekm.zzc(sQLiteDatabase, 1));
            zzB.zzQ(zzekm.zzc(sQLiteDatabase, 3));
            zzB.zzw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            zzB.zzM(zzekm.zzd(sQLiteDatabase, 2));
            final zzbil.zzaf zzbu = zzB.zzbu();
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                zzbil.zzaf.zza zzaVar = (zzbil.zzaf.zza) arrayList.get(i2);
                if (zzaVar.zzf() == zzbil.zzq.ENUM_TRUE && zzaVar.zzb() > j) {
                    j = zzaVar.zzb();
                }
            }
            if (j != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(j));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbif zzbifVar = this.zza;
            zzbifVar.zzb(new zzbie() { // from class: com.google.android.gms.internal.ads.zzekp
                @Override // com.google.android.gms.internal.ads.zzbie
                public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(zzbil.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbil.zzar.zza zzs = zzbil.zzar.zzs();
            zzs.zzc(versionInfoParcel.buddyApkVersion);
            zzs.zzg(versionInfoParcel.clientJarVersion);
            zzs.zzk(true != versionInfoParcel.isClientJar ? 2 : 0);
            final zzbil.zzar zzbu2 = zzs.zzbu();
            zzbifVar.zzb(new zzbie() { // from class: com.google.android.gms.internal.ads.zzekq
                @Override // com.google.android.gms.internal.ads.zzbie
                public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar2) {
                    zzbil.zzm.zza zzcc = zzaVar2.zzG().zzcc();
                    zzcc.zzs(zzbil.zzar.this);
                    zzaVar2.zzI(zzcc);
                }
            });
            zzbifVar.zzc(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
            zzekm.zzb(sQLiteDatabase);
        }
        return null;
    }
}
