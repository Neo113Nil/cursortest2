package com.adjust.sdk;

/* loaded from: classes2.dex */
public class AdjustSessionSuccess {
    public java.lang.String adid;
    public org.json.JSONObject jsonResponse;
    public java.lang.String message;
    public java.lang.String timestamp;

    public java.lang.String toString() {
        return com.adjust.sdk.Util.formatString("Session Success msg:%s time:%s adid:%s json:%s", this.message, this.timestamp, this.adid, this.jsonResponse);
    }
}
