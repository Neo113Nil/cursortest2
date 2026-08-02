package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
abstract class zzbsm implements com.google.android.libraries.places.internal.zzbpn {
    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("delegate", zze()).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbpn
    public final void zza(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        zze().zza(zzbmgVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcad
    public final void zzb(com.google.android.libraries.places.internal.zzcac zzcacVar) {
        zze().zzb(zzcacVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcad
    public final void zzd() {
        zze().zzd();
    }

    protected abstract com.google.android.libraries.places.internal.zzbpn zze();

    @Override // com.google.android.libraries.places.internal.zzbpn
    public void zzc(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        throw null;
    }

    zzbsm() {
    }
}
