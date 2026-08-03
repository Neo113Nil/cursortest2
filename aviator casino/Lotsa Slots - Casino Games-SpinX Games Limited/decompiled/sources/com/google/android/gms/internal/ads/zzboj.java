package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzboj implements com.google.android.gms.internal.ads.zzbpq {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        java.lang.String str = (java.lang.String) map.get("action");
        if ("tick".equals(str)) {
            java.lang.String str2 = (java.lang.String) map.get("label");
            java.lang.String str3 = (java.lang.String) map.get("start_label");
            java.lang.String str4 = (java.lang.String) map.get(com.ironsource.C4.a.d);
            if (android.text.TextUtils.isEmpty(str2)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No label given for CSI tick.");
                return;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcL)).booleanValue() && !zza.matcher(str2).matches()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            if (android.text.TextUtils.isEmpty(str4)) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No timestamp given for CSI tick.");
                return;
            }
            try {
                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() + (java.lang.Long.parseLong(str4) - com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                if (true == android.text.TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcL)).booleanValue() || zza.matcher(str3).matches()) {
                    zzckuVar.zzq().zzb(str2, str3, elapsedRealtime);
                    return;
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            } catch (java.lang.NumberFormatException e) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            java.lang.String str5 = (java.lang.String) map.get("value");
            if (android.text.TextUtils.isEmpty(str5)) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No value given for CSI experiment.");
                return;
            }
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcL)).booleanValue() || zzb.matcher(str5).matches()) {
                zzckuVar.zzq().zzc().zzd("e", str5);
                return;
            } else {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                return;
            }
        }
        if ("extra".equals(str)) {
            java.lang.String str6 = (java.lang.String) map.get("name");
            java.lang.String str7 = (java.lang.String) map.get("value");
            if (android.text.TextUtils.isEmpty(str7)) {
                int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No value given for CSI extra.");
                return;
            }
            if (android.text.TextUtils.isEmpty(str6)) {
                int i9 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No name given for CSI extra.");
                return;
            }
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcL)).booleanValue() || zza.matcher(str6).matches()) {
                zzckuVar.zzq().zzc().zzd(str6, str7);
            } else {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            }
        }
    }
}
