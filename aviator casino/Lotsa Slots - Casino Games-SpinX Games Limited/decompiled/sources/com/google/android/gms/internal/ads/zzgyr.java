package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgyr extends com.google.android.gms.internal.ads.zzgyv {
    final /* synthetic */ java.util.Set zza;
    final /* synthetic */ java.util.Set zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgyr(java.util.Set set, java.util.Set set2) {
        super(null);
        this.zza = set;
        this.zzb = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.zza.contains(obj) && this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        return this.zza.containsAll(collection) && this.zzb.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return java.util.Collections.disjoint(this.zzb, this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Iterator it = this.zza.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.zzb.contains(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: zza */
    public final com.google.android.gms.internal.ads.zzgza iterator() {
        return new com.google.android.gms.internal.ads.zzgyq(this, this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    final int zzc() {
        return java.lang.Math.min(zzd(this.zza), zzd(this.zzb));
    }
}
