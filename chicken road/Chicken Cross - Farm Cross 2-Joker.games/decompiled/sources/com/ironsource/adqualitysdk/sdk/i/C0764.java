package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᑊ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0764 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0747 f2199;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ EnumC0753 f2200;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2201;

    public C0764(C0747 c0747, String str, EnumC0753 enumC0753) {
        this.f2199 = c0747;
        this.f2201 = str;
        this.f2200 = enumC0753;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        synchronized (this.f2199) {
            this.f2199.f2083.put(this.f2201, this.f2200);
        }
    }
}
