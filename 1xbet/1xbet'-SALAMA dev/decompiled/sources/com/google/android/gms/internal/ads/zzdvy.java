package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
final class zzdvy implements zzgay {
    final /* synthetic */ zzdvz zza;

    public zzdvy(zzdvz zzdvzVar) {
        this.zza = zzdvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgg)).booleanValue()) {
            Matcher matcher = zzdvz.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        zzfar zzfarVar = (zzfar) obj;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgg)).booleanValue()) {
            this.zza.zzf.zzi(zzfarVar.zzb.zzb.zzf);
            this.zza.zzf.zzj(zzfarVar.zzb.zzb.zzg);
        }
    }
}
