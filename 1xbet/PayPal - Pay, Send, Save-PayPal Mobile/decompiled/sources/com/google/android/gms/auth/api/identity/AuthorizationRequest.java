package com.google.android.gms.auth.api.identity;

/* loaded from: classes8.dex */
public class AuthorizationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.AuthorizationRequest> CREATOR = new com.google.android.gms.auth.api.identity.zbb();
    private final java.util.List zba;
    private final java.lang.String zbb;
    private final boolean zbc;
    private final boolean zbd;
    private final android.accounts.Account zbe;
    private final java.lang.String zbf;
    private final java.lang.String zbg;
    private final boolean zbh;
    private final android.os.Bundle zbi;
    private final boolean zbj;
    private final int zbk;

    public static final class Builder {
        private java.util.List zba;
        private java.lang.String zbb;
        private boolean zbc;
        private boolean zbd;
        private android.accounts.Account zbe;
        private java.lang.String zbf;
        private java.lang.String zbg;
        private boolean zbh;
        private android.os.Bundle zbi;
        private boolean zbj;
        private int zbk = 0;

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

        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder addResourceParameter(com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter resourceParameter, java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(resourceParameter, "Resource parameter cannot be null");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Resource parameter value cannot be null");
            if (this.zbi == null) {
                this.zbi = new android.os.Bundle();
            }
            this.zbi.putString(resourceParameter.zba, str);
            return this;
        }

        public final com.google.android.gms.auth.api.identity.AuthorizationRequest build() {
            return new com.google.android.gms.auth.api.identity.AuthorizationRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh, this.zbi, this.zbj, this.zbk);
        }

        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder filterByHostedDomain(java.lang.String str) {
            this.zbf = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            return this;
        }

        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder requestOfflineAccess(java.lang.String str) {
            zbc(str);
            this.zbb = str;
            this.zbc = true;
            this.zbh = false;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder setAccount(android.accounts.Account account) {
            this.zbe = (android.accounts.Account) com.google.android.gms.common.internal.Preconditions.checkNotNull(account);
            return this;
        }

        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder setRequestedScopes(java.util.List<com.google.android.gms.common.api.Scope> list) {
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

        @java.lang.Deprecated
        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder requestOfflineAccess(java.lang.String str, boolean z) {
            zbc(str);
            this.zbb = str;
            this.zbc = true;
            this.zbh = z;
            if (z) {
                setPrompt(1 | this.zbk);
            }
            return this;
        }

        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder zbb(java.lang.String str) {
            this.zbg = str;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder setPrompt(int i) {
            this.zbk = i;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder setOptOutIncludingGrantedScopes(boolean z) {
            this.zbj = z;
            return this;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Prompt {
        public static final int CONSENT = 1;
        public static final int NOT_SET = 0;
        public static final int SELECT_ACCOUNT = 2;
    }

    public enum ResourceParameter {
        ACCOUNT_SELECTION_TOKEN("account_selection_token"),
        ACCOUNT_SELECTION_STATE("account_selection_state"),
        PICKER_ALLOW_MULTIPLE("allow_multiple"),
        PICKER_MIMETYPES("mimetypes"),
        PICKER_FILE_IDS("file_ids"),
        PICKER_OAUTH_TRIGGER("trigger_onepick");

        final java.lang.String zba;

        ResourceParameter(java.lang.String str) {
            this.zba = str;
        }
    }

    AuthorizationRequest(java.util.List list, java.lang.String str, boolean z, boolean z2, android.accounts.Account account, java.lang.String str2, java.lang.String str3, boolean z3, android.os.Bundle bundle, boolean z4, int i) {
        boolean z5 = false;
        if (list != null && !list.isEmpty()) {
            z5 = true;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z5, "requestedScopes cannot be null or empty");
        this.zba = list;
        this.zbb = str;
        this.zbc = z;
        this.zbd = z2;
        this.zbe = account;
        this.zbf = str2;
        this.zbg = str3;
        this.zbh = z3;
        this.zbi = bundle;
        this.zbj = z4;
        this.zbk = i;
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder zba(com.google.android.gms.auth.api.identity.AuthorizationRequest authorizationRequest) {
        com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter resourceParameter;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(authorizationRequest);
        com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder builder = builder();
        builder.setRequestedScopes(authorizationRequest.getRequestedScopes());
        android.os.Bundle resourceParameters = authorizationRequest.getResourceParameters();
        if (resourceParameters != null) {
            for (java.lang.String str : resourceParameters.keySet()) {
                java.lang.String string = resourceParameters.getString(str);
                com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter[] values = com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        resourceParameter = null;
                        break;
                    }
                    resourceParameter = values[i];
                    if (resourceParameter.zba.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (string != null && resourceParameter != null) {
                    builder.addResourceParameter(resourceParameter, string);
                }
            }
        }
        boolean isForceCodeForRefreshToken = authorizationRequest.isForceCodeForRefreshToken();
        java.lang.String str2 = authorizationRequest.zbg;
        java.lang.String hostedDomain = authorizationRequest.getHostedDomain();
        android.accounts.Account account = authorizationRequest.getAccount();
        java.lang.String serverClientId = authorizationRequest.getServerClientId();
        if (str2 != null) {
            builder.zbb(str2);
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
        builder.setOptOutIncludingGrantedScopes(authorizationRequest.zbj);
        builder.setPrompt(authorizationRequest.getPrompt());
        return builder;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.AuthorizationRequest)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.AuthorizationRequest authorizationRequest = (com.google.android.gms.auth.api.identity.AuthorizationRequest) obj;
        java.util.List list = this.zba;
        int size = list.size();
        java.util.List list2 = authorizationRequest.zba;
        if (size == list2.size() && list.containsAll(list2)) {
            android.os.Bundle bundle = authorizationRequest.zbi;
            android.os.Bundle bundle2 = this.zbi;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (java.lang.String str : bundle2.keySet()) {
                        if (!com.google.android.gms.common.internal.Objects.equal(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.zbc == authorizationRequest.zbc && this.zbh == authorizationRequest.zbh && this.zbd == authorizationRequest.zbd && this.zbj == authorizationRequest.zbj && this.zbk == authorizationRequest.zbk && com.google.android.gms.common.internal.Objects.equal(this.zbb, authorizationRequest.zbb) && com.google.android.gms.common.internal.Objects.equal(this.zbe, authorizationRequest.zbe) && com.google.android.gms.common.internal.Objects.equal(this.zbf, authorizationRequest.zbf) && com.google.android.gms.common.internal.Objects.equal(this.zbg, authorizationRequest.zbg)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public java.lang.String getResourceParameter(com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter resourceParameter) {
        android.os.Bundle bundle = this.zbi;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(resourceParameter.zba);
    }

    public int hashCode() {
        java.util.List list = this.zba;
        java.lang.String str = this.zbb;
        boolean z = this.zbc;
        boolean z2 = this.zbh;
        boolean z3 = this.zbd;
        return com.google.android.gms.common.internal.Objects.hashCode(list, str, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(z3), this.zbe, this.zbf, this.zbg, this.zbi, java.lang.Boolean.valueOf(this.zbj), java.lang.Integer.valueOf(this.zbk));
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
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 9, getResourceParameters(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, getOptOutIncludingGrantedScopes());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, getPrompt());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public boolean isOfflineAccessRequested() {
        return this.zbc;
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zbh;
    }

    public java.lang.String getServerClientId() {
        return this.zbb;
    }

    public android.os.Bundle getResourceParameters() {
        return this.zbi;
    }

    public java.util.List<com.google.android.gms.common.api.Scope> getRequestedScopes() {
        return this.zba;
    }

    public int getPrompt() {
        return this.zbk;
    }

    public boolean getOptOutIncludingGrantedScopes() {
        return this.zbj;
    }

    public java.lang.String getHostedDomain() {
        return this.zbf;
    }

    public android.accounts.Account getAccount() {
        return this.zbe;
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder builder() {
        return new com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder();
    }
}
