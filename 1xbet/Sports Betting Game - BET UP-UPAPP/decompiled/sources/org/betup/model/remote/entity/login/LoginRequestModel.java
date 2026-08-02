package org.betup.model.remote.entity.login;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class LoginRequestModel {

    @SerializedName("appVersion")
    private String appVersion;

    @SerializedName("country")
    private String country;

    @SerializedName("isNewUser")
    private Boolean isNewUser;

    @SerializedName("language")
    private String language;

    @SerializedName("osType")
    private String osType;

    @SerializedName("timezone")
    private String timezone;

    public LoginRequestModel(String timezone, String language, String appVersion, String country, String osType) {
        this.timezone = timezone;
        this.language = language;
        this.appVersion = appVersion;
        this.country = country;
        this.osType = osType;
    }

    public LoginRequestModel(String timezone, String language, String appVersion, String country, String osType, Boolean isNewUser) {
        this.timezone = timezone;
        this.language = language;
        this.appVersion = appVersion;
        this.country = country;
        this.osType = osType;
        this.isNewUser = isNewUser;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOsType() {
        return this.osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public Boolean getIsNewUser() {
        return this.isNewUser;
    }

    public void setIsNewUser(Boolean isNewUser) {
        this.isNewUser = isNewUser;
    }
}
