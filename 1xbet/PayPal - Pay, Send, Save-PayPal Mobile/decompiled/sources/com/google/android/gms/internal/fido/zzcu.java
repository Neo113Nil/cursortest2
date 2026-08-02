package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzcu extends com.google.android.gms.internal.fido.zzcf {
    static final com.google.android.gms.internal.fido.zzcu zza;
    private static final java.lang.Object[] zzd;
    final transient java.lang.Object[] zzb;
    final transient java.lang.Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        zzd = objArr;
        zza = new com.google.android.gms.internal.fido.zzcu(objArr, 0, objArr, 0, 0);
    }

    zzcu(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj != null) {
            java.lang.Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int zza2 = com.google.android.gms.internal.fido.zzbx.zza(obj.hashCode());
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

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* renamed from: zzd */
    public final com.google.android.gms.internal.fido.zzdc iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    final boolean zzg() {
        return true;
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    final com.google.android.gms.internal.fido.zzcc zzj() {
        return com.google.android.gms.internal.fido.zzcc.zzh(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final java.lang.Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzb() {
        return this.zzg;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }
}
