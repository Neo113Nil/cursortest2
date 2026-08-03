package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigSettings {
    private final long fetchTimeoutInSeconds;
    private final long minimumFetchInterval;

    private FirebaseRemoteConfigSettings(com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder builder) {
        this.fetchTimeoutInSeconds = builder.fetchTimeoutInSeconds;
        this.minimumFetchInterval = builder.minimumFetchInterval;
    }

    public long getFetchTimeoutInSeconds() {
        return this.fetchTimeoutInSeconds;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.minimumFetchInterval;
    }

    public com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder toBuilder() {
        com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder builder = new com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder();
        builder.setFetchTimeoutInSeconds(getFetchTimeoutInSeconds());
        builder.setMinimumFetchIntervalInSeconds(getMinimumFetchIntervalInSeconds());
        return builder;
    }

    public static class Builder {
        private long fetchTimeoutInSeconds = 60;
        private long minimumFetchInterval = com.google.firebase.remoteconfig.internal.ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS;

        public com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder setFetchTimeoutInSeconds(long j) throws java.lang.IllegalArgumentException {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", java.lang.Long.valueOf(j)));
            }
            this.fetchTimeoutInSeconds = j;
            return this;
        }

        public com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder setMinimumFetchIntervalInSeconds(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
            }
            this.minimumFetchInterval = j;
            return this;
        }

        public long getFetchTimeoutInSeconds() {
            return this.fetchTimeoutInSeconds;
        }

        public long getMinimumFetchIntervalInSeconds() {
            return this.minimumFetchInterval;
        }

        public com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings build() {
            return new com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings(this);
        }
    }
}
