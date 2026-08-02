package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
abstract class zzce extends com.google.android.gms.internal.fido.zzcf {
    zzce() {
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = zzf().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return com.google.android.gms.internal.fido.zzcy.zza(zzf().entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzf().size();
    }

    abstract com.google.android.gms.internal.fido.zzcd zzf();

    @Override // com.google.android.gms.internal.fido.zzcf
    final boolean zzg() {
        return false;
    }
}
