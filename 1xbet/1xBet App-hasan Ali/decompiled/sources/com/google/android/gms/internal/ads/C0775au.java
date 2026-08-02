package com.google.android.gms.internal.ads;

import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.au, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775au {

    /* renamed from: a, reason: collision with root package name */
    public final String f12728a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12729b;

    public C0775au(String str, String str2) {
        this.f12728a = str;
        this.f12729b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0775au) {
            C0775au c0775au = (C0775au) obj;
            String str = this.f12728a;
            if (str != null ? str.equals(c0775au.f12728a) : c0775au.f12728a == null) {
                String str2 = this.f12729b;
                if (str2 != null ? str2.equals(c0775au.f12729b) : c0775au.f12729b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12728a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f12729b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(this.f12728a);
        sb.append(", appId=");
        return AbstractC2107A.u(sb, this.f12729b, "}");
    }
}
