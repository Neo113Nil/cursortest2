package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zztq {
    private final zzv zza;
    private final zzv zzb;
    private final int zzc;
    private final int zzd;
    private final zzri zze;
    private final zzck zzf;
    private final zzbf zzg;
    private final Object zzh;

    private zztq(zzv zzvVar, zzv zzvVar2, int i, int i2, zzri zzriVar, zzck zzckVar, zzbf zzbfVar, Object obj) {
        this.zza = zzvVar;
        this.zzb = zzvVar2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = zzriVar;
        this.zzf = zzckVar;
        this.zzg = zzbfVar;
        this.zzh = obj;
    }

    /* synthetic */ zztq(zzv zzvVar, zzv zzvVar2, int i, int i2, zzri zzriVar, zzck zzckVar, zzbf zzbfVar, Object obj, byte[] bArr) {
        this(zzvVar, zzvVar2, i, i2, zzriVar, zzckVar, zzbfVar, obj);
    }

    final /* synthetic */ zztq zza(zzri zzriVar) {
        return new zztq(this.zza, this.zzb, this.zzc, this.zzd, zzriVar, this.zzf, this.zzg, this.zzh);
    }

    final /* synthetic */ long zzb(long j) {
        return zzfm.zzu(j, this.zza.zzK);
    }

    final /* synthetic */ long zzc(long j) {
        return zzfm.zzu(j, this.zze.zzb);
    }

    final /* synthetic */ zzsc zzd() {
        zzri zzriVar = this.zze;
        return new zzsc(zzriVar.zza, zzriVar.zzb, zzriVar.zzc, false, false, zzriVar.zze);
    }

    final /* synthetic */ boolean zze() {
        return Objects.equals(this.zza.zzp, "audio/raw");
    }

    final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    final /* synthetic */ zzv zzg() {
        return this.zzb;
    }

    final /* synthetic */ int zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }

    final /* synthetic */ zzri zzj() {
        return this.zze;
    }

    final /* synthetic */ zzck zzk() {
        return this.zzf;
    }

    final /* synthetic */ zzbf zzl() {
        return this.zzg;
    }

    final /* synthetic */ Object zzm() {
        return this.zzh;
    }
}
