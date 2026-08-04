package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class SafeBrowsingResponse {
    private Integer action;
    private boolean report;

    public SafeBrowsingResponse(boolean z4, Integer num) {
        this.report = z4;
        this.action = num;
    }

    public static SafeBrowsingResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new SafeBrowsingResponse(((Boolean) map.get("report")).booleanValue(), (Integer) map.get("action"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SafeBrowsingResponse safeBrowsingResponse = (SafeBrowsingResponse) obj;
        if (this.report != safeBrowsingResponse.report) {
            return false;
        }
        Integer num = this.action;
        Integer num2 = safeBrowsingResponse.action;
        if (num != null) {
            return num.equals(num2);
        }
        return num2 == null;
    }

    public Integer getAction() {
        return this.action;
    }

    public int hashCode() {
        int i7 = (this.report ? 1 : 0) * 31;
        Integer num = this.action;
        return i7 + (num != null ? num.hashCode() : 0);
    }

    public boolean isReport() {
        return this.report;
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public void setReport(boolean z4) {
        this.report = z4;
    }

    public String toString() {
        return "SafeBrowsingResponse{report=" + this.report + ", action=" + this.action + '}';
    }
}
