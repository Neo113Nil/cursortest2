package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcee extends com.google.android.libraries.places.internal.zzceb {
    private final com.google.android.libraries.places.internal.zzcea zza;
    private java.lang.Object zzb;
    private boolean zzc;

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zza(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzb(java.lang.Object obj) {
        if (this.zzc) {
            throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzh.zze("More than one value received for unary call"), null);
        }
        this.zzb = obj;
        this.zzc = true;
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzc(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        if (!zzbnpVar.zzj()) {
            this.zza.setException(new com.google.android.libraries.places.internal.zzbns(zzbnpVar, zzbmgVar));
            return;
        }
        if (!this.zzc) {
            this.zza.setException(new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzh.zze("No value received for unary call"), zzbmgVar));
        }
        this.zza.set(this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzceb
    final void zze() {
        this.zza.zza().zzc(2);
    }

    zzcee(com.google.android.libraries.places.internal.zzcea zzceaVar) {
        super(null);
        this.zzc = false;
        this.zza = zzceaVar;
    }
}
