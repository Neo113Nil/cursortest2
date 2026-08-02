package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
abstract class zzh extends com.google.android.gms.internal.mlkit_vision_common.zzac {
    private final int zza;
    private int zzb;

    protected zzh(int i, int i2) {
        com.google.android.gms.internal.mlkit_vision_common.zzf.zzb(i2, i, "index");
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.zzb;
        this.zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.zzb - 1;
        this.zzb = i;
        return zza(i);
    }

    protected abstract java.lang.Object zza(int i);

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }
}
