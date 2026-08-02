package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgzp implements Iterator {
    final /* synthetic */ zzgzs zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzgzp(zzgzs zzgzsVar, zzgzr zzgzrVar) {
        this.zza = zzgzsVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        Map map;
        int i8 = this.zzb + 1;
        zzgzs zzgzsVar = this.zza;
        i7 = zzgzsVar.zzb;
        if (i8 < i7) {
            return true;
        }
        map = zzgzsVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i7;
        Object[] objArr;
        this.zzc = true;
        int i8 = this.zzb + 1;
        this.zzb = i8;
        zzgzs zzgzsVar = this.zza;
        i7 = zzgzsVar.zzb;
        if (i8 >= i7) {
            return (Map.Entry) zza().next();
        }
        objArr = zzgzsVar.zza;
        return (zzgzo) objArr[i8];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i8 = this.zzb;
        zzgzs zzgzsVar = this.zza;
        i7 = zzgzsVar.zzb;
        if (i8 >= i7) {
            zza().remove();
        } else {
            this.zzb = i8 - 1;
            zzgzsVar.zzm(i8);
        }
    }
}
