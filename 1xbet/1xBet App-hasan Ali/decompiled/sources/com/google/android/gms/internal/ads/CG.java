package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class CG implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7986k;

    /* renamed from: l, reason: collision with root package name */
    public final HG f7987l;

    public /* synthetic */ CG(HG hg, int i) {
        this.f7986k = i;
        this.f7987l = hg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7986k) {
            case 0:
                this.f7987l.f9371P = true;
                break;
            case 1:
                this.f7987l.t();
                break;
            case 2:
                HG hg = this.f7987l;
                if (!hg.f9377V) {
                    InterfaceC1513rG interfaceC1513rG = hg.f9393y;
                    interfaceC1513rG.getClass();
                    interfaceC1513rG.h(hg);
                    break;
                }
                break;
            default:
                HG hg2 = this.f7987l;
                for (MG mg : hg2.f9358A) {
                    mg.p(true);
                    if (mg.f10611A != null) {
                        mg.f10611A = null;
                        mg.f = null;
                    }
                }
                Fx fx = hg2.f9388t;
                if (((F) fx.f9143k) != null) {
                    fx.f9143k = null;
                }
                fx.f9144l = null;
                break;
        }
    }
}
