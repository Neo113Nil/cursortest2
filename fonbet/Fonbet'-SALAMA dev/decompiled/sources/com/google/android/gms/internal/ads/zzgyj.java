package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgyj implements zzgzl {
    private static final zzgyp zza = new zzgyh();
    private final zzgyp zzb;

    public zzgyj() {
        zzgwz zza2 = zzgwz.zza();
        int i7 = zzgzb.zza;
        zzgyi zzgyiVar = new zzgyi(zza2, zza);
        byte[] bArr = zzgxt.zzb;
        this.zzb = zzgyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final zzgzk zza(Class cls) {
        int i7 = zzgzm.zza;
        if (!zzgxg.class.isAssignableFrom(cls)) {
            int i8 = zzgzb.zza;
        }
        zzgyo zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i9 = zzgzb.zza;
            return zzgyv.zzc(zzgzm.zzm(), zzgwt.zza(), zzb.zza());
        }
        int i10 = zzgzb.zza;
        return zzgyu.zzm(cls, zzb, zzgyy.zza(), zzgyf.zza(), zzgzm.zzm(), zzb.zzc() + (-1) != 1 ? zzgwt.zza() : null, zzgyn.zza());
    }
}
