package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdox implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzdox(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        this.zza = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzdox zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        return new com.google.android.gms.internal.ads.zzdox(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza = ((com.google.android.gms.internal.ads.zzcoi) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        return new com.google.android.gms.internal.ads.zzben(java.util.UUID.randomUUID().toString(), zza, "native", new org.json.JSONObject(), false, true);
    }
}
