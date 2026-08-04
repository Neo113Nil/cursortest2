package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.webkit.WebView;
import io.sentry.SentryBaseEvent;
import java.util.HashMap;
import java.util.Map;
import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public class HitTestResult {
    private String extra;
    private int type;

    public HitTestResult(int i7, String str) {
        this.type = i7;
        this.extra = str;
    }

    public static HitTestResult fromWebViewHitTestResult(WebView.HitTestResult hitTestResult) {
        if (hitTestResult == null) {
            return null;
        }
        return new HitTestResult(hitTestResult.getType(), hitTestResult.getExtra());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HitTestResult hitTestResult = (HitTestResult) obj;
        if (this.type != hitTestResult.type) {
            return false;
        }
        String str = this.extra;
        String str2 = hitTestResult.extra;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int i7 = this.type * 31;
        String str = this.extra;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setType(int i7) {
        this.type = i7;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(this.type));
        map.put(SentryBaseEvent.JsonKeys.EXTRA, this.extra);
        return map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HitTestResultMap{type=");
        sb.append(this.type);
        sb.append(", extra='");
        return k.i(sb, this.extra, "'}");
    }
}
