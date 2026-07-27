package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;

/* loaded from: classes5.dex */
public class n3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4350a;
    private final MaxAdFormat b;

    public n3(String str, MaxAdFormat maxAdFormat) {
        this.f4350a = str;
        this.b = maxAdFormat;
    }

    protected boolean a(Object obj) {
        return obj instanceof n3;
    }

    public String b() {
        return this.f4350a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        if (!n3Var.a(this)) {
            return false;
        }
        String b = b();
        String b2 = n3Var.b();
        if (b != null ? !b.equals(b2) : b2 != null) {
            return false;
        }
        MaxAdFormat a2 = a();
        MaxAdFormat a3 = n3Var.a();
        return a2 != null ? a2.equals(a3) : a3 == null;
    }

    public int hashCode() {
        String b = b();
        int hashCode = b == null ? 43 : b.hashCode();
        MaxAdFormat a2 = a();
        return ((hashCode + 59) * 59) + (a2 != null ? a2.hashCode() : 43);
    }

    public String toString() {
        return this.f4350a + "-" + this.b.getLabel();
    }

    public MaxAdFormat a() {
        return this.b;
    }

    public static n3 a(String str) {
        String[] split = str.split("-");
        return new n3(split[0], MaxAdFormat.formatFromString(split[1]));
    }
}
