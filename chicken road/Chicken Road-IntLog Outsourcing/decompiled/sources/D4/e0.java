package D4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e0 implements U {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f500b = AtomicIntegerFieldUpdater.newUpdater(e0.class, "_isCompleting");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f501c = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_rootCause");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f502d = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: a, reason: collision with root package name */
    public final i0 f503a;

    public e0(i0 i0Var, Throwable th) {
        this.f503a = i0Var;
        this._rootCause = th;
    }

    @Override // D4.U
    public final boolean a() {
        return c() == null;
    }

    public final void b(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            f501c.set(this, th);
            return;
        }
        if (th == c2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f502d;
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

    public final Throwable c() {
        return (Throwable) f501c.get(this);
    }

    @Override // D4.U
    public final i0 d() {
        return this.f503a;
    }

    public final boolean e() {
        return c() != null;
    }

    public final boolean f() {
        return f500b.get(this) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f502d;
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
        atomicReferenceFieldUpdater.set(this, AbstractC0024y.f555h);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + f502d.get(this) + ", list=" + this.f503a + ']';
    }
}
