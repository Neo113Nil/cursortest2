package w2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class X implements L {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10484b = AtomicIntegerFieldUpdater.newUpdater(X.class, "_isCompleting");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10485c = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_rootCause");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10486d = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: a, reason: collision with root package name */
    public final a0 f10487a;

    public X(a0 a0Var, Throwable th) {
        this.f10487a = a0Var;
        this._rootCause = th;
    }

    @Override // w2.L
    public final boolean a() {
        return d() == null;
    }

    public final void b(Throwable th) {
        Throwable d3 = d();
        if (d3 == null) {
            f10485c.set(this, th);
            return;
        }
        if (th == d3) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10486d;
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

    @Override // w2.L
    public final a0 c() {
        return this.f10487a;
    }

    public final Throwable d() {
        return (Throwable) f10485c.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final boolean f() {
        return f10484b.get(this) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10486d;
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
        Throwable d3 = d();
        if (d3 != null) {
            arrayList.add(0, d3);
        }
        if (th != null && !th.equals(d3)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC1242v.f10531g);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + f10486d.get(this) + ", list=" + this.f10487a + ']';
    }
}
