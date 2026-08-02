package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j32 {

    /* JADX INFO: renamed from: a */
    public static final b90 f3811a;

    static {
        Object fn1Var;
        ((xm1) sm1.f7153a).getClass();
        AtomicReference atomicReference = bn1.f928o;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            dn1 dn1Var = (dn1) atomicReference.get();
            fn1Var = new fn1(strReplace, dn1Var.f1752a, dn1Var.f1753b, dn1Var.f1754c);
        } else {
            for (int i = 7; i >= 0; i--) {
                char cCharAt = "Phlogger".charAt(i);
                if (cCharAt == '$') {
                    strReplace = "Phlogger".replace('$', '.');
                    break;
                } else {
                    if (cCharAt == '.') {
                        break;
                    }
                }
            }
            bn1 bn1Var = new bn1(strReplace);
            if (bn1.f925l || bn1.f926m) {
                bn1Var.f931k = new en1(strReplace);
            } else if (bn1.f927n) {
                dn1 dn1Var2 = fn1.f2454q;
                bn1Var.f931k = new fn1(strReplace, Level.OFF, dn1Var2.f1753b, dn1Var2.f1754c);
            } else {
                bn1Var.f931k = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = zm1.f9863a;
            concurrentLinkedQueue.offer(bn1Var);
            fn1Var = bn1Var;
            if (atomicReference.get() != null) {
                while (true) {
                    bn1 bn1Var2 = (bn1) concurrentLinkedQueue.poll();
                    if (bn1Var2 == null) {
                        break;
                    }
                    dn1 dn1Var3 = (dn1) atomicReference.get();
                    bn1Var2.f931k = new fn1((String) bn1Var2.f7192j, dn1Var3.f1752a, dn1Var3.f1753b, dn1Var3.f1754c);
                }
                bn1.m726B();
                fn1Var = bn1Var;
            }
        }
        f3811a = new b90(5, fn1Var);
    }
}
