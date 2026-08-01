package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
/* loaded from: assets/audience_network/classes2.dex */
public abstract class HH {
    public static byte[] A00;
    public static String[] A01 = {"jaTfwC0cI533jMSLFdbnMioREeamNCq8", "oxYS1uYBjADPdRUL4vsR12VppXrr4BxP", "o9bG5hJtiKIeIPN2CaXw8mH6vllsT8Pg", "8s8MZLb5TSIkvuwEDH", "W6kvFYauQlSyWCDb8CQhWvVbWb1Alqwq", "aw37R0CiGakhFrBRrvipxmkRXRxeCTzI", "Y2zfIeYjiYIsjSkQMxD0jwTDeetOAull", "DaiobFePrAznnRWN86LDTmrCW9O2HPvR"};

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{5, 34, 42, 47, 38, 39, 99, 55, 44, 99, 49, 38, 34, 39, 99, 5, Ascii.SI, 2, 0, 99, 48, 55, 49, 38, 34, 46, 99, 46, 34, 49, 40, 38, 49, 109, 125, 82, 73, 72, 79, Ascii.ESC, 93, 73, 90, 86, 94, Ascii.ESC, 95, 84, 94, 72, Ascii.ESC, 85, 84, 79, Ascii.ESC, 72, 79, 90, 73, 79, Ascii.ESC, 76, 82, 79, 83, Ascii.ESC, 72, 66, 85, 88, Ascii.ESC, 88, 84, 95, 94, Ascii.NAK};
    }

    static {
        A08();
    }

    public static int A00(InterfaceC3281ms interfaceC3281ms) throws IOException {
        interfaceC3281ms.AIl();
        C17374v c17374v = new C17374v(2);
        interfaceC3281ms.AGt(c17374v.A0l(), 0, 2);
        int syncCode = c17374v.A0M();
        int frameStartMarker = syncCode >> 2;
        if (frameStartMarker == 16382) {
            interfaceC3281ms.AIl();
            return syncCode;
        }
        interfaceC3281ms.AIl();
        throw C3K.A01(A06(34, 42, 75), null);
    }

    public static Metadata A01(InterfaceC3281ms interfaceC3281ms, boolean z) throws IOException {
        IE id3FramePredicate;
        if (z) {
            id3FramePredicate = null;
        } else {
            id3FramePredicate = C9U.A03;
        }
        Metadata A002 = new HM().A00(interfaceC3281ms, id3FramePredicate);
        if (A002 == null || A002.A02() == 0) {
            return null;
        }
        return A002;
    }

    public static Metadata A02(InterfaceC3281ms interfaceC3281ms, boolean z) throws IOException {
        interfaceC3281ms.AIl();
        long A8i = interfaceC3281ms.A8i();
        Metadata A012 = A01(interfaceC3281ms, z);
        interfaceC3281ms.AK3((int) (interfaceC3281ms.A8i() - A8i));
        return A012;
    }

    public static HI A03(C17374v c17374v) {
        c17374v.A0g(1);
        int A0K = c17374v.A0K();
        int length = c17374v.A09();
        long j = length + A0K;
        int i = A0K / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long A0P = c17374v.A0P();
            if (A0P == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = A0P;
            jArr2[i2] = c17374v.A0P();
            c17374v.A0g(2);
            i2++;
        }
        int length2 = c17374v.A09();
        c17374v.A0g((int) (j - length2));
        return new HI(jArr, jArr2);
    }

    public static HI A04(InterfaceC3281ms interfaceC3281ms, int i) throws IOException {
        C17374v c17374v = new C17374v(i);
        interfaceC3281ms.readFully(c17374v.A0l(), 0, i);
        return A03(c17374v);
    }

    public static HJ A05(InterfaceC3281ms interfaceC3281ms) throws IOException {
        byte[] bArr = new byte[38];
        interfaceC3281ms.readFully(bArr, 0, 38);
        return new HJ(bArr, 4);
    }

    public static List<String> A07(InterfaceC3281ms interfaceC3281ms, int i) throws IOException {
        C17374v c17374v = new C17374v(i);
        interfaceC3281ms.readFully(c17374v.A0l(), 0, i);
        c17374v.A0g(4);
        return Arrays.asList(AbstractC2044Hk.A05(c17374v, false, false).A02);
    }

    public static void A09(InterfaceC3281ms interfaceC3281ms) throws IOException {
        C17374v c17374v = new C17374v(4);
        interfaceC3281ms.readFully(c17374v.A0l(), 0, 4);
        if (c17374v.A0Q() == 1716281667) {
        } else {
            throw C3K.A01(A06(0, 34, 51), null);
        }
    }

    public static boolean A0A(InterfaceC3281ms interfaceC3281ms) throws IOException {
        C17374v c17374v = new C17374v(4);
        interfaceC3281ms.AGt(c17374v.A0l(), 0, 4);
        return c17374v.A0Q() == 1716281667;
    }

    public static boolean A0B(InterfaceC3281ms interfaceC3281ms, HG hg) throws IOException {
        interfaceC3281ms.AIl();
        C17364u c17364u = new C17364u(new byte[4]);
        interfaceC3281ms.AGt(c17364u.A00, 0, 4);
        boolean A0H = c17364u.A0H();
        int A04 = c17364u.A04(7);
        int A042 = c17364u.A04(24) + 4;
        if (A04 == 0) {
            HJ A05 = A05(interfaceC3281ms);
            String[] strArr = A01;
            if (strArr[1].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "oF2KQg39ZEK5V6OHUZM6u4PkuH0D3J87";
            strArr2[2] = "opWNo3Pnwj2PHBTvqD8r5OWylRW508kK";
            hg.A00 = A05;
        } else {
            HJ hj = hg.A00;
            if (hj != null) {
                if (A04 != 3) {
                    if (A04 == 4) {
                        hg.A00 = hj.A0B(A07(interfaceC3281ms, A042));
                    } else if (A04 == 6) {
                        C17374v c17374v = new C17374v(A042);
                        interfaceC3281ms.readFully(c17374v.A0l(), 0, A042);
                        c17374v.A0g(4);
                        PictureFrame pictureFrame = PictureFrame.A00(c17374v);
                        hg.A00 = hj.A0A(MetaExoPlayerCustomizedCollections.A03(pictureFrame));
                    } else {
                        interfaceC3281ms.AK3(A042);
                    }
                } else {
                    hg.A00 = hj.A09(A04(interfaceC3281ms, A042));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return A0H;
    }
}
