package com.google.android.gms.fido.u2f.api.common;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class ClientData {
    public static final java.lang.String KEY_CHALLENGE = "challenge";
    public static final java.lang.String KEY_CID_PUBKEY = "cid_pubkey";
    public static final java.lang.String KEY_ORIGIN = "origin";
    public static final java.lang.String KEY_TYPE = "typ";
    public static final java.lang.String TYPE_FINISH_ENROLLMENT = "navigator.id.finishEnrollment";
    public static final java.lang.String TYPE_GET_ASSERTION = "navigator.id.getAssertion";
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzd;

    ClientData(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.fido.u2f.api.common.ChannelIdValue channelIdValue) {
        this.zza = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzb = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str2);
        this.zzc = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
        this.zzd = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue) com.google.android.gms.common.internal.Preconditions.checkNotNull(channelIdValue);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fido.u2f.api.common.ClientData)) {
            return false;
        }
        com.google.android.gms.fido.u2f.api.common.ClientData clientData = (com.google.android.gms.fido.u2f.api.common.ClientData) obj;
        return this.zza.equals(clientData.zza) && this.zzb.equals(clientData.zzb) && this.zzc.equals(clientData.zzc) && this.zzd.equals(clientData.zzd);
    }

    public int hashCode() {
        int hashCode = this.zza.hashCode();
        int hashCode2 = this.zzb.hashCode();
        return ((((((hashCode + 31) * 31) + hashCode2) * 31) + this.zzc.hashCode()) * 31) + this.zzd.hashCode();
    }

    public java.lang.String toJsonString() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("typ", this.zza);
            jSONObject.put(KEY_CHALLENGE, this.zzb);
            jSONObject.put("origin", this.zzc);
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType channelIdValueType = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.ABSENT;
            int ordinal = this.zzd.getType().ordinal();
            if (ordinal == 1) {
                jSONObject.put(KEY_CID_PUBKEY, this.zzd.getStringValue());
            } else if (ordinal == 2) {
                jSONObject.put(KEY_CID_PUBKEY, this.zzd.getObjectValue());
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static class Builder implements java.lang.Cloneable {
        private java.lang.String zza;
        private java.lang.String zzb;
        private java.lang.String zzc;
        private com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzd;

        Builder() {
            this.zzd = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ABSENT;
        }

        public static com.google.android.gms.fido.u2f.api.common.ClientData.Builder newInstance() {
            return new com.google.android.gms.fido.u2f.api.common.ClientData.Builder();
        }

        public com.google.android.gms.fido.u2f.api.common.ClientData build() {
            return new com.google.android.gms.fido.u2f.api.common.ClientData(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public com.google.android.gms.fido.u2f.api.common.ClientData.Builder setType(java.lang.String str) {
            this.zza = str;
            return this;
        }

        public com.google.android.gms.fido.u2f.api.common.ClientData.Builder setOrigin(java.lang.String str) {
            this.zzc = str;
            return this;
        }

        public com.google.android.gms.fido.u2f.api.common.ClientData.Builder setChannelId(com.google.android.gms.fido.u2f.api.common.ChannelIdValue channelIdValue) {
            this.zzd = channelIdValue;
            return this;
        }

        public com.google.android.gms.fido.u2f.api.common.ClientData.Builder setChallenge(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.google.android.gms.fido.u2f.api.common.ClientData.Builder m10213clone() {
            return new com.google.android.gms.fido.u2f.api.common.ClientData.Builder(this.zza, this.zzb, this.zzc, this.zzd);
        }

        Builder(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.fido.u2f.api.common.ChannelIdValue channelIdValue) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = channelIdValue;
        }
    }
}
