package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class L implements io.appmetrica.analytics.coreapi.internal.data.JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.Y f7504a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.X f7505b;

    /* JADX WARN: Multi-variable type inference failed */
    public L() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.J parse(org.json.JSONObject jSONObject) {
        io.appmetrica.analytics.screenshot.impl.N n2;
        io.appmetrica.analytics.screenshot.impl.P p2;
        io.appmetrica.analytics.screenshot.impl.Q q2;
        boolean extractFeature = io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", io.appmetrica.analytics.screenshot.impl.AbstractC0899o.f7578a);
        io.appmetrica.analytics.screenshot.impl.Y y2 = this.f7504a;
        io.appmetrica.analytics.screenshot.impl.X x2 = this.f7505b;
        x2.getClass();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
        if (optJSONObject == null) {
            q2 = new io.appmetrica.analytics.screenshot.impl.Q();
            q2.f7517a = new io.appmetrica.analytics.screenshot.impl.N();
            q2.f7518b = new io.appmetrica.analytics.screenshot.impl.P();
            io.appmetrica.analytics.screenshot.impl.O o2 = new io.appmetrica.analytics.screenshot.impl.O();
            o2.f7512c = io.appmetrica.analytics.screenshot.impl.AbstractC0899o.f7579b;
            q2.f7519c = o2;
        } else {
            io.appmetrica.analytics.screenshot.impl.Q q3 = new io.appmetrica.analytics.screenshot.impl.Q();
            x2.f7527a.getClass();
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("api_captor_config");
            io.appmetrica.analytics.screenshot.impl.O o3 = null;
            if (optJSONObject2 == null) {
                n2 = null;
            } else {
                n2 = new io.appmetrica.analytics.screenshot.impl.N();
                java.lang.Boolean optBooleanOrNull = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrNull(optJSONObject2, "enabled");
                if (optBooleanOrNull != null) {
                    n2.f7508a = optBooleanOrNull.booleanValue();
                }
            }
            if (n2 != null) {
                q3.f7517a = n2;
            }
            x2.f7528b.getClass();
            org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("service_captor_config");
            if (optJSONObject3 == null) {
                p2 = null;
            } else {
                p2 = new io.appmetrica.analytics.screenshot.impl.P();
                java.lang.Boolean optBooleanOrNull2 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrNull(optJSONObject3, "enabled");
                if (optBooleanOrNull2 != null) {
                    p2.f7514a = optBooleanOrNull2.booleanValue();
                }
                java.lang.Long optLongOrNull = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optLongOrNull(optJSONObject3, "delay_seconds");
                if (optLongOrNull != null) {
                    p2.f7515b = optLongOrNull.longValue();
                }
            }
            if (p2 != null) {
                q3.f7518b = p2;
            }
            x2.f7529c.getClass();
            org.json.JSONObject optJSONObject4 = optJSONObject.optJSONObject("content_observer_captor_config");
            if (optJSONObject4 != null) {
                o3 = new io.appmetrica.analytics.screenshot.impl.O();
                java.lang.Boolean optBooleanOrNull3 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrNull(optJSONObject4, "enabled");
                if (optBooleanOrNull3 != null) {
                    o3.f7510a = optBooleanOrNull3.booleanValue();
                }
                org.json.JSONArray optJSONArray = optJSONObject4.optJSONArray("media_store_column_names");
                if (optJSONArray != null) {
                    v1.C1002c F2 = u0.AbstractC0995a.F(0, optJSONArray.length());
                    java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(F2));
                    java.util.Iterator it = F2.iterator();
                    while (((v1.C1001b) it).f8392c) {
                        arrayList.add(optJSONArray.getString(((v1.C1001b) it).a()));
                    }
                    java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
                    if (array == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o3.f7512c = (java.lang.String[]) array;
                }
                java.lang.Long optLongOrNull2 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optLongOrNull(optJSONObject4, "detect_window_seconds");
                if (optLongOrNull2 != null) {
                    o3.f7511b = optLongOrNull2.longValue();
                }
            }
            if (o3 != null) {
                q3.f7519c = o3;
            }
            q2 = q3;
        }
        return new io.appmetrica.analytics.screenshot.impl.J(extractFeature, y2.toModel(q2));
    }

    public final io.appmetrica.analytics.screenshot.impl.J b(org.json.JSONObject jSONObject) {
        return (io.appmetrica.analytics.screenshot.impl.J) io.appmetrica.analytics.coreapi.internal.data.JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final java.lang.Object parseOrNull(org.json.JSONObject jSONObject) {
        return (io.appmetrica.analytics.screenshot.impl.J) io.appmetrica.analytics.coreapi.internal.data.JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public L(io.appmetrica.analytics.screenshot.impl.Y y2, io.appmetrica.analytics.screenshot.impl.X x2) {
        this.f7504a = y2;
        this.f7505b = x2;
    }

    public /* synthetic */ L(io.appmetrica.analytics.screenshot.impl.Y y2, io.appmetrica.analytics.screenshot.impl.X x2, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.screenshot.impl.Y(null, null, null, 7, null) : y2, (i2 & 2) != 0 ? new io.appmetrica.analytics.screenshot.impl.X() : x2);
    }
}
