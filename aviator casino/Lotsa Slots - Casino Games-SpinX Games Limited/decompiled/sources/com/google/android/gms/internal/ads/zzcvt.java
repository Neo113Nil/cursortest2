package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcvt implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzcvs zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzcvt(com.google.android.gms.internal.ads.zzcvs zzcvsVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzcvsVar;
        this.zzb = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzcvt zza(com.google.android.gms.internal.ads.zzcvs zzcvsVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzcvt(zzcvsVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return this.zza.zze(((com.google.android.gms.internal.ads.zzing) this.zzb).zzb());
    }
}
