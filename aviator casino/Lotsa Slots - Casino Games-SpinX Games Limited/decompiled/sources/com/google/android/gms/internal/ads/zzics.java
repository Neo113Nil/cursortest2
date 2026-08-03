package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzics extends com.google.android.gms.internal.ads.zzict {
    final /* synthetic */ com.google.android.gms.internal.ads.zzida zza;
    private int zzb;
    private final int zzc;

    zzics(com.google.android.gms.internal.ads.zzida zzidaVar) {
        java.util.Objects.requireNonNull(zzidaVar);
        this.zza = zzidaVar;
        this.zzb = 0;
        this.zzc = zzidaVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzicv
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zza(i);
    }
}
