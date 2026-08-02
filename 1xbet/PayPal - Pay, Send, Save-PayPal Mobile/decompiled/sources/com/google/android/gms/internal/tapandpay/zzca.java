package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzca extends com.google.android.gms.internal.tapandpay.zzcf {
    private final java.lang.Object zza;
    private boolean zzb;

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.zzb) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    zzca(java.lang.Object obj) {
        this.zza = obj;
    }
}
