package J;

import B90.C;
import C.S;
import G.a;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final H f12642a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12643b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12644c;

    /* renamed from: d, reason: collision with root package name */
    private final Rational f12645d;

    /* renamed from: e, reason: collision with root package name */
    private final l f12646e;

    public k(@NonNull H h11, Size size) {
        Rational rational;
        this.f12642a = h11;
        this.f12643b = h11.i();
        this.f12644c = h11.e();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List<Size> m11 = h11.m(256);
            if (m11.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(m11, new G.e(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f12645d = rational;
        this.f12646e = new l(h11, rational);
    }

    @NonNull
    static ArrayList a(@NonNull List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G.a.f9592a);
        arrayList.add(G.a.f9594c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                    if (G.a.a(size, (Rational) it2.next(), M.c.f17201c)) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    static Rational c(int i11, boolean z11) {
        if (i11 == -1) {
            return null;
        }
        if (i11 == 0) {
            return z11 ? G.a.f9592a : G.a.f9593b;
        }
        if (i11 == 1) {
            return z11 ? G.a.f9594c : G.a.f9595d;
        }
        S.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i11);
        return null;
    }

    static HashMap d(@NonNull List list) {
        HashMap hashMap = new HashMap();
        Iterator it = a(list).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (G.a.a(size, rational, M.c.f17201c)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    @NonNull
    public static ArrayList e(@NonNull Q.b bVar, @NonNull List list, Size size, int i11, @NonNull Rational rational, int i12, int i13) {
        Q.a b11 = bVar.b();
        HashMap d11 = d(list);
        boolean z11 = rational == null || rational.getNumerator() >= rational.getDenominator();
        b11.getClass();
        Rational c11 = c(0, z11);
        ArrayList arrayList = new ArrayList(d11.keySet());
        Collections.sort(arrayList, new a.C0199a(c11, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Rational rational2 = (Rational) it.next();
            linkedHashMap.put(rational2, (List) d11.get(rational2));
        }
        if (size != null) {
            Size size2 = M.c.f17199a;
            int height = size.getHeight() * size.getWidth();
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (it2.hasNext()) {
                List<Size> list2 = (List) linkedHashMap.get((Rational) it2.next());
                ArrayList arrayList2 = new ArrayList();
                for (Size size3 : list2) {
                    if (M.c.a(size3) <= height) {
                        arrayList2.add(size3);
                    }
                }
                list2.clear();
                list2.addAll(arrayList2);
            }
        }
        Q.c d12 = bVar.d();
        if (d12 != null) {
            Iterator it3 = linkedHashMap.keySet().iterator();
            while (it3.hasNext()) {
                List list3 = (List) linkedHashMap.get((Rational) it3.next());
                if (!list3.isEmpty()) {
                    int b12 = d12.b();
                    if (!d12.equals(Q.c.f22733c)) {
                        Size a11 = d12.a();
                        if (b12 == 0) {
                            boolean contains = list3.contains(a11);
                            list3.clear();
                            if (contains) {
                                list3.add(a11);
                            }
                        } else if (b12 == 1) {
                            f(list3, a11, true);
                        } else if (b12 == 2) {
                            f(list3, a11, false);
                        } else if (b12 == 3) {
                            g(list3, a11, true);
                        } else if (b12 == 4) {
                            g(list3, a11, false);
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = linkedHashMap.values().iterator();
        while (it4.hasNext()) {
            for (Size size4 : (List) it4.next()) {
                if (!arrayList3.contains(size4)) {
                    arrayList3.add(size4);
                }
            }
        }
        C c12 = bVar.c();
        if (c12 == null) {
            return arrayList3;
        }
        G.c.b(G.c.f(i11), i12, i13 == 1);
        ArrayList arrayList4 = new ArrayList(new ArrayList(arrayList3));
        Size size5 = (Size) c12.f3099a;
        if (arrayList4.contains(size5)) {
            arrayList4.remove(size5);
            arrayList4.add(0, size5);
        }
        if (arrayList3.containsAll(arrayList4)) {
            return arrayList4;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    static void f(@NonNull List<Size> list, @NonNull Size size, boolean z11) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z11) {
            list.addAll(arrayList);
        }
    }

    private static void g(@NonNull List<Size> list, @NonNull Size size, boolean z11) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Size size2 = list.get(i11);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z11) {
            list.addAll(arrayList);
        }
    }

    @NonNull
    public final List<Size> b(@NonNull b1<?> b1Var) {
        Size[] sizeArr;
        InterfaceC5102k0 interfaceC5102k0 = (InterfaceC5102k0) b1Var;
        ArrayList y11 = interfaceC5102k0.y();
        if (y11 != null) {
            return y11;
        }
        Q.b E11 = interfaceC5102k0.E();
        List<Pair> D11 = interfaceC5102k0.D();
        int i11 = b1Var.i();
        if (D11 != null) {
            for (Pair pair : D11) {
                if (((Integer) pair.first).intValue() == i11) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        List<Size> asList = sizeArr != null ? Arrays.asList(sizeArr) : null;
        H h11 = this.f12642a;
        if (asList == null) {
            asList = h11.m(i11);
        }
        ArrayList arrayList = new ArrayList(asList);
        Collections.sort(arrayList, new G.e(true));
        if (arrayList.isEmpty()) {
            S.k("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i11 + ".");
        }
        if (E11 == null) {
            return this.f12646e.b(arrayList, b1Var);
        }
        Size q11 = ((InterfaceC5102k0) b1Var).q();
        int m11 = interfaceC5102k0.m();
        if (!b1Var.j()) {
            int i12 = b1Var.i();
            if (E11.a() == 1) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(arrayList);
                arrayList2.addAll(h11.j(i12));
                Collections.sort(arrayList2, new G.e(true));
                arrayList = arrayList2;
            }
        }
        return e(interfaceC5102k0.k(), arrayList, q11, m11, this.f12645d, this.f12643b, this.f12644c);
    }
}
