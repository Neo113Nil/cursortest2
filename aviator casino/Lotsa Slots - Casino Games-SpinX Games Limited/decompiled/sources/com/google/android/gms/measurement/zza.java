package com.google.android.gms.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zza extends com.google.android.gms.measurement.zzc {
    private final com.google.android.gms.measurement.internal.zzib zza;
    private final com.google.android.gms.measurement.internal.zzli zzb;

    public zza(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(null);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzibVar);
        this.zza = zzibVar;
        this.zzb = zzibVar.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zzb.zzB(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzb(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        this.zzb.zzC(str, str2, bundle, true, false, j);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.util.Map zzc(boolean z) {
        java.util.List<com.google.android.gms.measurement.internal.zzpk> zzO = this.zzb.zzO(z);
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(zzO.size());
        for (com.google.android.gms.measurement.internal.zzpk zzpkVar : zzO) {
            java.lang.Object zza = zzpkVar.zza();
            if (zza != null) {
                arrayMap.put(zzpkVar.zzb, zza);
            }
        }
        return arrayMap;
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.util.Map zzd(java.lang.String str, java.lang.String str2, boolean z) {
        return this.zzb.zzP(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zze(com.google.android.gms.measurement.internal.zzjo zzjoVar) {
        this.zzb.zzV(zzjoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzf(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        this.zzb.zzW(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzg(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        this.zzb.zzX(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.String zzh() {
        return this.zzb.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.String zzi() {
        return this.zzb.zzae();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.String zzj() {
        return this.zzb.zzQ();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.String zzk() {
        return this.zzb.zzQ();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final long zzl() {
        return this.zza.zzk().zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzm(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zza;
        zzibVar.zzw().zza(str, zzibVar.zzaZ().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzn(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zza;
        zzibVar.zzw().zzb(str, zzibVar.zzaZ().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzo(android.os.Bundle bundle) {
        this.zzb.zzZ(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzp(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza.zzj().zzab(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.util.List zzq(java.lang.String str, java.lang.String str2) {
        return this.zzb.zzac(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final int zzr(java.lang.String str) {
        this.zzb.zzY(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Boolean zzs() {
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Integer zzt() {
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.String zzu() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Long zzv() {
        return this.zzb.zzk();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Double zzw() {
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final java.lang.Object zzx(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? this.zzb.zzi() : this.zzb.zzl() : this.zzb.zzm() : this.zzb.zzk() : this.zzb.zzj();
    }
}
