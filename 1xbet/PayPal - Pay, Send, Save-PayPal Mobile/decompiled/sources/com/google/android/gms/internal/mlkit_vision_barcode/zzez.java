package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzez implements com.google.android.gms.internal.mlkit_vision_barcode.zzfe {
    private final int zza;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzfd zzb;

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzfe)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzfe zzfeVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzfe) obj;
        return this.zza == zzfeVar.zza() && this.zzb.equals(zzfeVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfe
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzfd zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfe
    public final int zza() {
        return this.zza;
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.Class annotationType() {
        return com.google.android.gms.internal.mlkit_vision_barcode.zzfe.class;
    }

    zzez(int i, com.google.android.gms.internal.mlkit_vision_barcode.zzfd zzfdVar) {
        this.zza = i;
        this.zzb = zzfdVar;
    }
}
