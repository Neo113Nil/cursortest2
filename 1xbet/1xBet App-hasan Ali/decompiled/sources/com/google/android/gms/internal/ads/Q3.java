package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Q3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11160a;

    /* renamed from: b, reason: collision with root package name */
    public final C1859z2 f11161b;

    /* renamed from: c, reason: collision with root package name */
    public final C1052h2 f11162c;

    /* renamed from: d, reason: collision with root package name */
    public final P4 f11163d;

    /* renamed from: e, reason: collision with root package name */
    public final C1184k1 f11164e;

    static {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        C1761wv c1761wv = C1761wv.f16184o;
        List list = Collections.EMPTY_LIST;
        C0918e3 c0918e3 = C0918e3.f13233a;
        new C1184k1();
        P4 p42 = P4.f11040z;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ Q3(String str, C1184k1 c1184k1, C1859z2 c1859z2, C1052h2 c1052h2, P4 p42) {
        C0918e3 c0918e3 = C0918e3.f13233a;
        this.f11160a = str;
        this.f11161b = c1859z2;
        this.f11162c = c1052h2;
        this.f11163d = p42;
        this.f11164e = c1184k1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q3)) {
            return false;
        }
        Q3 q32 = (Q3) obj;
        if (!this.f11160a.equals(q32.f11160a) || !this.f11164e.equals(q32.f11164e) || !Objects.equals(this.f11161b, q32.f11161b) || !this.f11162c.equals(q32.f11162c) || !Objects.equals(this.f11163d, q32.f11163d)) {
            return false;
        }
        C0918e3 c0918e3 = C0918e3.f13233a;
        return c0918e3.equals(c0918e3);
    }

    public final int hashCode() {
        int hashCode = this.f11160a.hashCode() * 31;
        C1859z2 c1859z2 = this.f11161b;
        return (this.f11163d.hashCode() + ((this.f11164e.hashCode() + ((this.f11162c.hashCode() + ((hashCode + (c1859z2 != null ? c1859z2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
