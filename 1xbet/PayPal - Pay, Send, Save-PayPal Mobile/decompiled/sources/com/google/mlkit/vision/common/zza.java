package com.google.mlkit.vision.common;

/* loaded from: classes9.dex */
final class zza extends com.google.mlkit.vision.common.PointF3D {
    private final float zza;
    private final float zzb;
    private final float zzc;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.mlkit.vision.common.PointF3D)) {
            return false;
        }
        com.google.mlkit.vision.common.PointF3D pointF3D = (com.google.mlkit.vision.common.PointF3D) obj;
        return java.lang.Float.floatToIntBits(this.zza) == java.lang.Float.floatToIntBits(pointF3D.getX()) && java.lang.Float.floatToIntBits(this.zzb) == java.lang.Float.floatToIntBits(pointF3D.getY()) && java.lang.Float.floatToIntBits(this.zzc) == java.lang.Float.floatToIntBits(pointF3D.getZ());
    }

    public final int hashCode() {
        int floatToIntBits = java.lang.Float.floatToIntBits(this.zza);
        return ((((floatToIntBits ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.zzb)) * 1000003) ^ java.lang.Float.floatToIntBits(this.zzc);
    }

    public final java.lang.String toString() {
        float f = this.zza;
        float f2 = this.zzb;
        float f3 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PointF3D{x=");
        sb.append(f);
        sb.append(", y=");
        sb.append(f2);
        sb.append(", z=");
        sb.append(f3);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getZ() {
        return this.zzc;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getY() {
        return this.zzb;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getX() {
        return this.zza;
    }

    zza(float f, float f2, float f3) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f3;
    }
}
