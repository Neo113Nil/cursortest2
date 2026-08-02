package com.google.mlkit.vision.common.internal;

/* loaded from: classes9.dex */
public class VisionImageMetadataParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.mlkit.vision.common.internal.VisionImageMetadataParcel> CREATOR = new com.google.mlkit.vision.common.internal.zzg();
    public final int height;
    public final int rotation;
    public final long timestampMillis;
    public final int width;
    public final int zza;

    public VisionImageMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.width = i;
        this.height = i2;
        this.zza = i3;
        this.timestampMillis = j;
        this.rotation = i4;
    }

    public android.graphics.Matrix getUprightRotationMatrix() {
        return com.google.mlkit.vision.common.internal.ImageUtils.getInstance().getUprightRotationMatrix(this.width, this.height, this.rotation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.width);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.height);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.timestampMillis);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.rotation);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
