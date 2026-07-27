package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɼ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0403 extends AbstractC0411 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0411 f520;

    public C0403(AbstractC0411 abstractC0411) {
        this.f520 = abstractC0411;
    }

    public final String toString() {
        return StringFog.decrypt("HA==\n", "PZvDXOuFOdw=\n") + this.f520;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        return new C1192(Boolean.valueOf(!this.f520.m5426(c1074, c1226).m5918()));
    }
}
