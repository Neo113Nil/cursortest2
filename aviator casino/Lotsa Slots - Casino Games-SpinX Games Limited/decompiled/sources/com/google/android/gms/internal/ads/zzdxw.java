package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdxw implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzdxw(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        this.zza = zzindVar2;
    }

    public static com.google.android.gms.internal.ads.zzdxw zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        return new com.google.android.gms.internal.ads.zzdxw(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzhcg zzc = com.google.android.gms.internal.ads.zzfoa.zzc();
        java.util.Set singleton = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzge)).booleanValue() ? java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzdkq(((com.google.android.gms.internal.ads.zzdyp) this.zza).zzb(), zzc)) : java.util.Collections.emptySet();
        com.google.android.gms.internal.ads.zzinc.zzb(singleton);
        return singleton;
    }
}
