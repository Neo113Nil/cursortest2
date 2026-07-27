package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.c5;
import com.applovin.impl.f0;
import com.applovin.impl.i6;
import com.applovin.impl.j1;
import com.applovin.impl.n5;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.t1;
import com.applovin.impl.t7;
import com.applovin.impl.x6;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.L6;
import com.ironsource.U3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", U3.i.e0, "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* renamed from: a, reason: collision with root package name */
    private final l f4443a;
    private final AtomicBoolean b = new AtomicBoolean();
    private final Deque c = new ArrayDeque();
    private final Object d = new Object();
    private volatile boolean e;

    public EventServiceImpl(l lVar) {
        this.f4443a = lVar;
    }

    private void a(final String str, final Map map) {
        final boolean contains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        this.f4443a.s0().a((n5) new x6(this.f4443a, contains, "submitTrackEventPostback", new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                EventServiceImpl.this.a(str, map, contains);
            }
        }), i6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, Map map, Map map2) {
        Map map3 = CollectionUtils.map("AppLovin-Event", str);
        map3.put("AppLovin-SDK-Name", "AppLovin-MAX");
        d.b d = com.applovin.impl.sdk.network.d.b().d(b()).a(a()).a(map3).c(a(str, map, map2)).a(((Boolean) this.f4443a.a(c5.u5)).booleanValue()).a(z4.a.a(((Integer) this.f4443a.a(c5.F5)).intValue())).d(false);
        if (this.f4443a.u0().c()) {
            d.b(CollectionUtils.map("axon_test_code", "1"));
        }
        this.f4443a.h0().e(d.a());
    }

    private String d() {
        return ((String) this.f4443a.a(c5.p0)) + "4.0/pix";
    }

    public void clearTrackedAxonEvents() {
        synchronized (this.d) {
            this.c.clear();
        }
    }

    public List<f0> getTrackedAxonEvents() {
        ArrayList arrayList;
        synchronized (this.d) {
            arrayList = new ArrayList(this.c);
        }
        return arrayList;
    }

    public boolean isAxonEventTracked() {
        return this.e;
    }

    public void maybeTrackAppOpenEvent() {
        if (this.b.compareAndSet(false, true)) {
            this.f4443a.G().trackEvent("landing");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        map2.put("transaction_id", str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.f4443a.Q();
        if (p.a()) {
            this.f4443a.Q().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        t1 t1Var = new t1(str, new HashMap());
        boolean contains = this.f4443a.c(c5.z0).contains(t1Var.c());
        Map a2 = a(t1Var, true, contains);
        HashMap hashMap = new HashMap(t1Var.d());
        if (((Boolean) this.f4443a.a(c5.O5)).booleanValue() || ((Boolean) this.f4443a.a(c5.J5)).booleanValue()) {
            hashMap.putAll(a2);
            a2 = null;
        }
        this.f4443a.h0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).b(a2).c(hashMap).a(a(t1Var, contains)).c(((Boolean) this.f4443a.a(c5.Z5)).booleanValue()).a(((Boolean) this.f4443a.a(c5.u5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            p.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f4443a.E().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent("iap", map2);
    }

    private void c(final String str, final Map map, final Map map2) {
        if (map.containsKey(FirebaseAnalytics.Param.ITEMS)) {
            Object obj = map.get(FirebaseAnalytics.Param.ITEMS);
            if (!(obj instanceof List)) {
                a(str, map, map2, "Invalid 'items' value: expected a list.");
                a("Invalid 'items' value: expected a list.");
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Map)) {
                    a(str, map, map2, "Invalid element in 'items': expected a map.");
                    a("Invalid element in 'items': expected a map.");
                    return;
                }
            }
        }
        a(str, map, map2, "");
        this.f4443a.s0().a((n5) new x6(this.f4443a, false, "track_event:" + str, new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                EventServiceImpl.this.b(str, map, map2);
            }
        }), i6.b.OTHER);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map) {
        trackEvent(str, map, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, boolean z) {
        t1 t1Var = new t1(str, map);
        boolean contains = this.f4443a.c(c5.z0).contains(t1Var.c());
        Map a2 = a(t1Var, false, contains);
        HashMap hashMap = new HashMap(t1Var.d());
        if (((Boolean) this.f4443a.a(c5.O5)).booleanValue() || ((Boolean) this.f4443a.a(c5.J5)).booleanValue()) {
            hashMap.putAll(a2);
            a2 = null;
        }
        this.f4443a.h0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).a(a(t1Var, contains)).b(a2).c(hashMap).c(((Boolean) this.f4443a.a(c5.Z5)).booleanValue()).a(((Boolean) this.f4443a.a(c5.u5)).booleanValue()).d(z).a(z4.a.a(((Integer) this.f4443a.a(c5.E5)).intValue())).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (TextUtils.isEmpty(str)) {
            a("Unable to track empty event");
        } else if (this.f4443a.c(c5.A0).contains(str)) {
            c(str, map, map2);
        } else {
            a(str, map);
        }
    }

    private String b() {
        return ((String) this.f4443a.a(c5.r0)) + "v1/app";
    }

    private void a(String str) {
        p.h("AppLovinEventService", str);
        if (t7.c(this.f4443a)) {
            throw new IllegalArgumentException(str);
        }
    }

    private String c() {
        return ((String) this.f4443a.a(c5.q0)) + "4.0/pix";
    }

    private Map a(t1 t1Var, boolean z, boolean z2) {
        Map a2 = this.f4443a.B().a((Map) null, z, false);
        a2.put("event_id", t1Var.b());
        a2.put("ts", Long.toString(t1Var.a()));
        if (z2) {
            a2.put(NotificationCompat.CATEGORY_EVENT, t1Var.c());
        } else {
            a2.put(NotificationCompat.CATEGORY_EVENT, "postinstall");
            a2.put("sub_event", t1Var.c());
        }
        return t7.a(a2);
    }

    private Map a(t1 t1Var, boolean z) {
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("AppLovin-Event", t1Var.c());
        } else {
            hashMap.put("AppLovin-Event", "postinstall");
            hashMap.put("AppLovin-Sub-Event", t1Var.c());
        }
        return hashMap;
    }

    private Map a(String str, Map map, Map map2) {
        HashMap hashMap = new HashMap();
        t1 t1Var = new t1(str, map);
        hashMap.put("id", t1Var.b());
        hashMap.put("name", t1Var.c());
        hashMap.put("data", t1Var.d());
        hashMap.put("timestamp", j1.a(t1Var.a()));
        Map H = this.f4443a.B().H();
        hashMap.put("app_info", H);
        hashMap.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, this.f4443a.B().p());
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("connectEventKey", this.f4443a.r());
        CollectionUtils.putStringIfValid("eventId", this.f4443a.F(), hashMap2);
        hashMap2.put("version", AppLovinSdk.VERSION);
        hashMap2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4443a.k0());
        hashMap2.put(L6.H, this.f4443a.B().A());
        if (((Boolean) this.f4443a.a(c5.R3)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.f4443a.s(), hashMap2);
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("firstVisitTs", H.get("ia_v2"));
        hashMap3.put("lastVisitTs", H.get("last_launch_ms"));
        hashMap3.put("visitCount", H.get("app_launch_count"));
        hashMap3.put("currentVisitStartTs", H.get("alts_ms"));
        hashMap2.put("visitInfo", hashMap3);
        hashMap.put("axon", hashMap2);
        return hashMap;
    }

    private void a(String str, Map map, Map map2, String str2) {
        f0 f0Var = new f0(str, map, map2, str2);
        synchronized (this.d) {
            if (this.c.size() == ((Integer) this.f4443a.a(c5.B0)).intValue()) {
                this.c.pollLast();
            }
            this.c.addFirst(f0Var);
        }
        this.e = true;
    }

    private String a() {
        return ((String) this.f4443a.a(c5.s0)) + "v1/app";
    }
}
