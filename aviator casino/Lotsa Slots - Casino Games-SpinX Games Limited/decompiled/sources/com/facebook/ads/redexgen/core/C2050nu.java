package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2050nu implements com.facebook.ads.redexgen.core.DD {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"3Cx8VuBaAtU", "mtIvitx", "ijtxGWvqwx8wBPOmSGXshyr4piVUOT73", "1A2eWfmauMvQ3z4CiBElgktZxGJ5t0Vj", "NuAYfoZUoES6MxZb2vdyJB2K3PVOnnYD", "gczB0K5G5", "TBGYu08V4AAoblIa0rbrS9oc16PYokVw", "JGtQJ9cae1Y"};
    public com.facebook.ads.redexgen.core.H9 A00;
    public com.facebook.ads.redexgen.core.InterfaceC1987ms A01;
    public final com.facebook.ads.redexgen.core.HD A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{80, 89, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.GS, 89, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.GS, 89, com.google.common.base.Ascii.CR, 17, com.google.common.base.Ascii.FS, 89, 10, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, 87, 2, 35, 34, 41, 108, 35, 42, 108, 56, 36, 41, 108, 45, 58, 45, 37, 32, 45, 46, 32, 41, 108, 41, 52, 56, 62, 45, 47, 56, 35, 62, 63, 108, 100};
    }

    static {
        A01();
    }

    public C2050nu(com.facebook.ads.redexgen.core.HD hd) {
        this.A02 = hd;
    }

    @Override // com.facebook.ads.redexgen.core.DD
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("No op, we don't include mp3 extractor due to apk size")
    public final void A5y() {
    }

    @Override // com.facebook.ads.redexgen.core.DD
    public final long A7a() {
        if (this.A01 != null) {
            return this.A01.A8n();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        if (r9.A8n() != r19) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0066, code lost:
    
        if (r9.A8n() != r19) goto L29;
     */
    @Override // com.facebook.ads.redexgen.core.DD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AAB(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(" To be replaced with DataReader after upstream is updated") com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j, long j2, com.facebook.ads.redexgen.core.HA ha) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C05519f c05519f = new com.facebook.ads.redexgen.core.C05519f(interfaceC2132pF, j, j2);
        this.A01 = c05519f;
        if (this.A00 != null) {
            return;
        }
        com.facebook.ads.redexgen.core.H9[] extractors = this.A02.A5O(uri, map);
        if (extractors.length == 1) {
            this.A00 = extractors[0];
        } else {
            int length = extractors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                com.facebook.ads.redexgen.core.H9 h9 = extractors[i];
                try {
                } catch (java.io.EOFException unused) {
                    if (this.A00 == null) {
                    }
                } catch (java.lang.Throwable th) {
                    com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A00 != null || c05519f.A8n() == j);
                    c05519f.AIl();
                    throw th;
                }
                if (h9.AK5(c05519f)) {
                    this.A00 = h9;
                    com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A00 != null || c05519f.A8n() == j);
                    c05519f.AIl();
                } else {
                    if (this.A00 == null) {
                    }
                    boolean z = true;
                    com.facebook.ads.redexgen.core.AbstractC04203y.A08(z);
                    c05519f.AIl();
                    i++;
                }
            }
            if (this.A00 == null) {
                throw new com.facebook.ads.redexgen.core.C2025nV(A00(24, 34, 2) + com.facebook.ads.redexgen.core.C5C.A0s(extractors) + A00(0, 24, 55), (android.net.Uri) com.facebook.ads.redexgen.core.AbstractC04203y.A01(uri));
            }
        }
        com.facebook.ads.redexgen.core.H9 h92 = this.A00;
        java.lang.String[] strArr = A04;
        if (strArr[7].length() != strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[4] = "617axDRVtVCpohDeNzS2wwDVGnqnMQm6";
        strArr2[3] = "irS2jSLrtgJgNTyuX8VyAPoURNJ9oGo8";
        h92.AAC(ha);
    }

    @Override // com.facebook.ads.redexgen.core.DD
    public final int AHM(com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        return ((com.facebook.ads.redexgen.core.H9) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00)).AHL((com.facebook.ads.redexgen.core.InterfaceC1987ms) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01), hv);
    }

    @Override // com.facebook.ads.redexgen.core.DD
    public final void AHb() {
        if (this.A00 != null) {
            this.A00.AHb();
            this.A00 = null;
        }
        this.A01 = null;
    }

    @Override // com.facebook.ads.redexgen.core.DD
    public final void AJ6(long j, long j2) {
        ((com.facebook.ads.redexgen.core.H9) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00)).AJ6(j, j2);
    }
}
