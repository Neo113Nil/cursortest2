package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1840kH extends com.facebook.ads.redexgen.core.AbstractC0888Mt {
    public static java.lang.String A04;
    public static java.lang.String A05;
    public static java.lang.String A06;
    public static byte[] A07;
    public static java.lang.String[] A08 = {"yKsrGZvRhlHO", "9EputwQvm", "xy4ysuU", "7AjoeEFyRFUmAcGguWz5skIE39kXLiT8", "yw7hkrjnug4F5v8JlqxYlpspwNYrqeOP", "YdvcKbM", "Mv5W7ZjuxpjDlIvwBIaHg3eS9AlP", "wZHnfIG7rJSoOb"};
    public int A00;
    public final boolean A01;
    public final com.facebook.ads.redexgen.core.N0 A02;
    public final boolean A03;

    public static java.lang.String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0E() {
        byte[] bArr = {60, 19, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC4, 95, 19, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, 87, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CR, 87, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 87, 47, 48, 60, 46, 17, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CAN, 44, 7, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SYN, 35, 42, 46, 57, 42, com.google.common.base.Ascii.DLE, 59, 38, 34, 42, 34, 56, 57, 46, 34, 32, 40, 41, 47, 57, 57, 63, 41, 41, 65, 90, 93, 66, 81, 70, 71, 85, 88, 107, 88, 93, 90, 95, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC2, 4, 19, 62, com.google.common.base.Ascii.NAK, 19, 0, 2, 10, 4, 19, 62, 8, com.google.common.base.Ascii.DC2, 62, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.NAK, 62, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CR, 7, 1, com.google.common.base.Ascii.ETB, 0, 17, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, 17, com.google.common.base.Ascii.EM, 111, 121, 108, 123, 112, 71, 121, 118, 124, 71, 122, 106, 119, 111, 107, 125};
        if (A08[1].length() != 9) {
            throw new java.lang.RuntimeException();
        }
        A08[7] = "E0qxoPtldo8saq";
        A07 = bArr;
    }

    public abstract com.facebook.ads.redexgen.core.EnumC0885Mq A0H();

    static {
        A0E();
        A04 = A0D(64, 7, 106);
        A05 = A0D(85, 24, 81);
        A06 = A0D(118, 16, 40);
    }

    public AbstractC1840kH(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str, com.facebook.ads.redexgen.core.N0 n0, boolean z) {
        this(c1636gi, va, str, n0, z, false);
    }

    public AbstractC1840kH(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str, com.facebook.ads.redexgen.core.N0 n0, boolean z, boolean z2) {
        super(c1636gi, va, str);
        this.A00 = 0;
        this.A02 = n0;
        this.A03 = z;
        this.A01 = z2;
        if (this.A02 != null) {
            this.A02.A07(new com.facebook.ads.redexgen.core.InterfaceC0887Ms() { // from class: com.facebook.ads.redexgen.X.kI
                @Override // com.facebook.ads.redexgen.core.InterfaceC0887Ms
                public final void AFa() {
                    com.facebook.ads.redexgen.core.AbstractC1840kH.this.A0I();
                }
            });
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0888Mt
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A0G(java.lang.String str) {
        if (this.A02 != null) {
            this.A02.A08(super.A03);
        }
        if (com.facebook.ads.redexgen.core.C1315bV.A04(super.A01)) {
            return com.facebook.ads.redexgen.core.EnumC0885Mq.A06;
        }
        if (A0L(str)) {
            return com.facebook.ads.redexgen.core.EnumC0885Mq.A06;
        }
        return A0H();
    }

    public final /* synthetic */ void A0I() {
        this.A00++;
        if (A0L(null)) {
            com.facebook.ads.redexgen.core.InterfaceC0886Mr interfaceC0886Mr = super.A00;
            if (A08[1].length() != 9) {
                throw new java.lang.RuntimeException();
            }
            A08[0] = "ZLZB3DtfqcSTIr4ga6zBSlI";
            if (interfaceC0886Mr != null) {
                super.A00.ACk();
            }
        }
    }

    public final void A0J(java.util.Map<java.lang.String, java.lang.String> extraData, com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq) {
        if (!android.text.TextUtils.isEmpty(super.A03)) {
            if (this instanceof com.facebook.ads.redexgen.core.AnonymousClass87) {
                super.A02.AC8(super.A03, extraData);
            } else {
                super.A02.ABM(super.A03, extraData);
            }
            boolean A02 = com.facebook.ads.redexgen.core.EnumC0885Mq.A02(enumC0885Mq);
            boolean z = this.A02 != null;
            boolean isError = com.facebook.ads.redexgen.core.C1086Up.A2U(super.A01);
            if (isError) {
                java.util.Map<java.lang.String, java.lang.String> navigationDataMap = new java.util.HashMap<>();
                boolean isError2 = !A02;
                navigationDataMap.put(A04, java.lang.Boolean.toString(isError2));
                navigationDataMap.put(A05, java.lang.Boolean.toString(z));
                java.lang.String str = A06;
                boolean isError3 = this.A01;
                navigationDataMap.put(str, java.lang.Boolean.toString(isError3));
                super.A02.ABn(super.A03, navigationDataMap);
            }
            if (this.A02 != null) {
                this.A02.A06(enumC0885Mq);
                if (A02) {
                    this.A02.A05();
                }
            } else {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(A0D(47, 10, 127), java.lang.Long.toString(-1L));
                hashMap.put(A0D(38, 9, 67), java.lang.Long.toString(-1L));
                hashMap.put(A0D(57, 7, 125), com.facebook.ads.redexgen.core.EnumC0885Mq.A05.name());
                super.A02.AC9(super.A03, hashMap);
            }
        }
        com.facebook.ads.redexgen.core.XI.A04(super.A01, A0D(0, 12, 79));
    }

    public final boolean A0K(android.net.Uri uri) {
        try {
            java.lang.String queryParameter = uri.getQueryParameter(A0D(71, 14, 4));
            boolean redirectedToApp = android.text.TextUtils.isEmpty(queryParameter);
            if (redirectedToApp) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent(A0D(12, 26, 73), com.facebook.ads.redexgen.core.XB.A00(queryParameter));
            intent.addFlags(268435456);
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(1024);
            }
            return com.facebook.ads.redexgen.core.C1140Wu.A0D(super.A01, intent);
        } catch (com.facebook.ads.redexgen.core.C1138Ws unused) {
            return false;
        }
    }

    public final boolean A0L(java.lang.String str) {
        return (str == null || !str.equals(A0D(109, 9, 66))) && this.A00 != 0 && this.A00 >= com.facebook.ads.redexgen.core.C1086Up.A0I(super.A01);
    }
}
