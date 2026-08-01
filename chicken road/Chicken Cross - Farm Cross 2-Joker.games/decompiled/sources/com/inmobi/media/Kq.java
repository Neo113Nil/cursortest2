package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Kq {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f6682a = new ConcurrentHashMap();

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.f6682a.entrySet()) {
                jSONObject.put(String.valueOf(Ig.a((Hg) entry.getKey())), ((Jq) entry.getValue()).a());
            }
            return jSONObject;
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(e));
            return new JSONObject();
        }
    }
}
