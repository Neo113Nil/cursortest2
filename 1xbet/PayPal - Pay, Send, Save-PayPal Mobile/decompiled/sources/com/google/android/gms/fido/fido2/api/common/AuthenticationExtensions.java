package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public class AuthenticationExtensions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzd();
    private final com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension zza;
    private final com.google.android.gms.fido.fido2.api.common.zzs zzb;
    private final com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension zzc;
    private final com.google.android.gms.fido.fido2.api.common.zzz zzd;
    private final com.google.android.gms.fido.fido2.api.common.zzab zze;
    private final com.google.android.gms.fido.fido2.api.common.zzad zzf;
    private final com.google.android.gms.fido.fido2.api.common.zzu zzg;
    private final com.google.android.gms.fido.fido2.api.common.zzag zzh;
    private final com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension zzi;
    private final com.google.android.gms.fido.fido2.api.common.zzak zzj;
    private final com.google.android.gms.fido.fido2.api.common.zzaw zzk;
    private final com.google.android.gms.fido.fido2.api.common.zzai zzl;

    AuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension fidoAppIdExtension, com.google.android.gms.fido.fido2.api.common.zzs zzsVar, com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension userVerificationMethodExtension, com.google.android.gms.fido.fido2.api.common.zzz zzzVar, com.google.android.gms.fido.fido2.api.common.zzab zzabVar, com.google.android.gms.fido.fido2.api.common.zzad zzadVar, com.google.android.gms.fido.fido2.api.common.zzu zzuVar, com.google.android.gms.fido.fido2.api.common.zzag zzagVar, com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, com.google.android.gms.fido.fido2.api.common.zzak zzakVar, com.google.android.gms.fido.fido2.api.common.zzaw zzawVar, com.google.android.gms.fido.fido2.api.common.zzai zzaiVar) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzsVar;
        this.zzd = zzzVar;
        this.zze = zzabVar;
        this.zzf = zzadVar;
        this.zzg = zzuVar;
        this.zzh = zzagVar;
        this.zzi = googleThirdPartyPaymentExtension;
        this.zzj = zzakVar;
        this.zzk = zzawVar;
        this.zzl = zzaiVar;
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zza(org.json.JSONObject jSONObject) throws org.json.JSONException {
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder builder = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder();
        if (jSONObject.has("fidoAppIdExtension")) {
            builder.setFido2Extension(new com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension(jSONObject.getJSONObject("fidoAppIdExtension").getString("appid")));
        }
        if (jSONObject.has("appid")) {
            builder.setFido2Extension(new com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension(jSONObject.getString("appid")));
        }
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new org.json.JSONException("both prf and prfAlreadyHashed extensions found");
            }
            builder.zzg(com.google.android.gms.fido.fido2.api.common.zzak.zza(jSONObject.getJSONObject("prf"), false));
        } else if (jSONObject.has("prfAlreadyHashed")) {
            builder.zzg(com.google.android.gms.fido.fido2.api.common.zzak.zza(jSONObject.getJSONObject("prfAlreadyHashed"), true));
        }
        if (jSONObject.has("cableAuthenticationExtension")) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                arrayList.add(new com.google.android.gms.fido.fido2.api.common.zzq(jSONObject2.getLong("version"), android.util.Base64.decode(jSONObject2.getString("clientEid"), 11), android.util.Base64.decode(jSONObject2.getString("authenticatorEid"), 11), android.util.Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
            }
            builder.zza(new com.google.android.gms.fido.fido2.api.common.zzs(arrayList));
        }
        if (jSONObject.has("userVerificationMethodExtension")) {
            builder.setUserVerificationMethodExtension(new com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")));
        }
        if (jSONObject.has("google_multiAssertionExtension")) {
            builder.zzc(new com.google.android.gms.fido.fido2.api.common.zzz(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")));
        }
        if (jSONObject.has("google_sessionIdExtension")) {
            builder.zzd(new com.google.android.gms.fido.fido2.api.common.zzab(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId")));
        }
        if (jSONObject.has("google_silentVerificationExtension")) {
            builder.zze(new com.google.android.gms.fido.fido2.api.common.zzad(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")));
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
            builder.zzb(new com.google.android.gms.fido.fido2.api.common.zzu(jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey")));
        }
        if (jSONObject.has("google_tunnelServerIdExtension")) {
            builder.zzf(new com.google.android.gms.fido.fido2.api.common.zzag(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")));
        }
        if (jSONObject.has("google_thirdPartyPaymentExtension")) {
            builder.setGoogleThirdPartyPaymentExtension(new com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")));
        }
        if (jSONObject.has("txAuthSimple")) {
            builder.zzh(new com.google.android.gms.fido.fido2.api.common.zzaw(jSONObject.getString("txAuthSimple")));
        }
        return builder.build();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, authenticationExtensions.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, authenticationExtensions.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, authenticationExtensions.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, authenticationExtensions.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, authenticationExtensions.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, authenticationExtensions.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, authenticationExtensions.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, authenticationExtensions.zzh) && com.google.android.gms.common.internal.Objects.equal(this.zzi, authenticationExtensions.zzi) && com.google.android.gms.common.internal.Objects.equal(this.zzj, authenticationExtensions.zzj) && com.google.android.gms.common.internal.Objects.equal(this.zzk, authenticationExtensions.zzk) && com.google.android.gms.common.internal.Objects.equal(this.zzl, authenticationExtensions.zzl);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl);
    }

    public final java.lang.String toString() {
        com.google.android.gms.fido.fido2.api.common.zzaw zzawVar = this.zzk;
        com.google.android.gms.fido.fido2.api.common.zzak zzakVar = this.zzj;
        com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.zzi;
        com.google.android.gms.fido.fido2.api.common.zzag zzagVar = this.zzh;
        com.google.android.gms.fido.fido2.api.common.zzu zzuVar = this.zzg;
        com.google.android.gms.fido.fido2.api.common.zzad zzadVar = this.zzf;
        com.google.android.gms.fido.fido2.api.common.zzab zzabVar = this.zze;
        com.google.android.gms.fido.fido2.api.common.zzz zzzVar = this.zzd;
        com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension userVerificationMethodExtension = this.zzc;
        com.google.android.gms.fido.fido2.api.common.zzs zzsVar = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(zzsVar);
        java.lang.String valueOf3 = java.lang.String.valueOf(userVerificationMethodExtension);
        java.lang.String valueOf4 = java.lang.String.valueOf(zzzVar);
        java.lang.String valueOf5 = java.lang.String.valueOf(zzabVar);
        java.lang.String valueOf6 = java.lang.String.valueOf(zzadVar);
        java.lang.String valueOf7 = java.lang.String.valueOf(zzuVar);
        java.lang.String valueOf8 = java.lang.String.valueOf(zzagVar);
        java.lang.String valueOf9 = java.lang.String.valueOf(googleThirdPartyPaymentExtension);
        java.lang.String valueOf10 = java.lang.String.valueOf(zzakVar);
        java.lang.String valueOf11 = java.lang.String.valueOf(zzawVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationExtensions{\n fidoAppIdExtension=");
        sb.append(valueOf);
        sb.append(", \n cableAuthenticationExtension=");
        sb.append(valueOf2);
        sb.append(", \n userVerificationMethodExtension=");
        sb.append(valueOf3);
        sb.append(", \n googleMultiAssertionExtension=");
        sb.append(valueOf4);
        sb.append(", \n googleSessionIdExtension=");
        sb.append(valueOf5);
        sb.append(", \n googleSilentVerificationExtension=");
        sb.append(valueOf6);
        sb.append(", \n devicePublicKeyExtension=");
        sb.append(valueOf7);
        sb.append(", \n googleTunnelServerIdExtension=");
        sb.append(valueOf8);
        sb.append(", \n googleThirdPartyPaymentExtension=");
        sb.append(valueOf9);
        sb.append(", \n prfExtension=");
        sb.append(valueOf10);
        sb.append(", \n simpleTransactionAuthorizationExtension=");
        sb.append(valueOf11);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getFidoAppIdExtension(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getUserVerificationMethodExtension(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 13, this.zzl, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension zza;
        private com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension zzb;
        private com.google.android.gms.fido.fido2.api.common.zzs zzc;
        private com.google.android.gms.fido.fido2.api.common.zzz zzd;
        private com.google.android.gms.fido.fido2.api.common.zzab zze;
        private com.google.android.gms.fido.fido2.api.common.zzad zzf;
        private com.google.android.gms.fido.fido2.api.common.zzu zzg;
        private com.google.android.gms.fido.fido2.api.common.zzag zzh;
        private com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension zzi;
        private com.google.android.gms.fido.fido2.api.common.zzak zzj;
        private com.google.android.gms.fido.fido2.api.common.zzaw zzk;
        private com.google.android.gms.fido.fido2.api.common.zzai zzl;

        public Builder(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions) {
            if (authenticationExtensions != null) {
                this.zza = authenticationExtensions.getFidoAppIdExtension();
                this.zzb = authenticationExtensions.getUserVerificationMethodExtension();
                this.zzc = authenticationExtensions.zzb();
                this.zzd = authenticationExtensions.zzd();
                this.zze = authenticationExtensions.zze();
                this.zzf = authenticationExtensions.zzf();
                this.zzg = authenticationExtensions.zzc();
                this.zzh = authenticationExtensions.zzh();
                this.zzi = authenticationExtensions.zzg();
                this.zzj = authenticationExtensions.zzj();
                this.zzk = authenticationExtensions.zzk();
                this.zzl = authenticationExtensions.zzi();
            }
        }

        public final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions build() {
            return new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions(this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl);
        }

        public final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder zzh(com.google.android.gms.fido.fido2.api.common.zzaw zzawVar) {
            this.zzk = zzawVar;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder zzg(com.google.android.gms.fido.fido2.api.common.zzak zzakVar) {
            this.zzj = zzakVar;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder zzf(com.google.android.gms.fido.fido2.api.common.zzag zzagVar) {
            this.zzh = zzagVar;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder zze(com.google.android.gms.fido.fido2.api.common.zzad zzadVar) {
            this.zzf = zzadVar;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder zzd(com.google.android.gms.fido.fido2.api.common.zzab zzabVar) {
            this.zze = zzabVar;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder zzc(com.google.android.gms.fido.fido2.api.common.zzz zzzVar) {
            this.zzd = zzzVar;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder zzb(com.google.android.gms.fido.fido2.api.common.zzu zzuVar) {
            this.zzg = zzuVar;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder zza(com.google.android.gms.fido.fido2.api.common.zzs zzsVar) {
            this.zzc = zzsVar;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder setUserVerificationMethodExtension(com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension userVerificationMethodExtension) {
            this.zzb = userVerificationMethodExtension;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder setGoogleThirdPartyPaymentExtension(com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.zzi = googleThirdPartyPaymentExtension;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder setFido2Extension(com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension fidoAppIdExtension) {
            this.zza = fidoAppIdExtension;
            return this;
        }

        public Builder() {
        }
    }

    public final com.google.android.gms.fido.fido2.api.common.zzaw zzk() {
        return this.zzk;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzak zzj() {
        return this.zzj;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzai zzi() {
        return this.zzl;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzag zzh() {
        return this.zzh;
    }

    public final com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension zzg() {
        return this.zzi;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzad zzf() {
        return this.zzf;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzab zze() {
        return this.zze;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzz zzd() {
        return this.zzd;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzu zzc() {
        return this.zzg;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzs zzb() {
        return this.zzb;
    }

    public com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension getUserVerificationMethodExtension() {
        return this.zzc;
    }

    public com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension getFidoAppIdExtension() {
        return this.zza;
    }
}
