package my.com.softspace.auditlog.vo;

/* loaded from: classes17.dex */
public class InitFailLogItem {
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private java.lang.String getOutputMinFrameDuration;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private long getOutputSizeshNQ4ISI;
    private java.lang.String getOutputStallDurationlomOqCM;

    private InitFailLogItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighSpeedVideoSizesFor = str3;
        this.getOutputMinFrameDurationlomOqCM = str4;
    }

    private InitFailLogItem() {
    }

    public java.lang.String getDeviceId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getInstanceId() {
        return this.getOutputFormats;
    }

    public java.lang.String getApplicationId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getPlatform() {
        return this.getHighSpeedVideoSizesFor;
    }

    public java.lang.String getUserId() {
        return this.getOutputStallDurationlomOqCM;
    }

    public java.lang.String getVersionId() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public boolean isRootDetected() {
        return this.getOutputSizes;
    }

    public boolean isHookDetected() {
        return this.getInputSizeshNQ4ISI;
    }

    public boolean isEmulatorDetected() {
        return this.getInputFormats;
    }

    public boolean isDebuggingDetected() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getExtraData() {
        return this.getOutputMinFrameDuration;
    }

    public long getTimestamp() {
        return this.getOutputSizeshNQ4ISI;
    }

    public boolean isAdbEnabled() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setAdbEnabled(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    public boolean isDeveloperOptionEnabled() {
        return this.getHighSpeedVideoSizes;
    }

    public void setDeveloperOptionEnabled(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public org.json.JSONObject prepareJSONObject() {
        try {
            return new org.json.JSONObject().put("did", getDeviceId()).putOpt("iid", getInstanceId()).put(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, getApplicationId()).put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, getPlatform()).putOpt("uid", getUserId()).put(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.VISITOR_IDENTIFIER, getVersionId()).put("isRootDetected", isRootDetected()).put("isHookDetected", isHookDetected()).put("isEmulatorDetected", isEmulatorDetected()).put("isDebuggingDetected", isDebuggingDetected()).put("isAdbEnabled", isAdbEnabled()).put("isDeveloperOptionEnabled", isDeveloperOptionEnabled()).putOpt("extraData", getExtraData()).put("timestamp", getTimestamp());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error while serializing InitFailLogItem: ");
            sb.append(e.getMessage());
            sspog.SimpleLogger.e("cpplog-java", sb.toString(), new java.lang.Object[0]);
            return null;
        }
    }

    public static class InitFileLogItemBuilder {
        private my.com.softspace.auditlog.vo.InitFailLogItem getHighResolutionOutputSizeshNQ4ISI;

        public InitFileLogItemBuilder(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.getHighResolutionOutputSizeshNQ4ISI = new my.com.softspace.auditlog.vo.InitFailLogItem(str, str2, str3, str4, (byte) 0);
        }

        public java.lang.String getDeviceId() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getDeviceId();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setDeviceId(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor = str;
            return this;
        }

        public java.lang.String getInstanceId() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getInstanceId();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setInstanceId(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats = str;
            return this;
        }

        public java.lang.String getApplicationId() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getApplicationId();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setApplicationId(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges = str;
            return this;
        }

        public java.lang.String getPlatform() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getPlatform();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setPlatform(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor = str;
            return this;
        }

        public java.lang.String getUserId() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getUserId();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setUserId(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDurationlomOqCM = str;
            return this;
        }

        public java.lang.String getVersionId() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getVersionId();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setVersionId(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDurationlomOqCM = str;
            return this;
        }

        public boolean isRootDetected() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isRootDetected();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setRootDetected(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes = z;
            return this;
        }

        public boolean isHookDetected() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isHookDetected();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setHookDetected(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI = z;
            return this;
        }

        public boolean isEmulatorDetected() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isEmulatorDetected();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setEmulatorDetected(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats = z;
            return this;
        }

        public boolean isDebuggingDetected() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDebuggingDetected();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setDebuggingDetected(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI = z;
            return this;
        }

        public java.lang.String getExtraData() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getExtraData();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setExtraData(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration = str;
            return this;
        }

        public long getTimestamp() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getTimestamp();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setTimestamp(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizeshNQ4ISI = j;
            return this;
        }

        public boolean isAdbEnabled() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isAdbEnabled();
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setAdbEnabled(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI.setAdbEnabled(z);
            return this;
        }

        public boolean isDeveloperOptionEnabled() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder setDeveloperOptionEnabled(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI.setDeveloperOptionEnabled(z);
            return this;
        }

        public my.com.softspace.auditlog.vo.InitFailLogItem build() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getTimestamp() <= 0) {
                this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizeshNQ4ISI = new java.util.Date().getTime();
            }
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    /* synthetic */ InitFailLogItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte b) {
        this(str, str2, str3, str4);
    }
}
