package Gc;

import Ak.C2436a;
import C.C2702w;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import oc.C8691a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Throwable f9907a = new a("No further exceptions");

    static final class a extends Throwable {
        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    public static <T> boolean a(AtomicReference<Throwable> atomicReference, Throwable th2) {
        Throwable th3;
        do {
            th3 = atomicReference.get();
            if (th3 == f9907a) {
                return false;
            }
        } while (!C2436a.g(atomicReference, th3, th3 == null ? th2 : new C8691a(th3, th2)));
        return true;
    }

    public static <T> Throwable b(AtomicReference<Throwable> atomicReference) {
        Throwable th2 = atomicReference.get();
        Throwable th3 = f9907a;
        return th2 != th3 ? atomicReference.getAndSet(th3) : th2;
    }

    public static String c(long j11, TimeUnit timeUnit) {
        StringBuilder d11 = C2702w.d(j11, "The source did not signal an event for ", " ");
        d11.append(timeUnit.toString().toLowerCase());
        d11.append(" and has been terminated.");
        return d11.toString();
    }

    public static RuntimeException d(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2 instanceof RuntimeException ? (RuntimeException) th2 : new RuntimeException(th2);
    }
}
