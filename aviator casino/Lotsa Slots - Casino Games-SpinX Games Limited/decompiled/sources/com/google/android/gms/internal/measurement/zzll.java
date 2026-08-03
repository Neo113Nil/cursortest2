package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzll extends com.google.android.gms.internal.measurement.zzky {
    public static final /* synthetic */ int zzb = 0;
    private static final java.util.logging.Logger zzc = java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.zzll.class.getName());
    private static final boolean zzd = com.google.android.gms.internal.measurement.zzoo.zza();
    com.google.android.gms.internal.measurement.zzlm zza;

    private zzll() {
        throw null;
    }

    /* synthetic */ zzll(byte[] bArr) {
    }

    public static int zzA(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zzB(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.measurement.zzor.zzb(str);
        } catch (com.google.android.gms.internal.measurement.zzoq unused) {
            length = str.getBytes(com.google.android.gms.internal.measurement.zzmo.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzC(com.google.android.gms.internal.measurement.zznl zznlVar) {
        int zzcn = zznlVar.zzcn();
        return zzz(zzcn) + zzcn;
    }

    static int zzD(com.google.android.gms.internal.measurement.zznl zznlVar, com.google.android.gms.internal.measurement.zznw zznwVar) {
        int zzcd = ((com.google.android.gms.internal.measurement.zzkr) zznlVar).zzcd(zznwVar);
        return zzz(zzcd) + zzcd;
    }

    @java.lang.Deprecated
    static int zzG(int i, com.google.android.gms.internal.measurement.zznl zznlVar, com.google.android.gms.internal.measurement.zznw zznwVar) {
        int zzz = zzz(i << 3);
        return zzz + zzz + ((com.google.android.gms.internal.measurement.zzkr) zznlVar).zzcd(zznwVar);
    }

    public static int zzz(int i) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void zzE() {
        if (zzy() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzF(java.lang.String str, com.google.android.gms.internal.measurement.zzoq zzoqVar) throws java.io.IOException {
        zzc.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zzoqVar);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.measurement.zzmo.zza);
        try {
            int length = bytes.length;
            zzr(length);
            zzw(bytes, 0, length);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.measurement.zzlk(e);
        }
    }

    public abstract void zza(int i, int i2) throws java.io.IOException;

    public abstract void zzb(int i, int i2) throws java.io.IOException;

    public abstract void zzc(int i, int i2) throws java.io.IOException;

    public abstract void zzd(int i, int i2) throws java.io.IOException;

    public abstract void zze(int i, long j) throws java.io.IOException;

    public abstract void zzf(int i, long j) throws java.io.IOException;

    public abstract void zzg(int i, boolean z) throws java.io.IOException;

    public abstract void zzh(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zzi(int i, com.google.android.gms.internal.measurement.zzlg zzlgVar) throws java.io.IOException;

    public abstract void zzj(com.google.android.gms.internal.measurement.zzlg zzlgVar) throws java.io.IOException;

    abstract void zzk(byte[] bArr, int i, int i2) throws java.io.IOException;

    abstract void zzl(int i, com.google.android.gms.internal.measurement.zznl zznlVar, com.google.android.gms.internal.measurement.zznw zznwVar) throws java.io.IOException;

    public abstract void zzm(int i, com.google.android.gms.internal.measurement.zznl zznlVar) throws java.io.IOException;

    public abstract void zzn(int i, com.google.android.gms.internal.measurement.zzlg zzlgVar) throws java.io.IOException;

    public abstract void zzo(com.google.android.gms.internal.measurement.zznl zznlVar) throws java.io.IOException;

    public abstract void zzp(byte b) throws java.io.IOException;

    public abstract void zzq(int i) throws java.io.IOException;

    public abstract void zzr(int i) throws java.io.IOException;

    public abstract void zzs(int i) throws java.io.IOException;

    public abstract void zzt(long j) throws java.io.IOException;

    public abstract void zzu(long j) throws java.io.IOException;

    public abstract void zzw(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void zzx(java.lang.String str) throws java.io.IOException;

    public abstract int zzy();
}
