package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes9.dex */
final class zzrh implements zzsb {
    private static final zzro zza = new zzrf();
    private final zzro zzb;

    public zzrh() {
        zzro zzroVar = zza;
        int i = zzpc.zza;
        zzrg zzrgVar = new zzrg(zzqi.zza(), zzroVar);
        byte[] bArr = zzqs.zzb;
        this.zzb = zzrgVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsb
    public final zzsa zza(Class cls) {
        int i = zzsc.zza;
        if (!zzqm.class.isAssignableFrom(cls)) {
            int i2 = zzpc.zza;
        }
        zzrn zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i3 = zzpc.zza;
            return zzru.zzi(zzsc.zzn(), zzqd.zza(), zzb.zza());
        }
        int i4 = zzpc.zza;
        return zzrt.zzi(cls, zzb, zzrw.zza(), zzrd.zza(), zzsc.zzn(), zzb.zzc() + (-1) != 1 ? zzqd.zza() : null, zzrm.zza());
    }
}
