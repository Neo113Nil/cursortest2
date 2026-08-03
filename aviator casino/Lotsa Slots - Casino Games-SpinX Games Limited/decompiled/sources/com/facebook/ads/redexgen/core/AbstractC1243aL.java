package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1243aL {
    public static java.lang.String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static com.facebook.ads.redexgen.core.EnumC1247aP A00(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        if (abstractC1801jd.A2U()) {
            com.facebook.ads.redexgen.core.EnumC1247aP enumC1247aP = com.facebook.ads.redexgen.core.EnumC1247aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new java.lang.RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC1247aP;
        }
        return com.facebook.ads.redexgen.core.EnumC1247aP.A03;
    }

    public static void A01(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM) {
        c1636gi.A0F().AAz(enumC1244aM.name().toLowerCase(java.util.Locale.US));
    }

    public static void A02(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM) {
        c1636gi.A0F().AB9(enumC1244aM.name().toLowerCase(java.util.Locale.US));
    }

    public static void A03(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM) {
        c1636gi.A0F().AC7(enumC1244aM.name().toLowerCase(java.util.Locale.US));
    }

    public static void A04(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM) {
        A01(c1636gi, enumC1244aM);
    }

    public static void A05(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM) {
        A02(c1636gi, enumC1244aM);
    }

    public static void A06(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM) {
        A03(c1636gi, enumC1244aM);
    }

    public static void A07(com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM) {
        if (vi != null) {
            vi.A04(com.facebook.ads.redexgen.core.VH.A0A, null);
        }
        if (abstractC1801jd.A2Q()) {
            c1636gi.A0F().AB8(enumC1244aM.name().toLowerCase(java.util.Locale.US));
        }
        if (abstractC1801jd.A2U()) {
            c1636gi.A0F().AAy(enumC1244aM.name().toLowerCase(java.util.Locale.US));
        }
        com.facebook.ads.redexgen.core.C0926Og A002 = com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(c1636gi.A02());
        com.facebook.ads.redexgen.core.C1632ge A02 = c1636gi.A02();
        if (A00[6].length() != 12) {
            throw new java.lang.RuntimeException();
        }
        A00[0] = "Fh7";
        if (A002.A0O(A02, true)) {
            if (interfaceC1177Yh != null) {
                interfaceC1177Yh.AAo(abstractC1801jd.A2E(), abstractC1801jd.A2C());
            }
        } else {
            if (android.text.TextUtils.isEmpty(abstractC1801jd.A2C().A00())) {
                return;
            }
            com.facebook.ads.redexgen.core.X6.A0O(new com.facebook.ads.redexgen.core.X6(), c1636gi, com.facebook.ads.redexgen.core.XB.A00(abstractC1801jd.A2C().A00()), abstractC1801jd.A2E());
        }
    }
}
