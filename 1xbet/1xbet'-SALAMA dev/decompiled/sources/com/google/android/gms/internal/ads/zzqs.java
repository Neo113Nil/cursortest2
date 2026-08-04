package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzqs implements zzqa {
    final /* synthetic */ zzqx zza;

    public /* synthetic */ zzqs(zzqx zzqxVar, zzqw zzqwVar) {
        this.zza = zzqxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zza(long j) {
        zzdq.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzb(long j) {
        zzqx zzqxVar = this.zza;
        if (zzqxVar.zzo != null) {
            ((zzrb) zzqxVar.zzo).zza.zzc.zzv(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzc(long j, long j3, long j7, long j8) {
        zzqx zzqxVar = this.zza;
        long jZzL = zzqxVar.zzL();
        long jZzM = zzqxVar.zzM();
        StringBuilder sbJ = k.j("Spurious audio timestamp (frame position mismatch): ", ", ", j);
        sbJ.append(j3);
        sbJ.append(", ");
        sbJ.append(j7);
        sbJ.append(", ");
        sbJ.append(j8);
        sbJ.append(", ");
        sbJ.append(jZzL);
        sbJ.append(", ");
        sbJ.append(jZzM);
        zzdq.zzf("DefaultAudioSink", sbJ.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzd(long j, long j3, long j7, long j8) {
        zzqx zzqxVar = this.zza;
        long jZzL = zzqxVar.zzL();
        long jZzM = zzqxVar.zzM();
        StringBuilder sbJ = k.j("Spurious audio timestamp (system clock mismatch): ", ", ", j);
        sbJ.append(j3);
        sbJ.append(", ");
        sbJ.append(j7);
        sbJ.append(", ");
        sbJ.append(j8);
        sbJ.append(", ");
        sbJ.append(jZzL);
        sbJ.append(", ");
        sbJ.append(jZzM);
        zzdq.zzf("DefaultAudioSink", sbJ.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zze(int i7, long j) {
        zzqx zzqxVar = this.zza;
        if (zzqxVar.zzo != null) {
            ((zzrb) this.zza.zzo).zza.zzc.zzx(i7, j, SystemClock.elapsedRealtime() - zzqxVar.zzU);
        }
    }
}
