package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* renamed from: com.google.android.gms.internal.play_billing.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0359p {

    /* renamed from: a, reason: collision with root package name */
    public static final Collector f5232a;

    static {
        final int i2 = 0;
        final int i3 = 0;
        final int i6 = 1;
        final int i7 = 1;
        f5232a = Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i2) {
                    case 0:
                        return new C0385y();
                    case 1:
                        return new G();
                    default:
                        return new E();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ((C0385y) obj).a(obj2);
                        return;
                    case 1:
                        G g6 = (G) obj;
                        g6.getClass();
                        obj2.getClass();
                        g6.a(obj2);
                        return;
                    default:
                        E e3 = (E) obj;
                        P p5 = (P) obj2;
                        e3.getClass();
                        if (p5.f5089a.equals(p5.f5090b)) {
                            throw new IllegalArgumentException(AbstractC0325d1.g("range must not be empty, but was %s", p5));
                        }
                        e3.f5041a.add(p5);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i6) {
                    case 0:
                        E e3 = (E) obj;
                        e3.getClass();
                        Iterator it = ((E) obj2).f5041a.iterator();
                        while (it.hasNext()) {
                            P p5 = (P) it.next();
                            if (p5.f5089a.equals(p5.f5090b)) {
                                throw new IllegalArgumentException(AbstractC0325d1.g("range must not be empty, but was %s", p5));
                            }
                            e3.f5041a.add(p5);
                        }
                        return e3;
                    case 1:
                        C0385y c0385y = (C0385y) obj;
                        C0385y c0385y2 = (C0385y) obj2;
                        Object[] objArr = c0385y2.f5272a;
                        int i8 = c0385y2.f5273b;
                        for (int i9 = 0; i9 < i8; i9++) {
                            c0385y.getClass();
                            if (objArr[i9] == null) {
                                throw new NullPointerException(AbstractC0279e.d(i9, "at index "));
                            }
                        }
                        c0385y.c(i8);
                        System.arraycopy(objArr, 0, c0385y.f5272a, c0385y.f5273b, i8);
                        c0385y.f5273b += i8;
                        return c0385y;
                    default:
                        G g6 = (G) obj;
                        G g7 = (G) obj2;
                        Object[] objArr2 = g7.f5272a;
                        int i10 = g7.f5273b;
                        for (int i11 = 0; i11 < i10; i11++) {
                            g6.getClass();
                            if (objArr2[i11] == null) {
                                throw new NullPointerException(AbstractC0279e.d(i11, "at index "));
                            }
                        }
                        g6.c(i10);
                        System.arraycopy(objArr2, 0, g6.f5272a, g6.f5273b, i10);
                        g6.f5273b += i10;
                        return g6;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n
            /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0136 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int length;
                int b6;
                P p5;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = ((E) obj).f5041a;
                        int size = arrayList.size();
                        AbstractC0325d1.j(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, O.f5086a);
                        Iterator it = arrayList.iterator();
                        J j2 = it instanceof J ? (J) it : new J(it);
                        int i8 = 0;
                        while (j2.hasNext()) {
                            P p6 = (P) j2.next();
                            while (j2.hasNext()) {
                                if (!j2.f5068b) {
                                    j2.f5069c = j2.f5067a.next();
                                    j2.f5068b = true;
                                }
                                P p7 = (P) j2.f5069c;
                                if (p6.f5089a.a(p7.f5090b) <= 0) {
                                    AbstractC0376v abstractC0376v = p7.f5089a;
                                    AbstractC0376v abstractC0376v2 = p6.f5090b;
                                    if (abstractC0376v.a(abstractC0376v2) <= 0) {
                                        AbstractC0376v abstractC0376v3 = p6.f5089a;
                                        int a6 = abstractC0376v3.a(abstractC0376v);
                                        AbstractC0376v abstractC0376v4 = p7.f5090b;
                                        int a7 = abstractC0376v2.a(abstractC0376v4);
                                        if (a6 >= 0 && a7 <= 0) {
                                            p5 = p6;
                                        } else if (a6 > 0 || a7 < 0) {
                                            if (a6 >= 0) {
                                                abstractC0376v = abstractC0376v3;
                                            }
                                            if (a7 <= 0) {
                                                abstractC0376v4 = abstractC0376v2;
                                            }
                                            if (!(abstractC0376v.a(abstractC0376v4) <= 0)) {
                                                throw new IllegalArgumentException(AbstractC0325d1.g("intersection is undefined for disconnected ranges %s and %s", p6, p7));
                                            }
                                            p5 = new P(abstractC0376v, abstractC0376v4);
                                        } else {
                                            p5 = p7;
                                        }
                                        if (!p5.f5089a.equals(p5.f5090b)) {
                                            throw new IllegalArgumentException(AbstractC0325d1.g("Overlapping ranges not permitted but found %s overlapping %s", p6, p7));
                                        }
                                        P p8 = (P) j2.next();
                                        int a8 = abstractC0376v3.a(p8.f5089a);
                                        int a9 = abstractC0376v2.a(p8.f5090b);
                                        if (a8 > 0 || a9 < 0) {
                                            if (a8 < 0 || a9 > 0) {
                                                if (a8 > 0) {
                                                    abstractC0376v3 = p8.f5089a;
                                                }
                                                if (a9 < 0) {
                                                    p6 = p8;
                                                }
                                                p8 = new P(abstractC0376v3, p6.f5090b);
                                            }
                                            p6 = p8;
                                        }
                                    }
                                }
                                p6.getClass();
                                length = objArr.length;
                                int i9 = i8 + 1;
                                b6 = AbstractC0379w.b(length, i9);
                                if (b6 <= length) {
                                    objArr = Arrays.copyOf(objArr, b6);
                                }
                                objArr[i8] = p6;
                                i8 = i9;
                            }
                            p6.getClass();
                            length = objArr.length;
                            int i92 = i8 + 1;
                            b6 = AbstractC0379w.b(length, i92);
                            if (b6 <= length) {
                            }
                            objArr[i8] = p6;
                            i8 = i92;
                        }
                        S j6 = C.j(i8, objArr);
                        if (j6.isEmpty()) {
                            return F.f5044b;
                        }
                        if (j6.f5102d == 1) {
                            C0388z l2 = j6.l(0);
                            Object next = l2.next();
                            if (l2.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i10 = 0; i10 < 4 && l2.hasNext(); i10++) {
                                    sb.append(", ");
                                    sb.append(l2.next());
                                }
                                if (l2.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((P) next).equals(P.f5088c)) {
                                return F.f5045c;
                            }
                        }
                        return new F(j6);
                    case 1:
                        C0385y c0385y = (C0385y) obj;
                        c0385y.f5274c = true;
                        return C.j(c0385y.f5273b, c0385y.f5272a);
                    default:
                        G g6 = (G) obj;
                        int i11 = g6.f5273b;
                        if (i11 == 0) {
                            return Y.f5136i;
                        }
                        if (i11 == 1) {
                            Object obj2 = g6.f5272a[0];
                            Objects.requireNonNull(obj2);
                            return new C0315a0(obj2);
                        }
                        H j7 = H.j(i11, g6.f5272a);
                        g6.f5273b = j7.size();
                        g6.f5274c = true;
                        return j7;
                }
            }
        }, new Collector.Characteristics[0]);
        final int i8 = 1;
        final int i9 = 1;
        final int i10 = 2;
        final int i11 = 2;
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i8) {
                    case 0:
                        return new C0385y();
                    case 1:
                        return new G();
                    default:
                        return new E();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i9) {
                    case 0:
                        ((C0385y) obj).a(obj2);
                        return;
                    case 1:
                        G g6 = (G) obj;
                        g6.getClass();
                        obj2.getClass();
                        g6.a(obj2);
                        return;
                    default:
                        E e3 = (E) obj;
                        P p5 = (P) obj2;
                        e3.getClass();
                        if (p5.f5089a.equals(p5.f5090b)) {
                            throw new IllegalArgumentException(AbstractC0325d1.g("range must not be empty, but was %s", p5));
                        }
                        e3.f5041a.add(p5);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        E e3 = (E) obj;
                        e3.getClass();
                        Iterator it = ((E) obj2).f5041a.iterator();
                        while (it.hasNext()) {
                            P p5 = (P) it.next();
                            if (p5.f5089a.equals(p5.f5090b)) {
                                throw new IllegalArgumentException(AbstractC0325d1.g("range must not be empty, but was %s", p5));
                            }
                            e3.f5041a.add(p5);
                        }
                        return e3;
                    case 1:
                        C0385y c0385y = (C0385y) obj;
                        C0385y c0385y2 = (C0385y) obj2;
                        Object[] objArr = c0385y2.f5272a;
                        int i82 = c0385y2.f5273b;
                        for (int i92 = 0; i92 < i82; i92++) {
                            c0385y.getClass();
                            if (objArr[i92] == null) {
                                throw new NullPointerException(AbstractC0279e.d(i92, "at index "));
                            }
                        }
                        c0385y.c(i82);
                        System.arraycopy(objArr, 0, c0385y.f5272a, c0385y.f5273b, i82);
                        c0385y.f5273b += i82;
                        return c0385y;
                    default:
                        G g6 = (G) obj;
                        G g7 = (G) obj2;
                        Object[] objArr2 = g7.f5272a;
                        int i102 = g7.f5273b;
                        for (int i112 = 0; i112 < i102; i112++) {
                            g6.getClass();
                            if (objArr2[i112] == null) {
                                throw new NullPointerException(AbstractC0279e.d(i112, "at index "));
                            }
                        }
                        g6.c(i102);
                        System.arraycopy(objArr2, 0, g6.f5272a, g6.f5273b, i102);
                        g6.f5273b += i102;
                        return g6;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n
            /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0136 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int length;
                int b6;
                P p5;
                switch (i11) {
                    case 0:
                        ArrayList arrayList = ((E) obj).f5041a;
                        int size = arrayList.size();
                        AbstractC0325d1.j(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, O.f5086a);
                        Iterator it = arrayList.iterator();
                        J j2 = it instanceof J ? (J) it : new J(it);
                        int i82 = 0;
                        while (j2.hasNext()) {
                            P p6 = (P) j2.next();
                            while (j2.hasNext()) {
                                if (!j2.f5068b) {
                                    j2.f5069c = j2.f5067a.next();
                                    j2.f5068b = true;
                                }
                                P p7 = (P) j2.f5069c;
                                if (p6.f5089a.a(p7.f5090b) <= 0) {
                                    AbstractC0376v abstractC0376v = p7.f5089a;
                                    AbstractC0376v abstractC0376v2 = p6.f5090b;
                                    if (abstractC0376v.a(abstractC0376v2) <= 0) {
                                        AbstractC0376v abstractC0376v3 = p6.f5089a;
                                        int a6 = abstractC0376v3.a(abstractC0376v);
                                        AbstractC0376v abstractC0376v4 = p7.f5090b;
                                        int a7 = abstractC0376v2.a(abstractC0376v4);
                                        if (a6 >= 0 && a7 <= 0) {
                                            p5 = p6;
                                        } else if (a6 > 0 || a7 < 0) {
                                            if (a6 >= 0) {
                                                abstractC0376v = abstractC0376v3;
                                            }
                                            if (a7 <= 0) {
                                                abstractC0376v4 = abstractC0376v2;
                                            }
                                            if (!(abstractC0376v.a(abstractC0376v4) <= 0)) {
                                                throw new IllegalArgumentException(AbstractC0325d1.g("intersection is undefined for disconnected ranges %s and %s", p6, p7));
                                            }
                                            p5 = new P(abstractC0376v, abstractC0376v4);
                                        } else {
                                            p5 = p7;
                                        }
                                        if (!p5.f5089a.equals(p5.f5090b)) {
                                            throw new IllegalArgumentException(AbstractC0325d1.g("Overlapping ranges not permitted but found %s overlapping %s", p6, p7));
                                        }
                                        P p8 = (P) j2.next();
                                        int a8 = abstractC0376v3.a(p8.f5089a);
                                        int a9 = abstractC0376v2.a(p8.f5090b);
                                        if (a8 > 0 || a9 < 0) {
                                            if (a8 < 0 || a9 > 0) {
                                                if (a8 > 0) {
                                                    abstractC0376v3 = p8.f5089a;
                                                }
                                                if (a9 < 0) {
                                                    p6 = p8;
                                                }
                                                p8 = new P(abstractC0376v3, p6.f5090b);
                                            }
                                            p6 = p8;
                                        }
                                    }
                                }
                                p6.getClass();
                                length = objArr.length;
                                int i92 = i82 + 1;
                                b6 = AbstractC0379w.b(length, i92);
                                if (b6 <= length) {
                                    objArr = Arrays.copyOf(objArr, b6);
                                }
                                objArr[i82] = p6;
                                i82 = i92;
                            }
                            p6.getClass();
                            length = objArr.length;
                            int i922 = i82 + 1;
                            b6 = AbstractC0379w.b(length, i922);
                            if (b6 <= length) {
                            }
                            objArr[i82] = p6;
                            i82 = i922;
                        }
                        S j6 = C.j(i82, objArr);
                        if (j6.isEmpty()) {
                            return F.f5044b;
                        }
                        if (j6.f5102d == 1) {
                            C0388z l2 = j6.l(0);
                            Object next = l2.next();
                            if (l2.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i102 = 0; i102 < 4 && l2.hasNext(); i102++) {
                                    sb.append(", ");
                                    sb.append(l2.next());
                                }
                                if (l2.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((P) next).equals(P.f5088c)) {
                                return F.f5045c;
                            }
                        }
                        return new F(j6);
                    case 1:
                        C0385y c0385y = (C0385y) obj;
                        c0385y.f5274c = true;
                        return C.j(c0385y.f5273b, c0385y.f5272a);
                    default:
                        G g6 = (G) obj;
                        int i112 = g6.f5273b;
                        if (i112 == 0) {
                            return Y.f5136i;
                        }
                        if (i112 == 1) {
                            Object obj2 = g6.f5272a[0];
                            Objects.requireNonNull(obj2);
                            return new C0315a0(obj2);
                        }
                        H j7 = H.j(i112, g6.f5272a);
                        g6.f5273b = j7.size();
                        g6.f5274c = true;
                        return j7;
                }
            }
        }, new Collector.Characteristics[0]);
        final int i12 = 2;
        final int i13 = 2;
        final int i14 = 0;
        final int i15 = 0;
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i12) {
                    case 0:
                        return new C0385y();
                    case 1:
                        return new G();
                    default:
                        return new E();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        ((C0385y) obj).a(obj2);
                        return;
                    case 1:
                        G g6 = (G) obj;
                        g6.getClass();
                        obj2.getClass();
                        g6.a(obj2);
                        return;
                    default:
                        E e3 = (E) obj;
                        P p5 = (P) obj2;
                        e3.getClass();
                        if (p5.f5089a.equals(p5.f5090b)) {
                            throw new IllegalArgumentException(AbstractC0325d1.g("range must not be empty, but was %s", p5));
                        }
                        e3.f5041a.add(p5);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        E e3 = (E) obj;
                        e3.getClass();
                        Iterator it = ((E) obj2).f5041a.iterator();
                        while (it.hasNext()) {
                            P p5 = (P) it.next();
                            if (p5.f5089a.equals(p5.f5090b)) {
                                throw new IllegalArgumentException(AbstractC0325d1.g("range must not be empty, but was %s", p5));
                            }
                            e3.f5041a.add(p5);
                        }
                        return e3;
                    case 1:
                        C0385y c0385y = (C0385y) obj;
                        C0385y c0385y2 = (C0385y) obj2;
                        Object[] objArr = c0385y2.f5272a;
                        int i82 = c0385y2.f5273b;
                        for (int i92 = 0; i92 < i82; i92++) {
                            c0385y.getClass();
                            if (objArr[i92] == null) {
                                throw new NullPointerException(AbstractC0279e.d(i92, "at index "));
                            }
                        }
                        c0385y.c(i82);
                        System.arraycopy(objArr, 0, c0385y.f5272a, c0385y.f5273b, i82);
                        c0385y.f5273b += i82;
                        return c0385y;
                    default:
                        G g6 = (G) obj;
                        G g7 = (G) obj2;
                        Object[] objArr2 = g7.f5272a;
                        int i102 = g7.f5273b;
                        for (int i112 = 0; i112 < i102; i112++) {
                            g6.getClass();
                            if (objArr2[i112] == null) {
                                throw new NullPointerException(AbstractC0279e.d(i112, "at index "));
                            }
                        }
                        g6.c(i102);
                        System.arraycopy(objArr2, 0, g6.f5272a, g6.f5273b, i102);
                        g6.f5273b += i102;
                        return g6;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n
            /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0136 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int length;
                int b6;
                P p5;
                switch (i15) {
                    case 0:
                        ArrayList arrayList = ((E) obj).f5041a;
                        int size = arrayList.size();
                        AbstractC0325d1.j(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, O.f5086a);
                        Iterator it = arrayList.iterator();
                        J j2 = it instanceof J ? (J) it : new J(it);
                        int i82 = 0;
                        while (j2.hasNext()) {
                            P p6 = (P) j2.next();
                            while (j2.hasNext()) {
                                if (!j2.f5068b) {
                                    j2.f5069c = j2.f5067a.next();
                                    j2.f5068b = true;
                                }
                                P p7 = (P) j2.f5069c;
                                if (p6.f5089a.a(p7.f5090b) <= 0) {
                                    AbstractC0376v abstractC0376v = p7.f5089a;
                                    AbstractC0376v abstractC0376v2 = p6.f5090b;
                                    if (abstractC0376v.a(abstractC0376v2) <= 0) {
                                        AbstractC0376v abstractC0376v3 = p6.f5089a;
                                        int a6 = abstractC0376v3.a(abstractC0376v);
                                        AbstractC0376v abstractC0376v4 = p7.f5090b;
                                        int a7 = abstractC0376v2.a(abstractC0376v4);
                                        if (a6 >= 0 && a7 <= 0) {
                                            p5 = p6;
                                        } else if (a6 > 0 || a7 < 0) {
                                            if (a6 >= 0) {
                                                abstractC0376v = abstractC0376v3;
                                            }
                                            if (a7 <= 0) {
                                                abstractC0376v4 = abstractC0376v2;
                                            }
                                            if (!(abstractC0376v.a(abstractC0376v4) <= 0)) {
                                                throw new IllegalArgumentException(AbstractC0325d1.g("intersection is undefined for disconnected ranges %s and %s", p6, p7));
                                            }
                                            p5 = new P(abstractC0376v, abstractC0376v4);
                                        } else {
                                            p5 = p7;
                                        }
                                        if (!p5.f5089a.equals(p5.f5090b)) {
                                            throw new IllegalArgumentException(AbstractC0325d1.g("Overlapping ranges not permitted but found %s overlapping %s", p6, p7));
                                        }
                                        P p8 = (P) j2.next();
                                        int a8 = abstractC0376v3.a(p8.f5089a);
                                        int a9 = abstractC0376v2.a(p8.f5090b);
                                        if (a8 > 0 || a9 < 0) {
                                            if (a8 < 0 || a9 > 0) {
                                                if (a8 > 0) {
                                                    abstractC0376v3 = p8.f5089a;
                                                }
                                                if (a9 < 0) {
                                                    p6 = p8;
                                                }
                                                p8 = new P(abstractC0376v3, p6.f5090b);
                                            }
                                            p6 = p8;
                                        }
                                    }
                                }
                                p6.getClass();
                                length = objArr.length;
                                int i922 = i82 + 1;
                                b6 = AbstractC0379w.b(length, i922);
                                if (b6 <= length) {
                                    objArr = Arrays.copyOf(objArr, b6);
                                }
                                objArr[i82] = p6;
                                i82 = i922;
                            }
                            p6.getClass();
                            length = objArr.length;
                            int i9222 = i82 + 1;
                            b6 = AbstractC0379w.b(length, i9222);
                            if (b6 <= length) {
                            }
                            objArr[i82] = p6;
                            i82 = i9222;
                        }
                        S j6 = C.j(i82, objArr);
                        if (j6.isEmpty()) {
                            return F.f5044b;
                        }
                        if (j6.f5102d == 1) {
                            C0388z l2 = j6.l(0);
                            Object next = l2.next();
                            if (l2.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i102 = 0; i102 < 4 && l2.hasNext(); i102++) {
                                    sb.append(", ");
                                    sb.append(l2.next());
                                }
                                if (l2.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((P) next).equals(P.f5088c)) {
                                return F.f5045c;
                            }
                        }
                        return new F(j6);
                    case 1:
                        C0385y c0385y = (C0385y) obj;
                        c0385y.f5274c = true;
                        return C.j(c0385y.f5273b, c0385y.f5272a);
                    default:
                        G g6 = (G) obj;
                        int i112 = g6.f5273b;
                        if (i112 == 0) {
                            return Y.f5136i;
                        }
                        if (i112 == 1) {
                            Object obj2 = g6.f5272a[0];
                            Objects.requireNonNull(obj2);
                            return new C0315a0(obj2);
                        }
                        H j7 = H.j(i112, g6.f5272a);
                        g6.f5273b = j7.size();
                        g6.f5274c = true;
                        return j7;
                }
            }
        }, new Collector.Characteristics[0]);
    }
}
