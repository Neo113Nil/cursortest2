package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public enum UserVerificationRequirement implements android.os.Parcelable {
    USER_VERIFICATION_REQUIRED(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zzbb
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            try {
                return com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement.fromString(parcel.readString());
            } catch (com.google.android.gms.fido.fido2.api.common.zzbc e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement[i];
        }
    };
    private final java.lang.String zze;

    UserVerificationRequirement(java.lang.String str) {
        this.zze = str;
    }

    public static com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement fromString(java.lang.String str) throws com.google.android.gms.fido.fido2.api.common.zzbc {
        for (com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement userVerificationRequirement : values()) {
            if (str.equals(userVerificationRequirement.zze)) {
                return userVerificationRequirement;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.zzbc(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zze);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.zze;
    }
}
