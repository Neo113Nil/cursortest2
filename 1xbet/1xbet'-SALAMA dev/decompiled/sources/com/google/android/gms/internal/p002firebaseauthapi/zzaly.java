package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzaly implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzalw zzc;

    private final Iterator zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.zza;
        return (i7 > 0 && i7 <= this.zzc.zzb) || zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        Object[] objArr = this.zzc.zza;
        int i7 = this.zza - 1;
        this.zza = i7;
        return (zzama) objArr[i7];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzaly(zzalw zzalwVar) {
        this.zzc = zzalwVar;
        this.zza = zzalwVar.zzb;
    }
}
