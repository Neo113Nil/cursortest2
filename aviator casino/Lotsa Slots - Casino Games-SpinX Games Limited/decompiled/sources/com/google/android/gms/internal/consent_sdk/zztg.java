package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zztg implements com.google.android.gms.internal.consent_sdk.zztk {
    private static final java.lang.Object zza = new java.lang.Object();
    private volatile com.google.android.gms.internal.consent_sdk.zztk zzb;
    private volatile java.lang.Object zzc = zza;

    private zztg(com.google.android.gms.internal.consent_sdk.zztk zztkVar) {
        this.zzb = zztkVar;
    }

    public static com.google.android.gms.internal.consent_sdk.zztk zza(com.google.android.gms.internal.consent_sdk.zztk zztkVar) {
        return zztkVar instanceof com.google.android.gms.internal.consent_sdk.zztg ? zztkVar : new com.google.android.gms.internal.consent_sdk.zztg(zztkVar);
    }

    private final synchronized java.lang.Object zzc() {
        java.lang.Object obj = this.zzc;
        java.lang.Object obj2 = zza;
        if (obj != obj2) {
            return obj;
        }
        java.lang.Object zzb = this.zzb.zzb();
        java.lang.Object obj3 = this.zzc;
        if (obj3 != obj2 && obj3 != zzb) {
            throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zzb + ". This is likely due to a circular dependency.");
        }
        this.zzc = zzb;
        this.zzb = null;
        return zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final java.lang.Object zzb() {
        java.lang.Object obj = this.zzc;
        return obj == zza ? zzc() : obj;
    }
}
