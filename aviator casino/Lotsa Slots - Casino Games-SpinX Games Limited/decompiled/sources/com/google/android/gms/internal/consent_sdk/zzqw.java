package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzqw implements java.util.Map.Entry {
    private final java.util.Map.Entry zza;

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (((com.google.android.gms.internal.consent_sdk.zzqz) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.consent_sdk.zzrq) {
            return ((com.google.android.gms.internal.consent_sdk.zzqz) this.zza.getValue()).zzc((com.google.android.gms.internal.consent_sdk.zzrq) obj);
        }
        throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final com.google.android.gms.internal.consent_sdk.zzqz zza() {
        return (com.google.android.gms.internal.consent_sdk.zzqz) this.zza.getValue();
    }
}
