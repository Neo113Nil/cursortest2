package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k32 {

    /* JADX INFO: renamed from: a */
    public static final C0089c8 f4278a = new C0089c8(0);

    /* JADX INFO: renamed from: a */
    public static synchronized void m2987a() {
        C0089c8 c0089c8 = f4278a;
        Iterator it = ((C0053b8) c0089c8.values()).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        c0089c8.clear();
    }
}
