package com.google.android.gms.internal.ads;

import F2.C0254t;

/* JADX INFO: loaded from: classes.dex */
final class zzezv implements zzejs {
    final /* synthetic */ zzezw zza;

    public zzezv(zzezw zzezwVar) {
        this.zza = zzezwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    public final void zzb(Object obj) {
        zzdmu zzdmuVar = (zzdmu) obj;
        synchronized (this.zza) {
            try {
                this.zza.zzi = zzdmuVar;
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdK)).booleanValue()) {
                    zzdmuVar.zzd().zza = this.zza.zzd;
                }
                this.zza.zzi.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
