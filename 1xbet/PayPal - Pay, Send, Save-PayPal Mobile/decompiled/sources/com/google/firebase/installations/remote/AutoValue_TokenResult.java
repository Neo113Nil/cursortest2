package com.google.firebase.installations.remote;

/* loaded from: classes4.dex */
final class AutoValue_TokenResult extends com.google.firebase.installations.remote.TokenResult {
    private final com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode;
    private final java.lang.String token;
    private final long tokenExpirationTimestamp;

    private AutoValue_TokenResult(java.lang.String str, long j, com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.responseCode = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final java.lang.String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final com.google.firebase.installations.remote.TokenResult.ResponseCode getResponseCode() {
        return this.responseCode;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenResult{token=");
        sb.append(this.token);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.tokenExpirationTimestamp);
        sb.append(", responseCode=");
        sb.append(this.responseCode);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.installations.remote.TokenResult)) {
            return false;
        }
        com.google.firebase.installations.remote.TokenResult tokenResult = (com.google.firebase.installations.remote.TokenResult) obj;
        java.lang.String str = this.token;
        if (str == null) {
            if (tokenResult.getToken() != null) {
                return false;
            }
        } else if (!str.equals(tokenResult.getToken())) {
            return false;
        }
        if (this.tokenExpirationTimestamp != tokenResult.getTokenExpirationTimestamp()) {
            return false;
        }
        com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode = this.responseCode;
        if (responseCode == null) {
            if (tokenResult.getResponseCode() != null) {
                return false;
            }
        } else if (!responseCode.equals(tokenResult.getResponseCode())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        java.lang.String str = this.token;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.tokenExpirationTimestamp;
        int i = (int) (j ^ (j >>> 32));
        com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode = this.responseCode;
        return ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final com.google.firebase.installations.remote.TokenResult.Builder toBuilder() {
        return new com.google.firebase.installations.remote.AutoValue_TokenResult.Builder(this);
    }

    static final class Builder extends com.google.firebase.installations.remote.TokenResult.Builder {
        private com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode;
        private byte set$0;
        private java.lang.String token;
        private long tokenExpirationTimestamp;

        Builder() {
        }

        private Builder(com.google.firebase.installations.remote.TokenResult tokenResult) {
            this.token = tokenResult.getToken();
            this.tokenExpirationTimestamp = tokenResult.getTokenExpirationTimestamp();
            this.responseCode = tokenResult.getResponseCode();
            this.set$0 = (byte) 1;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public final com.google.firebase.installations.remote.TokenResult.Builder setToken(java.lang.String str) {
            this.token = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public final com.google.firebase.installations.remote.TokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.tokenExpirationTimestamp = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public final com.google.firebase.installations.remote.TokenResult.Builder setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public final com.google.firebase.installations.remote.TokenResult build() {
            if (this.set$0 != 1) {
                throw new java.lang.IllegalStateException("Missing required properties: tokenExpirationTimestamp");
            }
            return new com.google.firebase.installations.remote.AutoValue_TokenResult(this.token, this.tokenExpirationTimestamp, this.responseCode);
        }
    }
}
