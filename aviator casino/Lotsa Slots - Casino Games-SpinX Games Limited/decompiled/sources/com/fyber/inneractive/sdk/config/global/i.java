package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes3.dex */
public final class i implements com.fyber.inneractive.sdk.config.global.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f3606a = new java.util.HashSet();
    public final boolean b;

    public i(org.json.JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.f3606a.add(java.lang.Long.valueOf(optLong));
                }
            }
        }
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(com.fyber.inneractive.sdk.config.global.e eVar) {
        if (this.f3606a.isEmpty() || eVar.b == null) {
            return false;
        }
        java.util.Iterator it = this.f3606a.iterator();
        while (it.hasNext()) {
            if (((java.lang.Long) it.next()).equals(eVar.b)) {
                return !this.b;
            }
        }
        return this.b;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s - %s include: %b", "pub_id", this.f3606a, java.lang.Boolean.valueOf(this.b));
    }
}
