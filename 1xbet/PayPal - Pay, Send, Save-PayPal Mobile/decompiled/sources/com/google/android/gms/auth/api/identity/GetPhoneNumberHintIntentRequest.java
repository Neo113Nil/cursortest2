package com.google.android.gms.auth.api.identity;

/* loaded from: classes8.dex */
public class GetPhoneNumberHintIntentRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest> CREATOR = new com.google.android.gms.auth.api.identity.zbj();
    private final int zba;

    GetPhoneNumberHintIntentRequest(int i) {
        this.zba = i;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest) {
            return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zba), java.lang.Integer.valueOf(((com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest) obj).zba));
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zba));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zba;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static final class Builder {
        public final com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest build() {
            return new com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest(0);
        }

        /* synthetic */ Builder(byte[] bArr) {
        }

        private Builder() {
            throw null;
        }
    }

    public static com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest.Builder builder() {
        return new com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest.Builder(null);
    }
}
