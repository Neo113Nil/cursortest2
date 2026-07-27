package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class H3 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-65, -31, -35, -47, -16, -27, -24, -36, -12, -14, -7, -7, -14, -9, -16, -87, -5, -18, -10, -22, -14, -9, -19, -18, -5, -87, -8, -17, -87, -10, -22, -11, -17, -8, -5, -10, -18, -19, -87, -36, -50, -46, -87, -41, -54, -43, -87, -2, -9, -14, -3, -73};
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A00(C17374v c17374v) {
        int i = 0;
        while (value != 0) {
            int b = c17374v.A0I();
            i += b;
            if (b != 255) {
                return i;
            }
        }
        return -1;
    }

    public static void A03(long j, C17374v c17374v, InterfaceC2037Hd[] interfaceC2037HdArr) {
        while (true) {
            if (c17374v.A07() > 1) {
                int A002 = A00(c17374v);
                int A003 = A00(c17374v);
                int A09 = c17374v.A09() + A003;
                if (A003 != -1) {
                    int payloadType = c17374v.A07();
                    if (A003 <= payloadType) {
                        if (A002 == 4 && A003 >= 8) {
                            int userIdentifier = c17374v.A0I();
                            int providerCode = c17374v.A0M();
                            int countryCode = 0;
                            if (providerCode == 49) {
                                countryCode = c17374v.A0C();
                            }
                            int A0I = c17374v.A0I();
                            if (providerCode == 47) {
                                c17374v.A0g(1);
                            }
                            int i = (userIdentifier == 181 && (providerCode == 49 || providerCode == 47) && A0I == 3) ? 1 : 0;
                            if (providerCode == 49) {
                                int userDataTypeCode = countryCode != 1195456820 ? 0 : 1;
                                i &= userDataTypeCode;
                            }
                            if (i != 0) {
                                A04(j, c17374v, interfaceC2037HdArr);
                            }
                        }
                        c17374v.A0f(A09);
                    }
                }
                AbstractC17224g.A07(A01(0, 7, 3), A01(7, 45, 16));
                A09 = c17374v.A0A();
                c17374v.A0f(A09);
            } else {
                return;
            }
        }
    }

    public static void A04(long j, C17374v c17374v, InterfaceC2037Hd[] interfaceC2037HdArr) {
        int firstByte = c17374v.A0I();
        if (!((firstByte & 64) != 0)) {
            return;
        }
        c17374v.A0g(1);
        int i = (firstByte & 31) * 3;
        int A09 = c17374v.A09();
        for (InterfaceC2037Hd interfaceC2037Hd : interfaceC2037HdArr) {
            c17374v.A0f(A09);
            interfaceC2037Hd.AIr(c17374v, i);
            if (j != -9223372036854775807L) {
                interfaceC2037Hd.AIu(j, 1, i, 0, null);
            }
        }
    }
}
