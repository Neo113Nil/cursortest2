package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.s;
import com.fyber.inneractive.sdk.config.global.features.v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w;
import com.fyber.inneractive.sdk.util.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public String f5261a = "";
    public final HashMap b;
    public JSONArray c;

    public r() {
        HashMap hashMap = new HashMap();
        hashMap.put(v.class, new v());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.d.class, new com.fyber.inneractive.sdk.config.global.features.d());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.m.class, new com.fyber.inneractive.sdk.config.global.features.m());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.f.class, new com.fyber.inneractive.sdk.config.global.features.f());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.l.class, new com.fyber.inneractive.sdk.config.global.features.l());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.e.class, new com.fyber.inneractive.sdk.config.global.features.e());
        hashMap.put(s.class, new s());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.j.class, new com.fyber.inneractive.sdk.config.global.features.j());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.r.class, new com.fyber.inneractive.sdk.config.global.features.r());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.o.class, new com.fyber.inneractive.sdk.config.global.features.o());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.c.class, new com.fyber.inneractive.sdk.config.global.features.c());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.n.class, new com.fyber.inneractive.sdk.config.global.features.n());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.b.class, new com.fyber.inneractive.sdk.config.global.features.b());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.h.class, new com.fyber.inneractive.sdk.config.global.features.h());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.k.class, new com.fyber.inneractive.sdk.config.global.features.k());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.g.class, new com.fyber.inneractive.sdk.config.global.features.g());
        this.b = hashMap;
        this.c = null;
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            hashMap2.put((Class) entry.getKey(), ((com.fyber.inneractive.sdk.config.global.features.i) entry.getValue()).b());
        }
        this.b = hashMap2;
        IAlog.a("%s: created. Supported features: %s", "SupportedFeaturesProvider", hashMap2);
    }

    public static r a() {
        int i = com.fyber.inneractive.sdk.config.n.f5271a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.featuresConfig");
        boolean z = false;
        if (!TextUtils.isEmpty(property)) {
            try {
                IAConfigManager.R.z.f5249a = l.a(new JSONObject(property));
                z = true;
            } catch (Exception unused) {
                IAlog.a("failed parsing local features json", new Object[0]);
            }
        }
        r rVar = new r();
        if (z) {
            IAConfigManager iAConfigManager = IAConfigManager.R;
            iAConfigManager.O.a(true, "");
            iAConfigManager.F.a(iAConfigManager.O);
        }
        return rVar;
    }

    public final JSONArray b() {
        JSONArray jSONArray = this.c;
        if (jSONArray == null || jSONArray.length() == 0) {
            JSONArray a2 = g.a(this.b, false);
            this.c = a2;
            IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a2);
        }
        return this.c;
    }

    public final void a(e eVar) {
        for (com.fyber.inneractive.sdk.config.global.features.i iVar : this.b.values()) {
            iVar.getClass();
            ArrayList arrayList = new ArrayList(iVar.c.values());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                ArrayList arrayList2 = bVar.d;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        d dVar = (d) it.next();
                        if (dVar.a(eVar)) {
                            iVar.c.remove(bVar.f5250a);
                            iVar.d.remove(bVar.f5250a);
                            this.c = null;
                            IAlog.a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", bVar.f5250a, dVar);
                            break;
                        }
                    }
                }
            }
        }
    }

    public final com.fyber.inneractive.sdk.config.global.features.i a(Class cls) {
        if (this.b.containsKey(cls)) {
            com.fyber.inneractive.sdk.config.global.features.i iVar = (com.fyber.inneractive.sdk.config.global.features.i) this.b.get(cls);
            if (cls.isInstance(iVar)) {
                return iVar;
            }
        }
        try {
            return (com.fyber.inneractive.sdk.config.global.features.i) cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            IAlog.a("Couldn't create a feature for %s", e, cls.getName());
            return null;
        }
    }

    public final void a(boolean z, String str) {
        k kVar;
        e eVar;
        this.f5261a = str;
        a aVar = IAConfigManager.R.z;
        aVar.b = this;
        for (com.fyber.inneractive.sdk.config.global.features.i iVar : this.b.values()) {
            boolean z2 = iVar instanceof com.fyber.inneractive.sdk.config.global.features.p;
            if ((z2 && z) || (!z2 && !z)) {
                l lVar = aVar.f5249a;
                if (iVar != null && lVar != null) {
                    q qVar = (q) lVar.f5258a.get(iVar.b);
                    if (qVar != null) {
                        iVar.f5260a = qVar.f5260a;
                        IAlog.a("%s: Feature before variant merge: %s", "a", iVar);
                        HashMap hashMap = qVar.c;
                        Iterator it = hashMap.keySet().iterator();
                        while (it.hasNext()) {
                            b bVar = (b) hashMap.get((String) it.next());
                            if (bVar != null) {
                                int nextInt = new Random().nextInt(100) + 1;
                                if (bVar.b < nextInt) {
                                    IAlog.a("%s: Experiment '%s' filtered! rand: %d, with perc: %d", "a", bVar.f5250a, Integer.valueOf(nextInt), Integer.valueOf(bVar.b));
                                } else {
                                    ArrayList arrayList = bVar.d;
                                    if (arrayList != null) {
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            d dVar = (d) it2.next();
                                            try {
                                                Long valueOf = Long.valueOf(IAConfigManager.R.d);
                                                eVar = new e();
                                                eVar.b = valueOf;
                                                eVar.c = com.fyber.inneractive.sdk.serverapi.b.a(aVar.b.f5261a);
                                            } catch (NumberFormatException unused) {
                                                IAlog.a("%s: invalid publisherId", "a");
                                            }
                                            if (dVar.a(eVar)) {
                                                IAlog.a("%s: Experiment '%s' filtered! with %s", "a", bVar.f5250a, dVar);
                                                break;
                                            }
                                        }
                                    }
                                    int i = 0;
                                    if (iVar instanceof v) {
                                        Iterator it3 = bVar.c.iterator();
                                        while (it3.hasNext()) {
                                            k kVar2 = (k) it3.next();
                                            n nVar = kVar2.f5260a;
                                            if (nVar != null && nVar.a() != null && kVar2.f5260a.a().containsKey("use_fmp_cache_mechanism")) {
                                                w wVar = (w) IAConfigManager.R.I.get(x.Video);
                                                if (!(wVar != null ? wVar.a() : false)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    IAlog.a("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", "a", bVar.f5250a, Integer.valueOf(nextInt), Integer.valueOf(bVar.b));
                                    ArrayList arrayList2 = bVar.c;
                                    int nextInt2 = new Random().nextInt(100) + 1;
                                    IAlog.a("%s: selectVariant for experiment '%s' generated random number: %d", "a", bVar.f5250a, Integer.valueOf(nextInt2));
                                    Iterator it4 = arrayList2.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            kVar = null;
                                            break;
                                        }
                                        kVar = (k) it4.next();
                                        i += kVar.c;
                                        IAlog.a("%s: selectVariant variant found: %s", "a", kVar);
                                        if (i >= nextInt2) {
                                            break;
                                        } else {
                                            IAlog.a("%s: selectVariant variant '%s' percentage outside selected range", "a", kVar.b);
                                        }
                                    }
                                    if (kVar != null) {
                                        IAlog.a("%s: experiment '%s' variant selected! %s", "a", bVar.f5250a, kVar);
                                    } else {
                                        IAlog.a("%s: experiment '%s' no variant was selected! using control group", "a", bVar.f5250a);
                                    }
                                    iVar.c.put(bVar.f5250a, bVar);
                                    if (kVar != null) {
                                        iVar.d.put(bVar.f5250a, kVar);
                                    }
                                }
                            }
                        }
                    }
                    IAlog.a("%s: Feature after variant merge: %s", "a", iVar);
                }
            }
        }
    }
}
