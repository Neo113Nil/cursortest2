package com.google.firebase.installations;

/* loaded from: classes4.dex */
final class AutoValue_InstallationTokenResult extends com.google.firebase.installations.InstallationTokenResult {
    private final java.lang.String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    private AutoValue_InstallationTokenResult(java.lang.String str, long j, long j2) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.tokenCreationTimestamp = j2;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final java.lang.String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final long getTokenCreationTimestamp() {
        return this.tokenCreationTimestamp;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstallationTokenResult{token=");
        sb.append(this.token);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.tokenExpirationTimestamp);
        sb.append(", tokenCreationTimestamp=");
        sb.append(this.tokenCreationTimestamp);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.installations.InstallationTokenResult)) {
            return false;
        }
        com.google.firebase.installations.InstallationTokenResult installationTokenResult = (com.google.firebase.installations.InstallationTokenResult) obj;
        return this.token.equals(installationTokenResult.getToken()) && this.tokenExpirationTimestamp == installationTokenResult.getTokenExpirationTimestamp() && this.tokenCreationTimestamp == installationTokenResult.getTokenCreationTimestamp();
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode();
        long j = this.tokenExpirationTimestamp;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.tokenCreationTimestamp;
        return ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final com.google.firebase.installations.InstallationTokenResult.Builder toBuilder() {
        return new com.google.firebase.installations.AutoValue_InstallationTokenResult.Builder(this);
    }

    static final class Builder extends com.google.firebase.installations.InstallationTokenResult.Builder {
        private byte set$0;
        private java.lang.String token;
        private long tokenCreationTimestamp;
        private long tokenExpirationTimestamp;

        Builder() {
        }

        private Builder(com.google.firebase.installations.InstallationTokenResult installationTokenResult) {
            this.token = installationTokenResult.getToken();
            this.tokenExpirationTimestamp = installationTokenResult.getTokenExpirationTimestamp();
            this.tokenCreationTimestamp = installationTokenResult.getTokenCreationTimestamp();
            this.set$0 = (byte) 3;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final com.google.firebase.installations.InstallationTokenResult.Builder setToken(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null token");
            }
            this.token = str;
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final com.google.firebase.installations.InstallationTokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.tokenExpirationTimestamp = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final com.google.firebase.installations.InstallationTokenResult.Builder setTokenCreationTimestamp(long j) {
            this.tokenCreationTimestamp = j;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final com.google.firebase.installations.InstallationTokenResult build() {
            java.lang.String str;
            if (this.set$0 != 3 || (str = this.token) == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.token == null) {
                    sb.append(" token");
                }
                if ((this.set$0 & 1) == 0) {
                    sb.append(" tokenExpirationTimestamp");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" tokenCreationTimestamp");
                }
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(sb)));
            }
            return new com.google.firebase.installations.AutoValue_InstallationTokenResult(str, this.tokenExpirationTimestamp, this.tokenCreationTimestamp);
        }
    }
}
