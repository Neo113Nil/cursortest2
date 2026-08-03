package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzepn implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzepm zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;
    private final com.google.android.gms.internal.ads.zzind zze;

    private zzepn(com.google.android.gms.internal.ads.zzepm zzepmVar, com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        this.zza = zzepmVar;
        this.zzb = zzindVar;
        this.zzc = zzindVar2;
        this.zzd = zzindVar3;
        this.zze = zzindVar4;
    }

    public static com.google.android.gms.internal.ads.zzepn zza(com.google.android.gms.internal.ads.zzepm zzepmVar, com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        return new com.google.android.gms.internal.ads.zzepn(zzepmVar, zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return this.zza.zzb((com.google.android.gms.common.util.Clock) this.zzb.zzb(), ((com.google.android.gms.internal.ads.zzepg) this.zzc).zzb(), (com.google.android.gms.internal.ads.zzelx) this.zzd.zzb(), (com.google.android.gms.internal.ads.zzfsc) this.zze.zzb());
    }
}
