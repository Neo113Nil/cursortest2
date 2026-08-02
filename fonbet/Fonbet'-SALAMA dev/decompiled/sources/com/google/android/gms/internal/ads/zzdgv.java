package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;

/* loaded from: classes.dex */
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
        zzdhc zzdhcVar;
        zzdhc zzdhcVar2;
        zzdhcVar = this.zzb.zze;
        zzdhcVar.zzT((zzceb) obj);
        zzdgx zzdgxVar = this.zzb;
        zzdhcVar2 = zzdgxVar.zze;
        zzbzf zzp = zzdhcVar2.zzp();
        zzebm zzf = zzdgxVar.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
