package com.google.android.gms.auth.api.identity;

/* loaded from: classes8.dex */
public class ClearTokenRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.ClearTokenRequest> CREATOR = new com.google.android.gms.auth.api.identity.zbh();
    private final java.lang.String zba;
    private final java.lang.String zbb;

    ClearTokenRequest(java.lang.String str, java.lang.String str2) {
        this.zba = str;
        this.zbb = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.ClearTokenRequest)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.ClearTokenRequest clearTokenRequest = (com.google.android.gms.auth.api.identity.ClearTokenRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zba, clearTokenRequest.zba) && com.google.android.gms.common.internal.Objects.equal(this.zbb, clearTokenRequest.zbb);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getToken(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zbb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static final class Builder {
        private java.lang.String zba;
        private java.lang.String zbb;

        public final com.google.android.gms.auth.api.identity.ClearTokenRequest build() {
            return new com.google.android.gms.auth.api.identity.ClearTokenRequest(this.zba, this.zbb);
        }

        public final com.google.android.gms.auth.api.identity.ClearTokenRequest.Builder zba(java.lang.String str) {
            this.zbb = str;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.ClearTokenRequest.Builder setToken(java.lang.String str) {
            this.zba = str;
            return this;
        }

        /* synthetic */ Builder(byte[] bArr) {
        }

        /* synthetic */ Builder(com.google.android.gms.auth.api.identity.ClearTokenRequest clearTokenRequest, byte[] bArr) {
            this.zba = clearTokenRequest.zbb();
            this.zbb = clearTokenRequest.zbc();
        }

        private Builder() {
            throw null;
        }
    }

    final /* synthetic */ java.lang.String zbc() {
        return this.zbb;
    }

    final /* synthetic */ java.lang.String zbb() {
        return this.zba;
    }

    public final com.google.android.gms.auth.api.identity.ClearTokenRequest.Builder zba() {
        return new com.google.android.gms.auth.api.identity.ClearTokenRequest.Builder(this, null);
    }

    public java.lang.String getToken() {
        return this.zba;
    }

    public static com.google.android.gms.auth.api.identity.ClearTokenRequest.Builder builder() {
        return new com.google.android.gms.auth.api.identity.ClearTokenRequest.Builder(null);
    }
}
