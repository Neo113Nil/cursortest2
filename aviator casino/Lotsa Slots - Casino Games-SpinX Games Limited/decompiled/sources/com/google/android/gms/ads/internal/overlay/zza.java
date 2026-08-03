package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zza {
    public static final boolean zza(android.content.Context context, android.content.Intent intent, com.google.android.gms.ads.internal.overlay.zzad zzadVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, boolean z, com.google.android.gms.internal.ads.zzdzl zzdzlVar, java.lang.String str, android.os.Bundle bundle) {
        if (z) {
            return zzc(context, intent.getData(), zzadVar, zzaaVar, bundle);
        }
        try {
            java.lang.String uri = intent.toURI();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(uri).length() + 21);
            sb.append("Launching an intent: ");
            sb.append(uri);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoD)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzac(context, intent, zzdzlVar, str);
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzY(context, intent);
            }
            if (zzadVar != null) {
                zzadVar.zzl();
            }
            if (zzaaVar != null) {
                zzaaVar.zza(true);
            }
            return true;
        } catch (android.content.ActivityNotFoundException e) {
            java.lang.String message = e.getMessage();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            if (zzaaVar != null) {
                zzaaVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(android.content.Context context, com.google.android.gms.ads.internal.overlay.zzc zzcVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, java.lang.String str) {
        int i = 0;
        if (zzcVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("No intent data for launcher overlay.");
            return false;
        }
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        android.content.Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzadVar, zzaaVar, zzcVar.zzj, zzdzlVar, str, zzcVar.zzk);
        }
        android.content.Intent intent2 = new android.content.Intent();
        java.lang.String str2 = zzcVar.zzb;
        if (android.text.TextUtils.isEmpty(str2)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Open GMSG did not contain a URL.");
            return false;
        }
        java.lang.String str3 = zzcVar.zzc;
        if (android.text.TextUtils.isEmpty(str3)) {
            intent2.setData(android.net.Uri.parse(str2));
        } else {
            intent2.setDataAndType(android.net.Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        java.lang.String str4 = zzcVar.zzd;
        if (!android.text.TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        java.lang.String str5 = zzcVar.zze;
        if (!android.text.TextUtils.isEmpty(str5)) {
            java.lang.String[] split = str5.split(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, 2);
            if (split.length < 2) {
                java.lang.String.valueOf(str5);
                java.lang.String valueOf = java.lang.String.valueOf(str5);
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse component name from open GMSG: ".concat(valueOf));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        java.lang.String str6 = zzcVar.zzf;
        if (!android.text.TextUtils.isEmpty(str6)) {
            try {
                i = java.lang.Integer.parseInt(str6);
            } catch (java.lang.NumberFormatException unused) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfx)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfw)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzq(context, intent2);
            }
        }
        return zza(context, intent2, zzadVar, zzaaVar, zzcVar.zzj, zzdzlVar, str, zzcVar.zzk);
    }

    private static final boolean zzc(android.content.Context context, android.net.Uri uri, com.google.android.gms.ads.internal.overlay.zzad zzadVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, android.os.Bundle bundle) {
        int i;
        try {
            i = com.google.android.gms.ads.internal.zzt.zzc().zzn(context, uri, bundle);
            if (zzadVar != null) {
                zzadVar.zzl();
            }
        } catch (android.content.ActivityNotFoundException e) {
            java.lang.String message = e.getMessage();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            i = 6;
        }
        if (zzaaVar != null) {
            zzaaVar.zzb(i);
        }
        return i == 5;
    }
}
