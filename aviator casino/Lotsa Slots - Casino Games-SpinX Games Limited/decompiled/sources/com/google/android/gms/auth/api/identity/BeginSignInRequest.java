package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes3.dex */
public final class BeginSignInRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest> CREATOR = new com.google.android.gms.auth.api.identity.zbf();
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions zba;
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions zbb;
    private final java.lang.String zbc;
    private final boolean zbd;
    private final int zbe;
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions zbf;
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions zbg;

    /* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
    public static final class Builder {
        private com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions zba;
        private com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions zbb;
        private com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions zbc;
        private com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions zbd;
        private java.lang.String zbe;
        private boolean zbf;
        private int zbg;

        public Builder() {
            com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder builder = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.builder();
            builder.setSupported(false);
            this.zba = builder.build();
            com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder builder2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.builder();
            builder2.setSupported(false);
            this.zbb = builder2.build();
            com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.Builder builder3 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.builder();
            builder3.setSupported(false);
            this.zbc = builder3.build();
            com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.Builder builder4 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.builder();
            builder4.setSupported(false);
            this.zbd = builder4.build();
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest build() {
            return new com.google.android.gms.auth.api.identity.BeginSignInRequest(this.zba, this.zbb, this.zbe, this.zbf, this.zbg, this.zbc, this.zbd);
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setAutoSelectEnabled(boolean z) {
            this.zbf = z;
            return this;
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setGoogleIdTokenRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.zbb = (com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleIdTokenRequestOptions);
            return this;
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setPasskeyJsonSignInRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
            this.zbd = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(passkeyJsonRequestOptions);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setPasskeysSignInRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions) {
            this.zbc = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(passkeysRequestOptions);
            return this;
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setPasswordRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions passwordRequestOptions) {
            this.zba = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(passwordRequestOptions);
            return this;
        }

        public final com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder zba(java.lang.String str) {
            this.zbe = str;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder zbb(int i) {
            this.zbg = i;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
    public static final class GoogleIdTokenRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions> CREATOR = new com.google.android.gms.auth.api.identity.zbl();
        private final boolean zba;
        private final java.lang.String zbb;
        private final java.lang.String zbc;
        private final boolean zbd;
        private final java.lang.String zbe;
        private final java.util.List zbf;
        private final boolean zbg;

        /* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
        public static final class Builder {
            private boolean zba = false;
            private java.lang.String zbb = null;
            private java.lang.String zbc = null;
            private boolean zbd = true;
            private java.lang.String zbe = null;
            private java.util.List zbf = null;
            private boolean zbg = false;

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder associateLinkedAccounts(java.lang.String str, java.util.List<java.lang.String> list) {
                this.zbe = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.zbf = list;
                return this;
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions build() {
                return new com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg);
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setFilterByAuthorizedAccounts(boolean z) {
                this.zbd = z;
                return this;
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setNonce(java.lang.String str) {
                this.zbc = str;
                return this;
            }

            @java.lang.Deprecated
            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setRequestVerifiedPhoneNumber(boolean z) {
                this.zbg = z;
                return this;
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setServerClientId(java.lang.String str) {
                this.zbb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                return this;
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setSupported(boolean z) {
                this.zba = z;
                return this;
            }
        }

        GoogleIdTokenRequestOptions(boolean z, java.lang.String str, java.lang.String str2, boolean z2, java.lang.String str3, java.util.List list, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.zba = z;
            if (z) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zbb = str;
            this.zbc = str2;
            this.zbd = z2;
            android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest> creator = com.google.android.gms.auth.api.identity.BeginSignInRequest.CREATOR;
            java.util.ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new java.util.ArrayList(list);
                java.util.Collections.sort(arrayList);
            }
            this.zbf = arrayList;
            this.zbe = str3;
            this.zbg = z3;
        }

        public static com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder builder() {
            return new com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions)) {
                return false;
            }
            com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions) obj;
            return this.zba == googleIdTokenRequestOptions.zba && com.google.android.gms.common.internal.Objects.equal(this.zbb, googleIdTokenRequestOptions.zbb) && com.google.android.gms.common.internal.Objects.equal(this.zbc, googleIdTokenRequestOptions.zbc) && this.zbd == googleIdTokenRequestOptions.zbd && com.google.android.gms.common.internal.Objects.equal(this.zbe, googleIdTokenRequestOptions.zbe) && com.google.android.gms.common.internal.Objects.equal(this.zbf, googleIdTokenRequestOptions.zbf) && this.zbg == googleIdTokenRequestOptions.zbg;
        }

        public boolean filterByAuthorizedAccounts() {
            return this.zbd;
        }

        public java.util.List<java.lang.String> getIdTokenDepositionScopes() {
            return this.zbf;
        }

        public java.lang.String getLinkedServiceId() {
            return this.zbe;
        }

        public java.lang.String getNonce() {
            return this.zbc;
        }

        public java.lang.String getServerClientId() {
            return this.zbb;
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zba), this.zbb, this.zbc, java.lang.Boolean.valueOf(this.zbd), this.zbe, this.zbf, java.lang.Boolean.valueOf(this.zbg));
        }

        public boolean isSupported() {
            return this.zba;
        }

        @java.lang.Deprecated
        public boolean requestVerifiedPhoneNumber() {
            return this.zbg;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getNonce(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, filterByAuthorizedAccounts());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getLinkedServiceId(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 6, getIdTokenDepositionScopes(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, requestVerifiedPhoneNumber());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
    public static final class PasskeyJsonRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions> CREATOR = new com.google.android.gms.auth.api.identity.zbm();
        private final boolean zba;
        private final java.lang.String zbb;

        /* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
        public static final class Builder {
            private boolean zba = false;
            private java.lang.String zbb;

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions build() {
                return new com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions(this.zba, this.zbb);
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.Builder setRequestJson(java.lang.String str) {
                this.zbb = str;
                return this;
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.Builder setSupported(boolean z) {
                this.zba = z;
                return this;
            }
        }

        PasskeyJsonRequestOptions(boolean z, java.lang.String str) {
            if (z) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            }
            this.zba = z;
            this.zbb = str;
        }

        public static com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.Builder builder() {
            return new com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions)) {
                return false;
            }
            com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions) obj;
            return this.zba == passkeyJsonRequestOptions.zba && com.google.android.gms.common.internal.Objects.equal(this.zbb, passkeyJsonRequestOptions.zbb);
        }

        public java.lang.String getRequestJson() {
            return this.zbb;
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zba), this.zbb);
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getRequestJson(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
    @java.lang.Deprecated
    public static final class PasskeysRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions> CREATOR = new com.google.android.gms.auth.api.identity.zbn();
        private final boolean zba;
        private final byte[] zbb;
        private final java.lang.String zbc;

        /* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
        public static final class Builder {
            private boolean zba = false;
            private byte[] zbb;
            private java.lang.String zbc;

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions build() {
                return new com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions(this.zba, this.zbb, this.zbc);
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.Builder setChallenge(byte[] bArr) {
                this.zbb = bArr;
                return this;
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.Builder setRpId(java.lang.String str) {
                this.zbc = str;
                return this;
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.Builder setSupported(boolean z) {
                this.zba = z;
                return this;
            }
        }

        PasskeysRequestOptions(boolean z, byte[] bArr, java.lang.String str) {
            if (z) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            }
            this.zba = z;
            this.zbb = bArr;
            this.zbc = str;
        }

        public static com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.Builder builder() {
            return new com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            java.lang.String str;
            java.lang.String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions)) {
                return false;
            }
            com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions) obj;
            return this.zba == passkeysRequestOptions.zba && java.util.Arrays.equals(this.zbb, passkeysRequestOptions.zbb) && ((str = this.zbc) == (str2 = passkeysRequestOptions.zbc) || (str != null && str.equals(str2)));
        }

        public byte[] getChallenge() {
            return this.zbb;
        }

        public java.lang.String getRpId() {
            return this.zbc;
        }

        public int hashCode() {
            return (java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Boolean.valueOf(this.zba), this.zbc}) * 31) + java.util.Arrays.hashCode(this.zbb);
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, getChallenge(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getRpId(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
    public static final class PasswordRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions> CREATOR = new com.google.android.gms.auth.api.identity.zbo();
        private final boolean zba;

        /* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
        public static final class Builder {
            private boolean zba = false;

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions build() {
                return new com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions(this.zba);
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder setSupported(boolean z) {
                this.zba = z;
                return this;
            }
        }

        PasswordRequestOptions(boolean z) {
            this.zba = z;
        }

        public static com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder builder() {
            return new com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) && this.zba == ((com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) obj).zba;
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zba));
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    BeginSignInRequest(com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions passwordRequestOptions, com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions, java.lang.String str, boolean z, int i, com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions, com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
        this.zba = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(passwordRequestOptions);
        this.zbb = (com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.zbc = str;
        this.zbd = z;
        this.zbe = i;
        if (passkeysRequestOptions == null) {
            com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.Builder builder = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.builder();
            builder.setSupported(false);
            passkeysRequestOptions = builder.build();
        }
        this.zbf = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.Builder builder2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.builder();
            builder2.setSupported(false);
            passkeyJsonRequestOptions = builder2.build();
        }
        this.zbg = passkeyJsonRequestOptions;
    }

    public static com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder builder() {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder();
    }

    public static com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder zba(com.google.android.gms.auth.api.identity.BeginSignInRequest beginSignInRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(beginSignInRequest);
        com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder builder = builder();
        builder.setGoogleIdTokenRequestOptions(beginSignInRequest.getGoogleIdTokenRequestOptions());
        builder.setPasswordRequestOptions(beginSignInRequest.getPasswordRequestOptions());
        builder.setPasskeysSignInRequestOptions(beginSignInRequest.getPasskeysRequestOptions());
        builder.setPasskeyJsonSignInRequestOptions(beginSignInRequest.getPasskeyJsonRequestOptions());
        builder.setAutoSelectEnabled(beginSignInRequest.zbd);
        builder.zbb(beginSignInRequest.zbe);
        java.lang.String str = beginSignInRequest.zbc;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.BeginSignInRequest beginSignInRequest = (com.google.android.gms.auth.api.identity.BeginSignInRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zba, beginSignInRequest.zba) && com.google.android.gms.common.internal.Objects.equal(this.zbb, beginSignInRequest.zbb) && com.google.android.gms.common.internal.Objects.equal(this.zbf, beginSignInRequest.zbf) && com.google.android.gms.common.internal.Objects.equal(this.zbg, beginSignInRequest.zbg) && com.google.android.gms.common.internal.Objects.equal(this.zbc, beginSignInRequest.zbc) && this.zbd == beginSignInRequest.zbd && this.zbe == beginSignInRequest.zbe;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.zbb;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions getPasskeyJsonRequestOptions() {
        return this.zbg;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions getPasskeysRequestOptions() {
        return this.zbf;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions getPasswordRequestOptions() {
        return this.zba;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb, this.zbf, this.zbg, this.zbc, java.lang.Boolean.valueOf(this.zbd));
    }

    public boolean isAutoSelectEnabled() {
        return this.zbd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getPasswordRequestOptions(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getGoogleIdTokenRequestOptions(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, isAutoSelectEnabled());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zbe);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, getPasskeysRequestOptions(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, getPasskeyJsonRequestOptions(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
