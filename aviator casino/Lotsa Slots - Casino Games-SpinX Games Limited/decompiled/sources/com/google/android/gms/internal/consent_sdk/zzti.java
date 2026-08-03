package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzti implements com.google.android.gms.internal.consent_sdk.zzth {
    private final java.lang.Object zza;

    private zzti(java.lang.Object obj) {
        this.zza = obj;
    }

    public static com.google.android.gms.internal.consent_sdk.zzth zza(java.lang.Object obj) {
        if (obj != null) {
            return new com.google.android.gms.internal.consent_sdk.zzti(obj);
        }
        throw new java.lang.NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final java.lang.Object zzb() {
        return this.zza;
    }
}
