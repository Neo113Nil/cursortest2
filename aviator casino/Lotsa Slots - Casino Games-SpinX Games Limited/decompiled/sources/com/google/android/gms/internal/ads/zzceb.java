package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzceb {
    public static java.lang.String zza(java.lang.String str, android.content.Context context, boolean z, java.util.Map map) {
        java.lang.String zzj;
        if ((((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbb)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzt.zzD().zza(context) || android.text.TextUtils.isEmpty(str) || (zzj = com.google.android.gms.ads.internal.zzt.zzD().zzj(context)) == null) {
            return str;
        }
        java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaU);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaT)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzt.zzc().zzh(str)) {
                com.google.android.gms.ads.internal.zzt.zzD().zzk(context, zzj, (java.util.Map) map.get("_ac"));
                return zzd(str, context).replace(str2, zzj);
            }
            if (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzt.zzD().zzl(context, zzj, (java.util.Map) map.get("_ai"));
            return zzd(str, context).replace(str2, zzj);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaS)).booleanValue()) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzt.zzc().zzh(str)) {
            com.google.android.gms.ads.internal.zzt.zzD().zzk(context, zzj, (java.util.Map) map.get("_ac"));
            return zzc(zzd(str, context), "fbs_aeid", zzj).toString();
        }
        if (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzt.zzD().zzl(context, zzj, (java.util.Map) map.get("_ai"));
        return zzc(zzd(str, context), "fbs_aeid", zzj).toString();
    }

    public static java.lang.String zzb(android.net.Uri uri, android.content.Context context, java.util.Map map) {
        if (!com.google.android.gms.ads.internal.zzt.zzD().zza(context)) {
            return uri.toString();
        }
        java.lang.String zzj = com.google.android.gms.ads.internal.zzt.zzD().zzj(context);
        if (zzj == null) {
            return uri.toString();
        }
        java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaU);
        java.lang.String uri2 = uri.toString();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaT)).booleanValue() && uri2.contains(str)) {
            com.google.android.gms.ads.internal.zzt.zzD().zzk(context, zzj, (java.util.Map) map.get("_ac"));
            return zzd(uri2, context).replace(str, zzj);
        }
        if (!android.text.TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaS)).booleanValue()) {
            return uri2;
        }
        java.lang.String uri3 = zzc(zzd(uri2, context), "fbs_aeid", zzj).toString();
        com.google.android.gms.ads.internal.zzt.zzD().zzk(context, zzj, (java.util.Map) map.get("_ac"));
        return uri3;
    }

    static android.net.Uri zzc(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return android.net.Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return android.net.Uri.parse(str.substring(0, i) + str2 + com.ironsource.X3.j.b + str3 + com.ironsource.X3.j.c + str.substring(i));
    }

    private static java.lang.String zzd(java.lang.String str, android.content.Context context) {
        java.lang.String zzh = com.google.android.gms.ads.internal.zzt.zzD().zzh(context);
        java.lang.String zzi = com.google.android.gms.ads.internal.zzt.zzD().zzi(context);
        if (!str.contains("gmp_app_id") && !android.text.TextUtils.isEmpty(zzh)) {
            str = zzc(str, "gmp_app_id", zzh).toString();
        }
        return (str.contains("fbs_aiid") || android.text.TextUtils.isEmpty(zzi)) ? str : zzc(str, "fbs_aiid", zzi).toString();
    }
}
