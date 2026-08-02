package B4;

import A1.C0042s;
import E4.AbstractC0178k;
import E4.C0169b;
import E4.C0170c;
import E4.C0171d;
import E4.C0174g;
import E4.C0177j;
import E4.CallableC0180m;
import E4.EnumC0176i;
import W5.AbstractC0486a1;
import Y4.C0567d;
import Y4.C0569e;
import Y4.H0;
import Y4.I0;
import a.AbstractC0603a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import v0.AbstractC1663a;
import w1.C1726n0;

/* loaded from: classes2.dex */
public class Z {

    /* renamed from: a, reason: collision with root package name */
    public final E4.C f1135a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f1136b;

    public Z(E4.C c3, FirebaseFirestore firebaseFirestore) {
        this.f1135a = c3;
        firebaseFirestore.getClass();
        this.f1136b = firebaseFirestore;
    }

    public static void i(Object obj, EnumC0176i enumC0176i) {
        if (!(obj instanceof List) || ((List) obj).size() == 0) {
            throw new IllegalArgumentException(e1.k.i(new StringBuilder("Invalid Query. A non-empty array is required for '"), enumC0176i.f2198a, "' filters."));
        }
    }

    public final C0069m a(Executor executor, C0174g c0174g, InterfaceC0073q interfaceC0073q) {
        C0069m c0069m;
        E4.C c3 = this.f1135a;
        if (t.e.b(c3.f2098i, 2) && c3.f2090a.isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
        C0169b c0169b = new C0169b(executor, new C0067k(1, this, interfaceC0073q));
        C1726n0 c1726n0 = this.f1136b.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            E4.t tVar = (E4.t) c1726n0.f17806c;
            c0069m = new C0069m(c0169b, tVar, tVar.b(this.f1135a, c0174g, c0169b), 1);
        }
        return c0069m;
    }

