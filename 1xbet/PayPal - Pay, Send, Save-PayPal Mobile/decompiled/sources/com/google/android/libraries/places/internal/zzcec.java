package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzcec extends com.google.android.libraries.places.internal.zzceb {
    private final com.google.android.libraries.places.internal.zzcej zza;
    private final com.google.android.libraries.places.internal.zzcdz zzb;
    private boolean zzc;

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zza(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzc(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        if (zzbnpVar.zzj()) {
            this.zza.zzb();
        } else {
            this.zza.zza(new com.google.android.libraries.places.internal.zzbns(zzbnpVar, zzbmgVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzd() {
    }

    @Override // com.google.android.libraries.places.internal.zzceb
    final void zze() {
        this.zzb.zzd(1);
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzb(java.lang.Object obj) {
        if (this.zzc) {
            throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzh.zze("More than one responses received for unary or client-streaming call"), null);
        }
        this.zzc = true;
        this.zza.zzc(obj);
    }

    zzcec(com.google.android.libraries.places.internal.zzcej zzcejVar, com.google.android.libraries.places.internal.zzcdz zzcdzVar) {
        super(null);
        this.zza = zzcejVar;
        this.zzb = zzcdzVar;
    }
}
