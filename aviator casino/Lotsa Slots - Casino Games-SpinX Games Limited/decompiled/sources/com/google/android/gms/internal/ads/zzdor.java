package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdor implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzdop zza;

    private zzdor(com.google.android.gms.internal.ads.zzdop zzdopVar) {
        this.zza = zzdopVar;
    }

    public static com.google.android.gms.internal.ads.zzdor zzc(com.google.android.gms.internal.ads.zzdop zzdopVar) {
        return new com.google.android.gms.internal.ads.zzdor(zzdopVar);
    }

    public static org.json.JSONObject zzd(com.google.android.gms.internal.ads.zzdop zzdopVar) {
        org.json.JSONObject zzc = zzdopVar.zzc();
        com.google.android.gms.internal.ads.zzinc.zzb(zzc);
        return zzc;
    }

    public final org.json.JSONObject zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}
