package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbsj implements com.google.android.libraries.places.internal.zzbpo {
    final com.google.android.libraries.places.internal.zzbnp zza;
    private final com.google.android.libraries.places.internal.zzbpm zzb;

    zzbsj(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar) {
        com.google.common.base.Preconditions.checkArgument(!zzbnpVar.zzj(), "error must not be OK");
        this.zza = zzbnpVar;
        this.zzb = zzbpmVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbpo
    public final com.google.android.libraries.places.internal.zzbpl zzb(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzbje[] zzbjeVarArr) {
        return new com.google.android.libraries.places.internal.zzbsi(this.zza, this.zzb, zzbjeVarArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbkz
    public final com.google.android.libraries.places.internal.zzbku zzc() {
        throw new java.lang.UnsupportedOperationException("Not a real transport");
    }
}
