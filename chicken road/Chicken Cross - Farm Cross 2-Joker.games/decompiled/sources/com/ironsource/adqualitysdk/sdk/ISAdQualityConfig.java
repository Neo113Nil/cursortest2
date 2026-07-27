package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0544;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0552;
import com.ironsource.adqualitysdk.sdk.i.AbstractC1191;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes6.dex */
public class ISAdQualityConfig {

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final HashMap f39;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final ISAdQualityDeviceIdType f40;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean f41;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean f42;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String f43;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final ISAdQualityLogLevel f44;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final HashSet f45;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean f46;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean f47;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean f48;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f49;

    public ISAdQualityConfig(String str, boolean z, boolean z2, boolean z3, ISAdQualityLogLevel iSAdQualityLogLevel, HashSet hashSet, String str2, boolean z4, boolean z5, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, HashMap hashMap) {
        this.f49 = str;
        this.f48 = z;
        this.f47 = z2;
        this.f46 = z3;
        this.f44 = iSAdQualityLogLevel;
        this.f45 = hashSet;
        this.f43 = str2;
        this.f42 = z4;
        this.f41 = z5;
        this.f40 = iSAdQualityDeviceIdType;
        this.f39 = hashMap;
    }

    @Deprecated
    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f48) {
            builder.setUserId(iSAdQualityConfig.f49);
        } else if (iSAdQualityConfig2.f48) {
            builder.setUserId(iSAdQualityConfig2.f49);
        }
        if (iSAdQualityConfig.f46) {
            builder.setTestMode(iSAdQualityConfig.f47);
        } else if (iSAdQualityConfig2.f46) {
            builder.setTestMode(iSAdQualityConfig2.f47);
        }
        if (iSAdQualityConfig.f41) {
            builder.setCoppa(iSAdQualityConfig.f42);
        } else if (iSAdQualityConfig2.f41) {
            builder.setCoppa(iSAdQualityConfig2.f42);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f44;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f44;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator it = iSAdQualityConfig.f45.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener((ISAdQualityInitListener) it.next());
        }
        Iterator it2 = iSAdQualityConfig2.f45.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener((ISAdQualityInitListener) it2.next());
        }
        String str = iSAdQualityConfig.f43;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f43;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f40;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f40;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap hashMap = new HashMap(iSAdQualityConfig2.f39);
        hashMap.putAll(iSAdQualityConfig.f39);
        for (Map.Entry entry : hashMap.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    @Deprecated
    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f45;
    }

    @Deprecated
    public boolean getCoppa() {
        return this.f42;
    }

    @Deprecated
    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f40;
    }

    @Deprecated
    public String getInitializationSource() {
        return this.f43;
    }

    @Deprecated
    public ISAdQualityLogLevel getLogLevel() {
        return this.f44;
    }

    @Deprecated
    public Map<String, String> getMetaData() {
        return this.f39;
    }

    @Deprecated
    public String getUserId() {
        return this.f49;
    }

    @Deprecated
    public boolean isTestMode() {
        return this.f47;
    }

    @Deprecated
    public boolean isUserIdSet() {
        return this.f48;
    }

    @Deprecated
    public static class Builder {

        /* renamed from: ﾒ, reason: contains not printable characters */
        public String f60 = null;

        /* renamed from: ﾇ, reason: contains not printable characters */
        public boolean f59 = false;

        /* renamed from: ｋ, reason: contains not printable characters */
        public boolean f58 = false;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public boolean f57 = false;

        /* renamed from: ﻐ, reason: contains not printable characters */
        public ISAdQualityLogLevel f56 = ISAdQualityLogLevel.INFO;

        /* renamed from: ﻏ, reason: contains not printable characters */
        public final HashSet f55 = new HashSet();

        /* renamed from: ﺙ, reason: contains not printable characters */
        public String f54 = null;

        /* renamed from: ﱡ, reason: contains not printable characters */
        public boolean f53 = false;

        /* renamed from: ﱟ, reason: contains not printable characters */
        public boolean f52 = false;

        /* renamed from: ﮐ, reason: contains not printable characters */
        public ISAdQualityDeviceIdType f51 = ISAdQualityDeviceIdType.NONE;

        /* renamed from: ﮌ, reason: contains not printable characters */
        public final HashMap f50 = new HashMap();

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f55.add(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f60, this.f59, this.f58, this.f57, this.f56, this.f55, this.f54, this.f53, this.f52, this.f51, this.f50);
        }

        @Deprecated
        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f55.remove(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        @Deprecated
        public Builder setCoppa(boolean z) {
            this.f53 = z;
            this.f52 = true;
            return this;
        }

        @Deprecated
        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f51 = iSAdQualityDeviceIdType;
            return this;
        }

        @Deprecated
        public Builder setInitializationSource(String str) {
            if (AbstractC1191.m5916(str, 20)) {
                this.f54 = str;
            } else {
                AbstractC0544.m5504("ISAdQualityConfig", "setInitializationSource( " + str + " ) init source must have length of 1-20");
            }
            return this;
        }

        @Deprecated
        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f56 = iSAdQualityLogLevel;
            return this;
        }

        @Deprecated
        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i = 0; i < jSONObject.names().length(); i++) {
                    try {
                        String string = jSONObject.names().getString(i);
                        Object opt = jSONObject.opt(string);
                        if (opt instanceof String) {
                            setMetaData(string, (String) opt);
                        } else {
                            AbstractC0544.m5504("ISAdQualityConfig", "setMetaData( " + string + " , " + opt + " ) value must be a string");
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        @Deprecated
        public Builder setTestMode(boolean z) {
            this.f58 = z;
            this.f57 = true;
            return this;
        }

        @Deprecated
        public Builder setUserId(String str) {
            this.f60 = str;
            this.f59 = true;
            return this;
        }

        @Deprecated
        public Builder setMetaData(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return this;
            }
            if (!AbstractC0552.f1251.contains(str)) {
                if (AbstractC0552.m5520(this.f50, str)) {
                    AbstractC0544.m5504("ISAdQualityConfig", "setMetaData( " + str + " , " + str2 + " ) limited to 5 meta data values. Ignoring meta data value.");
                    return this;
                }
                if (!AbstractC1191.m5916(str, 64) || !AbstractC1191.m5916(str2, 64)) {
                    AbstractC0544.m5504("ISAdQualityConfig", "setMetaData( " + str + " , " + str2 + " ) the length of both the key and the value should be between 1 and 64 characters.");
                    return this;
                }
            }
            this.f50.put(str, str2);
            return this;
        }
    }
}
