package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public abstract class zzby extends com.google.android.gms.internal.play_billing.zzbf {
    private static final java.util.logging.Logger zzb = java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.zzby.class.getName());
    private static final boolean zzc = com.google.android.gms.internal.play_billing.zzfp.zzx();
    com.google.android.gms.internal.play_billing.zzbz zza;

    private zzby() {
        throw null;
    }

    /* synthetic */ zzby(com.google.android.gms.internal.play_billing.zzbx zzbxVar) {
    }

    @java.lang.Deprecated
    static int zzt(int i, com.google.android.gms.internal.play_billing.zzec zzecVar, com.google.android.gms.internal.play_billing.zzeo zzeoVar) {
        int zzw = zzw(i << 3);
        return zzw + zzw + ((com.google.android.gms.internal.play_billing.zzay) zzecVar).zza(zzeoVar);
    }

    static int zzu(com.google.android.gms.internal.play_billing.zzec zzecVar, com.google.android.gms.internal.play_billing.zzeo zzeoVar) {
        int zza = ((com.google.android.gms.internal.play_billing.zzay) zzecVar).zza(zzeoVar);
        return zzw(zza) + zza;
    }

    public static int zzv(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.play_billing.zzfu.zzc(str);
        } catch (com.google.android.gms.internal.play_billing.zzft unused) {
            length = str.getBytes(com.google.android.gms.internal.play_billing.zzda.zzb).length;
        }
        return zzw(length) + length;
    }

    public static int zzw(int i) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzx(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static com.google.android.gms.internal.play_billing.zzby zzy(byte[] bArr, int i, int i2) {
        return new com.google.android.gms.internal.play_billing.zzbv(bArr, 0, i2);
    }

    final void zzA(java.lang.String str, com.google.android.gms.internal.play_billing.zzft zzftVar) throws java.io.IOException {
        zzb.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zzftVar);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.play_billing.zzda.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.play_billing.zzbw(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws java.io.IOException;

    public abstract void zzd(int i, boolean z) throws java.io.IOException;

    public abstract void zze(int i, com.google.android.gms.internal.play_billing.zzbq zzbqVar) throws java.io.IOException;

    public abstract void zzf(int i, int i2) throws java.io.IOException;

    public abstract void zzg(int i) throws java.io.IOException;

    public abstract void zzh(int i, long j) throws java.io.IOException;

    public abstract void zzi(long j) throws java.io.IOException;

    public abstract void zzj(int i, int i2) throws java.io.IOException;

    public abstract void zzk(int i) throws java.io.IOException;

    public abstract void zzl(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void zzm(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zzo(int i, int i2) throws java.io.IOException;

    public abstract void zzp(int i, int i2) throws java.io.IOException;

    public abstract void zzq(int i) throws java.io.IOException;

    public abstract void zzr(int i, long j) throws java.io.IOException;

    public abstract void zzs(long j) throws java.io.IOException;

    public final void zzz() {
        if (zza() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }
}
