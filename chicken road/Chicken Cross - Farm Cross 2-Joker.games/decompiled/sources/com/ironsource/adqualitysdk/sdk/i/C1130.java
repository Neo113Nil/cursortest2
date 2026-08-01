package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.灬, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1130 implements InterfaceC0372 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f3261;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f3262;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f3263;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1261 f3264;

    public C1130(C1261 c1261, C1074 c1074, C1226 c1226, List list) {
        this.f3264 = c1261;
        this.f3263 = c1074;
        this.f3262 = c1226;
        this.f3261 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0372
    /* renamed from: ﾒ */
    public final boolean mo5322(InterfaceC0388 interfaceC0388) {
        C0431 c0431 = this.f3264.f3565;
        C1074 c1074 = this.f3263;
        C1226 c1226 = this.f3262;
        List list = this.f3261;
        AbstractC0571 abstractC0571 = c0431.f589;
        if (abstractC0571 != null && !abstractC0571.mo5473(interfaceC0388)) {
            return false;
        }
        if (c0431.f588 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, interfaceC0388);
        return c0431.f588.m5583(c1074, c1226, arrayList).m5918();
    }
}
