package com.google.firebase.installations.local;

/* loaded from: classes4.dex */
final class AutoValue_PersistedInstallationEntry extends com.google.firebase.installations.local.PersistedInstallationEntry {
    private final java.lang.String authToken;
    private final long expiresInSecs;
    private final java.lang.String firebaseInstallationId;
    private final java.lang.String fisError;
    private final java.lang.String refreshToken;
    private final com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus registrationStatus;
    private final long tokenCreationEpochInSecs;

    private AutoValue_PersistedInstallationEntry(java.lang.String str, com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus registrationStatus, java.lang.String str2, java.lang.String str3, long j, long j2, java.lang.String str4) {
        this.firebaseInstallationId = str;
        this.registrationStatus = registrationStatus;
        this.authToken = str2;
        this.refreshToken = str3;
        this.expiresInSecs = j;
        this.tokenCreationEpochInSecs = j2;
        this.fisError = str4;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final java.lang.String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.registrationStatus;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final java.lang.String getAuthToken() {
        return this.authToken;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final java.lang.String getRefreshToken() {
        return this.refreshToken;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long getExpiresInSecs() {
        return this.expiresInSecs;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long getTokenCreationEpochInSecs() {
        return this.tokenCreationEpochInSecs;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final java.lang.String getFisError() {
        return this.fisError;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.firebaseInstallationId);
        sb.append(", registrationStatus=");
        sb.append(this.registrationStatus);
        sb.append(", authToken=");
        sb.append(this.authToken);
        sb.append(", refreshToken=");
        sb.append(this.refreshToken);
        sb.append(", expiresInSecs=");
        sb.append(this.expiresInSecs);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.tokenCreationEpochInSecs);
        sb.append(", fisError=");
        sb.append(this.fisError);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.installations.local.PersistedInstallationEntry)) {
            return false;
        }
        com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry = (com.google.firebase.installations.local.PersistedInstallationEntry) obj;
        java.lang.String str = this.firebaseInstallationId;
        if (str == null) {
            if (persistedInstallationEntry.getFirebaseInstallationId() != null) {
                return false;
            }
        } else if (!str.equals(persistedInstallationEntry.getFirebaseInstallationId())) {
            return false;
        }
        if (!this.registrationStatus.equals(persistedInstallationEntry.getRegistrationStatus())) {
            return false;
        }
        java.lang.String str2 = this.authToken;
        if (str2 == null) {
            if (persistedInstallationEntry.getAuthToken() != null) {
                return false;
            }
        } else if (!str2.equals(persistedInstallationEntry.getAuthToken())) {
            return false;
        }
        java.lang.String str3 = this.refreshToken;
        if (str3 == null) {
            if (persistedInstallationEntry.getRefreshToken() != null) {
                return false;
            }
        } else if (!str3.equals(persistedInstallationEntry.getRefreshToken())) {
            return false;
        }
        if (this.expiresInSecs != persistedInstallationEntry.getExpiresInSecs() || this.tokenCreationEpochInSecs != persistedInstallationEntry.getTokenCreationEpochInSecs()) {
            return false;
        }
        java.lang.String str4 = this.fisError;
        if (str4 == null) {
            if (persistedInstallationEntry.getFisError() != null) {
                return false;
            }
        } else if (!str4.equals(persistedInstallationEntry.getFisError())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        java.lang.String str = this.firebaseInstallationId;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.registrationStatus.hashCode();
        java.lang.String str2 = this.authToken;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.refreshToken;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        long j = this.expiresInSecs;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.tokenCreationEpochInSecs;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        java.lang.String str4 = this.fisError;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final com.google.firebase.installations.local.PersistedInstallationEntry.Builder toBuilder() {
        return new com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry.Builder(this);
    }

    static final class Builder extends com.google.firebase.installations.local.PersistedInstallationEntry.Builder {
        private java.lang.String authToken;
        private long expiresInSecs;
        private java.lang.String firebaseInstallationId;
        private java.lang.String fisError;
        private java.lang.String refreshToken;
        private com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus registrationStatus;
        private byte set$0;
        private long tokenCreationEpochInSecs;

        Builder() {
        }

        private Builder(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
            this.firebaseInstallationId = persistedInstallationEntry.getFirebaseInstallationId();
            this.registrationStatus = persistedInstallationEntry.getRegistrationStatus();
            this.authToken = persistedInstallationEntry.getAuthToken();
            this.refreshToken = persistedInstallationEntry.getRefreshToken();
            this.expiresInSecs = persistedInstallationEntry.getExpiresInSecs();
            this.tokenCreationEpochInSecs = persistedInstallationEntry.getTokenCreationEpochInSecs();
            this.fisError = persistedInstallationEntry.getFisError();
            this.set$0 = (byte) 3;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final com.google.firebase.installations.local.PersistedInstallationEntry.Builder setFirebaseInstallationId(java.lang.String str) {
            this.firebaseInstallationId = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final com.google.firebase.installations.local.PersistedInstallationEntry.Builder setRegistrationStatus(com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new java.lang.NullPointerException("Null registrationStatus");
            }
            this.registrationStatus = registrationStatus;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final com.google.firebase.installations.local.PersistedInstallationEntry.Builder setAuthToken(java.lang.String str) {
            this.authToken = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final com.google.firebase.installations.local.PersistedInstallationEntry.Builder setRefreshToken(java.lang.String str) {
            this.refreshToken = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final com.google.firebase.installations.local.PersistedInstallationEntry.Builder setExpiresInSecs(long j) {
            this.expiresInSecs = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final com.google.firebase.installations.local.PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j) {
            this.tokenCreationEpochInSecs = j;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final com.google.firebase.installations.local.PersistedInstallationEntry.Builder setFisError(java.lang.String str) {
            this.fisError = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final com.google.firebase.installations.local.PersistedInstallationEntry build() {
            if (this.set$0 != 3 || this.registrationStatus == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.registrationStatus == null) {
                    sb.append(" registrationStatus");
                }
                if ((this.set$0 & 1) == 0) {
                    sb.append(" expiresInSecs");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" tokenCreationEpochInSecs");
                }
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(sb)));
            }
            return new com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry(this.firebaseInstallationId, this.registrationStatus, this.authToken, this.refreshToken, this.expiresInSecs, this.tokenCreationEpochInSecs, this.fisError);
        }
    }
}
