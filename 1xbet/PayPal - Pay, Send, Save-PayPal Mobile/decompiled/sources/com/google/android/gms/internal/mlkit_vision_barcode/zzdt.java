package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
abstract class zzdt implements java.util.Iterator {
    final java.util.Iterator zza;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return zza(this.zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }

    abstract java.lang.Object zza(java.lang.Object obj);

    zzdt(java.util.Iterator it) {
        it.getClass();
        this.zza = it;
    }
}
