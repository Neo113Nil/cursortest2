package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
final class zzbu extends com.google.android.gms.internal.maps.zzbm {
    static final com.google.android.gms.internal.maps.zzbu zza;
    private static final java.lang.Object[] zzd;
    final transient java.lang.Object[] zzb;
    final transient java.lang.Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        zzd = objArr;
        zza = new com.google.android.gms.internal.maps.zzbu(objArr, 0, objArr, 0, 0);
    }

    zzbu(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj != null) {
            java.lang.Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int zza2 = com.google.android.gms.internal.maps.zzbe.zza(obj.hashCode());
                while (true) {
                    int i = zza2 & this.zzf;
                    java.lang.Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    zza2 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.maps.zzbm, com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = this.zzb;
        int i2 = this.zzg;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.maps.zzbm, com.google.android.gms.internal.maps.zzbf
    /* renamed from: zzd */
    public final com.google.android.gms.internal.maps.zzbx iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.maps.zzbm
    final com.google.android.gms.internal.maps.zzbi zzh() {
        return com.google.android.gms.internal.maps.zzbi.zzg(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.maps.zzbm
    final boolean zzj() {
        return true;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final java.lang.Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zzb() {
        return this.zzg;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzbm, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }
}
