package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzrh implements com.google.android.gms.internal.consent_sdk.zzsb {
    private static final com.google.android.gms.internal.consent_sdk.zzro zza = new com.google.android.gms.internal.consent_sdk.zzrf();
    private final com.google.android.gms.internal.consent_sdk.zzro zzb;

    public zzrh() {
        com.google.android.gms.internal.consent_sdk.zzro zzroVar = zza;
        int i = com.google.android.gms.internal.consent_sdk.zzpc.zza;
        com.google.android.gms.internal.consent_sdk.zzrg zzrgVar = new com.google.android.gms.internal.consent_sdk.zzrg(com.google.android.gms.internal.consent_sdk.zzqi.zza(), zzroVar);
        byte[] bArr = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
        this.zzb = zzrgVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsb
    public final com.google.android.gms.internal.consent_sdk.zzsa zza(java.lang.Class cls) {
        int i = com.google.android.gms.internal.consent_sdk.zzsc.zza;
        if (!com.google.android.gms.internal.consent_sdk.zzqm.class.isAssignableFrom(cls)) {
            int i2 = com.google.android.gms.internal.consent_sdk.zzpc.zza;
        }
        com.google.android.gms.internal.consent_sdk.zzrn zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i3 = com.google.android.gms.internal.consent_sdk.zzpc.zza;
            return com.google.android.gms.internal.consent_sdk.zzru.zzi(com.google.android.gms.internal.consent_sdk.zzsc.zzn(), com.google.android.gms.internal.consent_sdk.zzqd.zza(), zzb.zza());
        }
        int i4 = com.google.android.gms.internal.consent_sdk.zzpc.zza;
        return com.google.android.gms.internal.consent_sdk.zzrt.zzi(cls, zzb, com.google.android.gms.internal.consent_sdk.zzrw.zza(), com.google.android.gms.internal.consent_sdk.zzrd.zza(), com.google.android.gms.internal.consent_sdk.zzsc.zzn(), zzb.zzc() + (-1) != 1 ? com.google.android.gms.internal.consent_sdk.zzqd.zza() : null, com.google.android.gms.internal.consent_sdk.zzrm.zza());
    }
}
