package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l3 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0419l3 extends AbstractC0001a0 {

    /* JADX INFO: renamed from: s */
    public static final wm1 f4651s;

    /* JADX INFO: renamed from: t */
    public static final Logger f4652t = Logger.getLogger(AbstractC0419l3.class.getName());

    /* JADX INFO: renamed from: q */
    public volatile Set f4653q;

    /* JADX INFO: renamed from: r */
    public volatile int f4654r;

    static {
        wm1 c0382k3;
        try {
            c0382k3 = new C0345j3(AtomicReferenceFieldUpdater.newUpdater(AbstractC0419l3.class, Set.class, "q"), AtomicIntegerFieldUpdater.newUpdater(AbstractC0419l3.class, "r"));
            e = null;
        } catch (Error | RuntimeException e) {
            e = e;
            c0382k3 = new C0382k3();
        }
        f4651s = c0382k3;
        if (e != null) {
            f4652t.log(Level.SEVERE, "SafeAtomicHelper is broken!", e);
        }
    }
}
