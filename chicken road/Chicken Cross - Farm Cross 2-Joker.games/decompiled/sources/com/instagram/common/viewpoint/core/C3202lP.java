package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3202lP implements LE {
    public static byte[] A02;
    public static String[] A03 = {"H5L2tIFZt", "7T8ctTOgfri2uFWYkrl4fLjFw3zYZmyw", "rpSuNqLmPSNrp8BaktpsZc4frut4njZi", "OS1ujTmztQNXT6hqD6nsoX0kfRSYmmsY", "PkY6KfFeVbpCvwlFdEj", "TmaVkoyYGnCbszGh0vcMc", "p0AihzwiszaEN", "o1l4pHohEGjnpBhSGl6NtukXiQnI0CCo"};
    public final int A00;
    public final List<C3490qI> A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private List<C3490qI> A03(LD ld) {
        String A022;
        int i;
        if (A05(32)) {
            return this.A01;
        }
        C17374v c17374v = new C17374v(ld.A03);
        List<C3490qI> list = this.A01;
        while (c17374v.A07() > 0) {
            int A0I = c17374v.A0I();
            int A09 = c17374v.A09() + c17374v.A0I();
            if (A0I == 134) {
                list = new ArrayList<>();
                int A0I2 = c17374v.A0I() & 31;
                for (int i2 = 0; i2 < A0I2; i2++) {
                    String A0W = c17374v.A0W(3);
                    int A0I3 = c17374v.A0I();
                    boolean z = (A0I3 & 128) != 0;
                    if (z) {
                        A022 = A02(19, 19, 47);
                        i = A0I3 & 63;
                    } else {
                        A022 = A02(0, 19, 57);
                        i = 1;
                    }
                    byte A0I4 = (byte) c17374v.A0I();
                    c17374v.A0g(1);
                    List<byte[]> list2 = null;
                    if (z) {
                        boolean z2 = (A0I4 & SignedBytes.MAX_POWER_OF_TWO) != 0;
                        if (A03[5].length() != 21) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[6] = "Fx9tcNCtSciYr";
                        strArr[4] = "fWuzF8xs7o61BMX22RC";
                        list2 = AnonymousClass46.A04(z2);
                    }
                    list.add(new C16812p().A11(A022).A10(A0W).A0Z(i).A12(list2).A14());
                }
            }
            c17374v.A0f(A09);
        }
        return list;
    }

    public static void A04() {
        A02 = new byte[]{-30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -28, -26, -30, -82, -73, -79, -71, -40, -25, -25, -29, -32, -38, -40, -21, -32, -26, -27, -90, -38, -36, -40, -92, -82, -89, -81, Ascii.FF, Ascii.ESC, Ascii.ESC, Ascii.ETB, Ascii.DC4, Ascii.SO, Ascii.FF, Ascii.US, Ascii.DC4, Ascii.SUB, Ascii.EM, -38, 33, Ascii.EM, Ascii.SI, -39, Ascii.SI, 33, Ascii.CR, -39, Ascii.FF, Ascii.DC4, Ascii.US, -61, -46, -46, -50, -53, -59, -61, -42, -53, -47, -48, -111, -38, -113, -43, -59, -42, -57, -107, -105};
    }

    static {
        A04();
    }

    public C3202lP() {
        this(0);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C3202lP(int i) {
        this(i, MetaExoPlayerCustomizedCollections.A03(new C3490qI[0]));
    }

    public C3202lP(int i, List<C3490qI> list) {
        this.A00 = i;
        this.A01 = list;
    }

    private L9 A00(LD ld) {
        return new L9(A03(ld));
    }

    private LJ A01(LD ld) {
        return new LJ(A03(ld));
    }

    private boolean A05(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.instagram.common.viewpoint.core.LE
    public final SparseArray<LH> A5Q() {
        return new SparseArray<>();
    }

    @Override // com.instagram.common.viewpoint.core.LE
    public final LH A5V(int i, LD ld) {
        switch (i) {
            case 2:
            case 128:
                return new C3191lE(new C3199lM(A01(ld)));
            case 3:
            case 4:
                return new C3191lE(new C3193lG(ld.A01));
            case 15:
                if (A05(2)) {
                    return null;
                }
                return new C3191lE(new C3203lQ(false, ld.A01));
            case 16:
                return new C3191lE(new C3198lL(A01(ld)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new C3191lE(new C3194lH(ld.A01));
            case 21:
                return new C3191lE(new C3195lI());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new C3191lE(new C3197lK(A00(ld), A05(1), A05(8)));
            case 36:
                return new C3191lE(new C3196lJ(A00(ld)));
            case 89:
                return new C3191lE(new C3200lN(ld.A02));
            case 129:
            case 135:
                return new C3191lE(new C3209lW(ld.A01));
            case 130:
                if (!A05(64)) {
                    return null;
                }
                break;
            case 134:
                if (A05(16)) {
                    return null;
                }
                return new C3186l9(new C3192lF(A02(61, 20, 26)));
            case 138:
                break;
            case 172:
                return new C3191lE(new C3206lT(ld.A01));
            case 257:
                return new C3186l9(new C3192lF(A02(38, 23, 99)));
            default:
                return null;
        }
        return new C3191lE(new C3201lO(ld.A01));
    }
}
