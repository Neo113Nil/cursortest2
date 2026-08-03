package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class DefaultResponseParser {

    public static class Response {
        public final java.lang.String mStatus;

        public Response(java.lang.String str) {
            this.mStatus = str;
        }

        public java.lang.String toString() {
            return B1.a.j(new java.lang.StringBuilder("Response{mStatus='"), this.mStatus, "'}");
        }
    }

    public io.appmetrica.analytics.networktasks.internal.DefaultResponseParser.Response parse(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    return new io.appmetrica.analytics.networktasks.internal.DefaultResponseParser.Response(new org.json.JSONObject(new java.lang.String(bArr, "UTF-8")).optString("status"));
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }
}
