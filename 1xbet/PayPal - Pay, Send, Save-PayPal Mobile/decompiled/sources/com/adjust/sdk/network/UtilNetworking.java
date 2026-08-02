package com.adjust.sdk.network;

/* loaded from: classes7.dex */
public class UtilNetworking {

    public interface IConnectionOptions {
        void applyConnectionOptions(javax.net.ssl.HttpsURLConnection httpsURLConnection, java.lang.String str, int i);
    }

    public interface IHttpsURLConnectionProvider {
        javax.net.ssl.HttpsURLConnection generateHttpsURLConnection(java.net.URL url);
    }

    public static com.adjust.sdk.network.UtilNetworking.IConnectionOptions createDefaultConnectionOptions() {
        return new com.adjust.sdk.network.UtilNetworking.IConnectionOptions() { // from class: com.adjust.sdk.network.UtilNetworking.1
            @Override // com.adjust.sdk.network.UtilNetworking.IConnectionOptions
            public final void applyConnectionOptions(javax.net.ssl.HttpsURLConnection httpsURLConnection, java.lang.String str, int i) {
                httpsURLConnection.setRequestProperty("Client-SDK", str);
                httpsURLConnection.setConnectTimeout(i);
                httpsURLConnection.setReadTimeout(i);
            }
        };
    }

    public static com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider createDefaultHttpsURLConnectionProvider() {
        return new com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider() { // from class: com.adjust.sdk.network.UtilNetworking.2
            @Override // com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider
            public final javax.net.ssl.HttpsURLConnection generateHttpsURLConnection(java.net.URL url) {
                return (javax.net.ssl.HttpsURLConnection) url.openConnection();
            }
        };
    }

    public static int extractJsonInt(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.Object opt = jSONObject.opt(str);
        if (opt instanceof java.lang.Integer) {
            return ((java.lang.Integer) opt).intValue();
        }
        return -1;
    }

    public static java.lang.Long extractJsonLong(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.Object opt = jSONObject.opt(str);
        if (opt instanceof java.lang.Long) {
            return (java.lang.Long) opt;
        }
        if (opt instanceof java.lang.Number) {
            return java.lang.Long.valueOf(((java.lang.Number) opt).longValue());
        }
        if (!(opt instanceof java.lang.String)) {
            return null;
        }
        try {
            return java.lang.Long.valueOf((long) java.lang.Double.parseDouble((java.lang.String) opt));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static java.lang.String extractJsonString(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.Object opt = jSONObject.opt(str);
        if (opt instanceof java.lang.String) {
            return (java.lang.String) opt;
        }
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    private static com.adjust.sdk.ILogger getLogger() {
        return com.adjust.sdk.AdjustFactory.getLogger();
    }
}
