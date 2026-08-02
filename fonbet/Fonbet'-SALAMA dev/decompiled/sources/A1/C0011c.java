package A1;

import B4.C0070n;
import U5.AbstractC0438e;
import W5.AbstractC0486a1;
import W5.C0527o0;
import W5.C0538s0;
import W5.RunnableC0521m0;
import W5.RunnableC0533q0;
import W5.X0;
import a.AbstractC0603a;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import n4.C1473g;
import w1.AbstractC1707i1;
import w1.C1726n0;

/* renamed from: A1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011c implements X0, q4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f331a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f332b;

    /* renamed from: c, reason: collision with root package name */
    public Object f333c;

    /* renamed from: d, reason: collision with root package name */
    public Object f334d;

    public /* synthetic */ C0011c(Object obj, Comparable comparable, boolean z4, int i7) {
        this.f331a = i7;
        this.f333c = obj;
        this.f334d = comparable;
        this.f332b = z4;
    }

    public void a(H4.j jVar) {
        ((HashSet) ((B1.m) this.f333c).f1015c).add(jVar);
    }

    public void b(H4.j jVar, I4.q qVar) {
        ((ArrayList) ((B1.m) this.f333c).f1016d).add(new I4.g(jVar, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0011c c(H4.j jVar) {
        H4.j jVar2 = (H4.j) this.f334d;
        H4.j jVar3 = jVar2 == null ? null : (H4.j) jVar2.a(jVar);
        C0011c c0011c = new C0011c((B1.m) this.f333c, jVar3, 0 == true ? 1 : 0, 2);
        if (jVar3 != null) {
            for (int i7 = 0; i7 < jVar3.f3312a.size(); i7++) {
                c0011c.m(jVar3.l(i7));
            }
        }
        return c0011c;
    }

    public Task d() {
        Task f7;
        n();
        this.f332b = true;
        if (((ArrayList) this.f334d).isEmpty()) {
            return Tasks.forResult(null);
        }
        C1726n0 c1726n0 = ((FirebaseFirestore) this.f333c).f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            f7 = ((E4.t) c1726n0.f17806c).f((ArrayList) this.f334d);
        }
        return f7;
    }

    public IllegalArgumentException e(String str) {
        String str2;
        H4.j jVar = (H4.j) this.f334d;
        if (jVar == null || jVar.isEmpty()) {
            str2 = "";
        } else {
            str2 = " (found in field " + jVar.c() + ")";
        }
        return new IllegalArgumentException(AbstractC0486a1.h("Invalid data. ", str, str2));
    }

    public boolean f() {
        String str;
        B1.m mVar = (B1.m) this.f333c;
        int e7 = t.e.e(mVar.f1014b);
        if (e7 == 0 || e7 == 1 || e7 == 2) {
            return true;
        }
        if (e7 == 3 || e7 == 4) {
            return false;
        }
        int i7 = mVar.f1014b;
        if (i7 == 1) {
            str = "Set";
        } else if (i7 == 2) {
            str = "MergeSet";
        } else if (i7 == 3) {
            str = "Update";
        } else if (i7 == 4) {
            str = "Argument";
        } else {
            if (i7 != 5) {
                throw null;
            }
            str = "ArrayArgument";
        }
        p3.f.F("Unexpected case for UserDataSource: %s", str);
        throw null;
    }

    public void g(C0070n c0070n, Map map, B4.e0 e0Var) {
        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f333c;
        firebaseFirestore.k(c0070n);
        AbstractC0603a.f(map, "Provided data must not be null.");
        AbstractC0603a.f(e0Var, "Provided options must not be null.");
        n();
        boolean z4 = e0Var.f1153a;
        u1.c cVar = firebaseFirestore.f11969h;
        ((ArrayList) this.f334d).add((z4 ? cVar.l(map, e0Var.f1154b) : cVar.n(map)).g0(c0070n.f1179a, I4.n.f3688c));
    }

    public void h() {
        if (this.f332b) {
            ((Context) this.f333c).unregisterReceiver((RunnableC0009b) this.f334d);
            this.f332b = false;
        }
    }

    public void i(ScheduledFuture scheduledFuture) {
        synchronized (this.f333c) {
            if (!this.f332b) {
                this.f334d = scheduledFuture;
            }
        }
    }

    public void j(boolean z4) {
        C0527o0 c0527o0 = (C0527o0) this.f333c;
        C0538s0 c0538s0 = (C0538s0) this.f334d;
        c0538s0.getClass();
        c0538s0.f7349k.execute(new RunnableC0521m0(0, c0538s0, c0527o0, z4));
    }

    public void k(U5.l0 l0Var) {
        C0538s0 c0538s0 = (C0538s0) this.f334d;
        c0538s0.f7348i.m(2, "{0} SHUTDOWN with {1}", ((C0527o0) this.f333c).f(), C0538s0.j(l0Var));
        this.f332b = true;
        c0538s0.f7349k.execute(new W5.E(15, this, l0Var));
    }

    public void l() {
        p3.f.q("transportShutdown() must be called before transportTerminated().", this.f332b);
        C0538s0 c0538s0 = (C0538s0) this.f334d;
        AbstractC0438e abstractC0438e = c0538s0.f7348i;
        C0527o0 c0527o0 = (C0527o0) this.f333c;
        abstractC0438e.m(2, "{0} Terminated", c0527o0.f());
        RunnableC0521m0 runnableC0521m0 = new RunnableC0521m0(0, c0538s0, c0527o0, false);
        U5.p0 p0Var = c0538s0.f7349k;
        p0Var.execute(runnableC0521m0);
        Iterator it = c0538s0.j.iterator();
        if (!it.hasNext()) {
            p0Var.execute(new RunnableC0533q0(this, 1));
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            c0527o0.d();
            throw null;
        }
    }

    public void m(String str) {
        if (str.isEmpty()) {
            throw e("Document fields must not be empty");
        }
        if (f() && str.startsWith("__") && str.endsWith("__")) {
            throw e("Document fields cannot begin and end with \"__\"");
        }
    }

    public void n() {
        if (this.f332b) {
            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
        }
    }

    @Override // q4.g
    public boolean p(Object obj) {
        n4.H h6 = (n4.H) obj;
        if (h6.f15373e || this.f332b) {
            if (!((List) this.f333c).contains(Long.valueOf(h6.f15369a))) {
                C1473g c1473g = h6.f15370b;
                C1473g c1473g2 = (C1473g) this.f334d;
                if (c1473g.z(c1473g2) || c1473g2.z(c1473g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        switch (this.f331a) {
            case 6:
                StringBuilder sb = new StringBuilder("http");
                sb.append(this.f332b ? "s" : "");
                sb.append("://");
                sb.append((String) this.f333c);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0011c(int i7) {
        this.f331a = i7;
        switch (i7) {
            case 8:
                File fileStreamPath = AbstractC1707i1.f17743c.getFileStreamPath(".flurryinstallreceiver.");
                this.f333c = fileStreamPath;
                Objects.toString(fileStreamPath);
                break;
        }
    }

    public C0011c(Context context, Handler handler, K k7) {
        this.f331a = 0;
        this.f333c = context.getApplicationContext();
        this.f334d = new RunnableC0009b(this, handler, k7);
    }

    public C0011c(FirebaseFirestore firebaseFirestore) {
        this.f331a = 1;
        this.f334d = new ArrayList();
        this.f332b = false;
        this.f333c = firebaseFirestore;
    }

    public C0011c(boolean z4, List list, C1473g c1473g) {
        this.f331a = 7;
        this.f332b = z4;
        this.f333c = list;
        this.f334d = c1473g;
    }

    public C0011c(C0538s0 c0538s0, C0527o0 c0527o0) {
        this.f331a = 3;
        this.f334d = c0538s0;
        this.f332b = false;
        this.f333c = c0527o0;
    }

    public C0011c(Object obj) {
        this.f331a = 4;
        this.f333c = obj;
    }
}
