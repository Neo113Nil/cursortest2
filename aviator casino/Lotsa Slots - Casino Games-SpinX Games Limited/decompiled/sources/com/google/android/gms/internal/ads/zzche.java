package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzche {
    private static final java.util.concurrent.atomic.AtomicInteger zza = new java.util.concurrent.atomic.AtomicInteger(0);
    private static final java.util.concurrent.atomic.AtomicInteger zzb = new java.util.concurrent.atomic.AtomicInteger(0);

    public static int zzP() {
        return zza.get();
    }

    public static int zzQ() {
        return zzb.get();
    }

    protected static java.util.concurrent.atomic.AtomicInteger zzf() {
        return zza;
    }

    protected static java.util.concurrent.atomic.AtomicInteger zzi() {
        return zzb;
    }

    public abstract void zzA(int i);

    public abstract boolean zzB();

    public abstract int zzC();

    public abstract long zzD();

    public abstract void zzE(boolean z);

    public abstract void zzF(int i);

    public abstract void zzG(int i);

    public abstract long zzH();

    public abstract long zzI();

    public abstract long zzJ();

    public abstract long zzK();

    public abstract int zzL();

    public abstract void zzM(boolean z);

    public abstract long zzN();

    public abstract long zzO();

    public abstract java.lang.Integer zzj();

    public abstract void zzn(java.lang.Integer num);

    public abstract void zzq(android.net.Uri[] uriArr, java.lang.String str);

    public abstract void zzr(android.net.Uri[] uriArr, java.lang.String str, java.nio.ByteBuffer byteBuffer, boolean z);

    public abstract void zzs(com.google.android.gms.internal.ads.zzchd zzchdVar);

    public abstract void zzt();

    public abstract void zzu(android.view.Surface surface, boolean z) throws java.io.IOException;

    public abstract void zzv(float f, boolean z) throws java.io.IOException;

    public abstract void zzw();

    public abstract void zzx(long j);

    public abstract void zzy(int i);

    public abstract void zzz(int i);
}
