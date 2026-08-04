package com.google.android.gms.internal.ads;

import F2.C0254t;

/* JADX INFO: loaded from: classes.dex */
final class zzfaa implements zzejs {
    final /* synthetic */ zzfac zza;

    public zzfaa(zzfac zzfacVar) {
        this.zza = zzfacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    public final void zzb(Object obj) {
        zzdmu zzdmuVar = (zzdmu) obj;
        synchronized (this.zza) {
            try {
                this.zza.zzd = zzdmuVar;
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdK)).booleanValue()) {
                    zzdmuVar.zzd().zza = this.zza.zzc;
                }
                this.zza.zzd.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
