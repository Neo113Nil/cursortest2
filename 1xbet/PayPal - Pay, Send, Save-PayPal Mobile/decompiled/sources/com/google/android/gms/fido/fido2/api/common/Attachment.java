package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes.dex */
public enum Attachment implements android.os.Parcelable {
    PLATFORM(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT),
    CROSS_PLATFORM("cross-platform");

    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.Attachment> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zza
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            try {
                return com.google.android.gms.fido.fido2.api.common.Attachment.fromString(parcel.readString());
            } catch (com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.gms.fido.fido2.api.common.Attachment[i];
        }
    };
    private final java.lang.String zzb;

    /* loaded from: classes8.dex */
    public static class UnsupportedAttachmentException extends java.lang.Exception {
        public UnsupportedAttachmentException(java.lang.String str) {
            super(java.lang.String.format("Attachment %s not supported", str));
        }
    }

    Attachment(java.lang.String str) {
        this.zzb = str;
    }

    public static com.google.android.gms.fido.fido2.api.common.Attachment fromString(java.lang.String str) throws com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException {
        for (com.google.android.gms.fido.fido2.api.common.Attachment attachment : values()) {
            if (str.equals(attachment.zzb)) {
                return attachment;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException(str);
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
