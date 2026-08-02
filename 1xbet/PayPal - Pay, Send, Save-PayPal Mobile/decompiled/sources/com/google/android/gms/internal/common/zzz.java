package com.google.android.gms.internal.common;

/* loaded from: classes4.dex */
abstract class zzz extends com.google.android.gms.internal.common.zzal {
    private final int zza;
    private int zzb;

    protected zzz(int i, int i2) {
        com.google.android.gms.internal.common.zzr.zzc(i2, i, "index");
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
