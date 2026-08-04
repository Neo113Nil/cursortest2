package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;
import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyRuleExt {
    private String schemeFilter;
    private String url;

    public ProxyRuleExt(String str, String str2) {
        this.schemeFilter = str;
        this.url = str2;
    }

    public static ProxyRuleExt fromMap(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return new ProxyRuleExt(map.get("schemeFilter"), map.get("url"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyRuleExt proxyRuleExt = (ProxyRuleExt) obj;
        String str = this.schemeFilter;
        if (str == null ? proxyRuleExt.schemeFilter == null : str.equals(proxyRuleExt.schemeFilter)) {
            return this.url.equals(proxyRuleExt.url);
        }
        return false;
    }

    public String getSchemeFilter() {
        return this.schemeFilter;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.schemeFilter;
        return this.url.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public void setSchemeFilter(String str) {
        this.schemeFilter = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Map<String, String> toMap() {
        HashMap map = new HashMap();
        map.put("url", this.url);
        map.put("schemeFilter", this.schemeFilter);
        return map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProxyRuleExt{schemeFilter='");
        sb.append(this.schemeFilter);
        sb.append("', url='");
        return k.i(sb, this.url, "'}");
    }
}
