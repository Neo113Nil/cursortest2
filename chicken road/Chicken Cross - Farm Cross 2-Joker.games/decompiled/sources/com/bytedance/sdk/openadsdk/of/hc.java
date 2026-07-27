package com.bytedance.sdk.openadsdk.of;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
final class hc {
    private final vj gm;
    private final kj oo;
    private final String pcc;
    private final boolean sf;

    static boolean pcc(char c) {
        return c >= '0' && c <= '9';
    }

    private enum gm {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");

        gm(String str) {
        }
    }

    hc(String str, Charset charset, boolean z, kj kjVar) {
        this.pcc = str;
        this.sf = z;
        this.gm = new vj(str, charset, -1);
        this.oo = kjVar;
    }

    static sf pcc(String str, gpj gpjVar, Charset charset, boolean z, kj kjVar) throws lo {
        return new hc(str, charset, z, kjVar).pcc(gpjVar);
    }

    sf pcc(gpj gpjVar) throws lo {
        if (gpjVar == null) {
            gpj[] gpjVarArr = {pcc(gm.SMALL), pcc(gm.MEDIUM), pcc(gm.LARGE)};
            sf[] sfVarArr = {gm(gpjVarArr[0]), gm(gpjVarArr[1]), gm(gpjVarArr[2])};
            int i = Integer.MAX_VALUE;
            int i2 = -1;
            for (int i3 = 0; i3 < 3; i3++) {
                int pcc2 = sfVarArr[i3].pcc();
                if (qf.pcc(pcc2, gpjVarArr[i3], this.oo) && pcc2 < i) {
                    i2 = i3;
                    i = pcc2;
                }
            }
            if (i2 < 0) {
                throw new lo("Data too big for any version");
            }
            return sfVarArr[i2];
        }
        sf gm2 = gm(gpjVar);
        if (qf.pcc(gm2.pcc(), pcc(sf(gm2.sf())), this.oo)) {
            return gm2;
        }
        throw new lo("Data too big for version".concat(String.valueOf(gpjVar)));
    }

    static gm sf(gpj gpjVar) {
        return gpjVar.pcc() <= 9 ? gm.SMALL : gpjVar.pcc() <= 26 ? gm.MEDIUM : gm.LARGE;
    }

    static gpj pcc(gm gmVar) {
        int i = AnonymousClass1.pcc[gmVar.ordinal()];
        if (i == 1) {
            return gpj.pcc(9);
        }
        if (i == 2) {
            return gpj.pcc(26);
        }
        return gpj.pcc(40);
    }

    static boolean sf(char c) {
        return qf.pcc(String.valueOf(c));
    }

