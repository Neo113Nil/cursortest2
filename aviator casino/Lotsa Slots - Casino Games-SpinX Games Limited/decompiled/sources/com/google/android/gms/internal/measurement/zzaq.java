package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzaq implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzas zza;
    private int zzb;

    zzaq(com.google.android.gms.internal.measurement.zzas zzasVar) {
        java.util.Objects.requireNonNull(zzasVar);
        this.zza = zzasVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzb().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        java.lang.String zzb = this.zza.zzb();
        int i = this.zzb;
        if (i >= zzb.length()) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = i + 1;
        return new com.google.android.gms.internal.measurement.zzas(java.lang.String.valueOf(i));
    }
}
