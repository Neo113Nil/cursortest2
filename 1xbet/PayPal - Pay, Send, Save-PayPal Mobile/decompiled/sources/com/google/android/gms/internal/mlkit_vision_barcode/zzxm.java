package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public abstract class zzxm {
    public static final com.google.android.gms.internal.mlkit_vision_barcode.zzxm zza;

    static {
        zzm().zzm();
        com.google.android.gms.internal.mlkit_vision_barcode.zzxl zzm = zzm();
        zzm.zzi(false);
        zza = zzm.zzm();
    }

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzxl zzm() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzxd zzxdVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzxd();
        zzxdVar.zzg(10);
        zzxdVar.zze(5);
        zzxdVar.zzf(0.25f);
        zzxdVar.zzd(0.8f);
        zzxdVar.zzi(true);
        zzxdVar.zzc(0.5f);
        zzxdVar.zzb(0.8f);
        zzxdVar.zzk(1500L);
        zzxdVar.zzh(3000L);
        zzxdVar.zza(true);
        zzxdVar.zzj(0.1f);
        zzxdVar.zzl(0.05f);
        return zzxdVar;
    }

    abstract float zza();

    abstract float zzb();

    abstract float zzc();

    abstract float zzd();

    abstract float zze();

    abstract float zzf();

    abstract int zzg();

    abstract int zzh();

    abstract long zzi();

    abstract long zzj();

    abstract boolean zzk();

    abstract boolean zzl();
}
