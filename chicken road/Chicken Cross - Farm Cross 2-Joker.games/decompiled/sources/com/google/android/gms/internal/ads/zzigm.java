package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzigm implements zzigu {
    private final zzigu[] zza;

    zzigm(zzigu... zziguVarArr) {
        this.zza = zziguVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzigu
    public final boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzigu
    public final zzigt zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzigu zziguVar = this.zza[i];
            if (zziguVar.zzb(cls)) {
                return zziguVar.zzc(cls);
            }
        }
        String name = cls.getName();
        String.valueOf(name);
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(name)));
    }
}
