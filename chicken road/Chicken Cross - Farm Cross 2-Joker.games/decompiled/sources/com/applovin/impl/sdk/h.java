package com.applovin.impl.sdk;

import com.applovin.impl.c3;
import com.applovin.impl.m1;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f4465a = new HashMap();
    private final Object b = new Object();
    private final Map c = new HashMap();
    private final Object d = new Object();

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f4466a;
        private final JSONObject b;
        private final ArrayDeque c;

        public String b() {
            return JsonUtils.getString(this.b, "bcode", "");
        }

        public c c() {
            return (c) this.c.getLast();
        }

        public String toString() {
            return "AdInfo{states='" + this.c.toString() + "', adUnitId='" + a("ad_unit_id") + "', format='" + a(FirebaseAnalytics.Param.AD_FORMAT) + "', adapterName='" + a("network_name") + "', adapterClass='" + a("adapter_class") + "', adapterVersion='" + a("adapter_version") + "', bCode='" + b() + "', creativeId='" + a(CampaignEx.JSON_KEY_CREATIVE_ID) + "', updated=" + this.f4466a + AbstractJsonLexerKt.END_OBJ;
        }

        private b(c3 c3Var, c cVar) {
            JSONObject jSONObject = new JSONObject();
            this.b = jSONObject;
            ArrayDeque arrayDeque = new ArrayDeque();
            this.c = arrayDeque;
            a(cVar);
            JsonUtils.putString(jSONObject, "ad_unit_id", c3Var.getAdUnitId());
            JsonUtils.putString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, c3Var.getFormat().getLabel());
            JsonUtils.putString(jSONObject, "network_name", c3Var.c());
            JsonUtils.putString(jSONObject, "adapter_class", c3Var.b());
            JsonUtils.putString(jSONObject, "adapter_version", c3Var.A());
            JsonUtils.putString(jSONObject, "bcode", c3Var.C());
            JsonUtils.putString(jSONObject, CampaignEx.JSON_KEY_CREATIVE_ID, c3Var.getCreativeId());
            JsonUtils.putString(jSONObject, "operation", arrayDeque.toString());
        }

        public JSONObject a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f4466a = System.currentTimeMillis();
            this.c.add(cVar);
            JsonUtils.putString(this.b, "operation", cVar.toString());
        }

        private String a(String str) {
            return JsonUtils.getString(this.b, str, "");
        }
    }

    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW("show"),
        HIDE("hide"),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* renamed from: a, reason: collision with root package name */
        private final String f4467a;

        c(String str) {
            this.f4467a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f4467a;
        }
    }

    public interface d {
        void a(b bVar);
    }

    public h() {
        a();
    }

    private Set b(c cVar) {
        HashSet hashSet;
        synchronized (this.b) {
            hashSet = new HashSet(a(cVar));
        }
        return hashSet;
    }

    public void a(c3 c3Var, c cVar) {
        synchronized (this.d) {
            String C = c3Var.C();
            b bVar = (b) this.c.get(C);
            if (bVar == null) {
                if (cVar == c.DESTROY) {
                    return;
                }
                bVar = new b(c3Var, cVar);
                this.c.put(C, bVar);
            } else if (bVar.c() == cVar) {
                return;
            } else {
                bVar.a(cVar);
            }
            if (cVar == c.DESTROY) {
                this.c.remove(C);
            }
            a(bVar, cVar);
        }
    }

    public void a() {
        synchronized (this.b) {
            for (c cVar : c.values()) {
                this.f4465a.put(cVar, new HashSet());
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.b) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a((c) it.next()).add(dVar);
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.b) {
            Iterator it = this.f4465a.keySet().iterator();
            while (it.hasNext()) {
                a((c) it.next()).remove(dVar);
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.b) {
            Set set = (Set) this.f4465a.get(cVar);
            if (m1.a(set)) {
                return set;
            }
            return new HashSet();
        }
    }

    private void a(b bVar, c cVar) {
        Iterator it = b(cVar).iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(bVar);
        }
    }
}
