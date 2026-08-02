package Ae;

import Be.AbstractC2630b;
import Be.AbstractC2632d;
import Be.C2631c;
import De.C2857A;
import Sc.r;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes.dex */
final class P0 extends AbstractC2632d<N0<?>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<Object> f885a = new AtomicReference<>(null);

    @Override // Be.AbstractC2632d
    public final boolean a(AbstractC2630b abstractC2630b) {
        C2857A c2857a;
        AtomicReference<Object> atomicReference = this.f885a;
        if (atomicReference.get() != null) {
            return false;
        }
        c2857a = O0.f877a;
        atomicReference.set(c2857a);
        return true;
    }

    @Override // Be.AbstractC2632d
    public final kotlin.coroutines.d[] b(AbstractC2630b abstractC2630b) {
        this.f885a.set(null);
        return C2631c.f3571a;
    }

    public final Object c(@NotNull kotlin.coroutines.d<? super Unit> frame) {
        C2857A c2857a;
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        AtomicReference<Object> atomicReference = this.f885a;
        c2857a = O0.f877a;
        while (true) {
            if (atomicReference.compareAndSet(c2857a, c10737n)) {
                break;
            }
            if (atomicReference.get() != c2857a) {
                r.Companion companion = Sc.r.INSTANCE;
                c10737n.resumeWith(Unit.f71690a);
                break;
            }
        }
        Object n11 = c10737n.n();
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }

    public final void d() {
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        C2857A c2857a4;
        AtomicReference<Object> atomicReference = this.f885a;
        while (true) {
            Object obj = atomicReference.get();
            if (obj == null) {
                return;
            }
            c2857a = O0.f878b;
            if (obj == c2857a) {
                return;
            }
            c2857a2 = O0.f877a;
            if (obj == c2857a2) {
                c2857a3 = O0.f878b;
                while (!atomicReference.compareAndSet(obj, c2857a3)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                return;
            }
            c2857a4 = O0.f877a;
            while (!atomicReference.compareAndSet(obj, c2857a4)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            r.Companion companion = Sc.r.INSTANCE;
            ((C10737n) obj).resumeWith(Unit.f71690a);
            return;
        }
    }

    public final boolean e() {
        C2857A c2857a;
        C2857A c2857a2;
        AtomicReference<Object> atomicReference = this.f885a;
        c2857a = O0.f877a;
        Object andSet = atomicReference.getAndSet(c2857a);
        Intrinsics.f(andSet);
        c2857a2 = O0.f878b;
        return andSet == c2857a2;
    }
}
