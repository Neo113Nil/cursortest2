package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0708Qo {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C1350gb<AbstractC0700Qg, C0706Qm> A00 = new C1350gb<>();
    public final OS<AbstractC0700Qg> A01 = new OS<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private QJ A00(AbstractC0700Qg abstractC0700Qg, int i) {
        C0706Qm A0B;
        QJ info;
        int A08 = this.A00.A08(abstractC0700Qg);
        if (A08 >= 0 && (A0B = this.A00.A0B(A08)) != null) {
            int i2 = A0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i2 & i) != 0) {
                int i3 = A0B.A00;
                int index = ~i;
                A0B.A00 = i3 & index;
                if (i == 4) {
                    info = A0B.A02;
                } else if (i == 8) {
                    info = A0B.A01;
                } else {
                    throw new IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = A0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(A08);
                    C0706Qm.A02(A0B);
                }
                return info;
            }
        }
        return null;
    }

    public final QJ A03(AbstractC0700Qg abstractC0700Qg) {
        return A00(abstractC0700Qg, 8);
    }

    public final QJ A04(AbstractC0700Qg abstractC0700Qg) {
        return A00(abstractC0700Qg, 4);
    }

    public final AbstractC0700Qg A05(long j) {
        return this.A01.A08(j);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C0706Qm.A01();
    }

    public final void A08(long j, AbstractC0700Qg abstractC0700Qg) {
        this.A01.A0B(j, abstractC0700Qg);
    }

    public final void A09(AbstractC0700Qg abstractC0700Qg) {
        C0706Qm c0706Qm = this.A00.get(abstractC0700Qg);
        if (c0706Qm == null) {
            c0706Qm = C0706Qm.A00();
            this.A00.put(abstractC0700Qg, c0706Qm);
        }
        c0706Qm.A00 |= 1;
    }

    public final void A0A(AbstractC0700Qg abstractC0700Qg) {
        C0706Qm c0706Qm = this.A00.get(abstractC0700Qg);
        if (c0706Qm == null) {
            return;
        }
        c0706Qm.A00 &= -2;
    }

    public final void A0B(AbstractC0700Qg abstractC0700Qg) {
        int A06 = this.A01.A06() - 1;
        while (true) {
            if (A06 < 0) {
                break;
            }
            if (abstractC0700Qg == this.A01.A07(A06)) {
                this.A01.A0A(A06);
                break;
            }
            A06--;
        }
        C0706Qm info = this.A00.remove(abstractC0700Qg);
        if (info != null) {
            C0706Qm.A02(info);
        }
    }

    public final void A0C(AbstractC0700Qg abstractC0700Qg) {
        A0A(abstractC0700Qg);
    }

    public final void A0D(AbstractC0700Qg abstractC0700Qg, QJ qj) {
        C0706Qm c0706Qm = this.A00.get(abstractC0700Qg);
        if (c0706Qm == null) {
            c0706Qm = C0706Qm.A00();
            this.A00.put(abstractC0700Qg, c0706Qm);
        }
        c0706Qm.A00 |= 2;
        c0706Qm.A02 = qj;
    }

    public final void A0E(AbstractC0700Qg abstractC0700Qg, QJ qj) {
        C0706Qm c0706Qm = this.A00.get(abstractC0700Qg);
        if (c0706Qm == null) {
            c0706Qm = C0706Qm.A00();
            this.A00.put(abstractC0700Qg, c0706Qm);
        }
        c0706Qm.A01 = qj;
        c0706Qm.A00 |= 8;
    }

    public final void A0F(AbstractC0700Qg abstractC0700Qg, QJ qj) {
        C0706Qm c0706Qm = this.A00.get(abstractC0700Qg);
        if (c0706Qm == null) {
            c0706Qm = C0706Qm.A00();
            this.A00.put(abstractC0700Qg, c0706Qm);
        }
        c0706Qm.A02 = qj;
        c0706Qm.A00 |= 4;
    }

    public final void A0G(InterfaceC0707Qn interfaceC0707Qn) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC0700Qg A09 = this.A00.A09(size);
            C0706Qm A0A = this.A00.A0A(size);
            if ((A0A.A00 & 3) == 3) {
                interfaceC0707Qn.AJo(A09);
            } else {
                int index = A0A.A00;
                if ((index & 1) != 0) {
                    if (A0A.A02 == null) {
                        interfaceC0707Qn.AJo(A09);
                    } else {
                        interfaceC0707Qn.AGR(A09, A0A.A02, A0A.A01);
                    }
                } else if ((A0A.A00 & 14) == 14) {
                    interfaceC0707Qn.AGP(A09, A0A.A02, A0A.A01);
                } else if ((A0A.A00 & 12) == 12) {
                    interfaceC0707Qn.AGT(A09, A0A.A02, A0A.A01);
                } else {
                    int index2 = A0A.A00;
                    if ((index2 & 4) != 0) {
                        interfaceC0707Qn.AGR(A09, A0A.A02, null);
                    } else {
                        int index3 = A0A.A00;
                        if ((index3 & 8) != 0) {
                            QJ qj = A0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            interfaceC0707Qn.AGP(A09, qj, A0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            C0706Qm.A02(A0A);
        }
    }

    public final boolean A0H(AbstractC0700Qg abstractC0700Qg) {
        C0706Qm record = this.A00.get(abstractC0700Qg);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC0700Qg abstractC0700Qg) {
        C0706Qm record = this.A00.get(abstractC0700Qg);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
