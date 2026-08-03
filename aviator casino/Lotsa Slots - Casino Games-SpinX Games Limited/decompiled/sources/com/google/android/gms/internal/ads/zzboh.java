package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzboh implements com.google.android.gms.internal.ads.zzbpq {
    private final com.google.android.gms.internal.ads.zzboi zza;

    public zzboh(com.google.android.gms.internal.ads.zzboi zzboiVar) {
        this.zza = zzboiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("name");
        if (str != null) {
            this.zza.zzb(str, (java.lang.String) map.get("info"));
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App event with no name parameter.");
        }
    }
}
