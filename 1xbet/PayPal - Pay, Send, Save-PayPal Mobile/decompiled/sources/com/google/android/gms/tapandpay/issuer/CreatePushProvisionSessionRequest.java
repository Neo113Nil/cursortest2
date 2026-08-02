package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public class CreatePushProvisionSessionRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzb();
    private final java.lang.String zza;

    CreatePushProvisionSessionRequest(java.lang.String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private java.lang.String zza;

        public com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest build() {
            return new com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest(this.zza);
        }

        public com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest.Builder setIntegratorId(java.lang.String str) {
            this.zza = str;
            return this;
        }
    }
}
