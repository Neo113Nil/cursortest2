package com.google.android.gms.fido.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public enum Transport implements com.google.android.gms.common.internal.ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable");

    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.common.Transport> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.gms.fido.common.zza
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            try {
                return com.google.android.gms.fido.common.Transport.fromString(parcel.readString());
            } catch (com.google.android.gms.fido.common.Transport.UnsupportedTransportException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.gms.fido.common.Transport[i];
        }
    };
    private final java.lang.String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedTransportException extends java.lang.Exception {
        public UnsupportedTransportException(java.lang.String str) {
            super(str);
        }
    }

    Transport(java.lang.String str) {
        this.zzb = str;
    }

    public static com.google.android.gms.fido.common.Transport fromString(java.lang.String str) throws com.google.android.gms.fido.common.Transport.UnsupportedTransportException {
        for (com.google.android.gms.fido.common.Transport transport : values()) {
            if (str.equals(transport.zzb)) {
                return transport;
            }
        }
        if (str.equals("hybrid")) {
            return HYBRID;
        }
        throw new com.google.android.gms.fido.common.Transport.UnsupportedTransportException(java.lang.String.format("Transport %s not supported", str));
    }

    public static java.util.List<com.google.android.gms.fido.common.Transport> parseTransports(org.json.JSONArray jSONArray) throws org.json.JSONException {
        if (jSONArray == null) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            java.lang.String string = jSONArray.getString(i);
            if (string != null && !string.isEmpty()) {
                try {
                    hashSet.add(fromString(string));
                } catch (com.google.android.gms.fido.common.Transport.UnsupportedTransportException unused) {
                    android.util.Log.w("Transport", "Ignoring unrecognized transport ".concat(string));
                }
            }
        }
        return new java.util.ArrayList(hashSet);
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
