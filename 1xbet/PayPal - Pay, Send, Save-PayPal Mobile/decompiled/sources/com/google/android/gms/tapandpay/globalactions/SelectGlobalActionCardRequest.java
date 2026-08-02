package com.google.android.gms.tapandpay.globalactions;

/* loaded from: classes8.dex */
public final class SelectGlobalActionCardRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest> CREATOR = new com.google.android.gms.tapandpay.globalactions.zzd();
    private int zza;
    private java.lang.String zzb;
    private int zzc;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest(null);
        }

        public final com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest.Builder setCardId(java.lang.String str) {
            this.zza.zzd(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest.Builder setCardType(int i) {
            this.zza.zzb(i);
            return this;
        }

        public final com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest.Builder setSelectionTimeoutMs(int i) {
            this.zza.zzf(i);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest selectGlobalActionCardRequest) {
            com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest selectGlobalActionCardRequest2 = new com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest(null);
            this.zza = selectGlobalActionCardRequest2;
            selectGlobalActionCardRequest2.zzb(selectGlobalActionCardRequest.zza());
            selectGlobalActionCardRequest2.zzd(selectGlobalActionCardRequest.zzc());
            selectGlobalActionCardRequest2.zzf(selectGlobalActionCardRequest.zze());
        }

        public final com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest build() {
            return this.zza;
        }
    }

    SelectGlobalActionCardRequest(int i, java.lang.String str, int i2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest)) {
            return false;
        }
        com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest selectGlobalActionCardRequest = (com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(selectGlobalActionCardRequest.zza)) && com.google.android.gms.common.internal.Objects.equal(this.zzb, selectGlobalActionCardRequest.zzb) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(selectGlobalActionCardRequest.zzc));
    }

    public final int hashCode() {
        int i = this.zza;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(i), this.zzb, java.lang.Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getCardType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getCardId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, getSelectionTimeoutMs());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ SelectGlobalActionCardRequest(byte[] bArr) {
    }

    final /* synthetic */ void zzf(int i) {
        this.zzc = i;
    }

    final /* synthetic */ int zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzd(java.lang.String str) {
        this.zzb = str;
    }

    final /* synthetic */ java.lang.String zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzb(int i) {
        this.zza = i;
    }

    final /* synthetic */ int zza() {
        return this.zza;
    }

    public final int getSelectionTimeoutMs() {
        return this.zzc;
    }

    public final int getCardType() {
        return this.zza;
    }

    public final java.lang.String getCardId() {
        return this.zzb;
    }

    private SelectGlobalActionCardRequest() {
        throw null;
    }
}
