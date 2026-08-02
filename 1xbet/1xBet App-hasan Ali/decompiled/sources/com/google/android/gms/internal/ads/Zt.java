package com.google.android.gms.internal.ads;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class Zt {

    /* renamed from: a, reason: collision with root package name */
    public final int f12537a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12538b;

    public Zt(String str, int i) {
        this.f12537a = i;
        this.f12538b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Zt) {
            Zt zt = (Zt) obj;
            if (this.f12537a == zt.f12537a) {
                String str = zt.f12538b;
                String str2 = this.f12538b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12538b;
        return (str == null ? 0 : str.hashCode()) ^ ((this.f12537a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayState{statusCode=");
        sb.append(this.f12537a);
        sb.append(", sessionToken=");
        return AbstractC2107A.u(sb, this.f12538b, "}");
    }
}
