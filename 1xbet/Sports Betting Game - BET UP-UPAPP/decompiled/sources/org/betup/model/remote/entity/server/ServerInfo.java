package org.betup.model.remote.entity.server;

import com.google.gson.annotations.SerializedName;
import io.sentry.Session;

/* loaded from: classes2.dex */
public class ServerInfo {

    @SerializedName("current_timestamp")
    private long currentTimestamp;

    @SerializedName("ip")
    private String ip;

    @SerializedName("lang")
    private String lang;

    @SerializedName(Session.JsonKeys.USER_AGENT)
    private String userAgent;

    public long getCurrentTimestamp() {
        return this.currentTimestamp;
    }

    public void setCurrentTimestamp(long currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
