package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import e1.k;

/* loaded from: classes.dex */
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
        zzpu zzpuVar;
        zzpu zzpuVar2;
        zzpp zzppVar;
        zzqx zzqxVar = this.zza;
        zzpuVar = zzqxVar.zzo;
        if (zzpuVar != null) {
            zzpuVar2 = zzqxVar.zzo;
            zzppVar = ((zzrb) zzpuVar2).zza.zzc;
            zzppVar.zzv(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzc(long j, long j3, long j7, long j8) {
        long zzL;
        long zzM;
        zzqx zzqxVar = this.zza;
        zzL = zzqxVar.zzL();
        zzM = zzqxVar.zzM();
        StringBuilder j9 = k.j("Spurious audio timestamp (frame position mismatch): ", ", ", j);
        j9.append(j3);
        j9.append(", ");
        j9.append(j7);
        j9.append(", ");
        j9.append(j8);
        j9.append(", ");
        j9.append(zzL);
        j9.append(", ");
        j9.append(zzM);
        zzdq.zzf("DefaultAudioSink", j9.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzd(long j, long j3, long j7, long j8) {
        long zzL;
        long zzM;
        zzqx zzqxVar = this.zza;
        zzL = zzqxVar.zzL();
        zzM = zzqxVar.zzM();
        StringBuilder j9 = k.j("Spurious audio timestamp (system clock mismatch): ", ", ", j);
        j9.append(j3);
        j9.append(", ");
        j9.append(j7);
        j9.append(", ");
        j9.append(j8);
        j9.append(", ");
        j9.append(zzL);
        j9.append(", ");
        j9.append(zzM);
        zzdq.zzf("DefaultAudioSink", j9.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zze(int i7, long j) {
        zzpu zzpuVar;
        long j3;
        zzpu zzpuVar2;
        zzpp zzppVar;
        zzqx zzqxVar = this.zza;
        zzpuVar = zzqxVar.zzo;
        if (zzpuVar != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j3 = zzqxVar.zzU;
            zzpuVar2 = this.zza.zzo;
            zzppVar = ((zzrb) zzpuVar2).zza.zzc;
            zzppVar.zzx(i7, j, elapsedRealtime - j3);
        }
    }
}
