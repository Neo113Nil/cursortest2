package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzgo extends com.google.android.gms.internal.fido.zzgq {
    final /* synthetic */ com.google.android.gms.internal.fido.zzgx zza;
    private int zzb = 0;
    private final int zzc;

    @Override // com.google.android.gms.internal.fido.zzgs
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

    zzgo(com.google.android.gms.internal.fido.zzgx zzgxVar) {
        this.zza = zzgxVar;
        this.zzc = zzgxVar.zzd();
    }
}
