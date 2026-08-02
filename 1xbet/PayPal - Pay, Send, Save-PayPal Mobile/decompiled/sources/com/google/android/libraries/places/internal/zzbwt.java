package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbwt implements com.google.android.libraries.places.internal.zzblo {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbxc zza;
    private com.google.android.libraries.places.internal.zzbxb zzb;

    /* synthetic */ zzbwt(com.google.android.libraries.places.internal.zzbxc zzbxcVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbxcVar);
        this.zza = zzbxcVar;
    }

    @Override // com.google.android.libraries.places.internal.zzblo
    public final void zza(com.google.android.libraries.places.internal.zzbjo zzbjoVar) {
        java.util.logging.Logger logger;
        java.util.logging.Logger logger2;
        com.google.android.libraries.places.internal.zzbxc zzbxcVar = this.zza;
        if (zzbxcVar.zzm()) {
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.Object[] objArr = {zzbjoVar, this.zzb.zzf()};
            logger2 = com.google.android.libraries.places.internal.zzbxc.zzf;
            logger2.logp(level, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", objArr);
            return;
        }
        java.util.logging.Level level2 = java.util.logging.Level.FINE;
        java.lang.Object[] objArr2 = {zzbjoVar, this.zzb.zzf()};
        logger = com.google.android.libraries.places.internal.zzbxc.zzf;
        logger.logp(level2, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", objArr2);
        this.zzb.zzi(zzbjoVar);
        if (zzbxcVar.zzk().zza()) {
            if (this.zzb == zzbxcVar.zzj().get(zzbxcVar.zzk().zzd())) {
                zzbxcVar.zzg(this.zzb);
            }
        }
    }

    final /* synthetic */ void zzb(com.google.android.libraries.places.internal.zzbxb zzbxbVar) {
        this.zzb = zzbxbVar;
    }
}
