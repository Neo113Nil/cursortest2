package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzqi implements com.google.android.gms.internal.consent_sdk.zzro {
    private static final com.google.android.gms.internal.consent_sdk.zzqi zza = new com.google.android.gms.internal.consent_sdk.zzqi();

    private zzqi() {
    }

    public static com.google.android.gms.internal.consent_sdk.zzqi zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    public final com.google.android.gms.internal.consent_sdk.zzrn zzb(java.lang.Class cls) {
        if (!com.google.android.gms.internal.consent_sdk.zzqm.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        try {
            return (com.google.android.gms.internal.consent_sdk.zzrn) com.google.android.gms.internal.consent_sdk.zzqm.zzq(cls.asSubclass(com.google.android.gms.internal.consent_sdk.zzqm.class)).zzb(3, null, null);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    public final boolean zzc(java.lang.Class cls) {
        return com.google.android.gms.internal.consent_sdk.zzqm.class.isAssignableFrom(cls);
    }
}
