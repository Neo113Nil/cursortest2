package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import J2.j;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzdzs {
    private final zzbaw zza;
    private final Context zzb;
    private final zzdyx zzc;
    private final VersionInfoParcel zzd;

    public zzdzs(Context context, VersionInfoParcel versionInfoParcel, zzbaw zzbawVar, zzdyx zzdyxVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbawVar;
        this.zzc = zzdyxVar;
    }

    public static Void zza(zzdzs zzdzsVar, boolean z4, SQLiteDatabase sQLiteDatabase) {
        if (z4) {
            zzdzsVar.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(zzbbd.zzaf.zza.zzx(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgxv e7) {
                    int i7 = J.f3546b;
                    j.d("Unable to deserialize proto from offline signals database:");
                    j.d(e7.getMessage());
                }
            }
            cursorQuery.close();
            Context context = zzdzsVar.zzb;
            zzbbd.zzaf.zzc zzcVarZzi = zzbbd.zzaf.zzi();
            zzcVarZzi.zzv(context.getPackageName());
            zzcVarZzi.zzy(Build.MODEL);
            zzcVarZzi.zzA(zzdzm.zza(sQLiteDatabase, 0));
            zzcVarZzi.zzh(arrayList);
            zzcVarZzi.zzE(zzdzm.zza(sQLiteDatabase, 1));
            zzcVarZzi.zzx(zzdzm.zza(sQLiteDatabase, 3));
            o.f1952C.j.getClass();
            zzcVarZzi.zzF(System.currentTimeMillis());
            zzcVarZzi.zzB(zzdzm.zzb(sQLiteDatabase, 2));
            final zzbbd.zzaf zzafVarZzbr = zzcVarZzi.zzbr();
            int size = arrayList.size();
            long jZze = 0;
            for (int i8 = 0; i8 < size; i8++) {
                zzbbd.zzaf.zza zzaVar = (zzbbd.zzaf.zza) arrayList.get(i8);
                if (zzaVar.zzk() == zzbbd.zzq.ENUM_TRUE && zzaVar.zze() > jZze) {
                    jZze = zzaVar.zze();
                }
            }
            if (jZze != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(jZze));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzdzsVar.zza.zzb(new zzbav() { // from class: com.google.android.gms.internal.ads.zzdzq
                @Override // com.google.android.gms.internal.ads.zzbav
                public final void zza(zzbbd.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzafVarZzbr);
                }
            });
            VersionInfoParcel versionInfoParcel = zzdzsVar.zzd;
            zzbbd.zzar.zza zzaVarZzd = zzbbd.zzar.zzd();
            zzaVarZzd.zzg(versionInfoParcel.f10835b);
            zzaVarZzd.zzi(zzdzsVar.zzd.f10836c);
            zzaVarZzd.zzh(true != zzdzsVar.zzd.f10837d ? 2 : 0);
            final zzbbd.zzar zzarVarZzbr = zzaVarZzd.zzbr();
            zzdzsVar.zza.zzb(new zzbav() { // from class: com.google.android.gms.internal.ads.zzdzr
                @Override // com.google.android.gms.internal.ads.zzbav
                public final void zza(zzbbd.zzt.zza zzaVar2) {
                    zzbbd.zzm.zza zzaVarZzbM = zzaVar2.zzg().zzbM();
                    zzaVarZzbM.zzw(zzarVarZzbr);
                    zzaVar2.zzK(zzaVarZzbM);
                }
            });
            zzdzsVar.zza.zzc(10004);
            zzdzm.zze(sQLiteDatabase);
        }
        return null;
    }

    public final void zzb(final boolean z4) {
        try {
            this.zzc.zza(new zzfei() { // from class: com.google.android.gms.internal.ads.zzdzp
                @Override // com.google.android.gms.internal.ads.zzfei
                public final Object zza(Object obj) {
                    zzdzs.zza(this.zza, z4, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            int i7 = J.f3546b;
            j.d("Error in offline signals database startup: ".concat(strValueOf));
        }
    }
}
