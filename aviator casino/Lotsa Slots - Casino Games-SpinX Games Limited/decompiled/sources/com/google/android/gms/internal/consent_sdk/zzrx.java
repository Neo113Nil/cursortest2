package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzrx {
    private static final com.google.android.gms.internal.consent_sdk.zzrx zza = new com.google.android.gms.internal.consent_sdk.zzrx();
    private final java.util.concurrent.ConcurrentMap zzc = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.consent_sdk.zzsb zzb = new com.google.android.gms.internal.consent_sdk.zzrh();

    private zzrx() {
    }

    static com.google.android.gms.internal.consent_sdk.zzrx zza() {
        return zza;
    }

    final com.google.android.gms.internal.consent_sdk.zzsa zzb(java.lang.Class cls) {
        byte[] bArr = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
        if (cls == null) {
            throw new java.lang.NullPointerException("messageType");
        }
        java.util.concurrent.ConcurrentMap concurrentMap = this.zzc;
        com.google.android.gms.internal.consent_sdk.zzsa zzsaVar = (com.google.android.gms.internal.consent_sdk.zzsa) concurrentMap.get(cls);
        if (zzsaVar == null) {
            zzsaVar = this.zzb.zza(cls);
            com.google.android.gms.internal.consent_sdk.zzsa zzsaVar2 = (com.google.android.gms.internal.consent_sdk.zzsa) concurrentMap.putIfAbsent(cls, zzsaVar);
            if (zzsaVar2 != null) {
                return zzsaVar2;
            }
        }
        return zzsaVar;
    }
}
