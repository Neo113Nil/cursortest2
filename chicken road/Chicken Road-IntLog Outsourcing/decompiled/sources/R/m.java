package R;

import h2.C0482c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import u.C1459G;
import u.C1468i;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2597a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final B0.c f2598b = new B0.c();

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2599c;

    /* renamed from: d, reason: collision with root package name */
    public a f2600d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f2601e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2602f;

    /* renamed from: g, reason: collision with root package name */
    public final C0482c f2603g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2604h;

    /* renamed from: i, reason: collision with root package name */
    public final W1.e f2605i;

    public m() {
        new ArrayList();
        this.f2600d = null;
        new i(this);
        this.f2601e = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        this.f2602f = new ArrayList();
        this.f2603g = new C0482c(this);
        new CopyOnWriteArrayList();
        final int i2 = 0;
        new D.a(this) { // from class: R.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f2593b;

            {
                this.f2593b = this;
            }

            @Override // D.a
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        m mVar = this.f2593b;
                        mVar.getClass();
                        mVar.a(false);
                        break;
                    case 1:
                        m mVar2 = this.f2593b;
                        mVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            mVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        m mVar3 = this.f2593b;
                        mVar3.getClass();
                        mVar3.d(((C1468i) obj).f11991a, false);
                        break;
                    default:
                        m mVar4 = this.f2593b;
                        mVar4.getClass();
                        mVar4.g(((C1459G) obj).f11990a, false);
                        break;
                }
            }
        };
        final int i3 = 1;
        new D.a(this) { // from class: R.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f2593b;

            {
                this.f2593b = this;
            }

            @Override // D.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        m mVar = this.f2593b;
                        mVar.getClass();
                        mVar.a(false);
                        break;
                    case 1:
                        m mVar2 = this.f2593b;
                        mVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            mVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        m mVar3 = this.f2593b;
                        mVar3.getClass();
                        mVar3.d(((C1468i) obj).f11991a, false);
                        break;
                    default:
                        m mVar4 = this.f2593b;
                        mVar4.getClass();
                        mVar4.g(((C1459G) obj).f11990a, false);
                        break;
                }
            }
        };
        final int i6 = 2;
        new D.a(this) { // from class: R.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f2593b;

            {
                this.f2593b = this;
            }

            @Override // D.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        m mVar = this.f2593b;
                        mVar.getClass();
                        mVar.a(false);
                        break;
                    case 1:
                        m mVar2 = this.f2593b;
                        mVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            mVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        m mVar3 = this.f2593b;
                        mVar3.getClass();
                        mVar3.d(((C1468i) obj).f11991a, false);
                        break;
                    default:
                        m mVar4 = this.f2593b;
                        mVar4.getClass();
                        mVar4.g(((C1459G) obj).f11990a, false);
                        break;
                }
            }
        };
        final int i7 = 3;
        new D.a(this) { // from class: R.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f2593b;

            {
                this.f2593b = this;
            }

            @Override // D.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        m mVar = this.f2593b;
                        mVar.getClass();
                        mVar.a(false);
                        break;
                    case 1:
                        m mVar2 = this.f2593b;
                        mVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            mVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        m mVar3 = this.f2593b;
                        mVar3.getClass();
                        mVar3.d(((C1468i) obj).f11991a, false);
                        break;
                    default:
                        m mVar4 = this.f2593b;
                        mVar4.getClass();
                        mVar4.g(((C1459G) obj).f11990a, false);
                        break;
                }
            }
        };
        new j(this);
        this.f2604h = -1;
        this.f2605i = new W1.e();
        new ArrayDeque();
        new B.a(7, this);
    }

    public static boolean j(f fVar) {
        if (fVar == null) {
            return true;
        }
        return fVar.f2585d;
    }

    public final void a(boolean z) {
        for (f fVar : this.f2598b.f()) {
            if (fVar != null && z) {
                fVar.f2584c.a(true);
            }
        }
    }

    public final boolean b() {
        if (this.f2604h < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (f fVar : this.f2598b.f()) {
            if (fVar != null && j(fVar) && fVar.f2584c.b()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fVar);
                z = true;
            }
        }
        if (this.f2599c != null) {
            for (int i2 = 0; i2 < this.f2599c.size(); i2++) {
                f fVar2 = (f) this.f2599c.get(i2);
                if (arrayList == null || !arrayList.contains(fVar2)) {
                    fVar2.getClass();
                }
            }
        }
        this.f2599c = arrayList;
        return z;
    }

    public final void c(boolean z) {
        for (f fVar : this.f2598b.f()) {
            if (fVar != null && z) {
                fVar.f2584c.c(true);
            }
        }
    }

    public final void d(boolean z, boolean z5) {
        for (f fVar : this.f2598b.f()) {
            if (fVar != null && z5) {
                fVar.f2584c.d(z, true);
            }
        }
    }

    public final boolean e() {
        if (this.f2604h < 1) {
            return false;
        }
        for (f fVar : this.f2598b.f()) {
            if (fVar != null && fVar.f2584c.e()) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f2604h < 1) {
            return;
        }
        for (f fVar : this.f2598b.f()) {
            if (fVar != null) {
                fVar.f2584c.f();
            }
        }
    }

    public final void g(boolean z, boolean z5) {
        for (f fVar : this.f2598b.f()) {
            if (fVar != null && z5) {
                fVar.f2584c.g(z, true);
            }
        }
    }

    public final boolean h() {
        boolean z = false;
        if (this.f2604h < 1) {
            return false;
        }
        for (f fVar : this.f2598b.f()) {
            if (fVar != null && j(fVar) && fVar.f2584c.h()) {
                z = true;
            }
        }
        return z;
    }

    public final void i() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append("null");
        sb.append("}}");
        return sb.toString();
    }
}
