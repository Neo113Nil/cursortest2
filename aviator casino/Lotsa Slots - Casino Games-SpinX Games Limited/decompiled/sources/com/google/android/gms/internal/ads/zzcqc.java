package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcqc implements com.google.android.gms.ads.nonagon.signalgeneration.zzw {
    private final com.google.android.gms.internal.ads.zzcox zza;
    private com.google.android.gms.internal.ads.zzdcb zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzat zzc;

    /* synthetic */ zzcqc(com.google.android.gms.internal.ads.zzcox zzcoxVar, byte[] bArr) {
        this.zza = zzcoxVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzx zza() {
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzb, com.google.android.gms.internal.ads.zzdcb.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzat.class);
        return new com.google.android.gms.internal.ads.zzcqd(this.zza, this.zzc, new com.google.android.gms.internal.ads.zzcyz(), new com.google.android.gms.internal.ads.zzdba(), new com.google.android.gms.internal.ads.zzeaa(), this.zzb, null, null);
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzw zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzat zzatVar) {
        this.zzc = zzatVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzw zzc(com.google.android.gms.internal.ads.zzdcb zzdcbVar) {
        this.zzb = zzdcbVar;
        return this;
    }
}
