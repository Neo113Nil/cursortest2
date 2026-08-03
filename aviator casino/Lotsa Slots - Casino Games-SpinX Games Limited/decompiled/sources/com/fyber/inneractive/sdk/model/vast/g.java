package com.fyber.inneractive.sdk.model.vast;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f3803a;
    public com.fyber.inneractive.sdk.model.vast.o e;
    public com.fyber.inneractive.sdk.model.vast.v g;
    public final java.util.ArrayList d = new java.util.ArrayList();
    public int f = 0;
    public final java.util.ArrayList h = new java.util.ArrayList(1);
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final java.util.ArrayList c = new java.util.ArrayList();

    public final void a(org.w3c.dom.Node node) {
        com.fyber.inneractive.sdk.model.vast.w wVar;
        org.w3c.dom.Node d = com.fyber.inneractive.sdk.util.w1.d(node, "AdVerifications");
        if (d != null) {
            java.util.Iterator it = com.fyber.inneractive.sdk.util.w1.c(d, "Verification").iterator();
            while (it.hasNext()) {
                org.w3c.dom.Node node2 = (org.w3c.dom.Node) it.next();
                com.fyber.inneractive.sdk.measurement.h hVar = null;
                if (node2 != null) {
                    com.fyber.inneractive.sdk.measurement.h hVar2 = new com.fyber.inneractive.sdk.measurement.h();
                    hVar2.e = com.fyber.inneractive.sdk.util.w1.b(node2, "vendor");
                    org.w3c.dom.Node d2 = com.fyber.inneractive.sdk.util.w1.d(node2, "JavaScriptResource");
                    if (d2 != null) {
                        hVar2.g = true;
                        try {
                            hVar2.f = com.fyber.inneractive.sdk.util.w1.a(d2);
                            hVar2.b = com.fyber.inneractive.sdk.util.w1.b(d2, "apiFramework");
                            hVar2.f3789a = new java.net.URL(hVar2.f);
                        } catch (java.net.MalformedURLException unused) {
                        }
                    }
                    org.w3c.dom.Node d3 = com.fyber.inneractive.sdk.util.w1.d(node2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v);
                    if (d3 != null) {
                        java.util.Iterator it2 = com.fyber.inneractive.sdk.util.w1.c(d3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w).iterator();
                        while (it2.hasNext()) {
                            org.w3c.dom.Node node3 = (org.w3c.dom.Node) it2.next();
                            if (node3 == null) {
                                wVar = null;
                            } else {
                                wVar = new com.fyber.inneractive.sdk.model.vast.w();
                                wVar.f3814a = com.fyber.inneractive.sdk.util.w1.b(node3, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                                wVar.b = com.fyber.inneractive.sdk.util.w1.a(node3);
                                wVar.c = com.fyber.inneractive.sdk.util.w1.b(node3, "offset");
                            }
                            if (node3 != null && wVar.f3814a.equalsIgnoreCase("verificationNotExecuted")) {
                                hVar2.a(com.fyber.inneractive.sdk.model.vast.x.EVENT_VERIFICATION_NOT_EXECUTED, wVar.b);
                            }
                        }
                    }
                    org.w3c.dom.Node d4 = com.fyber.inneractive.sdk.util.w1.d(node2, "VerificationParameters");
                    if (d4 != null) {
                        hVar2.d = com.fyber.inneractive.sdk.util.w1.a(d4);
                    }
                    hVar = hVar2;
                }
                if (hVar != null) {
                    com.fyber.inneractive.sdk.util.IAlog.a("Verification Found - %s", hVar.toString());
                    this.d.add(hVar);
                }
            }
        }
    }

    public void b(org.w3c.dom.Node node) {
        org.w3c.dom.Node d;
        org.w3c.dom.NodeList childNodes;
        org.w3c.dom.NodeList childNodes2;
        com.fyber.inneractive.sdk.model.vast.m mVar;
        java.util.Iterator it;
        com.fyber.inneractive.sdk.model.vast.h hVar;
        java.util.Iterator it2;
        com.fyber.inneractive.sdk.model.vast.w wVar;
        com.fyber.inneractive.sdk.model.vast.w wVar2;
        java.util.Iterator it3;
        java.util.Iterator it4;
        com.fyber.inneractive.sdk.model.vast.r rVar;
        com.fyber.inneractive.sdk.model.vast.g gVar = this;
        org.w3c.dom.Node d2 = com.fyber.inneractive.sdk.util.w1.d(node, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h);
        if (d2 != null) {
            com.fyber.inneractive.sdk.util.w1.b(d2, "version");
            com.fyber.inneractive.sdk.util.w1.a(d2);
        }
        org.w3c.dom.Node d3 = com.fyber.inneractive.sdk.util.w1.d(node, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
        if (d3 != null) {
            java.lang.String a2 = com.fyber.inneractive.sdk.util.w1.a(d3);
            if (!android.text.TextUtils.isEmpty(a2)) {
                gVar.f3803a = a2;
            }
        }
        java.util.Iterator it5 = com.fyber.inneractive.sdk.util.w1.c(node, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n).iterator();
        while (it5.hasNext()) {
            java.lang.String a3 = com.fyber.inneractive.sdk.util.w1.a((org.w3c.dom.Node) it5.next());
            if (!android.text.TextUtils.isEmpty(a3)) {
                gVar.b.add(a3);
            }
        }
        org.w3c.dom.Node d4 = com.fyber.inneractive.sdk.util.w1.d(node, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o);
        if (d4 != null) {
            java.util.Iterator it6 = com.fyber.inneractive.sdk.util.w1.c(d4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p).iterator();
            while (it6.hasNext()) {
                org.w3c.dom.Node node2 = (org.w3c.dom.Node) it6.next();
                if (node2 == null) {
                    it = it6;
                    mVar = null;
                } else {
                    mVar = new com.fyber.inneractive.sdk.model.vast.m();
                    if (android.text.TextUtils.isEmpty(com.fyber.inneractive.sdk.util.w1.b(node2, "AdID"))) {
                        com.fyber.inneractive.sdk.util.w1.b(node2, com.ironsource.sdk.controller.f.b.c);
                    }
                    com.fyber.inneractive.sdk.util.w1.b(node2, "id");
                    com.fyber.inneractive.sdk.util.w1.a(node2, "sequence");
                    org.w3c.dom.Node d5 = com.fyber.inneractive.sdk.util.w1.d(node2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q);
                    if (d5 != null) {
                        com.fyber.inneractive.sdk.model.vast.q qVar = new com.fyber.inneractive.sdk.model.vast.q();
                        it = it6;
                        org.w3c.dom.Node d6 = com.fyber.inneractive.sdk.util.w1.d(d5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t);
                        if (d6 != null) {
                            java.util.ArrayList c = com.fyber.inneractive.sdk.util.w1.c(d6, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.u);
                            if (!c.isEmpty()) {
                                qVar.f3810a = new java.util.ArrayList();
                                java.util.Iterator it7 = c.iterator();
                                while (it7.hasNext()) {
                                    org.w3c.dom.Node node3 = (org.w3c.dom.Node) it7.next();
                                    if (node3 == null) {
                                        it4 = it7;
                                        rVar = null;
                                    } else {
                                        it4 = it7;
                                        rVar = new com.fyber.inneractive.sdk.model.vast.r();
                                        rVar.f3811a = com.fyber.inneractive.sdk.util.w1.b(node3, com.ironsource.C3300u.g);
                                        rVar.b = com.fyber.inneractive.sdk.util.w1.a(node3, "width");
                                        rVar.c = com.fyber.inneractive.sdk.util.w1.a(node3, "height");
                                        rVar.d = com.fyber.inneractive.sdk.util.w1.b(node3, "type");
                                        com.fyber.inneractive.sdk.util.w1.b(node3, "id");
                                        rVar.f = com.fyber.inneractive.sdk.util.w1.b(node3, "apiFramework");
                                        rVar.e = com.fyber.inneractive.sdk.util.w1.a(node3, "bitrate");
                                        java.lang.String b = com.fyber.inneractive.sdk.util.w1.b(node3, "maintainAspectRatio");
                                        if (!android.text.TextUtils.isEmpty(b)) {
                                            try {
                                                java.lang.Boolean.valueOf(b);
                                            } catch (java.lang.Exception unused) {
                                            }
                                        }
                                        java.lang.String b2 = com.fyber.inneractive.sdk.util.w1.b(node3, "scalable");
                                        if (!android.text.TextUtils.isEmpty(b2)) {
                                            try {
                                                java.lang.Boolean.valueOf(b2);
                                            } catch (java.lang.Exception unused2) {
                                            }
                                        }
                                        rVar.g = com.fyber.inneractive.sdk.util.w1.a(node3);
                                    }
                                    if (rVar != null) {
                                        qVar.f3810a.add(rVar);
                                    }
                                    it7 = it4;
                                }
                            }
                        }
                        org.w3c.dom.Node d7 = com.fyber.inneractive.sdk.util.w1.d(d5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x);
                        if (d7 != null) {
                            qVar.c = com.fyber.inneractive.sdk.util.w1.a(com.fyber.inneractive.sdk.util.w1.d(d7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.y));
                            java.util.ArrayList c2 = com.fyber.inneractive.sdk.util.w1.c(d7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.z);
                            if (!c2.isEmpty()) {
                                qVar.d = new java.util.ArrayList();
                                java.util.Iterator it8 = c2.iterator();
                                while (it8.hasNext()) {
                                    java.lang.String a4 = com.fyber.inneractive.sdk.util.w1.a((org.w3c.dom.Node) it8.next());
                                    if (!android.text.TextUtils.isEmpty(a4)) {
                                        qVar.d.add(a4);
                                    }
                                }
                            }
                        }
                        org.w3c.dom.Node d8 = com.fyber.inneractive.sdk.util.w1.d(d5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v);
                        if (d8 != null) {
                            java.util.ArrayList c3 = com.fyber.inneractive.sdk.util.w1.c(d8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w);
                            if (!c3.isEmpty()) {
                                qVar.b = new java.util.ArrayList();
                                java.util.Iterator it9 = c3.iterator();
                                while (it9.hasNext()) {
                                    org.w3c.dom.Node node4 = (org.w3c.dom.Node) it9.next();
                                    if (node4 == null) {
                                        it3 = it9;
                                        wVar2 = null;
                                    } else {
                                        wVar2 = new com.fyber.inneractive.sdk.model.vast.w();
                                        it3 = it9;
                                        wVar2.f3814a = com.fyber.inneractive.sdk.util.w1.b(node4, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                                        wVar2.b = com.fyber.inneractive.sdk.util.w1.a(node4);
                                        wVar2.c = com.fyber.inneractive.sdk.util.w1.b(node4, "offset");
                                    }
                                    if (wVar2 != null) {
                                        qVar.b.add(wVar2);
                                    }
                                    it9 = it3;
                                }
                            }
                        }
                        org.w3c.dom.Node d9 = com.fyber.inneractive.sdk.util.w1.d(d5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.s);
                        if (d9 != null) {
                            qVar.e = com.fyber.inneractive.sdk.util.w1.a(d9);
                        }
                        mVar.f3807a = qVar;
                    } else {
                        it = it6;
                    }
                    org.w3c.dom.Node d10 = com.fyber.inneractive.sdk.util.w1.d(node2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L);
                    if (d10 != null) {
                        com.fyber.inneractive.sdk.model.vast.j jVar = new com.fyber.inneractive.sdk.model.vast.j();
                        java.lang.String b3 = com.fyber.inneractive.sdk.util.w1.b(d10, "required");
                        if (!"all".equalsIgnoreCase(b3)) {
                            "none".equalsIgnoreCase(b3);
                        }
                        java.util.ArrayList c4 = com.fyber.inneractive.sdk.util.w1.c(d10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M);
                        jVar.f3805a.clear();
                        java.util.Iterator it10 = c4.iterator();
                        while (it10.hasNext()) {
                            org.w3c.dom.Node node5 = (org.w3c.dom.Node) it10.next();
                            if (node5 == null) {
                                it2 = it10;
                                hVar = null;
                            } else {
                                hVar = new com.fyber.inneractive.sdk.model.vast.h();
                                hVar.f3804a = com.fyber.inneractive.sdk.util.w1.a(node5, "width");
                                hVar.b = com.fyber.inneractive.sdk.util.w1.a(node5, "height");
                                hVar.c = com.fyber.inneractive.sdk.util.w1.b(node5, "id");
                                com.fyber.inneractive.sdk.util.w1.b(node5, "apiFramework");
                                com.fyber.inneractive.sdk.util.w1.a(node5, "expandedWidth");
                                com.fyber.inneractive.sdk.util.w1.a(node5, "expandedHeight");
                                org.w3c.dom.Node d11 = com.fyber.inneractive.sdk.util.w1.d(node5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D);
                                if (d11 != null) {
                                    com.fyber.inneractive.sdk.model.vast.l lVar = new com.fyber.inneractive.sdk.model.vast.l();
                                    it2 = it10;
                                    lVar.f3806a = com.fyber.inneractive.sdk.util.w1.b(d11, "creativeType");
                                    lVar.b = com.fyber.inneractive.sdk.util.w1.a(d11);
                                    hVar.d = lVar;
                                } else {
                                    it2 = it10;
                                }
                                org.w3c.dom.Node d12 = com.fyber.inneractive.sdk.util.w1.d(node5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F);
                                if (d12 != null) {
                                    hVar.f = com.fyber.inneractive.sdk.util.w1.a(d12);
                                }
                                org.w3c.dom.Node d13 = com.fyber.inneractive.sdk.util.w1.d(node5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E);
                                if (d13 != null) {
                                    hVar.e = com.fyber.inneractive.sdk.util.w1.a(d13);
                                }
                                org.w3c.dom.Node d14 = com.fyber.inneractive.sdk.util.w1.d(node5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N);
                                if (d14 != null) {
                                    hVar.g = com.fyber.inneractive.sdk.util.w1.a(d14);
                                }
                                hVar.h.clear();
                                java.util.ArrayList c5 = com.fyber.inneractive.sdk.util.w1.c(node5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O);
                                if (c5.size() > 0) {
                                    java.util.Iterator it11 = c5.iterator();
                                    while (it11.hasNext()) {
                                        java.lang.String a5 = com.fyber.inneractive.sdk.util.w1.a((org.w3c.dom.Node) it11.next());
                                        if (!android.text.TextUtils.isEmpty(a5)) {
                                            hVar.h.add(a5);
                                        }
                                    }
                                }
                                hVar.j.clear();
                                org.w3c.dom.Node d15 = com.fyber.inneractive.sdk.util.w1.d(node5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v);
                                if (d15 != null) {
                                    java.util.ArrayList c6 = com.fyber.inneractive.sdk.util.w1.c(d15, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w);
                                    if (!c6.isEmpty()) {
                                        java.util.Iterator it12 = c6.iterator();
                                        while (it12.hasNext()) {
                                            org.w3c.dom.Node node6 = (org.w3c.dom.Node) it12.next();
                                            if (node6 == null) {
                                                wVar = null;
                                            } else {
                                                wVar = new com.fyber.inneractive.sdk.model.vast.w();
                                                wVar.f3814a = com.fyber.inneractive.sdk.util.w1.b(node6, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                                                wVar.b = com.fyber.inneractive.sdk.util.w1.a(node6);
                                                wVar.c = com.fyber.inneractive.sdk.util.w1.b(node6, "offset");
                                            }
                                            if (wVar != null) {
                                                hVar.j.add(wVar);
                                            }
                                        }
                                    }
                                }
                            }
                            if (hVar != null) {
                                jVar.f3805a.add(hVar);
                            }
                            it10 = it2;
                        }
                        mVar.b = jVar;
                    }
                }
                gVar = this;
                if (mVar != null) {
                    gVar.c.add(mVar);
                }
                it6 = it;
            }
        }
        org.w3c.dom.Node d16 = com.fyber.inneractive.sdk.util.w1.d(node, "Extensions");
        if (d16 != null) {
            java.util.Iterator it13 = com.fyber.inneractive.sdk.util.w1.c(d16, "Extension").iterator();
            while (it13.hasNext()) {
                org.w3c.dom.Node node7 = (org.w3c.dom.Node) it13.next();
                if ("AdVerifications".equalsIgnoreCase(com.fyber.inneractive.sdk.util.w1.b(node7, "type"))) {
                    gVar.a(node7);
                }
                if ("FMPCompanionAssets".equalsIgnoreCase(com.fyber.inneractive.sdk.util.w1.b(node7, "type"))) {
                    com.fyber.inneractive.sdk.util.IAlog.a("parseFMPCompanionAssetsTag", new java.lang.Object[0]);
                    org.w3c.dom.Node d17 = com.fyber.inneractive.sdk.util.w1.d(node7, "FMPCompanionAssets");
                    if (d17 != null) {
                        com.fyber.inneractive.sdk.model.vast.o oVar = new com.fyber.inneractive.sdk.model.vast.o();
                        java.lang.String b4 = com.fyber.inneractive.sdk.util.w1.b(d17, "enableMultipleCompanions");
                        if ("false".equalsIgnoreCase(b4) || "0".equals(b4)) {
                            oVar.d = false;
                        }
                        org.w3c.dom.Node d18 = com.fyber.inneractive.sdk.util.w1.d(d17, "Name");
                        if (d18 != null) {
                            oVar.f3809a = com.fyber.inneractive.sdk.util.w1.a(d18);
                        }
                        org.w3c.dom.Node d19 = com.fyber.inneractive.sdk.util.w1.d(d17, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j);
                        if (d19 != null) {
                            com.fyber.inneractive.sdk.util.w1.a(d19);
                        }
                        oVar.b.clear();
                        org.w3c.dom.Node d20 = com.fyber.inneractive.sdk.util.w1.d(d17, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B);
                        if (d20 != null) {
                            java.util.Iterator it14 = com.fyber.inneractive.sdk.util.w1.c(d20, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C).iterator();
                            while (it14.hasNext()) {
                                oVar.b.add(com.fyber.inneractive.sdk.util.w1.a((org.w3c.dom.Node) it14.next()));
                            }
                        }
                        org.w3c.dom.Node d21 = com.fyber.inneractive.sdk.util.w1.d(d17, "Rating");
                        if (d21 != null) {
                            try {
                                java.lang.Float.parseFloat(com.fyber.inneractive.sdk.util.w1.a(d21));
                            } catch (java.lang.Exception unused3) {
                            }
                        }
                        org.w3c.dom.Node d22 = com.fyber.inneractive.sdk.util.w1.d(d17, "Screenshots");
                        if (d22 != null) {
                            oVar.c = new java.util.ArrayList();
                            java.util.Iterator it15 = com.fyber.inneractive.sdk.util.w1.c(d22, "Screenshot").iterator();
                            while (it15.hasNext()) {
                                java.lang.String a6 = com.fyber.inneractive.sdk.util.w1.a((org.w3c.dom.Node) it15.next());
                                if (!android.text.TextUtils.isEmpty(a6)) {
                                    oVar.c.add(a6);
                                }
                            }
                        }
                        gVar.e = oVar;
                    }
                }
                if ("DynamicVideoControlsURL".equalsIgnoreCase(com.fyber.inneractive.sdk.util.w1.b(node7, "type"))) {
                    org.w3c.dom.Node d23 = com.fyber.inneractive.sdk.util.w1.d(node7, "DynamicVideoControlsURL");
                    com.fyber.inneractive.sdk.model.vast.n nVar = new com.fyber.inneractive.sdk.model.vast.n();
                    if (d23 != null) {
                        nVar.f3808a = com.fyber.inneractive.sdk.util.w1.a(d23);
                    }
                    if (!android.text.TextUtils.isEmpty(nVar.f3808a)) {
                        gVar.h.add(nVar);
                    }
                }
                if ("StorePromoAssets".equalsIgnoreCase(com.fyber.inneractive.sdk.util.w1.b(node7, "type")) && (d = com.fyber.inneractive.sdk.util.w1.d(node7, "DTSPR")) != null) {
                    com.fyber.inneractive.sdk.model.vast.v vVar = new com.fyber.inneractive.sdk.model.vast.v();
                    org.w3c.dom.Node d24 = com.fyber.inneractive.sdk.util.w1.d(d, "DTSPNm");
                    if (d24 != null) {
                        vVar.b = com.fyber.inneractive.sdk.util.w1.a(d24);
                    }
                    org.w3c.dom.Node d25 = com.fyber.inneractive.sdk.util.w1.d(d, "DTSPTUrl");
                    if (d25 != null) {
                        vVar.c = com.fyber.inneractive.sdk.util.w1.a(d25);
                    }
                    org.w3c.dom.Node d26 = com.fyber.inneractive.sdk.util.w1.d(d, "DTSPPNm");
                    if (d26 != null) {
                        vVar.i = com.fyber.inneractive.sdk.util.w1.a(d26);
                    }
                    org.w3c.dom.Node d27 = com.fyber.inneractive.sdk.util.w1.d(d, "DTSPIap");
                    if (d27 != null) {
                        vVar.d = com.fyber.inneractive.sdk.util.w1.a(d27);
                    }
                    org.w3c.dom.Node d28 = com.fyber.inneractive.sdk.util.w1.d(d, "DTSPCads");
                    if (d28 != null) {
                        vVar.e = com.fyber.inneractive.sdk.util.w1.a(d28);
                    }
                    org.w3c.dom.Node d29 = com.fyber.inneractive.sdk.util.w1.d(d, "DTSPMedia");
                    if (d29 != null && (childNodes2 = d29.getChildNodes()) != null && childNodes2.getLength() != 0) {
                        for (int i = 0; i < childNodes2.getLength(); i++) {
                            org.w3c.dom.Node item = childNodes2.item(i);
                            if (item != null) {
                                java.lang.String nodeName = item.getNodeName();
                                java.lang.String a7 = com.fyber.inneractive.sdk.util.w1.a(item);
                                if (!android.text.TextUtils.isEmpty(a7)) {
                                    if ("DTSPScrn".equalsIgnoreCase(nodeName)) {
                                        vVar.f.add(a7);
                                    } else if ("DTSPVid".equalsIgnoreCase(nodeName)) {
                                        vVar.g.add(a7);
                                    } else if ("DTSPIcon".equalsIgnoreCase(nodeName)) {
                                        vVar.f3813a = a7;
                                    }
                                }
                            }
                        }
                    }
                    org.w3c.dom.Node d30 = com.fyber.inneractive.sdk.util.w1.d(d, "DTSPMetadata");
                    if (d30 != null && (childNodes = d30.getChildNodes()) != null && childNodes.getLength() != 0) {
                        java.lang.String str = null;
                        java.lang.String str2 = null;
                        java.lang.String str3 = null;
                        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                            org.w3c.dom.Node item2 = childNodes.item(i2);
                            if (item2 != null) {
                                java.lang.String nodeName2 = item2.getNodeName();
                                if ("DTSPLabel".equalsIgnoreCase(nodeName2)) {
                                    str = com.fyber.inneractive.sdk.util.w1.a(item2);
                                } else if ("DTSPRating".equalsIgnoreCase(nodeName2)) {
                                    str2 = com.fyber.inneractive.sdk.util.w1.a(item2);
                                } else if ("DTSPSize".equalsIgnoreCase(nodeName2)) {
                                    str3 = com.fyber.inneractive.sdk.util.w1.a(item2);
                                }
                            }
                        }
                        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
                            vVar.h = new com.fyber.inneractive.sdk.flow.storepromo.model.d(str2, str, str3);
                        }
                    }
                    gVar.g = vVar;
                }
            }
        }
        a(node);
    }
}
