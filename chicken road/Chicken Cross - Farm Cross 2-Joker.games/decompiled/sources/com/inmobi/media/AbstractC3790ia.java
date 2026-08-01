package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.location.Location;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ia, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3790ia {

    /* renamed from: a, reason: collision with root package name */
    public final String f7160a;

    public AbstractC3790ia(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f7160a = url;
    }

    public static void b(LinkedHashMap linkedHashMap) {
        Pair pair;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Y5.f6965a.getClass();
        Pair k = Y5.k();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (k != null) {
            linkedHashMap.put(k.getFirst(), k.getSecond());
        }
        Pair m = Y5.m();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (m != null) {
            linkedHashMap.put(m.getFirst(), m.getSecond());
        }
        Pair pair2 = Y5.j;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair2 != null) {
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        Context context = AbstractC3914mk.f7252a;
        Pair pair3 = null;
        if (context == null) {
            pair = null;
        } else {
            Intent a2 = AbstractC3727g4.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            pair = new Pair("d-bat-chrg", (a2 != null ? a2.getIntExtra("status", -1) : -1) == 2 ? "1" : "0");
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair != null) {
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Pair q = Y5.q();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (q != null) {
            linkedHashMap.put(q.getFirst(), q.getSecond());
        }
        Pair h = Y5.h();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (h != null) {
            linkedHashMap.put(h.getFirst(), h.getSecond());
        }
        Context context2 = AbstractC3914mk.f7252a;
        if (context2 != null) {
            Intent a3 = AbstractC3727g4.a(context2, (BroadcastReceiver) null, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            pair3 = (a3 == null || a3.getIntExtra("state", 0) != 1) ? new Pair("d-w-h", "0") : new Pair("d-w-h", "1");
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair3 != null) {
            linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
        }
        Pair i = Y5.i();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (i != null) {
            linkedHashMap.put(i.getFirst(), i.getSecond());
        }
        Pair j = Y5.j();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (j != null) {
            linkedHashMap.put(j.getFirst(), j.getSecond());
        }
        Pair f = Y5.f();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (f != null) {
            linkedHashMap.put(f.getFirst(), f.getSecond());
        }
        Pair l = Y5.l();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (l != null) {
            linkedHashMap.put(l.getFirst(), l.getSecond());
        }
    }

    public static void c(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C4235y7 c4235y7 = C4235y7.f7495a;
        c4235y7.getClass();
        SignalsConfig.FraudSignals config = C4235y7.b();
        C4235y7.c = config;
        HashMap hashMap = new HashMap();
        if (config.getJailBrokenEnabled()) {
            Intrinsics.checkNotNullParameter(config, "config");
            if (config.getJailBrokenEnabled() ? ((Boolean) C4235y7.d.getValue(c4235y7, C4235y7.b[0])).booleanValue() : false) {
                hashMap.put("d-jb", "1");
            }
        }
        if (config.getDebuggerAttachedEnabled()) {
            Intrinsics.checkNotNullParameter(config, "config");
            if (config.getDebuggerAttachedEnabled() ? ((Boolean) C4235y7.e.getValue(c4235y7, C4235y7.b[1])).booleanValue() : false) {
                hashMap.put("u-ada", "1");
            }
        }
        if (config.getHookEnabled()) {
            Intrinsics.checkNotNullParameter(config, "config");
            if (config.getHookEnabled() ? ((Boolean) C4235y7.f.getValue(c4235y7, C4235y7.b[2])).booleanValue() : false) {
                hashMap.put("u-ah", "1");
            }
        }
        Intrinsics.checkNotNullParameter(config, "config");
        long longValue = config.getAppInstallTimeEnabled() ? ((Number) C4235y7.g.getValue(c4235y7, C4235y7.b[3])).longValue() : 0L;
        if (config.getAppInstallTimeEnabled() && longValue > 0) {
            hashMap.put("u-ait", String.valueOf(longValue));
        }
        Intrinsics.checkNotNullParameter(config, "config");
        String str = config.getInstallSourceEnabled() ? (String) C4235y7.h.getValue(c4235y7, C4235y7.b[4]) : null;
        if (config.getInstallSourceEnabled() && str != null && !StringsKt.isBlank(str)) {
            hashMap.put("u-appIS", str);
        }
        linkedHashMap.putAll(hashMap);
    }

    public static void e(LinkedHashMap linkedHashMap) {
        String str;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C3906mc c3906mc = C3906mc.f7246a;
        HashMap hashMap = new HashMap();
        Oi oi = Kk.f6677a;
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            Intrinsics.checkNotNullParameter(context, "context");
            ConcurrentHashMap concurrentHashMap = Db.b;
            Db a2 = Cb.a(context, "coppa_store");
            Intrinsics.checkNotNullParameter("im_accid", "key");
            str = a2.f6510a.getString("im_accid", null);
        } else {
            str = null;
        }
        Location a3 = (str == null || Kk.a().getLocationEnabled()) ? C3906mc.a() : null;
        HashMap a4 = a3 != null ? C3906mc.a(a3, true, Og.a(AbstractC3914mk.f7252a, "android.permission.ACCESS_FINE_LOCATION") ? C3906mc.a(1, 3) : null) : C3906mc.a(AbstractC3940ni.b(), false, null);
        for (Map.Entry entry : a4.entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        linkedHashMap.putAll(hashMap);
        C3906mc c3906mc2 = C3906mc.f7246a;
        HashMap hashMap2 = new HashMap();
        String str2 = "DENIED";
        if (C3906mc.d() && C3906mc.e()) {
            str2 = "AUTHORISED";
        }
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = str2.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        hashMap2.put("loc-consent-status", lowerCase);
        linkedHashMap.putAll(hashMap2);
    }

    public static void f(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C4276zk c4276zk = C4276zk.f7528a;
        c4276zk.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        boolean isForegroundBackgroundModelEnabled = C4276zk.b().isForegroundBackgroundModelEnabled();
        if (C4276zk.b().getSigControlList().contains(0)) {
            linkedHashMap2.put("st", Long.valueOf(isForegroundBackgroundModelEnabled ? C4276zk.k : C4276zk.f));
        }
        long j = AbstractC3914mk.e.get();
        if (j > 0) {
            linkedHashMap2.put("tst", Long.valueOf(j));
        }
        if (C4276zk.b().getSigControlList().contains(5)) {
            C3584b2 c3584b2 = C4276zk.p;
            KProperty[] kPropertyArr = C4276zk.b;
            if (((Number) c3584b2.getValue(c4276zk, kPropertyArr[0])).intValue() != -1) {
                linkedHashMap2.put("cnt", Integer.valueOf(((Number) c3584b2.getValue(c4276zk, kPropertyArr[0])).intValue()));
            }
        }
        if (C4276zk.b().getSigControlList().contains(6)) {
            C3584b2 c3584b22 = C4276zk.q;
            KProperty[] kPropertyArr2 = C4276zk.b;
            if (((Number) c3584b22.getValue(c4276zk, kPropertyArr2[1])).intValue() != -1) {
                linkedHashMap2.put("u-ret", Integer.valueOf(((Number) c3584b22.getValue(c4276zk, kPropertyArr2[1])).intValue()));
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) C4276zk.g);
        if (!C4276zk.b().getSigControlList().contains(1)) {
            mutableList.set(0, -1);
        }
        if (!C4276zk.b().getSigControlList().contains(2)) {
            mutableList.set(1, -1);
        }
        if (!C4276zk.b().getSigControlList().contains(3)) {
            mutableList.set(2, -1);
        }
        if (!C4276zk.b().getSigControlList().contains(4)) {
            mutableList.set(3, -1);
        }
        if (!(mutableList instanceof Collection) || !mutableList.isEmpty()) {
            Iterator it = mutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Number) it.next()).intValue() != -1) {
                    linkedHashMap2.put("dep", mutableList);
                    break;
                }
            }
        }
        if (isForegroundBackgroundModelEnabled && C4276zk.b().getSigControlList().contains(7) && C4276zk.j.get()) {
            linkedHashMap2.put("f-dur", Long.valueOf(AbstractC3914mk.d.get() ? (System.currentTimeMillis() - C4276zk.l) + C4276zk.n : C4276zk.n));
        }
        try {
            jSONObject = new JSONObject(linkedHashMap2);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.length() > 0) {
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            linkedHashMap.put("sData", jSONObject2);
        }
    }

    public static void a(LinkedHashMap linkedHashMap) {
        boolean z;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (H5.a(AbstractC3914mk.f7252a) != null) {
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            if (((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getCctEnabled()) {
                z = true;
                linkedHashMap.put("cct-enabled", String.valueOf(z));
            }
        }
        z = false;
        linkedHashMap.put("cct-enabled", String.valueOf(z));
    }

    public static void d(LinkedHashMap linkedHashMap) {
        SharedPreferences a2;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        String str = "";
        if (AbstractC3914mk.f7252a != null && (a2 = Dk.a()) != null && a2.contains("IABGPP_HDR_GppString")) {
            str = String.valueOf(a2.getString("IABGPP_HDR_GppString", ""));
        }
        if (AbstractC3727g4.a(str)) {
            linkedHashMap.put("gpp", str);
        }
    }

    public static JSONObject a(String str) {
        if (Intrinsics.areEqual(str, "banner")) {
            return H9.c.a();
        }
        if (Intrinsics.areEqual("audio", str)) {
            D9 d9 = D9.c;
            JSONObject jSONObject = new JSONObject();
            long j = d9.f6466a / 1000;
            if (j != 0) {
                jSONObject.put("a-lastAudioPlayedTs", String.valueOf(j));
            }
            int i = d9.b;
            if (i > 0) {
                jSONObject.put("a-audioFreq", String.valueOf(i));
            }
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "audio_pref_file");
                Intrinsics.checkNotNullParameter("user_mute_count", "key");
                int i2 = a2.f6510a.getInt("user_mute_count", -1);
                if (i2 > 0) {
                    jSONObject.put("a-umc", String.valueOf(i2));
                }
            }
            return jSONObject;
        }
        return new JSONObject();
    }
}
