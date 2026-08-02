package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzax implements com.google.android.gms.internal.mlkit_common.zzbc {
    private final int zza;
    private final com.google.android.gms.internal.mlkit_common.zzbb zzb;

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_common.zzbc)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_common.zzbc zzbcVar = (com.google.android.gms.internal.mlkit_common.zzbc) obj;
        return this.zza == zzbcVar.zza() && this.zzb.equals(zzbcVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbc
    public final com.google.android.gms.internal.mlkit_common.zzbb zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbc
    public final int zza() {
        return this.zza;
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.Class annotationType() {
        return com.google.android.gms.internal.mlkit_common.zzbc.class;
    }

    zzax(int i, com.google.android.gms.internal.mlkit_common.zzbb zzbbVar) {
        this.zza = i;
        this.zzb = zzbbVar;
    }
}
