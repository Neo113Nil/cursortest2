package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public final class B implements com.yandex.varioqub.config.VarioqubApi {

    /* renamed from: a, reason: collision with root package name */
    public com.yandex.varioqub.config.impl.C0102a f2651a;

    /* renamed from: b, reason: collision with root package name */
    public com.yandex.varioqub.config.impl.C0104c f2652b;

    /* renamed from: c, reason: collision with root package name */
    public com.yandex.varioqub.config.impl.t f2653c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Executor f2654d;

    /* renamed from: e, reason: collision with root package name */
    public com.yandex.varioqub.config.impl.g f2655e;

    /* renamed from: f, reason: collision with root package name */
    public com.yandex.varioqub.config.VarioqubSettings f2656f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f2657g = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX WARN: Finally extract failed */
    public static final void a(com.yandex.varioqub.config.impl.B b2, com.yandex.varioqub.config.OnFetchCompleteListener onFetchCompleteListener) {
        java.util.LinkedHashMap L2;
        java.lang.Object wVar;
        com.yandex.varioqub.config.impl.C0104c c0104c;
        boolean z2;
        I1.q qVar;
        com.yandex.varioqub.config.impl.C0104c c0104c2 = b2.f2652b;
        if (c0104c2 == null) {
            kotlin.jvm.internal.i.i("configFetcher");
            throw null;
        }
        com.yandex.varioqub.config.VarioqubSettings varioqubSettings = b2.f2656f;
        if (varioqubSettings == null) {
            kotlin.jvm.internal.i.i("settings");
            throw null;
        }
        com.yandex.varioqub.config.impl.g gVar = b2.f2655e;
        if (gVar == null) {
            kotlin.jvm.internal.i.i("identifierProvider");
            throw null;
        }
        c0104c2.a();
        com.yandex.varioqub.config.impl.h hVar = gVar.f2683b.await(10L, java.util.concurrent.TimeUnit.SECONDS) ? new com.yandex.varioqub.config.impl.h(gVar.f2684c, gVar.f2685d) : null;
        if (hVar == null) {
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onError("identifiers is null", com.yandex.varioqub.config.FetchError.IDENTIFIERS_NULL);
                return;
            }
            return;
        }
        c0104c2.f2670e.getClass();
        if (java.lang.System.currentTimeMillis() - c0104c2.f2671f <= c0104c2.f2667b) {
            if (com.yandex.varioqub.config.impl.C.f2658a) {
                android.util.Log.d("Varioqub/ConfigFetcher", "fetch request was throttled");
            }
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onError("fetch request was throttled", com.yandex.varioqub.config.FetchError.REQUEST_THROTTLED);
                return;
            }
            return;
        }
        com.yandex.varioqub.config.impl.l.b(1);
        com.yandex.varioqub.config.impl.i iVar = c0104c2.f2666a;
        java.lang.String a2 = com.yandex.varioqub.config.impl.D.a(varioqubSettings.getClientId$config_release());
        java.lang.String str = c0104c2.f2674i;
        java.lang.String str2 = hVar.f2686a;
        java.lang.String str3 = hVar.f2687b;
        java.util.Map<java.lang.String, java.lang.String> clientFeatures$config_release = varioqubSettings.getClientFeatures$config_release();
        java.lang.String adapterName = c0104c2.f2669d.f2660a.getAdapterName();
        com.yandex.varioqub.config.impl.p pVar = new com.yandex.varioqub.config.impl.p();
        pVar.f2701a = str;
        pVar.f2702b = str2;
        pVar.f2706f = com.yandex.varioqub.config.impl.AbstractC0103b.c().versionName;
        pVar.f2707g = com.yandex.varioqub.config.impl.AbstractC0103b.d();
        pVar.f2704d = "0.7.0";
        pVar.f2705e = io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.APP_PLATFORM;
        pVar.f2708h = com.yandex.varioqub.config.impl.AbstractC0103b.b();
        pVar.f2709i = str3;
        java.util.ArrayList arrayList = new java.util.ArrayList(clientFeatures$config_release.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : clientFeatures$config_release.entrySet()) {
            com.yandex.varioqub.config.impl.n nVar = new com.yandex.varioqub.config.impl.n();
            nVar.f2696a = entry.getKey();
            nVar.f2697b = entry.getValue();
            arrayList.add(nVar);
        }
        java.lang.Object[] array = arrayList.toArray(new com.yandex.varioqub.config.impl.n[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        pVar.f2703c = (com.yandex.varioqub.config.impl.n[]) array;
        synchronized (com.yandex.varioqub.config.impl.l.f2694c) {
            L2 = i1.AbstractC0202u.L(com.yandex.varioqub.config.impl.l.f2693b);
        }
        int size = L2.size();
        com.yandex.varioqub.config.impl.o[] oVarArr = new com.yandex.varioqub.config.impl.o[size];
        for (int i2 = 0; i2 < size; i2++) {
            oVarArr[i2] = new com.yandex.varioqub.config.impl.o();
        }
        int i3 = 0;
        for (java.lang.Object obj : L2.entrySet()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                i1.AbstractC0191j.J();
                throw null;
            }
            com.yandex.varioqub.config.impl.o oVar = new com.yandex.varioqub.config.impl.o();
            oVar.f2699a = (java.lang.String) ((java.util.Map.Entry) obj).getKey();
            oVar.f2700b = ((java.lang.Number) r12.getValue()).longValue();
            oVarArr[i3] = oVar;
            i3 = i4;
            c0104c2 = c0104c2;
        }
        com.yandex.varioqub.config.impl.C0104c c0104c3 = c0104c2;
        pVar.f2710j = oVarArr;
        pVar.f2711k = java.lang.String.valueOf(com.yandex.varioqub.config.impl.AbstractC0103b.a());
        pVar.f2712l = android.os.Build.VERSION.RELEASE;
        pVar.f2713m = adapterName;
        pVar.f2714n = adapterName;
        java.lang.String str4 = "Varioqub request formed - " + pVar;
        if (com.yandex.varioqub.config.impl.C.f2658a) {
            android.util.Log.d("Varioqub/RequestBodyFormer", str4);
        }
        byte[] byteArray = com.yandex.varioqub.protobuf.nano.MessageNano.toByteArray(pVar);
        if (iVar.f2689b.compareAndSet(false, true)) {
            android.content.Context context = com.yandex.varioqub.config.impl.AbstractC0105d.f2679a;
            if (context == null) {
                kotlin.jvm.internal.i.i("appContext");
                throw null;
            }
            java.lang.String string = context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0).getString("etag", "");
            if (string == null) {
                string = "";
            }
            iVar.f2690c = string;
        }
        java.lang.String str5 = "Network request to: " + a2 + ". Content length - " + byteArray.length;
        if (com.yandex.varioqub.config.impl.C.f2658a) {
            android.util.Log.d("Varioqub/NetworkClient", str5);
        }
        try {
            I1.u uVar = new I1.u();
            java.util.regex.Pattern pattern = I1.q.f770a;
            try {
                qVar = u0.AbstractC0995a.m();
            } catch (java.lang.IllegalArgumentException unused) {
                qVar = null;
            }
            int length = byteArray.length;
            J1.b.c(byteArray.length, 0, length);
            uVar.c("POST", new I1.w(qVar, length, byteArray, 0));
            uVar.d(a2);
            uVar.b("If-None-Match", iVar.f2690c);
            I1.v a3 = uVar.a();
            I1.s sVar = iVar.f2688a;
            sVar.getClass();
            I1.y c2 = new M1.i(sVar, a3).c();
            try {
                java.lang.String a4 = I1.y.a(c2, "ETag");
                if (a4 == null) {
                    a4 = "";
                }
                iVar.f2690c = a4;
                com.yandex.varioqub.config.impl.m.b(a4);
                int i5 = c2.f860d;
                if (200 > i5 || i5 >= 300) {
                    wVar = i5 == 304 ? com.yandex.varioqub.config.impl.v.f2729a : new com.yandex.varioqub.config.impl.x(i5);
                } else {
                    I1.z zVar = c2.f863g;
                    byte[] a5 = zVar != null ? zVar.a() : null;
                    if (a5 == null) {
                        a5 = new byte[0];
                    }
                    wVar = new com.yandex.varioqub.config.impl.y(a5);
                }
                Q1.d.g(c2, null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    Q1.d.g(c2, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            java.lang.String str6 = "request for " + a2 + " failed : ";
            if (com.yandex.varioqub.config.impl.C.f2658a) {
                android.util.Log.e("Varioqub/NetworkClient", str6, th3);
            }
            wVar = new com.yandex.varioqub.config.impl.w(th3);
        }
        if (wVar instanceof com.yandex.varioqub.config.impl.v) {
            if (com.yandex.varioqub.config.impl.C.f2658a) {
                android.util.Log.d("Varioqub/ConfigFetcher", "fetch response from cache");
            }
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onSuccess();
            }
        } else if (wVar instanceof com.yandex.varioqub.config.impl.w) {
            java.lang.String str7 = "fetch failed with exception " + ((com.yandex.varioqub.config.impl.w) wVar).f2730a;
            if (com.yandex.varioqub.config.impl.C.f2658a) {
                android.util.Log.d("Varioqub/ConfigFetcher", str7);
            }
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onError(str7, com.yandex.varioqub.config.FetchError.INTERNAL_ERROR);
            }
        } else if (wVar instanceof com.yandex.varioqub.config.impl.x) {
            java.lang.String str8 = "failed with network code " + ((com.yandex.varioqub.config.impl.x) wVar).f2731a;
            if (com.yandex.varioqub.config.impl.C.f2658a) {
                android.util.Log.d("Varioqub/ConfigFetcher", str8);
            }
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onError(str8, com.yandex.varioqub.config.FetchError.NETWORK_ERROR);
            }
        } else if (wVar instanceof com.yandex.varioqub.config.impl.y) {
            com.yandex.varioqub.config.impl.y yVar = (com.yandex.varioqub.config.impl.y) wVar;
            c0104c = c0104c3;
            c0104c.f2673h.clear();
            if (yVar.f2732a.length == 0) {
                boolean z3 = com.yandex.varioqub.config.impl.C.f2658a;
                if (z3 && z3) {
                    android.util.Log.e("Varioqub/Varioqub/ConfigFetcher", "fetch failed with empty body", null);
                }
                if (onFetchCompleteListener != null) {
                    onFetchCompleteListener.onError("fetch failed with empty body", com.yandex.varioqub.config.FetchError.EMPTY_RESULT);
                }
            }
            try {
                com.yandex.varioqub.config.impl.r rVar = (com.yandex.varioqub.config.impl.r) com.yandex.varioqub.protobuf.nano.MessageNano.mergeFrom(new com.yandex.varioqub.config.impl.r(), yVar.f2732a);
                java.lang.String str9 = "fetched config - " + rVar;
                if (com.yandex.varioqub.config.impl.C.f2658a) {
                    android.util.Log.d("Varioqub/ConfigFetcher", str9);
                }
                c0104c.f2678m = !kotlin.jvm.internal.i.a(c0104c.f2675j, rVar.f2719b);
                c0104c.f2675j = rVar.f2719b;
                c0104c.f2674i = rVar.f2718a;
                c0104c.f2676k = rVar.f2721d;
                for (com.yandex.varioqub.config.impl.q qVar2 : rVar.f2720c) {
                    java.lang.String str10 = qVar2.f2716a;
                    com.yandex.varioqub.config.impl.s[] sVarArr = qVar2.f2717b;
                    kotlin.jvm.internal.i.e(sVarArr, "<this>");
                    if (sVarArr.length == 0) {
                        throw new java.util.NoSuchElementException("Array is empty.");
                    }
                    long j2 = sVarArr[sVarArr.length - 1].f2724b;
                    com.yandex.varioqub.config.impl.s[] sVarArr2 = qVar2.f2717b;
                    kotlin.jvm.internal.i.e(sVarArr2, "<this>");
                    if (sVarArr2.length == 0) {
                        throw new java.util.NoSuchElementException("Array is empty.");
                    }
                    com.yandex.varioqub.config.impl.s sVar2 = sVarArr2[sVarArr2.length - 1];
                    c0104c.f2673h.put(str10, new com.yandex.varioqub.config.model.ConfigValue(sVar2.f2725c ? null : sVar2.f2723a, 2, j2));
                }
                if (onFetchCompleteListener != null) {
                    onFetchCompleteListener.onSuccess();
                }
                c0104c.f2670e.getClass();
                c0104c.f2672g = java.lang.System.currentTimeMillis();
            } catch (java.lang.Throwable th4) {
                if (com.yandex.varioqub.config.impl.C.f2658a) {
                    android.util.Log.e("Varioqub/ConfigFetcher", "exception while fetch ", th4);
                }
                if (onFetchCompleteListener != null) {
                    onFetchCompleteListener.onError("exception while fetch ", com.yandex.varioqub.config.FetchError.RESPONSE_PARSE_ERROR);
                }
            }
            c0104c.f2670e.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            c0104c.f2671f = currentTimeMillis;
            com.yandex.varioqub.config.impl.m.a(currentTimeMillis);
            com.yandex.varioqub.config.impl.m.b(c0104c.f2672g);
            if (!com.yandex.varioqub.config.impl.m.a().edit().putString("experiments", c0104c.f2675j).commit() && (z2 = com.yandex.varioqub.config.impl.C.f2658a) && z2) {
                android.util.Log.e("Varioqub/Varioqub/PreferenceManager", "save experiments failed", null);
            }
            com.yandex.varioqub.config.impl.m.c(c0104c.f2674i);
            com.yandex.varioqub.config.impl.m.b(c0104c.f2673h);
            com.yandex.varioqub.config.impl.m.a(c0104c.f2678m);
            com.yandex.varioqub.config.impl.l.a(1);
        }
        c0104c = c0104c3;
        c0104c.f2670e.getClass();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        c0104c.f2671f = currentTimeMillis2;
        com.yandex.varioqub.config.impl.m.a(currentTimeMillis2);
        com.yandex.varioqub.config.impl.m.b(c0104c.f2672g);
        if (!com.yandex.varioqub.config.impl.m.a().edit().putString("experiments", c0104c.f2675j).commit()) {
            android.util.Log.e("Varioqub/Varioqub/PreferenceManager", "save experiments failed", null);
        }
        com.yandex.varioqub.config.impl.m.c(c0104c.f2674i);
        com.yandex.varioqub.config.impl.m.b(c0104c.f2673h);
        com.yandex.varioqub.config.impl.m.a(c0104c.f2678m);
        com.yandex.varioqub.config.impl.l.a(1);
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void activateConfig(s1.InterfaceC0991a interfaceC0991a) {
        a();
        com.yandex.varioqub.config.impl.C0104c c0104c = this.f2652b;
        if (c0104c == null) {
            kotlin.jvm.internal.i.i("configFetcher");
            throw null;
        }
        c0104c.a();
        com.yandex.varioqub.config.impl.C0102a c0102a = c0104c.f2669d;
        java.lang.String str = c0104c.f2676k;
        long j2 = c0104c.f2672g;
        if (!kotlin.jvm.internal.i.a(c0102a.f2664e, str) && c0102a.f2661b.getActivateEvent$config_release()) {
            c0102a.f2660a.reportConfigChanged(new com.yandex.varioqub.analyticadapter.data.ConfigData(c0102a.f2664e, str, j2));
            com.yandex.varioqub.config.impl.m.a(str);
        }
        c0102a.f2664e = str;
        if (c0104c.f2678m) {
            com.yandex.varioqub.config.impl.C0102a c0102a2 = c0104c.f2669d;
            java.util.Collection values = c0104c.f2673h.values();
            c0102a2.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(values));
            java.util.Iterator it = values.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((com.yandex.varioqub.config.model.ConfigValue) it.next()).getTestId()));
            }
            java.util.Set b02 = i1.AbstractC0190i.b0(arrayList);
            java.util.Set other = c0102a2.f2662c;
            kotlin.jvm.internal.i.e(other, "other");
            java.util.Set a02 = i1.AbstractC0190i.a0(b02);
            a02.retainAll(other);
            java.util.Set<java.lang.Long> a03 = i1.AbstractC0190i.a0(a02);
            c0102a2.f2662c = a03;
            c0102a2.f2660a.setTriggeredTestIds(a03);
            com.yandex.varioqub.config.impl.m.a(c0102a2.f2662c);
            com.yandex.varioqub.config.impl.C0102a c0102a3 = c0104c.f2669d;
            java.lang.String str2 = c0104c.f2675j;
            c0102a3.f2663d = str2;
            c0102a3.f2660a.setExperiments(str2);
            c0104c.f2678m = false;
        }
        com.yandex.varioqub.config.impl.t tVar = c0104c.f2668c;
        java.util.HashMap hashMap = new java.util.HashMap(c0104c.f2673h);
        tVar.a();
        tVar.f2727b = hashMap;
        com.yandex.varioqub.config.impl.m.a(hashMap);
        if (interfaceC0991a != null) {
            interfaceC0991a.invoke();
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void clearClientFeatures() {
        java.util.concurrent.Executor executor = this.f2654d;
        if (executor != null) {
            executor.execute(new F0.a(1, this));
        } else {
            kotlin.jvm.internal.i.i("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void fetchConfig(com.yandex.varioqub.config.OnFetchCompleteListener onFetchCompleteListener) {
        a();
        java.util.concurrent.Executor executor = this.f2654d;
        if (executor != null) {
            executor.execute(new F0.c(0, this, onFetchCompleteListener));
        } else {
            kotlin.jvm.internal.i.i("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final java.util.Set getAllKeys() {
        a();
        com.yandex.varioqub.config.impl.t tVar = this.f2653c;
        if (tVar == null) {
            kotlin.jvm.internal.i.i("storage");
            throw null;
        }
        tVar.a();
        java.util.Set keySet = tVar.f2727b.keySet();
        java.util.Set other = tVar.f2726a.keySet();
        kotlin.jvm.internal.i.e(keySet, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        java.util.Set a02 = i1.AbstractC0190i.a0(keySet);
        a02.addAll(other);
        return i1.AbstractC0190i.b0(a02);
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final boolean getBoolean(java.lang.String str, boolean z2) {
        com.yandex.varioqub.config.model.ConfigValue value = getValue(str);
        return value != null ? value.asBoolean() : z2;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final double getDouble(java.lang.String str, double d2) {
        com.yandex.varioqub.config.model.ConfigValue value = getValue(str);
        return value != null ? value.asDouble() : d2;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final java.lang.String getId() {
        a();
        com.yandex.varioqub.config.impl.C0104c c0104c = this.f2652b;
        if (c0104c != null) {
            c0104c.a();
            return c0104c.f2674i;
        }
        kotlin.jvm.internal.i.i("configFetcher");
        throw null;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final long getLong(java.lang.String str, long j2) {
        com.yandex.varioqub.config.model.ConfigValue value = getValue(str);
        return value != null ? value.asLong() : j2;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.lang.String asString;
        com.yandex.varioqub.config.model.ConfigValue value = getValue(str);
        return (value == null || (asString = value.asString()) == null) ? str2 : asString;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final com.yandex.varioqub.config.model.ConfigValue getValue(java.lang.String str) {
        a();
        com.yandex.varioqub.config.impl.t tVar = this.f2653c;
        if (tVar == null) {
            kotlin.jvm.internal.i.i("storage");
            throw null;
        }
        tVar.a();
        com.yandex.varioqub.config.model.ConfigValue configValue = (com.yandex.varioqub.config.model.ConfigValue) tVar.f2727b.get(str);
        if (configValue == null) {
            tVar.a();
            configValue = (com.yandex.varioqub.config.model.ConfigValue) tVar.f2726a.get(str);
        }
        if (configValue == null || configValue.getTestId() <= 0) {
            return configValue;
        }
        com.yandex.varioqub.config.impl.C0102a c0102a = this.f2651a;
        if (c0102a == null) {
            kotlin.jvm.internal.i.i("analyticAdapter");
            throw null;
        }
        long testId = configValue.getTestId();
        synchronized (c0102a.f2665f) {
            c0102a.f2662c.add(java.lang.Long.valueOf(testId));
        }
        c0102a.f2660a.setTriggeredTestIds(c0102a.f2662c);
        com.yandex.varioqub.config.impl.m.a(c0102a.f2662c);
        if (configValue.getValue() != null) {
            return configValue;
        }
        com.yandex.varioqub.config.impl.t tVar2 = this.f2653c;
        if (tVar2 != null) {
            tVar2.a();
            return (com.yandex.varioqub.config.model.ConfigValue) tVar2.f2726a.get(str);
        }
        kotlin.jvm.internal.i.i("storage");
        throw null;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void init(com.yandex.varioqub.config.VarioqubSettings varioqubSettings, com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter varioqubConfigAdapter, android.content.Context context) {
        if (this.f2657g.get()) {
            return;
        }
        synchronized (this) {
            if (!this.f2657g.get()) {
                com.yandex.varioqub.config.impl.l.b(2);
                com.yandex.varioqub.config.impl.C0102a c0102a = new com.yandex.varioqub.config.impl.C0102a(varioqubConfigAdapter, varioqubSettings);
                java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
                com.yandex.varioqub.config.impl.t tVar = new com.yandex.varioqub.config.impl.t();
                a(varioqubSettings, c0102a, newSingleThreadExecutor, context, tVar, new com.yandex.varioqub.config.impl.C0104c(new com.yandex.varioqub.config.impl.i(), java.util.concurrent.TimeUnit.SECONDS.toMillis(varioqubSettings.getFetchThrottleIntervalSec$config_release()), tVar, c0102a, new com.yandex.varioqub.config.impl.u()), new com.yandex.varioqub.config.impl.g(c0102a));
                com.yandex.varioqub.config.impl.l.a(2);
            }
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void putClientFeature(java.lang.String str, java.lang.String str2) {
        java.util.concurrent.Executor executor = this.f2654d;
        if (executor != null) {
            executor.execute(new F0.b(this, str, str2, 0));
        } else {
            kotlin.jvm.internal.i.i("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void setDefaults(java.util.Map map) {
        a();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), com.yandex.varioqub.config.model.ConfigValue.Companion.createInappDefault$config_release(entry.getValue().toString()));
        }
        com.yandex.varioqub.config.impl.t tVar = this.f2653c;
        if (tVar == null) {
            kotlin.jvm.internal.i.i("storage");
            throw null;
        }
        tVar.f2726a = hashMap;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void setDefaults(int i2, s1.InterfaceC0991a interfaceC0991a) {
        a();
        java.util.concurrent.Executor executor = this.f2654d;
        if (executor != null) {
            executor.execute(new F0.d(this, i2, interfaceC0991a, 0));
        } else {
            kotlin.jvm.internal.i.i("executor");
            throw null;
        }
    }

    public static final void a(com.yandex.varioqub.config.impl.B b2, int i2, s1.InterfaceC0991a interfaceC0991a) {
        com.yandex.varioqub.config.impl.t tVar = b2.f2653c;
        if (tVar == null) {
            kotlin.jvm.internal.i.i("storage");
            throw null;
        }
        if (i2 != -1) {
            android.content.Context context = com.yandex.varioqub.config.impl.AbstractC0105d.f2679a;
            if (context != null) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                if (context.getResources() != null) {
                    android.content.res.XmlResourceParser xml = context.getResources().getXml(i2);
                    java.lang.String str = "";
                    java.lang.String str2 = str;
                    java.lang.String str3 = str2;
                    while (xml.next() != 1) {
                        int eventType = xml.getEventType();
                        if (eventType == 2) {
                            str2 = xml.getName();
                        } else if (eventType == 3) {
                            if (kotlin.jvm.internal.i.a(xml.getName(), "entry") && str.length() > 0 && str3.length() > 0) {
                                linkedHashMap.put(str, com.yandex.varioqub.config.model.ConfigValue.Companion.createInappDefault$config_release(str3));
                            }
                            str2 = "";
                        } else if (eventType == 4) {
                            if (kotlin.jvm.internal.i.a(str2, "key")) {
                                str = xml.getText();
                            } else if (kotlin.jvm.internal.i.a(str2, "value")) {
                                str3 = xml.getText();
                            }
                        }
                    }
                }
                tVar.f2726a = linkedHashMap;
                if (interfaceC0991a != null) {
                    interfaceC0991a.invoke();
                    return;
                }
                return;
            }
            kotlin.jvm.internal.i.i("appContext");
            throw null;
        }
        throw new java.lang.IllegalArgumentException(B1.a.f(i2, "Invalid resId: "));
    }

    public static final void a(com.yandex.varioqub.config.impl.B b2, java.lang.String str, java.lang.String str2) {
        com.yandex.varioqub.config.VarioqubSettings varioqubSettings = b2.f2656f;
        if (varioqubSettings != null) {
            varioqubSettings.putClientFeature$config_release(str, str2);
        } else {
            kotlin.jvm.internal.i.i("settings");
            throw null;
        }
    }

    public static final void a(com.yandex.varioqub.config.impl.B b2) {
        com.yandex.varioqub.config.VarioqubSettings varioqubSettings = b2.f2656f;
        if (varioqubSettings != null) {
            varioqubSettings.clearClientFeatures$config_release();
        } else {
            kotlin.jvm.internal.i.i("settings");
            throw null;
        }
    }

    public final void a() {
        if (!this.f2657g.get()) {
            throw new java.lang.IllegalStateException("VarioqubConfig is not inited. Please call init() method first");
        }
    }

    public final void a(com.yandex.varioqub.config.VarioqubSettings varioqubSettings, com.yandex.varioqub.config.impl.C0102a c0102a, java.util.concurrent.ExecutorService executorService, android.content.Context context, com.yandex.varioqub.config.impl.t tVar, com.yandex.varioqub.config.impl.C0104c c0104c, com.yandex.varioqub.config.impl.g gVar) {
        this.f2656f = varioqubSettings;
        this.f2651a = c0102a;
        this.f2653c = tVar;
        this.f2652b = c0104c;
        this.f2654d = executorService;
        this.f2655e = gVar;
        com.yandex.varioqub.config.impl.AbstractC0105d.f2679a = context.getApplicationContext();
        com.yandex.varioqub.config.impl.D.f2659a = varioqubSettings.getUrl$config_release();
        com.yandex.varioqub.config.impl.C.f2658a = varioqubSettings.getLogs$config_release();
        java.lang.String string = com.yandex.varioqub.config.impl.m.a().getString("experiments", "");
        if (string == null) {
            string = "";
        }
        c0102a.f2663d = string;
        c0102a.f2662c = com.yandex.varioqub.config.impl.m.b();
        java.lang.String string2 = com.yandex.varioqub.config.impl.m.a().getString("config_version", "");
        c0102a.f2664e = string2 != null ? string2 : "";
        c0102a.f2660a.setExperiments(c0102a.f2663d);
        c0102a.f2660a.setTriggeredTestIds(c0102a.f2662c);
        this.f2657g.set(true);
        executorService.execute(new F0.a(0, gVar));
    }

    public static final void a(com.yandex.varioqub.config.impl.g gVar) {
        gVar.getClass();
        com.yandex.varioqub.config.impl.l.b(3);
        com.yandex.varioqub.config.impl.C0102a c0102a = gVar.f2682a;
        c0102a.f2660a.requestDeviceId(new com.yandex.varioqub.config.impl.e(gVar));
        com.yandex.varioqub.config.impl.C0102a c0102a2 = gVar.f2682a;
        c0102a2.f2660a.requestUserId(new com.yandex.varioqub.config.impl.f(gVar));
    }
}
