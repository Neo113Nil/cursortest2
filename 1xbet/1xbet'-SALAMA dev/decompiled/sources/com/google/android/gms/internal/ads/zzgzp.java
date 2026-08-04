package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzgzp implements Iterator {
    final /* synthetic */ zzgzs zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzgzp(zzgzs zzgzsVar, zzgzr zzgzrVar) {
        this.zza = zzgzsVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.zzb + 1;
        zzgzs zzgzsVar = this.zza;
        if (i7 >= zzgzsVar.zzb) {
            return !zzgzsVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i7 = this.zzb + 1;
        this.zzb = i7;
        zzgzs zzgzsVar = this.zza;
        return i7 < zzgzsVar.zzb ? (zzgzo) zzgzsVar.zza[i7] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i7 = this.zzb;
        zzgzs zzgzsVar = this.zza;
        if (i7 >= zzgzsVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i7 - 1;
            zzgzsVar.zzm(i7);
        }
    }
}
