package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzct {
    public static final zzvu zza = zza(16);
    public static final zzvu zzb;

    static {
        zza(32);
        zza(16, 16);
        zza(32, 16);
        zzur zzurVar = zzur.SHA256;
        zzb = zza(16, 16, 32, 16, zzurVar);
        zza(32, 16, 32, 32, zzurVar);
        zzvu.zza zzaVarZza = zzvu.zza().zza(zzeh.zza());
        zzws zzwsVar = zzws.TINK;
    }

    private static zzvu zza(int i7, int i8, int i9, int i10, zzur zzurVar) {
        zzsh zzshVar = (zzsh) ((zzajy) zzsh.zzb().zza((zzsk) ((zzajy) zzsk.zzb().zza(16).zze())).zza(i7).zze());
        return (zzvu) ((zzajy) zzvu.zza().zza(((zzsb) ((zzajy) zzsb.zza().zza(zzshVar).zza((zzux) ((zzajy) zzux.zzc().zza((zzva) ((zzajy) zzva.zzc().zza(zzurVar).zza(i10).zze())).zza(32).zze())).zze())).a_()).zza(zzdd.zza()).zza(zzws.TINK).zze());
    }

    private static zzvu zza(int i7, int i8) {
        return (zzvu) ((zzajy) zzvu.zza().zza(((zzsq) ((zzajy) zzsq.zzb().zza(i7).zza((zzst) ((zzajy) zzst.zzb().zza(16).zze())).zze())).a_()).zza(zzdl.zza()).zza(zzws.TINK).zze());
    }

    private static zzvu zza(int i7) {
        return (zzvu) ((zzajy) zzvu.zza().zza(((zzsz) ((zzajy) zzsz.zzc().zza(i7).zze())).a_()).zza(zzds.zza()).zza(zzws.TINK).zze());
    }
}
