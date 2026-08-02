package com.google.android.gms.internal.ads;

import I2.J;
import I2.r;
import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
public final class zzbnb extends zzbzm {
    private final r zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbnb(r rVar) {
        this.zzb = rVar;
    }

    public final zzbmw zza() {
        zzbmw zzbmwVar = new zzbmw(this);
        J.k("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            J.k("createNewReference: Lock acquired");
            zzj(new zzbmx(this, zzbmwVar), new zzbmy(this, zzbmwVar));
            D.l(this.zzd >= 0);
            this.zzd++;
        }
        J.k("createNewReference: Lock released");
        return zzbmwVar;
    }

    public final void zzb() {
        J.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            J.k("markAsDestroyable: Lock acquired");
            D.l(this.zzd >= 0);
            J.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
        J.k("markAsDestroyable: Lock released");
    }

    public final void zzc() {
        J.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                J.k("maybeDestroy: Lock acquired");
                D.l(this.zzd >= 0);
                if (this.zzc && this.zzd == 0) {
                    J.k("No reference is left (including root). Cleaning up engine.");
                    zzj(new zzbna(this), new zzbzi());
                } else {
                    J.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        J.k("maybeDestroy: Lock released");
    }

    public final void zzd() {
        J.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            J.k("releaseOneReference: Lock acquired");
            D.l(this.zzd > 0);
            J.k("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
        J.k("releaseOneReference: Lock released");
    }
}
