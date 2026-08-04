package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class zzli {
    private final zzlh zza;
    private final zzlg zzb;
    private final zzbn zzc;
    private int zzd;
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzli(zzlg zzlgVar, zzlh zzlhVar, zzbn zzbnVar, int i7, zzcz zzczVar, Looper looper) {
        this.zzb = zzlgVar;
        this.zza = zzlhVar;
        this.zzc = zzbnVar;
        this.zzf = looper;
        this.zzg = i7;
    }

    public final int zza() {
        return this.zzd;
    }

    public final Looper zzb() {
        return this.zzf;
    }

    public final zzlh zzc() {
        return this.zza;
    }

    public final zzli zzd() {
        zzcv.zzf(!this.zzh);
        this.zzh = true;
        this.zzb.zzn(this);
        return this;
    }

    public final zzli zze(Object obj) {
        zzcv.zzf(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final zzli zzf(int i7) {
        zzcv.zzf(!this.zzh);
        this.zzd = i7;
        return this;
    }

    public final Object zzg() {
        return this.zze;
    }

    public final synchronized void zzh(boolean z4) {
        this.zzi = z4 | this.zzi;
        notifyAll();
    }

    public final synchronized boolean zzi() {
        return false;
    }
}
