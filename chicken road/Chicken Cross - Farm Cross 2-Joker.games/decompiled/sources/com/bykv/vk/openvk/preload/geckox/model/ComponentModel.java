package com.bykv.vk.openvk.preload.geckox.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ComponentModel {
    private Map<String, List<UpdatePackage>> packages;
    private Map<String, b> universalStrategies;

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, b> getUniversalStrategies() {
        return this.universalStrategies;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public List<a> f4655a;
        private c b;

        public final b a(JSONObject jSONObject) {
            JSONObject optJSONObject;
            JSONArray optJSONArray;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("specified_clean") && (optJSONArray = jSONObject.optJSONArray("specified_clean")) != null && optJSONArray.length() > 0) {
                        this.f4655a = new ArrayList();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                            if (optJSONObject2 != null) {
                                a aVar = new a();
                                aVar.a(optJSONObject2);
                                this.f4655a.add(aVar);
                            }
                        }
                    }
                    if (jSONObject.has("group_clean") && (optJSONObject = jSONObject.optJSONObject("group_clean")) != null) {
                        c cVar = new c();
                        this.b = cVar;
                        cVar.a(optJSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f4654a;
        public int b;
        public List<Long> c;

        public final a a(JSONObject jSONObject) {
            JSONArray optJSONArray;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("c")) {
                        this.f4654a = (String) com.bykv.vk.openvk.preload.falconx.a.a.a(jSONObject, "c", String.class);
                    }
                    if (jSONObject.has("clean_type")) {
                        this.b = jSONObject.optInt("clean_type");
                    }
                    if (jSONObject.has("version") && (optJSONArray = jSONObject.optJSONArray("version")) != null && optJSONArray.length() > 0) {
                        this.c = new ArrayList();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            this.c.add(Long.valueOf(optJSONArray.optLong(i)));
                        }
                    }
                    if (jSONObject.has("status")) {
                        jSONObject.optInt("status");
                    }
                    if (jSONObject.has("pkg_id")) {
                        jSONObject.optInt("pkg_id");
                    }
                    if (jSONObject.has("err_code")) {
                        jSONObject.optInt("err_code");
                    }
                    if (jSONObject.has("err_msg")) {
                        com.bykv.vk.openvk.preload.falconx.a.a.a(jSONObject, "err_msg", String.class);
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public static class c {
        public final c a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("rule")) {
                        jSONObject.optInt("rule");
                    }
                    if (jSONObject.has("policy")) {
                        jSONObject.optInt("policy");
                    }
                    if (jSONObject.has("limit")) {
                        jSONObject.optInt("limit");
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public ComponentModel fromJson(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("packages") && (optJSONObject2 = jSONObject.optJSONObject("packages")) != null) {
                    this.packages = new HashMap();
                    Iterator<String> keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONArray optJSONArray = optJSONObject2.optJSONArray(next);
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            ArrayList arrayList = new ArrayList();
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                                if (optJSONObject3 != null) {
                                    UpdatePackage updatePackage = new UpdatePackage();
                                    updatePackage.fromJson(optJSONObject3);
                                    arrayList.add(updatePackage);
                                }
                            }
                            this.packages.put(next, arrayList);
                        }
                    }
                }
                if (jSONObject.has("universal_strategies") && (optJSONObject = jSONObject.optJSONObject("universal_strategies")) != null) {
                    this.universalStrategies = new HashMap();
                    Iterator<String> keys2 = optJSONObject.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        JSONObject optJSONObject4 = optJSONObject.optJSONObject(next2);
                        if (optJSONObject4 != null) {
                            b bVar = new b();
                            bVar.a(optJSONObject4);
                            this.universalStrategies.put(next2, bVar);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return this;
    }
}
