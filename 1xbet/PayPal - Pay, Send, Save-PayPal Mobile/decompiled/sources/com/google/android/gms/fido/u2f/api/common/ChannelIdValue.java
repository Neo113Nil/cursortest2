package com.google.android.gms.fido.u2f.api.common;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class ChannelIdValue extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private final com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.ChannelIdValue> CREATOR = new com.google.android.gms.fido.u2f.api.common.zzb();
    public static final com.google.android.gms.fido.u2f.api.common.ChannelIdValue ABSENT = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue();
    public static final com.google.android.gms.fido.u2f.api.common.ChannelIdValue UNAVAILABLE = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue("unavailable");
    public static final com.google.android.gms.fido.u2f.api.common.ChannelIdValue UNUSED = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue(androidx.view.CreateDigitalCredentialRequest.UNUSED_USER_ID);

    public static class UnsupportedChannelIdValueTypeException extends java.lang.Exception {
        public UnsupportedChannelIdValueTypeException(int i) {
            super(java.lang.String.format("ChannelIdValueType %s not supported", java.lang.Integer.valueOf(i)));
        }
    }

    private ChannelIdValue() {
        this.zza = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.ABSENT;
        this.zzc = null;
        this.zzb = null;
    }

    public static com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType toChannelIdValueType(int i) throws com.google.android.gms.fido.u2f.api.common.ChannelIdValue.UnsupportedChannelIdValueTypeException {
        for (com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType channelIdValueType : com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.values()) {
            if (i == channelIdValueType.zzb) {
                return channelIdValueType;
            }
        }
        throw new com.google.android.gms.fido.u2f.api.common.ChannelIdValue.UnsupportedChannelIdValueTypeException(i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fido.u2f.api.common.ChannelIdValue)) {
            return false;
        }
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue channelIdValue = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue) obj;
        if (!this.zza.equals(channelIdValue.zza)) {
            return false;
        }
        int ordinal = this.zza.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.zzb.equals(channelIdValue.zzb);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.zzc.equals(channelIdValue.zzc);
    }

    public org.json.JSONObject getObjectValue() {
        if (this.zzc == null) {
            return null;
        }
        try {
            return new org.json.JSONObject(this.zzc);
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public int getTypeAsInt() {
        return this.zza.zzb;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = this.zza.hashCode() + 31;
        int ordinal = this.zza.ordinal();
        if (ordinal == 1) {
            i = hashCode2 * 31;
            hashCode = this.zzb.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i = hashCode2 * 31;
            hashCode = this.zzc.hashCode();
        }
        return i + hashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getTypeAsInt());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getStringValue(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getObjectValueAsString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    ChannelIdValue(int i, java.lang.String str, java.lang.String str2) {
        try {
            this.zza = toChannelIdValueType(i);
            this.zzb = str;
            this.zzc = str2;
        } catch (com.google.android.gms.fido.u2f.api.common.ChannelIdValue.UnsupportedChannelIdValueTypeException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    private ChannelIdValue(java.lang.String str) {
        this.zzb = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zza = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.STRING;
        this.zzc = null;
    }

    public ChannelIdValue(org.json.JSONObject jSONObject) {
        this.zzc = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(jSONObject.toString());
        this.zza = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.OBJECT;
        this.zzb = null;
    }

    public com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType getType() {
        return this.zza;
    }

    public enum ChannelIdValueType implements android.os.Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType> CREATOR = new com.google.android.gms.fido.u2f.api.common.zza();
        private final int zzb;

        ChannelIdValueType(int i) {
            this.zzb = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.zzb);
        }
    }

    public java.lang.String getStringValue() {
        return this.zzb;
    }

    public java.lang.String getObjectValueAsString() {
        return this.zzc;
    }
}
