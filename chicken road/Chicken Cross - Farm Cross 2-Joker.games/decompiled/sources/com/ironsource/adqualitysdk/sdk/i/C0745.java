package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐡ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0745 extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f2075;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f2076;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f2077;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ List f2078;

    public C0745(List list, C0623 c0623, C1074 c1074, C1226 c1226) {
        this.f2078 = list;
        this.f2077 = c0623;
        this.f2076 = c1074;
        this.f2075 = c1226;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f2078.add(0, this);
        this.f2077.m5583(this.f2076, this.f2075, this.f2078);
        this.f2078.remove(0);
    }
}
