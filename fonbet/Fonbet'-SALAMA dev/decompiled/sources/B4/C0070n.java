package B4;

import A1.C0011c;
import A1.C0042s;
import E4.C0169b;
import E4.C0174g;
import E4.CallableC0180m;
import Y4.I0;
import a.AbstractC0603a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import w1.C1726n0;

/* renamed from: B4.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0070n {

    /* renamed from: a, reason: collision with root package name */
    public final H4.h f1179a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f1180b;

    public C0070n(H4.h hVar, FirebaseFirestore firebaseFirestore) {
        hVar.getClass();
        this.f1179a = hVar;
        this.f1180b = firebaseFirestore;
    }

    public final C0069m a(Executor executor, C0174g c0174g, InterfaceC0073q interfaceC0073q) {
        C0069m c0069m;
        C0169b c0169b = new C0169b(executor, new C0067k(0, this, interfaceC0073q));
        E4.C c3 = new E4.C(this.f1179a.f3318a, null);
        C1726n0 c1726n0 = this.f1180b.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            E4.t tVar = (E4.t) c1726n0.f17806c;
            c0069m = new C0069m(c0169b, tVar, tVar.b(c3, c0174g, c0169b), 0);
        }
        return c0069m;
    }

    public final Task b() {
        Task f7;
        List singletonList = Collections.singletonList(new I4.e(this.f1179a, I4.n.f3688c));
        C1726n0 c1726n0 = this.f1180b.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            f7 = ((E4.t) c1726n0.f17806c).f(singletonList);
        }
        return f7.continueWith(L4.l.f4377b, L4.r.f4389a);
    }

    public final Task c(int i7) {
        Task continueWith;
        if (i7 != 3) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            C0174g c0174g = new C0174g();
            c0174g.f2181a = true;
            c0174g.f2182b = true;
            c0174g.f2183c = true;
            taskCompletionSource2.setResult(a(L4.l.f4377b, c0174g, new C0068l(taskCompletionSource, taskCompletionSource2, i7, 0)));
            return taskCompletionSource.getTask();
        }
        C1726n0 c1726n0 = this.f1180b.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            E4.t tVar = (E4.t) c1726n0.f17806c;
            tVar.e();
            continueWith = tVar.f2232d.f4359a.a(new CallableC0180m(0, tVar, this.f1179a)).continueWith(new B1.f(10));
        }
        return continueWith.continueWith(L4.l.f4377b, new C0042s(this, 12));
    }

    public final String d() {
        return this.f1179a.f3318a.c();
    }

    public final Task e(Object obj, e0 e0Var) {
        Task f7;
        AbstractC0603a.f(obj, "Provided data must not be null.");
        AbstractC0603a.f(e0Var, "Provided options must not be null.");
        List singletonList = Collections.singletonList((e0Var.f1153a ? this.f1180b.f11969h.l(obj, e0Var.f1154b) : this.f1180b.f11969h.n(obj)).g0(this.f1179a, I4.n.f3688c));
        C1726n0 c1726n0 = this.f1180b.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            f7 = ((E4.t) c1726n0.f17806c).f(singletonList);
        }
        return f7.continueWith(L4.l.f4377b, L4.r.f4389a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0070n)) {
            return false;
        }
        C0070n c0070n = (C0070n) obj;
        return this.f1179a.equals(c0070n.f1179a) && this.f1180b.equals(c0070n.f1180b);
    }

    public final Task f(C0074s c0074s, Object obj, Object... objArr) {
        Task f7;
        u1.c cVar = this.f1180b.f11969h;
        H5.k kVar = L4.r.f4389a;
        if (objArr.length % 2 == 1) {
            throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0074s);
        arrayList.add(obj);
        Collections.addAll(arrayList, objArr);
        for (int i7 = 0; i7 < arrayList.size(); i7 += 2) {
            Object obj2 = arrayList.get(i7);
            if (!(obj2 instanceof String) && !(obj2 instanceof C0074s)) {
                throw new IllegalArgumentException("Excepted field name at argument position " + (i7 + 2) + " but got " + obj2 + " in call to update.  The arguments to update should alternate between field names and values");
            }
        }
        p3.f.O("Expected fieldAndValues to contain an even number of elements", arrayList.size() % 2 == 0, new Object[0]);
        B1.m mVar = new B1.m(3, 4);
        C0011c p5 = mVar.p();
        H4.l lVar = new H4.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z4 = next instanceof String;
            p3.f.O("Expected argument to be String or FieldPath.", z4 || (next instanceof C0074s), new Object[0]);
            H4.j jVar = z4 ? C0074s.a((String) next).f1192a : ((C0074s) next).f1192a;
            if (next2 instanceof C0077v) {
                p5.a(jVar);
            } else {
                I0 f8 = cVar.f(next2, p5.c(jVar));
                if (f8 != null) {
                    p5.a(jVar);
                    lVar.g(jVar, f8);
                }
            }
        }
        List singletonList = Collections.singletonList(new I4.m(this.f1179a, lVar, new I4.f((HashSet) mVar.f1015c), I4.n.a(true), Collections.unmodifiableList((ArrayList) mVar.f1016d)));
        C1726n0 c1726n0 = this.f1180b.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            f7 = ((E4.t) c1726n0.f17806c).f(singletonList);
        }
        return f7.continueWith(L4.l.f4377b, L4.r.f4389a);
    }

    public final int hashCode() {
        return this.f1180b.hashCode() + (this.f1179a.f3318a.hashCode() * 31);
    }
}
