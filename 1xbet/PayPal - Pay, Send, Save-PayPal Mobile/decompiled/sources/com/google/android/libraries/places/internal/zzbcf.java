package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbcf extends com.google.android.libraries.places.internal.zzbcg {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbcl zza;
    private int zzb;
    private final int zzc;

    zzbcf(com.google.android.libraries.places.internal.zzbcl zzbclVar) {
        java.util.Objects.requireNonNull(zzbclVar);
        this.zza = zzbclVar;
        this.zzb = 0;
        this.zzc = zzbclVar.zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzbci
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }
}
