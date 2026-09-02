package m0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Q implements H {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f904c = AtomicIntegerFieldUpdater.newUpdater(Q.class, "_isCompleting");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f905d = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_rootCause");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f906e = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: b, reason: collision with root package name */
    public final U f907b;

    public Q(U u2, Throwable th) {
        this.f907b = u2;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            f905d.set(this, th);
            return;
        }
        if (th == c2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f906e;
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

    @Override // m0.H
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) f905d.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return f904c.get(this) != 0;
    }

    @Override // m0.H
    public final U f() {
        return this.f907b;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f906e;
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
        Throwable c2 = c();
        if (c2 != null) {
            arrayList.add(0, c2);
        }
        if (th != null && !th.equals(c2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0062t.f950g);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + f906e.get(this) + ", list=" + this.f907b + ']';
    }
}
