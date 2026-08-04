package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import p003a.a;

/* JADX INFO: loaded from: classes.dex */
final class zzaai implements zzael<zzagb> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzagl zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzade zzd;
    private final /* synthetic */ zzaaj zze;

    public zzaai(zzaaj zzaajVar, zzael zzaelVar, zzagl zzaglVar, String str, zzade zzadeVar) {
        this.zza = zzaelVar;
        this.zzb = zzaglVar;
        this.zzc = str;
        this.zzd = zzadeVar;
        this.zze = zzaajVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzd.zza(a.y0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagb zzagbVar) {
        List<zzage> listZza = zzagbVar.zza();
        if (listZza != null && !listZza.isEmpty()) {
            zzage zzageVar = listZza.get(0);
            zzahb zzahbVar = new zzahb();
            zzahbVar.zzd(this.zzb.zzc()).zza(this.zzc);
            zzzk.zza(this.zze.zza, this.zzd, this.zzb, zzageVar, zzahbVar, this.zza);
            return;
        }
        this.zza.zza("No users.");
    }
}
