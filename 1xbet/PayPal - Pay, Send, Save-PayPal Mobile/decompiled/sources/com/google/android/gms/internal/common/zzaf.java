package com.google.android.gms.internal.common;

/* loaded from: classes4.dex */
final class zzaf extends com.google.android.gms.internal.common.zzah {
    private final transient com.google.android.gms.internal.common.zzah zza;

    zzaf(com.google.android.gms.internal.common.zzah zzahVar) {
        this.zza = zzahVar;
    }

    private final int zzs(int i) {
        return (this.zza.size() - 1) - i;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.common.zzah zzahVar = this.zza;
        com.google.android.gms.internal.common.zzr.zzb(i, zzahVar.size(), "index");
        return zzahVar.get(zzs(i));
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzs(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzs(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.common.zzah
    /* renamed from: zzi */
    public final com.google.android.gms.internal.common.zzah subList(int i, int i2) {
        com.google.android.gms.internal.common.zzah zzahVar = this.zza;
        com.google.android.gms.internal.common.zzr.zzd(i, i2, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i2, zzahVar.size() - i).zzh();
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final com.google.android.gms.internal.common.zzah zzh() {
        return this.zza;
    }
}
