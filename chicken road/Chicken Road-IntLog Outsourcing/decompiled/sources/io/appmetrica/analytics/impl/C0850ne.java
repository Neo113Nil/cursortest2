package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0850ne {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8865a;

    public C0850ne() {
        HashMap hashMap = new HashMap();
        this.f8865a = hashMap;
        hashMap.put("google_aid", "g");
        hashMap.put("huawei_oaid", "h");
        hashMap.put("sim_info", "si");
        hashMap.put("features_collecting", "fc");
        hashMap.put("permissions_collecting", "pc");
        hashMap.put("retry_policy", "rp");
        hashMap.put("cache_control", "cc");
        hashMap.put("attribution", "at");
        hashMap.put("startup_update", "su");
        hashMap.put("ssl_pinning", "sp");
        hashMap.put("external_attribution", "exta");
    }

    public final String a(String str) {
        return this.f8865a.containsKey(str) ? (String) this.f8865a.get(str) : str;
    }
}
