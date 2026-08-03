package com.fyber.inneractive.sdk.flow.vast;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3761a;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public boolean e = false;
    public boolean f = false;
    public final java.util.LinkedHashMap g = new java.util.LinkedHashMap();
    public final java.util.ArrayList h = new java.util.ArrayList();
    public final java.util.ArrayList i = new java.util.ArrayList();
    public final java.util.ArrayList j = new java.util.ArrayList();
    public final java.util.ArrayList k = new java.util.ArrayList();

    public c(boolean z) {
        this.f3761a = true;
        this.f3761a = z;
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.h hVar, int i) {
        java.lang.String str;
        java.util.List list;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.String str2;
        java.util.ArrayList arrayList = hVar.h;
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (!com.fyber.inneractive.sdk.util.h0.f(str3)) {
                    throw new com.fyber.inneractive.sdk.flow.vast.b("Found non-secure click tracking url for companion. url: " + str3, 0);
                }
            }
            if (i > 0) {
                this.i.add(hVar);
            }
        }
        java.lang.String str4 = hVar.g;
        if (!com.fyber.inneractive.sdk.util.h0.f(str4)) {
            throw new com.fyber.inneractive.sdk.flow.vast.b("Found non-secure click through url: " + str4, 0);
        }
        if (!hVar.a()) {
            if (this.j.contains(hVar)) {
                return;
            }
            this.j.add(hVar);
            return;
        }
        java.lang.Integer num3 = hVar.f3804a;
        java.lang.Integer num4 = hVar.b;
        if (num3 == null || num4 == null || num3.intValue() < 100 || num4.intValue() < 100) {
            throw new com.fyber.inneractive.sdk.flow.vast.b("Incompatible size: " + num3 + "," + num4, 16);
        }
        java.util.ArrayList arrayList2 = hVar.j;
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            com.fyber.inneractive.sdk.model.vast.w wVar = (com.fyber.inneractive.sdk.model.vast.w) it2.next();
            if (!com.fyber.inneractive.sdk.util.h0.f(wVar.b)) {
                throw new com.fyber.inneractive.sdk.flow.vast.b("Found non-secure tracking event: " + wVar, 0);
            }
        }
        java.lang.String str5 = hVar.c;
        com.fyber.inneractive.sdk.model.vast.l lVar = hVar.d;
        if (lVar != null) {
            com.fyber.inneractive.sdk.model.vast.k a2 = com.fyber.inneractive.sdk.model.vast.k.a(lVar.f3806a);
            if (a2 == null) {
                throw new com.fyber.inneractive.sdk.flow.vast.b("Found invalid creative type: " + lVar.f3806a, 32);
            }
            str = str5;
            list = arrayList2;
            num = num4;
            num2 = num3;
            str2 = str4;
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Static, i, num3.intValue(), num4.intValue(), str5, str4, arrayList, list, lVar.b, a2);
        } else {
            str = str5;
            list = arrayList2;
            num = num4;
            num2 = num3;
            str2 = str4;
        }
        java.lang.String str6 = hVar.e;
        if (!android.text.TextUtils.isEmpty(str6)) {
            if (!com.fyber.inneractive.sdk.util.h0.f(str6)) {
                throw new com.fyber.inneractive.sdk.flow.vast.b("Found non-secure iframe url: " + str6, 0);
            }
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Iframe, i, num2.intValue(), num.intValue(), str, str2, arrayList, list, str6, null);
        }
        java.lang.String str7 = hVar.f;
        if (!android.text.TextUtils.isEmpty(str7)) {
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Html, i, num2.intValue(), num.intValue(), str, str2, arrayList, list, str7, null);
        }
        bVar.g.size();
    }

    public final com.fyber.inneractive.sdk.model.vast.b a(com.fyber.inneractive.sdk.model.vast.f fVar, java.util.List list, java.lang.String str) {
        int e = com.fyber.inneractive.sdk.util.o.e();
        int d = com.fyber.inneractive.sdk.util.o.d();
        com.fyber.inneractive.sdk.util.IAlog.a("%sprocess started", "VastProcessor: ");
        if (fVar != null && fVar.c != null) {
            com.fyber.inneractive.sdk.model.vast.b bVar = new com.fyber.inneractive.sdk.model.vast.b(new com.fyber.inneractive.sdk.flow.vast.g(this.d, e, d), new com.fyber.inneractive.sdk.flow.vast.d(e, d));
            bVar.f3799a = str;
            java.util.ArrayList arrayList = fVar.c.c;
            if (arrayList != null) {
                java.util.List list2 = list;
                if (!arrayList.isEmpty()) {
                    if (list == null) {
                        list2 = list;
                        if (fVar.b != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(fVar);
                            list2 = arrayList2;
                        }
                    }
                    if (list2 != null) {
                        java.util.Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            com.fyber.inneractive.sdk.model.vast.a0 a0Var = ((com.fyber.inneractive.sdk.model.vast.f) it.next()).b;
                            if (a0Var != null) {
                                a(bVar, a0Var);
                            }
                        }
                    }
                    a(bVar, fVar.c);
                    if (bVar.d.size() == 0) {
                        if (this.g.isEmpty()) {
                            throw new com.fyber.inneractive.sdk.flow.vast.h("ErrorNoMediaFiles", "No media files exist after merge");
                        }
                        throw new com.fyber.inneractive.sdk.flow.vast.h("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(bVar.g);
                    java.util.Collections.sort(arrayList3, bVar.h);
                    if (!arrayList3.isEmpty()) {
                        java.util.Iterator it2 = this.j.iterator();
                        while (it2.hasNext()) {
                            com.fyber.inneractive.sdk.model.vast.h hVar = (com.fyber.inneractive.sdk.model.vast.h) it2.next();
                            if (!hVar.a()) {
                                java.util.Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    com.fyber.inneractive.sdk.model.vast.c cVar = (com.fyber.inneractive.sdk.model.vast.c) it3.next();
                                    java.util.ArrayList arrayList4 = hVar.h;
                                    if (arrayList4 != null) {
                                        java.util.Iterator it4 = arrayList4.iterator();
                                        while (it4.hasNext()) {
                                            cVar.a(com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK, (java.lang.String) it4.next());
                                        }
                                    }
                                    java.lang.String str2 = hVar.g;
                                    if (android.text.TextUtils.isEmpty(cVar.g)) {
                                        cVar.g = str2;
                                    }
                                    java.util.ArrayList arrayList5 = hVar.j;
                                    if (arrayList5 != null) {
                                        java.util.Iterator it5 = arrayList5.iterator();
                                        while (it5.hasNext()) {
                                            com.fyber.inneractive.sdk.model.vast.w wVar = (com.fyber.inneractive.sdk.model.vast.w) it5.next();
                                            com.fyber.inneractive.sdk.model.vast.x a2 = com.fyber.inneractive.sdk.model.vast.x.a(wVar.f3814a);
                                            java.lang.String str3 = wVar.b;
                                            if (a2 != null && str3 != null) {
                                                cVar.a(a2, str3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (com.fyber.inneractive.sdk.util.IAlog.f4283a == 2) {
                        com.fyber.inneractive.sdk.util.IAlog.e("%sLogging merged model media files: ", "VastProcessor: ");
                        java.util.Iterator it6 = new java.util.ArrayList(bVar.d).iterator();
                        int i = 0;
                        while (it6.hasNext()) {
                            com.fyber.inneractive.sdk.util.IAlog.e("%s(%d) %s", "VastProcessor: ", java.lang.Integer.valueOf(i), (com.fyber.inneractive.sdk.model.vast.r) it6.next());
                            i++;
                        }
                    }
                    if (com.fyber.inneractive.sdk.util.IAlog.f4283a == 2) {
                        com.fyber.inneractive.sdk.util.IAlog.e("%sLogging merged model companion ads: ", "VastProcessor: ");
                        java.util.ArrayList arrayList6 = new java.util.ArrayList(bVar.g);
                        java.util.Collections.sort(arrayList6, bVar.h);
                        if (arrayList6.size() > 0) {
                            java.util.Iterator it7 = arrayList6.iterator();
                            int i2 = 0;
                            while (it7.hasNext()) {
                                com.fyber.inneractive.sdk.util.IAlog.e("%s(%d) %s", "VastProcessor: ", java.lang.Integer.valueOf(i2), ((com.fyber.inneractive.sdk.model.vast.c) it7.next()).a());
                                i2++;
                            }
                        } else {
                            com.fyber.inneractive.sdk.util.IAlog.e("%sNo companion ads found!", "VastProcessor: ");
                        }
                    }
                    return bVar;
                }
            }
            throw new com.fyber.inneractive.sdk.flow.vast.h("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sno inline found", "VastProcessor: ");
        throw new com.fyber.inneractive.sdk.flow.vast.h("ErrorNoMediaFiles", "Empty inline ad found");
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.g gVar) {
        java.lang.String[] split;
        com.fyber.inneractive.sdk.flow.vast.f fVar;
        java.lang.Integer num;
        com.fyber.inneractive.sdk.flow.vast.f fVar2;
        java.util.HashMap hashMap;
        java.util.List list;
        com.fyber.inneractive.sdk.util.IAlog.a("%sprocessing ad element: %s", "VastProcessor: ", gVar);
        java.util.ArrayList arrayList = gVar.b;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                com.fyber.inneractive.sdk.util.IAlog.a("%sadding impression url: %s", "VastProcessor: ", str);
                com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_IMPRESSION;
                if (com.fyber.inneractive.sdk.util.h0.f(str)) {
                    bVar.a(xVar, str);
                } else {
                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorUnsecure", "found unsecure tracking event: " + xVar.a());
                }
            }
        }
        java.lang.String str2 = gVar.f3803a;
        if (!android.text.TextUtils.isEmpty(str2)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sadding error url: %s", "VastProcessor: ", str2);
            bVar.a(com.fyber.inneractive.sdk.model.vast.x.EVENT_ERROR, str2);
        }
        if (com.fyber.inneractive.sdk.config.IAConfigManager.N.J != null) {
            java.util.Iterator it2 = gVar.d.iterator();
            while (it2.hasNext()) {
                com.fyber.inneractive.sdk.measurement.h hVar = (com.fyber.inneractive.sdk.measurement.h) it2.next();
                if (hVar.b()) {
                    bVar.e.add(hVar);
                } else {
                    com.fyber.inneractive.sdk.model.vast.x xVar2 = com.fyber.inneractive.sdk.model.vast.x.EVENT_VERIFICATION_NOT_EXECUTED;
                    if (xVar2 != null && (hashMap = hVar.c) != null && (list = (java.util.List) hashMap.get(xVar2)) != null && list.size() > 0) {
                        com.fyber.inneractive.sdk.player.n.a(new com.fyber.inneractive.sdk.measurement.g(hVar.a(xVar2), com.fyber.inneractive.sdk.measurement.i.VERIFICATION_NOT_SUPPORTED), xVar2);
                    }
                    this.k.add(hVar);
                }
            }
        }
        java.util.Iterator it3 = gVar.c.iterator();
        while (it3.hasNext()) {
            com.fyber.inneractive.sdk.model.vast.m mVar = (com.fyber.inneractive.sdk.model.vast.m) it3.next();
            com.fyber.inneractive.sdk.model.vast.q qVar = mVar.f3807a;
            if (qVar != null) {
                java.util.ArrayList arrayList2 = qVar.f3810a;
                if (arrayList2 != null) {
                    bVar.j = arrayList2.size();
                    java.util.Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        com.fyber.inneractive.sdk.model.vast.r rVar = (com.fyber.inneractive.sdk.model.vast.r) it4.next();
                        java.lang.String str3 = rVar.f3811a;
                        com.fyber.inneractive.sdk.model.vast.s sVar = com.fyber.inneractive.sdk.model.vast.s.progressive;
                        if (!str3.equals(sVar.a())) {
                            fVar = new com.fyber.inneractive.sdk.flow.vast.f(com.fyber.inneractive.sdk.flow.vast.e.UNSUPPORTED_DELIVERY, sVar.a());
                        } else {
                            if (this.c > -1 && (num = rVar.e) != null && num.intValue() != 0) {
                                int intValue = rVar.e.intValue();
                                int i = this.b;
                                if (intValue < i) {
                                    fVar2 = new com.fyber.inneractive.sdk.flow.vast.f(com.fyber.inneractive.sdk.flow.vast.e.BITRATE_NOT_IN_RANGE, java.lang.Integer.valueOf(i));
                                } else {
                                    int intValue2 = rVar.e.intValue();
                                    int i2 = this.c;
                                    if (intValue2 > i2) {
                                        fVar2 = new com.fyber.inneractive.sdk.flow.vast.f(com.fyber.inneractive.sdk.flow.vast.e.BITRATE_NOT_IN_RANGE, java.lang.Integer.valueOf(i2));
                                    }
                                }
                                fVar = fVar2;
                            }
                            if (com.fyber.inneractive.sdk.model.vast.t.a(rVar.d) != com.fyber.inneractive.sdk.model.vast.t.UNKNOWN) {
                                if (this.e && rVar.b.intValue() >= rVar.c.intValue()) {
                                    fVar = new com.fyber.inneractive.sdk.flow.vast.f(com.fyber.inneractive.sdk.flow.vast.e.VERTICAL_VIDEO_EXPECTED);
                                } else {
                                    java.lang.String str4 = rVar.f;
                                    if (str4 != null && this.f && str4.equalsIgnoreCase("VPAID")) {
                                        fVar = new com.fyber.inneractive.sdk.flow.vast.f(com.fyber.inneractive.sdk.flow.vast.e.FILTERED_BY_APP_OR_UNIT);
                                    } else if (android.text.TextUtils.isEmpty(rVar.g)) {
                                        fVar = new com.fyber.inneractive.sdk.flow.vast.f(com.fyber.inneractive.sdk.flow.vast.e.NO_CONTENT);
                                    } else {
                                        fVar = !com.fyber.inneractive.sdk.util.h0.f(rVar.g) ? new com.fyber.inneractive.sdk.flow.vast.f(com.fyber.inneractive.sdk.flow.vast.e.UNSECURED_VIDEO_URL) : null;
                                    }
                                }
                            } else {
                                fVar = new com.fyber.inneractive.sdk.flow.vast.f(com.fyber.inneractive.sdk.flow.vast.e.UNSUPPORTED_MIME_TYPE);
                            }
                        }
                        if (fVar != null) {
                            com.fyber.inneractive.sdk.util.IAlog.a("%smedia file filtered!: %s", "VastProcessor: ", rVar);
                            com.fyber.inneractive.sdk.util.IAlog.a("%s-- %s", "VastProcessor: ", rVar);
                            com.fyber.inneractive.sdk.util.IAlog.a("%s-- %s", "VastProcessor: ", fVar);
                            this.g.put(rVar, fVar);
                        } else {
                            com.fyber.inneractive.sdk.util.IAlog.a("%sadding media file: %s", "VastProcessor: ", rVar);
                            bVar.d.add(rVar);
                            bVar.k.add(rVar);
                            bVar.i++;
                        }
                    }
                }
                java.util.ArrayList arrayList3 = qVar.d;
                if (arrayList3 != null) {
                    java.util.Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        java.lang.String str5 = (java.lang.String) it5.next();
                        com.fyber.inneractive.sdk.model.vast.x xVar3 = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK;
                        if (com.fyber.inneractive.sdk.util.h0.f(str5)) {
                            bVar.a(xVar3, str5);
                        } else {
                            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorUnsecure", "found unsecure tracking event: " + xVar3.a());
                        }
                    }
                }
                java.util.ArrayList arrayList4 = qVar.b;
                if (arrayList4 != null) {
                    java.util.Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        com.fyber.inneractive.sdk.model.vast.w wVar = (com.fyber.inneractive.sdk.model.vast.w) it6.next();
                        com.fyber.inneractive.sdk.model.vast.x a2 = com.fyber.inneractive.sdk.model.vast.x.a(wVar.f3814a);
                        if (a2 != com.fyber.inneractive.sdk.model.vast.x.UNKNOWN) {
                            bVar.a(a2, wVar.b);
                        }
                        if (a2 == com.fyber.inneractive.sdk.model.vast.x.EVENT_PROGRESS) {
                            java.lang.String str6 = wVar.b;
                            java.lang.String str7 = wVar.c;
                            com.fyber.inneractive.sdk.model.vast.e eVar = new com.fyber.inneractive.sdk.model.vast.e(str6, str7);
                            if (!android.text.TextUtils.isEmpty(str6) && !android.text.TextUtils.isEmpty(str7) && eVar.d != 0) {
                                bVar.m.add(eVar);
                            }
                        }
                    }
                }
                if (!android.text.TextUtils.isEmpty(qVar.c)) {
                    bVar.b = qVar.c;
                }
                java.lang.String str8 = qVar.e;
                if (!android.text.TextUtils.isEmpty(str8) && (split = str8.split(":")) != null && split.length <= 3) {
                    if (split.length == 1) {
                        try {
                            java.lang.Integer.parseInt(str8);
                        } catch (java.lang.NumberFormatException unused) {
                        }
                    } else if (split.length == 2) {
                        java.lang.Integer.parseInt(split[1]);
                        java.lang.Integer.parseInt(split[0]);
                    } else {
                        java.lang.Integer.parseInt(split[2]);
                        java.lang.Integer.parseInt(split[1]);
                        java.lang.Integer.parseInt(split[0]);
                    }
                }
            }
            if (this.f3761a) {
                com.fyber.inneractive.sdk.model.vast.o oVar = gVar.e;
                if (oVar != null) {
                    bVar.f = oVar;
                }
                com.fyber.inneractive.sdk.model.vast.v vVar = gVar.g;
                if (vVar != null) {
                    bVar.p = vVar;
                }
                com.fyber.inneractive.sdk.model.vast.j jVar = mVar.b;
                java.util.ArrayList<com.fyber.inneractive.sdk.model.vast.h> arrayList5 = jVar == null ? null : jVar.f3805a;
                if (arrayList5 != null) {
                    for (com.fyber.inneractive.sdk.model.vast.h hVar2 : arrayList5) {
                        try {
                            a(bVar, hVar2, gVar.f);
                        } catch (com.fyber.inneractive.sdk.flow.vast.b e) {
                            com.fyber.inneractive.sdk.util.IAlog.a("Failed processing companion ad: %s error = %s", hVar2, e.getMessage());
                            hVar2.i = e;
                            this.h.add(hVar2);
                        }
                    }
                }
                java.util.ArrayList arrayList6 = gVar.h;
                java.lang.String str9 = !arrayList6.isEmpty() ? ((com.fyber.inneractive.sdk.model.vast.n) arrayList6.get(0)).f3808a : null;
                if (!android.text.TextUtils.isEmpty(str9)) {
                    bVar.n = str9;
                }
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.i iVar, int i, int i2, int i3, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, java.lang.String str3, com.fyber.inneractive.sdk.model.vast.k kVar) {
        com.fyber.inneractive.sdk.model.vast.h hVar;
        java.lang.Integer num;
        java.lang.Integer num2;
        com.fyber.inneractive.sdk.model.vast.c cVar = new com.fyber.inneractive.sdk.model.vast.c(iVar, i2, i3, str, i);
        cVar.g = str2;
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                com.fyber.inneractive.sdk.model.vast.w wVar = (com.fyber.inneractive.sdk.model.vast.w) it.next();
                cVar.a(com.fyber.inneractive.sdk.model.vast.x.a(wVar.f3814a), wVar.b);
            }
        }
        if (list != null) {
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                cVar.a(com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK, (java.lang.String) it2.next());
            }
        }
        if (!this.i.isEmpty()) {
            if (cVar.h > 0) {
                hVar = (com.fyber.inneractive.sdk.model.vast.h) this.i.remove(r2.size() - 1);
            } else {
                hVar = null;
            }
            java.lang.String str4 = cVar.e;
            java.util.Iterator it3 = this.i.iterator();
            while (it3.hasNext()) {
                com.fyber.inneractive.sdk.model.vast.h hVar2 = (com.fyber.inneractive.sdk.model.vast.h) it3.next();
                java.lang.String str5 = hVar2.c;
                if ((str4 != null && str4.equals(str5)) || ((str5 == null && (num = hVar2.f3804a) != null && cVar.c == num.intValue() && (num2 = hVar2.b) != null && cVar.d == num2.intValue()) || !hVar2.a())) {
                    java.util.ArrayList arrayList = hVar2.h;
                    if (arrayList.size() > 0) {
                        java.util.Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            java.lang.String str6 = (java.lang.String) it4.next();
                            if (com.fyber.inneractive.sdk.util.h0.f(str6)) {
                                cVar.a(com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK, str6);
                            }
                        }
                    }
                }
            }
            if (hVar != null) {
                this.i.add(hVar);
            }
        }
        cVar.f = str3;
        cVar.b = kVar;
        bVar.g.add(cVar);
        bVar.l.add(cVar);
    }
}
