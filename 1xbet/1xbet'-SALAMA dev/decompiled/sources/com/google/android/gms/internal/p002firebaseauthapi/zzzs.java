package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zze;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzzs implements zzael<zzagb> {
    private final /* synthetic */ zzaem zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ zze zze;
    private final /* synthetic */ zzade zzf;
    private final /* synthetic */ zzagl zzg;

    public zzzs(zzzk zzzkVar, zzaem zzaemVar, String str, String str2, Boolean bool, zze zzeVar, zzade zzadeVar, zzagl zzaglVar) {
        this.zza = zzaemVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = zzeVar;
        this.zzf = zzadeVar;
        this.zzg = zzaglVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagb zzagbVar) {
        List<zzage> listZza = zzagbVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzage zzageVar = listZza.get(0);
        zzagu zzaguVarZzf = zzageVar.zzf();
        List<zzagr> listZza2 = zzaguVarZzf != null ? zzaguVarZzf.zza() : null;
        if (listZza2 != null && !listZza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                listZza2.get(0).zza(this.zzc);
            } else {
                for (int i7 = 0; i7 < listZza2.size(); i7++) {
                    if (listZza2.get(i7).zzf().equals(this.zzb)) {
                        listZza2.get(i7).zza(this.zzc);
                        break;
                    }
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zzageVar.zza(bool.booleanValue());
        } else {
            zzageVar.zza(zzageVar.zzb() - zzageVar.zza() < 1000);
        }
        zzageVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzageVar);
    }
}
