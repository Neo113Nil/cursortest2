package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzcm extends com.google.android.gms.internal.fido.zzdc {
    private static final java.lang.Object zza = new java.lang.Object();
    private java.lang.Object zzb;

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object obj = this.zzb;
        java.lang.Object obj2 = zza;
        if (obj == obj2) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = obj2;
        return obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != zza;
    }

    zzcm(java.lang.Object obj) {
        this.zzb = obj;
    }
}
