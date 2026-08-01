package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* renamed from: com.facebook.ads.redexgen.X.mE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3253mE extends AbstractC2079Iu {
    public static byte[] A03;
    public static String[] A04 = {"GA2pmS7X4ROGOgByNCdi18taC", "aAh4RNygY6pz4IdlAQ9iIXEvCFWWkzLF", "JuodTrkofMpjka010", "J1Lmlws0eqmUUC5GC3jhEdxTYojxk4jf", "6Ya7uqSvo", "3XyRCMiSsp8rG7f8J4q6xkUhsqnZzFaE", "VspF2Q", "vTSdivoAe22KROlTGGoK4NP8GmV"};
    public final long A00;
    public final List<C3253mE> A01;
    public final List<C3252mD> A02;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{68, 7, Ascii.VT, 10, Ascii.DLE, 5, Ascii.CR, 10, 1, Ascii.SYN, Ascii.ETB, 94, 68, 105, 37, 44, 40, 63, 44, 58, 115, 105};
    }

    static {
        A05();
    }

    public C3253mE(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C3253mE A06(int i) {
        int size = this.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3253mE c3253mE = this.A01.get(i2);
            int i3 = A04[7].length();
            if (i3 == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "n49CDGF4gSULbNzRfDOXSmTNWTogkE10";
            strArr[3] = "P3Agw1JJwclCkyu9DcuVtuUqOjxfkaYK";
            C3253mE c3253mE2 = c3253mE;
            int childrenSize = ((AbstractC2079Iu) c3253mE2).A00;
            if (childrenSize == i) {
                return c3253mE2;
            }
        }
        if (A04[4].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[1] = "eWhxbLiQvYVwUHrDqb1spRuVxj0ikF7I";
        strArr2[3] = "G0JrlMiW26lgTwAQcPtVzhOkcvjPkvCh";
        return null;
    }

    public final C3252mD A07(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3252mD c3252mD = this.A02.get(i2);
            String[] strArr = A04;
            String str = strArr[2];
            String str2 = strArr[0];
            int i3 = str.length();
            int childrenSize = str2.length();
            if (i3 == childrenSize) {
                throw new RuntimeException();
            }
            A04[5] = "r5cbbIuLaeCnR7fWkiITKmUfsEKVcSuB";
            int childrenSize2 = ((AbstractC2079Iu) c3252mD).A00;
            if (childrenSize2 == i) {
                return c3252mD;
            }
        }
        return null;
    }

    public final void A08(C3253mE c3253mE) {
        this.A01.add(c3253mE);
    }

    public final void A09(C3252mD c3252mD) {
        this.A02.add(c3252mD);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2079Iu
    public final String toString() {
        return AbstractC2079Iu.A02(super.A00) + A04(13, 9, 29) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 48) + Arrays.toString(this.A01.toArray());
    }
}
