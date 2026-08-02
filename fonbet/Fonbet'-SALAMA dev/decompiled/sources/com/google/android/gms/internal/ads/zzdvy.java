package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class zzdvy implements zzgay {
    final /* synthetic */ zzdvz zza;

    public zzdvy(zzdvz zzdvzVar) {
        this.zza = zzdvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        Pattern pattern;
        zzdzb zzdzbVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgg)).booleanValue()) {
            pattern = zzdvz.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzdzbVar = this.zza.zzf;
                zzdzbVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        zzdzb zzdzbVar;
        zzdzb zzdzbVar2;
        zzfar zzfarVar = (zzfar) obj;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgg)).booleanValue()) {
            zzdzbVar = this.zza.zzf;
            zzdzbVar.zzi(zzfarVar.zzb.zzb.zzf);
            zzdzbVar2 = this.zza.zzf;
            zzdzbVar2.zzj(zzfarVar.zzb.zzb.zzg);
        }
    }
}
