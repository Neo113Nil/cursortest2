package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzatg extends com.google.android.libraries.places.internal.zzbiw {
    boolean zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzatk zzb;
    private final com.google.android.libraries.places.internal.zzbiw zzc;

    zzatg(com.google.android.libraries.places.internal.zzatk zzatkVar, com.google.android.libraries.places.internal.zzbiw zzbiwVar) {
        java.util.Objects.requireNonNull(zzatkVar);
        this.zzb = zzatkVar;
        this.zza = false;
        this.zzc = zzbiwVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zza(final com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zzb.zzq().execute(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzatf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatg.this.zze(zzbmgVar);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzb(final java.lang.Object obj) {
        this.zzb.zzq().execute(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzatc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatg.this.zzf(obj);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzc(final com.google.android.libraries.places.internal.zzbnp zzbnpVar, final com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zzb.zzq().execute(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzatd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatg.this.zzg(zzbnpVar, zzbmgVar);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzd() {
        this.zzb.zzq().execute(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzate
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzatg.this.zzh();
            }
        });
    }

    final /* synthetic */ void zze(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        if (this.zza) {
            return;
        }
        this.zzc.zza(zzbmgVar);
    }

    final /* synthetic */ void zzf(java.lang.Object obj) {
        if (this.zza) {
            return;
        }
        this.zzc.zzb(obj);
    }

    final /* synthetic */ void zzg(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        if (this.zza) {
            return;
        }
        try {
            this.zzc.zzc(zzbnpVar, zzbmgVar);
        } finally {
            this.zza = true;
            this.zzb.zzs().zza();
        }
    }

    final /* synthetic */ void zzh() {
        if (this.zza) {
            return;
        }
        this.zzc.zzd();
    }
}
