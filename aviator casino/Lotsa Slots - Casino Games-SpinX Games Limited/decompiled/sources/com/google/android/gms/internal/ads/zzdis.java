package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdis implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzdir zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzdis(com.google.android.gms.internal.ads.zzdir zzdirVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzdirVar;
        this.zzb = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzdis zza(com.google.android.gms.internal.ads.zzdir zzdirVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzdis(zzdirVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzdct zzp = this.zza.zzp(((com.google.android.gms.internal.ads.zzing) this.zzb).zzb());
        com.google.android.gms.internal.ads.zzinc.zzb(zzp);
        return zzp;
    }
}
