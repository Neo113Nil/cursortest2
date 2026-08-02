package com.google.android.gms.internal.ads;

import F2.C0254t;

/* loaded from: classes.dex */
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
        zzdmu zzdmuVar;
        zzfas zzfasVar;
        zzdmu zzdmuVar2 = (zzdmu) obj;
        synchronized (this.zza) {
            try {
                this.zza.zzi = zzdmuVar2;
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdK)).booleanValue()) {
                    zzfat zzd = zzdmuVar2.zzd();
                    zzfasVar = this.zza.zzd;
                    zzd.zza = zzfasVar;
                }
                zzdmuVar = this.zza.zzi;
                zzdmuVar.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
