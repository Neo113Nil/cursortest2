package De;

import De.AbstractC2861d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: De.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2861d<N extends AbstractC2861d<N>> {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6617a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2861d.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6618b = AtomicReferenceFieldUpdater.newUpdater(AbstractC2861d.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC2861d(x xVar) {
        this._prev$volatile = xVar;
    }

    public static final Object a(AbstractC2861d abstractC2861d) {
        abstractC2861d.getClass();
        return f6617a.get(abstractC2861d);
    }

    public final void c() {
        f6618b.set(this, null);
    }

    public final N d() {
        C2857A c2857a;
        Object obj = f6617a.get(this);
        c2857a = C2858a.f6616a;
        if (obj == c2857a) {
            return null;
        }
        return (N) obj;
    }

    public final N e() {
        return (N) f6618b.get(this);
    }

    public abstract boolean f();

    public final boolean g() {
        C2857A c2857a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c2857a = C2858a.f6616a;
        do {
            atomicReferenceFieldUpdater = f6617a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c2857a)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [De.d] */
    public final void h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        ?? d11;
        if (d() == null) {
            return;
        }
        while (true) {
            N e11 = e();
            while (true) {
                atomicReferenceFieldUpdater = f6618b;
                if (e11 == null || !e11.f()) {
                    break;
                } else {
                    e11 = (N) atomicReferenceFieldUpdater.get(e11);
                }
            }
            N d12 = d();
            Intrinsics.f(d12);
            while (d12.f() && (d11 = d12.d()) != 0) {
                d12 = d11;
            }
            do {
                obj = atomicReferenceFieldUpdater.get(d12);
            } while (!C2859b.h(atomicReferenceFieldUpdater, d12, obj, ((AbstractC2861d) obj) == null ? null : e11));
            if (e11 != null) {
                f6617a.set(e11, d12);
            }
            if (!d12.f() || d12.d() == null) {
                if (e11 == null || !e11.f()) {
                    return;
                }
            }
        }
    }

    public final boolean i(@NotNull x xVar) {
        return C2860c.h(f6617a, this, xVar);
    }
}
