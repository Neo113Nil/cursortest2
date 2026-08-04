package W5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class L0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N0 f6857b;

    public /* synthetic */ L0(N0 n2, int i7) {
        this.f6856a = i7;
        this.f6857b = n2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        switch (this.f6856a) {
            case 0:
                N0 n2 = this.f6857b;
                if (n2.f6886g.f6934E == null) {
                    AtomicReference atomicReference = n2.f6883d;
                    if (atomicReference.get() == Q0.f6928m0) {
                        atomicReference.set(null);
                    }
                    n2.f6886g.f6938I.C(Q0.f6925j0);
                    return;
                }
                return;
            case 1:
                if (this.f6857b.f6883d.get() == Q0.f6928m0) {
                    this.f6857b.f6883d.set(null);
                }
                LinkedHashSet linkedHashSet = this.f6857b.f6886g.f6934E;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((M0) it.next()).a("Channel is forcefully shutdown", null);
                    }
                }
                p155w1.F0 f7 = this.f6857b.f6886g.f6938I;
                U5.l0 l0Var = Q0.f6924i0;
                f7.C(l0Var);
                synchronized (f7.f17379b) {
                    arrayList = new ArrayList((HashSet) f7.f17380c);
                    break;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC0540t) it2.next()).f(l0Var);
                }
                ((Q0) f7.f17382e).f6937H.c(l0Var);
                return;
            default:
                this.f6857b.f6886g.C();
                return;
        }
    }
}
