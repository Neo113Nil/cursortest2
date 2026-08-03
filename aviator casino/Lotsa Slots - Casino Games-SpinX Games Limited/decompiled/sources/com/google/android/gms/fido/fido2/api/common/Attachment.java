package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public enum Attachment implements android.os.Parcelable {
    PLATFORM(com.ironsource.M6.H),
    CROSS_PLATFORM("cross-platform");

    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.Attachment> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zza
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
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

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
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
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }
}
