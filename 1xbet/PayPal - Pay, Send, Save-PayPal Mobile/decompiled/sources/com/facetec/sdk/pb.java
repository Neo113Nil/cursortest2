package com.facetec.sdk;

/* loaded from: classes8.dex */
final class pb extends com.facetec.sdk.pa {
    private java.lang.reflect.Method d;
    private java.lang.reflect.Method e;

    private pb(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
        this.e = method;
        this.d = method2;
    }

    @Override // com.facetec.sdk.pa
    public final void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List<com.facetec.sdk.na> list) {
        try {
            javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            java.util.List<java.lang.String> e = e(list);
            this.e.invoke(sSLParameters, e.toArray(new java.lang.String[e.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
            throw com.facetec.sdk.nh.d("unable to set ssl parameters", (java.lang.Exception) e2);
        }
    }

    @Override // com.facetec.sdk.pa
    @javax.annotation.Nullable
    public final java.lang.String b(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            java.lang.String str = (java.lang.String) this.d.invoke(sSLSocket, new java.lang.Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (java.lang.IllegalAccessException e) {
            throw com.facetec.sdk.nh.d("failed to get ALPN selected protocol", (java.lang.Exception) e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            if (e2.getCause() instanceof java.lang.UnsupportedOperationException) {
                return null;
            }
            throw com.facetec.sdk.nh.d("failed to get ALPN selected protocol", (java.lang.Exception) e2);
        }
    }

    public static com.facetec.sdk.pb a() {
        try {
            return new com.facetec.sdk.pb(javax.net.ssl.SSLParameters.class.getMethod("setApplicationProtocols", java.lang.String[].class), javax.net.ssl.SSLSocket.class.getMethod("getApplicationProtocol", new java.lang.Class[0]));
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }
}
