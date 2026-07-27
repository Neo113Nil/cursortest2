package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ŷ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0357 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0482 f454;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f455;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f456;

    static {
        StringFog.decrypt("KQ6wHFXM2uMYDrQR\n", "am/TdDCfrow=\n");
    }

    public C0357(C0482 c0482, String str, String str2) {
        this.f455 = str2;
        this.f456 = str;
        this.f454 = c0482;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5388(C0357 c0357) {
        c0357.getClass();
        return AbstractC1257.m5940("3Q==\n", "9Fyd6X9b5IA=\n", new StringBuilder().append(StringFog.decrypt("RqAO4wGEBt13oAruRP8=\n", "BcFti2TXcrI=\n")).append(c0357.f456));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5389(C0414 c0414, C1115 c1115) {
        synchronized (this) {
        }
        C0482.m5466().post(new C0367(this, c0414, c1115));
    }
}
