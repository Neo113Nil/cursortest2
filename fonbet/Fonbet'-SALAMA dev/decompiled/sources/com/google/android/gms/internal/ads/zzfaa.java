package com.google.android.gms.internal.ads;

import F2.C0254t;

/* loaded from: classes.dex */
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
        zzdmu zzdmuVar;
        zzfas zzfasVar;
        zzdmu zzdmuVar2 = (zzdmu) obj;
        synchronized (this.zza) {
            try {
                this.zza.zzd = zzdmuVar2;
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdK)).booleanValue()) {
                    zzfat zzd = zzdmuVar2.zzd();
                    zzfasVar = this.zza.zzc;
                    zzd.zza = zzfasVar;
                }
                zzdmuVar = this.zza.zzd;
                zzdmuVar.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
