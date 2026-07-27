package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MetricsData.java */
/* loaded from: classes6.dex */
public class c implements Serializable, Cloneable {
    private int A;
    private int B;
    private CampaignEx C;
    private CopyOnWriteArrayList<CampaignEx> D;

    /* renamed from: a, reason: collision with root package name */
    private boolean f9389a;
    private Map<String, Map<String, String>> b;
    private Map<String, Map<String, String>> c;
    private Map<String, Map<String, String>> d;
    private Map<String, Long> e;
    private com.mbridge.msdk.foundation.error.b f;
    private String g;
    private CopyOnWriteArrayList<CampaignEx> h;
    private String i;
    private int j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    public c() {
        this.f9389a = false;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.g = "";
        this.h = new CopyOnWriteArrayList<>();
        this.s = -1;
        this.u = false;
        this.w = false;
        this.D = new CopyOnWriteArrayList<>();
    }

    public int A() {
        return this.B;
    }

    public String B() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        }
        try {
            if (TextUtils.isEmpty(this.i)) {
                String str = this.g + this.r;
                Map<String, Map<String, String>> map2 = this.b;
                if (map2 != null && map2.containsKey(str) && (map = this.b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.i = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return this.i;
    }

    public String C() {
        return this.n;
    }

    public boolean D() {
        return this.u;
    }

    public boolean E() {
        return this.w;
    }

    public boolean F() {
        return this.v;
    }

    public boolean G() {
        return this.f9389a;
    }

    public void a(boolean z) {
        this.u = z;
    }

    public void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (!this.D.isEmpty()) {
                        this.D.clear();
                    }
                    this.D.addAll(list);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Map<String, String> c(String str) {
        com.mbridge.msdk.foundation.error.b u;
        com.mbridge.msdk.foundation.error.b u2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = new e();
        try {
            this.r = str;
            eVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(B())) {
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, B());
            }
            if (this.j != 0) {
                eVar.a("adtp", Integer.valueOf(g()));
            }
            if (!TextUtils.isEmpty(s())) {
                eVar.a(CampaignEx.JSON_KEY_HB, s());
            }
            if (!TextUtils.isEmpty(l())) {
                eVar.a("bid_tk", l());
            }
            if (!TextUtils.isEmpty(str)) {
                eVar.a("key", str);
            }
            if (Arrays.asList(b.f9388a).contains(str)) {
                eVar.a("from_cache", D() ? "1" : "2");
            }
            if ("2000047".contains(str) && (u2 = u()) != null) {
                eVar.a("type", Integer.valueOf(u2.h()));
                eVar.a("reason", u2.l());
                if (!TextUtils.isEmpty(u2.m())) {
                    eVar.a("reason_d", u2.m());
                    eVar.a("type_d", Integer.valueOf(u2.n()));
                }
            }
            if ("2000048".contains(str) && (u = u()) != null && !TextUtils.isEmpty(u.m())) {
                eVar.a("type", Integer.valueOf(u.n()));
                eVar.a("reason", u.m());
            }
            if (this.j == 296) {
                eVar.a("auto_load", j());
                eVar.a("auto_refresh", Integer.valueOf(i()));
                eVar.a("auto_refresh_interval", Integer.valueOf(k()));
                eVar.a("content_type", Integer.valueOf(p()));
                eVar.a("temp_display_type", Integer.valueOf(A()));
            }
            a(eVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar.a();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void d(String str) {
        if (this.e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.e.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public void e(int i) {
        this.s = i;
    }

    public void f(String str) {
        this.q = str;
    }

    public int g() {
        return this.j;
    }

    public void h(String str) {
        this.p = str;
    }

    public void i(String str) {
        this.g = str;
    }

    public void j(String str) {
        this.r = str;
    }

    public void k(String str) {
        this.l = str;
    }

    public String l() {
        return this.k;
    }

    public List<CampaignEx> m() {
        return this.h;
    }

    public CampaignEx n() {
        return this.C;
    }

    public List<CampaignEx> o() {
        return this.D;
    }

    public int p() {
        return this.A;
    }

    public int q() {
        return this.s;
    }

    public int r() {
        return this.t;
    }

    public String s() {
        return this.p;
    }

    public String t() {
        return this.g;
    }

    public com.mbridge.msdk.foundation.error.b u() {
        return this.f;
    }

    public Map<String, Map<String, String>> v() {
        return this.d;
    }

    public Map<String, Map<String, String>> w() {
        return this.b;
    }

    public String x() {
        return this.l;
    }

    public String y() {
        return this.o;
    }

    public String z() {
        return this.m;
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.h.isEmpty()) {
                    this.h.clear();
                }
                this.h.addAll(list);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.g + str;
            Map<String, Map<String, String>> map = this.b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.b.remove(str2);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void f(int i) {
        this.t = i;
    }

    public void g(String str) {
        this.k = str;
    }

    public int i() {
        return this.y;
    }

    public String j() {
        return this.q;
    }

    public int k() {
        return this.z;
    }

    public void l(String str) {
        this.o = str;
    }

    public void m(String str) {
        this.m = str;
    }

    public void n(String str) {
        this.i = str;
    }

    public void o(String str) {
        this.n = str;
    }

    public void d(boolean z) {
        this.x = z;
    }

    public void g(int i) {
        this.B = i;
    }

    public void d(int i) {
        this.A = i;
    }

    public void b(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.g + str;
            Map<String, Map<String, String>> map2 = this.c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.c.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.c.put(str2, eVar.a());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void a(CampaignEx campaignEx) {
        this.C = campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.D;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                int i = 0;
                while (true) {
                    if (i >= this.D.size()) {
                        break;
                    }
                    if (this.D.get(i) != null && this.D.get(i).getId().equals(campaignEx.getId())) {
                        this.D.set(i, campaignEx);
                        break;
                    }
                    i++;
                }
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.h;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                if (this.h.get(i2) != null && this.h.get(i2).getId().equals(campaignEx.getId())) {
                    this.h.set(i2, campaignEx);
                    return;
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public long b(String str) {
        Map<String, Long> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.e) == null || !map.containsKey(str)) {
                return 0L;
            }
            Long l = this.e.get(str);
            return System.currentTimeMillis() - (l != null ? l.longValue() : 0L);
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 0L;
            }
            e.printStackTrace();
            return 0L;
        }
    }

    public void a(int i) {
        this.j = i;
    }

    public Map<String, String> a(String str) {
        return this.c.containsKey(str) ? this.c.remove(str) : new HashMap();
    }

    public void b(boolean z) {
        this.w = z;
    }

    public void b(int i) {
        this.y = i;
    }

    public void a(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.g + str;
            Map<String, Map<String, String>> map2 = this.b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.b.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.b.put(str2, eVar.a());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void a(e eVar) {
        if ("2000126".equals(this.r)) {
            String a2 = com.mbridge.msdk.foundation.same.net.d.a(l());
            if (eVar != null) {
                eVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.setting.e.a().a(a2)));
                eVar.a("dns_hs", a2);
            }
        }
    }

    public void c(boolean z) {
        this.v = z;
    }

    public void c(int i) {
        this.z = i;
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        this.f = bVar;
    }

    public c(boolean z) {
        this.f9389a = false;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.g = "";
        this.h = new CopyOnWriteArrayList<>();
        this.s = -1;
        this.u = false;
        this.w = false;
        this.D = new CopyOnWriteArrayList<>();
        this.f9389a = z;
    }
}
