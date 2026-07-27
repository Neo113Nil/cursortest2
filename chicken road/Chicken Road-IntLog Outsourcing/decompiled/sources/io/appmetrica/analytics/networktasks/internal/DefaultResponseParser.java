package io.appmetrica.analytics.networktasks.internal;

import b2.AbstractC0279e;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DefaultResponseParser {

    public static class Response {
        public final String mStatus;

        public Response(String str) {
            this.mStatus = str;
        }

        public String toString() {
            return AbstractC0279e.h(new StringBuilder("Response{mStatus='"), this.mStatus, "'}");
        }
    }

    public Response parse(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    return new Response(new JSONObject(new String(bArr, "UTF-8")).optString("status"));
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
