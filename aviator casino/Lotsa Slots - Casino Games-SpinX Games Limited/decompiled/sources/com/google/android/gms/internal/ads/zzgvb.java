package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzgvb extends com.google.android.gms.internal.ads.zzguz implements java.util.List {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvc zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgvb(com.google.android.gms.internal.ads.zzgvc zzgvcVar, java.lang.Object obj, java.util.List list, com.google.android.gms.internal.ads.zzguz zzguzVar) {
        super(zzgvcVar, obj, list, zzguzVar);
        java.util.Objects.requireNonNull(zzgvcVar);
        this.zzf = zzgvcVar;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        zza();
        boolean isEmpty = this.zzb.isEmpty();
        ((java.util.List) this.zzb).add(i, obj);
        com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zzf;
        zzgvcVar.zzq(zzgvcVar.zzp() + 1);
        if (isEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((java.util.List) this.zzb).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zzf;
        zzgvcVar.zzq(zzgvcVar.zzp() + (size2 - size));
        if (size != 0) {
            return addAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        zza();
        return ((java.util.List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        zza();
        return ((java.util.List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        zza();
        return ((java.util.List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        zza();
        return new com.google.android.gms.internal.ads.zzgva(this);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        zza();
        java.lang.Object remove = ((java.util.List) this.zzb).remove(i);
        this.zzf.zzq(r0.zzp() - 1);
        zzb();
        return remove;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        zza();
        return ((java.util.List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        zza();
        java.util.List subList = ((java.util.List) this.zzb).subList(i, i2);
        com.google.android.gms.internal.ads.zzguz zzguzVar = this.zzc;
        if (zzguzVar == null) {
            zzguzVar = this;
        }
        return this.zzf.zzg(this.zza, subList, zzguzVar);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        zza();
        return new com.google.android.gms.internal.ads.zzgva(this, i);
    }
}
