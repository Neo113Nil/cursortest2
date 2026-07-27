package com.onesignal.user.internal.customEvents.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CustomEventMetadata {
    private static final String APP_VERSION = "app_version";
    public static final Companion Companion = new Companion(null);
    private static final String DEVICE_MODEL = "device_model";
    private static final String DEVICE_OS = "device_os";
    private static final String DEVICE_TYPE = "device_type";
    private static final String SDK = "sdk";
    private static final String TYPE = "type";
    private final String appVersion;
    private final String deviceModel;
    private final String deviceOS;
    private final String deviceType;
    private final String sdk;
    private final String type;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public CustomEventMetadata(String str, String str2, String str3, String str4, String str5, String str6) {
        this.deviceType = str;
        this.sdk = str2;
        this.appVersion = str3;
        this.type = str4;
        this.deviceModel = str5;
        this.deviceOS = str6;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOS() {
        return this.deviceOS;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getType() {
        return this.type;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        JSONObjectExtensionsKt.putSafe(jSONObject, "sdk", this.sdk);
        JSONObjectExtensionsKt.putSafe(jSONObject, APP_VERSION, this.appVersion);
        JSONObjectExtensionsKt.putSafe(jSONObject, "type", this.type);
        JSONObjectExtensionsKt.putSafe(jSONObject, "device_type", this.deviceType);
        JSONObjectExtensionsKt.putSafe(jSONObject, DEVICE_MODEL, this.deviceModel);
        JSONObjectExtensionsKt.putSafe(jSONObject, DEVICE_OS, this.deviceOS);
        return jSONObject;
    }

    public String toString() {
        String jSONObject = toJSONObject().toString();
        i.d(jSONObject, "toString(...)");
        return jSONObject;
    }
}
