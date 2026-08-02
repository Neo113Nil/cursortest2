package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.jU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1514jU implements InterfaceC0550Kj {
    public static byte[] A08;
    public static String[] A09 = {"mF6wsmKEoSH0oaFjYCs54xiQsDf", "7fvgeHK83IOxRTsxSXxl4b3GDJCkJYIR", "3AWdxUjQjYm4RALX7ZxT6TNspaUhotFB", "ejd6qsjsHb99jkL857XJ5GpzVF9O4Dmm", "HjmRuX1Dl2gTeBJaQInX56gY9CThxDdt", "4dP72HMzoJKZI0lPLVreHOZSlD0czmst", "VabPsN9EmqWHNd02VeXfGkhVpY5qzzPo", "1TiSMCKkeVz3FItUT5PAcFJ22kgDAGxf"};
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final C1830or A04;
    public final GY A05;
    public final H1 A06;
    public final C0552Kl A07;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-68, -95, -24, -16, -11, -69, -95, -34, 17, 9, -2, -4, Ascii.CR, -2, -3, -71, -5, 5, 8, -4, 4, -71, Ascii.FF, 2, 19, -2, -45, -71};
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        r6 = r15.A07.A02;
        r3 = r15.A00 / r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r3 <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        r7 = r15.A02 + com.instagram.common.viewpoint.core.AbstractC01424a.A0U(r15.A01, 1000000, r15.A07.A04);
        r10 = r3 * r6;
        r11 = r15.A00 - r10;
        r15.A06.AIA(r7, 1, r10, r11, null);
        r15.A01 += r3;
        r15.A00 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r0 > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0550Kj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AI9(InterfaceC1619lN interfaceC1619lN, long j) throws IOException {
        long j2 = j;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(28) != strArr[5].charAt(28)) {
                throw new RuntimeException();
            }
            A09[7] = "xyHijgDe1t0LZE27YhGAb5keyZPdsLp6";
            if (j2 <= 0 || this.A00 >= this.A03) {
                break;
            }
            int AI5 = this.A06.AI5(interfaceC1619lN, (int) Math.min(this.A03 - this.A00, j2), true);
            if (AI5 == -1) {
                j2 = 0;
            } else {
                this.A00 += AI5;
                j2 -= AI5;
            }
        }
    }

    static {
        A01();
    }

    public C1514jU(GY gy, H1 h1, C0552Kl c0552Kl, String str, int i) throws C00982i {
        this.A05 = gy;
        this.A06 = h1;
        this.A07 = c0552Kl;
        int i2 = (c0552Kl.A05 * c0552Kl.A01) / 8;
        int bytesPerFrame = c0552Kl.A02;
        if (bytesPerFrame == i2) {
            int bytesPerFrame2 = c0552Kl.A04;
            int constantBitrate = bytesPerFrame2 * i2 * 8;
            int bytesPerFrame3 = c0552Kl.A04;
            this.A03 = Math.max(i2, (bytesPerFrame3 * i2) / 10);
            C2D A0j = new C2D().A11(str).A0a(constantBitrate).A0j(constantBitrate);
            int bytesPerFrame4 = this.A03;
            C2D A0h = A0j.A0h(bytesPerFrame4);
            int bytesPerFrame5 = c0552Kl.A05;
            C2D A0b = A0h.A0b(bytesPerFrame5);
            int bytesPerFrame6 = c0552Kl.A04;
            this.A04 = A0b.A0m(bytesPerFrame6).A0i(i).A14();
            return;
        }
        StringBuilder append = new StringBuilder().append(A00(7, 21, 72)).append(i2).append(A00(0, 7, 48));
        int bytesPerFrame7 = c0552Kl.A02;
        throw C00982i.A01(append.append(bytesPerFrame7).toString(), null);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0550Kj
    public final void AA0(int i, long j) {
        this.A05.AIN(new C1512jS(this.A07, 1, i, j));
        this.A06.A6W(this.A04);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0550Kj
    public final void AI0(long j) {
        this.A02 = j;
        this.A00 = 0;
        this.A01 = 0L;
    }
}
