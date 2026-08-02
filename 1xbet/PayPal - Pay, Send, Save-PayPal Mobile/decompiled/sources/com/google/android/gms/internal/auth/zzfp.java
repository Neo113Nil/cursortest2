package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzfp implements com.google.android.gms.internal.auth.zzgj {
    private static final com.google.android.gms.internal.auth.zzfv zza = new com.google.android.gms.internal.auth.zzfn();
    private final com.google.android.gms.internal.auth.zzfv zzb;

    public zzfp() {
        com.google.android.gms.internal.auth.zzfv zzfvVar;
        com.google.android.gms.internal.auth.zzfv[] zzfvVarArr = new com.google.android.gms.internal.auth.zzfv[2];
        zzfvVarArr[0] = com.google.android.gms.internal.auth.zzes.zza();
        try {
            zzfvVar = (com.google.android.gms.internal.auth.zzfv) java.lang.Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzfvVar = zza;
        }
        zzfvVarArr[1] = zzfvVar;
        com.google.android.gms.internal.auth.zzfo zzfoVar = new com.google.android.gms.internal.auth.zzfo(zzfvVarArr);
        byte[] bArr = com.google.android.gms.internal.auth.zzfa.zzd;
        this.zzb = zzfoVar;
    }

    private static boolean zzb(com.google.android.gms.internal.auth.zzfu zzfuVar) {
        return zzfuVar.zzc() - 1 != 1;
    }

    @Override // com.google.android.gms.internal.auth.zzgj
    public final com.google.android.gms.internal.auth.zzgi zza(java.lang.Class cls) {
        com.google.android.gms.internal.auth.zzgk.zze(cls);
        com.google.android.gms.internal.auth.zzfu zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? com.google.android.gms.internal.auth.zzev.class.isAssignableFrom(cls) ? com.google.android.gms.internal.auth.zzgb.zzb(com.google.android.gms.internal.auth.zzgk.zzb(), com.google.android.gms.internal.auth.zzeo.zzb(), zzb.zza()) : com.google.android.gms.internal.auth.zzgb.zzb(com.google.android.gms.internal.auth.zzgk.zza(), com.google.android.gms.internal.auth.zzeo.zza(), zzb.zza()) : com.google.android.gms.internal.auth.zzev.class.isAssignableFrom(cls) ? zzb(zzb) ? com.google.android.gms.internal.auth.zzga.zzj(cls, zzb, com.google.android.gms.internal.auth.zzgd.zzb(), com.google.android.gms.internal.auth.zzfl.zzd(), com.google.android.gms.internal.auth.zzgk.zzb(), com.google.android.gms.internal.auth.zzeo.zzb(), com.google.android.gms.internal.auth.zzft.zzb()) : com.google.android.gms.internal.auth.zzga.zzj(cls, zzb, com.google.android.gms.internal.auth.zzgd.zzb(), com.google.android.gms.internal.auth.zzfl.zzd(), com.google.android.gms.internal.auth.zzgk.zzb(), null, com.google.android.gms.internal.auth.zzft.zzb()) : zzb(zzb) ? com.google.android.gms.internal.auth.zzga.zzj(cls, zzb, com.google.android.gms.internal.auth.zzgd.zza(), com.google.android.gms.internal.auth.zzfl.zzc(), com.google.android.gms.internal.auth.zzgk.zza(), com.google.android.gms.internal.auth.zzeo.zza(), com.google.android.gms.internal.auth.zzft.zza()) : com.google.android.gms.internal.auth.zzga.zzj(cls, zzb, com.google.android.gms.internal.auth.zzgd.zza(), com.google.android.gms.internal.auth.zzfl.zzc(), com.google.android.gms.internal.auth.zzgk.zza(), null, com.google.android.gms.internal.auth.zzft.zza());
    }
}
