package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public class zzt extends com.google.android.gms.ads.internal.util.zzz {
    public zzt() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final android.webkit.CookieManager zza(android.content.Context context) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzI()) {
            return null;
        }
        try {
            return android.webkit.CookieManager.getInstance();
        } catch (java.lang.Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public com.google.android.gms.internal.ads.zzclf zzb(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzbhp zzbhpVar, boolean z, com.google.android.gms.internal.ads.zzekr zzekrVar) {
        return new com.google.android.gms.internal.ads.zzcmi(zzckuVar, zzbhpVar, z, zzekrVar);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final android.webkit.WebResourceResponse zzc(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.util.Map map, java.io.InputStream inputStream) {
        return new android.webkit.WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
