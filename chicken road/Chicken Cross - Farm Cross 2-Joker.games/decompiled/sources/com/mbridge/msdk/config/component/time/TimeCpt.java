package com.mbridge.msdk.config.component.time;

import android.os.Handler;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class TimeCpt extends com.mbridge.msdk.config.component.base.a implements d {
    Map<String, Object> h = new HashMap();
    Map<String, Object> i = new HashMap();
    String j;
    long k;
    int l;
    String m;

    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        int f9050a = 0;
        boolean b;

        public a(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap hashMap = new HashMap();
            String c = c.c("triggered_count");
            int i = this.f9050a;
            this.f9050a = i + 1;
            hashMap.put(c, Integer.valueOf(i));
            TimeCpt timeCpt = TimeCpt.this;
            timeCpt.a(timeCpt.a("919003", (Map<String, Object>) hashMap));
            if (this.b) {
                TimeCpt timeCpt2 = TimeCpt.this;
                Handler handler = (Handler) timeCpt2.h.get(timeCpt2.j);
                if (handler != null) {
                    handler.postDelayed(this, TimeCpt.this.k);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(c.c("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(c.c("110"));
                if (obj2 instanceof String) {
                    return this.j.equals(String.valueOf(obj2));
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f = "919001";
        if (map == null || map.isEmpty()) {
            return;
        }
        Object obj = map.get(c.c("110"));
        if (obj != null) {
            this.j = String.valueOf(obj);
        }
        Object obj2 = map.get(c.c("152"));
        if (obj2 != null) {
            if (!TextUtils.isEmpty(String.valueOf(obj2))) {
                this.k = Integer.parseInt(r0) * 1000;
            }
        }
        Object obj3 = map.get(c.c("153"));
        if (obj3 != null) {
            String valueOf = String.valueOf(obj3);
            if (!TextUtils.isEmpty(valueOf)) {
                this.l = Integer.parseInt(valueOf);
            }
        }
        Object obj4 = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
        if (obj4 != null) {
            this.m = String.valueOf(obj4);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void c(Map<String, Object> map) {
        super.c(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Handler handler;
        Runnable aVar;
        super.d();
        if (this.h.containsKey(this.j)) {
            handler = (Handler) this.h.get(this.j);
        } else {
            handler = new Handler();
            this.h.put(this.j, handler);
        }
        if (this.i.containsKey(this.j)) {
            aVar = (Runnable) this.i.get(this.j);
        } else {
            aVar = new a(this.l == 1);
            this.i.put(this.j, aVar);
        }
        if (handler != null && aVar != null) {
            if (c.c("310").equals(this.m) || c.c("335").equals(this.m)) {
                handler.postDelayed(aVar, this.k);
            } else if (c.c("311").equals(this.m)) {
                handler.removeCallbacks(aVar);
                this.h.remove(this.j);
            } else if (c.c("316").equals(this.m)) {
                handler.removeCallbacks(aVar);
            }
        }
        a("919002", (HashMap<String, Object>) null);
    }
}
