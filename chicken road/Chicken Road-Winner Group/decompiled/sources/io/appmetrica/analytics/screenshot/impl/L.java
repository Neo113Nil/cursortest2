package io.appmetrica.analytics.screenshot.impl;

import a.AbstractC0086a;
import e2.AbstractC0294i;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class L implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final Y f8991a;

    /* renamed from: b, reason: collision with root package name */
    public final X f8992b;

    /* JADX WARN: Multi-variable type inference failed */
    public L() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J parse(JSONObject jSONObject) {
        N n3;
        P p3;
        Q q3;
        boolean extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC1034o.f9064a);
        Y y = this.f8991a;
        X x3 = this.f8992b;
        x3.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
        if (optJSONObject == null) {
            q3 = new Q();
            q3.f9004a = new N();
            q3.f9005b = new P();
            O o3 = new O();
            o3.f8999c = AbstractC1034o.f9065b;
            q3.f9006c = o3;
        } else {
            Q q4 = new Q();
            x3.f9014a.getClass();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("api_captor_config");
            O o4 = null;
            if (optJSONObject2 == null) {
                n3 = null;
            } else {
                n3 = new N();
                Boolean optBooleanOrNull = JsonUtils.optBooleanOrNull(optJSONObject2, "enabled");
                if (optBooleanOrNull != null) {
                    n3.f8995a = optBooleanOrNull.booleanValue();
                }
            }
            if (n3 != null) {
                q4.f9004a = n3;
            }
            x3.f9015b.getClass();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("service_captor_config");
            if (optJSONObject3 == null) {
                p3 = null;
            } else {
                p3 = new P();
                Boolean optBooleanOrNull2 = JsonUtils.optBooleanOrNull(optJSONObject3, "enabled");
                if (optBooleanOrNull2 != null) {
                    p3.f9001a = optBooleanOrNull2.booleanValue();
                }
                Long optLongOrNull = JsonUtils.optLongOrNull(optJSONObject3, "delay_seconds");
                if (optLongOrNull != null) {
                    p3.f9002b = optLongOrNull.longValue();
                }
            }
            if (p3 != null) {
                q4.f9005b = p3;
            }
            x3.f9016c.getClass();
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("content_observer_captor_config");
            if (optJSONObject4 != null) {
                o4 = new O();
                Boolean optBooleanOrNull3 = JsonUtils.optBooleanOrNull(optJSONObject4, "enabled");
                if (optBooleanOrNull3 != null) {
                    o4.f8997a = optBooleanOrNull3.booleanValue();
                }
                JSONArray optJSONArray = optJSONObject4.optJSONArray("media_store_column_names");
                if (optJSONArray != null) {
                    s2.c c02 = AbstractC0086a.c0(0, optJSONArray.length());
                    ArrayList arrayList = new ArrayList(AbstractC0294i.U(c02));
                    Iterator it = c02.iterator();
                    while (((s2.b) it).f10348c) {
                        arrayList.add(optJSONArray.getString(((s2.b) it).a()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o4.f8999c = (String[]) array;
                }
                Long optLongOrNull2 = JsonUtils.optLongOrNull(optJSONObject4, "detect_window_seconds");
                if (optLongOrNull2 != null) {
                    o4.f8998b = optLongOrNull2.longValue();
                }
            }
            if (o4 != null) {
                q4.f9006c = o4;
            }
            q3 = q4;
        }
        return new J(extractFeature, y.toModel(q3));
    }

    public final J b(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public L(Y y, X x3) {
        this.f8991a = y;
        this.f8992b = x3;
    }

    public /* synthetic */ L(Y y, X x3, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new Y(null, null, null, 7, null) : y, (i3 & 2) != 0 ? new X() : x3);
    }
}
