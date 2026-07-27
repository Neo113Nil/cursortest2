package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Cg {
    private int b = 4;
    private int c = 4;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, Boolean> f7587a = new a();

    class a extends HashMap<String, Boolean> {
        a() {
            put(C4352c8.k, Boolean.valueOf(Cg.this.b == 0));
            put(C4352c8.l, Boolean.valueOf(Cg.this.c == 0));
            Boolean bool = Boolean.FALSE;
            put(C4352c8.m, bool);
            put(C4352c8.n, bool);
        }
    }

    Cg() {
    }

    void a(String str, int i, boolean z) {
        if (this.f7587a.containsKey(str)) {
            this.f7587a.put(str, Boolean.valueOf(i == 0));
        }
        this.f7587a.put(C4352c8.m, Boolean.valueOf(z));
        this.f7587a.put(C4352c8.n, Boolean.valueOf((this.f7587a.get(C4352c8.l).booleanValue() || this.f7587a.get(C4352c8.k).booleanValue()) && this.f7587a.get(C4352c8.m).booleanValue()));
    }

    public JSONObject a() {
        return new JSONObject(this.f7587a);
    }
}
