package com.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    private final E0 f7818a;

    public O(E0 e0) {
        this.f7818a = e0;
    }

    public void a(Activity activity, String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        if (activity != null) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        this.f7818a.a(B0.SHOW_AD, hashMap);
    }

    public void b(String str) {
        a(str, (String) null);
    }

    public void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.f7818a.a(B0.AD_DISMISS_SCREEN, hashMap);
    }

    public void d(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f7818a.a(B0.AD_ENDED, hashMap);
    }

    public void e(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f7818a.a(B0.AD_INFO_CHANGED, hashMap);
    }

    public void f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.f7818a.a(B0.AD_LEFT_APPLICATION, hashMap);
    }

    public void g(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f7818a.a(B0.AD_OPENED, hashMap);
    }

    public void h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.f7818a.a(B0.AD_PRESENT_SCREEN, hashMap);
    }

    public void i(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f7818a.a(B0.AD_STARTED, hashMap);
    }

    public void j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.f7818a.a(B0.AD_VIEW_BOUND, hashMap);
    }

    public void k(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f7818a.a(B0.AD_VISIBLE, hashMap);
    }

    public void b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("reason", str2);
        }
        this.f7818a.a(B0.PLACEMENT_CAPPED, hashMap);
    }

    public void a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", z ? "true" : "false");
        this.f7818a.a(B0.SHOW_AD_CHANCE, hashMap);
    }

    public void a(String str, int i, String str2, Md md) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str2);
        String a2 = a(md);
        if (a2 != null) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, a2);
        }
        this.f7818a.a(B0.SHOW_AD_FAILED, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f7818a.a(B0.AD_CLICKED, hashMap);
    }

    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        this.f7818a.a(B0.AD_CLOSED, hashMap);
    }

    public void a(String str, String str2, int i, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2));
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.f7818a.a(B0.AD_REWARDED, hashMap, j);
    }

    public void a(String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isMultipleAdUnits", 1);
        hashMap.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("reason", str2);
        }
        hashMap.put(IronSourceConstants.EVENTS_EXT1, z ? "true" : "false");
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        this.f7818a.a(B0.CHECK_PLACEMENT_CAPPED, hashMap);
    }

    public void a() {
        this.f7818a.a(B0.SESSION_CAPPED, null);
    }

    private static String a(Md md) {
        if (md == Md.NO_LOADED_ADS || md == Md.MAX_ATTEMPTS_REACHED) {
            return "recover show failed: " + md.b();
        }
        return null;
    }
}
