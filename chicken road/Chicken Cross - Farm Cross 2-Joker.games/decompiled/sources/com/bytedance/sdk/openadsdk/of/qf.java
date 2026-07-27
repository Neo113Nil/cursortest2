package com.bytedance.sdk.openadsdk.of;

import com.bytedance.sdk.openadsdk.of.gpj;
import com.bytedance.sdk.openadsdk.of.hc;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class qf {
    private static final int[] sf = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    static final Charset pcc = StandardCharsets.ISO_8859_1;

    private static int pcc(gm gmVar) {
        return vh.pcc(gmVar) + vh.sf(gmVar) + vh.gm(gmVar) + vh.oo(gmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x013b, code lost:
    
        if (com.bytedance.sdk.openadsdk.of.jr.pcc(r8) != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jr pcc(String str, kj kjVar, Map<wh, ?> map) throws lo {
        gpj pcc2;
        gpj gpjVar;
        com.bytedance.sdk.openadsdk.of.pcc pccVar;
        oo pcc3;
        int i;
        boolean z = map != null && map.containsKey(wh.GS1_FORMAT) && Boolean.parseBoolean(map.get(wh.GS1_FORMAT).toString());
        boolean z2 = map != null && map.containsKey(wh.QR_COMPACT) && Boolean.parseBoolean(map.get(wh.QR_COMPACT).toString());
        Charset charset = pcc;
        boolean z3 = map != null && map.containsKey(wh.CHARACTER_SET);
        if (z3) {
            try {
                charset = Charset.forName(map.get(wh.CHARACTER_SET).toString());
            } catch (UnsupportedCharsetException unused) {
            }
        }
        if (z2) {
            gbb gbbVar = gbb.BYTE;
            if (charset.equals(pcc)) {
                charset = null;
            }
            hc.sf pcc4 = hc.pcc(str, null, charset, z, kjVar);
            pccVar = new com.bytedance.sdk.openadsdk.of.pcc();
            pcc4.pcc(pccVar);
            gpjVar = pcc4.sf();
        } else {
            gbb pcc5 = pcc(str, charset);
            com.bytedance.sdk.openadsdk.of.pcc pccVar2 = new com.bytedance.sdk.openadsdk.of.pcc();
            if (pcc5 == gbb.BYTE && z3 && (pcc3 = oo.pcc(charset)) != null) {
                pcc(pcc3, pccVar2);
            }
            if (z) {
                pcc(gbb.FNC1_FIRST_POSITION, pccVar2);
            }
            pcc(pcc5, pccVar2);
            com.bytedance.sdk.openadsdk.of.pcc pccVar3 = new com.bytedance.sdk.openadsdk.of.pcc();
            pcc(str, pcc5, pccVar3, charset);
            if (map != null && map.containsKey(wh.QR_VERSION)) {
                pcc2 = gpj.pcc(Integer.parseInt(map.get(wh.QR_VERSION).toString()));
                if (!pcc(pcc(pcc5, pccVar2, pccVar3, pcc2), pcc2, kjVar)) {
                    throw new lo("Data too big for requested version");
                }
            } else {
                pcc2 = pcc(kjVar, pcc5, pccVar2, pccVar3);
            }
            com.bytedance.sdk.openadsdk.of.pcc pccVar4 = new com.bytedance.sdk.openadsdk.of.pcc();
            pccVar4.pcc(pccVar2);
            pcc(pcc5 == gbb.BYTE ? pccVar3.sf() : str.length(), pcc2, pcc5, pccVar4);
            pccVar4.pcc(pccVar3);
            gpjVar = pcc2;
            pccVar = pccVar4;
        }
        gpj.sf pcc6 = gpjVar.pcc(kjVar);
        int sf2 = gpjVar.sf() - pcc6.gm();
        pcc(sf2, pccVar);
        com.bytedance.sdk.openadsdk.of.pcc pcc7 = pcc(pccVar, gpjVar.sf(), sf2, pcc6.sf());
        jr jrVar = new jr();
        int gm = gpjVar.gm();
        gm gmVar = new gm(gm, gm);
        if (map != null && map.containsKey(wh.QR_MASK_PATTERN)) {
            i = Integer.parseInt(map.get(wh.QR_MASK_PATTERN).toString());
        }
        i = -1;
        if (i == -1) {
            i = pcc(pcc7, kjVar, gpjVar, gmVar);
        }
        tmg.pcc(pcc7, kjVar, gpjVar, i, gmVar);
        jrVar.pcc(gmVar);
        return jrVar;
    }

    private static gpj pcc(kj kjVar, gbb gbbVar, com.bytedance.sdk.openadsdk.of.pcc pccVar, com.bytedance.sdk.openadsdk.of.pcc pccVar2) throws lo {
        return pcc(pcc(gbbVar, pccVar, pccVar2, pcc(pcc(gbbVar, pccVar, pccVar2, gpj.pcc(1)), kjVar)), kjVar);
    }

    private static int pcc(gbb gbbVar, com.bytedance.sdk.openadsdk.of.pcc pccVar, com.bytedance.sdk.openadsdk.of.pcc pccVar2, gpj gpjVar) {
        return pccVar.pcc() + gbbVar.pcc(gpjVar) + pccVar2.pcc();
    }

    static int pcc(int i) {
        int[] iArr = sf;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    private static gbb pcc(String str, Charset charset) {
        if (lu.pcc != null && lu.pcc.equals(charset) && pcc(str)) {
            return gbb.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else {
                if (pcc(charAt) == -1) {
                    return gbb.BYTE;
                }
                z = true;
            }
        }
        if (z) {
            return gbb.ALPHANUMERIC;
        }
        if (z2) {
            return gbb.NUMERIC;
        }
        return gbb.BYTE;
    }

    static boolean pcc(String str) {
        byte[] bytes = str.getBytes(lu.pcc);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & 255;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    private static int pcc(com.bytedance.sdk.openadsdk.of.pcc pccVar, kj kjVar, gpj gpjVar, gm gmVar) throws lo {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            tmg.pcc(pccVar, kjVar, gpjVar, i3, gmVar);
            int pcc2 = pcc(gmVar);
            if (pcc2 < i) {
                i2 = i3;
                i = pcc2;
            }
        }
        return i2;
    }

    private static gpj pcc(int i, kj kjVar) throws lo {
        for (int i2 = 1; i2 <= 40; i2++) {
            gpj pcc2 = gpj.pcc(i2);
            if (pcc(i, pcc2, kjVar)) {
                return pcc2;
            }
        }
        throw new lo("Data too big");
    }

    static boolean pcc(int i, gpj gpjVar, kj kjVar) {
        return gpjVar.sf() - gpjVar.pcc(kjVar).gm() >= (i + 7) / 8;
    }

    static void pcc(int i, com.bytedance.sdk.openadsdk.of.pcc pccVar) throws lo {
        int i2 = i * 8;
        if (pccVar.pcc() > i2) {
            throw new lo("data bits cannot fit in the QR Code" + pccVar.pcc() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && pccVar.pcc() < i2; i3++) {
            pccVar.pcc(false);
        }
        int pcc2 = pccVar.pcc() & 7;
        if (pcc2 > 0) {
            while (pcc2 < 8) {
                pccVar.pcc(false);
                pcc2++;
            }
        }
        int sf2 = i - pccVar.sf();
        for (int i4 = 0; i4 < sf2; i4++) {
            pccVar.pcc((i4 & 1) == 0 ? 236 : 17, 8);
        }
        if (pccVar.pcc() != i2) {
            throw new lo("Bits size does not equal capacity");
        }
    }

    static void pcc(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws lo {
        if (i4 >= i3) {
            throw new lo("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        int i9 = i2 / i3;
        int i10 = i9 + 1;
        int i11 = i7 - i9;
        int i12 = i8 - i10;
        if (i11 != i12) {
            throw new lo("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new lo("RS blocks mismatch");
        }
        if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
            throw new lo("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i9;
            iArr2[0] = i11;
        } else {
            iArr[0] = i10;
            iArr2[0] = i12;
        }
    }

    static com.bytedance.sdk.openadsdk.of.pcc pcc(com.bytedance.sdk.openadsdk.of.pcc pccVar, int i, int i2, int i3) throws lo {
        if (pccVar.sf() != i2) {
            throw new lo("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            pcc(i, i2, i3, i7, iArr, iArr2);
            int i8 = iArr[0];
            byte[] bArr = new byte[i8];
            pccVar.pcc(i4 * 8, bArr, 0, i8);
            byte[] pcc2 = pcc(bArr, iArr2[0]);
            arrayList.add(new pcc(bArr, pcc2));
            i5 = Math.max(i5, i8);
            i6 = Math.max(i6, pcc2.length);
            i4 += iArr[0];
        }
        if (i2 != i4) {
            throw new lo("Data bytes does not match offset");
        }
        com.bytedance.sdk.openadsdk.of.pcc pccVar2 = new com.bytedance.sdk.openadsdk.of.pcc();
        for (int i9 = 0; i9 < i5; i9++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] pcc3 = ((pcc) it.next()).pcc();
                if (i9 < pcc3.length) {
                    pccVar2.pcc(pcc3[i9], 8);
                }
            }
        }
        for (int i10 = 0; i10 < i6; i10++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] sf2 = ((pcc) it2.next()).sf();
                if (i10 < sf2.length) {
                    pccVar2.pcc(sf2[i10], 8);
                }
            }
        }
        if (i == pccVar2.sf()) {
            return pccVar2;
        }
        throw new lo("Interleaving error: " + i + " and " + pccVar2.sf() + " differ.");
    }

    static byte[] pcc(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new nac(vy.pcc).pcc(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    static void pcc(gbb gbbVar, com.bytedance.sdk.openadsdk.of.pcc pccVar) {
        pccVar.pcc(gbbVar.pcc(), 4);
    }

    static void pcc(int i, gpj gpjVar, gbb gbbVar, com.bytedance.sdk.openadsdk.of.pcc pccVar) throws lo {
        int pcc2 = gbbVar.pcc(gpjVar);
        int i2 = 1 << pcc2;
        if (i >= i2) {
            throw new lo(i + " is bigger than " + (i2 - 1));
        }
        pccVar.pcc(i, pcc2);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.of.qf$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[gbb.values().length];
            pcc = iArr;
            try {
                iArr[gbb.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[gbb.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[gbb.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                pcc[gbb.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void pcc(String str, gbb gbbVar, com.bytedance.sdk.openadsdk.of.pcc pccVar, Charset charset) throws lo {
        int i = AnonymousClass1.pcc[gbbVar.ordinal()];
        if (i == 1) {
            pcc((CharSequence) str, pccVar);
            return;
        }
        if (i == 2) {
            sf(str, pccVar);
        } else if (i == 3) {
            pcc(str, pccVar, charset);
        } else {
            if (i == 4) {
                pcc(str, pccVar);
                return;
            }
            throw new lo("Invalid mode: ".concat(String.valueOf(gbbVar)));
        }
    }

    static void pcc(CharSequence charSequence, com.bytedance.sdk.openadsdk.of.pcc pccVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                pccVar.pcc((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    pccVar.pcc((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    pccVar.pcc(charAt, 4);
                }
            }
        }
    }

    static void sf(CharSequence charSequence, com.bytedance.sdk.openadsdk.of.pcc pccVar) throws lo {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int pcc2 = pcc(charSequence.charAt(i));
            if (pcc2 == -1) {
                throw new lo();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int pcc3 = pcc(charSequence.charAt(i2));
                if (pcc3 == -1) {
                    throw new lo();
                }
                pccVar.pcc((pcc2 * 45) + pcc3, 11);
                i += 2;
            } else {
                pccVar.pcc(pcc2, 6);
                i = i2;
            }
        }
    }

    static void pcc(String str, com.bytedance.sdk.openadsdk.of.pcc pccVar, Charset charset) {
        for (byte b : str.getBytes(charset)) {
            pccVar.pcc(b, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[LOOP:0: B:6:0x0013->B:13:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void pcc(String str, com.bytedance.sdk.openadsdk.of.pcc pccVar) throws lo {
        int i;
        if (lu.pcc == null) {
            throw new lo("SJIS Charset not supported on this platform");
        }
        byte[] bytes = str.getBytes(lu.pcc);
        if (bytes.length % 2 != 0) {
            throw new lo("Kanji byte size not even");
        }
        int length = bytes.length - 1;
        for (int i2 = 0; i2 < length; i2 += 2) {
            int i3 = ((bytes[i2] & 255) << 8) | (bytes[i2 + 1] & 255);
            int i4 = 33088;
            if (i3 < 33088 || i3 > 40956) {
                if (i3 < 57408 || i3 > 60351) {
                    i = -1;
                    if (i != -1) {
                        throw new lo("Invalid byte sequence");
                    }
                    pccVar.pcc(((i >> 8) * 192) + (i & 255), 13);
                } else {
                    i4 = 49472;
                }
            }
            i = i3 - i4;
            if (i != -1) {
            }
        }
    }

    private static void pcc(oo ooVar, com.bytedance.sdk.openadsdk.of.pcc pccVar) {
        pccVar.pcc(gbb.ECI.pcc(), 4);
        pccVar.pcc(ooVar.pcc(), 8);
    }

    static final class pcc {
        private final byte[] pcc;
        private final byte[] sf;

        pcc(byte[] bArr, byte[] bArr2) {
            this.pcc = bArr;
            this.sf = bArr2;
        }

        public byte[] pcc() {
            return this.pcc;
        }

        public byte[] sf() {
            return this.sf;
        }
    }
}
