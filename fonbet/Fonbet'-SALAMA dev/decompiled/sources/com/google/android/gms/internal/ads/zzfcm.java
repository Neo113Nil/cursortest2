package com.google.android.gms.internal.ads;

import E2.o;
import java.util.LinkedList;

/* loaded from: classes.dex */
final class zzfcm {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfdl zzd = new zzfdl();

    public zzfcm(int i7, int i8) {
        this.zzb = i7;
        this.zzc = i8;
    }

    private final void zzi() {
        while (!this.zza.isEmpty()) {
            zzfcw zzfcwVar = (zzfcw) this.zza.getFirst();
            o.f1952C.j.getClass();
            if (System.currentTimeMillis() - zzfcwVar.zzd < this.zzc) {
                return;
            }
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfcw zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfcw zzfcwVar = (zzfcw) this.zza.remove();
        if (zzfcwVar != null) {
            this.zzd.zzh();
        }
        return zzfcwVar;
    }

    public final zzfdk zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfcw zzfcwVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfcwVar);
        return true;
    }
}
