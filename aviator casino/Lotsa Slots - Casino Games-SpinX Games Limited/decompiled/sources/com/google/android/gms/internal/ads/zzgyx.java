package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgyx extends com.google.android.gms.internal.ads.zzgww {
    final transient java.lang.Object zza;

    zzgyx(java.lang.Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgww, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzgxe(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 2);
        sb.append(com.ironsource.X3.j.d);
        sb.append(obj);
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwi
    /* renamed from: zza */
    public final com.google.android.gms.internal.ads.zzgza iterator() {
        return new com.google.android.gms.internal.ads.zzgxe(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwi
    public final com.google.android.gms.internal.ads.zzgwm zze() {
        return com.google.android.gms.internal.ads.zzgwm.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final int zzg(java.lang.Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }
}
