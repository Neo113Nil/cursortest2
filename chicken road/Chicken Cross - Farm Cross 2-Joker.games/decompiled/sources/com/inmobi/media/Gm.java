package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.Buffer;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class Gm {
    public static final void b() {
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("networkType", Y5.o()), TuplesKt.to("plType", "AB"));
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("AdGetSignalsCalled", hashMapOf, EnumC3944nm.f7271a);
    }

    public static String a(Map map, String str) {
        Map map2;
        String str2;
        Z9 a2 = AbstractC3771hj.a("getToken", "AB");
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter("AB", "placementType");
        Map map3 = AbstractC4202x1.a("AB", map).f7426a;
        if (map3 != null) {
            String str3 = (String) map3.get("tp");
            if (!TextUtils.isEmpty(str3)) {
                AbstractC3942nk.b = str3;
            }
            String str4 = (String) map3.get("tp-v");
            if (!TextUtils.isEmpty(str4)) {
                AbstractC3942nk.f7270a = str4;
            }
        }
        a();
        if (!AbstractC3914mk.c()) {
            if (a2 != null) {
                Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Gm", "LOG_TAG");
                a2.b("com.inmobi.media.Gm", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, currentTimeMillis, a2);
            return null;
        }
        Context context = AbstractC3914mk.f7252a;
        C3768hg c3768hg = context != null ? new C3768hg(context, a2) : null;
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        J4 j42 = AbstractC4260z4.f7518a;
        if (((RootConfig) j42.a(RootConfig.class)).getMonetizationDisabled()) {
            a(2012, currentTimeMillis, a2);
            if (a2 != null) {
                Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Gm", "LOG_TAG");
                a2.b("com.inmobi.media.Gm", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        Nm uidMap = new Nm(((AdConfig) j42.a(AdConfig.class)).getIncludeIds());
        Hm metaData = new Hm(str, map3);
        C3711fg a3 = c3768hg != null ? c3768hg.a() : null;
        Intrinsics.checkNotNullParameter(uidMap, "uidMap");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter("https://www.123.com", "url");
        Intrinsics.checkNotNullParameter("https://www.123.com", "url");
        J4 j43 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class);
        LinkedHashMap payload = new LinkedHashMap();
        String a4 = AbstractC3648d9.a();
        if (a4 != null) {
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        C3634cn a5 = AbstractC3606bn.a();
        String str5 = a5.f7055a;
        if (str5 != null) {
        }
        payload.put("is-unifid-service-used", String.valueOf(a5.b));
        AbstractC3790ia.e(payload);
        payload.put("d-media-volume", String.valueOf(Y5.f6965a.a(AbstractC3914mk.f7252a, false)));
        HashMap hashMap = new HashMap();
        String jSONObject = new JSONObject(uidMap.a()).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        hashMap.put("u-id-map", jSONObject);
        payload.putAll(hashMap);
        String str6 = metaData.f6609a;
        if (str6 != null) {
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(AbstractC4232y4.f7492a);
        payload.putAll(hashMap2);
        Map map4 = metaData.b;
        Intrinsics.checkNotNullParameter(payload, "<this>");
        if (map4 != null) {
            for (Map.Entry entry : map4.entrySet()) {
                String str7 = (String) entry.getKey();
                String str8 = (String) entry.getValue();
                if (!payload.containsKey(str7)) {
                    payload.put(str7, str8);
                }
            }
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        J4 j44 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String jSONObject2 = ext.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            payload.put("im-ext", jSONObject2);
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        Y5 y5 = Y5.f6965a;
        y5.getClass();
        if (Y5.s()) {
            if (AbstractC3841k6.e) {
                str2 = null;
            } else {
                str2 = AbstractC3841k6.c;
                if (str2 == null) {
                    Context context2 = AbstractC3914mk.f7252a;
                    if (context2 == null) {
                        str2 = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Db.b;
                        Db a6 = Cb.a(context2, "display_info_store");
                        Intrinsics.checkNotNullParameter("gesture_margin", "key");
                        str2 = a6.f6510a.getString("gesture_margin", null);
                    }
                    AbstractC3841k6.c = str2;
                }
            }
            if (str2 != null) {
                payload.put("d-device-gesture-margins", str2);
            }
        }
        AbstractC3790ia.d(payload);
        AbstractC3790ia.f(payload);
        AbstractC3790ia.a(payload);
        AbstractC3790ia.b(payload);
        payload.put("h-user-agent", AbstractC3914mk.b());
        Intrinsics.checkNotNullParameter(payload, "<this>");
        String str9 = AbstractC3997pi.f7307a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str10 = AbstractC3997pi.f7307a;
        if (str10 != null) {
            linkedHashMap.put("u-nip", str10);
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            payload.putAll(linkedHashMap);
        }
        payload.putAll(AbstractC3940ni.a());
        payload.putAll(AbstractC3841k6.c());
        payload.putAll(AbstractC3897m3.a());
        if (a3 != null && (map2 = a3.f7106a) != null) {
            payload.putAll(map2);
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        Lazy lazy = G0.c;
        if (!((CopyOnWriteArrayList) lazy.getValue()).isEmpty()) {
            String jSONArray = new JSONArray((Collection) lazy.getValue()).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            payload.put("u-r-crid", jSONArray);
        }
        JSONObject a7 = H9.c.a();
        if (a7.length() > 0) {
            String jSONObject3 = a7.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
            payload.put("audioObject", jSONObject3);
        }
        AppSetIdInfo appSetIdInfo = V1.f6903a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        V1.a(linkedHashMap2);
        payload.putAll(linkedHashMap2);
        if (signalsConfig.getPublisher().getEnableAB()) {
            Intrinsics.checkNotNullParameter(payload, "<this>");
            JSONObject f = C3770hi.f7146a.f();
            if (f.length() > 0) {
                String jSONObject4 = f.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject4, "toString(...)");
                payload.put(U3.i.l0, jSONObject4);
            }
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        payload.put("u-appsecure", String.valueOf((int) U1.e));
        Intrinsics.checkNotNullParameter(payload, "<this>");
        if (C3869l5.e() && AbstractC3727g4.a(C3869l5.d())) {
            payload.put("ik", C3869l5.f);
            payload.put("c_data", C3869l5.d());
            Context context3 = AbstractC3914mk.f7252a;
            int i = 1;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap2 = Db.b;
                Db a8 = Cb.a(context3, "c_data_store");
                Intrinsics.checkNotNullParameter("akv", "key");
                i = a8.f6510a.getInt("akv", 1);
            }
            payload.put("aKV", String.valueOf(i));
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        JSONObject b = AbstractC4263z7.b();
        if (b != null) {
            String jSONObject5 = b.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject5, "toString(...)");
            payload.put("consentObject", jSONObject5);
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        payload.putAll(U1.d);
        payload.putAll(y5.a(false));
        payload.putAll(AbstractC3704f9.a());
        AbstractC3790ia.c(payload);
        Li.a((HashMap) payload);
        Intrinsics.checkNotNullParameter(payload, "mHttpHeaders");
        payload.put("User-Agent", AbstractC3914mk.b());
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!AbstractC4263z7.a()) {
            if (a2 != null) {
                Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Gm", "LOG_TAG");
                a2.b("com.inmobi.media.Gm", "get Signals failed - GDPR Compliance");
            }
            a(2141, currentTimeMillis, a2);
            return null;
        }
        a(currentTimeMillis, a2);
        if (a2 != null) {
            Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Gm", "LOG_TAG");
            a2.a("com.inmobi.media.Gm", "get signals success");
        }
        byte[] encode = Base64.encode(new Buffer().writeUtf8(AbstractC3727g4.a(payload)).readByteArray(), 8);
        Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        return new String(encode, Charsets.UTF_8);
    }

    public static void a(final int i, final long j, Z9 z9) {
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Gm", "LOG_TAG");
            z9.c("com.inmobi.media.Gm", "submitAdGetSignalsFailed - errorCode - " + i + ", startTime - " + j);
        }
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Gm$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Gm.a(j, i);
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
        if (z9 != null) {
            z9.a();
        }
    }

    public static final void a(long j, int i) {
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("latency", Long.valueOf(System.currentTimeMillis() - j)), TuplesKt.to("networkType", Y5.o()), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)), TuplesKt.to("plType", "AB"));
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("AdGetSignalsFailed", hashMapOf, EnumC3944nm.f7271a);
    }

    public static void a(final long j, Z9 z9) {
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Gm", "LOG_TAG");
            z9.c("com.inmobi.media.Gm", "submitAdGetSignalsSucceeded - startTime - " + j);
        }
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Gm$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Gm.a(j);
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
        if (z9 != null) {
            z9.a();
        }
    }

    public static final void a(long j) {
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("latency", Long.valueOf(System.currentTimeMillis() - j)), TuplesKt.to("networkType", Y5.o()), TuplesKt.to("plType", "AB"));
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("AdGetSignalsSucceeded", hashMapOf, EnumC3944nm.f7271a);
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Gm$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Gm.b();
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }
}
