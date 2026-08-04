package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzgyj implements zzgzl {
    private static final zzgyp zza = new zzgyh();
    private final zzgyp zzb;

    public zzgyj() {
        zzgwz zzgwzVarZza = zzgwz.zza();
        int i7 = zzgzb.zza;
        zzgyi zzgyiVar = new zzgyi(zzgwzVarZza, zza);
        byte[] bArr = zzgxt.zzb;
        this.zzb = zzgyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final zzgzk zza(Class cls) {
        int i7 = zzgzm.zza;
        if (!zzgxg.class.isAssignableFrom(cls)) {
            int i8 = zzgzb.zza;
        }
        zzgyo zzgyoVarZzb = this.zzb.zzb(cls);
        if (zzgyoVarZzb.zzb()) {
            int i9 = zzgzb.zza;
            return zzgyv.zzc(zzgzm.zzm(), zzgwt.zza(), zzgyoVarZzb.zza());
        }
        int i10 = zzgzb.zza;
        return zzgyu.zzm(cls, zzgyoVarZzb, zzgyy.zza(), zzgyf.zza(), zzgzm.zzm(), zzgyoVarZzb.zzc() + (-1) != 1 ? zzgwt.zza() : null, zzgyn.zza());
    }
}
