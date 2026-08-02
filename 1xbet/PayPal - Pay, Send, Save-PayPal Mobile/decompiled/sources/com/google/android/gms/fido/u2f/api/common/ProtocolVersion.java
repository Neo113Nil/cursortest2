package com.google.android.gms.fido.u2f.api.common;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public enum ProtocolVersion implements android.os.Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");

    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.ProtocolVersion> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.gms.fido.u2f.api.common.zzf
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            try {
                return com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(parcel.readString());
            } catch (com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.gms.fido.u2f.api.common.ProtocolVersion[i];
        }
    };
    private final java.lang.String zzb;

    public static class UnsupportedProtocolException extends java.lang.Exception {
        public UnsupportedProtocolException(java.lang.String str) {
            super(java.lang.String.format("Protocol version %s not supported", str));
        }
    }

    ProtocolVersion(java.lang.String str) {
        this.zzb = str;
    }

    public static com.google.android.gms.fido.u2f.api.common.ProtocolVersion fromBytes(byte[] bArr) throws com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException {
        try {
            return fromString(new java.lang.String(bArr, "UTF-8"));
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static com.google.android.gms.fido.u2f.api.common.ProtocolVersion fromString(java.lang.String str) throws com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException {
        if (str == null) {
            return UNKNOWN;
        }
        for (com.google.android.gms.fido.u2f.api.common.ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.zzb)) {
                return protocolVersion;
            }
        }
        throw new com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UnsupportedProtocolException(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean isCompatible(com.google.android.gms.fido.u2f.api.common.ProtocolVersion protocolVersion) {
        com.google.android.gms.fido.u2f.api.common.ProtocolVersion protocolVersion2 = UNKNOWN;
        if (equals(protocolVersion2) || protocolVersion.equals(protocolVersion2)) {
            return true;
        }
        return equals(protocolVersion);
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
