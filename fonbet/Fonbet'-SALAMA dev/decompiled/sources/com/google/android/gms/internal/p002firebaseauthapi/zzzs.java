package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zze;
import java.util.List;

/* loaded from: classes.dex */
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
        List<zzage> zza = zzagbVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzage zzageVar = zza.get(0);
        zzagu zzf = zzageVar.zzf();
        List<zzagr> zza2 = zzf != null ? zzf.zza() : null;
        if (zza2 != null && !zza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                zza2.get(0).zza(this.zzc);
            } else {
                int i7 = 0;
                while (true) {
                    if (i7 >= zza2.size()) {
                        break;
                    }
                    if (zza2.get(i7).zzf().equals(this.zzb)) {
                        zza2.get(i7).zza(this.zzc);
                        break;
                    }
                    i7++;
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
