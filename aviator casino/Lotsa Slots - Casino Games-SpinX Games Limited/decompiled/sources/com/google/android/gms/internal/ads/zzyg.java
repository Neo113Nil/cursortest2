package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzyg extends com.google.android.gms.internal.ads.zzago {
    private final com.google.android.gms.internal.ads.zzzb zza;
    private final com.google.android.gms.internal.ads.zzafv zzb;
    private final java.util.concurrent.atomic.AtomicReference zzc;

    zzyg(com.google.android.gms.internal.ads.zzzb zzzbVar) {
        super(zzzbVar);
        this.zza = zzzbVar;
        this.zzb = new com.google.android.gms.internal.ads.zzafv();
        this.zzc = new java.util.concurrent.atomic.AtomicReference(com.google.android.gms.internal.ads.zzyf.PASS_THROUGH);
    }

    private final com.google.android.gms.internal.ads.zzahk zzh() {
        return this.zzc.get() == com.google.android.gms.internal.ads.zzyf.DISCARDING ? this.zzb : this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzahk
    public final int zza(com.google.android.gms.internal.ads.zzj zzjVar, int i, boolean z) throws java.io.IOException {
        return zzh().zza(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzahk
    public final int zzb(com.google.android.gms.internal.ads.zzj zzjVar, int i, boolean z, int i2) throws java.io.IOException {
        return zzh().zzb(zzjVar, i, z, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzahk
    public final void zzc(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        zzh().zzc(zzetVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzahk
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar, int i, int i2) {
        zzh().zzd(zzetVar, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzahk
    public final void zze(long j, int i, int i2, int i3, com.google.android.gms.internal.ads.zzahj zzahjVar) {
        zzh().zze(j, i, i2, i3, zzahjVar);
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == com.google.android.gms.internal.ads.zzyf.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.zza.zzg(false);
            atomicReference.set(com.google.android.gms.internal.ads.zzyf.DISCARDING);
        }
    }

    final boolean zzf() {
        return this.zzc.get() == com.google.android.gms.internal.ads.zzyf.PASS_THROUGH;
    }
}
