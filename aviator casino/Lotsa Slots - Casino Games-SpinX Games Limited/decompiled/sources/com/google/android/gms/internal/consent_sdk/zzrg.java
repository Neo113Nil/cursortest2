package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzrg implements com.google.android.gms.internal.consent_sdk.zzro {
    private final com.google.android.gms.internal.consent_sdk.zzro[] zza;

    zzrg(com.google.android.gms.internal.consent_sdk.zzro... zzroVarArr) {
        this.zza = zzroVarArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    public final com.google.android.gms.internal.consent_sdk.zzrn zzb(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            com.google.android.gms.internal.consent_sdk.zzro zzroVar = this.zza[i];
            if (zzroVar.zzc(cls)) {
                return zzroVar.zzb(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(java.lang.String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    public final boolean zzc(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
