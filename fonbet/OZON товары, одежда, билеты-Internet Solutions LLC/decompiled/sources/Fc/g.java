package Fc;

import I0.C3173b;
import Kc.C3493a;
import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sc.C9656b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g implements InterfaceC6950c {
    private static final /* synthetic */ g[] $VALUES;
    public static final g CANCELLED;

    static {
        g gVar = new g("CANCELLED", 0);
        CANCELLED = gVar;
        $VALUES = new g[]{gVar};
    }

    private g() {
        throw null;
    }

    public static boolean a(AtomicReference<InterfaceC6950c> atomicReference) {
        InterfaceC6950c andSet;
        InterfaceC6950c interfaceC6950c = atomicReference.get();
        g gVar = CANCELLED;
        if (interfaceC6950c == gVar || (andSet = atomicReference.getAndSet(gVar)) == gVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void b(AtomicReference<InterfaceC6950c> atomicReference, AtomicLong atomicLong, long j11) {
        InterfaceC6950c interfaceC6950c = atomicReference.get();
        if (interfaceC6950c != null) {
            interfaceC6950c.n(j11);
            return;
        }
        if (f(j11)) {
            Gc.d.a(atomicLong, j11);
            InterfaceC6950c interfaceC6950c2 = atomicReference.get();
            if (interfaceC6950c2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC6950c2.n(andSet);
                }
            }
        }
    }

    public static void d(AtomicReference atomicReference, AtomicLong atomicLong, InterfaceC6950c interfaceC6950c) {
        if (e(atomicReference, interfaceC6950c)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                interfaceC6950c.n(andSet);
            }
        }
    }

    public static boolean e(AtomicReference<InterfaceC6950c> atomicReference, InterfaceC6950c interfaceC6950c) {
        C9656b.c(interfaceC6950c, "s is null");
        while (!atomicReference.compareAndSet(null, interfaceC6950c)) {
            if (atomicReference.get() != null) {
                interfaceC6950c.cancel();
                if (atomicReference.get() == CANCELLED) {
                    return false;
                }
                C3493a.f(new oc.d("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(long j11) {
        if (j11 > 0) {
            return true;
        }
        C3493a.f(new IllegalArgumentException(C3173b.b(j11, "n > 0 required but it was ")));
        return false;
    }

    public static boolean g(InterfaceC6950c interfaceC6950c, InterfaceC6950c interfaceC6950c2) {
        if (interfaceC6950c2 == null) {
            C3493a.f(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC6950c == null) {
            return true;
        }
        interfaceC6950c2.cancel();
        C3493a.f(new oc.d("Subscription already set!"));
        return false;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @Override // hg.InterfaceC6950c
    public final void cancel() {
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
    }
}
