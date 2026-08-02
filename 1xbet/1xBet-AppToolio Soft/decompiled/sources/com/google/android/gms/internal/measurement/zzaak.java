package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzaak implements zzaap {
    private zzaap[] zzbvm;

    zzaak(zzaap... zzaapVarArr) {
        this.zzbvm = zzaapVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzaap
    public final boolean zzd(Class<?> cls) {
        for (zzaap zzaapVar : this.zzbvm) {
            if (zzaapVar.zzd(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.zzaap
    public final zzaao zze(Class<?> cls) {
        for (zzaap zzaapVar : this.zzbvm) {
            if (zzaapVar.zzd(cls)) {
                return zzaapVar.zze(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
