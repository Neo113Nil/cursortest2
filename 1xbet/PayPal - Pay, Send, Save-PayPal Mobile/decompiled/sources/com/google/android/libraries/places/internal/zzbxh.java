package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxh extends com.google.android.libraries.places.internal.zzbln {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbxi zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;

    /* synthetic */ zzbxh(com.google.android.libraries.places.internal.zzbxi zzbxiVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbxiVar);
        this.zza = zzbxiVar;
        this.zzb = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final com.google.android.libraries.places.internal.zzbli zza(com.google.android.libraries.places.internal.zzblj zzbljVar) {
        if (this.zzb.compareAndSet(false, true)) {
            final com.google.android.libraries.places.internal.zzbxi zzbxiVar = this.zza;
            com.google.android.libraries.places.internal.zzbnx zzd = zzbxiVar.zzf().zzd();
            java.util.Objects.requireNonNull(zzbxiVar);
            zzd.zzb(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzbxg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.libraries.places.internal.zzbxi.this.zzd();
                }
            });
            zzd.zza();
        }
        return com.google.android.libraries.places.internal.zzbli.zzd();
    }
}
