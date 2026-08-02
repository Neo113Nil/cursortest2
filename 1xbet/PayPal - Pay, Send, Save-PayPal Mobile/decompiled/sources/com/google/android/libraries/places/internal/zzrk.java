package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzrk extends com.google.android.libraries.places.internal.zzqx implements com.google.android.libraries.places.internal.zzrv {
    static final com.google.android.libraries.places.internal.zzra zza = new com.google.android.libraries.places.internal.zzrb();
    public static final /* synthetic */ int zzb = 0;

    private zzrk(java.util.UUID uuid, java.lang.String str, java.lang.Exception exc, boolean z, com.google.android.libraries.places.internal.zzrt zzrtVar) {
        super("<missing root>", uuid, str, zzrtVar);
    }

    public static com.google.android.libraries.places.internal.zzrk zzh(com.google.android.libraries.places.internal.zzrt zzrtVar) {
        final java.util.UUID zzc = com.google.android.libraries.places.internal.zzri.zza().zzc();
        java.lang.String zzf = com.google.android.libraries.places.internal.zzqx.zzf(zzc);
        com.google.common.collect.ImmutableSet zza2 = com.google.android.libraries.places.internal.zzrh.zza();
        if (!zza2.isEmpty()) {
            final java.lang.Exception exc = null;
            zza2.forEach(new java.util.function.Consumer(zzc, exc) { // from class: com.google.android.libraries.places.internal.zzrj
                @Override // java.util.function.Consumer
                public final /* synthetic */ void accept(java.lang.Object obj) {
                    ((com.google.android.libraries.places.internal.zzrx) obj).zza();
                }
            });
        }
        return new com.google.android.libraries.places.internal.zzrk(zzc, zzf, zza, false, zzrtVar);
    }

    @Override // com.google.android.libraries.places.internal.zzrv
    public final com.google.android.libraries.places.internal.zzro zzg() {
        return com.google.android.libraries.places.internal.zzrn.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzrv
    public final long zzi() {
        return -1L;
    }

    @Override // com.google.android.libraries.places.internal.zzrv
    public final com.google.android.libraries.places.internal.zzro zzj() {
        throw null;
    }
}
