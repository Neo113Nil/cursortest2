package D6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class l0 implements InterfaceC0112b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1850b = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_isCompleting");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1851c = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "_rootCause");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1852d = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: a, reason: collision with root package name */
    public final u0 f1853a;

    public l0(u0 u0Var, Throwable th) {
        this.f1853a = u0Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable b7 = b();
        if (b7 == null) {
            f1851c.set(this, th);
            return;
        }
        if (th == b7) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1852d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final Throwable b() {
        return (Throwable) f1851c.get(this);
    }

    @Override // D6.InterfaceC0112b0
    public final u0 c() {
        return this.f1853a;
    }

    public final boolean d() {
        return b() != null;
    }

    public final boolean e() {
        return f1850b.get(this) != 0;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1852d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable b7 = b();
        if (b7 != null) {
            arrayList.add(0, b7);
        }
        if (th != null && !th.equals(b7)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, E.f1785h);
        return arrayList;
    }

    @Override // D6.InterfaceC0112b0
    public final boolean isActive() {
        return b() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + b() + ", exceptions=" + f1852d.get(this) + ", list=" + this.f1853a + ']';
    }
}
