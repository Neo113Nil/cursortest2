package my.com.softspace.ssfasstapsdk;

/* loaded from: classes17.dex */
public class FasstapSDKConfiguration {
    private boolean isEnableAttestation;
    private boolean isProductionMode;
    private my.com.softspace.ssfasstapsdk.internal.configuration.SDKPogConfiguration pogConfiguration;
    private java.security.SecureRandom secureRandom;

    public java.lang.String getLibAccessKey() {
        return this.pogConfiguration.getAccesskey();
    }

    public java.lang.String getLibSecretKey() {
        return this.pogConfiguration.getSecretkey();
    }

    @java.lang.Deprecated
    public java.lang.String getLibGoogleApiKey() {
        return this.pogConfiguration.getGoogleApiKey();
    }

    public java.lang.String getGooglePlayProjNum() {
        return this.pogConfiguration.getPlayProjectNumber();
    }

    public java.lang.String getAttestationHost() {
        return this.pogConfiguration.getHost();
    }

    public java.lang.Long getAttestationRefreshInterval() {
        return java.lang.Long.valueOf(this.pogConfiguration.getRefreshInterval());
    }

    public java.lang.Long getAttestationHostReadTimeout() {
        return java.lang.Long.valueOf(this.pogConfiguration.getReadTimeout());
    }

    public java.lang.Long getAttestationConnectionTimeout() {
        return java.lang.Long.valueOf(this.pogConfiguration.getConnectTimeout());
    }

    public java.lang.Boolean getAttestationStrictHttp() {
        return this.pogConfiguration.getStrictHttp();
    }

    public java.lang.String getAttestationHostCertPinning() {
        return this.pogConfiguration.getCertificatePinning();
    }

    public java.lang.Long getKeepAliveDuration() {
        return java.lang.Long.valueOf(this.pogConfiguration.getKeepAliveDuration());
    }

    public java.lang.Boolean getEnableAttestation() {
        return java.lang.Boolean.valueOf(this.isEnableAttestation);
    }

    public java.security.SecureRandom getSecureRandom() {
        return this.secureRandom;
    }

    public java.lang.String getKeyLoadingHost() {
        return this.pogConfiguration.getKeyLoadingHost();
    }

    public java.lang.String getKeyLoadingHostCertPinning() {
        return this.pogConfiguration.getKeyLoadingHostCertPinning();
    }

    public java.lang.String getKeyLoadingCACert() {
        return this.pogConfiguration.getKeyLoadingCACert();
    }

    public java.lang.String getClientID() {
        return this.pogConfiguration.getClientID();
    }

    public sspog.SSPOGProperties getPogConfiguration() {
        return this.pogConfiguration;
    }

    public java.lang.Boolean getIsProductionMode() {
        return java.lang.Boolean.valueOf(this.isProductionMode);
    }

    public static class Builder {
        private android.graphics.drawable.Drawable appIconDrawable;
        private java.lang.Long attestationConnectionTimeout;
        private java.lang.String attestationHost;
        private java.lang.String attestationHostCertPinning;
        private java.lang.Long attestationHostReadTimeout;
        private java.lang.Long attestationKeepAliveDuration;
        private java.lang.Long attestationMinRefreshInterval;
        private java.lang.Long attestationRefreshInterval;
        private java.lang.String clientID;
        private java.lang.String foregroundServiceContent;
        private java.lang.String foregroundServiceTitle;
        private java.lang.Boolean isAttestationStrictHttp;
        private java.lang.Boolean isEnableForegroundService;
        private boolean isProductionMode;
        private java.lang.String keyLoadingCACert;
        private java.lang.String keyLoadingHostCertificate;
        private java.lang.String keyloadingHost;
        private java.lang.String libAccessKey;
        private java.lang.String libGoogleApiKey;
        private java.lang.String libGooglePlayProjNum;
        private java.lang.String libSecretKey;
        private java.lang.Boolean isEnableAttestation = java.lang.Boolean.TRUE;
        private java.security.SecureRandom secureRandom = sspog.OpenSSLRandom.getInstance();

