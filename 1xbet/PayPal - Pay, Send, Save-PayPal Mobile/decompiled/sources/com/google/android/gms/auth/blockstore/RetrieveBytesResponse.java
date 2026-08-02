package com.google.android.gms.auth.blockstore;

/* loaded from: classes8.dex */
public class RetrieveBytesResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.blockstore.RetrieveBytesResponse> CREATOR = new com.google.android.gms.auth.blockstore.zzd();

    @java.lang.Deprecated
    private final android.os.Bundle zza;
    private final java.util.List zzb;
    private final java.util.Map zzc;

    RetrieveBytesResponse(android.os.Bundle bundle, java.util.List list) {
        this.zza = bundle;
        this.zzb = list;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.auth.blockstore.RetrieveBytesResponse.BlockstoreData blockstoreData = (com.google.android.gms.auth.blockstore.RetrieveBytesResponse.BlockstoreData) it.next();
            hashMap.put(blockstoreData.zza(), blockstoreData);
        }
        this.zzc = hashMap;
    }

    public java.util.Map<java.lang.String, com.google.android.gms.auth.blockstore.RetrieveBytesResponse.BlockstoreData> getBlockstoreDataMap() {
        return java.util.Collections.unmodifiableMap(this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.Bundle bundle = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 1, bundle, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class BlockstoreData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.auth.blockstore.RetrieveBytesResponse.BlockstoreData> CREATOR = new com.google.android.gms.auth.blockstore.zza();
        private final byte[] zza;
        private final java.lang.String zzb;

        BlockstoreData(byte[] bArr, java.lang.String str) {
            this.zza = bArr;
            this.zzb = str;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.android.gms.auth.blockstore.RetrieveBytesResponse.BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return java.util.Arrays.equals(this.zza, ((com.google.android.gms.auth.blockstore.RetrieveBytesResponse.BlockstoreData) obj).zza);
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zza)));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 1, getBytes(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public final java.lang.String zza() {
            return this.zzb;
        }

        public byte[] getBytes() {
            return this.zza;
        }
    }
}
