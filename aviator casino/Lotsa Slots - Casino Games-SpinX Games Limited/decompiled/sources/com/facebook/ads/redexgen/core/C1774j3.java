package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.j3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1774j3 implements com.facebook.ads.redexgen.core.N9 {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05107k A00;
    public final /* synthetic */ java.lang.Runnable A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{89, 10, com.google.common.base.Ascii.SO, 83, 89, 91, 92, 92, 32, 3, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FF, 7, com.google.common.base.Ascii.DLE, 66, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DLE, 7, 17, 17, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FF, 66, 4, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DLE, 7, 6, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, 49, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SYN, 1, 63, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DC4, 58, com.google.common.base.Ascii.RS, 3, 1, com.google.common.base.Ascii.SYN, 0, 0, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS};
    }

    static {
        A01();
    }

    public C1774j3(com.facebook.ads.redexgen.core.C05107k c05107k, java.lang.Runnable runnable) {
        this.A00 = c05107k;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.N9
    public final void ADC(com.facebook.ads.redexgen.core.InterfaceC1832k8 interfaceC1832k8) {
        com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76;
        anonymousClass76 = this.A00.A02;
        anonymousClass76.A0F().A4a();
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.core.N9
    public final void ADD(com.facebook.ads.redexgen.core.InterfaceC1832k8 interfaceC1832k8, android.view.View view) {
        com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76;
        anonymousClass76 = this.A00.A02;
        anonymousClass76.A0F().A4Z(interfaceC1832k8 == ((com.facebook.ads.redexgen.core.AbstractC1771j0) this.A00).A00);
        if (interfaceC1832k8 != ((com.facebook.ads.redexgen.core.AbstractC1771j0) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        com.facebook.ads.redexgen.core.N1 n1 = ((com.facebook.ads.redexgen.core.AbstractC1771j0) this.A00).A01;
        com.facebook.ads.redexgen.core.C05107k c05107k = this.A00;
        java.lang.String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((com.facebook.ads.redexgen.core.AbstractC1771j0) c05107k).A01 = interfaceC1832k8;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC1832k8);
        } else {
            this.A00.A07.A0E(view);
            this.A00.A0Q(n1);
        }
    }

    @Override // com.facebook.ads.redexgen.core.N9
    public final void ADE(com.facebook.ads.redexgen.core.InterfaceC1832k8 interfaceC1832k8) {
        com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76;
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        anonymousClass76 = this.A00.A02;
        anonymousClass76.A0F().A4c();
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.N9
    public final void AEN(com.facebook.ads.redexgen.core.InterfaceC1832k8 interfaceC1832k8, com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76;
        anonymousClass76 = this.A00.A02;
        anonymousClass76.A0F().A4b(interfaceC1832k8 == ((com.facebook.ads.redexgen.core.AbstractC1771j0) this.A00).A00, c1108Vm.A03().getErrorCode());
        if (interfaceC1832k8 != ((com.facebook.ads.redexgen.core.AbstractC1771j0) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(interfaceC1832k8);
        this.A00.ADp(c1108Vm);
    }
}
