package z1;

/* loaded from: classes.dex */
public final class X implements z1.L {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8547b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(z1.X.class, "_isCompleting");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8548c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(z1.X.class, java.lang.Object.class, "_rootCause");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8549d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(z1.X.class, java.lang.Object.class, "_exceptionsHolder");
    private volatile java.lang.Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile java.lang.Object _rootCause;

    /* renamed from: a, reason: collision with root package name */
    public final z1.a0 f8550a;

    public X(z1.a0 a0Var, java.lang.Throwable th) {
        this.f8550a = a0Var;
        this._rootCause = th;
    }

    public final void a(java.lang.Throwable th) {
        java.lang.Throwable c2 = c();
        if (c2 == null) {
            f8548c.set(this, th);
            return;
        }
        if (th == c2) {
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8549d;
        java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof java.lang.Throwable)) {
            if (obj instanceof java.util.ArrayList) {
                ((java.util.ArrayList) obj).add(th);
                return;
            } else {
                throw new java.lang.IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // z1.L
    public final boolean b() {
        return c() == null;
    }

    public final java.lang.Throwable c() {
        return (java.lang.Throwable) f8548c.get(this);
    }

    @Override // z1.L
    public final z1.a0 d() {
        return this.f8550a;
    }

    public final boolean e() {
        return c() != null;
    }

    public final boolean f() {
        return f8547b.get(this) != 0;
    }

    public final java.util.ArrayList g(java.lang.Throwable th) {
        java.util.ArrayList arrayList;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8549d;
        java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new java.util.ArrayList(4);
        } else if (obj instanceof java.lang.Throwable) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof java.util.ArrayList)) {
                throw new java.lang.IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (java.util.ArrayList) obj;
        }
        java.lang.Throwable c2 = c();
        if (c2 != null) {
            arrayList.add(0, c2);
        }
        if (th != null && !th.equals(c2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, z1.AbstractC1068v.f8599g);
        return arrayList;
    }

    public final java.lang.String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + f8549d.get(this) + ", list=" + this.f8550a + ']';
    }
}
