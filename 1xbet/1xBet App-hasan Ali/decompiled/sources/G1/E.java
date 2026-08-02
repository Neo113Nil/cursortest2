package G1;

import A0.C0040k0;
import E.C0120z;
import E.k0;
import a3.AbstractC0467k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC0487p;
import androidx.lifecycle.InterfaceC0491u;
import androidx.lifecycle.X;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import n.AbstractC2107A;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: A, reason: collision with root package name */
    public int f1823A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f1824B;

    /* renamed from: C, reason: collision with root package name */
    public final s4.B f1825C;

    /* renamed from: D, reason: collision with root package name */
    public final s4.w f1826D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1827a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f1828b;

    /* renamed from: c, reason: collision with root package name */
    public B f1829c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f1830d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f1831e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final X3.k f1832g;

    /* renamed from: h, reason: collision with root package name */
    public final s4.M f1833h;
    public final s4.M i;

    /* renamed from: j, reason: collision with root package name */
    public final s4.x f1834j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f1835k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f1836l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f1837m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f1838n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0491u f1839o;

    /* renamed from: p, reason: collision with root package name */
    public r f1840p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f1841q;

    /* renamed from: r, reason: collision with root package name */
    public EnumC0487p f1842r;

    /* renamed from: s, reason: collision with root package name */
    public final C0142m f1843s;

    /* renamed from: t, reason: collision with root package name */
    public final C0145p f1844t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1845u;

    /* renamed from: v, reason: collision with root package name */
    public final P f1846v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f1847w;

    /* renamed from: x, reason: collision with root package name */
    public kotlin.jvm.internal.m f1848x;

    /* renamed from: y, reason: collision with root package name */
    public C0120z f1849y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f1850z;

    public E(Context context) {
        Object obj;
        kotlin.jvm.internal.l.f("context", context);
        this.f1827a = context;
        Iterator it = n4.i.M(context, C0131b.f1879n).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f1828b = (Activity) obj;
        this.f1832g = new X3.k();
        X3.v vVar = X3.v.f6090k;
        this.f1833h = s4.C.b(vVar);
        s4.M b3 = s4.C.b(vVar);
        this.i = b3;
        this.f1834j = new s4.x(b3);
        this.f1835k = new LinkedHashMap();
        this.f1836l = new LinkedHashMap();
        this.f1837m = new LinkedHashMap();
        this.f1838n = new LinkedHashMap();
        this.f1841q = new CopyOnWriteArrayList();
        this.f1842r = EnumC0487p.f7059l;
        int i = 0;
        this.f1843s = new C0142m(i, this);
        this.f1844t = new C0145p(i, this);
        this.f1845u = true;
        P p5 = new P();
        this.f1846v = p5;
        this.f1847w = new LinkedHashMap();
        this.f1850z = new LinkedHashMap();
        p5.a(new D(p5));
        p5.a(new C0132c(this.f1827a));
        this.f1824B = new ArrayList();
        G4.d.E(new C0040k0(8, this));
        s4.B a5 = s4.C.a(2, r4.a.f19107l);
        this.f1825C = a5;
        this.f1826D = new s4.w(a5);
    }

    public static y e(y yVar, int i, boolean z3, y yVar2) {
        B b3;
        if (yVar.f1969p == i && (yVar2 == null || (yVar.equals(yVar2) && kotlin.jvm.internal.l.a(yVar.f1965l, yVar2.f1965l)))) {
            return yVar;
        }
        if (yVar instanceof B) {
            b3 = (B) yVar;
        } else {
            b3 = yVar.f1965l;
            kotlin.jvm.internal.l.c(b3);
        }
        return b3.g(i, b3, z3, yVar2);
    }

    public static void l(E e3, String str, H h3, int i) {
        if ((i & 2) != 0) {
            h3 = null;
        }
        e3.getClass();
        kotlin.jvm.internal.l.f("route", str);
        if (e3.f1829c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + e3 + '.').toString());
        }
        B i5 = e3.i(e3.f1832g);
        w i6 = i5.i(str, true, i5);
        if (i6 == null) {
            StringBuilder w5 = AbstractC0467k.w("Navigation destination that matches route ", str, " cannot be found in the navigation graph ");
            w5.append(e3.f1829c);
            throw new IllegalArgumentException(w5.toString());
        }
        y yVar = i6.f1956k;
        Bundle c5 = yVar.c(i6.f1957l);
        if (c5 == null) {
            c5 = new Bundle();
        }
        Intent intent = new Intent();
        int i7 = y.f1963s;
        String str2 = yVar.f1970q;
        Uri parse = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        kotlin.jvm.internal.l.b(parse);
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        c5.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        e3.k(yVar, c5, h3);
    }

    public static /* synthetic */ void p(E e3, C0140k c0140k) {
        e3.o(c0140k, false, new X3.k());
    }

    public final void a(y yVar, Bundle bundle, C0140k c0140k, List list) {
        Object obj;
        Object obj2;
        y yVar2 = c0140k.f1899l;
        boolean z3 = yVar2 instanceof InterfaceC0133d;
        X3.k kVar = this.f1832g;
        if (!z3) {
            while (!kVar.isEmpty() && (((C0140k) kVar.last()).f1899l instanceof InterfaceC0133d) && n(((C0140k) kVar.last()).f1899l.f1969p, true, false)) {
            }
        }
        X3.k kVar2 = new X3.k();
        boolean z5 = yVar instanceof B;
        Context context = this.f1827a;
        Object obj3 = null;
        if (z5) {
            y yVar3 = yVar2;
            do {
                kotlin.jvm.internal.l.c(yVar3);
                yVar3 = yVar3.f1965l;
                if (yVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (kotlin.jvm.internal.l.a(((C0140k) obj2).f1899l, yVar3)) {
                                break;
                            }
                        }
                    }
                    C0140k c0140k2 = (C0140k) obj2;
                    if (c0140k2 == null) {
                        c0140k2 = j3.i.l(context, yVar3, bundle, h(), this.f1840p);
                    }
                    kVar2.addFirst(c0140k2);
                    if (!kVar.isEmpty() && ((C0140k) kVar.last()).f1899l == yVar3) {
                        p(this, (C0140k) kVar.last());
                    }
                }
                if (yVar3 == null) {
                    break;
                }
            } while (yVar3 != yVar);
        }
        y yVar4 = kVar2.isEmpty() ? yVar2 : ((C0140k) kVar2.first()).f1899l;
        while (yVar4 != null && d(yVar4.f1969p, yVar4) != yVar4) {
            yVar4 = yVar4.f1965l;
            if (yVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (kotlin.jvm.internal.l.a(((C0140k) obj).f1899l, yVar4)) {
                            break;
                        }
                    }
                }
                C0140k c0140k3 = (C0140k) obj;
                if (c0140k3 == null) {
                    c0140k3 = j3.i.l(context, yVar4, yVar4.c(bundle2), h(), this.f1840p);
                }
                kVar2.addFirst(c0140k3);
            }
        }
        if (!kVar2.isEmpty()) {
            yVar2 = ((C0140k) kVar2.first()).f1899l;
        }
        while (!kVar.isEmpty() && (((C0140k) kVar.last()).f1899l instanceof B)) {
            y yVar5 = ((C0140k) kVar.last()).f1899l;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.NavGraph", yVar5);
            if (((B) yVar5).f1816t.e(yVar2.f1969p) != null) {
                break;
            } else {
                p(this, (C0140k) kVar.last());
            }
        }
        C0140k c0140k4 = (C0140k) (kVar.isEmpty() ? null : kVar.f6085l[kVar.f6084k]);
        if (c0140k4 == null) {
            c0140k4 = (C0140k) (kVar2.isEmpty() ? null : kVar2.f6085l[kVar2.f6084k]);
        }
        if (!kotlin.jvm.internal.l.a(c0140k4 != null ? c0140k4.f1899l : null, this.f1829c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                y yVar6 = ((C0140k) previous).f1899l;
                B b3 = this.f1829c;
                kotlin.jvm.internal.l.c(b3);
                if (kotlin.jvm.internal.l.a(yVar6, b3)) {
                    obj3 = previous;
                    break;
                }
            }
            C0140k c0140k5 = (C0140k) obj3;
            if (c0140k5 == null) {
                B b5 = this.f1829c;
                kotlin.jvm.internal.l.c(b5);
                B b6 = this.f1829c;
                kotlin.jvm.internal.l.c(b6);
                c0140k5 = j3.i.l(context, b5, b6.c(bundle), h(), this.f1840p);
            }
            kVar2.addFirst(c0140k5);
        }
        Iterator it = kVar2.iterator();
        while (it.hasNext()) {
            C0140k c0140k6 = (C0140k) it.next();
            Object obj4 = this.f1847w.get(this.f1846v.b(c0140k6.f1899l.f1964k));
            if (obj4 == null) {
                throw new IllegalStateException(AbstractC2107A.u(new StringBuilder("NavigatorBackStack for "), yVar.f1964k, " should already be created").toString());
            }
            ((C0143n) obj4).a(c0140k6);
        }
        kVar.addAll(kVar2);
        kVar.addLast(c0140k);
        ArrayList h02 = X3.m.h0(kVar2, c0140k);
        int size = h02.size();
        int i = 0;
        while (i < size) {
            Object obj5 = h02.get(i);
            i++;
            C0140k c0140k7 = (C0140k) obj5;
            B b7 = c0140k7.f1899l.f1965l;
            if (b7 != null) {
                j(c0140k7, f(b7.f1969p));
            }
        }
    }

    public final boolean b() {
        X3.k kVar;
        while (true) {
            kVar = this.f1832g;
            if (kVar.isEmpty() || !(((C0140k) kVar.last()).f1899l instanceof B)) {
                break;
            }
            p(this, (C0140k) kVar.last());
        }
        C0140k c0140k = (C0140k) kVar.h();
        ArrayList arrayList = this.f1824B;
        if (c0140k != null) {
            arrayList.add(c0140k);
        }
        this.f1823A++;
        t();
        int i = this.f1823A - 1;
        this.f1823A = i;
        if (i == 0) {
            ArrayList n02 = X3.m.n0(arrayList);
            arrayList.clear();
            int size = n02.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = n02.get(i5);
                i5++;
                C0140k c0140k2 = (C0140k) obj;
                Iterator it = this.f1841q.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    y yVar = c0140k2.f1899l;
                    c0140k2.c();
                    throw null;
                }
                this.f1825C.q(c0140k2);
            }
            ArrayList n03 = X3.m.n0(kVar);
            s4.M m5 = this.f1833h;
            m5.getClass();
            m5.j(null, n03);
            ArrayList q5 = q();
            s4.M m6 = this.i;
            m6.getClass();
            m6.j(null, q5);
        }
        return c0140k != null;
    }

    public final boolean c(ArrayList arrayList, y yVar, boolean z3, boolean z5) {
        E e3;
        boolean z6;
        String str;
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        X3.k kVar = new X3.k();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                e3 = this;
                z6 = z5;
                break;
            }
            int i5 = i + 1;
            O o5 = (O) arrayList.get(i);
            kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
            C0140k c0140k = (C0140k) this.f1832g.last();
            e3 = this;
            z6 = z5;
            e3.f1849y = new C0120z(sVar2, sVar, e3, z6, kVar);
            o5.e(c0140k, z6);
            e3.f1849y = null;
            if (!sVar2.f17620k) {
                break;
            }
            z5 = z6;
            i = i5;
        }
        if (z6) {
            LinkedHashMap linkedHashMap = e3.f1837m;
            if (!z3) {
                n4.e eVar = new n4.e(new n4.l(n4.i.M(yVar, C0131b.f1881p), new C0144o(this, 0), 0));
                while (eVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((y) eVar.next()).f1969p);
                    C0141l c0141l = (C0141l) (kVar.isEmpty() ? null : kVar.f6085l[kVar.f6084k]);
                    linkedHashMap.put(valueOf, c0141l != null ? c0141l.f1910k : null);
                }
            }
            if (!kVar.isEmpty()) {
                C0141l c0141l2 = (C0141l) kVar.first();
                n4.e eVar2 = new n4.e(new n4.l(n4.i.M(d(c0141l2.f1911l, null), C0131b.f1882q), new C0144o(this, 1), 0));
                while (true) {
                    boolean hasNext = eVar2.hasNext();
                    str = c0141l2.f1910k;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((y) eVar2.next()).f1969p), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    e3.f1838n.put(str, kVar);
                }
            }
        }
        u();
        return sVar.f17620k;
    }

    public final y d(int i, y yVar) {
        y yVar2;
        B b3 = this.f1829c;
        if (b3 == null) {
            return null;
        }
        if (b3.f1969p == i) {
            if (yVar == null) {
                return b3;
            }
            if (kotlin.jvm.internal.l.a(b3, yVar) && yVar.f1965l == null) {
                return this.f1829c;
            }
        }
        C0140k c0140k = (C0140k) this.f1832g.h();
        if (c0140k == null || (yVar2 = c0140k.f1899l) == null) {
            yVar2 = this.f1829c;
            kotlin.jvm.internal.l.c(yVar2);
        }
        return e(yVar2, i, false, yVar);
    }

    public final C0140k f(int i) {
        Object obj;
        X3.k kVar = this.f1832g;
        ListIterator listIterator = kVar.listIterator(kVar.c());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((C0140k) obj).f1899l.f1969p == i) {
                break;
            }
        }
        C0140k c0140k = (C0140k) obj;
        if (c0140k != null) {
            return c0140k;
        }
        StringBuilder v4 = AbstractC2107A.v(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        C0140k c0140k2 = (C0140k) kVar.h();
        v4.append(c0140k2 != null ? c0140k2.f1899l : null);
        throw new IllegalArgumentException(v4.toString().toString());
    }

    public final B g() {
        B b3 = this.f1829c;
        if (b3 == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.NavGraph", b3);
        return b3;
    }

    public final EnumC0487p h() {
        return this.f1839o == null ? EnumC0487p.f7060m : this.f1842r;
    }

    public final B i(X3.k kVar) {
        y yVar;
        C0140k c0140k = (C0140k) kVar.h();
        if (c0140k == null || (yVar = c0140k.f1899l) == null) {
            yVar = this.f1829c;
            kotlin.jvm.internal.l.c(yVar);
        }
        if (yVar instanceof B) {
            return (B) yVar;
        }
        B b3 = yVar.f1965l;
        kotlin.jvm.internal.l.c(b3);
        return b3;
    }

    public final void j(C0140k c0140k, C0140k c0140k2) {
        this.f1835k.put(c0140k, c0140k2);
        LinkedHashMap linkedHashMap = this.f1836l;
        if (linkedHashMap.get(c0140k2) == null) {
            linkedHashMap.put(c0140k2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c0140k2);
        kotlin.jvm.internal.l.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0312, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0310, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0323, code lost:
    
        r9.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0326, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02c4, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0327, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021f, code lost:
    
        if (r29.f1969p == r8.f1969p) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0210, code lost:
    
        if (r12.equals(r8) == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0221, code lost:
    
        r8 = new X3.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x022a, code lost:
    
        if (X3.n.N(r1) < r10) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0230, code lost:
    
        if (r1.isEmpty() != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0232, code lost:
    
        r11 = (G1.C0140k) r1.remove(X3.n.N(r1));
        s(r11);
        r19 = new G1.C0140k(r11.f1898k, r11.f1899l, r11.f1899l.c(r30), r11.f1901n, r11.f1902o, r11.f1903p, r11.f1904q);
        r19.f1901n = r11.f1901n;
        r19.h(r11.f1908u);
        r8.addFirst(r19);
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0280, code lost:
    
        throw new java.util.NoSuchElementException("List is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0281, code lost:
    
        r16 = r5;
        r5 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x028b, code lost:
    
        if (r5.hasNext() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x028d, code lost:
    
        r9 = (G1.C0140k) r5.next();
        r10 = r9.f1899l.f1965l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0297, code lost:
    
        if (r10 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0299, code lost:
    
        j(r9, f(r10.f1969p));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02a2, code lost:
    
        r1.addLast(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02a6, code lost:
    
        r1 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02ae, code lost:
    
        if (r1.hasNext() == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02b0, code lost:
    
        r5 = (G1.C0140k) r1.next();
        r8 = r0.b(r5.f1899l.f1964k);
        r9 = r5.f1899l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02c0, code lost:
    
        if (r9 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02c2, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c5, code lost:
    
        if (r10 == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02c8, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c9, code lost:
    
        if (r9 != null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02cc, code lost:
    
        G1.AbstractC0136g.e(G1.C0131b.f1886u);
        r8.c(r9);
        r8 = r8.b();
        r9 = r8.f1916a;
        r9.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02dd, code lost:
    
        r10 = X3.m.n0((java.util.Collection) ((s4.M) r8.f1920e.f19316k).getValue());
        r11 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02f9, code lost:
    
        if (r11.hasPrevious() == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0309, code lost:
    
        if (kotlin.jvm.internal.l.a(((G1.C0140k) r11.previous()).f1903p, r5.f1903p) == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x030b, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0313, code lost:
    
        r10.set(r11, r5);
        r5 = r8.f1917b;
        r5.getClass();
        r5.j(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x031f, code lost:
    
        r9.unlock();
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x011b A[LOOP:8: B:128:0x004d->B:137:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0126 A[EDGE_INSN: B:138:0x0126->B:139:0x0126 BREAK  A[LOOP:8: B:128:0x004d->B:137:0x011b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x036c A[LOOP:1: B:23:0x0366->B:25:0x036c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(y yVar, Bundle bundle, H h3) {
        LinkedHashMap linkedHashMap;
        boolean z3;
        kotlin.jvm.internal.s sVar;
        boolean z5;
        kotlin.jvm.internal.s sVar2;
        ListIterator listIterator;
        int i;
        Iterator it;
        boolean n5;
        Object obj;
        ListIterator listIterator2;
        Bundle bundle2;
        Object obj2;
        Object obj3;
        boolean z6;
        P p5 = this.f1846v;
        X3.k kVar = this.f1832g;
        LinkedHashMap linkedHashMap2 = this.f1847w;
        Iterator it2 = linkedHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((C0143n) it2.next()).f1919d = true;
        }
        kotlin.jvm.internal.s sVar3 = new kotlin.jvm.internal.s();
        if (h3 != null) {
            String str = h3.f1862h;
            boolean z7 = h3.f1860e;
            boolean z8 = h3.f1859d;
            if (str != null) {
                if (kVar.isEmpty()) {
                    linkedHashMap = linkedHashMap2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator3 = kVar.listIterator(kVar.c());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            linkedHashMap = linkedHashMap2;
                            obj = null;
                            break;
                        }
                        obj = listIterator3.previous();
                        C0140k c0140k = (C0140k) obj;
                        y yVar2 = c0140k.f1899l;
                        Bundle c5 = c0140k.c();
                        yVar2.getClass();
                        kotlin.jvm.internal.l.f("route", str);
                        if (kotlin.jvm.internal.l.a(yVar2.f1970q, str)) {
                            linkedHashMap = linkedHashMap2;
                            listIterator2 = listIterator3;
                        } else {
                            w e3 = yVar2.e(str);
                            linkedHashMap = linkedHashMap2;
                            if (!yVar2.equals(e3 != null ? e3.f1956k : null)) {
                                listIterator2 = listIterator3;
                            } else if (c5 != null) {
                                Bundle bundle3 = e3.f1957l;
                                if (bundle3 == null) {
                                    listIterator2 = listIterator3;
                                } else {
                                    Set<String> keySet = bundle3.keySet();
                                    listIterator2 = listIterator3;
                                    kotlin.jvm.internal.l.e("matchingArgs.keySet()", keySet);
                                    Iterator it3 = keySet.iterator();
                                    while (it3.hasNext()) {
                                        String str2 = (String) it3.next();
                                        if (c5.containsKey(str2)) {
                                            Iterator it4 = it3;
                                            C0135f c0135f = (C0135f) e3.f1956k.f1968o.get(str2);
                                            M m5 = c0135f != null ? c0135f.f1891a : null;
                                            w wVar = e3;
                                            if (m5 != null) {
                                                kotlin.jvm.internal.l.e("key", str2);
                                                bundle2 = bundle3;
                                                obj2 = m5.a(str2, bundle3);
                                            } else {
                                                bundle2 = bundle3;
                                                obj2 = null;
                                            }
                                            if (m5 != null) {
                                                kotlin.jvm.internal.l.e("key", str2);
                                                obj3 = m5.a(str2, c5);
                                            } else {
                                                obj3 = null;
                                            }
                                            if (m5 == null || m5.f(obj2, obj3)) {
                                                it3 = it4;
                                                e3 = wVar;
                                                bundle3 = bundle2;
                                            }
                                        }
                                    }
                                }
                            } else {
                                listIterator2 = listIterator3;
                                e3.getClass();
                            }
                            z6 = false;
                            if (!z8 || !z6) {
                                arrayList.add(p5.b(c0140k.f1899l.f1964k));
                            }
                            if (!z6) {
                                break;
                            }
                            linkedHashMap2 = linkedHashMap;
                            listIterator3 = listIterator2;
                        }
                        z6 = true;
                        if (!z8) {
                        }
                        arrayList.add(p5.b(c0140k.f1899l.f1964k));
                        if (!z6) {
                        }
                    }
                    C0140k c0140k2 = (C0140k) obj;
                    y yVar3 = c0140k2 != null ? c0140k2.f1899l : null;
                    if (yVar3 == null) {
                        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
                    } else {
                        n5 = c(arrayList, yVar3, z8, z7);
                    }
                }
                n5 = false;
            } else {
                linkedHashMap = linkedHashMap2;
                int i5 = h3.f1858c;
                if (i5 != -1) {
                    n5 = n(i5, z8, z7);
                }
            }
            z3 = n5;
            Bundle c6 = yVar.c(bundle);
            if (h3 == null && h3.f1857b && this.f1837m.containsKey(Integer.valueOf(yVar.f1969p))) {
                sVar3.f17620k = r(yVar.f1969p, c6, h3);
                sVar2 = sVar3;
                z5 = false;
            } else {
                if (h3 != null && h3.f1856a) {
                    C0140k c0140k3 = (C0140k) kVar.h();
                    listIterator = kVar.listIterator(kVar.c());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            i = -1;
                            break;
                        } else if (((C0140k) listIterator.previous()).f1899l == yVar) {
                            i = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (i != -1) {
                        if (yVar instanceof B) {
                            int i6 = B.f1815x;
                            List N5 = n4.i.N(new n4.l(n4.i.M((B) yVar, C0131b.f1885t), C0131b.f1883r, 1));
                            if (kVar.f6086m - i == N5.size()) {
                                List subList = kVar.subList(i, kVar.f6086m);
                                ArrayList arrayList2 = new ArrayList(X3.o.S(subList, 10));
                                Iterator it5 = subList.iterator();
                                while (it5.hasNext()) {
                                    arrayList2.add(Integer.valueOf(((C0140k) it5.next()).f1899l.f1969p));
                                }
                            }
                        } else if (c0140k3 != null) {
                            y yVar4 = c0140k3.f1899l;
                            if (yVar4 != null) {
                            }
                        }
                        if (z5) {
                            sVar2 = sVar;
                        } else {
                            C0140k l5 = j3.i.l(this.f1827a, yVar, c6, h(), this.f1840p);
                            O b3 = p5.b(yVar.f1964k);
                            List A3 = AbstractC2346c.A(l5);
                            sVar2 = sVar;
                            this.f1848x = new B.t(sVar2, this, yVar, c6, 2);
                            b3.d(A3, h3);
                            this.f1848x = null;
                        }
                    }
                }
                sVar = sVar3;
                z5 = false;
                if (z5) {
                }
            }
            u();
            it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((C0143n) it.next()).f1919d = false;
            }
            if (!z3 || sVar2.f17620k || z5) {
                b();
            } else {
                t();
                return;
            }
        }
        linkedHashMap = linkedHashMap2;
        z3 = false;
        Bundle c62 = yVar.c(bundle);
        if (h3 == null) {
        }
        if (h3 != null) {
            C0140k c0140k32 = (C0140k) kVar.h();
            listIterator = kVar.listIterator(kVar.c());
            while (true) {
                if (listIterator.hasPrevious()) {
                }
            }
            if (i != -1) {
            }
        }
        sVar = sVar3;
        z5 = false;
        if (z5) {
        }
        u();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
        }
        if (z3) {
        }
        b();
    }

    public final boolean m() {
        X3.k kVar = this.f1832g;
        if (!kVar.isEmpty()) {
            C0140k c0140k = (C0140k) kVar.h();
            y yVar = c0140k != null ? c0140k.f1899l : null;
            kotlin.jvm.internal.l.c(yVar);
            if (n(yVar.f1969p, true, false) && b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(int i, boolean z3, boolean z5) {
        y yVar;
        X3.k kVar = this.f1832g;
        if (kVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = X3.m.j0(kVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                yVar = null;
                break;
            }
            yVar = ((C0140k) it.next()).f1899l;
            O b3 = this.f1846v.b(yVar.f1964k);
            if (z3 || yVar.f1969p != i) {
                arrayList.add(b3);
            }
            if (yVar.f1969p == i) {
                break;
            }
        }
        if (yVar != null) {
            return c(arrayList, yVar, z3, z5);
        }
        int i5 = y.f1963s;
        Log.i("NavController", "Ignoring popBackStack to destination " + AbstractC0136g.a(this.f1827a, i) + " as it was not found on the current back stack");
        return false;
    }

    public final void o(C0140k c0140k, boolean z3, X3.k kVar) {
        r rVar;
        s4.x xVar;
        Set set;
        X3.k kVar2 = this.f1832g;
        C0140k c0140k2 = (C0140k) kVar2.last();
        if (!kotlin.jvm.internal.l.a(c0140k2, c0140k)) {
            throw new IllegalStateException(("Attempted to pop " + c0140k.f1899l + ", which is not the top of the back stack (" + c0140k2.f1899l + ')').toString());
        }
        if (kVar2.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        kVar2.remove(X3.n.N(kVar2));
        C0143n c0143n = (C0143n) this.f1847w.get(this.f1846v.b(c0140k2.f1899l.f1964k));
        boolean z5 = true;
        if ((c0143n == null || (xVar = c0143n.f) == null || (set = (Set) ((s4.M) xVar.f19316k).getValue()) == null || !set.contains(c0140k2)) && !this.f1836l.containsKey(c0140k2)) {
            z5 = false;
        }
        EnumC0487p enumC0487p = c0140k2.f1905r.f7068g;
        EnumC0487p enumC0487p2 = EnumC0487p.f7060m;
        if (enumC0487p.compareTo(enumC0487p2) >= 0) {
            if (z3) {
                c0140k2.h(enumC0487p2);
                kVar.addFirst(new C0141l(c0140k2));
            }
            if (z5) {
                c0140k2.h(enumC0487p2);
            } else {
                c0140k2.h(EnumC0487p.f7058k);
                s(c0140k2);
            }
        }
        if (z3 || z5 || (rVar = this.f1840p) == null) {
            return;
        }
        String str = c0140k2.f1903p;
        kotlin.jvm.internal.l.f("backStackEntryId", str);
        X x5 = (X) rVar.f1933a.remove(str);
        if (x5 != null) {
            x5.a();
        }
    }

    public final ArrayList q() {
        EnumC0487p enumC0487p;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f1847w.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0487p = EnumC0487p.f7061n;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((s4.M) ((C0143n) it.next()).f.f19316k).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C0140k c0140k = (C0140k) obj;
                if (!arrayList.contains(c0140k) && c0140k.f1908u.compareTo(enumC0487p) < 0) {
                    arrayList2.add(obj);
                }
            }
            X3.s.U(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f1832g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C0140k c0140k2 = (C0140k) next;
            if (!arrayList.contains(c0140k2) && c0140k2.f1908u.compareTo(enumC0487p) >= 0) {
                arrayList3.add(next);
            }
        }
        X3.s.U(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((C0140k) obj2).f1899l instanceof B)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean r(int i, Bundle bundle, H h3) {
        y g5;
        C0140k c0140k;
        y yVar;
        LinkedHashMap linkedHashMap = this.f1837m;
        int i5 = 0;
        if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        kotlin.jvm.internal.l.f("<this>", values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l.a((String) it.next(), str)) {
                it.remove();
            }
        }
        X3.k kVar = (X3.k) kotlin.jvm.internal.z.a(this.f1838n).remove(str);
        ArrayList arrayList = new ArrayList();
        C0140k c0140k2 = (C0140k) this.f1832g.h();
        if (c0140k2 == null || (g5 = c0140k2.f1899l) == null) {
            g5 = g();
        }
        if (kVar != null) {
            Iterator it2 = kVar.iterator();
            while (it2.hasNext()) {
                C0141l c0141l = (C0141l) it2.next();
                y e3 = e(g5, c0141l.f1911l, true, null);
                Context context = this.f1827a;
                if (e3 == null) {
                    int i6 = y.f1963s;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC0136g.a(context, c0141l.f1911l) + " cannot be found from the current destination " + g5).toString());
                }
                arrayList.add(c0141l.a(context, e3, h(), this.f1840p));
                g5 = e3;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (!(((C0140k) obj).f1899l instanceof B)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList3.get(i8);
            i8++;
            C0140k c0140k3 = (C0140k) obj2;
            List list = (List) X3.m.f0(arrayList2);
            if (kotlin.jvm.internal.l.a((list == null || (c0140k = (C0140k) X3.m.e0(list)) == null || (yVar = c0140k.f1899l) == null) ? null : yVar.f1964k, c0140k3.f1899l.f1964k)) {
                list.add(c0140k3);
            } else {
                arrayList2.add(X3.n.P(c0140k3));
            }
        }
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        int size3 = arrayList2.size();
        while (i5 < size3) {
            Object obj3 = arrayList2.get(i5);
            i5++;
            List list2 = (List) obj3;
            O b3 = this.f1846v.b(((C0140k) X3.m.Y(list2)).f1899l.f1964k);
            this.f1848x = new k0(sVar, arrayList, new kotlin.jvm.internal.u(), this, bundle, 2);
            b3.d(list2, h3);
            this.f1848x = null;
        }
        return sVar.f17620k;
    }

    public final void s(C0140k c0140k) {
        kotlin.jvm.internal.l.f("child", c0140k);
        C0140k c0140k2 = (C0140k) this.f1835k.remove(c0140k);
        if (c0140k2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f1836l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c0140k2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            C0143n c0143n = (C0143n) this.f1847w.get(this.f1846v.b(c0140k2.f1899l.f1964k));
            if (c0143n != null) {
                c0143n.b(c0140k2);
            }
            linkedHashMap.remove(c0140k2);
        }
    }

    public final void t() {
        AtomicInteger atomicInteger;
        s4.x xVar;
        Set set;
        ArrayList n02 = X3.m.n0(this.f1832g);
        if (n02.isEmpty()) {
            return;
        }
        y yVar = ((C0140k) X3.m.e0(n02)).f1899l;
        ArrayList arrayList = new ArrayList();
        if (yVar instanceof InterfaceC0133d) {
            Iterator it = X3.m.j0(n02).iterator();
            while (it.hasNext()) {
                y yVar2 = ((C0140k) it.next()).f1899l;
                arrayList.add(yVar2);
                if (!(yVar2 instanceof InterfaceC0133d) && !(yVar2 instanceof B)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = X3.m.j0(n02).iterator();
        while (true) {
            int i = 0;
            if (!it2.hasNext()) {
                int size = n02.size();
                while (i < size) {
                    Object obj = n02.get(i);
                    i++;
                    C0140k c0140k = (C0140k) obj;
                    EnumC0487p enumC0487p = (EnumC0487p) hashMap.get(c0140k);
                    if (enumC0487p != null) {
                        c0140k.h(enumC0487p);
                    } else {
                        c0140k.i();
                    }
                }
                return;
            }
            C0140k c0140k2 = (C0140k) it2.next();
            EnumC0487p enumC0487p2 = c0140k2.f1908u;
            y yVar3 = c0140k2.f1899l;
            EnumC0487p enumC0487p3 = EnumC0487p.f7062o;
            EnumC0487p enumC0487p4 = EnumC0487p.f7061n;
            if (yVar != null && yVar3.f1969p == yVar.f1969p) {
                if (enumC0487p2 != enumC0487p3) {
                    C0143n c0143n = (C0143n) this.f1847w.get(this.f1846v.b(yVar3.f1964k));
                    if (kotlin.jvm.internal.l.a((c0143n == null || (xVar = c0143n.f) == null || (set = (Set) ((s4.M) xVar.f19316k).getValue()) == null) ? null : Boolean.valueOf(set.contains(c0140k2)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f1836l.get(c0140k2)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(c0140k2, enumC0487p4);
                    } else {
                        hashMap.put(c0140k2, enumC0487p3);
                    }
                }
                y yVar4 = (y) X3.m.Z(arrayList);
                if (yVar4 != null && yVar4.f1969p == yVar3.f1969p) {
                    if (arrayList.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    arrayList.remove(0);
                }
                yVar = yVar.f1965l;
            } else if (arrayList.isEmpty() || yVar3.f1969p != ((y) X3.m.Y(arrayList)).f1969p) {
                c0140k2.h(EnumC0487p.f7060m);
            } else {
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                y yVar5 = (y) arrayList.remove(0);
                if (enumC0487p2 == enumC0487p3) {
                    c0140k2.h(enumC0487p4);
                } else if (enumC0487p2 != enumC0487p4) {
                    hashMap.put(c0140k2, enumC0487p4);
                }
                B b3 = yVar5.f1965l;
                if (b3 != null && !arrayList.contains(b3)) {
                    arrayList.add(b3);
                }
            }
        }
    }

    public final void u() {
        int i;
        boolean z3 = false;
        if (this.f1845u) {
            X3.k kVar = this.f1832g;
            if (kVar == null || !kVar.isEmpty()) {
                Iterator it = kVar.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!(((C0140k) it.next()).f1899l instanceof B) && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i = 0;
            }
            if (i > 1) {
                z3 = true;
            }
        }
        this.f1844t.d(z3);
    }
}
