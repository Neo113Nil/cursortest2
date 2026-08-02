package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbty implements com.google.android.libraries.places.internal.zzbwc {
    final com.google.android.libraries.places.internal.zzbqa zza;
    boolean zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbua zzc;

    zzbty(com.google.android.libraries.places.internal.zzbua zzbuaVar, com.google.android.libraries.places.internal.zzbqa zzbqaVar) {
        java.util.Objects.requireNonNull(zzbuaVar);
        this.zzc = zzbuaVar;
        this.zzb = false;
        this.zza = zzbqaVar;
    }

    static final /* synthetic */ java.lang.String zzf(com.google.android.libraries.places.internal.zzbni zzbniVar) {
        int ordinal;
        if (zzbniVar == null || (ordinal = zzbniVar.ordinal()) == 0) {
            return "none";
        }
        if (ordinal == 1) {
            return "integrity_only";
        }
        if (ordinal == 2) {
            return "privacy_and_integrity";
        }
        throw new java.lang.IllegalArgumentException("Unknown SecurityLevel: ".concat(zzbniVar.toString()));
    }

    static final /* synthetic */ java.lang.String zzg(com.google.android.libraries.places.internal.zzbio zzbioVar, com.google.android.libraries.places.internal.zzbin zzbinVar) {
        java.lang.String str = (java.lang.String) zzbioVar.zza(zzbinVar);
        return str == null ? "" : str;
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final com.google.android.libraries.places.internal.zzbio zza(com.google.android.libraries.places.internal.zzbio zzbioVar) {
        java.util.Iterator it = this.zzc.zzp().iterator();
        if (!it.hasNext()) {
            return zzbioVar;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final void zzb() {
        com.google.android.libraries.places.internal.zzbua zzbuaVar = this.zzc;
        zzbuaVar.zzo().zza(2, "READY");
        com.google.android.libraries.places.internal.zzbtv zzbtvVar = new com.google.android.libraries.places.internal.zzbtv(this);
        com.google.android.libraries.places.internal.zzbnx zzq = zzbuaVar.zzq();
        zzq.zzb(zzbtvVar);
        zzq.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final void zzc(boolean z) {
        this.zzc.zzj(this.zza, z);
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final void zzd(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        java.lang.String zzO;
        com.google.android.libraries.places.internal.zzbku zzc = this.zza.zzc();
        zzO = com.google.android.libraries.places.internal.zzbua.zzO(zzbnpVar);
        java.lang.Object[] objArr = {zzc, zzO};
        com.google.android.libraries.places.internal.zzbua zzbuaVar = this.zzc;
        zzbuaVar.zzo().zzb(2, "{0} SHUTDOWN with {1}", objArr);
        this.zzb = true;
        com.google.android.libraries.places.internal.zzbtw zzbtwVar = new com.google.android.libraries.places.internal.zzbtw(this, zzbnpVar);
        com.google.android.libraries.places.internal.zzbnx zzq = zzbuaVar.zzq();
        zzq.zzb(zzbtwVar);
        zzq.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final void zze() {
        com.google.common.base.Preconditions.checkState(this.zzb, "transportShutdown() must be called before transportTerminated().");
        com.google.android.libraries.places.internal.zzbqa zzbqaVar = this.zza;
        java.lang.Object[] objArr = {zzbqaVar.zzc()};
        com.google.android.libraries.places.internal.zzbua zzbuaVar = this.zzc;
        zzbuaVar.zzo().zzb(2, "{0} Terminated", objArr);
        zzbuaVar.zzn().zzg(zzbqaVar);
        zzbuaVar.zzj(zzbqaVar, false);
        java.util.Iterator it = zzbuaVar.zzp().iterator();
        if (it.hasNext()) {
            zzbqaVar.zzf();
            throw null;
        }
        com.google.android.libraries.places.internal.zzbnx zzq = zzbuaVar.zzq();
        zzq.zzb(new com.google.android.libraries.places.internal.zzbtx(this));
        zzq.zza();
    }
}
