package com.google.android.gms.auth.blockstore;

/* loaded from: classes8.dex */
public class RetrieveBytesRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.blockstore.RetrieveBytesRequest> CREATOR = new com.google.android.gms.auth.blockstore.zzc();
    private final java.util.List zza;
    private final boolean zzb;

    RetrieveBytesRequest(java.util.List list, boolean z) {
        if (z) {
            boolean z2 = true;
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z2, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.zzb = z;
        this.zza = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Element in keys cannot be null or empty");
                this.zza.add(str);
            }
        }
    }

    public java.util.List<java.lang.String> getKeys() {
        return java.util.Collections.unmodifiableList(this.zza);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 1, getKeys(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, getRetrieveAll());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static final class Builder {
        private java.util.List zza = new java.util.ArrayList();
        private boolean zzb = false;

        public final com.google.android.gms.auth.blockstore.RetrieveBytesRequest build() {
            return new com.google.android.gms.auth.blockstore.RetrieveBytesRequest(this.zza, this.zzb);
        }

        public final com.google.android.gms.auth.blockstore.RetrieveBytesRequest.Builder setKeys(java.util.List<java.lang.String> list) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "Keys cannot be set to null");
            this.zza = list;
            return this;
        }

        public final com.google.android.gms.auth.blockstore.RetrieveBytesRequest.Builder setRetrieveAll(boolean z) {
            this.zzb = z;
            return this;
        }
    }

    public boolean getRetrieveAll() {
        return this.zzb;
    }
}
