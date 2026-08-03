package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public enum zzay implements android.os.Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzay> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zzaw
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            try {
                return com.google.android.gms.fido.fido2.api.common.zzay.zza(parcel.readString());
            } catch (com.google.android.gms.fido.fido2.api.common.zzax e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.gms.fido.fido2.api.common.zzay[i];
        }
    };
    private final java.lang.String zze;

    zzay(java.lang.String str) {
        this.zze = str;
    }

    public static com.google.android.gms.fido.fido2.api.common.zzay zza(java.lang.String str) throws com.google.android.gms.fido.fido2.api.common.zzax {
        for (com.google.android.gms.fido.fido2.api.common.zzay zzayVar : values()) {
            if (str.equals(zzayVar.zze)) {
                return zzayVar;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.zzax(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zze);
    }
}
