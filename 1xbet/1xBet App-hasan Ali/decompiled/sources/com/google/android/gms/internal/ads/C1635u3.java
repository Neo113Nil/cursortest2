package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1635u3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15790a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15791b;

    public C1635u3(String str, String str2) {
        this.f15790a = str;
        this.f15791b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1635u3.class == obj.getClass()) {
            C1635u3 c1635u3 = (C1635u3) obj;
            if (TextUtils.equals(this.f15790a, c1635u3.f15790a) && TextUtils.equals(this.f15791b, c1635u3.f15791b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15791b.hashCode() + (this.f15790a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f15790a);
        sb.append(",value=");
        return AbstractC2107A.u(sb, this.f15791b, "]");
    }
}
