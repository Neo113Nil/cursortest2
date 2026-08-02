package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzfg extends java.util.AbstractMap {
    private static final java.util.Comparator zza = new com.google.android.gms.internal.fido.zzfd();
    private final java.lang.Object[] zzb;
    private final int[] zzc;
    private final java.util.Set zzd = new com.google.android.gms.internal.fido.zzff(this, -1);
    private java.lang.Integer zze = null;
    private java.lang.String zzf = null;

    zzfg(java.util.List list) {
        java.util.Iterator it = list.iterator();
        if (it.hasNext()) {
            com.google.android.gms.internal.fido.zzfc.zza((com.google.android.gms.internal.fido.zzfc) it.next());
            throw null;
        }
        int size = list.size();
        java.lang.Object[] objArr = new java.lang.Object[size];
        java.util.Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            com.google.android.gms.internal.fido.zzfc.zza((com.google.android.gms.internal.fido.zzfc) it2.next());
            throw null;
        }
        int[] iArr = {0};
        if (size > 16 && size * 9 > 0) {
            objArr = java.util.Arrays.copyOf(objArr, 0);
        }
        this.zzb = objArr;
        this.zzc = iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.zze == null) {
            this.zze = java.lang.Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return this.zzd;
    }
}