        public static my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder create() {
            return new my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder();
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setLibAccessKey(java.lang.String str) {
            this.libAccessKey = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setLibSecretKey(java.lang.String str) {
            this.libSecretKey = str;
            return this;
        }

        @java.lang.Deprecated
        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setLibGoogleApiKey(java.lang.String str) {
            this.libGoogleApiKey = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setLibGooglePlayProjNum(java.lang.String str) {
            this.libGooglePlayProjNum = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setAttestationHost(java.lang.String str) {
            this.attestationHost = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setAttestationMinRefreshInterval(java.lang.Long l) {
            this.attestationMinRefreshInterval = l;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setAttestationRefreshInterval(java.lang.Long l) {
            this.attestationRefreshInterval = l;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setAttestationHostReadTimeout(java.lang.Long l) {
            this.attestationHostReadTimeout = l;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setAttestationConnectionTimeout(java.lang.Long l) {
            this.attestationConnectionTimeout = l;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setAttestationStrictHttp(java.lang.Boolean bool) {
            this.isAttestationStrictHttp = bool;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setAttestationHostCertPinning(java.lang.String str) {
            this.attestationHostCertPinning = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setKeyloadingHost(java.lang.String str) {
            this.keyloadingHost = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setKeyLoadingHostCertPinning(java.lang.String str) {
            this.keyLoadingHostCertificate = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setKeyLoadingCACert(java.lang.String str) {
            this.keyLoadingCACert = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setIsProductionMode(boolean z) {
            this.isProductionMode = z;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setEnableForegroundService(java.lang.Boolean bool) {
            this.isEnableForegroundService = bool;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setForegroundServiceTitle(java.lang.String str) {
            this.foregroundServiceTitle = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setForegroundServiceContent(java.lang.String str) {
            this.foregroundServiceContent = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setAppIconDrawable(android.graphics.drawable.Drawable drawable) {
            this.appIconDrawable = drawable;
            return this;
        }

        @java.lang.Deprecated
        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setEnableAttestation(java.lang.Boolean bool) {
            this.isEnableAttestation = bool;
            return this;
        }

        @java.lang.Deprecated
        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setSharedSecureRandom(java.security.SecureRandom secureRandom) {
            this.secureRandom = secureRandom;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setAttestationKeepAliveDuration(java.lang.Long l) {
            this.attestationKeepAliveDuration = l;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder setClientID(java.lang.String str) {
            this.clientID = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration build() {
            my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration fasstapSDKConfiguration = new my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration();
            if (this.secureRandom == null) {
                throw new java.lang.IllegalArgumentException("Shared Secure Random must not be null");
            }
            fasstapSDKConfiguration.isEnableAttestation = this.isEnableAttestation.booleanValue();
            fasstapSDKConfiguration.secureRandom = this.secureRandom;
            fasstapSDKConfiguration.isProductionMode = this.isProductionMode;
            my.com.softspace.ssfasstapsdk.internal.configuration.SDKPogConfiguration sDKPogConfiguration = new my.com.softspace.ssfasstapsdk.internal.configuration.SDKPogConfiguration();
            if (android.text.TextUtils.isEmpty(this.libAccessKey)) {
                throw new java.lang.IllegalArgumentException("Library access key must not be empty");
            }
            if (android.text.TextUtils.isEmpty(this.libSecretKey)) {
                throw new java.lang.IllegalArgumentException("Library secret key must not be empty");
            }
            sDKPogConfiguration.setAccessKey(this.libAccessKey);
            sDKPogConfiguration.setSecretKey(this.libSecretKey);
            sDKPogConfiguration.setEnableAttestation(this.isEnableAttestation);
            sDKPogConfiguration.setEnableForegroundService(this.isEnableForegroundService);
            sDKPogConfiguration.setForegroundServiceTitle(this.foregroundServiceTitle);
            sDKPogConfiguration.setForegroundServiceContent(this.foregroundServiceContent);
            sDKPogConfiguration.setAppIconDrawable(this.appIconDrawable);
            if (android.text.TextUtils.isEmpty(this.libAccessKey)) {
                throw new java.lang.IllegalArgumentException("Access key must not be empty");
            }
            if (android.text.TextUtils.isEmpty(this.libSecretKey)) {
                throw new java.lang.IllegalArgumentException("Secret key must not be empty");
            }
            if (this.isEnableAttestation.booleanValue()) {
                if (android.text.TextUtils.isEmpty(this.libGooglePlayProjNum)) {
                    throw new java.lang.IllegalArgumentException("Google Play Project Number must not be empty");
                }
                if (android.text.TextUtils.isEmpty(this.attestationHost)) {
                    throw new java.lang.IllegalArgumentException("Attestation host URL must not be empty");
                }
                if (this.isAttestationStrictHttp.booleanValue() && android.text.TextUtils.isEmpty(this.attestationHostCertPinning)) {
                    throw new java.lang.IllegalArgumentException("Attestation host cert pinning must not be empty");
                }
            }
            sDKPogConfiguration.setGoogleApiKey(this.libGoogleApiKey);
            sDKPogConfiguration.setGooglePlayProjNum(this.libGooglePlayProjNum);
            java.lang.Long l = this.attestationHostReadTimeout;
            sDKPogConfiguration.setReadTimeout(l != null ? l.longValue() : 15000L);
            java.lang.Long l2 = this.attestationConnectionTimeout;
            sDKPogConfiguration.setConnectionTimeout(l2 != null ? l2.longValue() : 5000L);
            java.lang.Long l3 = this.attestationMinRefreshInterval;
            sDKPogConfiguration.setMinRefreshInterval(l3 != null ? l3.longValue() : 180000L);
            java.lang.Long l4 = this.attestationRefreshInterval;
            sDKPogConfiguration.setRefreshInterval(l4 != null ? l4.longValue() : 300000L);
            sDKPogConfiguration.setHost(this.attestationHost);
            sDKPogConfiguration.setCertificatePinning(this.attestationHostCertPinning);
            java.lang.Boolean bool = this.isAttestationStrictHttp;
            sDKPogConfiguration.setStrictHttp(java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : true));
            sDKPogConfiguration.setKeyloadingHost(this.keyloadingHost);
            sDKPogConfiguration.setKeyLoadingHostCertPinning(this.keyLoadingHostCertificate);
            sDKPogConfiguration.setKeyLoadingCACert(this.keyLoadingCACert);
            java.lang.Long l5 = this.attestationKeepAliveDuration;
            sDKPogConfiguration.setKeepAliveDuration(l5 != null ? l5.longValue() : 55000L);
            sDKPogConfiguration.setClientID(this.clientID);
            fasstapSDKConfiguration.pogConfiguration = sDKPogConfiguration;
            return fasstapSDKConfiguration;
        }
    }
}
