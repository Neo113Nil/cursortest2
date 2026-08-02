package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzad implements com.google.android.gms.internal.mlkit_vision_common.zzai {
    private final int zza;
    private final com.google.android.gms.internal.mlkit_vision_common.zzah zzb;

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_vision_common.zzai)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_vision_common.zzai zzaiVar = (com.google.android.gms.internal.mlkit_vision_common.zzai) obj;
        return this.zza == zzaiVar.zza() && this.zzb.equals(zzaiVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzai
    public final com.google.android.gms.internal.mlkit_vision_common.zzah zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzai
    public final int zza() {
        return this.zza;
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.Class annotationType() {
        return com.google.android.gms.internal.mlkit_vision_common.zzai.class;
    }

    zzad(int i, com.google.android.gms.internal.mlkit_vision_common.zzah zzahVar) {
        this.zza = i;
        this.zzb = zzahVar;
    }
}
