package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;

/* JADX INFO: loaded from: classes.dex */
final class zzdgv implements zzgay {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdgx zzb;

    public zzdgv(zzdgx zzdgxVar, String str, boolean z4) {
        this.zzb = zzdgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfs)).booleanValue()) {
            o.f1952C.f1961g.zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze.zzT((zzceb) obj);
        zzdgx zzdgxVar = this.zzb;
        zzbzf zzbzfVarZzp = zzdgxVar.zze.zzp();
        zzebm zzebmVarZzf = zzdgxVar.zzf(this.zza, true);
        if (zzebmVarZzf != null && zzbzfVarZzp != null) {
            zzbzfVarZzp.zzc(zzebmVarZzf);
        } else if (zzbzfVarZzp != null) {
            zzbzfVarZzp.cancel(false);
        }
    }
}
