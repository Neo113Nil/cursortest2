package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzefh implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzefk zza;

    zzefh(com.google.android.gms.internal.ads.zzefk zzefkVar) {
        java.util.Objects.requireNonNull(zzefkVar);
        this.zza = zzefkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        java.util.regex.Pattern pattern;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhh)).booleanValue()) {
            java.lang.String message = th.getMessage();
            pattern = com.google.android.gms.internal.ads.zzefk.zzh;
            java.util.regex.Matcher matcher = pattern.matcher(message);
            if (matcher.matches()) {
                java.lang.String group = matcher.group(1);
                com.google.android.gms.internal.ads.zzefk zzefkVar = this.zza;
                zzefkVar.zzc().zzc(java.lang.Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfkq zzfkqVar = (com.google.android.gms.internal.ads.zzfkq) obj;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhh)).booleanValue()) {
            com.google.android.gms.internal.ads.zzefk zzefkVar = this.zza;
            com.google.android.gms.internal.ads.zzfki zzfkiVar = zzfkqVar.zzb.zzb;
            zzefkVar.zzc().zzc(zzfkiVar.zzf);
            zzefkVar.zzc().zze(zzfkiVar.zzg);
        }
    }
}
