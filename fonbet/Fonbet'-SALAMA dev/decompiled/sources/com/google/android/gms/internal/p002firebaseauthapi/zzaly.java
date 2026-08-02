package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzaly implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzalw zzc;

    private final Iterator zza() {
        Map map;
        if (this.zzb == null) {
            map = this.zzc.zzf;
            this.zzb = map.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i8 = this.zza;
        if (i8 > 0) {
            i7 = this.zzc.zzb;
            if (i8 <= i7) {
                return true;
            }
        }
        return zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object[] objArr;
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        objArr = this.zzc.zza;
        int i7 = this.zza - 1;
        this.zza = i7;
        return (zzama) objArr[i7];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzaly(zzalw zzalwVar) {
        int i7;
        this.zzc = zzalwVar;
        i7 = zzalwVar.zzb;
        this.zza = i7;
    }
}
