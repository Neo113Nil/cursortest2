package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes9.dex */
final class zzsf implements Iterator {
    final /* synthetic */ zzsi zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzsf(zzsi zzsiVar, zzsh zzshVar) {
        Objects.requireNonNull(zzsiVar);
        this.zza = zzsiVar;
        this.zzb = -1;
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
        int i;
        Map map;
        int i2 = this.zzb + 1;
        zzsi zzsiVar = this.zza;
        i = zzsiVar.zzb;
        if (i2 < i) {
            return true;
        }
        map = zzsiVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i;
        Object[] objArr;
        this.zzc = true;
        int i2 = this.zzb + 1;
        this.zzb = i2;
        zzsi zzsiVar = this.zza;
        i = zzsiVar.zzb;
        if (i2 >= i) {
            return (Map.Entry) zza().next();
        }
        objArr = zzsiVar.zza;
        return (zzse) objArr[i2];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzsi zzsiVar = this.zza;
        zzsiVar.zzo();
        int i2 = this.zzb;
        i = zzsiVar.zzb;
        if (i2 >= i) {
            zza().remove();
        } else {
            this.zzb = i2 - 1;
            zzsiVar.zzm(i2);
        }
    }
}
