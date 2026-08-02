package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public enum PublicKeyCredentialType implements android.os.Parcelable {
    PUBLIC_KEY("public-key");

    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zzat
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            try {
                return com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.fromString(parcel.readString());
            } catch (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[i];
        }
    };
    private final java.lang.String zzb = "public-key";

    public static class UnsupportedPublicKeyCredTypeException extends java.lang.Exception {
        public UnsupportedPublicKeyCredTypeException(java.lang.String str) {
            super(str);
        }
    }

    PublicKeyCredentialType(java.lang.String str) {
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType fromString(java.lang.String str) throws com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException {
        for (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals(publicKeyCredentialType.zzb)) {
                return publicKeyCredentialType;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException(java.lang.String.format("PublicKeyCredentialType %s not supported", str));
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
