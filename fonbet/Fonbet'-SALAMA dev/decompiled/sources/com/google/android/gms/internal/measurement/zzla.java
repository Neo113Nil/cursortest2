package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzla implements zzlh {
    private final zzlh[] zza;

    public zzla(zzlh... zzlhVarArr) {
        this.zza = zzlhVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final zzlg zzb(Class cls) {
        zzlh[] zzlhVarArr = this.zza;
        for (int i7 = 0; i7 < 2; i7++) {
            zzlh zzlhVar = zzlhVarArr[i7];
            if (zzlhVar.zzc(cls)) {
                return zzlhVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final boolean zzc(Class cls) {
        zzlh[] zzlhVarArr = this.zza;
        for (int i7 = 0; i7 < 2; i7++) {
            if (zzlhVarArr[i7].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
