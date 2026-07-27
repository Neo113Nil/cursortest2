package com.bykv.vk.openvk.preload.geckox.model;

import android.os.Build;
import com.facebook.internal.NativeProtocol;
import com.ironsource.C4658ta;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class Common {
    public String ac;
    public long aid;
    public String appName;
    public String appVersion;
    public String deviceId;
    public String region;
    public String uid;
    public int os = 0;
    public String osVersion = new StringBuilder().append(Build.VERSION.SDK_INT).toString();
    public String deviceModel = Build.MODEL;
    public String devicePlatform = "android";
    public String sdkVersion = "2.0.3-rc.9-pangle";

    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4658ta.b, this.aid);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put(L6.F, this.os);
            jSONObject.put("device_id", this.deviceId);
            jSONObject.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, this.appName);
            jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, this.ac);
            jSONObject.put("os_version", this.osVersion);
            jSONObject.put("device_model", this.deviceModel);
            jSONObject.put("device_platform", this.devicePlatform);
            jSONObject.put("sdk_version", this.sdkVersion);
            jSONObject.put("region", this.region);
            jSONObject.put("uid", this.uid);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Common() {
    }

    public Common(long j, String str, String str2, String str3, String str4) {
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
    }

    public Common(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
        this.uid = str5;
        this.region = str6;
    }
}
