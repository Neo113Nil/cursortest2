package com.google.android.gms.tapandpay.globalactions;

/* loaded from: classes8.dex */
public final class GetGlobalActionCardsResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse> CREATOR = new com.google.android.gms.tapandpay.globalactions.zzb();
    private com.google.android.gms.tapandpay.globalactions.GlobalActionCard[] zza;
    private int zzb;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse(null);
        }

        public final com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse.Builder setCards(com.google.android.gms.tapandpay.globalactions.GlobalActionCard[] globalActionCardArr) {
            this.zza.zzb(globalActionCardArr);
            return this;
        }

        public final com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse.Builder setSelectedIndex(int i) {
            this.zza.zzd(i);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse getGlobalActionCardsResponse) {
            com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse getGlobalActionCardsResponse2 = new com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse(null);
            this.zza = getGlobalActionCardsResponse2;
            getGlobalActionCardsResponse2.zzb(getGlobalActionCardsResponse.zza());
            getGlobalActionCardsResponse2.zzd(getGlobalActionCardsResponse.zzc());
        }

        public final com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse build() {
            return this.zza;
        }
    }

    /* synthetic */ GetGlobalActionCardsResponse(byte[] bArr) {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse)) {
            return false;
        }
        com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse getGlobalActionCardsResponse = (com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse) obj;
        return java.util.Arrays.equals(this.zza, getGlobalActionCardsResponse.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(getGlobalActionCardsResponse.zzb));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zza)), java.lang.Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 1, getCards(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getSelectedIndex());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    GetGlobalActionCardsResponse(com.google.android.gms.tapandpay.globalactions.GlobalActionCard[] globalActionCardArr, int i) {
        this.zza = globalActionCardArr;
        this.zzb = i;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzb = i;
    }

    final /* synthetic */ int zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzb(com.google.android.gms.tapandpay.globalactions.GlobalActionCard[] globalActionCardArr) {
        this.zza = globalActionCardArr;
    }

    final /* synthetic */ com.google.android.gms.tapandpay.globalactions.GlobalActionCard[] zza() {
        return this.zza;
    }

    public final int getSelectedIndex() {
        return this.zzb;
    }

    public final com.google.android.gms.tapandpay.globalactions.GlobalActionCard[] getCards() {
        return this.zza;
    }

    private GetGlobalActionCardsResponse() {
        throw null;
    }
}
