package p000;

import java.util.Set;

/* JADX INFO: renamed from: k3 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0382k3 extends wm1 {
    @Override // p000.wm1
    /* JADX INFO: renamed from: b */
    public final void mo2818b(C0915yi c0915yi, Set set) {
        synchronized (c0915yi) {
            try {
                if (c0915yi.f4653q == null) {
                    c0915yi.f4653q = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.wm1
    /* JADX INFO: renamed from: e */
    public final int mo2819e(C0915yi c0915yi) {
        int i;
        synchronized (c0915yi) {
            i = c0915yi.f4654r - 1;
            c0915yi.f4654r = i;
        }
        return i;
    }
}
