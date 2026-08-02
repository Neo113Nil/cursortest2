package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q11 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6308j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ r11 f6309k;

    public /* synthetic */ q11(r11 r11Var, int i) {
        this.f6308j = i;
        this.f6309k = r11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6308j;
        int i2 = 0;
        r11 r11Var = this.f6309k;
        switch (i) {
            case 0:
                if (!r11Var.f6662f) {
                    r11Var.f6663g = null;
                } else {
                    long jM3509a = r11Var.f6661e - r11Var.f6660d.m3509a();
                    if (jM3509a <= 0) {
                        r11Var.f6662f = false;
                        r11Var.f6663g = null;
                        r11Var.f6659c.run();
                    } else {
                        r11Var.f6663g = r11Var.f6657a.schedule(new q11(r11Var, 1), jM3509a, TimeUnit.NANOSECONDS);
                    }
                }
                break;
            default:
                r11Var.f6658b.execute(new q11(r11Var, i2));
                break;
        }
    }
}
