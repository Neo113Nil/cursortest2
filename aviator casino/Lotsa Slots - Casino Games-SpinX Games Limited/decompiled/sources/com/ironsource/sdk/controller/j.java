package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6641a;
    private final com.ironsource.V5 b;

    j(java.lang.String str, com.ironsource.V5 v5) {
        this.f6641a = str;
        this.b = v5;
    }

    private com.ironsource.C3381y8 b(org.json.JSONObject jSONObject, java.lang.String str) throws java.lang.Exception {
        if (!jSONObject.has(com.ironsource.T5.c.c) || !jSONObject.has("fileName")) {
            throw new java.lang.Exception(com.ironsource.T5.a.f5976a);
        }
        java.lang.String string = jSONObject.getString(com.ironsource.T5.c.c);
        return new com.ironsource.C3381y8(com.ironsource.sdk.utils.IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString("fileName"));
    }

    void a(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3168ma interfaceC3168ma) {
        char c;
        com.ironsource.C3186na c3186na = new com.ironsource.C3186na(jSONObject);
        com.ironsource.C3204oa c3204oa = new com.ironsource.C3204oa(interfaceC3168ma);
        try {
            java.lang.String b = c3186na.b();
            org.json.JSONObject c2 = c3186na.c();
            com.ironsource.C3381y8 b2 = b(c2, this.f6641a);
            com.ironsource.sdk.utils.IronSourceStorageUtils.ensurePathSafety(b2, this.f6641a);
            switch (b.hashCode()) {
                case -2073025383:
                    if (b.equals(com.ironsource.T5.b.f5977a)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1137024519:
                    if (b.equals("deleteFolder")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -318115535:
                    if (b.equals(com.ironsource.T5.b.e)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 537556755:
                    if (b.equals(com.ironsource.T5.b.f)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1764172231:
                    if (b.equals("deleteFile")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1953259713:
                    if (b.equals(com.ironsource.T5.b.d)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.b.a(b2, c2.optString(com.ironsource.T5.c.f5978a), c2.optInt("connectionTimeout"), c2.optInt("readTimeout"), a(c3186na, c3204oa));
                return;
            }
            if (c == 1) {
                this.b.a(b2);
                c3204oa.b(c3186na, a(c3186na, b2.a()));
                return;
            }
            if (c == 2) {
                this.b.b(b2);
                c3204oa.b(c3186na, a(c3186na, b2.a()));
                return;
            }
            if (c == 3) {
                c3204oa.b(c3186na, a(c3186na, this.b.c(b2)));
                return;
            }
            if (c == 4) {
                c3204oa.b(c3186na, a(c3186na, this.b.d(b2)));
            } else {
                if (c != 5) {
                    return;
                }
                this.b.a(b2, c2.optJSONObject(com.ironsource.T5.c.g));
                c3204oa.b(c3186na, a(c3186na, b2.a()));
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            c3204oa.a(c3186na, a(c3186na, e.getMessage()));
        }
    }

    class a implements com.ironsource.Nc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.C3204oa f6642a;
        final /* synthetic */ com.ironsource.C3186na b;

        a(com.ironsource.C3204oa c3204oa, com.ironsource.C3186na c3186na) {
            this.f6642a = c3204oa;
            this.b = c3186na;
        }

        @Override // com.ironsource.Nc
        public void a(com.ironsource.C3381y8 c3381y8) {
            try {
                com.ironsource.C3204oa c3204oa = this.f6642a;
                com.ironsource.C3186na c3186na = this.b;
                c3204oa.b(c3186na, com.ironsource.sdk.controller.j.this.a(c3186na, c3381y8.a()));
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Nc
        public void a(com.ironsource.C3381y8 c3381y8, com.ironsource.C3220p8 c3220p8) {
            try {
                com.ironsource.C3204oa c3204oa = this.f6642a;
                com.ironsource.C3186na c3186na = this.b;
                c3204oa.a(c3186na, com.ironsource.sdk.controller.j.this.a(c3186na, c3220p8.b()));
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    private com.ironsource.Nc a(com.ironsource.C3186na c3186na, com.ironsource.C3204oa c3204oa) {
        return new com.ironsource.sdk.controller.j.a(c3204oa, c3186na);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.json.JSONObject a(com.ironsource.C3186na c3186na, org.json.JSONObject jSONObject) {
        try {
            return c3186na.e().put("result", jSONObject);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return new org.json.JSONObject();
        }
    }

    private org.json.JSONObject a(com.ironsource.C3186na c3186na, long j) {
        try {
            return c3186na.e().put("result", j);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return new org.json.JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.json.JSONObject a(com.ironsource.C3186na c3186na, java.lang.String str) {
        try {
            return c3186na.e().put("errMsg", str);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return new org.json.JSONObject();
        }
    }

    private com.ironsource.C3381y8 a(org.json.JSONObject jSONObject, java.lang.String str) throws java.lang.Exception {
        if (jSONObject.has(com.ironsource.T5.c.d)) {
            return new com.ironsource.C3381y8(com.ironsource.sdk.utils.IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(com.ironsource.T5.c.d)));
        }
        throw new java.lang.Exception(com.ironsource.T5.a.b);
    }
}
