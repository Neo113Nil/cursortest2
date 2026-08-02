package com.google.android.gms.tapandpay.globalactions;

/* loaded from: classes8.dex */
public final class GetGlobalActionCardsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest> CREATOR = new com.google.android.gms.tapandpay.globalactions.zza();
    private int zza;
    private int zzb;
    private int zzc;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest(null);
        }

        public final com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest.Builder setCardHeightPx(int i) {
            this.zza.zzf(i);
            return this;
        }

        public final com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest.Builder setCardWidthPx(int i) {
            this.zza.zzd(i);
            return this;
        }

        public final com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest.Builder setMaxCards(int i) {
            this.zza.zzb(i);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest getGlobalActionCardsRequest) {
            com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest getGlobalActionCardsRequest2 = new com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest(null);
            this.zza = getGlobalActionCardsRequest2;
            getGlobalActionCardsRequest2.zzb(getGlobalActionCardsRequest.zza());
            getGlobalActionCardsRequest2.zzd(getGlobalActionCardsRequest.zzc());
            getGlobalActionCardsRequest2.zzf(getGlobalActionCardsRequest.zze());
        }

        public final com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest build() {
            return this.zza;
        }
    }

    GetGlobalActionCardsRequest(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest)) {
            return false;
        }
        com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest getGlobalActionCardsRequest = (com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(getGlobalActionCardsRequest.zza)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(getGlobalActionCardsRequest.zzb)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(getGlobalActionCardsRequest.zzc));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getMaxCards());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getCardWidthPx());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getCardHeightPx());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ GetGlobalActionCardsRequest(byte[] bArr) {
    }

    final /* synthetic */ void zzf(int i) {
        this.zzc = i;
    }

    final /* synthetic */ int zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzb = i;
    }

    final /* synthetic */ int zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzb(int i) {
        this.zza = i;
    }

    final /* synthetic */ int zza() {
        return this.zza;
    }

    public final int getMaxCards() {
        return this.zza;
    }

    public final int getCardWidthPx() {
        return this.zzb;
    }

    public final int getCardHeightPx() {
        return this.zzc;
    }

    private GetGlobalActionCardsRequest() {
        throw null;
    }
}
