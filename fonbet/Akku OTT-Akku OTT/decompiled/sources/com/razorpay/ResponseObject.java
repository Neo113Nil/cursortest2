package com.razorpay;

import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class ResponseObject {
    private String __l1_;
    private Map<String, List<String>> _llI;
    private int l$1_I$l$;

    public Map<String, List<String>> getHeaders() {
        return this._llI;
    }

    public int getResponseCode() {
        return this.l$1_I$l$;
    }

    public String getResponseResult() {
        return this.__l1_;
    }

    public void setHeaders(Map<String, List<String>> map) {
        this._llI = map;
    }

    public void setResponseCode(int i) {
        this.l$1_I$l$ = i;
    }

    public void setResponseResult(String str) {
        this.__l1_ = str;
    }
}
