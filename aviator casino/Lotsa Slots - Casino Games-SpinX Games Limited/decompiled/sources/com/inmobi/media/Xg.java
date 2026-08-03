package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Xg {
    public static com.inmobi.media.Ig d;
    public static final /* synthetic */ kotlin.reflect.KProperty[] b = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.inmobi.media.Xg.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.inmobi.media.Xg.class, "impressionDepth", "getImpressionDepth()Lorg/json/JSONObject;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.Xg f5049a = new com.inmobi.media.Xg();
    public static final java.util.List c = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ban", "int", "rew", "nat"});
    public static final com.inmobi.media.I1 e = new com.inmobi.media.I1(new org.json.JSONObject(), new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Xg$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.Xg.a();
        }
    }, true, true);
    public static final com.inmobi.media.I1 f = new com.inmobi.media.I1(new org.json.JSONObject(), new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Xg$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.Xg.f();
        }
    }, true, true);
    public static final kotlinx.coroutines.sync.Mutex g = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    public static final org.json.JSONObject a(com.inmobi.media.Xg xg) {
        xg.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> keys = f5049a.b().keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next);
            if (kotlin.text.StringsKt.startsWith$default(next, "obj_", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(next, "auto_", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(next, "dir_", false, 2, (java.lang.Object) null)) {
                jSONObject.put(next, f5049a.b().opt(next));
            }
        }
        return jSONObject;
    }

    public static final java.lang.Object b(com.inmobi.media.Xg xg, java.util.Map map, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig publisherConfig, com.inmobi.media.Vg vg) {
        xg.getClass();
        if (!publisherConfig.getDirect().getEnabled()) {
            com.inmobi.media.Sb.a((byte) 1, "PubSignals", "Direct signals are disabled by InMobi");
            return kotlin.Unit.INSTANCE;
        }
        int count = publisherConfig.getDirect().getCount();
        kotlin.Triple c2 = com.inmobi.media.Yg.c(map, publisherConfig);
        java.lang.String str = (java.lang.String) c2.component1();
        org.json.JSONObject jSONObject = (org.json.JSONObject) c2.component2();
        java.lang.String str2 = (java.lang.String) c2.component3();
        if (jSONObject == null) {
            return kotlin.Unit.INSTANCE;
        }
        xg.a(str2, "d_i_dep");
        java.lang.Object a2 = xg.a(com.inmobi.media.Yg.a(xg.b(), str, jSONObject, count), vg);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object c(com.inmobi.media.Xg xg, java.util.Map map, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig publisherConfig, com.inmobi.media.Vg vg) {
        xg.getClass();
        if (!publisherConfig.getObj().getEnabled()) {
            com.inmobi.media.Sb.a((byte) 1, "PubSignals", "Object signals are disabled by InMobi");
            return kotlin.Unit.INSTANCE;
        }
        int count = publisherConfig.getObj().getCount();
        kotlin.Triple b2 = com.inmobi.media.Yg.b(map, publisherConfig);
        java.lang.String str = (java.lang.String) b2.component1();
        org.json.JSONObject jSONObject = (org.json.JSONObject) b2.component2();
        java.lang.String str2 = (java.lang.String) b2.component3();
        if (jSONObject == null) {
            return kotlin.Unit.INSTANCE;
        }
        xg.a(str2, "o_i_dep");
        java.lang.Object a2 = xg.a(com.inmobi.media.Yg.a(xg.b(), str, jSONObject, count), vg);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    public static final org.json.JSONObject f() {
        f5049a.getClass();
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        org.json.JSONObject jSONObject = null;
        if (context != null) {
            if (d == null) {
                d = new com.inmobi.media.Ig(context, "pub_signals_store");
            }
            com.inmobi.media.Ig ig = d;
            if (ig == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                ig = null;
            }
            java.lang.String a2 = ig.a("imp_depth");
            if (a2 != null) {
                jSONObject = new org.json.JSONObject(a2);
            }
        }
        return jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    public final java.util.LinkedHashMap d() {
        org.json.JSONObject b2 = b();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
        java.util.Map<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
        java.util.List<java.lang.String> list = c;
        com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig c2 = c();
        for (java.lang.String str : list) {
            com.inmobi.media.Yg.a(com.inmobi.media.Yg.a(com.inmobi.media.Yg.a(linkedHashMap, b2, "obj_", str, com.inmobi.media.Yg.c(allowedKeysAnd)), b2, "auto_", str, com.inmobi.media.Yg.c(allowedKeys)), b2, "dir_", str, c2.getDirect().getAllowedKeys());
        }
        return linkedHashMap;
    }

    public final org.json.JSONObject e() {
        org.json.JSONObject b2 = b();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> keys = b2.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next);
            if (!kotlin.text.StringsKt.startsWith$default(next, "obj_", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.startsWith$default(next, "auto_", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.startsWith$default(next, "dir_", false, 2, (java.lang.Object) null)) {
                jSONObject.put(next, b2.opt(next));
            }
        }
        for (java.lang.String str : c) {
            f5049a.getClass();
            if (c().getObj().getEnabled()) {
                java.util.Map<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
                java.util.ArrayList arrayList = new java.util.ArrayList(allowedKeysAnd.size());
                java.util.Iterator<java.util.Map.Entry<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData>> it = allowedKeysAnd.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue().getName());
                }
                com.inmobi.media.Yg.a(jSONObject, b2, str, "obj_", kotlin.collections.CollectionsKt.toSet(arrayList));
            }
            f5049a.getClass();
            if (c().getAuto().getEnabled()) {
                java.util.Map<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(allowedKeys.size());
                java.util.Iterator<java.util.Map.Entry<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData>> it2 = allowedKeys.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getValue().getName());
                }
                com.inmobi.media.Yg.a(jSONObject, b2, str, "auto_", kotlin.collections.CollectionsKt.toSet(arrayList2));
            }
            f5049a.getClass();
            if (c().getDirect().getEnabled()) {
                com.inmobi.media.Yg.a(jSONObject, b2, str, "dir_", c().getDirect().getAllowedKeys().keySet());
            }
        }
        for (kotlin.Pair pair : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(c().getObj(), "o_i_dep"), kotlin.TuplesKt.to(c().getDirect(), "d_i_dep"), kotlin.TuplesKt.to(c().getAuto(), "a_i_dep")})) {
            com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.BaseInputData baseInputData = (com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.BaseInputData) pair.component1();
            java.lang.String str2 = (java.lang.String) pair.component2();
            if (baseInputData.getDepth().getEnabled()) {
                com.inmobi.media.Xg xg = f5049a;
                xg.getClass();
                org.json.JSONArray optJSONArray = ((org.json.JSONObject) f.getValue(xg, b[1])).optJSONArray(str2);
                if (optJSONArray == null) {
                    java.util.Map map = com.inmobi.media.Yg.f5067a;
                    optJSONArray = new org.json.JSONArray();
                    optJSONArray.put(0);
                    optJSONArray.put(0);
                    optJSONArray.put(0);
                    optJSONArray.put(0);
                }
                jSONObject.put(str2, optJSONArray);
            }
        }
        jSONObject.toString();
        return jSONObject;
    }

    public static com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig c() {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        return ((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getPublisher();
    }

    public final org.json.JSONObject b() {
        return (org.json.JSONObject) e.getValue(this, b[0]);
    }

    public static final java.lang.Object a(com.inmobi.media.Xg xg, java.util.Map map, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig publisherConfig, com.inmobi.media.Vg vg) {
        xg.getClass();
        if (!publisherConfig.getAuto().getEnabled()) {
            return kotlin.Unit.INSTANCE;
        }
        int count = publisherConfig.getAuto().getCount();
        kotlin.Triple a2 = com.inmobi.media.Yg.a(map, publisherConfig);
        java.lang.String str = (java.lang.String) a2.component1();
        org.json.JSONObject jSONObject = (org.json.JSONObject) a2.component2();
        java.lang.String str2 = (java.lang.String) a2.component3();
        if (jSONObject == null) {
            return kotlin.Unit.INSTANCE;
        }
        xg.a(str2, "a_i_dep");
        java.lang.Object a3 = xg.a(com.inmobi.media.Yg.a(xg.b(), str, jSONObject, count), vg);
        return a3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a3 : kotlin.Unit.INSTANCE;
    }

    public static final org.json.JSONObject a() {
        com.inmobi.media.Xg xg = f5049a;
        xg.getClass();
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        org.json.JSONObject jSONObject = null;
        if (context != null) {
            xg.getClass();
            if (d == null) {
                d = new com.inmobi.media.Ig(context, "pub_signals_store");
            }
            com.inmobi.media.Ig ig = d;
            if (ig == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                ig = null;
            }
            java.lang.String a2 = ig.a("saved_signals");
            if (a2 != null) {
                jSONObject = new org.json.JSONObject(a2);
            }
        }
        return jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    public static void a(java.util.Map signals) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signals, "signals");
        try {
            com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig c2 = c();
            java.util.Map map = com.inmobi.media.Yg.f5067a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2, "<this>");
            if (!c2.getEnableMCO() && !c2.getEnableAB()) {
                com.inmobi.media.Sb.a((byte) 1, "PubSignals", "Publisher signals are disabled from InMobi");
                return;
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.e, null, null, new com.inmobi.media.Vg(signals, c2, null), 3, null);
        } catch (java.lang.Exception e2) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e2));
            com.inmobi.media.Sb.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:11:0x0060, B:13:0x0064, B:14:0x006a), top: B:10:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(org.json.JSONObject jSONObject, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Wg wg;
        int i;
        org.json.JSONObject jSONObject2;
        kotlinx.coroutines.sync.Mutex mutex;
        com.inmobi.media.Ig ig;
        try {
            if (continuationImpl instanceof com.inmobi.media.Wg) {
                wg = (com.inmobi.media.Wg) continuationImpl;
                int i2 = wg.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wg.e = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = wg.c;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = wg.e;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        android.content.Context context = com.inmobi.media.Xi.f5051a;
                        if (context != null) {
                            f5049a.getClass();
                            if (d == null) {
                                d = new com.inmobi.media.Ig(context, "pub_signals_store");
                            }
                            kotlinx.coroutines.sync.Mutex mutex2 = g;
                            wg.f5033a = jSONObject;
                            wg.b = mutex2;
                            wg.e = 1;
                            if (mutex2.lock(null, wg) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            jSONObject2 = jSONObject;
                            mutex = mutex2;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex = wg.b;
                    jSONObject2 = wg.f5033a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    ig = d;
                    if (ig == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        ig = null;
                    }
                    java.lang.String value = jSONObject2.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
                    ig.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("saved_signals", com.ironsource.X3.i.W);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                    ig.f4765a.a("saved_signals", value, true);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    com.inmobi.media.I1 i1 = e;
                    i1.c = i1.f4754a.invoke();
                    com.inmobi.media.Sb.a((byte) 2, "PubSignals", "Publisher Signals saved successfully.");
                    java.util.Objects.toString(jSONObject2);
                    return kotlin.Unit.INSTANCE;
                }
            }
            ig = d;
            if (ig == null) {
            }
            java.lang.String value2 = jSONObject2.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
            ig.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("saved_signals", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value2, "value");
            ig.f4765a.a("saved_signals", value2, true);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            com.inmobi.media.I1 i12 = e;
            i12.c = i12.f4754a.invoke();
            com.inmobi.media.Sb.a((byte) 2, "PubSignals", "Publisher Signals saved successfully.");
            java.util.Objects.toString(jSONObject2);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        wg = new com.inmobi.media.Wg(this, continuationImpl);
        java.lang.Object obj2 = wg.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wg.e;
        if (i != 0) {
        }
    }

    public static void a(org.json.JSONObject jSONObject, java.lang.String key, org.json.JSONArray value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        jSONObject.put(key, value);
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            f5049a.getClass();
            if (d == null) {
                d = new com.inmobi.media.Ig(context, "pub_signals_store");
            }
            java.util.Objects.toString(jSONObject);
            com.inmobi.media.Ig ig = d;
            if (ig == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                ig = null;
            }
            java.lang.String value2 = jSONObject.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
            ig.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("imp_depth", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value2, "value");
            com.inmobi.media.La la = ig.f4765a;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
            la.a("imp_depth", value2, false);
            com.inmobi.media.I1 i1 = f;
            i1.c = i1.f4754a.invoke();
        }
    }

    public final void a(java.lang.String adFormat, java.lang.String key) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        com.inmobi.media.I1 i1 = f;
        i1.c = i1.f4754a.invoke();
        org.json.JSONObject jSONObject = (org.json.JSONObject) i1.getValue(this, b[1]);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(key);
        if (optJSONArray == null) {
            java.util.Map map = com.inmobi.media.Yg.f5067a;
            optJSONArray = new org.json.JSONArray();
            optJSONArray.put(0);
            optJSONArray.put(0);
            optJSONArray.put(0);
            optJSONArray.put(0);
        }
        int hashCode = adFormat.hashCode();
        if (hashCode == 97295) {
            if (adFormat.equals("ban")) {
                i = 0;
            }
            i = -1;
        } else if (hashCode == 104431) {
            if (adFormat.equals("int")) {
                i = 1;
            }
            i = -1;
        } else if (hashCode != 108833) {
            if (hashCode == 112804 && adFormat.equals("rew")) {
                i = 2;
            }
            i = -1;
        } else {
            if (adFormat.equals("nat")) {
                i = 3;
            }
            i = -1;
        }
        if (i != -1) {
            optJSONArray.put(i, optJSONArray.optInt(i, 0) + 1);
            a(jSONObject, key, optJSONArray);
        }
    }
}
