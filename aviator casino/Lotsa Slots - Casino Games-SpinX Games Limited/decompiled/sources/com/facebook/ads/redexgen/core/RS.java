package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class RS {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final com.facebook.ads.redexgen.core.C1720i7<com.facebook.ads.redexgen.core.RK, com.facebook.ads.redexgen.core.RQ> A00 = new com.facebook.ads.redexgen.core.C1720i7<>();
    public final com.facebook.ads.redexgen.core.P6<com.facebook.ads.redexgen.core.RK> A01 = new com.facebook.ads.redexgen.core.P6<>();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 13);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new java.lang.RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private com.facebook.ads.redexgen.core.C0991Qx A00(com.facebook.ads.redexgen.core.RK rk, int i) {
        com.facebook.ads.redexgen.core.RQ A0B;
        com.facebook.ads.redexgen.core.C0991Qx info;
        int A08 = this.A00.A08(rk);
        if (A08 >= 0 && (A0B = this.A00.A0B(A08)) != null) {
            int i2 = A0B.A00;
            if (A03[2].length() != 2) {
                throw new java.lang.RuntimeException();
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
                    throw new java.lang.IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = A0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(A08);
                    com.facebook.ads.redexgen.core.RQ.A02(A0B);
                }
                return info;
            }
        }
        return null;
    }

    public final com.facebook.ads.redexgen.core.C0991Qx A03(com.facebook.ads.redexgen.core.RK rk) {
        return A00(rk, 8);
    }

    public final com.facebook.ads.redexgen.core.C0991Qx A04(com.facebook.ads.redexgen.core.RK rk) {
        return A00(rk, 4);
    }

    public final com.facebook.ads.redexgen.core.RK A05(long j) {
        return this.A01.A08(j);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        com.facebook.ads.redexgen.core.RQ.A01();
    }

    public final void A08(long j, com.facebook.ads.redexgen.core.RK rk) {
        this.A01.A0B(j, rk);
    }

    public final void A09(com.facebook.ads.redexgen.core.RK rk) {
        com.facebook.ads.redexgen.core.RQ rq = this.A00.get(rk);
        if (rq == null) {
            rq = com.facebook.ads.redexgen.core.RQ.A00();
            this.A00.put(rk, rq);
        }
        rq.A00 |= 1;
    }

    public final void A0A(com.facebook.ads.redexgen.core.RK rk) {
        com.facebook.ads.redexgen.core.RQ rq = this.A00.get(rk);
        if (rq == null) {
            return;
        }
        rq.A00 &= -2;
    }

    public final void A0B(com.facebook.ads.redexgen.core.RK rk) {
        int A06 = this.A01.A06() - 1;
        while (true) {
            if (A06 < 0) {
                break;
            }
            if (rk == this.A01.A07(A06)) {
                this.A01.A0A(A06);
                break;
            }
            A06--;
        }
        com.facebook.ads.redexgen.core.RQ info = this.A00.remove(rk);
        if (info != null) {
            com.facebook.ads.redexgen.core.RQ.A02(info);
        }
    }

    public final void A0C(com.facebook.ads.redexgen.core.RK rk) {
        A0A(rk);
    }

    public final void A0D(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.C0991Qx c0991Qx) {
        com.facebook.ads.redexgen.core.RQ rq = this.A00.get(rk);
        if (rq == null) {
            rq = com.facebook.ads.redexgen.core.RQ.A00();
            this.A00.put(rk, rq);
        }
        rq.A00 |= 2;
        rq.A02 = c0991Qx;
    }

    public final void A0E(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.C0991Qx c0991Qx) {
        com.facebook.ads.redexgen.core.RQ rq = this.A00.get(rk);
        if (rq == null) {
            rq = com.facebook.ads.redexgen.core.RQ.A00();
            this.A00.put(rk, rq);
        }
        rq.A01 = c0991Qx;
        rq.A00 |= 8;
    }

    public final void A0F(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.C0991Qx c0991Qx) {
        com.facebook.ads.redexgen.core.RQ rq = this.A00.get(rk);
        if (rq == null) {
            rq = com.facebook.ads.redexgen.core.RQ.A00();
            this.A00.put(rk, rq);
        }
        rq.A02 = c0991Qx;
        rq.A00 |= 4;
    }

    public final void A0G(com.facebook.ads.redexgen.core.RR rr) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            com.facebook.ads.redexgen.core.RK A09 = this.A00.A09(size);
            com.facebook.ads.redexgen.core.RQ A0A = this.A00.A0A(size);
            if ((A0A.A00 & 3) == 3) {
                rr.AKZ(A09);
            } else {
                int index = A0A.A00;
                if ((index & 1) != 0) {
                    if (A0A.A02 == null) {
                        rr.AKZ(A09);
                    } else {
                        rr.AHB(A09, A0A.A02, A0A.A01);
                    }
                } else if ((A0A.A00 & 14) == 14) {
                    rr.AH9(A09, A0A.A02, A0A.A01);
                } else if ((A0A.A00 & 12) == 12) {
                    rr.AHD(A09, A0A.A02, A0A.A01);
                } else {
                    int index2 = A0A.A00;
                    if ((index2 & 4) != 0) {
                        rr.AHB(A09, A0A.A02, null);
                    } else {
                        int index3 = A0A.A00;
                        if ((index3 & 8) != 0) {
                            com.facebook.ads.redexgen.core.C0991Qx c0991Qx = A0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new java.lang.RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            rr.AH9(A09, c0991Qx, A0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            com.facebook.ads.redexgen.core.RQ.A02(A0A);
        }
    }

    public final boolean A0H(com.facebook.ads.redexgen.core.RK rk) {
        com.facebook.ads.redexgen.core.RQ record = this.A00.get(rk);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(com.facebook.ads.redexgen.core.RK rk) {
        com.facebook.ads.redexgen.core.RQ record = this.A00.get(rk);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
