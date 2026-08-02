package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzaxd {
    private final zzavr zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzaxd(zzavr zzavrVar, String str, String str2, Class... clsArr) {
        this.zza = zzavrVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzavrVar.zzj().submit(new zzaxc(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzaxd zzaxdVar) {
        try {
            zzavr zzavrVar = zzaxdVar.zza;
            Class<?> loadClass = zzavrVar.zzh().loadClass(zzaxdVar.zzc(zzavrVar.zzs(), zzaxdVar.zzb));
            if (loadClass != null) {
                zzaxdVar.zzd = loadClass.getMethod(zzaxdVar.zzc(zzaxdVar.zza.zzs(), zzaxdVar.zzc), zzaxdVar.zze);
            }
        } catch (zzauv | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzaxdVar.zzf.countDown();
            throw th;
        }
        zzaxdVar.zzf.countDown();
    }

    private final String zzc(byte[] bArr, String str) {
        return new String(this.zza.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
