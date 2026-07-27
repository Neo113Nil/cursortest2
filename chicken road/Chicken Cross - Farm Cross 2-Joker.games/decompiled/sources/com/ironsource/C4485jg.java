package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.jg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4485jg {

    /* renamed from: a, reason: collision with root package name */
    private final E0 f8273a;

    public C4485jg(E0 e0) {
        this.f8273a = e0;
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f8273a.a(B0.COLLECT_TOKENS_FAILED, hashMap);
    }

    public void b(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.f8273a.a(B0.COLLECT_TOKENS_COMPLETED, hashMap);
    }

    public void b(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f8273a.a(B0.INSTANCE_COLLECT_TOKEN, hashMap);
    }

    public void a() {
        a(new HashMap());
    }

    public void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "timeout=" + j);
        a(hashMap);
    }

    public void b(Map<String, Object> map, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f8273a.a(B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, hashMap);
    }

    public void a(Map<String, Object> map) {
        this.f8273a.a(B0.COLLECT_TOKEN, map);
    }

    public void a(Map<String, Object> map, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f8273a.a(B0.INSTANCE_COLLECT_TOKEN_SUCCESS, hashMap);
    }

    public void a(Map<String, Object> map, long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f8273a.a(B0.INSTANCE_COLLECT_TOKEN_FAILED, hashMap);
    }
}
