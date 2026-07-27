package io.appmetrica.analytics.screenshot.impl;

import g4.AbstractC0467l;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import y4.C1573b;
import y4.C1574c;

/* loaded from: classes.dex */
public final class L implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final Y f9972a;

    /* renamed from: b, reason: collision with root package name */
    public final X f9973b;

    /* JADX WARN: Multi-variable type inference failed */
    public L() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J parse(JSONObject jSONObject) {
        N n6;
        P p5;
        Q q5;
        boolean extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC1183o.f10046a);
        Y y5 = this.f9972a;
        X x5 = this.f9973b;
        x5.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
        if (optJSONObject == null) {
            q5 = new Q();
            q5.f9985a = new N();
            q5.f9986b = new P();
            O o2 = new O();
            o2.f9980c = AbstractC1183o.f10047b;
            q5.f9987c = o2;
        } else {
            Q q6 = new Q();
            x5.f9995a.getClass();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("api_captor_config");
            O o5 = null;
            if (optJSONObject2 == null) {
                n6 = null;
            } else {
                n6 = new N();
                Boolean optBooleanOrNull = JsonUtils.optBooleanOrNull(optJSONObject2, "enabled");
                if (optBooleanOrNull != null) {
                    n6.f9976a = optBooleanOrNull.booleanValue();
                }
            }
            if (n6 != null) {
                q6.f9985a = n6;
            }
            x5.f9996b.getClass();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("service_captor_config");
            if (optJSONObject3 == null) {
                p5 = null;
            } else {
                p5 = new P();
                Boolean optBooleanOrNull2 = JsonUtils.optBooleanOrNull(optJSONObject3, "enabled");
                if (optBooleanOrNull2 != null) {
                    p5.f9982a = optBooleanOrNull2.booleanValue();
                }
                Long optLongOrNull = JsonUtils.optLongOrNull(optJSONObject3, "delay_seconds");
                if (optLongOrNull != null) {
                    p5.f9983b = optLongOrNull.longValue();
                }
            }
            if (p5 != null) {
                q6.f9986b = p5;
            }
            x5.f9997c.getClass();
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("content_observer_captor_config");
            if (optJSONObject4 != null) {
                o5 = new O();
                Boolean optBooleanOrNull3 = JsonUtils.optBooleanOrNull(optJSONObject4, "enabled");
                if (optBooleanOrNull3 != null) {
                    o5.f9978a = optBooleanOrNull3.booleanValue();
                }
                JSONArray optJSONArray = optJSONObject4.optJSONArray("media_store_column_names");
                if (optJSONArray != null) {
                    C1574c s02 = K1.b.s0(0, optJSONArray.length());
                    ArrayList arrayList = new ArrayList(AbstractC0467l.D0(s02, 10));
                    Iterator it = s02.iterator();
                    while (((C1573b) it).f12444c) {
                        arrayList.add(optJSONArray.getString(((C1573b) it).a()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o5.f9980c = (String[]) array;
                }
                Long optLongOrNull2 = JsonUtils.optLongOrNull(optJSONObject4, "detect_window_seconds");
                if (optLongOrNull2 != null) {
                    o5.f9979b = optLongOrNull2.longValue();
                }
            }
            if (o5 != null) {
                q6.f9987c = o5;
            }
            q5 = q6;
        }
        return new J(extractFeature, y5.toModel(q5));
    }

    public final J b(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public L(Y y5, X x5) {
        this.f9972a = y5;
        this.f9973b = x5;
    }

    public /* synthetic */ L(Y y5, X x5, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new Y(null, null, null, 7, null) : y5, (i2 & 2) != 0 ? new X() : x5);
    }
}
