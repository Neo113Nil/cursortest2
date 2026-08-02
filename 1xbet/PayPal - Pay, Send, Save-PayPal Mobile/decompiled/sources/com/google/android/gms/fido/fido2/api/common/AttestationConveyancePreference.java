package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes.dex */
public enum AttestationConveyancePreference implements android.os.Parcelable {
    NONE("none"),
    INDIRECT(com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef.INDIRECT),
    DIRECT(com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef.DIRECT);

    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zzb
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            try {
                return com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.fromString(parcel.readString());
            } catch (com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference[i];
        }
    };
    private final java.lang.String zzb;

    /* loaded from: classes8.dex */
    public static class UnsupportedAttestationConveyancePreferenceException extends java.lang.Exception {
        public UnsupportedAttestationConveyancePreferenceException(java.lang.String str) {
            super(java.lang.String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    AttestationConveyancePreference(java.lang.String str) {
        this.zzb = str;
    }

    public static com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference fromString(java.lang.String str) throws com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException {
        for (com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.zzb)) {
                return attestationConveyancePreference;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException(str);
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
