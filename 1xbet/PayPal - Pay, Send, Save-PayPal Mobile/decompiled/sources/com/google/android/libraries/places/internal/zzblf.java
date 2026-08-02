package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzblf extends com.google.android.libraries.places.internal.zzbln {
    private final com.google.android.libraries.places.internal.zzbli zza;

    public zzblf(com.google.android.libraries.places.internal.zzbli zzbliVar) {
        this.zza = (com.google.android.libraries.places.internal.zzbli) com.google.common.base.Preconditions.checkNotNull(zzbliVar, "result");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.libraries.places.internal.zzblf) {
            return this.zza.equals(((com.google.android.libraries.places.internal.zzblf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 19);
        sb.append("FixedResultPicker(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final com.google.android.libraries.places.internal.zzbli zza(com.google.android.libraries.places.internal.zzblj zzbljVar) {
        return this.zza;
    }
}
