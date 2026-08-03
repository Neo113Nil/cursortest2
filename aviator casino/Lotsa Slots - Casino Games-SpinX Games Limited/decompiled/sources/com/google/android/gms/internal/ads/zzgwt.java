package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgwt extends com.google.android.gms.internal.ads.zzgwi {
    private final transient com.google.android.gms.internal.ads.zzgwu zza;

    zzgwt(com.google.android.gms.internal.ads.zzgwu zzgwuVar) {
        this.zza = zzgwuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzgwr(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    /* renamed from: zza */
    public final com.google.android.gms.internal.ads.zzgza iterator() {
        return new com.google.android.gms.internal.ads.zzgwr(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgwi
    final int zzg(java.lang.Object[] objArr, int i) {
        com.google.android.gms.internal.ads.zzgzb listIterator = ((com.google.android.gms.internal.ads.zzgwm) this.zza.map.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i = ((com.google.android.gms.internal.ads.zzgwi) listIterator.next()).zzg(objArr, i);
        }
        return i;
    }
}
