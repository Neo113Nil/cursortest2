package J;

import G.a;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f12647a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12648b;

    /* renamed from: c, reason: collision with root package name */
    private final Rational f12649c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12650d;

    l(@NonNull H h11, Rational rational) {
        this.f12647a = h11.i();
        this.f12648b = h11.e();
        this.f12649c = rational;
        boolean z11 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z11 = false;
        }
        this.f12650d = z11;
    }

    private Size a(@NonNull InterfaceC5102k0 interfaceC5102k0) {
        int m11 = interfaceC5102k0.m();
        Size n11 = interfaceC5102k0.n();
        if (n11 != null) {
            int b11 = G.c.b(G.c.f(m11), this.f12647a, 1 == this.f12648b);
            if (b11 == 90 || b11 == 270) {
                return new Size(n11.getHeight(), n11.getWidth());
            }
        }
        return n11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (M.c.a(r3) < (r2.getHeight() * r2.getWidth())) goto L9;
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List b(@NonNull ArrayList arrayList, @NonNull b1 b1Var) {
        Rational rational;
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new G.e(true));
        ArrayList arrayList3 = new ArrayList();
        InterfaceC5102k0 interfaceC5102k0 = (InterfaceC5102k0) b1Var;
        Size q11 = interfaceC5102k0.q();
        Size size = (Size) arrayList2.get(0);
        if (q11 != null) {
        }
        q11 = size;
        Size a11 = a(interfaceC5102k0);
        Size size2 = M.c.f17201c;
        int a12 = M.c.a(size2);
        if (M.c.a(q11) < a12) {
            size2 = M.c.f17199a;
        } else if (a11 != null) {
            if (a11.getHeight() * a11.getWidth() < a12) {
                size2 = a11;
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Size size3 = (Size) it.next();
            if (M.c.a(size3) <= q11.getHeight() * q11.getWidth()) {
                if (size3.getHeight() * size3.getWidth() >= M.c.a(size2) && !arrayList3.contains(size3)) {
                    arrayList3.add(size3);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + q11 + "\ninitial size list: " + arrayList2);
        }
        if (interfaceC5102k0.J()) {
            rational = k.c(interfaceC5102k0.K(), this.f12650d);
        } else {
            Size a13 = a(interfaceC5102k0);
            if (a13 != null) {
                Iterator it2 = k.a(arrayList3).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        rational = new Rational(a13.getWidth(), a13.getHeight());
                        break;
                    }
                    Rational rational2 = (Rational) it2.next();
                    if (G.a.a(a13, rational2, M.c.f17201c)) {
                        rational = rational2;
                        break;
                    }
                }
            } else {
                rational = null;
            }
        }
        if (a11 == null) {
            a11 = interfaceC5102k0.F();
        }
        ArrayList arrayList4 = new ArrayList();
        new HashMap();
        if (rational == null) {
            arrayList4.addAll(arrayList3);
            if (a11 != null) {
                k.f(arrayList4, a11, true);
                return arrayList4;
            }
        } else {
            HashMap d11 = k.d(arrayList3);
            if (a11 != null) {
                Iterator it3 = d11.keySet().iterator();
                while (it3.hasNext()) {
                    k.f((List) d11.get((Rational) it3.next()), a11, true);
                }
            }
            ArrayList arrayList5 = new ArrayList(d11.keySet());
            Collections.sort(arrayList5, new a.C0199a(rational, this.f12649c));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                for (Size size4 : (List) d11.get((Rational) it4.next())) {
                    if (!arrayList4.contains(size4)) {
                        arrayList4.add(size4);
                    }
                }
            }
        }
        return arrayList4;
    }
}
