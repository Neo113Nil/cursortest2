package com.google.android.gms.fido.u2f.api.common;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public enum ErrorCode implements android.os.Parcelable {
    OK(0),
    OTHER_ERROR(1),
    BAD_REQUEST(2),
    CONFIGURATION_UNSUPPORTED(3),
    DEVICE_INELIGIBLE(4),
    TIMEOUT(5);

    private final int zzc;
    private static final java.lang.String zza = "ErrorCode";
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.ErrorCode> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.gms.fido.u2f.api.common.zzc
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            return com.google.android.gms.fido.u2f.api.common.ErrorCode.toErrorCode(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.gms.fido.u2f.api.common.ErrorCode[i];
        }
    };

    ErrorCode(int i) {
        this.zzc = i;
    }

    public static com.google.android.gms.fido.u2f.api.common.ErrorCode toErrorCode(int i) {
        for (com.google.android.gms.fido.u2f.api.common.ErrorCode errorCode : values()) {
            if (i == errorCode.zzc) {
                return errorCode;
            }
        }
        return OTHER_ERROR;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.zzc);
    }

    public final int getCode() {
        return this.zzc;
    }
}
