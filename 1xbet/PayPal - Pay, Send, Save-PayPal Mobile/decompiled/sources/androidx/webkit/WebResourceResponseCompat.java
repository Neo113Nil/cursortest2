package androidx.webkit;

/* loaded from: classes7.dex */
public class WebResourceResponseCompat {
    private final android.webkit.WebResourceResponse getHighResolutionOutputSizeshNQ4ISI;
    private java.util.List<java.lang.String> getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();

    public static androidx.webkit.WebResourceResponseCompat toWebResourceResponseCompat(android.webkit.WebResourceResponse webResourceResponse) {
        int statusCode = webResourceResponse.getStatusCode();
        java.lang.String reasonPhrase = webResourceResponse.getReasonPhrase();
        if (statusCode < 100) {
            statusCode = 200;
        }
        int i = statusCode;
        if (reasonPhrase == null) {
            reasonPhrase = com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton;
        }
        return new androidx.webkit.WebResourceResponseCompat(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), i, reasonPhrase, webResourceResponse.getResponseHeaders(), webResourceResponse.getData());
    }

    public WebResourceResponseCompat(java.lang.String str, java.lang.String str2, java.io.InputStream inputStream) {
        android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse(str, str2, inputStream);
        this.getHighResolutionOutputSizeshNQ4ISI = webResourceResponse;
        webResourceResponse.setResponseHeaders(java.util.Collections.EMPTY_MAP);
    }

    public WebResourceResponseCompat(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, java.io.InputStream inputStream) {
        this.getHighResolutionOutputSizeshNQ4ISI = new android.webkit.WebResourceResponse(str, str2, i, str3, map == null ? java.util.Collections.EMPTY_MAP : map, inputStream);
    }

    public android.webkit.WebResourceResponse toWebResourceResponse() {
        java.util.HashMap hashMap;
        java.util.Map<java.lang.String, java.lang.String> responseHeaders = this.getHighResolutionOutputSizeshNQ4ISI.getResponseHeaders();
        if (responseHeaders != null) {
            hashMap = new java.util.HashMap(responseHeaders);
        } else {
            hashMap = new java.util.HashMap();
        }
        java.util.HashMap hashMap2 = hashMap;
        if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
            hashMap2.put(org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_HEADER_NAME, getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges));
        }
        int statusCode = this.getHighResolutionOutputSizeshNQ4ISI.getStatusCode();
        java.lang.String reasonPhrase = this.getHighResolutionOutputSizeshNQ4ISI.getReasonPhrase();
        if (statusCode < 100) {
            statusCode = 200;
            reasonPhrase = com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton;
        }
        return new android.webkit.WebResourceResponse(this.getHighResolutionOutputSizeshNQ4ISI.getMimeType(), this.getHighResolutionOutputSizeshNQ4ISI.getEncoding(), statusCode, reasonPhrase, hashMap2, this.getHighResolutionOutputSizeshNQ4ISI.getData());
    }

    public void setMimeType(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI.setMimeType(str);
    }

    public java.lang.String getMimeType() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMimeType();
    }

    public void setEncoding(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI.setEncoding(str);
    }

    public java.lang.String getEncoding() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEncoding();
    }

    public void setStatusCodeAndReasonPhrase(int i, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI.setStatusCodeAndReasonPhrase(i, str);
    }

    public int getStatusCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getStatusCode();
    }

    public java.lang.String getReasonPhrase() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getReasonPhrase();
    }

    public void setResponseHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighResolutionOutputSizeshNQ4ISI.setResponseHeaders(map);
    }

    public java.util.Map<java.lang.String, java.lang.String> getResponseHeaders() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getResponseHeaders();
    }

    public void setData(java.io.InputStream inputStream) {
        this.getHighResolutionOutputSizeshNQ4ISI.setData(inputStream);
    }

    public java.io.InputStream getData() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getData();
    }

    public void setCookies(java.util.List<java.lang.String> list) {
        if (!androidx.webkit.internal.WebViewFeatureInternal.COOKIE_INTERCEPT.isSupportedByWebView()) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.getHighSpeedVideoFpsRanges = list;
    }

    public java.util.List<java.lang.String> getCookies() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private java.lang.String getHighSpeedVideoFpsRangesFor(java.util.List<java.lang.String> list) {
        if (list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : list) {
            if (!androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(str)) {
                if (sb.length() > 0) {
                    sb.append("\u0000");
                }
                sb.append(str.trim());
            }
        }
        return sb.toString();
    }
}
