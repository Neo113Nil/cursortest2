package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhee implements zzheg {
    private zzhep zza;

    public static void zza(zzhep zzhepVar, zzhep zzhepVar2) {
        zzhee zzheeVar = (zzhee) zzhepVar;
        if (zzheeVar.zza != null) {
            throw new IllegalStateException();
        }
        zzheeVar.zza = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        zzhep zzhepVar = this.zza;
        if (zzhepVar != null) {
            return zzhepVar.zzb();
        }
        throw new IllegalStateException();
    }
}
