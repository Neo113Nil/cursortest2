package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ΐ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1059 implements InterfaceC0810 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f3160;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f3161;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f3162;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f3163;

    public C1059(ArrayList arrayList, C0623 c0623, C1074 c1074, C1226 c1226) {
        this.f3163 = arrayList;
        this.f3162 = c0623;
        this.f3161 = c1074;
        this.f3160 = c1226;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0810
    /* renamed from: ﾒ */
    public final void mo5673() {
        this.f3163.add(0, this);
        this.f3162.m5583(this.f3161, this.f3160, this.f3163);
        this.f3163.remove(0);
    }
}
