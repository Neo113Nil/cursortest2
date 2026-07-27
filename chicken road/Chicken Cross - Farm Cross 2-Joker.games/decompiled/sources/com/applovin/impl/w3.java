package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class w3 {
    private static final Set c = new HashSet();
    private static final Map d = new HashMap();
    public static final w3 e;
    public static final w3 f;
    public static final w3 g;

    /* renamed from: a, reason: collision with root package name */
    private String f4545a;
    private Set b;

    public enum a {
        SESSION("session"),
        INSTALL("install");


        /* renamed from: a, reason: collision with root package name */
        private final String f4546a;

        a(String str) {
            this.f4546a = str;
        }

        public String b() {
            return this.f4546a;
        }
    }

    public interface b {
        Object a(Object obj);
    }

    static {
        a aVar = a.SESSION;
        e = a("ars", aVar, a.INSTALL);
        f = a("ar", aVar);
        g = a("ttdasi_ms", aVar);
    }

    private w3(String str, Set set) {
        this.f4545a = str;
        this.b = set;
    }

    protected boolean a(Object obj) {
        return obj instanceof w3;
    }

    public Set b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        if (!w3Var.a(this)) {
            return false;
        }
        String a2 = a();
        String a3 = w3Var.a();
        if (a2 != null ? !a2.equals(a3) : a3 != null) {
            return false;
        }
        Set b2 = b();
        Set b3 = w3Var.b();
        return b2 != null ? b2.equals(b3) : b3 == null;
    }

    public int hashCode() {
        String a2 = a();
        int hashCode = a2 == null ? 43 : a2.hashCode();
        Set b2 = b();
        return ((hashCode + 59) * 59) + (b2 != null ? b2.hashCode() : 43);
    }

    public String toString() {
        return this.f4545a;
    }

    public String a() {
        return this.f4545a;
    }

    private static w3 a(String str, a... aVarArr) {
        Set set = c;
        if (!set.contains(str)) {
            w3 w3Var = new w3(str, new HashSet(Arrays.asList(aVarArr)));
            set.add(str);
            d.put(str, w3Var);
            return w3Var;
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }

    public boolean a(a aVar) {
        return this.b.contains(aVar);
    }

    public static w3 a(String str) {
        return (w3) d.get(str);
    }
}
