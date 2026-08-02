package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdc {
    private boolean zza;

    public zzdc() {
        throw null;
    }

    public final synchronized void zza() {
        while (!this.zza) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z4 = false;
        while (!this.zza) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc() {
        boolean z4;
        z4 = this.zza;
        this.zza = false;
        return z4;
    }

    public final synchronized boolean zzd() {
        return this.zza;
    }

    public final synchronized boolean zze() {
        if (this.zza) {
            return false;
        }
        this.zza = true;
        notifyAll();
        return true;
    }

    public zzdc(zzcz zzczVar) {
    }
}
