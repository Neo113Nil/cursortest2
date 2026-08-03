package com.google.android.gms.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzb extends com.google.android.gms.measurement.zzc {
    private final com.google.android.gms.measurement.internal.zzlj zza;

    public zzb(com.google.android.gms.measurement.internal.zzlj zzljVar) {
        super(null);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza.zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzb(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        this.zza.zzb(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.util.Map zzc(boolean z) {
        return this.zza.zzd(null, null, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.util.Map zzd(java.lang.String str, java.lang.String str2, boolean z) {
        return this.zza.zzd(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zze(com.google.android.gms.measurement.internal.zzjo zzjoVar) {
        this.zza.zze(zzjoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzf(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        this.zza.zzf(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzg(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        this.zza.zzg(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.String zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.String zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.String zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.String zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final long zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzm(java.lang.String str) {
        this.zza.zzm(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzn(java.lang.String str) {
        this.zza.zzn(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzo(android.os.Bundle bundle) {
        this.zza.zzo(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzp(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza.zzp(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.util.List zzq(java.lang.String str, java.lang.String str2) {
        return this.zza.zzq(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final int zzr(java.lang.String str) {
        return this.zza.zzr(str);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Boolean zzs() {
        return (java.lang.Boolean) this.zza.zzx(4);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Integer zzt() {
        return (java.lang.Integer) this.zza.zzx(3);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.String zzu() {
        return (java.lang.String) this.zza.zzx(0);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Long zzv() {
        return (java.lang.Long) this.zza.zzx(1);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Double zzw() {
        return (java.lang.Double) this.zza.zzx(2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.Object zzx(int i) {
        return this.zza.zzx(i);
    }
}
