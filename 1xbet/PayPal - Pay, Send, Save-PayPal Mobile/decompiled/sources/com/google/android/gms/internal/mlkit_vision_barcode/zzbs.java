package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
abstract class zzbs implements java.util.Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return com.google.android.gms.internal.mlkit_vision_barcode.zzax.zza(getKey(), entry.getKey()) && com.google.android.gms.internal.mlkit_vision_barcode.zzax.zza(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getKey();

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object key = getKey();
        java.lang.Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(getKey()) + "=" + java.lang.String.valueOf(getValue());
    }

    zzbs() {
    }
}
