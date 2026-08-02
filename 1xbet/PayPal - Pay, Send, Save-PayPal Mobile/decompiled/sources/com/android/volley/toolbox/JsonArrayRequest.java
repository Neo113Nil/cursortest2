package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public class JsonArrayRequest extends com.android.volley.toolbox.JsonRequest<org.json.JSONArray> {
    public JsonArrayRequest(java.lang.String str, com.android.volley.Response.Listener<org.json.JSONArray> listener, com.android.volley.Response.ErrorListener errorListener) {
        super(0, str, null, listener, errorListener);
    }

    public JsonArrayRequest(int i, java.lang.String str, org.json.JSONArray jSONArray, com.android.volley.Response.Listener<org.json.JSONArray> listener, com.android.volley.Response.ErrorListener errorListener) {
        super(i, str, jSONArray != null ? jSONArray.toString() : null, listener, errorListener);
    }

    @Override // com.android.volley.toolbox.JsonRequest, com.android.volley.Request
    public com.android.volley.Response<org.json.JSONArray> parseNetworkResponse(com.android.volley.NetworkResponse networkResponse) {
        try {
            return com.android.volley.Response.success(new org.json.JSONArray(new java.lang.String(networkResponse.data, com.android.volley.toolbox.HttpHeaderParser.parseCharset(networkResponse.headers, "utf-8"))), com.android.volley.toolbox.HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (java.io.UnsupportedEncodingException e) {
            return com.android.volley.Response.error(new com.android.volley.ParseError(e));
        } catch (org.json.JSONException e2) {
            return com.android.volley.Response.error(new com.android.volley.ParseError(e2));
        }
    }
}
