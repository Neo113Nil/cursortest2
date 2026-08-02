package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class QA implements Runnable {
    public final /* synthetic */ C02006g A00;

    public QA(C02006g c02006g) {
        this.A00 = c02006g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.A05 != null) {
            this.A00.A05.A0I();
        }
        this.A00.A0K = false;
    }
}
