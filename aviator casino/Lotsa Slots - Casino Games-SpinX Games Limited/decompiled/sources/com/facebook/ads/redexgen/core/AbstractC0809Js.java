package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Js, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0809Js {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"igoOoy3NY4UMRHdpx9h3UlwGdvMc0fc9", "i1My3cIv2txc6hnpPF2N9ufK5yKqcDwp", "ZPKM82HH2UhiHuE6c", "N8bcPF6", "fP1uMJr9juYIT", "Q74KZy4WGIwm3", "kYmec6ZLKDIoPLbK3wnMb68OSlbBsX7E", "P2I33wOyCa7MBOFZieFJQqH5gMHCVrks"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 63);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-17, 17, com.google.common.base.Ascii.CR, 1, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, -41, -17, -19, -12, -12, -19, -14, -21, -92, -10, -23, -15, -27, -19, -14, -24, -23, -10, -92, -13, -22, -92, -15, -27, -16, -22, -13, -10, -15, -23, -24, -92, -41, -55, -51, -92, -46, -59, -48, -92, -7, -14, -19, -8, -78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A04(long j, com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.InterfaceC0743Hd[] interfaceC0743HdArr) {
        int A0I = c04434v.A0I();
        if ((A0I & 64) != 0) {
            c04434v.A0g(1);
            int i = (A0I & 31) * 3;
            int A09 = c04434v.A09();
            for (com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd : interfaceC0743HdArr) {
                c04434v.A0f(A09);
                interfaceC0743Hd.AIr(c04434v, i);
                interfaceC0743Hd.AIu(j, 1, i, 0, null);
            }
        }
    }

    static {
        A02();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A00(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int i = 0;
        while (value != 0) {
            int A0I = c04434v.A0I();
            i += A0I;
            int b = A01[3].length();
            if (b == 4) {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "hfDUXVNQknc2urmlb";
            if (A0I != 255) {
                return i;
            }
        }
        return -1;
    }

    public static void A03(long j, com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.InterfaceC0743Hd[] interfaceC0743HdArr) {
        while (true) {
            if (c04434v.A07() > 1) {
                int A002 = A00(c04434v);
                int A003 = A00(c04434v);
                int A09 = c04434v.A09() + A003;
                if (A003 != -1) {
                    int payloadType = c04434v.A07();
                    if (A003 <= payloadType) {
                        if (A002 == 4 && A003 >= 8) {
                            int userIdentifier = c04434v.A0I();
                            int providerCode = c04434v.A0M();
                            int countryCode = 0;
                            if (providerCode == 49) {
                                countryCode = c04434v.A0C();
                            }
                            int A0I = c04434v.A0I();
                            if (providerCode == 47) {
                                c04434v.A0g(1);
                            }
                            int i = (userIdentifier == 181 && (providerCode == 49 || providerCode == 47) && A0I == 3) ? 1 : 0;
                            if (providerCode == 49) {
                                int userDataTypeCode = countryCode != 1195456820 ? 0 : 1;
                                i &= userDataTypeCode;
                            }
                            if (i != 0) {
                                A04(j, c04434v, interfaceC0743HdArr);
                            }
                        }
                        c04434v.A0f(A09);
                    }
                }
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A01(0, 7, 109), A01(7, 45, 69));
                A09 = c04434v.A0A();
                c04434v.A0f(A09);
            } else {
                return;
            }
        }
    }
}
