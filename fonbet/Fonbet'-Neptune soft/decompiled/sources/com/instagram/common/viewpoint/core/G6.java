package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class G6 implements InterfaceC0849Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC0840Vt A01;
    public final /* synthetic */ G2 A02;
    public final /* synthetic */ C0356Cw A03;

    public G6(G2 g2, int i, C0356Cw c0356Cw, AbstractRunnableC0840Vt abstractRunnableC0840Vt) {
        this.A02 = g2;
        this.A00 = i;
        this.A03 = c0356Cw;
        this.A01 = abstractRunnableC0840Vt;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0849Wc
    public final void ACp() {
        this.A01.run();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0849Wc
    public final void AEn(float f) {
        this.A02.A08.setProgress(100.0f * (1.0f - (f / this.A00)));
        if (this.A03 != null) {
            C0356Cw c0356Cw = this.A03;
            float percentage = this.A00;
            c0356Cw.A07((int) ((percentage - f) * 1000.0f));
        }
    }
}
