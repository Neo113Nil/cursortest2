package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
public abstract class zzs extends com.google.android.gms.internal.mlkit_vision_common.zzl implements java.util.Set {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.mlkit_vision_common.zzp zza;

    zzs() {
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
        return com.google.android.gms.internal.mlkit_vision_common.zzaa.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract com.google.android.gms.internal.mlkit_vision_common.zzab iterator();

    public final com.google.android.gms.internal.mlkit_vision_common.zzp zzf() {
        com.google.android.gms.internal.mlkit_vision_common.zzp zzpVar = this.zza;
        if (zzpVar != null) {
            return zzpVar;
        }
        com.google.android.gms.internal.mlkit_vision_common.zzp zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    com.google.android.gms.internal.mlkit_vision_common.zzp zzg() {
        return com.google.android.gms.internal.mlkit_vision_common.zzp.zzg(toArray());
    }
}
