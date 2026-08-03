package com.fyber.inneractive.sdk.response;

/* loaded from: classes3.dex */
public final class d extends com.fyber.inneractive.sdk.response.b {
    public com.fyber.inneractive.sdk.response.g e;
    public com.fyber.inneractive.sdk.config.r0 f;
    public com.fyber.inneractive.sdk.model.vast.f g;
    public final java.util.ArrayList h;
    public int i;
    public com.fyber.inneractive.sdk.model.vast.z j;
    public final boolean k;

    public d() {
        this.k = true;
        this.h = new java.util.ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final com.fyber.inneractive.sdk.response.e a() {
        com.fyber.inneractive.sdk.response.g gVar = new com.fyber.inneractive.sdk.response.g();
        this.f4250a = gVar;
        this.e = gVar;
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(java.lang.String str, com.fyber.inneractive.sdk.config.r0 r0Var) {
        this.f = r0Var;
        if (r0Var != null && r0Var.f != null) {
            this.e.K = java.lang.System.currentTimeMillis();
            com.fyber.inneractive.sdk.response.g gVar = this.e;
            gVar.z = this.f.b;
            this.i = com.fyber.inneractive.sdk.config.IAConfigManager.N.i.b;
            gVar.getClass();
            try {
                a(str, 0);
                a(this.g, this.h);
                return;
            } catch (com.fyber.inneractive.sdk.flow.vast.h e) {
                this.e.i = e.getMessage();
                this.e.j = e.getCause().getMessage();
                return;
            } catch (java.lang.InterruptedException e2) {
                throw e2;
            } catch (java.lang.Exception e3) {
                this.e.j = e3.getMessage();
                com.fyber.inneractive.sdk.response.g gVar2 = this.e;
                gVar2.i = "VastErrorInvalidFile";
                gVar2.w = e3;
                if (com.fyber.inneractive.sdk.util.IAlog.f4283a == 2) {
                    e3.printStackTrace();
                    return;
                }
                return;
            }
        }
        this.f4250a.i = "ErrorConfigurationMismatch";
    }

    public d(boolean z) {
        this();
        this.k = z;
    }

    public final void a(java.lang.String str, int i) {
        com.fyber.inneractive.sdk.model.vast.u uVar;
        try {
            java.lang.String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            javax.xml.parsers.DocumentBuilderFactory newInstance = javax.xml.parsers.DocumentBuilderFactory.newInstance();
            newInstance.setCoalescing(true);
            org.w3c.dom.Document parse = newInstance.newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.StringReader(replaceFirst)));
            if (parse != null) {
                org.w3c.dom.Node firstChild = parse.getFirstChild();
                if (firstChild.getNodeName().equalsIgnoreCase("VAST")) {
                    uVar = com.fyber.inneractive.sdk.model.vast.u.a(firstChild);
                } else {
                    com.fyber.inneractive.sdk.util.IAlog.a("XML does not contain a VAST tag as its first child!", new java.lang.Object[0]);
                    throw new java.lang.Exception("XML does not contain a VAST tag as its first child!");
                }
            } else {
                uVar = null;
            }
            try {
                if (this.j == null) {
                    this.j = new com.fyber.inneractive.sdk.model.vast.z(uVar.f3812a);
                } else {
                    com.fyber.inneractive.sdk.model.vast.z zVar = new com.fyber.inneractive.sdk.model.vast.z(uVar.f3812a);
                    if (zVar.compareTo(this.j) >= 0) {
                        this.j = zVar;
                    }
                }
            } catch (com.fyber.inneractive.sdk.model.vast.y unused) {
            }
            java.util.ArrayList arrayList = uVar.b;
            if (arrayList != null && !arrayList.isEmpty()) {
                com.fyber.inneractive.sdk.model.vast.f fVar = (com.fyber.inneractive.sdk.model.vast.f) arrayList.get(0);
                com.fyber.inneractive.sdk.model.vast.a0 a0Var = fVar.b;
                if (a0Var != null) {
                    com.fyber.inneractive.sdk.util.IAlog.a("Vast response parser: found VAST wrapper #%d", java.lang.Integer.valueOf(this.h.size()));
                    int size = this.h.size();
                    int i2 = this.i;
                    if (size < i2) {
                        this.h.add(fVar);
                        java.lang.String str2 = a0Var.i;
                        if (!android.text.TextUtils.isEmpty(str2)) {
                            if (com.fyber.inneractive.sdk.util.h0.f(str2)) {
                                java.lang.String a2 = com.fyber.inneractive.sdk.util.s.a(str2, 3000, 5000);
                                if (!android.text.TextUtils.isEmpty(a2)) {
                                    int i3 = this.i - i;
                                    if (i3 > 0) {
                                        a0Var.f = i3;
                                        this.e.P.put(str2, a2);
                                        a(a2, i + 1);
                                        return;
                                    }
                                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Invalid level for wrapper");
                                }
                                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Failed getting data from ad tag URI");
                            }
                            com.fyber.inneractive.sdk.util.IAlog.a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
                        }
                        com.fyber.inneractive.sdk.util.IAlog.a("Vast response parser: found an empty tag uri in wrapper! aborting!", new java.lang.Object[0]);
                        throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "No ad tag URI for wrapper");
                    }
                    com.fyber.inneractive.sdk.util.IAlog.a("Vast response parser: too many vast wrappers! Only %d allowed. stopping", java.lang.Integer.valueOf(i2));
                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorTooManyWrappers", "More than " + this.i + " found");
                }
                if (fVar.c != null) {
                    this.g = fVar;
                    return;
                }
                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
            }
            com.fyber.inneractive.sdk.util.IAlog.a("Vast response parser: no ads found in model. aborting", new java.lang.Object[0]);
            throw new com.fyber.inneractive.sdk.flow.vast.h("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("Failed parsing Vast file! parsing error = %s", e.getMessage());
            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", e.getMessage());
        }
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.f fVar, java.util.List list) {
        java.lang.String str;
        com.fyber.inneractive.sdk.flow.vast.c cVar = new com.fyber.inneractive.sdk.flow.vast.c(this.k);
        int intValue = this.f.f.c.intValue();
        int intValue2 = this.f.f.b.intValue();
        int intValue3 = this.f.f.g.intValue();
        cVar.b = intValue;
        cVar.c = intValue2;
        cVar.d = intValue3;
        if (com.fyber.inneractive.sdk.config.enums.UnitDisplayType.VERTICAL.equals(this.f.f.j)) {
            cVar.e = true;
        }
        if (this.f.f.k.contains(2)) {
            cVar.f = true;
        }
        try {
            com.fyber.inneractive.sdk.model.vast.z zVar = this.j;
            if (zVar == null) {
                str = "";
            } else {
                str = zVar.b;
            }
            this.e.L = cVar.a(fVar, list, str);
        } catch (com.fyber.inneractive.sdk.flow.vast.h e) {
            com.fyber.inneractive.sdk.response.g gVar = this.e;
            gVar.getClass();
            gVar.i = e.getMessage();
        }
        com.fyber.inneractive.sdk.model.vast.b bVar = this.e.L;
        if (bVar != null) {
            java.lang.String str2 = bVar.n;
            if (!android.text.TextUtils.isEmpty(str2) && com.fyber.inneractive.sdk.util.h0.f(str2)) {
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.VAST_EVENT_DVC_DETECTED, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) null, this.f4250a);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("templateURL", str2);
                } catch (java.lang.Exception unused) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str2);
                }
                wVar.f.put(jSONObject);
                wVar.a((java.lang.String) null);
            } else if (!android.text.TextUtils.isEmpty(str2)) {
                this.e.L.n = "";
                com.fyber.inneractive.sdk.network.events.a.a(com.fyber.inneractive.sdk.network.t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.SSL_ERROR, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) null, this.f4250a, "Unsecured URL", str2, java.lang.Boolean.FALSE);
            }
        }
        com.fyber.inneractive.sdk.response.g gVar2 = this.e;
        java.util.LinkedHashMap linkedHashMap = cVar.g;
        if (linkedHashMap != null) {
            gVar2.M.putAll(linkedHashMap);
        } else {
            gVar2.getClass();
        }
        com.fyber.inneractive.sdk.response.g gVar3 = this.e;
        java.util.ArrayList arrayList = cVar.h;
        if (arrayList != null) {
            gVar3.N.addAll(arrayList);
        } else {
            gVar3.getClass();
        }
        com.fyber.inneractive.sdk.response.g gVar4 = this.e;
        java.util.ArrayList arrayList2 = cVar.k;
        if (arrayList2 != null) {
            gVar4.O.addAll(arrayList2);
        } else {
            gVar4.getClass();
        }
        if (com.fyber.inneractive.sdk.util.IAlog.f4283a == 2) {
            java.util.LinkedHashMap linkedHashMap2 = cVar.g;
            if (linkedHashMap2.size() > 0) {
                com.fyber.inneractive.sdk.util.IAlog.e(" VParser: Unsupported media files:", new java.lang.Object[0]);
                for (com.fyber.inneractive.sdk.model.vast.r rVar : linkedHashMap2.keySet()) {
                    com.fyber.inneractive.sdk.util.IAlog.e("VParser: %s", rVar);
                    com.fyber.inneractive.sdk.util.IAlog.e("VParser: reason = %s", linkedHashMap2.get(rVar));
                }
                return;
            }
            com.fyber.inneractive.sdk.util.IAlog.e("VParser: Unsupported media files: none", new java.lang.Object[0]);
        }
    }
}