    public final C0170c b(String str, boolean z4, Object[] objArr) {
        E4.C c3 = this.f1135a;
        int length = objArr.length;
        List list = c3.f2090a;
        if (length > list.size()) {
            throw new IllegalArgumentException(AbstractC0486a1.h("Too many arguments provided to ", str, "(). The number of arguments must be less than or equal to the number of orderBy() clauses."));
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < objArr.length; i7++) {
            Object obj = objArr[i7];
            boolean equals = ((E4.A) list.get(i7)).f2085b.equals(H4.j.f3321b);
            FirebaseFirestore firebaseFirestore = this.f1136b;
            if (!equals) {
                arrayList.add(firebaseFirestore.f11969h.m(obj, false));
            } else {
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Invalid query. Expected a string for document ID in " + str + "(), but got " + obj + ".");
                }
                String str2 = (String) obj;
                if (c3.f2096g == null && str2.contains("/")) {
                    throw new IllegalArgumentException(w1.L.j("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to ", str, "() must be a plain document ID, but '", str2, "' contains a slash."));
                }
                H4.m mVar = (H4.m) c3.f2095f.a(H4.m.y(str2));
                if (!H4.h.f(mVar)) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to " + str + "() must result in a valid document path, but '" + mVar + "' is not because it contains an odd number of segments.");
                }
                arrayList.add(H4.o.k(firebaseFirestore.f11964c, new H4.h(mVar)));
            }
        }
        return new C0170c(arrayList, z4);
    }

    public final Task c(int i7) {
        Task a2;
        E4.C c3 = this.f1135a;
        if (t.e.b(c3.f2098i, 2) && c3.f2090a.isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
        if (i7 != 3) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            C0174g c0174g = new C0174g();
            c0174g.f2181a = true;
            c0174g.f2182b = true;
            c0174g.f2183c = true;
            taskCompletionSource2.setResult(a(L4.l.f4377b, c0174g, new C0068l(taskCompletionSource, taskCompletionSource2, i7, 1)));
            return taskCompletionSource.getTask();
        }
        C1726n0 c1726n0 = this.f1136b.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            E4.t tVar = (E4.t) c1726n0.f17806c;
            tVar.e();
            a2 = tVar.f2232d.f4359a.a(new CallableC0180m(1, tVar, this.f1135a));
        }
        return a2.continueWith(L4.l.f4377b, new C0042s(this, 13));
    }

    public final Z d(long j) {
        if (j > 0) {
            return new Z(this.f1135a.f(j), this.f1136b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j + ") is invalid. Limit must be positive.");
    }

    public final Z e(long j) {
        if (j > 0) {
            E4.C c3 = this.f1135a;
            return new Z(new E4.C(c3.f2095f, c3.f2096g, c3.f2094e, c3.f2090a, j, 2, c3.j, c3.f2099k), this.f1136b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limitToLast (" + j + ") is invalid. Limit must be positive.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z4 = (Z) obj;
        return this.f1135a.equals(z4.f1135a) && this.f1136b.equals(z4.f1136b);
    }

    public final Z f(C0074s c0074s, int i7) {
        AbstractC0603a.f(c0074s, "Provided field path must not be null.");
        AbstractC1663a.i(i7, "Provided direction must not be null.");
        E4.C c3 = this.f1135a;
        if (c3.j != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
        }
        if (c3.f2099k != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
        }
        E4.A a2 = new E4.A(i7 == 1 ? 1 : 2, c0074s.f1192a);
        p3.f.O("No ordering is allowed for document query", !c3.e(), new Object[0]);
        ArrayList arrayList = new ArrayList(c3.f2090a);
        arrayList.add(a2);
        return new Z(new E4.C(c3.f2095f, c3.f2096g, c3.f2094e, arrayList, c3.f2097h, c3.f2098i, c3.j, c3.f2099k), this.f1136b);
    }

    public final I0 g(Object obj) {
        boolean z4 = obj instanceof String;
        FirebaseFirestore firebaseFirestore = this.f1136b;
        if (!z4) {
            if (obj instanceof C0070n) {
                return H4.o.k(firebaseFirestore.f11964c, ((C0070n) obj).f1179a);
            }
            H5.k kVar = L4.r.f4389a;
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: ".concat(obj == null ? "null" : obj.getClass().getName()));
        }
        String str = (String) obj;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
        }
        E4.C c3 = this.f1135a;
        if (c3.f2096g == null && str.contains("/")) {
            throw new IllegalArgumentException(AbstractC0486a1.h("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '", str, "' contains a '/' character."));
        }
        H4.m mVar = (H4.m) c3.f2095f.a(H4.m.y(str));
        if (H4.h.f(mVar)) {
            return H4.o.k(firebaseFirestore.f11964c, new H4.h(mVar));
        }
        throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + mVar + "' is not because it has an odd number of segments (" + mVar.f3312a.size() + ").");
    }

    public final AbstractC0178k h(B b7) {
        I0 m7;
        boolean z4 = b7 instanceof A;
        boolean z7 = true;
        p3.f.O("Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", z4 || (b7 instanceof C0081z), new Object[0]);
        if (!z4) {
            C0081z c0081z = (C0081z) b7;
            ArrayList arrayList = new ArrayList();
            Iterator it = c0081z.f1198a.iterator();
            while (it.hasNext()) {
                AbstractC0178k h6 = h((B) it.next());
                if (!h6.b().isEmpty()) {
                    arrayList.add(h6);
                }
            }
            return arrayList.size() == 1 ? (AbstractC0178k) arrayList.get(0) : new C0171d(c0081z.f1199b, arrayList);
        }
        A a2 = (A) b7;
        C0074s c0074s = a2.f1069a;
        AbstractC0603a.f(c0074s, "Provided field path must not be null.");
        EnumC0176i enumC0176i = a2.f1070b;
        H4.j jVar = H4.j.f3321b;
        H4.j jVar2 = c0074s.f1192a;
        boolean equals = jVar2.equals(jVar);
        EnumC0176i enumC0176i2 = EnumC0176i.IN;
        EnumC0176i enumC0176i3 = EnumC0176i.ARRAY_CONTAINS_ANY;
        EnumC0176i enumC0176i4 = EnumC0176i.NOT_IN;
        Object obj = a2.f1071c;
        if (!equals) {
            if (enumC0176i == enumC0176i2 || enumC0176i == enumC0176i4 || enumC0176i == enumC0176i3) {
                i(obj, enumC0176i);
            }
            u1.c cVar = this.f1136b.f11969h;
            if (enumC0176i != enumC0176i2 && enumC0176i != enumC0176i4) {
                z7 = false;
            }
            m7 = cVar.m(obj, z7);
        } else {
            if (enumC0176i == EnumC0176i.ARRAY_CONTAINS || enumC0176i == enumC0176i3) {
                throw new IllegalArgumentException(e1.k.i(new StringBuilder("Invalid query. You can't perform '"), enumC0176i.f2198a, "' queries on FieldPath.documentId()."));
            }
            if (enumC0176i == enumC0176i2 || enumC0176i == enumC0176i4) {
                i(obj, enumC0176i);
                C0567d B7 = C0569e.B();
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    I0 g3 = g(it2.next());
                    B7.d();
                    C0569e.v((C0569e) B7.f12096b, g3);
                }
                H0 S6 = I0.S();
                S6.f(B7);
                m7 = (I0) S6.b();
            } else {
                m7 = g(obj);
            }
        }
        return C0177j.e(jVar2, enumC0176i, m7);
    }

    public final int hashCode() {
        return this.f1136b.hashCode() + (this.f1135a.hashCode() * 31);
    }

    public final Z j(B b7) {
        EnumC0176i enumC0176i;
        AbstractC0178k h6 = h(b7);
        if (h6.b().isEmpty()) {
            return this;
        }
        E4.C c3 = this.f1135a;
        E4.C c4 = c3;
        for (C0177j c0177j : h6.c()) {
            EnumC0176i enumC0176i2 = c0177j.f2199a;
            int ordinal = enumC0176i2.ordinal();
            EnumC0176i enumC0176i3 = EnumC0176i.NOT_EQUAL;
            EnumC0176i enumC0176i4 = EnumC0176i.NOT_IN;
            List asList = ordinal != 3 ? (ordinal == 7 || ordinal == 8) ? Arrays.asList(enumC0176i4) : ordinal != 9 ? new ArrayList() : Arrays.asList(EnumC0176i.ARRAY_CONTAINS_ANY, EnumC0176i.IN, enumC0176i4, enumC0176i3) : Arrays.asList(enumC0176i3, enumC0176i4);
            Iterator it = c4.f2094e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    enumC0176i = null;
                    break;
                }
                for (C0177j c0177j2 : ((AbstractC0178k) it.next()).c()) {
                    if (asList.contains(c0177j2.f2199a)) {
                        enumC0176i = c0177j2.f2199a;
                        break;
                    }
                }
            }
            if (enumC0176i != null) {
                String str = enumC0176i2.f2198a;
                if (enumC0176i == enumC0176i2) {
                    throw new IllegalArgumentException(AbstractC0486a1.h("Invalid Query. You cannot use more than one '", str, "' filter."));
                }
                throw new IllegalArgumentException(e1.k.i(e1.k.k("Invalid Query. You cannot use '", str, "' filters with '"), enumC0176i.f2198a, "' filters."));
            }
            c4 = c4.b(c0177j);
        }
        return new Z(c3.b(h6), this.f1136b);
    }
}
