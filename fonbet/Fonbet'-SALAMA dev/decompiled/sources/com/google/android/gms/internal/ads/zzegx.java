package com.google.android.gms.internal.ads;

import F2.C0254t;

/* loaded from: classes.dex */
final class zzegx implements zzcvz {
    boolean zza = false;
    final /* synthetic */ zzebu zzb;
    final /* synthetic */ zzbzf zzc;

    public zzegx(zzegy zzegyVar, zzebu zzebuVar, zzbzf zzbzfVar) {
        this.zzb = zzebuVar;
        this.zzc = zzbzfVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i7 = 1;
        if (true == ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfz)).booleanValue()) {
            i7 = 3;
        }
        this.zzc.zzd(new zzebv(i7, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcvz
    public final synchronized void zza(int i7) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i7, zzegy.zze(this.zzb.zza, i7), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcvz
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvz
    public final synchronized void zzc(int i7, String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzegy.zze(this.zzb.zza, i7);
            }
            zze(new com.google.android.gms.ads.internal.client.zze(i7, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvz
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
