package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.h5;
import com.applovin.impl.i6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u5;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class u5 extends n5 {
    private static JSONObject j;
    private static final Object k = new Object();
    private static final Map l = Collections.synchronizedMap(new HashMap());
    private final e3 g;
    private final Context h;
    private final b i;

    public interface b {
        void a(JSONArray jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements h5.a, Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f4521a;
        private final Object b;
        private int c;
        private final AtomicBoolean d;
        private final Collection e;
        private final com.applovin.impl.sdk.l f;
        private final com.applovin.impl.sdk.p g;

        @Override // com.applovin.impl.h5.a
        public void a(h5 h5Var) {
            boolean z;
            synchronized (this.b) {
                this.e.add(h5Var);
                int i = this.c - 1;
                this.c = i;
                z = i < 1;
            }
            if (z && this.d.compareAndSet(false, true)) {
                if (t7.i() && ((Boolean) this.f.a(c5.P)).booleanValue()) {
                    this.f.s0().a((n5) new x6(this.f, "handleSignalCollectionCompleted", new Runnable() { // from class: com.applovin.impl.u5$c$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            u5.c.this.a();
                        }
                    }), i6.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d.compareAndSet(false, true)) {
                a();
            }
        }

        private c(int i, b bVar, com.applovin.impl.sdk.l lVar) {
            this.c = i;
            this.f4521a = bVar;
            this.f = lVar;
            this.g = lVar.Q();
            this.b = new Object();
            this.e = new ArrayList(i);
            this.d = new AtomicBoolean();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            ArrayList<h5> arrayList;
            synchronized (this.b) {
                arrayList = new ArrayList(this.e);
            }
            JSONArray jSONArray = new JSONArray();
            for (h5 h5Var : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    i5 f = h5Var.f();
                    jSONObject.put("name", f.c());
                    jSONObject.put("class", f.b());
                    jSONObject.put("adapter_version", h5Var.a());
                    jSONObject.put("sdk_version", h5Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError c = h5Var.c();
                    if (c != null) {
                        jSONObject2.put("error_message", c.getMessage());
                    } else {
                        jSONObject2.put("signal", h5Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", h5Var.b());
                    jSONObject2.put("is_cached", h5Var.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.p.a()) {
                        this.g.a("TaskCollectSignals", "Collected signal from " + f);
                    }
                } catch (JSONException e) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.g.a("TaskCollectSignals", "Failed to create signal data", e);
                    }
                    this.f.E().a("TaskCollectSignals", "createSignalsData", e);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f4521a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    public u5(e3 e3Var, Context context, com.applovin.impl.sdk.l lVar, b bVar) {
        super("TaskCollectSignals", lVar);
        this.g = e3Var;
        this.h = context;
        this.i = bVar;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) {
        c cVar = new c(jSONArray.length(), this.i, this.f4351a);
        this.f4351a.s0().a(new x6(this.f4351a, "timeoutCollectSignal", cVar), i6.b.TIMEOUT, ((Long) this.f4351a.a(v3.I7)).longValue());
        for (int i = 0; i < jSONArray.length(); i++) {
            a(new i5(this.g, jSONArray.getJSONObject(i), jSONObject, this.f4351a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) {
        Set set = (Set) l.get(this.g.b());
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.g.b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (k) {
                jSONArray = JsonUtils.getJSONArray(j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (l.size() > 0) {
                    b(jSONArray, j);
                    return;
                } else {
                    a(jSONArray, j);
                    return;
                }
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.k(this.b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f4351a.a(e5.F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (l.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e) {
            a("Failed to wait for signals", e);
            this.f4351a.E().a("TaskCollectSignals", "waitForSignals", e);
        } catch (JSONException e2) {
            a("Failed to parse signals JSON", e2);
            this.f4351a.E().a("TaskCollectSignals", "parseSignalsJSON", e2);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            this.f4351a.E().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    private void a(final i5 i5Var, final h5.a aVar) {
        if (i5Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.u5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    u5.this.b(i5Var, aVar);
                }
            });
        } else {
            this.f4351a.Z().collectSignal(i5Var, this.h, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(i5 i5Var, h5.a aVar) {
        this.f4351a.Z().collectSignal(i5Var, this.h, aVar);
    }

    private void a(String str, Throwable th) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "No signals collected: " + str, th);
        }
        b bVar = this.i;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (k) {
            j = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e) {
            com.applovin.impl.sdk.p.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e);
            lVar.E().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e);
        }
    }
}
