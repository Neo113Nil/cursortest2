package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮃ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1175 implements InterfaceC0942 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1022 f3357;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ String f3358;

    public C1175(C1022 c1022, String str) {
        this.f3357 = c1022;
        this.f3358 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0942
    /* renamed from: ﾒ */
    public final void mo5664() {
        C1033 c1033;
        AbstractC0398 m5397 = AbstractC0398.m5397();
        String decrypt = StringFog.decrypt("oAKodCy4\n", "023HGUDZukc=\n");
        String str = this.f3358;
        C0470 c0470 = (C0470) m5397;
        if (decrypt != null) {
            c1033 = (C1033) c0470.mo5407().get(decrypt);
        } else {
            c0470.getClass();
            c1033 = null;
        }
        if (c1033 == null || !c1033.m5807(str)) {
            return;
        }
        C0932 c0932 = this.f3357.f3039;
        String str2 = C0932.f2604;
        c0932.m5768(true);
    }
}
