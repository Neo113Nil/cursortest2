package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgwr extends com.google.android.gms.internal.ads.zzgza {
    final java.util.Iterator zza;
    java.util.Iterator zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgwu zzc;

    zzgwr(com.google.android.gms.internal.ads.zzgwu zzgwuVar) {
        java.util.Objects.requireNonNull(zzgwuVar);
        this.zzc = zzgwuVar;
        this.zza = ((com.google.android.gms.internal.ads.zzgwm) zzgwuVar.map.values()).listIterator(0);
        this.zzb = com.google.android.gms.internal.ads.zzgxc.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((com.google.android.gms.internal.ads.zzgwi) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }
}
