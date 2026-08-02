package com.adjust.sdk;

/* loaded from: classes7.dex */
public class AdjustSessionFailure {
    public java.lang.String adid;
    public org.json.JSONObject jsonResponse;
    public java.lang.String message;
    public java.lang.String timestamp;
    public boolean willRetry;

    public java.lang.String toString() {
        java.lang.String str = this.message;
        java.lang.String str2 = this.timestamp;
        java.lang.String str3 = this.adid;
        boolean z = this.willRetry;
        return com.adjust.sdk.Util.formatString("Session Failure msg:%s time:%s adid:%s retry:%b json:%s", str, str2, str3, java.lang.Boolean.valueOf(z), this.jsonResponse);
    }
}
