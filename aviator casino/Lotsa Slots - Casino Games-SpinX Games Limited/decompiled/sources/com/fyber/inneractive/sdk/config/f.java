package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.cache.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3596a = false;

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String a() {
        java.lang.String str = com.fyber.inneractive.sdk.config.IAConfigManager.N.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("https://");
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
        if (android.text.TextUtils.isEmpty(property)) {
            sb.append("cdn2.inner-active.mobi/ia-sdk-config/apps/");
        } else {
            sb.append(property);
        }
        sb.append(str);
        sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        sb.append(str);
        sb.append(".json");
        java.lang.String sb2 = sb.toString();
        com.fyber.inneractive.sdk.util.IAlog.d("%s: %s", "APP_CONFIG_REQUEST", sb2);
        return sb2;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String b() {
        return "IALastModifiedFromHeader";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.String c() {
        return "inneractive.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        java.lang.String string = com.fyber.inneractive.sdk.util.o.f4302a.getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", null);
        return string != null && string.equalsIgnoreCase(com.fyber.inneractive.sdk.config.IAConfigManager.N.c);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(java.lang.Object obj) {
        com.fyber.inneractive.sdk.config.h0 h0Var = (com.fyber.inneractive.sdk.config.h0) obj;
        if (h0Var == null || h0Var.f3613a == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.o.f4302a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", h0Var.f3613a).apply();
    }

    public final void a(java.lang.String str, java.lang.Throwable th) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        if (this.f3596a) {
            return;
        }
        this.f3596a = true;
        if (android.text.TextUtils.isEmpty(str)) {
            str2 = "Empty Json Data";
        } else {
            str2 = str.substring(0, str.length() > 501 ? 500 : str.length() - 1);
        }
        if (th != null) {
            str3 = th.getClass().getName();
            str4 = th.getLocalizedMessage();
        } else {
            str3 = "Bad remote configuration";
            str4 = com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
        }
        java.lang.String str5 = com.fyber.inneractive.sdk.config.IAConfigManager.N.c;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.FATAL_CONFIGURATION_ERROR);
        if (str4 == null) {
            str4 = "No message";
        }
        if (android.text.TextUtils.isEmpty(str5)) {
            str5 = "EMPTY_APP_ID";
        }
        wVar.a("exception", str3, "message", str4, "data", str2, com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, str5).a((java.lang.String) null);
    }

    public static com.fyber.inneractive.sdk.config.h0 a(com.fyber.inneractive.sdk.config.remote.e eVar) {
        boolean z;
        com.fyber.inneractive.sdk.config.h0 h0Var;
        java.util.Iterator it;
        java.util.HashMap hashMap;
        java.lang.String str;
        java.util.HashMap hashMap2;
        java.util.Iterator it2;
        java.util.ArrayList arrayList;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType;
        int i;
        java.util.Set set;
        java.lang.Integer num;
        java.lang.Boolean bool;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType2;
        java.lang.String b;
        com.fyber.inneractive.sdk.config.remote.e eVar2 = eVar;
        com.fyber.inneractive.sdk.config.h0 h0Var2 = new com.fyber.inneractive.sdk.config.h0();
        h0Var2.c = eVar2.c;
        com.fyber.inneractive.sdk.config.remote.a aVar = eVar2.f3630a;
        h0Var2.b = aVar.b;
        h0Var2.f3613a = aVar.f3628a;
        java.util.Iterator it3 = eVar2.b.iterator();
        while (it3.hasNext()) {
            com.fyber.inneractive.sdk.config.remote.h hVar = (com.fyber.inneractive.sdk.config.remote.h) it3.next();
            java.util.HashMap hashMap3 = h0Var2.d;
            java.lang.String str2 = hVar.f3632a;
            com.fyber.inneractive.sdk.config.remote.a aVar2 = eVar2.f3630a;
            java.util.HashMap hashMap4 = h0Var2.e;
            com.fyber.inneractive.sdk.config.j0 j0Var = h0Var2.f;
            com.fyber.inneractive.sdk.config.q0 q0Var = new com.fyber.inneractive.sdk.config.q0();
            int i2 = 2;
            com.fyber.inneractive.sdk.config.remote.c[] cVarArr = {aVar2, hVar};
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    z = true;
                    break;
                }
                com.fyber.inneractive.sdk.config.remote.c cVar = cVarArr[i3];
                if (cVar != null && (b = cVar.b()) != null && b.equals("false")) {
                    z = false;
                    break;
                }
                i3++;
                i2 = 2;
            }
            q0Var.b = z;
            java.util.Iterator it4 = hVar.g.iterator();
            while (it4.hasNext()) {
                com.fyber.inneractive.sdk.config.remote.i iVar = (com.fyber.inneractive.sdk.config.remote.i) it4.next();
                com.fyber.inneractive.sdk.config.r0 r0Var = new com.fyber.inneractive.sdk.config.r0();
                java.lang.String str3 = iVar.f3633a;
                if (str3 != null) {
                    java.lang.String str4 = iVar.b;
                    if (str4 != null) {
                        r0Var.f3627a = str3;
                        r0Var.b = str4;
                        com.fyber.inneractive.sdk.config.remote.b bVar = iVar.c;
                        if (bVar != null) {
                            com.fyber.inneractive.sdk.config.remote.b bVar2 = hVar.c;
                            com.fyber.inneractive.sdk.config.remote.b bVar3 = aVar2.e;
                            com.fyber.inneractive.sdk.config.l0 l0Var = new com.fyber.inneractive.sdk.config.l0();
                            it = it3;
                            com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType3 = bVar.f3629a;
                            it2 = it4;
                            if (unitDisplayType3 == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER || unitDisplayType3 == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT || unitDisplayType3.isFullscreenUnit()) {
                                l0Var.b = bVar.f3629a;
                                java.lang.Integer num2 = bVar.c;
                                java.lang.Integer num3 = bVar2 != null ? bVar2.c : null;
                                if (bVar3 != null) {
                                    h0Var = h0Var2;
                                    num = bVar3.c;
                                    hashMap = hashMap3;
                                    str = str2;
                                } else {
                                    h0Var = h0Var2;
                                    hashMap = hashMap3;
                                    str = str2;
                                    num = null;
                                }
                                java.lang.Integer num4 = (java.lang.Integer) a((java.lang.Object) null, num2, num3, num);
                                if (num4 != null && num4.intValue() >= 5 && num4.intValue() <= 60) {
                                    l0Var.f3619a = num4;
                                }
                                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                                java.lang.Boolean bool3 = bVar.b;
                                java.lang.Boolean bool4 = bVar2 != null ? bVar2.b : null;
                                if (bVar3 != null) {
                                    bool = bVar3.b;
                                    hashMap2 = hashMap4;
                                } else {
                                    hashMap2 = hashMap4;
                                    bool = null;
                                }
                                java.lang.Boolean bool5 = (java.lang.Boolean) a(bool2, bool3, bool4, bool);
                                bool5.getClass();
                                l0Var.c = bool5;
                                java.lang.Integer num5 = (java.lang.Integer) a((java.lang.Object) null, bVar.d, bVar2 != null ? bVar2.d : null, bVar3 != null ? bVar3.d : null);
                                if (num5 != null && num5.intValue() >= 5 && num5.intValue() <= 60) {
                                    l0Var.d = num5;
                                }
                                if (l0Var.d == null && !l0Var.c.booleanValue() && ((unitDisplayType2 = bVar.f3629a) == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL || unitDisplayType2 == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED)) {
                                    l0Var.c = bool2;
                                }
                                r0Var.c = l0Var;
                            } else {
                                it3 = it;
                                it4 = it2;
                            }
                        } else {
                            h0Var = h0Var2;
                            it = it3;
                            hashMap = hashMap3;
                            str = str2;
                            hashMap2 = hashMap4;
                            it2 = it4;
                        }
                        com.fyber.inneractive.sdk.config.remote.j jVar = iVar.f;
                        if (jVar != null || iVar.e != null) {
                            if (jVar != null) {
                                com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType4 = jVar.j;
                                com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType5 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED;
                                if (unitDisplayType4 == unitDisplayType5 && iVar.c == null) {
                                    com.fyber.inneractive.sdk.config.l0 l0Var2 = new com.fyber.inneractive.sdk.config.l0();
                                    r0Var.c = l0Var2;
                                    l0Var2.c = java.lang.Boolean.FALSE;
                                    l0Var2.d = -1;
                                    com.fyber.inneractive.sdk.config.l0 l0Var3 = r0Var.c;
                                    l0Var3.b = unitDisplayType5;
                                    l0Var3.f3619a = -1;
                                }
                            }
                            com.fyber.inneractive.sdk.config.t0 t0Var = new com.fyber.inneractive.sdk.config.t0();
                            com.fyber.inneractive.sdk.config.remote.j jVar2 = iVar.f;
                            com.fyber.inneractive.sdk.config.remote.j jVar3 = hVar.e;
                            com.fyber.inneractive.sdk.config.remote.j jVar4 = aVar2.d;
                            if (jVar2 != null && ((unitDisplayType = jVar2.j) == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.LANDSCAPE || unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.SQUARE || unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL || unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.VERTICAL || unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED || unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT)) {
                                t0Var.j = unitDisplayType;
                            } else {
                                if (iVar.e != null) {
                                    t0Var.j = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.NATIVE;
                                    r0Var.e = new com.fyber.inneractive.sdk.config.p0();
                                }
                                it3 = it;
                                it4 = it2;
                                h0Var2 = h0Var;
                                hashMap3 = hashMap;
                                str2 = str;
                                hashMap4 = hashMap2;
                            }
                            java.lang.Object a2 = a((java.lang.Object) null, jVar2 != null ? jVar2.f3634a : null, jVar3 != null ? jVar3.f3634a : null, jVar4 != null ? jVar4.f3634a : null);
                            if (a2 != null) {
                                t0Var.f3638a = (java.lang.Boolean) a2;
                                t0Var.b = (java.lang.Integer) a((java.lang.Object) 5000, jVar2 != null ? jVar2.b : null, jVar3 != null ? jVar3.b : null, jVar4 != null ? jVar4.b : null);
                                java.lang.Integer num6 = (java.lang.Integer) a((java.lang.Object) 0, jVar2 != null ? jVar2.c : null, jVar3 != null ? jVar3.c : null, jVar4 != null ? jVar4.c : null);
                                t0Var.c = java.lang.Integer.valueOf(num6.intValue() < 0 ? 0 : num6.intValue());
                                t0Var.d = (java.lang.Boolean) a(java.lang.Boolean.TRUE, jVar2 != null ? jVar2.e : null, jVar3 != null ? jVar3.e : null, jVar4 != null ? jVar4.e : null);
                                t0Var.e = (com.fyber.inneractive.sdk.config.enums.Orientation) a(com.fyber.inneractive.sdk.config.enums.Orientation.USER, jVar2 != null ? jVar2.g : null, jVar3 != null ? jVar3.g : null, jVar4 != null ? jVar4.g : null);
                                java.lang.Integer num7 = (java.lang.Integer) a((java.lang.Object) 0, jVar2 != null ? jVar2.i : null, jVar3 != null ? jVar3.i : null, jVar4 != null ? jVar4.i : null);
                                t0Var.f = java.lang.Integer.valueOf(num7.intValue() < 0 ? 0 : num7.intValue());
                                java.lang.Integer num8 = (java.lang.Integer) a((java.lang.Object) 2048, jVar2 != null ? jVar2.h : null, jVar3 != null ? jVar3.h : null, jVar4 != null ? jVar4.h : null);
                                if (num8.intValue() > t0Var.b.intValue()) {
                                    num8 = t0Var.b;
                                }
                                t0Var.g = num8;
                                t0Var.h = (com.fyber.inneractive.sdk.config.enums.Skip) a(com.fyber.inneractive.sdk.config.enums.Skip._0, jVar2 != null ? jVar2.d : null, jVar3 != null ? jVar3.d : null, jVar4 != null ? jVar4.d : null);
                                t0Var.i = (com.fyber.inneractive.sdk.config.enums.TapAction) a(com.fyber.inneractive.sdk.config.enums.TapAction.DO_NOTHING, jVar2 != null ? jVar2.f : null, jVar3 != null ? jVar3.f : null, jVar4 != null ? jVar4.f : null);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                com.fyber.inneractive.sdk.config.remote.j a3 = new com.fyber.inneractive.sdk.config.remote.d[]{iVar}[0].a();
                                if (a3 != null && (arrayList = a3.k) != null && arrayList.size() > 0) {
                                    arrayList2 = a3.k;
                                }
                                t0Var.k = arrayList2;
                                r0Var.f = t0Var;
                            }
                            it3 = it;
                            it4 = it2;
                            h0Var2 = h0Var;
                            hashMap3 = hashMap;
                            str2 = str;
                            hashMap4 = hashMap2;
                        }
                        com.fyber.inneractive.sdk.config.o0 o0Var = new com.fyber.inneractive.sdk.config.o0();
                        java.util.HashSet hashSet = new java.util.HashSet();
                        com.fyber.inneractive.sdk.config.remote.f fVar = iVar.d;
                        java.util.Set set2 = fVar != null ? fVar.f3631a : null;
                        com.fyber.inneractive.sdk.config.remote.f fVar2 = hVar.d;
                        java.util.Set set3 = fVar2 != null ? fVar2.f3631a : null;
                        com.fyber.inneractive.sdk.config.remote.f fVar3 = aVar2.c;
                        o0Var.f3623a = (java.util.Set) a(hashSet, set2, set3, fVar3 != null ? fVar3.f3631a : null);
                        r0Var.d = o0Var;
                        com.fyber.inneractive.sdk.config.u0 u0Var = new com.fyber.inneractive.sdk.config.u0();
                        com.fyber.inneractive.sdk.config.remote.k kVar = iVar.g;
                        com.fyber.inneractive.sdk.config.remote.k kVar2 = hVar.f;
                        com.fyber.inneractive.sdk.config.remote.k kVar3 = aVar2.f;
                        java.lang.Integer num9 = (java.lang.Integer) a((java.lang.Object) 1, kVar != null ? kVar.f3635a : null, kVar2 != null ? kVar2.f3635a : null, kVar3 != null ? kVar3.f3635a : null);
                        if (num9.intValue() <= 0 && num9.intValue() > 100) {
                            u0Var.f3640a = 1;
                        } else {
                            u0Var.f3640a = num9;
                        }
                        java.lang.Integer num10 = (java.lang.Integer) a((java.lang.Object) 0, kVar != null ? kVar.b : null, kVar2 != null ? kVar2.b : null, kVar3 != null ? kVar3.b : null);
                        if (num10.intValue() < 0 && num10.intValue() > 100) {
                            u0Var.b = 0;
                        } else {
                            u0Var.b = num10;
                        }
                        java.util.HashSet hashSet2 = new java.util.HashSet();
                        java.util.Set set4 = kVar != null ? kVar.c : null;
                        java.util.Set set5 = kVar2 != null ? kVar2.c : null;
                        if (kVar3 != null) {
                            set = kVar3.c;
                            i = 3;
                        } else {
                            i = 3;
                            set = null;
                        }
                        java.lang.Object[] objArr = new java.lang.Object[i];
                        objArr[0] = set4;
                        objArr[1] = set5;
                        objArr[2] = set;
                        java.util.Set<com.fyber.inneractive.sdk.config.enums.Vendor> set6 = (java.util.Set) a(hashSet2, objArr);
                        u0Var.c = set6;
                        r0Var.g = u0Var;
                        if (j0Var != null && set6 != null) {
                            for (com.fyber.inneractive.sdk.config.enums.Vendor vendor : set6) {
                                if (vendor != null && !j0Var.f3615a.contains(vendor)) {
                                    j0Var.f3615a.add(vendor);
                                }
                            }
                        }
                        q0Var.f3626a.add(r0Var);
                        java.util.HashMap hashMap5 = hashMap2;
                        hashMap5.put(r0Var.f3627a, r0Var);
                        hashMap4 = hashMap5;
                        it3 = it;
                        it4 = it2;
                        h0Var2 = h0Var;
                        hashMap3 = hashMap;
                        str2 = str;
                    }
                } else {
                    it3 = it3;
                }
            }
            hashMap3.put(str2, q0Var);
            eVar2 = eVar;
        }
        return h0Var2;
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.Object... objArr) {
        for (java.lang.Object obj2 : objArr) {
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final java.lang.Object a(java.lang.String str) {
        try {
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            iAConfigManager.C.i();
            com.fyber.inneractive.sdk.config.remote.e a2 = com.fyber.inneractive.sdk.config.remote.e.a(new org.json.JSONObject(str));
            java.lang.String str2 = iAConfigManager.c;
            if (a2 != null && str2.equals(a2.f3630a.f3628a)) {
                return a(a2);
            }
            com.fyber.inneractive.sdk.util.IAlog.b("internal error while parsing local configuration", new java.lang.Object[0]);
            if (a2 != null && !str2.equals(a2.f3630a.f3628a)) {
                throw new com.fyber.inneractive.sdk.external.InvalidAppIdException();
            }
            a(str, (java.lang.Throwable) null);
            return null;
        } catch (java.lang.Throwable th) {
            a(str, th);
            com.fyber.inneractive.sdk.util.IAlog.b("Exception Error while parsing local configuration", new java.lang.Object[0]);
            throw th;
        }
    }
}
