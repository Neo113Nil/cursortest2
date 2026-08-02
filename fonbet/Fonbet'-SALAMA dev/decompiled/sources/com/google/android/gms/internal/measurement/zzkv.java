package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzkv extends zzkx {
    public /* synthetic */ zzkv(zzku zzkuVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkx
    public final void zza(Object obj, long j) {
        ((zzkj) zzmv.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkx
    public final void zzb(Object obj, Object obj2, long j) {
        zzkj zzkjVar = (zzkj) zzmv.zzf(obj, j);
        zzkj zzkjVar2 = (zzkj) zzmv.zzf(obj2, j);
        int size = zzkjVar.size();
        int size2 = zzkjVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkjVar.zzc()) {
                zzkjVar = zzkjVar.zzd(size2 + size);
            }
            zzkjVar.addAll(zzkjVar2);
        }
        if (size > 0) {
            zzkjVar2 = zzkjVar;
        }
        zzmv.zzs(obj, j, zzkjVar2);
    }

    private zzkv() {
        super(null);
    }
}
