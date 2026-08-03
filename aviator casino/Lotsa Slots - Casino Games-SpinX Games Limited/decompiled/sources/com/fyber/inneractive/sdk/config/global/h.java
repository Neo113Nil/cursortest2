package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.config.global.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f3605a = new java.util.HashSet();
    public final boolean b;

    public h(org.json.JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                java.lang.String optString = jSONArray.optString(i);
                if (!android.text.TextUtils.isEmpty(optString)) {
                    this.f3605a.add(optString);
                }
            }
        }
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(com.fyber.inneractive.sdk.config.global.e eVar) {
        if (this.f3605a.isEmpty() || eVar.c == null) {
            return false;
        }
        java.util.Iterator it = this.f3605a.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equals(eVar.c.value())) {
                return !this.b;
            }
        }
        return this.b;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s - %s include: %b", "placement_type", this.f3605a, java.lang.Boolean.valueOf(this.b));
    }
}
