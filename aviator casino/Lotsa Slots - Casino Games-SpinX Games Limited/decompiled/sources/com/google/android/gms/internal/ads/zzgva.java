package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgva extends com.google.android.gms.internal.ads.zzguy implements java.util.ListIterator {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgva(com.google.android.gms.internal.ads.zzgvb zzgvbVar) {
        super(zzgvbVar);
        java.util.Objects.requireNonNull(zzgvbVar);
        this.zzd = zzgvbVar;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzgvb zzgvbVar = this.zzd;
        boolean isEmpty = zzgvbVar.isEmpty();
        zza();
        ((java.util.ListIterator) this.zza).add(obj);
        com.google.android.gms.internal.ads.zzgvc zzgvcVar = zzgvbVar.zzf;
        zzgvcVar.zzq(zzgvcVar.zzp() + 1);
        if (isEmpty) {
            zzgvbVar.zzc();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((java.util.ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((java.util.ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        zza();
        return ((java.util.ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((java.util.ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        zza();
        ((java.util.ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgva(com.google.android.gms.internal.ads.zzgvb zzgvbVar, int i) {
        super(zzgvbVar, ((java.util.List) zzgvbVar.zzb).listIterator(i));
        java.util.Objects.requireNonNull(zzgvbVar);
        this.zzd = zzgvbVar;
    }
}
