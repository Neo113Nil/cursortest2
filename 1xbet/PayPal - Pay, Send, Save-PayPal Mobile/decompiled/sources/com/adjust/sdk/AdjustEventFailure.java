package com.adjust.sdk;

/* loaded from: classes7.dex */
public class AdjustEventFailure {
    public java.lang.String adid;
    public java.lang.String callbackId;
    public java.lang.String eventToken;
    public org.json.JSONObject jsonResponse;
    public java.lang.String message;
    public java.lang.String timestamp;
    public boolean willRetry;

    public java.lang.String toString() {
        java.lang.String str = this.message;
        java.lang.String str2 = this.timestamp;
        java.lang.String str3 = this.adid;
        java.lang.String str4 = this.eventToken;
        java.lang.String str5 = this.callbackId;
        boolean z = this.willRetry;
        return com.adjust.sdk.Util.formatString("Event Failure msg:%s time:%s adid:%s event:%s cid:%s retry:%b json:%s", str, str2, str3, str4, str5, java.lang.Boolean.valueOf(z), this.jsonResponse);
    }
}
