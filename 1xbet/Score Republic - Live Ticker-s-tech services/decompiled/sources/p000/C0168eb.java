package p000;

/* JADX INFO: renamed from: eb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0168eb extends AbstractC0659rl {

    /* JADX INFO: renamed from: q */
    public int f2048q;

    /* JADX INFO: renamed from: r */
    public int f2049r;

    /* JADX INFO: renamed from: s */
    public C0205fb f2050s;

    public boolean getAllowsGoneWidget() {
        return this.f2050s.f2369s0;
    }

    public int getMargin() {
        return this.f2050s.f2370t0;
    }

    public int getType() {
        return this.f2048q;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2050s.f2369s0 = z;
    }

    public void setDpMargin(int i) {
        this.f2050s.f2370t0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f2050s.f2370t0 = i;
    }

    public void setType(int i) {
        this.f2048q = i;
    }
}
