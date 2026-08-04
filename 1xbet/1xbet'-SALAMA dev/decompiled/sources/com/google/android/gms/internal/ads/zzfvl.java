package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class zzfvl implements Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzfvq zze;

    public /* synthetic */ zzfvl(zzfvq zzfvqVar, zzfvp zzfvpVar) {
        this.zze = zzfvqVar;
        this.zzb = zzfvqVar.zzf;
        this.zzc = zzfvqVar.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.zzc;
        this.zzd = i7;
        Object objZza = zza(i7);
        this.zzc = this.zze.zzf(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfth.zzm(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i7 = this.zzd;
        zzfvq zzfvqVar = this.zze;
        zzfvqVar.remove(zzfvq.zzg(zzfvqVar, i7));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i7);
}
