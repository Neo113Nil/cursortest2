package com.ironsource.adqualitysdk.sdk;

/* loaded from: classes5.dex */
public class ISAdQualityConfig {

    /* renamed from: ﮌ, reason: contains not printable characters */
    private final java.util.Map<java.lang.String, java.lang.String> f38;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private final boolean f39;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final java.lang.String f40;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private final boolean f41;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType f42;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel f43;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final boolean f44;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final java.util.Set<com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener> f45;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final java.lang.String f46;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final boolean f47;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final boolean f48;

    /* synthetic */ ISAdQualityConfig(java.lang.String str, boolean z, boolean z2, boolean z3, com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel iSAdQualityLogLevel, java.util.Set set, java.lang.String str2, boolean z4, boolean z5, com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType iSAdQualityDeviceIdType, java.util.Map map, byte b) {
        this(str, z, z2, z3, iSAdQualityLogLevel, set, str2, z4, z5, iSAdQualityDeviceIdType, map);
    }

    private ISAdQualityConfig(java.lang.String str, boolean z, boolean z2, boolean z3, com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel iSAdQualityLogLevel, java.util.Set<com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener> set, java.lang.String str2, boolean z4, boolean z5, com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType iSAdQualityDeviceIdType, java.util.Map<java.lang.String, java.lang.String> map) {
        this.f46 = str;
        this.f48 = z;
        this.f47 = z2;
        this.f44 = z3;
        this.f43 = iSAdQualityLogLevel;
        this.f45 = set;
        this.f40 = str2;
        this.f39 = z4;
        this.f41 = z5;
        this.f42 = iSAdQualityDeviceIdType;
        this.f38 = map;
    }

    public static com.ironsource.adqualitysdk.sdk.ISAdQualityConfig merge(com.ironsource.adqualitysdk.sdk.ISAdQualityConfig iSAdQualityConfig, com.ironsource.adqualitysdk.sdk.ISAdQualityConfig iSAdQualityConfig2) {
        com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder builder = new com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder();
        if (iSAdQualityConfig.f48) {
            builder.setUserId(iSAdQualityConfig.f46);
        } else if (iSAdQualityConfig2.f48) {
            builder.setUserId(iSAdQualityConfig2.f46);
        }
        if (iSAdQualityConfig.f44) {
            builder.setTestMode(iSAdQualityConfig.f47);
        } else if (iSAdQualityConfig2.f44) {
            builder.setTestMode(iSAdQualityConfig2.f47);
        }
        if (iSAdQualityConfig.f41) {
            builder.setCoppa(iSAdQualityConfig.f39);
        } else if (iSAdQualityConfig2.f41) {
            builder.setCoppa(iSAdQualityConfig2.f39);
        }
        com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f43;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f43;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        java.util.Iterator<com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener> it = iSAdQualityConfig.f45.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener(it.next());
        }
        java.util.Iterator<com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener> it2 = iSAdQualityConfig2.f45.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener(it2.next());
        }
        java.lang.String str = iSAdQualityConfig.f40;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            java.lang.String str2 = iSAdQualityConfig2.f40;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f42;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f42;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        java.util.HashMap hashMap = new java.util.HashMap(iSAdQualityConfig2.f38);
        hashMap.putAll(iSAdQualityConfig.f38);
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            builder.setMetaData((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        return builder.build();
    }

    public java.lang.String getUserId() {
        return this.f46;
    }

    public boolean isUserIdSet() {
        return this.f48;
    }

    public boolean isTestMode() {
        return this.f47;
    }

    public com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel getLogLevel() {
        return this.f43;
    }

    public java.util.Set<com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f45;
    }

    public java.lang.String getInitializationSource() {
        return this.f40;
    }

    public boolean getCoppa() {
        return this.f39;
    }

    public com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f42;
    }

    public java.util.Map<java.lang.String, java.lang.String> getMetaData() {
        return this.f38;
    }

    public static class Builder {

        /* renamed from: ｋ, reason: contains not printable characters */
        private java.lang.String f57 = null;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean f56 = false;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f59 = false;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private boolean f55 = false;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel f58 = com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.INFO;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private final java.util.Set<com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener> f51 = new java.util.HashSet();

        /* renamed from: ﱡ, reason: contains not printable characters */
        private java.lang.String f52 = null;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private boolean f53 = false;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private boolean f50 = false;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType f54 = com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType.NONE;

        /* renamed from: ﭖ, reason: contains not printable characters */
        private final java.util.Map<java.lang.String, java.lang.String> f49 = new java.util.HashMap();

        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setUserId(java.lang.String str) {
            this.f57 = str;
            this.f56 = true;
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setTestMode(boolean z) {
            this.f59 = z;
            this.f55 = true;
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setLogLevel(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f58 = iSAdQualityLogLevel;
            return this;
        }

        @java.lang.Deprecated
        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder addAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener iSAdQualityInitListener) {
            this.f51.add(iSAdQualityInitListener);
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder removeAdQualityInitListener(com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener iSAdQualityInitListener) {
            this.f51.remove(iSAdQualityInitListener);
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setInitializationSource(java.lang.String str) {
            if (com.ironsource.adqualitysdk.sdk.i.kn.m8474(str, 20)) {
                this.f52 = str;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("setInitializationSource( ");
                sb.append(str);
                sb.append(" ) init source must have length of 1-20");
                com.ironsource.adqualitysdk.sdk.i.m.m8520("ISAdQualityConfig", sb.toString());
            }
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setCoppa(boolean z) {
            this.f53 = z;
            this.f50 = true;
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setDeviceIdType(com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f54 = iSAdQualityDeviceIdType;
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setMetaData(org.json.JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i = 0; i < jSONObject.names().length(); i++) {
                    try {
                        java.lang.String string = jSONObject.names().getString(i);
                        java.lang.Object opt = jSONObject.opt(string);
                        if (opt instanceof java.lang.String) {
                            setMetaData(string, (java.lang.String) opt);
                        } else {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("setMetaData( ");
                            sb.append(string);
                            sb.append(" , ");
                            sb.append(opt);
                            sb.append(" ) value must be a string");
                            com.ironsource.adqualitysdk.sdk.i.m.m8520("ISAdQualityConfig", sb.toString());
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder setMetaData(java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str2)) {
                return this;
            }
            if (!com.ironsource.adqualitysdk.sdk.i.am.m6005(str)) {
                if (com.ironsource.adqualitysdk.sdk.i.am.m6009(this.f49, str)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("setMetaData( ");
                    sb.append(str);
                    sb.append(" , ");
                    sb.append(str2);
                    sb.append(" ) limited to 5 meta data values. Ignoring meta data value.");
                    com.ironsource.adqualitysdk.sdk.i.m.m8520("ISAdQualityConfig", sb.toString());
                    return this;
                }
                if (!com.ironsource.adqualitysdk.sdk.i.am.m6008(str, str2)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("setMetaData( ");
                    sb2.append(str);
                    sb2.append(" , ");
                    sb2.append(str2);
                    sb2.append(" ) the length of both the key and the value should be between 1 and 64 characters.");
                    com.ironsource.adqualitysdk.sdk.i.m.m8520("ISAdQualityConfig", sb2.toString());
                    return this;
                }
            }
            this.f49.put(str, str2);
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityConfig build() {
            return new com.ironsource.adqualitysdk.sdk.ISAdQualityConfig(this.f57, this.f56, this.f59, this.f55, this.f58, this.f51, this.f52, this.f53, this.f50, this.f54, this.f49, (byte) 0);
        }
    }
}
