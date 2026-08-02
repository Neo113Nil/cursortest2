package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzaso implements com.google.android.libraries.places.internal.zzbiy {
    private final com.google.android.libraries.places.internal.zzcez zza;
    private final java.lang.Class zzb;
    private final java.lang.Class zzc;

    @Override // com.google.android.libraries.places.internal.zzbiy
    public final com.google.android.libraries.places.internal.zzbix zza(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzbit zzbitVar) {
        try {
            com.google.common.collect.ImmutableList immutableList = (com.google.common.collect.ImmutableList) this.zza.zzb();
            com.google.android.libraries.places.internal.zzasp.zzb(zzbmlVar, this.zzb, true);
            com.google.android.libraries.places.internal.zzasp.zzb(zzbmlVar, this.zzc, false);
            com.google.common.collect.ImmutableList immutableList2 = immutableList;
            return new com.google.android.libraries.places.internal.zzatp(new com.google.android.libraries.places.internal.zzatk(zzbitVar, zzbmlVar, zzbisVar, 2, immutableList));
        } catch (com.google.android.libraries.places.internal.zzbnq e) {
            return new com.google.android.libraries.places.internal.zzaty(com.google.android.libraries.places.internal.zzbnp.zzb(e));
        }
    }

    zzaso(com.google.android.libraries.places.internal.zzcez zzcezVar, int i, java.lang.Class cls, java.lang.Class cls2) {
        this.zza = zzcezVar;
        this.zzb = cls;
        this.zzc = cls2;
    }
}
