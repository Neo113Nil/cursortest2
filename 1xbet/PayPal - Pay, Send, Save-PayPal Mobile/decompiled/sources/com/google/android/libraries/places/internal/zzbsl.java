package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
abstract class zzbsl implements com.google.android.libraries.places.internal.zzbpl {
    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("delegate", zze()).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zza(com.google.android.libraries.places.internal.zzbjv zzbjvVar) {
        zze().zza(zzbjvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzb(int i) {
        zze().zzb(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzc(int i) {
        zze().zzc(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzd(com.google.android.libraries.places.internal.zzbjy zzbjyVar) {
        zze().zzd(zzbjyVar);
    }

    protected abstract com.google.android.libraries.places.internal.zzbpl zze();

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzk() {
        zze().zzk();
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzl(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        zze().zzl(zzbnpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final boolean zzm() {
        return zze().zzm();
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzn(com.google.android.libraries.places.internal.zzbtf zzbtfVar) {
        zze().zzn(zzbtfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzr() {
        zze().zzr();
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzs(int i) {
        zze().zzs(i);
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzt(java.io.InputStream inputStream) {
        zze().zzt(inputStream);
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzu() {
        zze().zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzv(com.google.android.libraries.places.internal.zzbjj zzbjjVar) {
        zze().zzv(zzbjjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public void zzf(com.google.android.libraries.places.internal.zzbpn zzbpnVar) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final com.google.android.libraries.places.internal.zzbio zzam() {
        throw null;
    }

    zzbsl() {
    }
}
