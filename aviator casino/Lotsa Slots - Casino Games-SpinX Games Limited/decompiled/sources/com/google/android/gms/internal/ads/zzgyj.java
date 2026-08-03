package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgyj extends com.google.android.gms.internal.ads.zzgww {
    private final transient com.google.android.gms.internal.ads.zzgwp zza;
    private final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzgyj(com.google.android.gms.internal.ads.zzgwp zzgwpVar, java.lang.Object[] objArr, int i, int i2) {
        this.zza = zzgwpVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwi
    /* renamed from: zza */
    public final com.google.android.gms.internal.ads.zzgza iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final int zzg(java.lang.Object[] objArr, int i) {
        return zze().zzg(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    final com.google.android.gms.internal.ads.zzgwm zzs() {
        return new com.google.android.gms.internal.ads.zzgyi(this);
    }

    final /* synthetic */ java.lang.Object[] zzw() {
        return this.zzb;
    }

    final /* synthetic */ int zzx() {
        return this.zzc;
    }
}
