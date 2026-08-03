package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.mj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1978mj implements com.facebook.ads.redexgen.core.H1 {
    public static java.lang.String[] A03 = {"Qzrb2NyX11iip4M0Dun9HjrVhDBjGiaF", "S4lxERGEQHczdoRlIRLlXReEKfWFWSGc", "txU8e6wljbe290bqTydjfEMDFUDvEmx5", "ZB68ibpDVF3DEFIIdRwQIG37zRUG2jhG", "NKfzuQ6LKFKezVni40AKhLW9Qs", "gUOm4cnsv29C5J2bDVOWEpGrIAhYUn7e", "xRx4EoAOCCZ90h8tA3pJ1YmFxzetviZR", "6LlO7okteSZZNTbDPWq3J1SHLhykMwkf"};
    public final int A00;
    public final com.facebook.ads.redexgen.core.HE A01;
    public final com.facebook.ads.redexgen.core.HJ A02;

    @Override // com.facebook.ads.redexgen.core.H1
    public final /* synthetic */ void AFs() {
    }

    public C1978mj(com.facebook.ads.redexgen.core.HJ hj, int i) {
        this.A02 = hj;
        this.A00 = i;
        this.A01 = new com.facebook.ads.redexgen.core.HE();
    }

    private long A00(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        while (interfaceC1987ms.A8i() < interfaceC1987ms.A8O() - 6 && !com.facebook.ads.redexgen.core.HF.A09(interfaceC1987ms, this.A02, this.A00, this.A01)) {
            java.lang.String[] strArr = A03;
            if (strArr[1].charAt(7) == strArr[7].charAt(7)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[6] = "MdA2mB0qiCN7NKRKcBY3aVGEnEzRIKP4";
            strArr2[3] = "Kp5wPJFyOGMB7tBJUi3Fl7WX9iQtExSk";
            interfaceC1987ms.A47(1);
        }
        if (interfaceC1987ms.A8i() >= interfaceC1987ms.A8O() - 6) {
            interfaceC1987ms.A47((int) (interfaceC1987ms.A8O() - interfaceC1987ms.A8i()));
            return this.A02.A09;
        }
        return this.A01.A00;
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final com.facebook.ads.redexgen.core.C0739Gz AIw(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, long j) throws java.io.IOException {
        long rightFrameFirstSampleNumber = interfaceC1987ms.A8n();
        long leftFrameFirstSampleNumber = A00(interfaceC1987ms);
        long A8i = interfaceC1987ms.A8i();
        interfaceC1987ms.A47(java.lang.Math.max(6, this.A02.A06));
        long searchPosition = A00(interfaceC1987ms);
        long leftFramePosition = interfaceC1987ms.A8i();
        if (leftFrameFirstSampleNumber <= j && searchPosition > j) {
            return com.facebook.ads.redexgen.core.C0739Gz.A03(A8i);
        }
        if (searchPosition <= j) {
            return com.facebook.ads.redexgen.core.C0739Gz.A05(searchPosition, leftFramePosition);
        }
        return com.facebook.ads.redexgen.core.C0739Gz.A04(leftFrameFirstSampleNumber, rightFrameFirstSampleNumber);
    }
}
