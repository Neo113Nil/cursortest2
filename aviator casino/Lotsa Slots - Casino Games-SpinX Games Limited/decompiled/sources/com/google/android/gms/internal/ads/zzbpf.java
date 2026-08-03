package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzbpf implements com.google.android.gms.internal.ads.zzbpq {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzbpf zza = new com.google.android.gms.internal.ads.zzbpf();

    private /* synthetic */ zzbpf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcmg zzcmgVar = (com.google.android.gms.internal.ads.zzcmg) obj;
        com.google.android.gms.internal.ads.zzbpq zzbpqVar = com.google.android.gms.internal.ads.zzbpp.zza;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjy)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("canOpenAppGmsgHandler disabled.");
            return;
        }
        java.lang.String str = (java.lang.String) map.get("package_name");
        if (android.text.TextUtils.isEmpty(str)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing in canOpenApp GMSG.");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(zzcmgVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 13 + valueOf.toString().length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(valueOf);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        ((com.google.android.gms.internal.ads.zzbsm) zzcmgVar).zze("openableApp", hashMap);
    }
}
