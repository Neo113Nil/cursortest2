package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgyk extends com.google.android.gms.internal.ads.zzgww {
    private final transient com.google.android.gms.internal.ads.zzgwp zza;
    private final transient com.google.android.gms.internal.ads.zzgwm zzb;

    zzgyk(com.google.android.gms.internal.ads.zzgwp zzgwpVar, com.google.android.gms.internal.ads.zzgwm zzgwmVar) {
        this.zza = zzgwpVar;
        this.zzb = zzgwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwi
    /* renamed from: zza */
    public final com.google.android.gms.internal.ads.zzgza iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwi
    public final com.google.android.gms.internal.ads.zzgwm zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final int zzg(java.lang.Object[] objArr, int i) {
        return this.zzb.zzg(objArr, i);
    }
}
