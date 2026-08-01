package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ү, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0538 extends AbstractC0411 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1055 f1208;

    public C0538(C1055 c1055) {
        this.f1208 = c1055;
    }

    public final String toString() {
        return AbstractC1257.m5940("Ikw=\n", "CWcjKRcDh/4=\n", new StringBuilder().append(this.f1208.f3138));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        C1192 m5426 = this.f1208.m5426(c1074, c1226);
        c1074.m5838(this.f1208.f3138, Integer.valueOf(m5426.m5917().intValue() + 1));
        return m5426;
    }
}
