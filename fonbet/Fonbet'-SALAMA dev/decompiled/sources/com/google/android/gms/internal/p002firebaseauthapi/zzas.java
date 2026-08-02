package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzas<K, V> {
    zzar zza;
    private Object[] zzb;
    private int zzc;

    public zzas() {
        this(4);
    }

    public final zzas<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(((Collection) iterable).size() + this.zzc);
        }
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            K key = entry.getKey();
            V value = entry.getValue();
            zza(this.zzc + 1);
            zzai.zza(key, value);
            Object[] objArr = this.zzb;
            int i7 = this.zzc;
            objArr[i7 * 2] = key;
            objArr[(i7 * 2) + 1] = value;
            this.zzc = i7 + 1;
        }
        return this;
    }

    public zzas(int i7) {
        this.zzb = new Object[i7 * 2];
        this.zzc = 0;
    }

    public final zzap<K, V> zza() {
        zzar zzarVar = this.zza;
        if (zzarVar == null) {
            zzaw zza = zzaw.zza(this.zzc, this.zzb, this);
            zzar zzarVar2 = this.zza;
            if (zzarVar2 == null) {
                return zza;
            }
            throw zzarVar2.zza();
        }
        throw zzarVar.zza();
    }

    private final void zza(int i7) {
        int i8 = i7 << 1;
        Object[] objArr = this.zzb;
        if (i8 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzam.zza(objArr.length, i8));
        }
    }
}
