package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzfo implements com.google.android.gms.internal.auth.zzfv {
    private final com.google.android.gms.internal.auth.zzfv[] zza;

    zzfo(com.google.android.gms.internal.auth.zzfv... zzfvVarArr) {
        this.zza = zzfvVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final com.google.android.gms.internal.auth.zzfu zzb(java.lang.Class cls) {
        com.google.android.gms.internal.auth.zzfv[] zzfvVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            com.google.android.gms.internal.auth.zzfv zzfvVar = zzfvVarArr[i];
            if (zzfvVar.zzc(cls)) {
                return zzfvVar.zzb(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(java.lang.String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final boolean zzc(java.lang.Class cls) {
        com.google.android.gms.internal.auth.zzfv[] zzfvVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzfvVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
