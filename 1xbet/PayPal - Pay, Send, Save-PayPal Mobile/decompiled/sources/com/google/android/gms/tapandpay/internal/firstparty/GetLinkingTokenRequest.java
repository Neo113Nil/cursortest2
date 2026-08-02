package com.google.android.gms.tapandpay.internal.firstparty;

/* loaded from: classes8.dex */
public final class GetLinkingTokenRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest> CREATOR = new com.google.android.gms.tapandpay.internal.firstparty.zza();
    private java.lang.String zza;

    private GetLinkingTokenRequest() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest) {
            return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getIntegratorId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    GetLinkingTokenRequest(java.lang.String str) {
        this.zza = str;
    }

    public final java.lang.String getIntegratorId() {
        return this.zza;
    }
}
