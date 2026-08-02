package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class TD {

    /* renamed from: a, reason: collision with root package name */
    public final String f11631a;

    /* renamed from: b, reason: collision with root package name */
    public final C1407p f11632b;

    /* renamed from: c, reason: collision with root package name */
    public final C1407p f11633c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11634d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11635e;

    public TD(String str, C1407p c1407p, C1407p c1407p2, int i, int i5) {
        boolean z3 = true;
        if (i != 0) {
            if (i5 == 0) {
                i5 = 0;
            } else {
                z3 = false;
            }
        }
        AbstractC1668us.S(z3);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f11631a = str;
        this.f11632b = c1407p;
        c1407p2.getClass();
        this.f11633c = c1407p2;
        this.f11634d = i;
        this.f11635e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TD.class == obj.getClass()) {
            TD td = (TD) obj;
            if (this.f11634d == td.f11634d && this.f11635e == td.f11635e && this.f11631a.equals(td.f11631a) && this.f11632b.equals(td.f11632b) && this.f11633c.equals(td.f11633c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11633c.hashCode() + ((this.f11632b.hashCode() + ((this.f11631a.hashCode() + ((((this.f11634d + 527) * 31) + this.f11635e) * 31)) * 31)) * 31);
    }
}
