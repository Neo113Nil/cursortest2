package p4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a0 implements O {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18775l = AtomicIntegerFieldUpdater.newUpdater(a0.class, "_isCompleting$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18776m = AtomicReferenceFieldUpdater.newUpdater(a0.class, Object.class, "_rootCause$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18777n = AtomicReferenceFieldUpdater.newUpdater(a0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f18778k;

    public a0(d0 d0Var, Throwable th) {
        this.f18778k = d0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c5 = c();
        if (c5 == null) {
            f18776m.set(this, th);
            return;
        }
        if (th == c5) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18777n;
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

    @Override // p4.O
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) f18776m.get(this);
    }

    @Override // p4.O
    public final d0 d() {
        return this.f18778k;
    }

    public final boolean e() {
        return c() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18777n;
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
        Throwable c5 = c();
        if (c5 != null) {
            arrayList.add(0, c5);
        }
        if (th != null && !th.equals(c5)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC2282w.f18832h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(f18775l.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(f18777n.get(this));
        sb.append(", list=");
        sb.append(this.f18778k);
        sb.append(']');
        return sb.toString();
    }
}
