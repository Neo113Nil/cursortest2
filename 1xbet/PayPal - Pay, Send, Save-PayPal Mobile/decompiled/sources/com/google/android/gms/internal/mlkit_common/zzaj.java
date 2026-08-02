package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public abstract class zzaj extends com.google.android.gms.internal.mlkit_common.zzab implements java.util.Set {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.mlkit_common.zzaf zza;

    zzaj() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return com.google.android.gms.internal.mlkit_common.zzar.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract com.google.android.gms.internal.mlkit_common.zzas iterator();

    public final com.google.android.gms.internal.mlkit_common.zzaf zzf() {
        com.google.android.gms.internal.mlkit_common.zzaf zzafVar = this.zza;
        if (zzafVar != null) {
            return zzafVar;
        }
        com.google.android.gms.internal.mlkit_common.zzaf zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    com.google.android.gms.internal.mlkit_common.zzaf zzg() {
        java.lang.Object[] array = toArray();
        int i = com.google.android.gms.internal.mlkit_common.zzaf.zzd;
        return com.google.android.gms.internal.mlkit_common.zzaf.zzg(array, array.length);
    }
}
