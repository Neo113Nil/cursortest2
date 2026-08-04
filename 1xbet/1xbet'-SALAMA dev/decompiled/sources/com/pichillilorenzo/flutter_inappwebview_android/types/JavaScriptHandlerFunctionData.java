package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;
import p031e1.k;
import p150v0.a;

/* JADX INFO: loaded from: classes2.dex */
public class JavaScriptHandlerFunctionData {
    private String args;
    private boolean isMainFrame;
    private String origin;
    private String requestUrl;

    public JavaScriptHandlerFunctionData(String str, String str2, boolean z4, String str3) {
        this.origin = str;
        this.requestUrl = str2;
        this.isMainFrame = z4;
        this.args = str3;
    }

    public static JavaScriptHandlerFunctionData fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new JavaScriptHandlerFunctionData((String) map.get("origin"), (String) map.get("requestUrl"), ((Boolean) map.get("isMainFrame")).booleanValue(), (String) map.get("args"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JavaScriptHandlerFunctionData javaScriptHandlerFunctionData = (JavaScriptHandlerFunctionData) obj;
        return this.isMainFrame == javaScriptHandlerFunctionData.isMainFrame && this.origin.equals(javaScriptHandlerFunctionData.origin) && this.requestUrl.equals(javaScriptHandlerFunctionData.requestUrl) && this.args.equals(javaScriptHandlerFunctionData.args);
    }

    public String getArgs() {
        return this.args;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public int hashCode() {
        return this.args.hashCode() + ((Boolean.hashCode(this.isMainFrame) + a.d(this.origin.hashCode() * 31, 31, this.requestUrl)) * 31);
    }

    public boolean isMainFrame() {
        return this.isMainFrame;
    }

    public void setArgs(String str) {
        this.args = str;
    }

    public void setMainFrame(boolean z4) {
        this.isMainFrame = z4;
    }

    public void setOrigin(String str) {
        this.origin = str;
    }

    public void setRequestUrl(String str) {
        this.requestUrl = str;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("origin", this.origin);
        map.put("requestUrl", this.requestUrl);
        map.put("isMainFrame", Boolean.valueOf(this.isMainFrame));
        map.put("args", this.args);
        return map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JavaScriptHandlerFunctionData{origin='");
        sb.append(this.origin);
        sb.append("', requestUrl='");
        sb.append(this.requestUrl);
        sb.append("', isMainFrame=");
        sb.append(this.isMainFrame);
        sb.append(", args='");
        return k.i(sb, this.args, "'}");
    }
}
