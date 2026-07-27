package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class t8 {
    public static final t8 f = new t8();

    /* renamed from: a, reason: collision with root package name */
    private final t8 f4516a;
    private final String b;
    private final Map c;
    protected String d;
    protected final List e;

    public t8(String str, Map map, t8 t8Var) {
        this.f4516a = t8Var;
        this.b = str;
        this.c = Collections.unmodifiableMap(map);
        this.e = new ArrayList();
    }

    public Map a() {
        return this.c;
    }

    public List b() {
        return Collections.unmodifiableList(this.e);
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.b + "', text='" + this.d + "', attributes=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        for (t8 t8Var : this.e) {
            if (str.equalsIgnoreCase(t8Var.c())) {
                arrayList.add(t8Var);
            }
        }
        return arrayList;
    }

    public t8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            t8 t8Var = (t8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(t8Var.c())) {
                return t8Var;
            }
            arrayList.addAll(t8Var.b());
        }
        return null;
    }

    public t8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (t8 t8Var : this.e) {
            if (str.equalsIgnoreCase(t8Var.c())) {
                return t8Var;
            }
        }
        return null;
    }

    private t8() {
        this.f4516a = null;
        this.b = "";
        this.c = Collections.emptyMap();
        this.d = "";
        this.e = Collections.emptyList();
    }
}
