package com.google.android.gms.auth.blockstore;

/* loaded from: classes8.dex */
public class StoreBytesData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.blockstore.StoreBytesData> CREATOR = new com.google.android.gms.auth.blockstore.zze();
    private final byte[] zza;
    private final boolean zzb;
    private final java.lang.String zzc;

    StoreBytesData(byte[] bArr, boolean z, java.lang.String str) {
        this.zza = bArr;
        this.zzb = z;
        this.zzc = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 1, getBytes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, shouldBackupToCloud());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getKey(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static final class Builder {
        private byte[] zza;
        private boolean zzb;
        private java.lang.String zzc = com.google.android.gms.auth.blockstore.BlockstoreClient.DEFAULT_BYTES_DATA_KEY;

        public final com.google.android.gms.auth.blockstore.StoreBytesData build() {
            return new com.google.android.gms.auth.blockstore.StoreBytesData(this.zza, this.zzb, this.zzc);
        }

        public final com.google.android.gms.auth.blockstore.StoreBytesData.Builder setKey(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "key cannot be null or empty");
            this.zzc = str;
            return this;
        }

        public final com.google.android.gms.auth.blockstore.StoreBytesData.Builder setShouldBackupToCloud(boolean z) {
            this.zzb = z;
            return this;
        }

        public final com.google.android.gms.auth.blockstore.StoreBytesData.Builder setBytes(byte[] bArr) {
            this.zza = bArr;
            return this;
        }
    }

    public boolean shouldBackupToCloud() {
        return this.zzb;
    }

    public java.lang.String getKey() {
        return this.zzc;
    }

    public byte[] getBytes() {
        return this.zza;
    }
}
