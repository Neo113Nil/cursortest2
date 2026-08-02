package com.google.android.gms.internal.firebase_auth;

/* loaded from: classes.dex */
final class zzdy implements zzeg {
    private zzeg[] zzta;

    zzdy(zzeg... zzegVarArr) {
        this.zzta = zzegVarArr;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeg
    public final boolean zzb(Class<?> cls) {
        for (zzeg zzegVar : this.zzta) {
            if (zzegVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_auth.zzeg
    public final zzef zzc(Class<?> cls) {
        for (zzeg zzegVar : this.zzta) {
            if (zzegVar.zzb(cls)) {
                return zzegVar.zzc(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
