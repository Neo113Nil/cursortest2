package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: c0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0081c0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m823a(Unsafe unsafe, AbstractC0269h0 abstractC0269h0, long j, C0785v c0785v, C0785v c0785v2) {
        while (!unsafe.compareAndSwapObject(abstractC0269h0, j, c0785v, c0785v2)) {
            if (unsafe.getObject(abstractC0269h0, j) != c0785v) {
                return false;
            }
        }
        return true;
    }
}
