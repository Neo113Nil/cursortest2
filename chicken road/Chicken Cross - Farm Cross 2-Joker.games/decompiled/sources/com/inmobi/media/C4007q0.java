package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.U3;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.q0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4007q0 extends AbstractC3790ia {
    public final Nm b;
    public final C3950o0 c;
    public final Cm d;
    public final C3711fg e;
    public final Z9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4007q0(String str, Nm nm, C3950o0 metaData, Cm timeoutConfig, C3711fg c3711fg, Z9 z9, boolean z) {
        super(str == null ? AdConfig.DEFAULT_AD_SERVER_URL : str);
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.b = nm;
        this.c = metaData;
        this.d = timeoutConfig;
        this.e = c3711fg;
        this.f = z9;
    }

    public final Mf a() {
        String str;
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = AbstractC3914mk.c;
        if (str2 == null) {
            throw new IllegalArgumentException("Account Id cannot be null");
        }
        linkedHashMap.put("account_id", str2);
        linkedHashMap.putAll(AbstractC3841k6.c());
        linkedHashMap.put("client-request-id", this.c.f7276a);
        linkedHashMap.put("sdk-flavor", "row");
        this.c.getClass();
        linkedHashMap.put("format", "unifiedSdkJson");
        String str3 = this.c.e;
        if (str3 != null) {
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C3634cn a2 = AbstractC3606bn.a();
        String str4 = a2.f7055a;
        if (str4 != null) {
        }
        linkedHashMap.put("is-unifid-service-used", String.valueOf(a2.b));
        long j = this.c.c;
        if (j != Long.MIN_VALUE) {
            linkedHashMap.put("im-plid", String.valueOf(j));
        }
        AbstractC3790ia.e(linkedHashMap);
        linkedHashMap.putAll(AbstractC3897m3.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(AbstractC3897m3.b());
        linkedHashMap.putAll(AbstractC3897m3.c());
        C3711fg c3711fg = this.e;
        if (c3711fg != null && (map = c3711fg.f7106a) != null) {
            linkedHashMap.putAll(map);
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(AbstractC4232y4.f7492a);
        linkedHashMap.putAll(hashMap);
        String str5 = this.c.g;
        if (str5 != null) {
        }
        Map map2 = this.c.f;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        this.c.getClass();
        linkedHashMap.put("int-origin", "im");
        AbstractC3790ia.d(linkedHashMap);
        AbstractC3790ia.f(linkedHashMap);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Lazy lazy = G0.c;
        if (!((CopyOnWriteArrayList) lazy.getValue()).isEmpty()) {
            String jSONArray = new JSONArray((Collection) lazy.getValue()).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            linkedHashMap.put("u-r-crid", jSONArray);
        }
        linkedHashMap.put("m10n_context", Intrinsics.areEqual("others", this.c.d) ? "M10N_CONTEXT_OTHER" : "M10N_CONTEXT_ACTIVITY");
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Y5.f6965a.getClass();
        HashMap hashMap2 = null;
        if (Y5.s()) {
            if (AbstractC3841k6.e) {
                str = null;
            } else {
                str = AbstractC3841k6.c;
                if (str == null) {
                    Context context = AbstractC3914mk.f7252a;
                    if (context == null) {
                        str = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Db.b;
                        Db a3 = Cb.a(context, "display_info_store");
                        Intrinsics.checkNotNullParameter("gesture_margin", "key");
                        str = a3.f6510a.getString("gesture_margin", null);
                    }
                    AbstractC3841k6.c = str;
                }
            }
            if (str != null) {
                linkedHashMap.put("d-device-gesture-margins", str);
            }
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String jSONObject = ext.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            linkedHashMap.put("im-ext", jSONObject);
        }
        Map map3 = this.c.b;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (map3 != null) {
            for (Map.Entry entry : map3.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!linkedHashMap.containsKey(str6)) {
                    linkedHashMap.put(str6, str7);
                }
            }
        }
        AbstractC3790ia.a(linkedHashMap);
        C3950o0 metaData = this.c;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        String str8 = metaData.e;
        if (str8 != null && AbstractC3790ia.a(str8).length() > 0) {
            String jSONObject2 = AbstractC3790ia.a(str8).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            linkedHashMap.put("audioObject", jSONObject2);
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        String str9 = AbstractC3997pi.f7307a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str10 = AbstractC3997pi.f7307a;
        if (str10 != null) {
            linkedHashMap2.put("u-nip", str10);
        } else {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.putAll(AbstractC3940ni.a());
        AppSetIdInfo appSetIdInfo = V1.f6903a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        V1.a(linkedHashMap3);
        linkedHashMap.putAll(linkedHashMap3);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (C3869l5.e() && AbstractC3727g4.a(C3869l5.d())) {
            linkedHashMap.put("ik", C3869l5.f);
            linkedHashMap.put("c_data", C3869l5.d());
            Context context2 = AbstractC3914mk.f7252a;
            int i = 1;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Db.b;
                Db a4 = Cb.a(context2, "c_data_store");
                Intrinsics.checkNotNullParameter("akv", "key");
                i = a4.f6510a.getInt("akv", 1);
            }
            linkedHashMap.put("aKV", String.valueOf(i));
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) U1.e));
        Nm nm = this.b;
        if (nm != null) {
            hashMap2 = new HashMap();
            String jSONObject3 = new JSONObject(nm.a()).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
            hashMap2.put("u-id-map", jSONObject3);
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (hashMap2 != null) {
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                linkedHashMap.put((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        J4 j42 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        if (((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getPublisher().getEnableMCO()) {
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            JSONObject f = C3770hi.f7146a.f();
            if (f.length() > 0) {
                String jSONObject4 = f.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject4, "toString(...)");
                linkedHashMap.put(U3.i.l0, jSONObject4);
            }
        }
        AbstractC3790ia.b(linkedHashMap);
        boolean z = this.c.h;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(U1.d);
        linkedHashMap.putAll(Y5.f6965a.a(z));
        linkedHashMap.putAll(AbstractC3704f9.a());
        AbstractC3790ia.c(linkedHashMap);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        JSONObject b = AbstractC4263z7.b();
        if (b != null) {
            String jSONObject5 = b.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject5, "toString(...)");
            linkedHashMap.put("consentObject", jSONObject5);
        }
        this.c.getClass();
        Li.a((HashMap) linkedHashMap);
        Z9 z9 = this.f;
        if (z9 != null) {
            z9.c("AdNetworkRequest", linkedHashMap.toString());
        }
        String str11 = this.f7160a;
        LinkedHashMap mHttpHeaders = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(mHttpHeaders, "mHttpHeaders");
        mHttpHeaders.put("User-Agent", AbstractC3914mk.b());
        return new Mf(str11, mHttpHeaders, this.d, new B7(linkedHashMap), null, 48);
    }
}