    static boolean gm(char c) {
        return qf.pcc(c) != -1;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.of.hc$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;
        static final /* synthetic */ int[] sf;

        static {
            int[] iArr = new int[gbb.values().length];
            sf = iArr;
            try {
                iArr[gbb.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                sf[gbb.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                sf[gbb.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                sf[gbb.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                sf[gbb.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[gm.values().length];
            pcc = iArr2;
            try {
                iArr2[gm.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pcc[gm.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                pcc[gm.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    boolean pcc(gbb gbbVar, char c) {
        int i = AnonymousClass1.sf[gbbVar.ordinal()];
        if (i == 1) {
            return sf(c);
        }
        if (i == 2) {
            return gm(c);
        }
        if (i != 3) {
            return i == 4;
        }
        return pcc(c);
    }

    static int pcc(gbb gbbVar) {
        int i;
        if (gbbVar == null || (i = AnonymousClass1.sf[gbbVar.ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new IllegalStateException("Illegal mode ".concat(String.valueOf(gbbVar)));
    }

    void pcc(pcc[][][] pccVarArr, int i, pcc pccVar) {
        pcc[] pccVarArr2 = pccVarArr[i + pccVar.vj][pccVar.oo];
        int pcc2 = pcc(pccVar.sf);
        pcc pccVar2 = pccVarArr2[pcc2];
        if (pccVar2 == null || pccVar2.qf > pccVar.qf) {
            pccVarArr2[pcc2] = pccVar;
        }
    }

    void pcc(gpj gpjVar, pcc[][][] pccVarArr, int i, pcc pccVar) {
        int i2;
        int pcc2 = this.gm.pcc();
        int sf2 = this.gm.sf();
        if (sf2 < 0 || !this.gm.pcc(this.pcc.charAt(i), sf2)) {
            sf2 = 0;
        } else {
            pcc2 = sf2 + 1;
        }
        int i3 = pcc2;
        for (int i4 = sf2; i4 < i3; i4++) {
            if (this.gm.pcc(this.pcc.charAt(i), i4)) {
                pcc(pccVarArr, i, new pcc(this, gbb.BYTE, i, i4, 1, pccVar, gpjVar, null));
            }
        }
        if (pcc(gbb.KANJI, this.pcc.charAt(i))) {
            pcc(pccVarArr, i, new pcc(this, gbb.KANJI, i, 0, 1, pccVar, gpjVar, null));
        }
        int length = this.pcc.length();
        if (pcc(gbb.ALPHANUMERIC, this.pcc.charAt(i))) {
            int i5 = i + 1;
            pcc(pccVarArr, i, new pcc(this, gbb.ALPHANUMERIC, i, 0, (i5 >= length || !pcc(gbb.ALPHANUMERIC, this.pcc.charAt(i5))) ? 1 : 2, pccVar, gpjVar, null));
        }
        if (pcc(gbb.NUMERIC, this.pcc.charAt(i))) {
            gbb gbbVar = gbb.NUMERIC;
            int i6 = i + 1;
            if (i6 >= length || !pcc(gbb.NUMERIC, this.pcc.charAt(i6))) {
                i2 = 1;
            } else {
                int i7 = i + 2;
                i2 = (i7 >= length || !pcc(gbb.NUMERIC, this.pcc.charAt(i7))) ? 2 : 3;
            }
            pcc(pccVarArr, i, new pcc(this, gbbVar, i, 0, i2, pccVar, gpjVar, null));
        }
    }

    sf gm(gpj gpjVar) throws lo {
        int length = this.pcc.length();
        pcc[][][] pccVarArr = (pcc[][][]) Array.newInstance((Class<?>) pcc.class, length + 1, this.gm.pcc(), 4);
        pcc(gpjVar, pccVarArr, 0, null);
        for (int i = 1; i <= length; i++) {
            for (int i2 = 0; i2 < this.gm.pcc(); i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    pcc pccVar = pccVarArr[i][i2][i3];
                    if (pccVar != null && i < length) {
                        pcc(gpjVar, pccVarArr, i, pccVar);
                    }
                }
            }
        }
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        int i6 = -1;
        for (int i7 = 0; i7 < this.gm.pcc(); i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                pcc pccVar2 = pccVarArr[length][i7][i8];
                if (pccVar2 != null && pccVar2.qf < i5) {
                    i5 = pccVar2.qf;
                    i4 = i7;
                    i6 = i8;
                }
            }
        }
        if (i4 < 0) {
            throw new lo("Internal error: failed to encode \"" + this.pcc + "\"");
        }
        return new sf(gpjVar, pccVarArr[length][i4][i6]);
    }

    private final class pcc {
        private final int gm;
        private final int oo;
        private final int qf;
        private final gbb sf;
        private final int vj;
        private final pcc wh;

        /* synthetic */ pcc(hc hcVar, gbb gbbVar, int i, int i2, int i3, pcc pccVar, gpj gpjVar, AnonymousClass1 anonymousClass1) {
            this(gbbVar, i, i2, i3, pccVar, gpjVar);
        }

        private pcc(gbb gbbVar, int i, int i2, int i3, pcc pccVar, gpj gpjVar) {
            this.sf = gbbVar;
            this.gm = i;
            int i4 = (gbbVar == gbb.BYTE || pccVar == null) ? i2 : pccVar.oo;
            this.oo = i4;
            this.vj = i3;
            this.wh = pccVar;
            boolean z = false;
            int i5 = pccVar != null ? pccVar.qf : 0;
            if ((gbbVar == gbb.BYTE && pccVar == null && i4 != 0) || (pccVar != null && i4 != pccVar.oo)) {
                z = true;
            }
            i5 = (pccVar == null || gbbVar != pccVar.sf || z) ? i5 + gbbVar.pcc(gpjVar) + 4 : i5;
            int i6 = AnonymousClass1.sf[gbbVar.ordinal()];
            if (i6 == 1) {
                i5 += 13;
            } else if (i6 == 2) {
                i5 += i3 == 1 ? 6 : 11;
            } else if (i6 == 3) {
                i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
            } else if (i6 == 4) {
                i5 += hc.this.gm.pcc(hc.this.pcc.substring(i, i3 + i), i2).length * 8;
                if (z) {
                    i5 += 12;
                }
            }
            this.qf = i5;
        }
    }

    final class sf {
        private final gpj gm;
        private final List<pcc> sf = new ArrayList();

        sf(gpj gpjVar, pcc pccVar) {
            int i;
            int i2;
            int i3 = 0;
            boolean z = false;
            while (true) {
                i = 1;
                if (pccVar == null) {
                    break;
                }
                int i4 = i3 + pccVar.vj;
                pcc pccVar2 = pccVar.wh;
                boolean z2 = (pccVar.sf == gbb.BYTE && pccVar2 == null && pccVar.oo != 0) || !(pccVar2 == null || pccVar.oo == pccVar2.oo);
                z = z2 ? true : z;
                if (pccVar2 == null || pccVar2.sf != pccVar.sf || z2) {
                    this.sf.add(0, new pcc(pccVar.sf, pccVar.gm, pccVar.oo, i4));
                    i4 = 0;
                }
                if (z2) {
                    this.sf.add(0, new pcc(gbb.ECI, pccVar.gm, pccVar.oo, 0));
                }
                pccVar = pccVar2;
                i3 = i4;
            }
            if (hc.this.sf) {
                pcc pccVar3 = this.sf.get(0);
                if (pccVar3 != null && pccVar3.sf != gbb.ECI && z) {
                    this.sf.add(0, new pcc(gbb.ECI, 0, 0, 0));
                }
                this.sf.add(this.sf.get(0).sf == gbb.ECI ? 1 : 0, new pcc(gbb.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int pcc2 = gpjVar.pcc();
            int i5 = AnonymousClass1.pcc[hc.sf(gpjVar).ordinal()];
            if (i5 == 1) {
                i2 = 9;
            } else if (i5 != 2) {
                i = 27;
                i2 = 40;
            } else {
                i = 10;
                i2 = 26;
            }
            int pcc3 = pcc(gpjVar);
            while (pcc2 < i2 && !qf.pcc(pcc3, gpj.pcc(pcc2), hc.this.oo)) {
                pcc2++;
            }
            while (pcc2 > i && qf.pcc(pcc3, gpj.pcc(pcc2 - 1), hc.this.oo)) {
                pcc2--;
            }
            this.gm = gpj.pcc(pcc2);
        }

        int pcc() {
            return pcc(this.gm);
        }

        private int pcc(gpj gpjVar) {
            Iterator<pcc> it = this.sf.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().pcc(gpjVar);
            }
            return i;
        }

        void pcc(com.bytedance.sdk.openadsdk.of.pcc pccVar) throws lo {
            Iterator<pcc> it = this.sf.iterator();
            while (it.hasNext()) {
                it.next().pcc(pccVar);
            }
        }

        gpj sf() {
            return this.gm;
        }

        final class pcc {
            private final int gm;
            private final int oo;
            private final gbb sf;
            private final int vj;

            pcc(gbb gbbVar, int i, int i2, int i3) {
                this.sf = gbbVar;
                this.gm = i;
                this.oo = i2;
                this.vj = i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int pcc(gpj gpjVar) {
                int i;
                int i2;
                int pcc = this.sf.pcc(gpjVar);
                int i3 = pcc + 4;
                int i4 = AnonymousClass1.sf[this.sf.ordinal()];
                if (i4 != 1) {
                    int i5 = 0;
                    if (i4 == 2) {
                        int i6 = this.vj;
                        i2 = i3 + ((i6 / 2) * 11);
                        if (i6 % 2 == 1) {
                            i5 = 6;
                        }
                    } else if (i4 == 3) {
                        int i7 = this.vj;
                        i2 = i3 + ((i7 / 3) * 10);
                        int i8 = i7 % 3;
                        if (i8 == 1) {
                            i5 = 4;
                        } else if (i8 == 2) {
                            i5 = 7;
                        }
                    } else {
                        if (i4 != 4) {
                            return i4 != 5 ? i3 : pcc + 12;
                        }
                        i = pcc() * 8;
                    }
                    return i2 + i5;
                }
                i = this.vj * 13;
                return i3 + i;
            }

            private int pcc() {
                if (this.sf != gbb.BYTE) {
                    return this.vj;
                }
                vj vjVar = hc.this.gm;
                String str = hc.this.pcc;
                int i = this.gm;
                return vjVar.pcc(str.substring(i, this.vj + i), this.oo).length;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void pcc(com.bytedance.sdk.openadsdk.of.pcc pccVar) throws lo {
                pccVar.pcc(this.sf.pcc(), 4);
                if (this.vj > 0) {
                    pccVar.pcc(pcc(), this.sf.pcc(sf.this.gm));
                }
                if (this.sf == gbb.ECI) {
                    pccVar.pcc(hc.this.gm.sf(this.oo), 8);
                } else if (this.vj > 0) {
                    String str = hc.this.pcc;
                    int i = this.gm;
                    qf.pcc(str.substring(i, this.vj + i), this.sf, pccVar, hc.this.gm.pcc(this.oo));
                }
            }
        }
    }
}
