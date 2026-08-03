package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcsv implements com.google.android.gms.internal.ads.zzcrt {
    private final android.webkit.CookieManager zza;

    public zzcsv(android.content.Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzf().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final void zza(java.util.Map map) {
        android.webkit.CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((java.lang.String) map.get("clear")) == null) {
            java.lang.String str = (java.lang.String) map.get("cookie");
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbz), str);
            return;
        }
        java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbz);
        java.lang.String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            java.util.List zze = com.google.android.gms.internal.ads.zzgty.zza(com.google.android.gms.internal.ads.zzgsx.zzc(';')).zze(cookie);
            for (int i = 0; i < zze.size(); i++) {
                java.util.Iterator it = com.google.android.gms.internal.ads.zzgty.zza(com.google.android.gms.internal.ads.zzgsx.zzc(com.ironsource.B5.U)).zzd((java.lang.String) zze.get(i)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(0).length() + 70);
                    sb.append("position (0) must be less than the number of elements that remained (");
                    sb.append(0);
                    sb.append(")");
                    throw new java.lang.IndexOutOfBoundsException(sb.toString());
                }
                java.lang.String str3 = (java.lang.String) it.next();
                java.lang.String str4 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbk);
                java.lang.String.valueOf(str3);
                java.lang.String.valueOf(str4);
                cookieManager.setCookie(str2, java.lang.String.valueOf(str3).concat(java.lang.String.valueOf(str4)));
            }
        }
    }
}
