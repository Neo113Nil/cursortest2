package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Pair;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import okio.Utf8;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.jT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1513jT implements GX {
    public static byte[] A07;
    public static String[] A08 = {"DwCwNe", "sWjhkz5Jk0aFlWxF8RAhYepliqmDVBH5", "fJB4aZ6fjAPSNUZta8hrgw0qJ7r8hoM5", "QGFmFhkJVom57VKObFa8uqUV9", "rnOb7nHa90E2wPIfOCxC", "at6D0iA1D4bxl", "SWjjSn0lfORi", "B3tBBFyQt38AAQleoY5s"};
    public static final InterfaceC0439Gb A09;
    public GY A04;
    public H1 A05;
    public InterfaceC0550Kj A06;
    public int A01 = 0;
    public long A03 = -1;
    public int A00 = -1;
    public long A02 = -1;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{87, 91, 2, 39, 50, 39, 102, 35, 62, 37, 35, 35, 34, 53, 102, 47, 40, 54, 51, 50, 102, 42, 35, 40, 33, 50, 46, 124, 102, 39, Ascii.FS, 1, 7, 2, 2, Ascii.GS, 0, 6, Ascii.ETB, Ascii.SYN, 82, 37, 51, 36, 82, Ascii.DC4, Ascii.GS, 0, Ascii.US, 19, 6, 82, 6, Ascii.VT, 2, Ascii.ETB, 72, 82, Byte.MAX_VALUE, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 10, 69, 88, 10, 95, 68, 88, 79, 73, 69, 77, 68, 67, 80, 79, 78, 10, 93, 75, 92, 10, 76, 67, 70, 79, 10, 94, 83, 90, 79, 4, 103, 81, 70, 117, 72, 68, 66, 81, 83, 68, 95, 66, 17, 5, Ascii.DC4, Ascii.EM, Ascii.US, 95, Ascii.ETB, 71, 65, 65, 93, 17, Ascii.FS, 17, 7, Byte.MAX_VALUE, 107, 122, 119, 113, 49, 121, 41, 47, 47, 51, 115, 114, Byte.MAX_VALUE, 105, 55, 35, 50, Utf8.REPLACEMENT_BYTE, 57, 121, 36, 55, 33};
    }

    static {
        A03();
        A09 = new InterfaceC0439Gb() { // from class: com.facebook.ads.redexgen.X.jW
            @Override // com.instagram.common.viewpoint.core.InterfaceC0439Gb
            public final GX[] A5F() {
                return C1513jT.A08();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC0439Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC0438Ga.A01(this, uri, map);
            }
        };
    }

    private int A00(InterfaceC1619lN interfaceC1619lN) throws IOException {
        C3M.A08(this.A02 != -1);
        return ((InterfaceC0550Kj) C3M.A01(this.A06)).AI9(interfaceC1619lN, this.A02 - interfaceC1619lN.A8f()) ? -1 : 0;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void A02() {
        C3M.A02(this.A05);
    }

    private void A04(InterfaceC1619lN interfaceC1619lN) throws IOException {
        C3M.A08(interfaceC1619lN.A8f() == 0);
        int i = this.A00;
        if (A08[5].length() != 13) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[7] = "oJOrgM3DzNUfWcxP3ghI";
        strArr[4] = "cZhhMb4kvP2y4vGeSU9A";
        if (i != -1) {
            interfaceC1619lN.AJJ(this.A00);
            this.A01 = 4;
        } else {
            if (AbstractC0554Kn.A06(interfaceC1619lN)) {
                interfaceC1619lN.AJJ((int) (interfaceC1619lN.A8a() - interfaceC1619lN.A8f()));
                this.A01 = 1;
                return;
            }
            throw C00982i.A01(A01(58, 42, 8), null);
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    private void A05(InterfaceC1619lN interfaceC1619lN) throws IOException {
        C0552Kl wavFormat = AbstractC0554Kn.A02(interfaceC1619lN);
        if (wavFormat.A03 == 17) {
            this.A06 = new C1515jV(this.A04, this.A05, wavFormat);
        } else if (wavFormat.A03 == 6) {
            this.A06 = new C1514jU(this.A04, this.A05, wavFormat, A01(112, 15, 82), -1);
        } else if (wavFormat.A03 == 7) {
            this.A06 = new C1514jU(this.A04, this.A05, wavFormat, A01(127, 15, 60), -1);
        } else {
            int A00 = H9.A00(wavFormat.A03, wavFormat.A01);
            if (A00 != 0) {
                this.A06 = new C1514jU(this.A04, this.A05, wavFormat, A01(Opcodes.D2I, 9, 116), A00);
            } else {
                throw C00982i.A00(A01(29, 29, 80) + wavFormat.A03);
            }
        }
        this.A01 = 3;
    }

    private void A06(InterfaceC1619lN interfaceC1619lN) throws IOException {
        this.A03 = AbstractC0554Kn.A00(interfaceC1619lN);
        this.A01 = 2;
    }

    private void A07(InterfaceC1619lN interfaceC1619lN) throws IOException {
        Pair<Long, Long> A01 = AbstractC0554Kn.A01(interfaceC1619lN);
        this.A00 = ((Long) A01.first).intValue();
        long longValue = ((Long) A01.second).longValue();
        if (this.A03 != -1) {
            String[] strArr = A08;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "zD8CpsX01ISLh3RSws8RgUnhS";
            strArr2[6] = "h3zG6U6JIHw0";
            if (longValue == 4294967295L) {
                longValue = this.A03;
            }
        }
        this.A02 = this.A00 + longValue;
        long A8G = interfaceC1619lN.A8G();
        if (A8G != -1 && this.A02 > A8G) {
            AnonymousClass44.A07(A01(100, 12, 18), A01(2, 27, 100) + this.A02 + A01(0, 2, 89) + A8G);
            this.A02 = A8G;
        }
        ((InterfaceC0550Kj) C3M.A01(this.A06)).AA0(this.A00, this.A02);
        this.A01 = 4;
    }

    public static /* synthetic */ GX[] A08() {
        return new GX[]{new C1513jT()};
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AA4(GY gy) {
        this.A04 = gy;
        this.A05 = gy.AJh(0, 1);
        gy.A6G();
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final int AGb(InterfaceC1619lN interfaceC1619lN, C0457Gt c0457Gt) throws IOException {
        A02();
        switch (this.A01) {
            case 0:
                A04(interfaceC1619lN);
                return 0;
            case 1:
                A06(interfaceC1619lN);
                if (A08[5].length() != 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[3] = "VLLh2GyvdfrrOjqYmUQdrqO3c";
                strArr[6] = "Miu4m4vLnYY2";
                return 0;
            case 2:
                A05(interfaceC1619lN);
                return 0;
            case 3:
                A07(interfaceC1619lN);
                return 0;
            case 4:
                return A00(interfaceC1619lN);
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AGr() {
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AIM(long j, long j2) {
        this.A01 = j == 0 ? 0 : 4;
        if (this.A06 != null) {
            this.A06.AI0(j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final boolean AJL(InterfaceC1619lN interfaceC1619lN) throws IOException {
        return AbstractC0554Kn.A06(interfaceC1619lN);
    }
}
