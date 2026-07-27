package P;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import s.C1182c;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1102a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final a1.e f1103b = new a1.e(11);

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1104c;

    /* renamed from: d, reason: collision with root package name */
    public a f1105d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f1106e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1107g;

    /* renamed from: h, reason: collision with root package name */
    public final P0.j f1108h;

    public k() {
        new ArrayList();
        this.f1105d = null;
        new h(this);
        this.f1106e = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        this.f = new ArrayList();
        new P0.j(this);
        new CopyOnWriteArrayList();
        final int i3 = 0;
        new C.a(this) { // from class: P.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f1099b;

            {
                this.f1099b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        k kVar = this.f1099b;
                        kVar.getClass();
                        kVar.a(false);
                        break;
                    case 1:
                        k kVar2 = this.f1099b;
                        kVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            kVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        k kVar3 = this.f1099b;
                        kVar3.getClass();
                        boolean z3 = ((C1182c) obj).f10290a;
                        kVar3.d(false);
                        break;
                    default:
                        k kVar4 = this.f1099b;
                        kVar4.getClass();
                        boolean z4 = ((s.n) obj).f10312a;
                        kVar4.g(false);
                        break;
                }
            }
        };
        final int i4 = 1;
        new C.a(this) { // from class: P.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f1099b;

            {
                this.f1099b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        k kVar = this.f1099b;
                        kVar.getClass();
                        kVar.a(false);
                        break;
                    case 1:
                        k kVar2 = this.f1099b;
                        kVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            kVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        k kVar3 = this.f1099b;
                        kVar3.getClass();
                        boolean z3 = ((C1182c) obj).f10290a;
                        kVar3.d(false);
                        break;
                    default:
                        k kVar4 = this.f1099b;
                        kVar4.getClass();
                        boolean z4 = ((s.n) obj).f10312a;
                        kVar4.g(false);
                        break;
                }
            }
        };
        final int i5 = 2;
        new C.a(this) { // from class: P.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f1099b;

            {
                this.f1099b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        k kVar = this.f1099b;
                        kVar.getClass();
                        kVar.a(false);
                        break;
                    case 1:
                        k kVar2 = this.f1099b;
                        kVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            kVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        k kVar3 = this.f1099b;
                        kVar3.getClass();
                        boolean z3 = ((C1182c) obj).f10290a;
                        kVar3.d(false);
                        break;
                    default:
                        k kVar4 = this.f1099b;
                        kVar4.getClass();
                        boolean z4 = ((s.n) obj).f10312a;
                        kVar4.g(false);
                        break;
                }
            }
        };
        final int i6 = 3;
        new C.a(this) { // from class: P.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f1099b;

            {
                this.f1099b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        k kVar = this.f1099b;
                        kVar.getClass();
                        kVar.a(false);
                        break;
                    case 1:
                        k kVar2 = this.f1099b;
                        kVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            kVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        k kVar3 = this.f1099b;
                        kVar3.getClass();
                        boolean z3 = ((C1182c) obj).f10290a;
                        kVar3.d(false);
                        break;
                    default:
                        k kVar4 = this.f1099b;
                        kVar4.getClass();
                        boolean z4 = ((s.n) obj).f10312a;
                        kVar4.g(false);
                        break;
                }
            }
        };
        this.f1107g = -1;
        this.f1108h = new P0.j(12);
        new ArrayDeque();
        new A.b(3, this);
    }

    public static boolean j(int i3) {
        return Log.isLoggable("FragmentManager", i3);
    }

    public static boolean k(f fVar) {
        return fVar == null || fVar.f1088d;
    }

    public final void a(boolean z3) {
        for (f fVar : this.f1103b.B()) {
            if (fVar != null && z3) {
                fVar.f1087c.a(true);
            }
        }
    }

    public final boolean b() {
        if (this.f1107g < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (f fVar : this.f1103b.B()) {
            if (fVar != null && k(fVar) && fVar.f1087c.b()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fVar);
                z3 = true;
            }
        }
        if (this.f1104c != null) {
            for (int i3 = 0; i3 < this.f1104c.size(); i3++) {
                f fVar2 = (f) this.f1104c.get(i3);
                if (arrayList == null || !arrayList.contains(fVar2)) {
                    fVar2.getClass();
                }
            }
        }
        this.f1104c = arrayList;
        return z3;
    }

    public final void c(boolean z3) {
        for (f fVar : this.f1103b.B()) {
            if (fVar != null && z3) {
                fVar.f1087c.c(true);
            }
        }
    }

    public final void d(boolean z3) {
        for (f fVar : this.f1103b.B()) {
            if (fVar != null && z3) {
                fVar.f1087c.d(true);
            }
        }
    }

    public final boolean e() {
        if (this.f1107g >= 1) {
            for (f fVar : this.f1103b.B()) {
                if (fVar != null && fVar.f1087c.e()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        if (this.f1107g < 1) {
            return;
        }
        for (f fVar : this.f1103b.B()) {
            if (fVar != null) {
                fVar.f1087c.f();
            }
        }
    }

    public final void g(boolean z3) {
        for (f fVar : this.f1103b.B()) {
            if (fVar != null && z3) {
                fVar.f1087c.g(true);
            }
        }
    }

    public final boolean h() {
        boolean z3 = false;
        if (this.f1107g < 1) {
            return false;
        }
        for (f fVar : this.f1103b.B()) {
            if (fVar != null && k(fVar) && fVar.f1087c.h()) {
                z3 = true;
            }
        }
        return z3;
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
