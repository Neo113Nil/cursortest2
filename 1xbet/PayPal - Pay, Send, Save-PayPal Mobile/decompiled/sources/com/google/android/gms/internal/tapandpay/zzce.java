package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzce extends com.google.android.gms.internal.tapandpay.zzbz {
    final transient java.lang.Object zza;

    zzce(java.lang.Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 2);
        sb.append("[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final int zze(java.lang.Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz, com.google.android.gms.internal.tapandpay.zzbv
    /* renamed from: zza */
    public final com.google.android.gms.internal.tapandpay.zzcf iterator() {
        return new com.google.android.gms.internal.tapandpay.zzca(this.zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz, com.google.android.gms.internal.tapandpay.zzbv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.tapandpay.zzca(this.zza);
    }
}
