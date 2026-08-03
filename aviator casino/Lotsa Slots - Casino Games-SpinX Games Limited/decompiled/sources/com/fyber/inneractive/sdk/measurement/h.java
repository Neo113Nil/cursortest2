package com.fyber.inneractive.sdk.measurement;

/* loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.response.i {

    /* renamed from: a, reason: collision with root package name */
    public java.net.URL f3789a;
    public java.lang.String b;
    public java.lang.String d;
    public java.lang.String e;
    public java.lang.String f;
    public final java.util.HashMap c = new java.util.HashMap();
    public boolean g = false;

    public final void a(com.fyber.inneractive.sdk.model.vast.x xVar, java.lang.String str) {
        java.util.List list = (java.util.List) this.c.get(xVar);
        if (list == null) {
            list = new java.util.ArrayList();
            this.c.put(xVar, list);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }

    public final boolean b() {
        java.lang.String str;
        return this.g && this.f3789a != null && ((str = this.b) == null || (!android.text.TextUtils.isEmpty(str) && this.b.equalsIgnoreCase("omid")));
    }

    public final java.lang.String toString() {
        return "Verification{mJavaScriptResource=" + this.f3789a + ", mTrackingEvents=" + this.c + ", mVerificationParameters='" + this.d + "', mVendor='" + this.e + "'}";
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final java.util.List a(com.fyber.inneractive.sdk.model.vast.x xVar) {
        java.util.HashMap hashMap;
        if (xVar == null || (hashMap = this.c) == null) {
            return null;
        }
        return (java.util.List) hashMap.get(xVar);
    }

    public final java.lang.String a() {
        if (!this.g) {
            return "JavaScriptResource = ";
        }
        if (android.text.TextUtils.isEmpty(this.b)) {
            return "apiFramework = ";
        }
        if (!this.b.equalsIgnoreCase("omid")) {
            return "apiFramework = " + this.b;
        }
        return "JavaScriptResource_url = " + (android.text.TextUtils.isEmpty(this.f) ? "" : this.f);
    }
}
