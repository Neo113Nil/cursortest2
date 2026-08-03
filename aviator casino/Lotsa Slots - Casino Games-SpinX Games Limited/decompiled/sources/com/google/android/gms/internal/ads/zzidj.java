package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzidj extends com.google.android.gms.internal.ads.zzicr {
    public static final /* synthetic */ int zzb = 0;
    private static final boolean zzc = com.google.android.gms.internal.ads.zziha.zza();
    java.lang.Object zza;

    private zzidj() {
        throw null;
    }

    /* synthetic */ zzidj(byte[] bArr) {
    }

    static int zzE(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int zzF(int i) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzG(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zzH(com.google.android.gms.internal.ads.zzifp zzifpVar) {
        int zzbr = zzifpVar.zzbr();
        return zzF(zzbr) + zzbr;
    }

    public final void zzI() {
        if (zzy() > 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
        if (zzy() < 0) {
            throw new java.lang.IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void zzb(int i, int i2) throws java.io.IOException;

    public abstract void zzc(int i, int i2) throws java.io.IOException;

    public abstract void zzd(int i, int i2) throws java.io.IOException;

    public abstract void zze(int i, int i2) throws java.io.IOException;

    public abstract void zzf(int i, long j) throws java.io.IOException;

    public abstract void zzg(int i, long j) throws java.io.IOException;

    public abstract void zzh(int i, boolean z) throws java.io.IOException;

    public abstract void zzi(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zzj(int i, com.google.android.gms.internal.ads.zzida zzidaVar) throws java.io.IOException;

    public abstract void zzk(com.google.android.gms.internal.ads.zzida zzidaVar) throws java.io.IOException;

    abstract void zzl(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void zzm(int i, com.google.android.gms.internal.ads.zzifp zzifpVar) throws java.io.IOException;

    public abstract void zzn(int i, com.google.android.gms.internal.ads.zzida zzidaVar) throws java.io.IOException;

    public abstract void zzo(com.google.android.gms.internal.ads.zzifp zzifpVar) throws java.io.IOException;

    public abstract void zzp(byte b) throws java.io.IOException;

    public abstract void zzq(int i) throws java.io.IOException;

    public abstract void zzr(int i) throws java.io.IOException;

    public abstract void zzs(int i) throws java.io.IOException;

    public abstract void zzt(long j) throws java.io.IOException;

    public abstract void zzu(long j) throws java.io.IOException;

    public abstract void zzw(java.lang.String str) throws java.io.IOException;

    public abstract void zzx() throws java.io.IOException;

    public abstract int zzy();
}
