package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes.dex */
public enum ResidentKeyRequirement implements android.os.Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY);

    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zzav
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            java.lang.String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            try {
                return com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.fromString(readString);
            } catch (com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[i];
        }
    };
    private final java.lang.String zzb;

    /* loaded from: classes8.dex */
    public static class UnsupportedResidentKeyRequirementException extends java.lang.Exception {
        public UnsupportedResidentKeyRequirementException(java.lang.String str) {
            super(java.lang.String.format("Resident key requirement %s not supported", str));
        }
    }

    ResidentKeyRequirement(java.lang.String str) {
        this.zzb = str;
    }

    public static com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement fromString(java.lang.String str) throws com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException {
        for (com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.zzb)) {
                return residentKeyRequirement;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.zzb;
    }
}
