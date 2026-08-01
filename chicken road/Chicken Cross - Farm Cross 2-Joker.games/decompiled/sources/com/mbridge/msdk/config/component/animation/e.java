package com.mbridge.msdk.config.component.animation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AnimationNodeSpec.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private String f8903a;
    private Map<String, Object> b;
    private List<e> c;

    public e() {
        this.f8903a = "";
        this.b = new HashMap();
        this.c = new ArrayList();
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        this.b = map;
    }

    public Map<String, Object> b() {
        return this.b;
    }

    public String c() {
        return this.f8903a;
    }

    public List<e> a() {
        return this.c;
    }

    public void a(List<e> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.c = list;
    }

    public void a(String str, Object obj) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(str, obj);
    }

    public e(String str) {
        this.f8903a = "";
        this.b = new HashMap();
        this.c = new ArrayList();
        this.f8903a = str;
    }
}
