package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class OK implements android.content.ServiceConnection {
    public static java.lang.String[] A01 = {"5NfIE0YcA1j7k4kI09Qd", "GOyJyQVDSAttzLj2dwW1R", "UEE9UjADaku6tgIVG7TE", "AlbuaripePsmIRlIONJuvTINhX", "hDpBwlS77lkTDgpWlwn57aFtHcNJW0B1", "G5FnfniCDoZltv23hjG8RcIHEgm214hW", "K1Tu", "8SU16w9FmjIzUCDhhEyMBCCw6KqJKOI3"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.OL A00;

    public OK(com.facebook.ads.redexgen.core.OL ol) {
        this.A00 = ol;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        android.os.Handler handler;
        com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc abstractRunnableC1123Wc;
        com.facebook.ads.redexgen.core.AbstractC1756ik abstractC1756ik;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        c1636gi = this.A00.A07;
        c1636gi.A0F().AI7();
        handler = this.A00.A04;
        abstractRunnableC1123Wc = this.A00.A09;
        handler.removeCallbacks(abstractRunnableC1123Wc);
        if (iBinder != null) {
            this.A00.A00 = new android.os.Messenger(iBinder);
            if (this.A00.A02) {
                this.A00.A02 = false;
                abstractC1756ik = this.A00.A06;
                abstractC1756ik.A06();
                return;
            }
            return;
        }
        c1636gi2 = this.A00.A07;
        c1636gi2.A0F().AI9();
        com.facebook.ads.redexgen.core.OL ol = this.A00;
        if (A01[3].length() != 26) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[0] = "klTZBPtNd5GFvPmgAP3f";
        strArr[2] = "mBOUVEJ7kKkpCLxr10ij";
        ol.A06();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        c1636gi = this.A00.A07;
        c1636gi.A0F().AI8();
        if (!this.A00.A01) {
            return;
        }
        this.A00.A06();
    }
}
