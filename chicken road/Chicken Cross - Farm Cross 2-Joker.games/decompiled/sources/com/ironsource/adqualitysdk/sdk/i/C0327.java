package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ĩ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0327 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0327 f313;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1307 f314;

    public C0327(C1307 c1307, C0327 c0327) {
        this.f314 = c1307;
        this.f313 = c0327;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ArrayList m5383() {
        ArrayList arrayList = new ArrayList(this.f314.f3773);
        C0327 c0327 = this.f313;
        if (c0327 != null) {
            arrayList.addAll(c0327.m5383());
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList m5385() {
        ArrayList arrayList = new ArrayList(this.f314.f3772);
        C0327 c0327 = this.f313;
        if (c0327 != null) {
            arrayList.addAll(c0327.m5385());
        }
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0623 m5382(String str) {
        C0327 c0327;
        C0623 c0623 = (C0623) this.f314.f3770.get(str);
        return (c0623 != null || (c0327 = this.f313) == null) ? c0623 : c0327.m5382(str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0476 m5384(String str) {
        C0327 c0327;
        C0476 c0476 = (C0476) this.f314.f3771.get(str);
        return (c0476 != null || (c0327 = this.f313) == null) ? c0476 : c0327.m5384(str);
    }
}
