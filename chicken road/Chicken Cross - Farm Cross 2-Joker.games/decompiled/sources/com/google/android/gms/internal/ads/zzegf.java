package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzegf implements zzhcv {
    final /* synthetic */ zzegi zza;

    zzegf(zzegi zzegiVar) {
        Objects.requireNonNull(zzegiVar);
        this.zza = zzegiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        Pattern pattern;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhn)).booleanValue()) {
            String message = th.getMessage();
            pattern = zzegi.zzh;
            Matcher matcher = pattern.matcher(message);
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzegi zzegiVar = this.zza;
                zzegiVar.zzc().zzc(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzflo zzfloVar = (zzflo) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhn)).booleanValue()) {
            zzegi zzegiVar = this.zza;
            zzflg zzflgVar = zzfloVar.zzb.zzb;
            zzegiVar.zzc().zzc(zzflgVar.zzf);
            zzegiVar.zzc().zze(zzflgVar.zzg);
        }
    }
}
