package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzbpm implements com.google.android.gms.internal.ads.zzbpq {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzbpm zza = new com.google.android.gms.internal.ads.zzbpm();

    private /* synthetic */ zzbpm() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcmn zzcmnVar = (com.google.android.gms.internal.ads.zzcmn) obj;
        com.google.android.gms.internal.ads.zzbpq zzbpqVar = com.google.android.gms.internal.ads.zzbpp.zza;
        java.lang.String str = (java.lang.String) map.get("tx");
        java.lang.String str2 = (java.lang.String) map.get("ty");
        java.lang.String str3 = (java.lang.String) map.get("td");
        try {
            int parseInt = java.lang.Integer.parseInt(str);
            int parseInt2 = java.lang.Integer.parseInt(str2);
            int parseInt3 = java.lang.Integer.parseInt(str3);
            com.google.android.gms.internal.ads.zzbap zzS = zzcmnVar.zzS();
            if (zzS != null) {
                zzS.zzb().zze(parseInt, parseInt2, parseInt3);
            }
        } catch (java.lang.NumberFormatException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
