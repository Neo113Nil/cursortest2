package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1441dX implements java.lang.Runnable {
    public static java.lang.String[] A01 = {"2Fm0K3iCPRr4s", "EU0X6MVFAjFTSb3IQ96JVLxBODK0ji7f", "kCaGUq5JvggeMgMKx8S0y94YuIT5XcC8", "RnkBIHZpUwOry9GZ8kTuD", "sA1zdgzxdT", "CEtS1j3lrrmxulYDjXKY", "vw2xXVPQEGSMd83f0P3isbbUyKAy6xNq", "SkmV6xyVRRhMHUmgX0z0vsybBVz87hUy"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5F A00;

    public RunnableC1441dX(com.facebook.ads.redexgen.core.C5F c5f) {
        this.A00 = c5f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0K;
            if (z) {
                this.A00.A0P();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            if (A01[1].charAt(30) != '7') {
                throw new java.lang.RuntimeException();
            }
            A01[6] = "J2Oqtidk0iYMOENvLyv0dYeMHatuKemd";
        }
    }
}
