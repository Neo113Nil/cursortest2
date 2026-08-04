package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzlo implements zzlv {
    private final zzlv[] zza;

    public zzlo(zzlv... zzlvVarArr) {
        this.zza = zzlvVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzlv
    public final zzlu zzb(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            zzlv zzlvVar = this.zza[i7];
            if (zzlvVar.zzc(cls)) {
                return zzlvVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.recaptcha.internal.zzlv
    public final boolean zzc(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.zza[i7].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
