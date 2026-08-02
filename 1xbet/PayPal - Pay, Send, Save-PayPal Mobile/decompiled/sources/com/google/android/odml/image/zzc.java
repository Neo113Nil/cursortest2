package com.google.android.odml.image;

/* loaded from: classes9.dex */
final class zzc extends com.google.android.odml.image.ImageProperties {
    private final int zza;
    private final int zzb;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.odml.image.ImageProperties)) {
            return false;
        }
        com.google.android.odml.image.ImageProperties imageProperties = (com.google.android.odml.image.ImageProperties) obj;
        return this.zza == imageProperties.getImageFormat() && this.zzb == imageProperties.getStorageType();
    }

    public final java.lang.String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(65);
        sb.append("ImageProperties{imageFormat=");
        sb.append(i);
        sb.append(", storageType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getStorageType() {
        return this.zzb;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getImageFormat() {
        return this.zza;
    }

    /* synthetic */ zzc(int i, int i2, com.google.android.odml.image.zza zzaVar) {
        this.zza = i;
        this.zzb = i2;
    }
}
