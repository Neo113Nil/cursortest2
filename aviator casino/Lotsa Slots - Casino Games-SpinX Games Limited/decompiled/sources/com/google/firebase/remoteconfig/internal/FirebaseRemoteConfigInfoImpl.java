package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigInfoImpl implements com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo {
    private final com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings configSettings;
    private final int lastFetchStatus;
    private final long lastSuccessfulFetchTimeInMillis;

    private FirebaseRemoteConfigInfoImpl(long j, int i, com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.lastSuccessfulFetchTimeInMillis = j;
        this.lastFetchStatus = i;
        this.configSettings = firebaseRemoteConfigSettings;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public long getFetchTimeMillis() {
        return this.lastSuccessfulFetchTimeInMillis;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public int getLastFetchStatus() {
        return this.lastFetchStatus;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    public static class Builder {
        private com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings builderConfigSettings;
        private int builderLastFetchStatus;
        private long builderLastSuccessfulFetchTimeInMillis;

        private Builder() {
        }

        public com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl.Builder withLastSuccessfulFetchTimeInMillis(long j) {
            this.builderLastSuccessfulFetchTimeInMillis = j;
            return this;
        }

        com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl.Builder withLastFetchStatus(int i) {
            this.builderLastFetchStatus = i;
            return this;
        }

        com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl.Builder withConfigSettings(com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
            this.builderConfigSettings = firebaseRemoteConfigSettings;
            return this;
        }

        public com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl build() {
            return new com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl(this.builderLastSuccessfulFetchTimeInMillis, this.builderLastFetchStatus, this.builderConfigSettings);
        }
    }

    static com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl.Builder newBuilder() {
        return new com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl.Builder();
    }
}
