package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class zzfvl implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfvq zze;

    public /* synthetic */ zzfvl(zzfvq zzfvqVar, zzfvp zzfvpVar) {
        int i7;
        this.zze = zzfvqVar;
        i7 = zzfvqVar.zzf;
        this.zzb = i7;
        this.zzc = zzfvqVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i7;
        i7 = this.zze.zzf;
        if (i7 != this.zzb) {
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
        Object zza = zza(i7);
        this.zzc = this.zze.zzf(this.zzc);
        return zza;
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
