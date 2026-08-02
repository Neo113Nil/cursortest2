package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhet implements zzhep {
    private static final Object zza = new Object();
    private volatile zzhep zzb;
    private volatile Object zzc = zza;

    private zzhet(zzhep zzhepVar) {
        this.zzb = zzhepVar;
    }

    public static zzhep zza(zzhep zzhepVar) {
        return ((zzhepVar instanceof zzhet) || (zzhepVar instanceof zzhef)) ? zzhepVar : new zzhet(zzhepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhep zzhepVar = this.zzb;
        if (zzhepVar == null) {
            return this.zzc;
        }
        Object zzb = zzhepVar.zzb();
        this.zzc = zzb;
        this.zzb = null;
        return zzb;
    }
}
