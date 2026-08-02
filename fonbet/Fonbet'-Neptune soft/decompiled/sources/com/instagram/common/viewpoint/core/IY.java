package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;

/* loaded from: assets/audience_network.dex */
public final class IY {
    public static String[] A0C = {"uuzqWXLhVU5h", "MCiAyNDofRMgV8twnC7AiCrYM6kNh0jg", "HJXujHHcElJRTDtcfeo3Sy7Hv18RGZgy", "Amjr7hMXQx0e32VF8yWASHBDx37PervK", "NgKcffCH0RNam7yPBBIvJezNpINfNkiL", "oMs9elp", "apSAFH841DSL3paVepKSIoWcAWyBkdVZ", "h51QMR"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public IP A04;
    public C0504Ip A05;
    public boolean A06;
    public final H1 A08;
    public final C0503Io A09 = new C0503Io();
    public final C4J A07 = new C4J();
    public final C4J A0B = new C4J(1);
    public final C4J A0A = new C4J();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final int A04(int i, int i2) {
        C4J c4j;
        int length;
        C0502In A07 = A07();
        if (A07 == null) {
            return 0;
        }
        if (A07.A00 != 0) {
            c4j = this.A09.A0H;
            length = A07.A00;
        } else {
            byte[] bArr = (byte[]) AbstractC01424a.A0f(A07.A04);
            this.A0A.A0j(bArr, bArr.length);
            c4j = this.A0A;
            length = bArr.length;
        }
        boolean A06 = this.A09.A06(this.A01);
        boolean z = A06 || i2 != 0;
        this.A0B.A0l()[0] = (byte) ((z ? 128 : 0) | length);
        this.A0B.A0f(0);
        this.A08.AI8(this.A0B, 1, 1);
        this.A08.AI8(c4j, length, 1);
        if (!z) {
            return length + 1;
        }
        if (!A06) {
            this.A07.A0d(8);
            byte[] A0l = this.A07.A0l();
            A0l[0] = 0;
            A0l[1] = 1;
            A0l[2] = (byte) ((i2 >> 8) & 255);
            A0l[3] = (byte) (i2 & 255);
            A0l[4] = (byte) ((i >> 24) & 255);
            A0l[5] = (byte) ((i >> 16) & 255);
            A0l[6] = (byte) ((i >> 8) & 255);
            A0l[7] = (byte) (i & 255);
            this.A08.AI8(this.A07, 8, 1);
            return length + 1 + 8;
        }
        C4J c4j2 = this.A09.A0H;
        int A0M = c4j2.A0M();
        c4j2.A0g(-2);
        int i3 = (A0M * 6) + 2;
        if (i2 != 0) {
            this.A07.A0d(i3);
            byte[] A0l2 = this.A07.A0l();
            c4j2.A0k(A0l2, 0, i3);
            int i4 = (((A0l2[2] & 255) << 8) | (A0l2[3] & 255)) + i2;
            A0l2[2] = (byte) ((i4 >> 8) & 255);
            A0l2[3] = (byte) (i4 & 255);
            c4j2 = this.A07;
        }
        this.A08.AI8(c4j2, i3, 1);
        return length + 1 + i3;
    }

    public IY(H1 h1, C0504Ip c0504Ip, IP ip) {
        this.A08 = h1;
        this.A05 = c0504Ip;
        this.A04 = ip;
        A0C(c0504Ip, ip);
    }

    public final int A02() {
        int i;
        if (!this.A06) {
            i = this.A05.A04[this.A01];
        } else {
            boolean[] zArr = this.A09.A0G;
            int flags = this.A01;
            i = zArr[flags] ? 1 : 0;
        }
        if (A07() == null) {
            return i;
        }
        String[] strArr = A0C;
        String str = strArr[3];
        String str2 = strArr[2];
        int charAt = str.charAt(20);
        int flags2 = str2.charAt(20);
        if (charAt != flags2) {
            throw new RuntimeException();
        }
        A0C[4] = "Hkeae3ogmEOju43arfP4ZrrsYFDfrpvf";
        return i | 1073741824;
    }

    public final int A03() {
        if (!this.A06) {
            return this.A05.A05[this.A01];
        }
        return this.A09.A0B[this.A01];
    }

    public final long A05() {
        if (!this.A06) {
            return this.A05.A06[this.A01];
        }
        return this.A09.A0E[this.A02];
    }

    public final long A06() {
        if (!this.A06) {
            return this.A05.A07[this.A01];
        }
        return this.A09.A00(this.A01);
    }

    public final C0502In A07() {
        C0502In A00;
        if (!this.A06) {
            return null;
        }
        int i = ((IP) AbstractC01424a.A0f(this.A09.A06)).A02;
        if (this.A09.A07 != null) {
            A00 = this.A09.A07;
        } else {
            A00 = this.A05.A03.A00(i);
        }
        if (A00 == null || !A00.A03) {
            return null;
        }
        C0502In encryptionBox = A00;
        return encryptionBox;
    }

    public final void A08() {
        this.A09.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A06 = false;
    }

    public final void A09() {
        C0502In A07 = A07();
        if (A07 == null) {
            return;
        }
        C4J c4j = this.A09.A0H;
        if (A07.A00 != 0) {
            c4j.A0g(A07.A00);
        }
        if (this.A09.A06(this.A01)) {
            c4j.A0g(c4j.A0M() * 6);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0A(long j) {
        for (int i = this.A01; i < searchIndex && this.A09.A00(i) <= j; i++) {
            if (this.A09.A0G[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A0B(DrmInitData drmInitData) {
        C0502In encryptionBox = this.A05.A03.A00(((IP) AbstractC01424a.A0f(this.A09.A06)).A02);
        this.A08.A6W(this.A05.A03.A07.A07().A0u(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)).A14());
    }

    public final void A0C(C0504Ip c0504Ip, IP ip) {
        this.A05 = c0504Ip;
        this.A04 = ip;
        this.A08.A6W(c0504Ip.A03.A07);
        A08();
    }

    public final boolean A0D() {
        this.A01++;
        if (!this.A06) {
            return false;
        }
        this.A00++;
        if (this.A00 != this.A09.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
