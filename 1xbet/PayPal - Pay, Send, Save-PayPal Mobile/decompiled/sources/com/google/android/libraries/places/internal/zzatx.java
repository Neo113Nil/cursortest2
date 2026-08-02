package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzatx extends com.google.android.libraries.places.internal.zzbiw {
    private final com.google.android.libraries.places.internal.zzbiw zza;
    private final com.google.android.libraries.places.internal.zzsd zzb = com.google.android.libraries.places.internal.zzsd.zza();

    public zzatx(com.google.android.libraries.places.internal.zzbiw zzbiwVar) {
        this.zza = zzbiwVar;
    }

    private final void zzh(java.lang.Runnable runnable) {
        com.google.common.base.Preconditions.checkNotNull(com.google.android.libraries.places.internal.zzsg.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        if (com.google.android.libraries.places.internal.zzrh.zze()) {
            runnable.run();
        } else {
            com.google.android.libraries.places.internal.zzsd.zzb(this.zzb, runnable).run();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zza(final com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        zzh(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzatw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatx.this.zze(zzbmgVar);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzb(final java.lang.Object obj) {
        zzh(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzatu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatx.this.zzf(obj);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzc(final com.google.android.libraries.places.internal.zzbnp zzbnpVar, final com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        zzh(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzatv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatx.this.zzg(zzbnpVar, zzbmgVar);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzd() {
        final com.google.android.libraries.places.internal.zzbiw zzbiwVar = this.zza;
        java.util.Objects.requireNonNull(zzbiwVar);
        zzh(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzatt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzbiw.this.zzd();
            }
        });
    }

    final /* synthetic */ void zze(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zza.zza(zzbmgVar);
    }

    final /* synthetic */ void zzf(java.lang.Object obj) {
        this.zza.zzb(obj);
    }

    final /* synthetic */ void zzg(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zza.zzc(zzbnpVar, zzbmgVar);
    }
}
