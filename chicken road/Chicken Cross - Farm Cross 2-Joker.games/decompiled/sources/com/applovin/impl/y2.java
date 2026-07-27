package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class y2 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f4567a;
    private final String b;
    private final boolean c;
    private final i3 d;

    y2(String str, String str2, boolean z, i3 i3Var) {
        this.f4567a = str;
        this.b = str2;
        this.c = z;
        this.d = i3Var;
    }

    public String a() {
        return this.b;
    }

    public List b() {
        List l = this.d.l();
        return (l == null || l.isEmpty()) ? Collections.singletonList(this.f4567a) : l;
    }

    public String c() {
        return this.f4567a;
    }

    public i3 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y2 y2Var = (y2) obj;
        String str = this.f4567a;
        if (str == null ? y2Var.f4567a != null : !str.equals(y2Var.f4567a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? y2Var.b == null : str2.equals(y2Var.b)) {
            return this.c == y2Var.c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4567a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(y2 y2Var) {
        return this.b.compareToIgnoreCase(y2Var.b);
    }
}
