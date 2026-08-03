package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zziff implements com.google.android.gms.internal.ads.zzifn {
    private final com.google.android.gms.internal.ads.zzifn[] zza;

    zziff(com.google.android.gms.internal.ads.zzifn... zzifnVarArr) {
        this.zza = zzifnVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzifn
    public final boolean zzb(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzifn
    public final com.google.android.gms.internal.ads.zzifm zzc(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            com.google.android.gms.internal.ads.zzifn zzifnVar = this.zza[i];
            if (zzifnVar.zzb(cls)) {
                return zzifnVar.zzc(cls);
            }
        }
        java.lang.String name = cls.getName();
        java.lang.String.valueOf(name);
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(java.lang.String.valueOf(name)));
    }
}
