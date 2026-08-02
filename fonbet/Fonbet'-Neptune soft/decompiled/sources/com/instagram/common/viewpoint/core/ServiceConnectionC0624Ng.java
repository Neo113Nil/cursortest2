package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;

/* renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ServiceConnectionC0624Ng implements ServiceConnection {
    public static String[] A01 = {"5NfIE0YcA1j7k4kI09Qd", "GOyJyQVDSAttzLj2dwW1R", "UEE9UjADaku6tgIVG7TE", "AlbuaripePsmIRlIONJuvTINhX", "hDpBwlS77lkTDgpWlwn57aFtHcNJW0B1", "G5FnfniCDoZltv23hjG8RcIHEgm214hW", "K1Tu", "8SU16w9FmjIzUCDhhEyMBCCw6KqJKOI3"};
    public final /* synthetic */ HandlerC0625Nh A00;

    public ServiceConnectionC0624Ng(HandlerC0625Nh handlerC0625Nh) {
        this.A00 = handlerC0625Nh;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1153dL c1153dL;
        Handler handler;
        AbstractRunnableC0840Vt abstractRunnableC0840Vt;
        AbstractC1387hD abstractC1387hD;
        C1153dL c1153dL2;
        c1153dL = this.A00.A07;
        c1153dL.A0F().AHN();
        handler = this.A00.A04;
        abstractRunnableC0840Vt = this.A00.A09;
        handler.removeCallbacks(abstractRunnableC0840Vt);
        if (iBinder != null) {
            this.A00.A00 = new Messenger(iBinder);
            if (this.A00.A02) {
                this.A00.A02 = false;
                abstractC1387hD = this.A00.A06;
                abstractC1387hD.A06();
                return;
            }
            return;
        }
        c1153dL2 = this.A00.A07;
        c1153dL2.A0F().AHP();
        HandlerC0625Nh handlerC0625Nh = this.A00;
        if (A01[3].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "klTZBPtNd5GFvPmgAP3f";
        strArr[2] = "mBOUVEJ7kKkpCLxr10ij";
        handlerC0625Nh.A06();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1153dL c1153dL;
        c1153dL = this.A00.A07;
        c1153dL.A0F().AHO();
        if (!this.A00.A01) {
            return;
        }
        this.A00.A06();
    }
}
