package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzgyi implements zzgyp {
    private final zzgyp[] zza;

    public zzgyi(zzgyp... zzgypVarArr) {
        this.zza = zzgypVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final zzgyo zzb(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            zzgyp zzgypVar = this.zza[i7];
            if (zzgypVar.zzc(cls)) {
                return zzgypVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final boolean zzc(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.zza[i7].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
