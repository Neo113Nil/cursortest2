package com.google.firebase.analytics;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* loaded from: classes3.dex */
final class zzd implements com.google.android.gms.measurement.internal.zzlj {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zza;

    zzd(com.google.android.gms.internal.measurement.zzfb zzfbVar) {
        this.zza = zzfbVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza.zzi(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzb(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        this.zza.zzj(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.util.Map zzd(java.lang.String str, java.lang.String str2, boolean z) {
        return this.zza.zzC(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zze(com.google.android.gms.measurement.internal.zzjo zzjoVar) {
        this.zza.zzd(zzjoVar);
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
        return this.zza.zzA();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.String zzi() {
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.String zzj() {
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.String zzk() {
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final long zzl() {
        return this.zza.zzz();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzm(java.lang.String str) {
        this.zza.zzu(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzn(java.lang.String str) {
        this.zza.zzv(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzo(android.os.Bundle bundle) {
        this.zza.zzl(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzp(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza.zzm(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.util.List zzq(java.lang.String str, java.lang.String str2) {
        return this.zza.zzn(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final int zzr(java.lang.String str) {
        return this.zza.zzF(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.Object zzx(int i) {
        return this.zza.zzJ(i);
    }
}
