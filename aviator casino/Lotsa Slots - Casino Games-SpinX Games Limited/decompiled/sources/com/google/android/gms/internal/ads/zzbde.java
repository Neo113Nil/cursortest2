package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbde {
    private final com.google.android.gms.internal.ads.zzbbs zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.Class[] zze;
    private volatile java.lang.reflect.Method zzd = null;
    private final java.util.concurrent.CountDownLatch zzf = new java.util.concurrent.CountDownLatch(1);

    public zzbde(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, java.lang.Class... clsArr) {
        this.zza = zzbbsVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzbbsVar.zzd().submit(new com.google.android.gms.internal.ads.zzbdd(this));
    }

    private final java.lang.String zzc(byte[] bArr, java.lang.String str) throws com.google.android.gms.internal.ads.zzbaw, java.io.UnsupportedEncodingException {
        return new java.lang.String(this.zza.zzf().zzb(bArr, str), "UTF-8");
    }

    public final java.lang.reflect.Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, java.util.concurrent.TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (java.lang.InterruptedException unused) {
            return null;
        }
    }

    final /* synthetic */ void zzb() {
        try {
            com.google.android.gms.internal.ads.zzbbs zzbbsVar = this.zza;
            java.lang.Class loadClass = zzbbsVar.zze().loadClass(zzc(zzbbsVar.zzg(), this.zzb));
            if (loadClass != null) {
                this.zzd = loadClass.getMethod(zzc(zzbbsVar.zzg(), this.zzc), this.zze);
            }
        } catch (com.google.android.gms.internal.ads.zzbaw | java.io.UnsupportedEncodingException | java.lang.ClassNotFoundException | java.lang.NoSuchMethodException | java.lang.NullPointerException unused) {
        } catch (java.lang.Throwable th) {
            this.zzf.countDown();
            throw th;
        }
        this.zzf.countDown();
    }
}
