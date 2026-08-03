package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public abstract class zzpv extends com.google.android.gms.internal.consent_sdk.zzpe {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.gms.internal.consent_sdk.zzpv.class.getName());
    private static final boolean zzb = com.google.android.gms.internal.consent_sdk.zzsw.zzx();
    public static final /* synthetic */ int zzf = 0;
    java.lang.Object zze;

    private zzpv() {
        throw null;
    }

    /* synthetic */ zzpv(com.google.android.gms.internal.consent_sdk.zzpu zzpuVar) {
    }

    public static int zzA(com.google.android.gms.internal.consent_sdk.zzrq zzrqVar) {
        int zzn = zzrqVar.zzn();
        return zzC(zzn) + zzn;
    }

    public static int zzB(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.consent_sdk.zzsy.zzb(str);
        } catch (com.google.android.gms.internal.consent_sdk.zzsx unused) {
            length = str.getBytes(com.google.android.gms.internal.consent_sdk.zzqs.zza).length;
        }
        return zzC(length) + length;
    }

    public static int zzC(int i) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzD(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    final void zzE(java.lang.String str, com.google.android.gms.internal.consent_sdk.zzsx zzsxVar) throws java.io.IOException {
        zza.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zzsxVar);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.consent_sdk.zzqs.zza);
        try {
            int length = bytes.length;
            zzw(length);
            zza(bytes, 0, length);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.consent_sdk.zzps(e);
        }
    }

    public abstract void zzI() throws java.io.IOException;

    public abstract void zzJ(byte b) throws java.io.IOException;

    public abstract void zzK(int i, boolean z) throws java.io.IOException;

    abstract void zzL(byte[] bArr, int i, int i2) throws java.io.IOException;

    @Override // com.google.android.gms.internal.consent_sdk.zzpe
    public abstract void zza(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract int zzb();

    public abstract void zzh(int i, com.google.android.gms.internal.consent_sdk.zzpm zzpmVar) throws java.io.IOException;

    public abstract void zzi(com.google.android.gms.internal.consent_sdk.zzpm zzpmVar) throws java.io.IOException;

    public abstract void zzj(int i, int i2) throws java.io.IOException;

    public abstract void zzk(int i) throws java.io.IOException;

    public abstract void zzl(int i, long j) throws java.io.IOException;

    public abstract void zzm(long j) throws java.io.IOException;

    public abstract void zzn(int i, int i2) throws java.io.IOException;

    public abstract void zzo(int i) throws java.io.IOException;

    public abstract void zzp(com.google.android.gms.internal.consent_sdk.zzrq zzrqVar) throws java.io.IOException;

    public abstract void zzq(int i, com.google.android.gms.internal.consent_sdk.zzrq zzrqVar) throws java.io.IOException;

    public abstract void zzr(int i, com.google.android.gms.internal.consent_sdk.zzpm zzpmVar) throws java.io.IOException;

    public abstract void zzs(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zzt(java.lang.String str) throws java.io.IOException;

    public abstract void zzu(int i, int i2) throws java.io.IOException;

    public abstract void zzv(int i, int i2) throws java.io.IOException;

    public abstract void zzw(int i) throws java.io.IOException;

    public abstract void zzx(int i, long j) throws java.io.IOException;

    public abstract void zzy(long j) throws java.io.IOException;
}
