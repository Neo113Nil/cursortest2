package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes.dex */
public enum ErrorCode implements android.os.Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.ErrorCode> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zzw
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            try {
                return com.google.android.gms.fido.fido2.api.common.ErrorCode.toErrorCode(parcel.readInt());
            } catch (com.google.android.gms.fido.fido2.api.common.ErrorCode.UnsupportedErrorCodeException e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.gms.fido.fido2.api.common.ErrorCode[i];
        }
    };
    private final int zzb;

    /* loaded from: classes8.dex */
    public static class UnsupportedErrorCodeException extends java.lang.Exception {
        public UnsupportedErrorCodeException(int i) {
            super(java.lang.String.format(java.util.Locale.US, "Error code %d is not supported", java.lang.Integer.valueOf(i)));
        }
    }

    ErrorCode(int i) {
        this.zzb = i;
    }

    public static com.google.android.gms.fido.fido2.api.common.ErrorCode toErrorCode(int i) throws com.google.android.gms.fido.fido2.api.common.ErrorCode.UnsupportedErrorCodeException {
        for (com.google.android.gms.fido.fido2.api.common.ErrorCode errorCode : values()) {
            if (i == errorCode.zzb) {
                return errorCode;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.ErrorCode.UnsupportedErrorCodeException(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.zzb);
    }

    public final int getCode() {
        return this.zzb;
    }
}
