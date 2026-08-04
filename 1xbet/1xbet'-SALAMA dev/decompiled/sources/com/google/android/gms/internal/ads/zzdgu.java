package com.google.android.gms.internal.ads;

import F2.C0254t;

/* JADX INFO: loaded from: classes.dex */
final class zzdgu implements zzaxx {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdgx zzb;

    public zzdgu(zzdgx zzdgxVar, String str) {
        this.zza = str;
        this.zzb = zzdgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final void zzdn(zzaxw zzaxwVar) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbU)).booleanValue()) {
            if (zzaxwVar.zzj) {
                zzdgx zzdgxVar = this.zzb;
                if (zzdgxVar.zzo != null) {
                    zzdgxVar.zzy.put(this.zza, Boolean.TRUE);
                    zzdgx zzdgxVar2 = this.zzb;
                    if (zzdgxVar2.zzo == null) {
                        return;
                    }
                    zzdgxVar2.zzB(zzdgxVar2.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (zzaxwVar.zzj) {
                    zzdgx zzdgxVar3 = this.zzb;
                    if (zzdgxVar3.zzo != null) {
                        zzdgxVar3.zzy.put(this.zza, Boolean.TRUE);
                        zzdgx zzdgxVar4 = this.zzb;
                        if (zzdgxVar4.zzo == null) {
                        } else {
                            zzdgxVar4.zzB(zzdgxVar4.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
