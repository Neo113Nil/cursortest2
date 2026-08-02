package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaoz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzapb zzc;

    public zzaoz(zzapb zzapbVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzapbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzapm zzapmVar;
        zzapm zzapmVar2;
        zzapmVar = this.zzc.zza;
        zzapmVar.zza(this.zza, this.zzb);
        zzapb zzapbVar = this.zzc;
        zzapmVar2 = zzapbVar.zza;
        zzapmVar2.zzb(zzapbVar.toString());
    }
}
