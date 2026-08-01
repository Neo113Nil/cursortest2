package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ParameterWrapper.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f9391a = new HashMap();

    public void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (!(obj instanceof String)) {
                this.f9391a.put(str, obj + "");
            } else if (!TextUtils.isEmpty((String) obj)) {
                this.f9391a.put(str, (String) obj);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public Object b(String str) {
        return this.f9391a.get(str);
    }

    public void c(String str) {
        if (this.f9391a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f9391a.remove(str);
    }

    public boolean a(String str) {
        return this.f9391a.containsKey(str);
    }

    public Map<String, String> a() {
        return this.f9391a;
    }

    public void a(e eVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (eVar == null || (map = eVar.f9391a) == null || (map2 = this.f9391a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f9391a.putAll(map);
    }
}
