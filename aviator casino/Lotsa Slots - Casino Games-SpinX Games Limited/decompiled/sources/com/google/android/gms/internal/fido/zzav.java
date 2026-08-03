package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
final class zzav extends com.google.android.gms.internal.fido.zzaz {
    boolean zza;
    final /* synthetic */ java.lang.Object zzb;

    zzav(java.lang.Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.zza) {
            throw new java.util.NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}
