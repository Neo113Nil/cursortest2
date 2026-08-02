package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbuq extends com.google.android.libraries.places.internal.zzbzf {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbml zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbis zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbjs zzc;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbur zzd;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzbuq(com.google.android.libraries.places.internal.zzbur zzburVar, com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzbzg zzbzgVar, com.google.android.libraries.places.internal.zzbta zzbtaVar, com.google.android.libraries.places.internal.zzbjs zzbjsVar) {
        super(zzbmlVar, zzbmgVar, r3.zzae(), r3.zzaf(), r3.zzag(), r3.zzp(zzbisVar), zzburVar.zzb.zzv().zzb(), zzbzgVar, zzbtaVar, zzburVar.zza);
        this.zza = zzbmlVar;
        this.zzb = zzbisVar;
        this.zzc = zzbjsVar;
        java.util.Objects.requireNonNull(zzburVar);
        this.zzd = zzburVar;
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = zzburVar.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbzf
    final com.google.android.libraries.places.internal.zzbnp zze() {
        com.google.android.libraries.places.internal.zzbvq zzM = this.zzd.zzb.zzM();
        synchronized (zzM.zza) {
            com.google.android.libraries.places.internal.zzbnp zzbnpVar = zzM.zzc;
            if (zzbnpVar != null) {
                return zzbnpVar;
            }
            zzM.zzb.add(this);
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzf
    final void zzg() {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar;
        com.google.android.libraries.places.internal.zzbvq zzM = this.zzd.zzb.zzM();
        synchronized (zzM.zza) {
            zzM.zzb.remove(this);
            if (zzM.zzb.isEmpty()) {
                zzbnpVar = zzM.zzc;
                zzM.zzb = new java.util.HashSet();
            } else {
                zzbnpVar = null;
            }
        }
        if (zzbnpVar != null) {
            zzM.zzd.zzL().zzd(zzbnpVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzf
    final com.google.android.libraries.places.internal.zzbpl zzh(com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzbjb zzbjbVar, int i, boolean z, boolean z2) {
        com.google.android.libraries.places.internal.zzbis zzf = this.zzb.zzf(zzbjbVar);
        com.google.android.libraries.places.internal.zzbje[] zzf2 = com.google.android.libraries.places.internal.zzbsz.zzf(zzf, zzbmgVar, i, z, z2);
        com.google.android.libraries.places.internal.zzbjs zzb = this.zzc.zzb();
        try {
            return this.zzd.zzb.zzL().zzb(this.zza, zzbmgVar, zzf, zzf2);
        } finally {
            this.zzc.zzc(zzb);
        }
    }
}
