package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaxe implements Callable {
    protected final zzavr zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzarr zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzaxe(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8) {
        this.zza = zzavrVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzarrVar;
        this.zzf = i7;
        this.zzg = i8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i7;
        try {
            long jNanoTime = System.nanoTime();
            Method methodZzi = this.zza.zzi(this.zzb, this.zzc);
            this.zze = methodZzi;
            if (methodZzi == null) {
                return null;
            }
            zza();
            zzaui zzauiVarZzd = this.zza.zzd();
            if (zzauiVarZzd == null || (i7 = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzauiVarZzd.zzc(this.zzg, i7, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public abstract void zza();
}
