package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzbpo implements com.google.android.gms.internal.ads.zzbpq {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzbpo zza = new com.google.android.gms.internal.ads.zzbpo();

    private /* synthetic */ zzbpo() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcmg zzcmgVar = (com.google.android.gms.internal.ads.zzcmg) obj;
        com.google.android.gms.internal.ads.zzbpq zzbpqVar = com.google.android.gms.internal.ads.zzbpp.zza;
        java.lang.String str = (java.lang.String) map.get("urls");
        if (android.text.TextUtils.isEmpty(str)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URLs missing in canOpenURLs GMSG.");
            return;
        }
        java.lang.String[] split = str.split(",");
        java.util.HashMap hashMap = new java.util.HashMap();
        android.content.pm.PackageManager packageManager = zzcmgVar.getContext().getPackageManager();
        for (java.lang.String str2 : split) {
            java.lang.String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new android.content.Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", android.net.Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
            hashMap.put(str2, valueOf);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 14 + valueOf.toString().length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        ((com.google.android.gms.internal.ads.zzbsm) zzcmgVar).zze("openableURLs", hashMap);
    }
}
