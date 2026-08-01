package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺜ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1227 {

    /* renamed from: ﭴ, reason: contains not printable characters */
    public C0623 f3485;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public int f3494;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public List f3495;

    /* renamed from: ｋ, reason: contains not printable characters */
    public Class f3496;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public Class f3497;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public Class f3498;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public int f3493 = -1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public int f3492 = -1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public int f3491 = -1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public int f3490 = -1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public int f3489 = Integer.MAX_VALUE;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public int f3488 = Integer.MAX_VALUE;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public int f3487 = Integer.MAX_VALUE;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public boolean f3486 = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1227.class != obj.getClass()) {
            return false;
        }
        C1227 c1227 = (C1227) obj;
        if (this.f3494 != c1227.f3494 || this.f3493 != c1227.f3493 || this.f3492 != c1227.f3492 || this.f3491 != c1227.f3491 || this.f3490 != c1227.f3490 || this.f3489 != c1227.f3489 || this.f3488 != c1227.f3488 || this.f3487 != c1227.f3487 || this.f3486 != c1227.f3486) {
            return false;
        }
        Class cls = this.f3498;
        if (cls == null ? c1227.f3498 != null : !cls.equals(c1227.f3498)) {
            return false;
        }
        Class cls2 = this.f3497;
        if (cls2 == null ? c1227.f3497 != null : !cls2.equals(c1227.f3497)) {
            return false;
        }
        Class cls3 = this.f3496;
        if (cls3 == null ? c1227.f3496 != null : !cls3.equals(c1227.f3496)) {
            return false;
        }
        List list = this.f3495;
        if (list == null ? c1227.f3495 != null : !list.equals(c1227.f3495)) {
            return false;
        }
        C0623 c0623 = this.f3485;
        C0623 c06232 = c1227.f3485;
        return c0623 != null ? c0623.equals(c06232) : c06232 == null;
    }

    public final int hashCode() {
        Class cls = this.f3498;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        Class cls2 = this.f3497;
        int hashCode2 = (hashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
        Class cls3 = this.f3496;
        int hashCode3 = (hashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
        List list = this.f3495;
        int hashCode4 = (((((((((((((((((((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f3494) * 31) + this.f3493) * 31) + this.f3492) * 31) + this.f3491) * 31) + this.f3490) * 31) + this.f3489) * 31) + this.f3488) * 31) + this.f3487) * 31) + (this.f3486 ? 1 : 0)) * 31;
        C0623 c0623 = this.f3485;
        return hashCode4 + (c0623 != null ? c0623.hashCode() : 0);
    }
}
