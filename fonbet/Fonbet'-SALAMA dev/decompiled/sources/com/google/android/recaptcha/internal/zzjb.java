package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public abstract class zzjb {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzjc zzc;

    public /* synthetic */ zzjb(zzja zzjaVar) {
    }

    public static int zzF(int i7) {
        return (i7 >>> 1) ^ (-(i7 & 1));
    }

    public static long zzG(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static zzjb zzH(byte[] bArr, int i7, int i8, boolean z4) {
        zzix zzixVar = new zzix(bArr, 0, 0, false, null);
        try {
            zzixVar.zze(0);
            return zzixVar;
        } catch (zzlc e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public abstract void zzA(int i7);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i7);

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i7);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zziv zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i7);
}
