package com.google.firebase.installations.remote;

/* loaded from: classes4.dex */
final class AutoValue_InstallationResponse extends com.google.firebase.installations.remote.InstallationResponse {
    private final com.google.firebase.installations.remote.TokenResult authToken;
    private final java.lang.String fid;
    private final java.lang.String refreshToken;
    private final com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode;
    private final java.lang.String uri;

    private AutoValue_InstallationResponse(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.firebase.installations.remote.TokenResult tokenResult, com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode) {
        this.uri = str;
        this.fid = str2;
        this.refreshToken = str3;
        this.authToken = tokenResult;
        this.responseCode = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final java.lang.String getUri() {
        return this.uri;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final java.lang.String getFid() {
        return this.fid;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final java.lang.String getRefreshToken() {
        return this.refreshToken;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final com.google.firebase.installations.remote.TokenResult getAuthToken() {
        return this.authToken;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final com.google.firebase.installations.remote.InstallationResponse.ResponseCode getResponseCode() {
        return this.responseCode;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstallationResponse{uri=");
        sb.append(this.uri);
        sb.append(", fid=");
        sb.append(this.fid);
        sb.append(", refreshToken=");
        sb.append(this.refreshToken);
        sb.append(", authToken=");
        sb.append(this.authToken);
        sb.append(", responseCode=");
        sb.append(this.responseCode);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.installations.remote.InstallationResponse)) {
            return false;
        }
        com.google.firebase.installations.remote.InstallationResponse installationResponse = (com.google.firebase.installations.remote.InstallationResponse) obj;
        java.lang.String str = this.uri;
        if (str == null) {
            if (installationResponse.getUri() != null) {
                return false;
            }
        } else if (!str.equals(installationResponse.getUri())) {
            return false;
        }
        java.lang.String str2 = this.fid;
        if (str2 == null) {
            if (installationResponse.getFid() != null) {
                return false;
            }
        } else if (!str2.equals(installationResponse.getFid())) {
            return false;
        }
        java.lang.String str3 = this.refreshToken;
        if (str3 == null) {
            if (installationResponse.getRefreshToken() != null) {
                return false;
            }
        } else if (!str3.equals(installationResponse.getRefreshToken())) {
            return false;
        }
        com.google.firebase.installations.remote.TokenResult tokenResult = this.authToken;
        if (tokenResult == null) {
            if (installationResponse.getAuthToken() != null) {
                return false;
            }
        } else if (!tokenResult.equals(installationResponse.getAuthToken())) {
            return false;
        }
        com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode = this.responseCode;
        if (responseCode == null) {
            if (installationResponse.getResponseCode() != null) {
                return false;
            }
        } else if (!responseCode.equals(installationResponse.getResponseCode())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        java.lang.String str = this.uri;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.fid;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.refreshToken;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        com.google.firebase.installations.remote.TokenResult tokenResult = this.authToken;
        int hashCode4 = tokenResult == null ? 0 : tokenResult.hashCode();
        com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode = this.responseCode;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final com.google.firebase.installations.remote.InstallationResponse.Builder toBuilder() {
        return new com.google.firebase.installations.remote.AutoValue_InstallationResponse.Builder(this);
    }

    static final class Builder extends com.google.firebase.installations.remote.InstallationResponse.Builder {
        private com.google.firebase.installations.remote.TokenResult authToken;
        private java.lang.String fid;
        private java.lang.String refreshToken;
        private com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode;
        private java.lang.String uri;

        Builder() {
        }

        private Builder(com.google.firebase.installations.remote.InstallationResponse installationResponse) {
            this.uri = installationResponse.getUri();
            this.fid = installationResponse.getFid();
            this.refreshToken = installationResponse.getRefreshToken();
            this.authToken = installationResponse.getAuthToken();
            this.responseCode = installationResponse.getResponseCode();
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final com.google.firebase.installations.remote.InstallationResponse.Builder setUri(java.lang.String str) {
            this.uri = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final com.google.firebase.installations.remote.InstallationResponse.Builder setFid(java.lang.String str) {
            this.fid = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final com.google.firebase.installations.remote.InstallationResponse.Builder setRefreshToken(java.lang.String str) {
            this.refreshToken = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final com.google.firebase.installations.remote.InstallationResponse.Builder setAuthToken(com.google.firebase.installations.remote.TokenResult tokenResult) {
            this.authToken = tokenResult;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final com.google.firebase.installations.remote.InstallationResponse.Builder setResponseCode(com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final com.google.firebase.installations.remote.InstallationResponse build() {
            return new com.google.firebase.installations.remote.AutoValue_InstallationResponse(this.uri, this.fid, this.refreshToken, this.authToken, this.responseCode);
        }
    }
}
