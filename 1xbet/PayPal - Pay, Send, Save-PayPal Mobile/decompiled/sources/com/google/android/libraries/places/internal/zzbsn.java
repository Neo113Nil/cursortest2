package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
abstract class zzbsn implements com.google.android.libraries.places.internal.zzbqa {
    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("delegate", zza()).toString();
    }

    protected abstract com.google.android.libraries.places.internal.zzbqa zza();

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final java.lang.Runnable zzaq(com.google.android.libraries.places.internal.zzbwc zzbwcVar) {
        zza().zzaq(zzbwcVar);
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbkz
    public final com.google.android.libraries.places.internal.zzbku zzc() {
        return zza().zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public void zzd(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        zza().zzd(zzbnpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public void zze(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        zza().zze(zzbnpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbqa
    public final com.google.android.libraries.places.internal.zzbio zzf() {
        return zza().zzf();
    }

    @Override // com.google.android.libraries.places.internal.zzbpo
    public com.google.android.libraries.places.internal.zzbpl zzb(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzbje[] zzbjeVarArr) {
        throw null;
    }

    zzbsn() {
    }
}
