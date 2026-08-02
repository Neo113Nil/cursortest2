package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public class TokenBinding extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private final com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus zza;
    private final java.lang.String zzb;
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.TokenBinding> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzaz();
    public static final com.google.android.gms.fido.fido2.api.common.TokenBinding SUPPORTED = new com.google.android.gms.fido.fido2.api.common.TokenBinding(com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.SUPPORTED.toString(), null);
    public static final com.google.android.gms.fido.fido2.api.common.TokenBinding NOT_SUPPORTED = new com.google.android.gms.fido.fido2.api.common.TokenBinding(com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    public static class UnsupportedTokenBindingStatusException extends java.lang.Exception {
        public UnsupportedTokenBindingStatusException(java.lang.String str) {
            super(java.lang.String.format("TokenBindingStatus %s not supported", str));
        }
    }

    public TokenBinding(java.lang.String str) {
        this(com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.PRESENT.toString(), (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.TokenBinding)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding = (com.google.android.gms.fido.fido2.api.common.TokenBinding) obj;
        return com.google.android.gms.internal.fido.zzbk.zza(this.zza, tokenBinding.zza) && com.google.android.gms.internal.fido.zzbk.zza(this.zzb, tokenBinding.zzb);
    }

    public java.lang.String getTokenBindingStatusAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.zza, this.zzb});
    }

    public org.json.JSONObject toJsonObject() throws org.json.JSONException {
        try {
            return new org.json.JSONObject().put("status", this.zza).put("id", this.zzb);
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getTokenBindingStatusAsString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getTokenBindingId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    TokenBinding(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        try {
            this.zza = com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.fromString(str);
            this.zzb = str2;
        } catch (com.google.android.gms.fido.fido2.api.common.TokenBinding.UnsupportedTokenBindingStatusException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public enum TokenBindingStatus implements android.os.Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzay();
        private final java.lang.String zzb;

        TokenBindingStatus(java.lang.String str) {
            this.zzb = str;
        }

        public static com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus fromString(java.lang.String str) throws com.google.android.gms.fido.fido2.api.common.TokenBinding.UnsupportedTokenBindingStatusException {
            for (com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.zzb)) {
                    return tokenBindingStatus;
                }
            }
            throw new com.google.android.gms.fido.fido2.api.common.TokenBinding.UnsupportedTokenBindingStatusException(str);
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

    public java.lang.String getTokenBindingId() {
        return this.zzb;
    }
}
