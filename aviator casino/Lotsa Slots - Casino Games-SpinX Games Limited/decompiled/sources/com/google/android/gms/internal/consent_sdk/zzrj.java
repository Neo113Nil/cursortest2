package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzrj {
    private final com.google.android.gms.internal.consent_sdk.zzri zza;

    private zzrj(com.google.android.gms.internal.consent_sdk.zzsz zzszVar, java.lang.Object obj, com.google.android.gms.internal.consent_sdk.zzsz zzszVar2, java.lang.Object obj2) {
        this.zza = new com.google.android.gms.internal.consent_sdk.zzri(zzszVar, "", zzszVar2, obj2);
    }

    static int zzb(com.google.android.gms.internal.consent_sdk.zzri zzriVar, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.consent_sdk.zzqf.zza(zzriVar.zza, 1, obj) + com.google.android.gms.internal.consent_sdk.zzqf.zza(zzriVar.zzb, 2, obj2);
    }

    public static com.google.android.gms.internal.consent_sdk.zzrj zzd(com.google.android.gms.internal.consent_sdk.zzsz zzszVar, java.lang.Object obj, com.google.android.gms.internal.consent_sdk.zzsz zzszVar2, java.lang.Object obj2) {
        return new com.google.android.gms.internal.consent_sdk.zzrj(zzszVar, "", zzszVar2, obj2);
    }

    public final int zza(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.consent_sdk.zzri zzriVar = this.zza;
        int zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i << 3);
        int zzb = zzb(zzriVar, obj, obj2);
        return zzC + com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzb) + zzb;
    }

    final com.google.android.gms.internal.consent_sdk.zzri zzc() {
        return this.zza;
    }
}
