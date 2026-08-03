package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes3.dex */
public class GetSignInIntentRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.GetSignInIntentRequest> CREATOR = new com.google.android.gms.auth.api.identity.zbk();
    private final java.lang.String zba;
    private final java.lang.String zbb;
    private final java.lang.String zbc;
    private final java.lang.String zbd;
    private final boolean zbe;
    private final int zbf;

    /* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
    public static final class Builder {
        private java.lang.String zba;
        private java.lang.String zbb;
        private java.lang.String zbc;
        private java.lang.String zbd;
        private boolean zbe;
        private int zbf;

        public com.google.android.gms.auth.api.identity.GetSignInIntentRequest build() {
            return new com.google.android.gms.auth.api.identity.GetSignInIntentRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf);
        }

        public com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder filterByHostedDomain(java.lang.String str) {
            this.zbb = str;
            return this;
        }

        public com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder setNonce(java.lang.String str) {
            this.zbd = str;
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder setRequestVerifiedPhoneNumber(boolean z) {
            this.zbe = z;
            return this;
        }

        public com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder setServerClientId(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            this.zba = str;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder zba(java.lang.String str) {
            this.zbc = str;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder zbb(int i) {
            this.zbf = i;
            return this;
        }
    }

    GetSignInIntentRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = z;
        this.zbf = i;
    }

    public static com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder builder() {
        return new com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder();
    }

    public static com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder zba(com.google.android.gms.auth.api.identity.GetSignInIntentRequest getSignInIntentRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(getSignInIntentRequest);
        com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder builder = builder();
        builder.setServerClientId(getSignInIntentRequest.getServerClientId());
        builder.setNonce(getSignInIntentRequest.getNonce());
        builder.filterByHostedDomain(getSignInIntentRequest.getHostedDomainFilter());
        builder.setRequestVerifiedPhoneNumber(getSignInIntentRequest.zbe);
        builder.zbb(getSignInIntentRequest.zbf);
        java.lang.String str = getSignInIntentRequest.zbc;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.GetSignInIntentRequest)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.GetSignInIntentRequest getSignInIntentRequest = (com.google.android.gms.auth.api.identity.GetSignInIntentRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zba, getSignInIntentRequest.zba) && com.google.android.gms.common.internal.Objects.equal(this.zbd, getSignInIntentRequest.zbd) && com.google.android.gms.common.internal.Objects.equal(this.zbb, getSignInIntentRequest.zbb) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zbe), java.lang.Boolean.valueOf(getSignInIntentRequest.zbe)) && this.zbf == getSignInIntentRequest.zbf;
    }

    public java.lang.String getHostedDomainFilter() {
        return this.zbb;
    }

    public java.lang.String getNonce() {
        return this.zbd;
    }

    public java.lang.String getServerClientId() {
        return this.zba;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb, this.zbd, java.lang.Boolean.valueOf(this.zbe), java.lang.Integer.valueOf(this.zbf));
    }

    @java.lang.Deprecated
    public boolean requestVerifiedPhoneNumber() {
        return this.zbe;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getServerClientId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getHostedDomainFilter(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getNonce(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, requestVerifiedPhoneNumber());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zbf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
