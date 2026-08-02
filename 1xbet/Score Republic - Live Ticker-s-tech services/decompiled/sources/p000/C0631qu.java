package p000;

/* JADX INFO: renamed from: qu */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0631qu extends AbstractC0668ru {
    @Override // p000.AbstractC0668ru
    /* JADX INFO: renamed from: a */
    public final int mo3990a(int i, int i2, int i3, int i4) {
        return AbstractC0668ru.f6968d ? 2 : 1;
    }

    @Override // p000.AbstractC0668ru
    /* JADX INFO: renamed from: b */
    public final float mo3991b(int i, int i2, int i3, int i4) {
        if (AbstractC0668ru.f6968d) {
            return Math.min(i3 / i, i4 / i2);
        }
        int iMax = Math.max(i2 / i4, i / i3);
        if (iMax == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(iMax);
    }
}
