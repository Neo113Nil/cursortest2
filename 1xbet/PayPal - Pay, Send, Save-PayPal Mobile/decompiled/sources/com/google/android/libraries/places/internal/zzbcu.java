package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbcu extends com.google.android.libraries.places.internal.zzbce {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbcu.class.getName());
    private static final boolean zzb = com.google.android.libraries.places.internal.zzbgf.zza();
    public static final /* synthetic */ int zzf = 0;
    java.lang.Object zze;

    public static int zzA(java.lang.String str) {
        int length;
        try {
            length = com.google.android.libraries.places.internal.zzbgi.zza(str);
        } catch (com.google.android.libraries.places.internal.zzbgh unused) {
            length = str.getBytes(com.google.android.libraries.places.internal.zzbeb.zza).length;
        }
        return zzy(length) + length;
    }

    public static int zzB(com.google.android.libraries.places.internal.zzbex zzbexVar) {
        int zzbx = zzbexVar.zzbx();
        return zzy(zzbx) + zzbx;
    }

    public static com.google.android.libraries.places.internal.zzbcu zzx(byte[] bArr, int i, int i2) {
        return new com.google.android.libraries.places.internal.zzbcr(bArr, i, i2);
    }

    public static int zzy(int i) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzz(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void zzC() {
        if (zzc() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzD(java.lang.String str, com.google.android.libraries.places.internal.zzbgh zzbghVar) throws java.io.IOException {
        zza.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zzbghVar);
        byte[] bytes = str.getBytes(com.google.android.libraries.places.internal.zzbeb.zza);
        try {
            int length = bytes.length;
            zzq(length);
            zza(bytes, 0, length);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.libraries.places.internal.zzbcs(e);
        }
    }

    public abstract void zzH(int i, int i2) throws java.io.IOException;

    public abstract void zzI(int i, int i2) throws java.io.IOException;

    public abstract void zzJ(int i, int i2) throws java.io.IOException;

    public abstract void zzK(int i, int i2) throws java.io.IOException;

    public abstract void zzL(int i, long j) throws java.io.IOException;

    @Override // com.google.android.libraries.places.internal.zzbce
    public abstract void zza(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract int zzc();

    public abstract void zzi(int i, long j) throws java.io.IOException;

    public abstract void zzj(int i, boolean z) throws java.io.IOException;

    public abstract void zzk(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zzl(int i, com.google.android.libraries.places.internal.zzbcl zzbclVar) throws java.io.IOException;

    public abstract void zzm(int i, com.google.android.libraries.places.internal.zzbex zzbexVar) throws java.io.IOException;

    public abstract void zzn(int i, com.google.android.libraries.places.internal.zzbcl zzbclVar) throws java.io.IOException;

    public abstract void zzo(byte b) throws java.io.IOException;

    public abstract void zzp(int i) throws java.io.IOException;

    public abstract void zzq(int i) throws java.io.IOException;

    public abstract void zzr(int i) throws java.io.IOException;

    public abstract void zzs(long j) throws java.io.IOException;

    public abstract void zzt(long j) throws java.io.IOException;

    public abstract void zzw() throws java.io.IOException;

    /* synthetic */ zzbcu(byte[] bArr) {
    }

    private zzbcu() {
        throw null;
    }
}
