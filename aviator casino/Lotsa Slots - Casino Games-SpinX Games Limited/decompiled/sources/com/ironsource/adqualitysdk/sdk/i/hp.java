package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class hp extends com.ironsource.adqualitysdk.sdk.i.hi<android.view.View.OnClickListener> implements android.view.View.OnClickListener {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2385 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2386 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2387 = 13250;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2388 = 5498;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2389 = 3923;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2390 = 15413;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.hp.b f2391;

    public interface b {
        /* renamed from: ﾒ */
        void mo7406(com.ironsource.adqualitysdk.sdk.i.hp hpVar, android.view.View view);
    }

    public hp(android.view.View.OnClickListener onClickListener, com.ironsource.adqualitysdk.sdk.i.hp.b bVar) {
        super(onClickListener);
        this.f2391 = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = 2 % 2;
        int i2 = f2385 + 113;
        f2386 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2391.mo7406(this, view);
                int i3 = 66 / 0;
            } else {
                this.f2391.mo7406(this, view);
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7840("誖农\udeac騱륻燔᷶稀햓㈿\udd54䄪刐犼\u1ff1怯袃喿亃瞖宵湵亃瞖", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24).intern(), m7840("륗佩ᆢ鏂爎俍慟淎㹦苁\uec0d똳몽₷२媜禘즥\udc0b᩹㨆哖榏ﻜ它樤ꐲ㍅", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 28).intern(), th, false);
        }
        if (mo6360() != null) {
            int i4 = f2386 + 51;
            f2385 = i4 % 128;
            int i5 = i4 % 2;
            mo6360().onClick(view);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7840(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.o.f3104) {
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.o.f3105 = 0;
            char[] cArr4 = new char[2];
            while (com.ironsource.adqualitysdk.sdk.i.o.f3105 < cArr2.length) {
                cArr4[0] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105];
                cArr4[1] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2388)) ^ ((c2 >>> 5) + f2387)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2390) ^ ((c3 + i2) ^ ((c3 << 4) + f2389))));
                    i2 -= 40503;
                }
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105] = cArr4[0];
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1] = cArr4[1];
                com.ironsource.adqualitysdk.sdk.i.o.f3105 += 2;
            }
            str2 = new java.lang.String(cArr3, 0, i);
        }
        return str2;
    }
}
