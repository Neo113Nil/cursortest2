package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxa extends com.google.android.libraries.places.internal.zzbln {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbxc zza;
    private final com.google.android.libraries.places.internal.zzbxc zzb;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;

    zzbxa(com.google.android.libraries.places.internal.zzbxc zzbxcVar, com.google.android.libraries.places.internal.zzbxc zzbxcVar2) {
        java.util.Objects.requireNonNull(zzbxcVar);
        this.zza = zzbxcVar;
        this.zzc = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.zzb = (com.google.android.libraries.places.internal.zzbxc) com.google.common.base.Preconditions.checkNotNull(zzbxcVar2, "pickFirstLeafLoadBalancer");
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final com.google.android.libraries.places.internal.zzbli zza(com.google.android.libraries.places.internal.zzblj zzbljVar) {
        if (this.zzc.compareAndSet(false, true)) {
            com.google.android.libraries.places.internal.zzbxc zzbxcVar = this.zza;
            final com.google.android.libraries.places.internal.zzbxc zzbxcVar2 = this.zzb;
            com.google.android.libraries.places.internal.zzbnx zzd = zzbxcVar.zzi().zzd();
            java.util.Objects.requireNonNull(zzbxcVar2);
            zzd.zzb(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzbwz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.libraries.places.internal.zzbxc.this.zzd();
                }
            });
            zzd.zza();
        }
        return com.google.android.libraries.places.internal.zzbli.zzd();
    }
}
