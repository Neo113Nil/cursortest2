package p4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r0.AbstractC2346c;

/* renamed from: p4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2260B extends u4.p {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18741o = AtomicIntegerFieldUpdater.newUpdater(C2260B.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // u4.p, p4.b0
    public final void w(Object obj) {
        x(obj);
    }

    @Override // u4.p, p4.b0
    public final void x(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f18741o;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                u4.a.h(AbstractC2346c.v(this.f20111n), AbstractC2282w.r(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
