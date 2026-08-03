package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Yg {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f5067a = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("revenue", "getRevenue"), kotlin.TuplesKt.to("revenue_precision", "getRevenuePrecision"), kotlin.TuplesKt.to("network_name", "getNetworkName"), kotlin.TuplesKt.to("dsp_name", "getDspName"), kotlin.TuplesKt.to("max_ad_unit_id", "getAdUnitId"), kotlin.TuplesKt.to("network_placement", "getNetworkPlacement"));
    public static final java.util.Map b = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.ironsource.mediationsdk.j.f6439a, "ban"), kotlin.TuplesKt.to("MREC", "ban"), kotlin.TuplesKt.to("LEADER", "ban"), kotlin.TuplesKt.to("INTER", "int"), kotlin.TuplesKt.to("REWARDED", "rew"), kotlin.TuplesKt.to("REWARDED_INTER", "rew"), kotlin.TuplesKt.to("NATIVE", "nat"));

    public static final kotlin.Pair b(java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (kotlin.text.StringsKt.startsWith$default(str, "obj_", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(str, "auto_", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(str, "dir_", false, 2, (java.lang.Object) null)) {
                linkedHashMap2.put(str, value);
            } else {
                linkedHashMap.put(str, value);
            }
        }
        return new kotlin.Pair(linkedHashMap, linkedHashMap2);
    }

    public static final java.util.LinkedHashMap c(java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData keyData = (com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData) ((java.util.Map.Entry) it.next()).getValue();
            linkedHashMap.put(keyData.getName(), keyData.getType());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        r1.remove(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.LinkedHashMap d(java.util.Map map, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig config) {
        java.lang.Object a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.putAll(map);
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : config.getGeneralKeys().entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            java.lang.Object obj = map.get(key);
            if (obj != null && (a2 = a(obj, value)) != null) {
                linkedHashMap2.remove(key);
                linkedHashMap.put(key, a2);
            }
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : config.getAdSpecificKeys().entrySet()) {
            java.lang.String key2 = entry2.getKey();
            java.lang.String value2 = entry2.getValue();
            java.lang.String str = key2 + "_ban";
            java.lang.String str2 = key2 + "_int";
            java.lang.String str3 = key2 + "_rew";
            java.lang.String str4 = key2 + "_nat";
            java.lang.Object obj2 = map.get(str);
            java.lang.Object a3 = obj2 != null ? a(obj2, value2) : null;
            java.lang.Object obj3 = map.get(str2);
            java.lang.Object a4 = obj3 != null ? a(obj3, value2) : null;
            java.lang.Object obj4 = map.get(str3);
            java.lang.Object a5 = obj4 != null ? a(obj4, value2) : null;
            java.lang.Object obj5 = map.get(str4);
            java.lang.Object a6 = obj5 != null ? a(obj5, value2) : null;
            if (a3 != null || a4 != null || a5 != null || a6 != null) {
                if (a4 != null) {
                    linkedHashMap2.remove(str2);
                }
                if (a5 != null) {
                    linkedHashMap2.remove(str3);
                }
                if (a6 != null) {
                    linkedHashMap2.remove(str4);
                }
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                if (a3 == null) {
                    a3 = a(value2);
                }
                org.json.JSONArray put = jSONArray.put(a3);
                if (a4 == null) {
                    a4 = a(value2);
                }
                org.json.JSONArray put2 = put.put(a4);
                if (a5 == null) {
                    a5 = a(value2);
                }
                org.json.JSONArray put3 = put2.put(a5);
                if (a6 == null) {
                    a6 = a(value2);
                }
                linkedHashMap.put(key2, put3.put(a6));
            }
        }
        for (java.util.Map.Entry entry3 : linkedHashMap2.entrySet()) {
            com.inmobi.media.Sb.a((byte) 1, "PubSignalsUtils", "Publisher Signal, " + ((java.lang.String) entry3.getKey()) + com.ironsource.X3.j.b + entry3.getValue() + " Not supported");
        }
        return linkedHashMap;
    }

    public static final org.json.JSONObject a(org.json.JSONObject jSONObject, java.lang.String str, int i) {
        java.lang.String prefix = str;
        int i2 = i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (i2 <= 0) {
            return jSONObject;
        }
        java.lang.String[] strArr = {"ban", "int", "rew", "nat"};
        int i3 = 0;
        while (i3 < 4) {
            java.lang.String str2 = prefix + strArr[i3];
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(str2);
            if (optJSONArray != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.lang.String tsKey = b(str);
                long currentTimeMillis = java.lang.System.currentTimeMillis() - (i2 * 1000);
                int length = optJSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                    if (optJSONObject != null && optJSONObject.has(tsKey)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optJSONObject, "<this>");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tsKey, "tsKey");
                        if (optJSONObject.optLong(tsKey, 0L) >= currentTimeMillis) {
                            jSONArray.put(optJSONObject);
                        }
                    }
                }
                jSONObject.put(str2, jSONArray);
            }
            i3++;
            prefix = str;
            i2 = i;
        }
        return jSONObject;
    }

    public static final kotlin.Triple c(java.util.Map map, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Object obj = map.get("dir_type");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.util.Map map2 = b;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) map2.get(str);
        if (str2 == null) {
            com.inmobi.media.Sb.a((byte) 1, "PubSignalsUtils", "Missing or invalid dir_type for Publisher signals");
            return new kotlin.Triple("", null, "");
        }
        kotlin.Triple a2 = a(map, config.getDirect().getAllowedKeys(), config.getDirect().getPrecision(), config.getDirect().getStrLen());
        org.json.JSONObject jSONObject = (org.json.JSONObject) a2.component1();
        java.util.List list = (java.util.List) a2.component2();
        java.util.List list2 = (java.util.List) a2.component3();
        jSONObject.put(b("dir_"), java.lang.System.currentTimeMillis());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) obj2, "dir_type")) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.inmobi.media.Sb.a((byte) 1, "PubSignalsUtils", "Publisher signal: " + ((java.lang.String) it.next()) + " not supported");
        }
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            com.inmobi.media.Sb.a((byte) 1, "PubSignalsUtils", "Publisher signal: " + ((java.lang.String) it2.next()) + " invalid type");
        }
        java.lang.String str3 = "dir_" + str2;
        linkedHashMap.put(str3, jSONObject);
        return new kotlin.Triple(str3, jSONObject, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r10.isAssignableFrom(r8) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (a(r8) == true) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Triple b(java.util.Map map, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig config) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Object obj2;
        java.lang.Object invoke;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        if (map.containsKey("obj_max") && (obj = map.get("obj_max")) != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<this>");
            java.lang.Class<?> cls = obj.getClass();
            try {
                java.lang.ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = java.lang.ClassLoader.getSystemClassLoader();
                }
                java.lang.Class<?> cls2 = java.lang.Class.forName("com.applovin.mediation.MaxAd", false, classLoader);
                if (!cls2.isInstance(obj)) {
                }
            } catch (java.lang.Throwable unused) {
            }
            java.lang.Object obj3 = map.get("obj_max");
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj3, "<this>");
            try {
                invoke = obj3.getClass().getMethod("getFormat", new java.lang.Class[0]).invoke(obj3, new java.lang.Object[0]);
            } catch (java.lang.Exception unused2) {
                str = null;
            }
            if (invoke != null) {
                java.lang.Object invoke2 = invoke.getClass().getMethod("getLabel", new java.lang.Class[0]).invoke(invoke, new java.lang.Object[0]);
                if (invoke2 instanceof java.lang.String) {
                    str2 = (java.lang.String) invoke2;
                    java.util.Map map2 = b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = (java.lang.String) map2.get(str2);
                    if (str != null) {
                        com.inmobi.media.Sb.a((byte) 1, "PubSignalsUtils", "Missing or invalid format for MaxAd object: " + obj3);
                        return new kotlin.Triple("", null, "");
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj3, "<this>");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.Class<?> cls3 = obj3.getClass();
                    for (java.util.Map.Entry<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData> entry : config.getObj().getAllowedKeysAnd().entrySet()) {
                        java.lang.String key = entry.getKey();
                        com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
                        java.lang.String str3 = (java.lang.String) f5067a.get(key);
                        if (str3 != null) {
                            try {
                                obj2 = cls3.getMethod(str3, new java.lang.Class[0]).invoke(obj3, new java.lang.Object[0]);
                            } catch (java.lang.Exception unused3) {
                                obj2 = null;
                            }
                            if (obj2 != null) {
                                java.lang.String name = value.getName();
                                java.lang.Object a2 = a(obj2, value.getType(), config.getObj().getPrecision(), config.getObj().getStrLen());
                                if (a2 == null) {
                                    a2 = a(value.getType());
                                }
                                jSONObject.put(name, a2);
                            } else {
                                jSONObject.put(value.getName(), a(value.getType()));
                            }
                        }
                    }
                    jSONObject.put(b("obj_"), java.lang.System.currentTimeMillis());
                    return new kotlin.Triple("obj_" + str, jSONObject, str);
                }
            }
            str2 = null;
            java.util.Map map22 = b;
            if (str2 == null) {
            }
            str = (java.lang.String) map22.get(str2);
            if (str != null) {
            }
        }
        com.inmobi.media.Sb.a((byte) 1, "PubSignalsUtils", "Missing or invalid obj_max for obj signal: " + map);
        return new kotlin.Triple("", null, "");
    }

    public static final kotlin.Triple a(java.util.Map map, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        java.lang.Object obj = map.get("auto_type");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.util.Map map2 = b;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) map2.get(str);
        if (str2 == null) {
            java.util.Objects.toString(map);
            return new kotlin.Triple("", null, "");
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) a(map, c(config.getAuto().getAllowedKeys()), config.getAuto().getPrecision(), config.getAuto().getStrLen()).component1();
        jSONObject.put(b("auto_"), java.lang.System.currentTimeMillis());
        return new kotlin.Triple("auto_" + str2, jSONObject, str2);
    }

    public static final boolean a(java.lang.Class cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("com.applovin.mediation.MaxAd", "targetFqcn");
        java.lang.Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (java.lang.Class<?> cls2 : interfaces) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(cls2.getName(), "com.applovin.mediation.MaxAd")) {
                return true;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls2);
            if (a(cls2)) {
                return true;
            }
        }
        java.lang.Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return false;
        }
        return a(superclass);
    }

    public static final kotlin.Triple a(java.util.Map map, java.util.Map keys, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "keys");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(map);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : keys.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            java.lang.Object obj = map.get(str);
            if (obj != null) {
                java.lang.Object a2 = a(obj, str2, i, i2);
                if (a2 != null) {
                    jSONObject.put(str, a2);
                    mutableMap.remove(str);
                } else {
                    jSONObject.put(str, a(str2));
                    arrayList.add(str);
                }
            }
        }
        return new kotlin.Triple(jSONObject, kotlin.collections.CollectionsKt.toList(mutableMap.keySet()), arrayList);
    }

    public static final org.json.JSONObject b(org.json.JSONObject jSONObject, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        if (jSONObject.toString().length() <= config.getPayloadSize()) {
            return jSONObject;
        }
        com.inmobi.media.Sb.a((byte) 1, "PubSignalsUtils", "Publisher Signal payload size exceeded.");
        kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
        com.inmobi.media.W9.a(new com.inmobi.media.M2(new java.lang.IllegalStateException("Publisher signals size exceeds the limit")));
        return null;
    }

    public static final java.lang.String b(java.lang.String prefix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (kotlin.jvm.internal.Intrinsics.areEqual(prefix, "auto_")) {
            return "auto_sts";
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(prefix, "obj_") ? "obj_ts" : "dir_ts";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final java.lang.Object a(java.lang.Object obj, java.lang.String type, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -1881759115:
                if (type.equals("stringf") && (obj instanceof java.lang.String)) {
                    return (java.lang.String) obj;
                }
                return null;
            case -1325958191:
                if (type.equals("double")) {
                    java.lang.Number number = obj instanceof java.lang.Number ? (java.lang.Number) obj : null;
                    if (number == null) {
                        return null;
                    }
                    double doubleValue = number.doubleValue();
                    if (java.lang.Math.abs(doubleValue) <= Double.MAX_VALUE) {
                        int coerceIn = kotlin.ranges.RangesKt.coerceIn(i, 0, 15);
                        if (coerceIn == 0) {
                            doubleValue = doubleValue > 0.0d ? java.lang.Math.floor(doubleValue) : java.lang.Math.ceil(doubleValue);
                        } else {
                            doubleValue = java.math.BigDecimal.valueOf(doubleValue).movePointRight(coerceIn).setScale(0, java.math.RoundingMode.DOWN).movePointLeft(coerceIn).doubleValue();
                        }
                    }
                    return java.lang.Double.valueOf(doubleValue);
                }
                return null;
            case -891985903:
                if (type.equals("string")) {
                    java.lang.String value = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                    if (value == null) {
                        return null;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                    if (value.length() <= i2) {
                        return value;
                    }
                    java.lang.String substring = value.substring(0, i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    return substring;
                }
                return null;
            case 104431:
                if (type.equals("int")) {
                    java.lang.Number number2 = obj instanceof java.lang.Number ? (java.lang.Number) obj : null;
                    if (number2 != null) {
                        return java.lang.Integer.valueOf(number2.intValue());
                    }
                    return null;
                }
                return null;
            case 3029738:
                if (type.equals("bool") && (obj instanceof java.lang.Boolean)) {
                    return (java.lang.Boolean) obj;
                }
                return null;
            case 3327612:
                if (type.equals(com.adjust.sdk.Constants.LONG)) {
                    java.lang.Number number3 = obj instanceof java.lang.Number ? (java.lang.Number) obj : null;
                    if (number3 != null) {
                        return java.lang.Long.valueOf(number3.longValue());
                    }
                    return null;
                }
                return null;
            default:
                return null;
        }
    }

    public static final org.json.JSONObject a(org.json.JSONObject jSONObject, java.lang.String key, org.json.JSONObject newObj, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newObj, "newObj");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(key);
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        optJSONArray.put(newObj);
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optJSONArray, "<this>");
            if (optJSONArray.length() > i) {
                optJSONArray.remove(0);
            } else {
                jSONObject.put(key, optJSONArray);
                return jSONObject;
            }
        }
    }

    public static final void a(org.json.JSONObject jSONObject, org.json.JSONObject cachedJson, java.lang.String formatKey, java.lang.String prefix, java.util.Set allowedKeys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedJson, "cachedJson");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatKey, "formatKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedKeys, "allowedKeys");
        org.json.JSONArray optJSONArray = cachedJson.optJSONArray(prefix + formatKey);
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        java.util.Iterator it = allowedKeys.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    java.lang.Object opt = optJSONObject.opt(str);
                    if (opt == null) {
                        opt = com.ironsource.C2945a2.f;
                    }
                    jSONArray.put(opt);
                }
            }
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray(str);
            if (optJSONArray2 == null) {
                optJSONArray2 = new org.json.JSONArray();
            }
            jSONObject.put(str, optJSONArray2.put(jSONArray));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00eb, code lost:
    
        if (r14.equals("string") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0111, code lost:
    
        r15 = r9.optString(r13, com.ironsource.C2945a2.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:
    
        if (r14.equals("stringf") == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0120 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.Map a(java.util.Map map, org.json.JSONObject cachedJson, java.lang.String prefix, java.lang.String format, java.util.Map configKeys) {
        org.json.JSONArray jSONArray;
        java.util.LinkedHashMap linkedHashMap;
        org.json.JSONArray jSONArray2;
        java.lang.Object opt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedJson, "cachedJson");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configKeys, "configKeys");
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(configKeys);
        mutableMap.put(b(prefix), com.adjust.sdk.Constants.LONG);
        org.json.JSONArray optJSONArray = cachedJson.optJSONArray(prefix + format);
        if (optJSONArray != null) {
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, optJSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.Integer> it = until.iterator();
            while (it.hasNext()) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(((kotlin.collections.IntIterator) it).nextInt());
                if (optJSONObject != null) {
                    kotlin.sequences.Sequence asSequence = kotlin.collections.CollectionsKt.asSequence(mutableMap.keySet());
                    linkedHashMap = new java.util.LinkedHashMap();
                    for (java.lang.Object obj : asSequence) {
                        java.lang.String str = (java.lang.String) obj;
                        java.lang.String str2 = (java.lang.String) configKeys.get(str);
                        java.lang.Object obj2 = com.ironsource.C2945a2.f;
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1881759115:
                                    jSONArray2 = optJSONArray;
                                    break;
                                case -1325958191:
                                    jSONArray2 = optJSONArray;
                                    if (str2.equals("double")) {
                                        obj2 = java.lang.Double.valueOf(optJSONObject.optDouble(str, java.lang.Double.parseDouble(com.ironsource.C2945a2.f)));
                                        break;
                                    }
                                    opt = optJSONObject.opt(str);
                                    if (opt == null) {
                                        break;
                                    } else {
                                        obj2 = opt;
                                        break;
                                    }
                                case -891985903:
                                    jSONArray2 = optJSONArray;
                                    break;
                                case 104431:
                                    jSONArray2 = optJSONArray;
                                    if (str2.equals("int")) {
                                        obj2 = java.lang.Integer.valueOf(optJSONObject.optInt(str, java.lang.Integer.parseInt(com.ironsource.C2945a2.f)));
                                        break;
                                    }
                                    opt = optJSONObject.opt(str);
                                    if (opt == null) {
                                    }
                                    break;
                                case 3029738:
                                    jSONArray2 = optJSONArray;
                                    if (str2.equals("bool")) {
                                        obj2 = java.lang.Boolean.valueOf(optJSONObject.optBoolean(str, java.lang.Boolean.parseBoolean(com.ironsource.C2945a2.f)));
                                        break;
                                    }
                                    opt = optJSONObject.opt(str);
                                    if (opt == null) {
                                    }
                                    break;
                                case 3327612:
                                    if (str2.equals(com.adjust.sdk.Constants.LONG)) {
                                        obj2 = java.lang.Long.valueOf(optJSONObject.optLong(str, java.lang.Long.parseLong(com.ironsource.C2945a2.f)));
                                        jSONArray2 = optJSONArray;
                                        break;
                                    }
                                default:
                                    jSONArray2 = optJSONArray;
                                    opt = optJSONObject.opt(str);
                                    if (opt == null) {
                                    }
                                    break;
                            }
                            linkedHashMap.put(obj, obj2);
                            optJSONArray = jSONArray2;
                        }
                        jSONArray2 = optJSONArray;
                        opt = optJSONObject.opt(str);
                        if (opt == null) {
                        }
                        linkedHashMap.put(obj, obj2);
                        optJSONArray = jSONArray2;
                    }
                    jSONArray = optJSONArray;
                } else {
                    jSONArray = optJSONArray;
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    arrayList.add(linkedHashMap);
                }
                optJSONArray = jSONArray;
            }
            if (!arrayList.isEmpty()) {
                map.put(prefix + format, arrayList);
            }
        }
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r3.equals("string") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if ((r2 instanceof java.lang.String) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        return (java.lang.String) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0088, code lost:
    
        if (r3.equals("stringf") == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(java.lang.Object obj, java.lang.String type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -1881759115:
                break;
            case -1325958191:
                if (type.equals("double")) {
                    if (obj instanceof java.lang.Double) {
                        return (java.lang.Double) obj;
                    }
                    if (obj instanceof java.lang.Integer) {
                        return java.lang.Double.valueOf(((java.lang.Number) obj).intValue());
                    }
                    if (obj instanceof java.lang.Float) {
                        return java.lang.Double.valueOf(((java.lang.Number) obj).floatValue());
                    }
                    return null;
                }
                return null;
            case -891985903:
                break;
            case 104431:
                if (type.equals("int") && (obj instanceof java.lang.Integer)) {
                    return (java.lang.Integer) obj;
                }
                return null;
            case 3029738:
                if (type.equals("bool") && (obj instanceof java.lang.Boolean)) {
                    return (java.lang.Boolean) obj;
                }
                return null;
            case 3327612:
                if (type.equals(com.adjust.sdk.Constants.LONG) && (obj instanceof java.lang.Long)) {
                    return (java.lang.Long) obj;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final java.lang.Object a(java.lang.String type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -1881759115:
                type.equals("stringf");
                return com.ironsource.C2945a2.f;
            case -1325958191:
                if (type.equals("double")) {
                    return java.lang.Double.valueOf(java.lang.Double.parseDouble(com.ironsource.C2945a2.f));
                }
                return com.ironsource.C2945a2.f;
            case -891985903:
                type.equals("string");
                return com.ironsource.C2945a2.f;
            case 104431:
                if (type.equals("int")) {
                    return java.lang.Integer.valueOf(java.lang.Integer.parseInt(com.ironsource.C2945a2.f));
                }
                return com.ironsource.C2945a2.f;
            case 3029738:
                type.equals("bool");
                return com.ironsource.C2945a2.f;
            case 3327612:
                if (type.equals(com.adjust.sdk.Constants.LONG)) {
                    return java.lang.Long.valueOf(java.lang.Long.parseLong(com.ironsource.C2945a2.f));
                }
                return com.ironsource.C2945a2.f;
            default:
                return com.ironsource.C2945a2.f;
        }
    }

    public static final org.json.JSONObject a(java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value instanceof java.lang.String) {
                jSONObject.put(str, value);
            } else if (value instanceof java.lang.Integer) {
                jSONObject.put(str, ((java.lang.Number) value).intValue());
            } else if (value instanceof java.lang.Boolean) {
                jSONObject.put(str, ((java.lang.Boolean) value).booleanValue());
            } else if (value instanceof java.lang.Double) {
                jSONObject.put(str, ((java.lang.Number) value).doubleValue());
            } else if (value instanceof org.json.JSONArray) {
                jSONObject.put(str, value);
            } else if (value instanceof java.util.List) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (java.lang.Object obj : (java.lang.Iterable) value) {
                    if (obj instanceof java.lang.String) {
                        jSONArray.put(obj);
                    } else if (obj instanceof java.lang.Integer) {
                        jSONArray.put(((java.lang.Number) obj).intValue());
                    } else if (obj instanceof java.lang.Boolean) {
                        jSONArray.put(((java.lang.Boolean) obj).booleanValue());
                    } else if (obj instanceof java.lang.Double) {
                        jSONArray.put(((java.lang.Number) obj).doubleValue());
                    } else if (obj instanceof java.util.Map) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        jSONArray.put(a((java.util.Map) obj));
                    }
                }
                jSONObject.put(str, jSONArray);
            } else {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final java.util.LinkedHashMap a(org.json.JSONObject jSONObject, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig config) {
        java.lang.Object valueOf;
        java.lang.Object valueOf2;
        org.json.JSONObject jSONObject2 = jSONObject;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject2, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : config.getGeneralKeys().entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (jSONObject2.has(key)) {
                switch (value.hashCode()) {
                    case -1325958191:
                        if (value.equals("double")) {
                            valueOf2 = java.lang.Double.valueOf(jSONObject2.optDouble(key));
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                    case -891985903:
                        if (value.equals("string")) {
                            valueOf2 = jSONObject2.optString(key);
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                    case 104431:
                        if (value.equals("int")) {
                            valueOf2 = java.lang.Integer.valueOf(jSONObject2.optInt(key));
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                    case 3029738:
                        if (value.equals("bool")) {
                            valueOf2 = java.lang.Boolean.valueOf(jSONObject2.optBoolean(key));
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                    case 3327612:
                        if (value.equals(com.adjust.sdk.Constants.LONG)) {
                            valueOf2 = java.lang.Long.valueOf(jSONObject2.optLong(key));
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : config.getAdSpecificKeys().entrySet()) {
            java.lang.String key2 = entry2.getKey();
            java.lang.String value2 = entry2.getValue();
            org.json.JSONArray optJSONArray = jSONObject2.optJSONArray(key2);
            if (optJSONArray != null) {
                java.lang.String[] strArr = {"ban", "int", "rew", "nat"};
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    java.lang.String str = key2 + "_" + strArr[i];
                    switch (value2.hashCode()) {
                        case -1325958191:
                            if (value2.equals("double")) {
                                valueOf = java.lang.Double.valueOf(optJSONArray.optDouble(i));
                                linkedHashMap.put(str, valueOf);
                                break;
                            } else {
                                break;
                            }
                        case -891985903:
                            if (value2.equals("string")) {
                                valueOf = optJSONArray.optString(i);
                                linkedHashMap.put(str, valueOf);
                                break;
                            } else {
                                break;
                            }
                        case 104431:
                            if (value2.equals("int")) {
                                valueOf = java.lang.Integer.valueOf(optJSONArray.optInt(i));
                                linkedHashMap.put(str, valueOf);
                                break;
                            } else {
                                break;
                            }
                        case 3029738:
                            if (value2.equals("bool")) {
                                valueOf = java.lang.Boolean.valueOf(optJSONArray.optBoolean(i));
                                linkedHashMap.put(str, valueOf);
                                break;
                            } else {
                                break;
                            }
                        case 3327612:
                            if (value2.equals(com.adjust.sdk.Constants.LONG)) {
                                valueOf = java.lang.Long.valueOf(optJSONArray.optLong(i));
                                linkedHashMap.put(str, valueOf);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
            jSONObject2 = jSONObject;
        }
        return linkedHashMap;
    }
}
