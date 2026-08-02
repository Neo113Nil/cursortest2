package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzbk {
    java.lang.Object[] zza;
    int zzb;
    com.google.android.gms.internal.maps.zzbj zzc;

    public zzbk() {
        this(4);
    }

    private final void zzb(int i) {
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 > length) {
                length = length + (length >> 1) + 1;
                if (length < i2) {
                    int highestOneBit = java.lang.Integer.highestOneBit(i2 - 1);
                    length = highestOneBit + highestOneBit;
                }
                if (length < 0) {
                    length = Integer.MAX_VALUE;
                }
            }
            this.zza = java.util.Arrays.copyOf(objArr, length);
        }
    }

    public final com.google.android.gms.internal.maps.zzbk zza(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            zzb(this.zzb + ((java.util.Collection) iterable).size());
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            zzb(this.zzb + 1);
            com.google.android.gms.internal.maps.zzbd.zza(key, value);
            java.lang.Object[] objArr = this.zza;
            int i = this.zzb;
            int i2 = i + i;
            objArr[i2] = key;
            objArr[i2 + 1] = value;
            this.zzb = i + 1;
        }
        return this;
    }

    zzbk(int i) {
        this.zza = new java.lang.Object[i + i];
        this.zzb = 0;
    }
}
