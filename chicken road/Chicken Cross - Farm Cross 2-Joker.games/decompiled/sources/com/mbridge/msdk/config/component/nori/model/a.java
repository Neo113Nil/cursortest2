package com.mbridge.msdk.config.component.nori.model;

import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: NetworkRequestModel.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f9032a;
    private List<String> b;
    private Map<String, String> d;
    private Map<String, Object> e;
    private Map<String, Object> h;
    private String l;
    private String c = "HTTP";
    private int f = 3;
    private int g = 10;
    private String i = "GET";
    private long j = 15;
    private int k = 9377;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        Map<String, Object> b;
        if (map != null) {
            try {
                Object obj = map.get(c.c("165"));
                if (obj instanceof List) {
                    b((List<String>) obj);
                } else if (obj instanceof String) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj.toString());
                    b(arrayList);
                }
                Object obj2 = map.get(c.c("151"));
                if (obj2 != null) {
                    c(String.valueOf(obj2));
                }
                Object obj3 = map.get(c.c("170"));
                if (obj3 != null) {
                    a(String.valueOf(obj3));
                }
                Object obj4 = map.get(c.c("168"));
                if (obj4 instanceof Map) {
                    b((Map<String, Object>) obj4);
                } else if (obj4 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    b(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj4).b());
                }
                Object obj5 = map.get(c.c("172"));
                if (obj5 != null) {
                    try {
                        c(Integer.parseInt(String.valueOf(obj5)));
                    } catch (Throwable th) {
                        q0.b("NetworkRequestModel", th.getMessage());
                        c(9377);
                    }
                }
                Object obj6 = map.get(c.c("171"));
                if (obj6 instanceof Map) {
                    d((Map) obj6);
                } else if ((obj6 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) && (b = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj6).b()) != null) {
                    try {
                        if (!b.isEmpty()) {
                            HashMap hashMap = new HashMap();
                            for (Map.Entry<String, Object> entry : b.entrySet()) {
                                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                            }
                            d(hashMap);
                        }
                    } catch (Throwable th2) {
                        q0.b("NetworkRequestModel", th2.getMessage());
                    }
                }
                Object obj7 = map.get(c.c("174"));
                if (obj7 != null) {
                    try {
                        a(Integer.parseInt(String.valueOf(obj7)));
                    } catch (Exception e) {
                        q0.b("NetworkRequestModel", e.getMessage());
                    }
                }
                Object obj8 = map.get(c.c("175"));
                if (obj8 != null) {
                    try {
                        b(Integer.parseInt(String.valueOf(obj8)));
                    } catch (Exception e2) {
                        q0.b("NetworkRequestModel", e2.getMessage());
                    }
                }
                Object obj9 = map.get(c.c("162"));
                if (obj9 != null) {
                    try {
                        a(Long.parseLong(String.valueOf(obj9)));
                    } catch (Exception e3) {
                        q0.b("NetworkRequestModel", e3.getMessage());
                    }
                }
                Object obj10 = map.get(c.c("169"));
                if (obj10 instanceof Map) {
                    c((Map<String, Object>) obj10);
                } else if (obj10 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    c(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj10).b());
                }
                Object obj11 = map.get(c.c("173"));
                if (obj11 instanceof List) {
                    a((List<String>) obj11);
                } else if (obj11 instanceof String) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(obj11.toString());
                    a(arrayList2);
                }
                Object obj12 = map.get(c.c("request_type"));
                if (obj12 != null) {
                    b(String.valueOf(obj12));
                }
            } catch (Exception e4) {
                q0.b("NetworkRequestModel", e4.getMessage(), e4);
            }
        }
    }

    public void b(List<String> list) {
        this.b = list;
    }

    public void c(String str) {
        this.c = str;
    }

    public Map<String, String> d() {
        return this.d;
    }

    public String e() {
        return this.i;
    }

    public String f() {
        return this.l;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public String i() {
        return this.c;
    }

    public int j() {
        return this.k;
    }

    public long k() {
        return this.j;
    }

    public List<String> l() {
        return this.b;
    }

    public Map<String, Object> b() {
        return this.e;
    }

    public void c(Map<String, Object> map) {
        this.e = map;
    }

    public void d(Map<String, String> map) {
        this.d = map;
    }

    public void b(Map<String, Object> map) {
        this.h = map;
    }

    public void c(int i) {
        this.k = i;
    }

    public void b(int i) {
        this.g = i;
    }

    public List<String> c() {
        return this.f9032a;
    }

    public void b(String str) {
        this.l = str;
    }

    public void a(int i) {
        this.f = i;
    }

    public Map<String, Object> a() {
        return this.h;
    }

    public void a(String str) {
        this.i = str;
    }

    public void a(long j) {
        this.j = j;
    }

    public void a(List<String> list) {
        this.f9032a = list;
    }
}
