package com.fyber.inneractive.sdk.model.vast;

/* loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.response.i {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.i f3800a;
    public com.fyber.inneractive.sdk.model.vast.k b;
    public final int c;
    public final int d;
    public final java.lang.String e;
    public java.lang.String f;
    public java.lang.String g;
    public final int h;
    public final java.util.HashMap i = new java.util.HashMap();

    public c(com.fyber.inneractive.sdk.model.vast.i iVar, int i, int i2, java.lang.String str, int i3) {
        this.f3800a = iVar;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.h = i3;
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.x xVar, java.lang.String str) {
        java.util.List list = (java.util.List) this.i.get(xVar);
        if (list == null) {
            list = new java.util.ArrayList();
            this.i.put(xVar, list);
        }
        if (list.contains(str)) {
            return;
        }
        list.add(str);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Companion:  w:");
        sb.append(this.c);
        sb.append(" h:");
        sb.append(this.d);
        sb.append(" type:");
        sb.append(this.f3800a.toString());
        sb.append(" creativeType: ");
        com.fyber.inneractive.sdk.model.vast.k kVar = this.b;
        sb.append(kVar != null ? kVar.mimeType : "none");
        sb.append(" ctr:");
        sb.append(this.g);
        sb.append(" events:");
        sb.append(this.i);
        return sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final java.util.List a(com.fyber.inneractive.sdk.model.vast.x xVar) {
        if (xVar == null || this.i.isEmpty()) {
            return null;
        }
        return (java.util.List) this.i.get(xVar);
    }

    public final org.json.JSONObject a() {
        java.lang.String str;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("w", this.c);
            jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, this.d);
            jSONObject.put("type", this.f3800a.toString());
            com.fyber.inneractive.sdk.model.vast.k kVar = this.b;
            if (kVar != null) {
                str = kVar.mimeType;
            } else {
                str = "none";
            }
            jSONObject.put("creativeType", str);
            jSONObject.put("content", this.f);
        } catch (org.json.JSONException e) {
            com.fyber.inneractive.sdk.util.IAlog.a("Vast Parser: Failed creating Companion json object: %s", e.getMessage());
        }
        return jSONObject;
    }
}
