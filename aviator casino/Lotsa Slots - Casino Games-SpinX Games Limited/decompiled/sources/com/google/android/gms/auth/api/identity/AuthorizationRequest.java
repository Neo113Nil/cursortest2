package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes3.dex */
public class AuthorizationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.AuthorizationRequest> CREATOR = new com.google.android.gms.auth.api.identity.zbd();
    private final java.util.List zba;
    private final java.lang.String zbb;
    private final boolean zbc;
    private final boolean zbd;
    private final android.accounts.Account zbe;
    private final java.lang.String zbf;
    private final java.lang.String zbg;
    private final boolean zbh;

    /* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
    public static final class Builder {
        private java.util.List zba;
        private java.lang.String zbb;
        private boolean zbc;
        private boolean zbd;
        private android.accounts.Account zbe;
        private java.lang.String zbf;
        private java.lang.String zbg;
        private boolean zbh;

        private final java.lang.String zbc(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            java.lang.String str2 = this.zbb;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "two different server client ids provided");
            return str;
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest build() {
            return new com.google.android.gms.auth.api.identity.AuthorizationRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh);
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder filterByHostedDomain(java.lang.String str) {
            this.zbf = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            return this;
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder requestOfflineAccess(java.lang.String str) {
            requestOfflineAccess(str, false);
            return this;
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder setAccount(android.accounts.Account account) {
            this.zbe = (android.accounts.Account) com.google.android.gms.common.internal.Preconditions.checkNotNull(account);
            return this;
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder setRequestedScopes(java.util.List<com.google.android.gms.common.api.Scope> list) {
            boolean z = false;
            if (list != null && !list.isEmpty()) {
                z = true;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "requestedScopes cannot be null or empty");
            this.zba = list;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder zba(java.lang.String str) {
            zbc(str);
            this.zbb = str;
            this.zbd = true;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder zbb(java.lang.String str) {
            this.zbg = str;
            return this;
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder requestOfflineAccess(java.lang.String str, boolean z) {
            zbc(str);
            this.zbb = str;
            this.zbc = true;
            this.zbh = z;
            return this;
        }
    }

    AuthorizationRequest(java.util.List list, java.lang.String str, boolean z, boolean z2, android.accounts.Account account, java.lang.String str2, java.lang.String str3, boolean z3) {
        boolean z4 = false;
        if (list != null && !list.isEmpty()) {
            z4 = true;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z4, "requestedScopes cannot be null or empty");
        this.zba = list;
        this.zbb = str;
        this.zbc = z;
        this.zbd = z2;
        this.zbe = account;
        this.zbf = str2;
        this.zbg = str3;
        this.zbh = z3;
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder builder() {
        return new com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder();
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder zba(com.google.android.gms.auth.api.identity.AuthorizationRequest authorizationRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(authorizationRequest);
        com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder builder = builder();
        builder.setRequestedScopes(authorizationRequest.getRequestedScopes());
        boolean isForceCodeForRefreshToken = authorizationRequest.isForceCodeForRefreshToken();
        java.lang.String hostedDomain = authorizationRequest.getHostedDomain();
        android.accounts.Account account = authorizationRequest.getAccount();
        java.lang.String serverClientId = authorizationRequest.getServerClientId();
        java.lang.String str = authorizationRequest.zbg;
        if (str != null) {
            builder.zbb(str);
        }
        if (hostedDomain != null) {
            builder.filterByHostedDomain(hostedDomain);
        }
        if (account != null) {
            builder.setAccount(account);
        }
        if (authorizationRequest.zbd && serverClientId != null) {
            builder.zba(serverClientId);
        }
        if (authorizationRequest.isOfflineAccessRequested() && serverClientId != null) {
            builder.requestOfflineAccess(serverClientId, isForceCodeForRefreshToken);
        }
        return builder;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.AuthorizationRequest)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.AuthorizationRequest authorizationRequest = (com.google.android.gms.auth.api.identity.AuthorizationRequest) obj;
        return this.zba.size() == authorizationRequest.zba.size() && this.zba.containsAll(authorizationRequest.zba) && this.zbc == authorizationRequest.zbc && this.zbh == authorizationRequest.zbh && this.zbd == authorizationRequest.zbd && com.google.android.gms.common.internal.Objects.equal(this.zbb, authorizationRequest.zbb) && com.google.android.gms.common.internal.Objects.equal(this.zbe, authorizationRequest.zbe) && com.google.android.gms.common.internal.Objects.equal(this.zbf, authorizationRequest.zbf) && com.google.android.gms.common.internal.Objects.equal(this.zbg, authorizationRequest.zbg);
    }

    public android.accounts.Account getAccount() {
        return this.zbe;
    }

    public java.lang.String getHostedDomain() {
        return this.zbf;
    }

    public java.util.List<com.google.android.gms.common.api.Scope> getRequestedScopes() {
        return this.zba;
    }

    public java.lang.String getServerClientId() {
        return this.zbb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb, java.lang.Boolean.valueOf(this.zbc), java.lang.Boolean.valueOf(this.zbh), java.lang.Boolean.valueOf(this.zbd), this.zbe, this.zbf, this.zbg);
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zbh;
    }

    public boolean isOfflineAccessRequested() {
        return this.zbc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getRequestedScopes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, isOfflineAccessRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zbd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, getAccount(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getHostedDomain(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zbg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, isForceCodeForRefreshToken());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
