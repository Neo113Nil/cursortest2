package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: b0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0045b0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m546a(Unsafe unsafe, AbstractC0269h0 abstractC0269h0, long j, C0231g0 c0231g0, C0231g0 c0231g1) {
        while (!unsafe.compareAndSwapObject(abstractC0269h0, j, c0231g0, c0231g1)) {
            if (unsafe.getObject(abstractC0269h0, j) != c0231g0) {
                return false;
            }
        }
        return true;
    }
}
