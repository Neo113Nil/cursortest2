package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzdw extends com.google.android.gms.internal.auth.zzdy {
    final /* synthetic */ com.google.android.gms.internal.auth.zzef zza;
    private int zzb = 0;
    private final int zzc;

    @Override // com.google.android.gms.internal.auth.zzea
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

    zzdw(com.google.android.gms.internal.auth.zzef zzefVar) {
        this.zza = zzefVar;
        this.zzc = zzefVar.zzd();
    }
}
