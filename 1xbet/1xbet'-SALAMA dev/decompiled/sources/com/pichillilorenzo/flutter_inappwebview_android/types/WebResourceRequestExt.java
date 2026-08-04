package com.pichillilorenzo.flutter_inappwebview_android.types;

import R0.d;
import S0.w;
import android.webkit.WebResourceRequest;
import io.sentry.protocol.Request;
import java.util.HashMap;
import java.util.Map;
import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public class WebResourceRequestExt {
    private boolean hasGesture;
    private Map<String, String> headers;
    private boolean isForMainFrame;
    private boolean isRedirect;
    private String method;
    private String url;

    public WebResourceRequestExt(String str, Map<String, String> map, boolean z4, boolean z7, boolean z8, String str2) {
        this.url = str;
        this.headers = map;
        this.isRedirect = z4;
        this.hasGesture = z7;
        this.isForMainFrame = z8;
        this.method = str2;
    }

    public static WebResourceRequestExt fromWebResourceRequest(WebResourceRequest webResourceRequest) {
        boolean zIsRedirect;
        if (d.a("WEB_RESOURCE_REQUEST_IS_REDIRECT")) {
            w.f6297m.getClass();
            zIsRedirect = webResourceRequest.isRedirect();
        } else {
            zIsRedirect = webResourceRequest.isRedirect();
        }
        return new WebResourceRequestExt(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders(), zIsRedirect, webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame(), webResourceRequest.getMethod());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebResourceRequestExt webResourceRequestExt = (WebResourceRequestExt) obj;
        if (this.isRedirect != webResourceRequestExt.isRedirect || this.hasGesture != webResourceRequestExt.hasGesture || this.isForMainFrame != webResourceRequestExt.isForMainFrame || !this.url.equals(webResourceRequestExt.url)) {
            return false;
        }
        Map<String, String> map = this.headers;
        if (map == null ? webResourceRequestExt.headers != null : !map.equals(webResourceRequestExt.headers)) {
            return false;
        }
        String str = this.method;
        String str2 = webResourceRequestExt.method;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        Map<String, String> map = this.headers;
        int iHashCode2 = (((((((iHashCode + (map != null ? map.hashCode() : 0)) * 31) + (this.isRedirect ? 1 : 0)) * 31) + (this.hasGesture ? 1 : 0)) * 31) + (this.isForMainFrame ? 1 : 0)) * 31;
        String str = this.method;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public boolean isForMainFrame() {
        return this.isForMainFrame;
    }

    public boolean isHasGesture() {
        return this.hasGesture;
    }

    public boolean isRedirect() {
        return this.isRedirect;
    }

    public void setForMainFrame(boolean z4) {
        this.isForMainFrame = z4;
    }

    public void setHasGesture(boolean z4) {
        this.hasGesture = z4;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRedirect(boolean z4) {
        this.isRedirect = z4;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("url", this.url);
        map.put("headers", this.headers);
        map.put("isRedirect", Boolean.valueOf(this.isRedirect));
        map.put("hasGesture", Boolean.valueOf(this.hasGesture));
        map.put("isForMainFrame", Boolean.valueOf(this.isForMainFrame));
        map.put(Request.JsonKeys.METHOD, this.method);
        return map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebResourceRequestExt{url=");
        sb.append(this.url);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", isRedirect=");
        sb.append(this.isRedirect);
        sb.append(", hasGesture=");
        sb.append(this.hasGesture);
        sb.append(", isForMainFrame=");
        sb.append(this.isForMainFrame);
        sb.append(", method='");
        return k.i(sb, this.method, "'}");
    }
}
