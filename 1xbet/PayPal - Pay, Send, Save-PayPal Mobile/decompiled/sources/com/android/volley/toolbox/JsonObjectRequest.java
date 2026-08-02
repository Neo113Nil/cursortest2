package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public class JsonObjectRequest extends com.android.volley.toolbox.JsonRequest<org.json.JSONObject> {
    public JsonObjectRequest(java.lang.String str, com.android.volley.Response.Listener<org.json.JSONObject> listener, com.android.volley.Response.ErrorListener errorListener) {
        super(0, str, null, listener, errorListener);
    }

    @java.lang.Deprecated
    public JsonObjectRequest(java.lang.String str, org.json.JSONObject jSONObject, com.android.volley.Response.Listener<org.json.JSONObject> listener, com.android.volley.Response.ErrorListener errorListener) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, listener, errorListener);
    }

    public JsonObjectRequest(int i, java.lang.String str, org.json.JSONObject jSONObject, com.android.volley.Response.Listener<org.json.JSONObject> listener, com.android.volley.Response.ErrorListener errorListener) {
        super(i, str, jSONObject != null ? jSONObject.toString() : null, listener, errorListener);
    }

    @Override // com.android.volley.toolbox.JsonRequest, com.android.volley.Request
    public com.android.volley.Response<org.json.JSONObject> parseNetworkResponse(com.android.volley.NetworkResponse networkResponse) {
        try {
            return com.android.volley.Response.success(new org.json.JSONObject(new java.lang.String(networkResponse.data, com.android.volley.toolbox.HttpHeaderParser.parseCharset(networkResponse.headers, "utf-8"))), com.android.volley.toolbox.HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (java.io.UnsupportedEncodingException e) {
            return com.android.volley.Response.error(new com.android.volley.ParseError(e));
        } catch (org.json.JSONException e2) {
            return com.android.volley.Response.error(new com.android.volley.ParseError(e2));
        }
    }
}
