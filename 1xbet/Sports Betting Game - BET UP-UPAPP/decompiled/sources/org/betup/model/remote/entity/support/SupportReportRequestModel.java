package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class SupportReportRequestModel {

    @SerializedName("deviceInfo")
    private String deviceInfo;

    @SerializedName("email")
    private String email;

    @SerializedName("message")
    private String message;

    @SerializedName("type")
    private String type;

    public SupportReportRequestModel(String type, String message, String email, String deviceInfo) {
        this.type = type;
        this.message = message;
        this.email = email;
        this.deviceInfo = deviceInfo;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }
}
