package com.google.android.gms.internal.play_billing;

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
public abstract class AbstractC0215p {

    /* renamed from: a, reason: collision with root package name */
    public static final Collector f2797a;

    static {
        final int i3 = 0;
        final int i4 = 0;
        final int i5 = 1;
        final int i6 = 1;
        f2797a = Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i3) {
                    case 0:
                        return new C0241y();
                    case 1:
                        return new G();
                    default:
                        return new E();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        ((C0241y) obj).a(obj2);
                        return;
                    case 1:
                        G g3 = (G) obj;
                        g3.getClass();
                        obj2.getClass();
                        g3.a(obj2);
                        return;
                    default:
                        E e3 = (E) obj;
                        O o3 = (O) obj2;
                        e3.getClass();
                        if (o3.f2663a.equals(o3.f2664b)) {
                            throw new IllegalArgumentException(AbstractC0181d1.f("range must not be empty, but was %s", o3));
                        }
                        e3.f2617a.add(o3);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i5) {
                    case 0:
                        E e3 = (E) obj;
                        e3.getClass();
                        Iterator it = ((E) obj2).f2617a.iterator();
                        while (it.hasNext()) {
                            O o3 = (O) it.next();
                            if (o3.f2663a.equals(o3.f2664b)) {
                                throw new IllegalArgumentException(AbstractC0181d1.f("range must not be empty, but was %s", o3));
                            }
                            e3.f2617a.add(o3);
                        }
                        return e3;
                    case 1:
                        C0241y c0241y = (C0241y) obj;
                        C0241y c0241y2 = (C0241y) obj2;
                        Object[] objArr = c0241y2.f2836a;
                        int i7 = c0241y2.f2837b;
                        for (int i8 = 0; i8 < i7; i8++) {
                            c0241y.getClass();
                            if (objArr[i8] == null) {
                                throw new NullPointerException(B0.c.h(i8, "at index "));
                            }
                        }
                        c0241y.c(i7);
                        System.arraycopy(objArr, 0, c0241y.f2836a, c0241y.f2837b, i7);
                        c0241y.f2837b += i7;
                        return c0241y;
                    default:
                        G g3 = (G) obj;
                        G g4 = (G) obj2;
                        Object[] objArr2 = g4.f2836a;
                        int i9 = g4.f2837b;
                        for (int i10 = 0; i10 < i9; i10++) {
                            g3.getClass();
                            if (objArr2[i10] == null) {
                                throw new NullPointerException(B0.c.h(i10, "at index "));
                            }
                        }
                        g3.c(i9);
                        System.arraycopy(objArr2, 0, g3.f2836a, g3.f2837b, i9);
                        g3.f2837b += i9;
                        return g3;
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
                int b3;
                O o3;
                switch (i6) {
                    case 0:
                        ArrayList arrayList = ((E) obj).f2617a;
                        int size = arrayList.size();
                        AbstractC0181d1.h(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, M.f2654c);
                        Iterator it = arrayList.iterator();
                        J j3 = it instanceof J ? (J) it : new J(it);
                        int i7 = 0;
                        while (j3.hasNext()) {
                            O o4 = (O) j3.next();
                            while (j3.hasNext()) {
                                if (!j3.f2643b) {
                                    j3.f2644c = j3.f2642a.next();
                                    j3.f2643b = true;
                                }
                                O o5 = (O) j3.f2644c;
                                if (o4.f2663a.a(o5.f2664b) <= 0) {
                                    AbstractC0232v abstractC0232v = o5.f2663a;
                                    AbstractC0232v abstractC0232v2 = o4.f2664b;
                                    if (abstractC0232v.a(abstractC0232v2) <= 0) {
                                        AbstractC0232v abstractC0232v3 = o4.f2663a;
                                        int a3 = abstractC0232v3.a(abstractC0232v);
                                        AbstractC0232v abstractC0232v4 = o5.f2664b;
                                        int a4 = abstractC0232v2.a(abstractC0232v4);
                                        if (a3 >= 0 && a4 <= 0) {
                                            o3 = o4;
                                        } else if (a3 > 0 || a4 < 0) {
                                            if (a3 >= 0) {
                                                abstractC0232v = abstractC0232v3;
                                            }
                                            if (a4 <= 0) {
                                                abstractC0232v4 = abstractC0232v2;
                                            }
                                            if (!(abstractC0232v.a(abstractC0232v4) <= 0)) {
                                                throw new IllegalArgumentException(AbstractC0181d1.f("intersection is undefined for disconnected ranges %s and %s", o4, o5));
                                            }
                                            o3 = new O(abstractC0232v, abstractC0232v4);
                                        } else {
                                            o3 = o5;
                                        }
                                        if (!o3.f2663a.equals(o3.f2664b)) {
                                            throw new IllegalArgumentException(AbstractC0181d1.f("Overlapping ranges not permitted but found %s overlapping %s", o4, o5));
                                        }
                                        O o6 = (O) j3.next();
                                        int a5 = abstractC0232v3.a(o6.f2663a);
                                        int a6 = abstractC0232v2.a(o6.f2664b);
                                        if (a5 > 0 || a6 < 0) {
                                            if (a5 < 0 || a6 > 0) {
                                                if (a5 > 0) {
                                                    abstractC0232v3 = o6.f2663a;
                                                }
                                                if (a6 < 0) {
                                                    o4 = o6;
                                                }
                                                o6 = new O(abstractC0232v3, o4.f2664b);
                                            }
                                            o4 = o6;
                                        }
                                    }
                                }
                                o4.getClass();
                                length = objArr.length;
                                int i8 = i7 + 1;
                                b3 = AbstractC0235w.b(length, i8);
                                if (b3 <= length) {
                                    objArr = Arrays.copyOf(objArr, b3);
                                }
                                objArr[i7] = o4;
                                i7 = i8;
                            }
                            o4.getClass();
                            length = objArr.length;
                            int i82 = i7 + 1;
                            b3 = AbstractC0235w.b(length, i82);
                            if (b3 <= length) {
                            }
                            objArr[i7] = o4;
                            i7 = i82;
                        }
                        Q j4 = C.j(i7, objArr);
                        if (j4.isEmpty()) {
                            return F.f2620b;
                        }
                        if (j4.f2668d == 1) {
                            C0244z l3 = j4.l(0);
                            Object next = l3.next();
                            if (l3.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i9 = 0; i9 < 4 && l3.hasNext(); i9++) {
                                    sb.append(", ");
                                    sb.append(l3.next());
                                }
                                if (l3.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((O) next).equals(O.f2662c)) {
                                return F.f2621c;
                            }
                        }
                        return new F(j4);
                    case 1:
                        C0241y c0241y = (C0241y) obj;
                        c0241y.f2838c = true;
                        return C.j(c0241y.f2837b, c0241y.f2836a);
                    default:
                        G g3 = (G) obj;
                        int i10 = g3.f2837b;
                        if (i10 == 0) {
                            return X.f2702i;
                        }
                        if (i10 == 1) {
                            Object obj2 = g3.f2836a[0];
                            Objects.requireNonNull(obj2);
                            return new Z(obj2);
                        }
                        H j5 = H.j(i10, g3.f2836a);
                        g3.f2837b = j5.size();
                        g3.f2838c = true;
                        return j5;
                }
            }
        }, new Collector.Characteristics[0]);
        final int i7 = 1;
        final int i8 = 1;
        final int i9 = 2;
        final int i10 = 2;
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i7) {
                    case 0:
                        return new C0241y();
                    case 1:
                        return new G();
                    default:
                        return new E();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i8) {
                    case 0:
                        ((C0241y) obj).a(obj2);
                        return;
                    case 1:
                        G g3 = (G) obj;
                        g3.getClass();
                        obj2.getClass();
                        g3.a(obj2);
                        return;
                    default:
                        E e3 = (E) obj;
                        O o3 = (O) obj2;
                        e3.getClass();
                        if (o3.f2663a.equals(o3.f2664b)) {
                            throw new IllegalArgumentException(AbstractC0181d1.f("range must not be empty, but was %s", o3));
                        }
                        e3.f2617a.add(o3);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i9) {
                    case 0:
                        E e3 = (E) obj;
                        e3.getClass();
                        Iterator it = ((E) obj2).f2617a.iterator();
                        while (it.hasNext()) {
                            O o3 = (O) it.next();
                            if (o3.f2663a.equals(o3.f2664b)) {
                                throw new IllegalArgumentException(AbstractC0181d1.f("range must not be empty, but was %s", o3));
                            }
                            e3.f2617a.add(o3);
                        }
                        return e3;
                    case 1:
                        C0241y c0241y = (C0241y) obj;
                        C0241y c0241y2 = (C0241y) obj2;
                        Object[] objArr = c0241y2.f2836a;
                        int i72 = c0241y2.f2837b;
                        for (int i82 = 0; i82 < i72; i82++) {
                            c0241y.getClass();
                            if (objArr[i82] == null) {
                                throw new NullPointerException(B0.c.h(i82, "at index "));
                            }
                        }
                        c0241y.c(i72);
                        System.arraycopy(objArr, 0, c0241y.f2836a, c0241y.f2837b, i72);
                        c0241y.f2837b += i72;
                        return c0241y;
                    default:
                        G g3 = (G) obj;
                        G g4 = (G) obj2;
                        Object[] objArr2 = g4.f2836a;
                        int i92 = g4.f2837b;
                        for (int i102 = 0; i102 < i92; i102++) {
                            g3.getClass();
                            if (objArr2[i102] == null) {
                                throw new NullPointerException(B0.c.h(i102, "at index "));
                            }
                        }
                        g3.c(i92);
                        System.arraycopy(objArr2, 0, g3.f2836a, g3.f2837b, i92);
                        g3.f2837b += i92;
                        return g3;
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
                int b3;
                O o3;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = ((E) obj).f2617a;
                        int size = arrayList.size();
                        AbstractC0181d1.h(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, M.f2654c);
                        Iterator it = arrayList.iterator();
                        J j3 = it instanceof J ? (J) it : new J(it);
                        int i72 = 0;
                        while (j3.hasNext()) {
                            O o4 = (O) j3.next();
                            while (j3.hasNext()) {
                                if (!j3.f2643b) {
                                    j3.f2644c = j3.f2642a.next();
                                    j3.f2643b = true;
                                }
                                O o5 = (O) j3.f2644c;
                                if (o4.f2663a.a(o5.f2664b) <= 0) {
                                    AbstractC0232v abstractC0232v = o5.f2663a;
                                    AbstractC0232v abstractC0232v2 = o4.f2664b;
                                    if (abstractC0232v.a(abstractC0232v2) <= 0) {
                                        AbstractC0232v abstractC0232v3 = o4.f2663a;
                                        int a3 = abstractC0232v3.a(abstractC0232v);
                                        AbstractC0232v abstractC0232v4 = o5.f2664b;
                                        int a4 = abstractC0232v2.a(abstractC0232v4);
                                        if (a3 >= 0 && a4 <= 0) {
                                            o3 = o4;
                                        } else if (a3 > 0 || a4 < 0) {
                                            if (a3 >= 0) {
                                                abstractC0232v = abstractC0232v3;
                                            }
                                            if (a4 <= 0) {
                                                abstractC0232v4 = abstractC0232v2;
                                            }
                                            if (!(abstractC0232v.a(abstractC0232v4) <= 0)) {
                                                throw new IllegalArgumentException(AbstractC0181d1.f("intersection is undefined for disconnected ranges %s and %s", o4, o5));
                                            }
                                            o3 = new O(abstractC0232v, abstractC0232v4);
                                        } else {
                                            o3 = o5;
                                        }
                                        if (!o3.f2663a.equals(o3.f2664b)) {
                                            throw new IllegalArgumentException(AbstractC0181d1.f("Overlapping ranges not permitted but found %s overlapping %s", o4, o5));
                                        }
                                        O o6 = (O) j3.next();
                                        int a5 = abstractC0232v3.a(o6.f2663a);
                                        int a6 = abstractC0232v2.a(o6.f2664b);
                                        if (a5 > 0 || a6 < 0) {
                                            if (a5 < 0 || a6 > 0) {
                                                if (a5 > 0) {
                                                    abstractC0232v3 = o6.f2663a;
                                                }
                                                if (a6 < 0) {
                                                    o4 = o6;
                                                }
                                                o6 = new O(abstractC0232v3, o4.f2664b);
                                            }
                                            o4 = o6;
                                        }
                                    }
                                }
                                o4.getClass();
                                length = objArr.length;
                                int i82 = i72 + 1;
                                b3 = AbstractC0235w.b(length, i82);
                                if (b3 <= length) {
                                    objArr = Arrays.copyOf(objArr, b3);
                                }
                                objArr[i72] = o4;
                                i72 = i82;
                            }
                            o4.getClass();
                            length = objArr.length;
                            int i822 = i72 + 1;
                            b3 = AbstractC0235w.b(length, i822);
                            if (b3 <= length) {
                            }
                            objArr[i72] = o4;
                            i72 = i822;
                        }
                        Q j4 = C.j(i72, objArr);
                        if (j4.isEmpty()) {
                            return F.f2620b;
                        }
                        if (j4.f2668d == 1) {
                            C0244z l3 = j4.l(0);
                            Object next = l3.next();
                            if (l3.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i92 = 0; i92 < 4 && l3.hasNext(); i92++) {
                                    sb.append(", ");
                                    sb.append(l3.next());
                                }
                                if (l3.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((O) next).equals(O.f2662c)) {
                                return F.f2621c;
                            }
                        }
                        return new F(j4);
                    case 1:
                        C0241y c0241y = (C0241y) obj;
                        c0241y.f2838c = true;
                        return C.j(c0241y.f2837b, c0241y.f2836a);
                    default:
                        G g3 = (G) obj;
                        int i102 = g3.f2837b;
                        if (i102 == 0) {
                            return X.f2702i;
                        }
                        if (i102 == 1) {
                            Object obj2 = g3.f2836a[0];
                            Objects.requireNonNull(obj2);
                            return new Z(obj2);
                        }
                        H j5 = H.j(i102, g3.f2836a);
                        g3.f2837b = j5.size();
                        g3.f2838c = true;
                        return j5;
                }
            }
        }, new Collector.Characteristics[0]);
        final int i11 = 2;
        final int i12 = 2;
        final int i13 = 0;
        final int i14 = 0;
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i11) {
                    case 0:
                        return new C0241y();
                    case 1:
                        return new G();
                    default:
                        return new E();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        ((C0241y) obj).a(obj2);
                        return;
                    case 1:
                        G g3 = (G) obj;
                        g3.getClass();
                        obj2.getClass();
                        g3.a(obj2);
                        return;
                    default:
                        E e3 = (E) obj;
                        O o3 = (O) obj2;
                        e3.getClass();
                        if (o3.f2663a.equals(o3.f2664b)) {
                            throw new IllegalArgumentException(AbstractC0181d1.f("range must not be empty, but was %s", o3));
                        }
                        e3.f2617a.add(o3);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        E e3 = (E) obj;
                        e3.getClass();
                        Iterator it = ((E) obj2).f2617a.iterator();
                        while (it.hasNext()) {
                            O o3 = (O) it.next();
                            if (o3.f2663a.equals(o3.f2664b)) {
                                throw new IllegalArgumentException(AbstractC0181d1.f("range must not be empty, but was %s", o3));
                            }
                            e3.f2617a.add(o3);
                        }
                        return e3;
                    case 1:
                        C0241y c0241y = (C0241y) obj;
                        C0241y c0241y2 = (C0241y) obj2;
                        Object[] objArr = c0241y2.f2836a;
                        int i72 = c0241y2.f2837b;
                        for (int i82 = 0; i82 < i72; i82++) {
                            c0241y.getClass();
                            if (objArr[i82] == null) {
                                throw new NullPointerException(B0.c.h(i82, "at index "));
                            }
                        }
                        c0241y.c(i72);
                        System.arraycopy(objArr, 0, c0241y.f2836a, c0241y.f2837b, i72);
                        c0241y.f2837b += i72;
                        return c0241y;
                    default:
                        G g3 = (G) obj;
                        G g4 = (G) obj2;
                        Object[] objArr2 = g4.f2836a;
                        int i92 = g4.f2837b;
                        for (int i102 = 0; i102 < i92; i102++) {
                            g3.getClass();
                            if (objArr2[i102] == null) {
                                throw new NullPointerException(B0.c.h(i102, "at index "));
                            }
                        }
                        g3.c(i92);
                        System.arraycopy(objArr2, 0, g3.f2836a, g3.f2837b, i92);
                        g3.f2837b += i92;
                        return g3;
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
                int b3;
                O o3;
                switch (i14) {
                    case 0:
                        ArrayList arrayList = ((E) obj).f2617a;
                        int size = arrayList.size();
                        AbstractC0181d1.h(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, M.f2654c);
                        Iterator it = arrayList.iterator();
                        J j3 = it instanceof J ? (J) it : new J(it);
                        int i72 = 0;
                        while (j3.hasNext()) {
                            O o4 = (O) j3.next();
                            while (j3.hasNext()) {
                                if (!j3.f2643b) {
                                    j3.f2644c = j3.f2642a.next();
                                    j3.f2643b = true;
                                }
                                O o5 = (O) j3.f2644c;
                                if (o4.f2663a.a(o5.f2664b) <= 0) {
                                    AbstractC0232v abstractC0232v = o5.f2663a;
                                    AbstractC0232v abstractC0232v2 = o4.f2664b;
                                    if (abstractC0232v.a(abstractC0232v2) <= 0) {
                                        AbstractC0232v abstractC0232v3 = o4.f2663a;
                                        int a3 = abstractC0232v3.a(abstractC0232v);
                                        AbstractC0232v abstractC0232v4 = o5.f2664b;
                                        int a4 = abstractC0232v2.a(abstractC0232v4);
                                        if (a3 >= 0 && a4 <= 0) {
                                            o3 = o4;
                                        } else if (a3 > 0 || a4 < 0) {
                                            if (a3 >= 0) {
                                                abstractC0232v = abstractC0232v3;
                                            }
                                            if (a4 <= 0) {
                                                abstractC0232v4 = abstractC0232v2;
                                            }
                                            if (!(abstractC0232v.a(abstractC0232v4) <= 0)) {
                                                throw new IllegalArgumentException(AbstractC0181d1.f("intersection is undefined for disconnected ranges %s and %s", o4, o5));
                                            }
                                            o3 = new O(abstractC0232v, abstractC0232v4);
                                        } else {
                                            o3 = o5;
                                        }
                                        if (!o3.f2663a.equals(o3.f2664b)) {
                                            throw new IllegalArgumentException(AbstractC0181d1.f("Overlapping ranges not permitted but found %s overlapping %s", o4, o5));
                                        }
                                        O o6 = (O) j3.next();
                                        int a5 = abstractC0232v3.a(o6.f2663a);
                                        int a6 = abstractC0232v2.a(o6.f2664b);
                                        if (a5 > 0 || a6 < 0) {
                                            if (a5 < 0 || a6 > 0) {
                                                if (a5 > 0) {
                                                    abstractC0232v3 = o6.f2663a;
                                                }
                                                if (a6 < 0) {
                                                    o4 = o6;
                                                }
                                                o6 = new O(abstractC0232v3, o4.f2664b);
                                            }
                                            o4 = o6;
                                        }
                                    }
                                }
                                o4.getClass();
                                length = objArr.length;
                                int i822 = i72 + 1;
                                b3 = AbstractC0235w.b(length, i822);
                                if (b3 <= length) {
                                    objArr = Arrays.copyOf(objArr, b3);
                                }
                                objArr[i72] = o4;
                                i72 = i822;
                            }
                            o4.getClass();
                            length = objArr.length;
                            int i8222 = i72 + 1;
                            b3 = AbstractC0235w.b(length, i8222);
                            if (b3 <= length) {
                            }
                            objArr[i72] = o4;
                            i72 = i8222;
                        }
                        Q j4 = C.j(i72, objArr);
                        if (j4.isEmpty()) {
                            return F.f2620b;
                        }
                        if (j4.f2668d == 1) {
                            C0244z l3 = j4.l(0);
                            Object next = l3.next();
                            if (l3.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i92 = 0; i92 < 4 && l3.hasNext(); i92++) {
                                    sb.append(", ");
                                    sb.append(l3.next());
                                }
                                if (l3.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((O) next).equals(O.f2662c)) {
                                return F.f2621c;
                            }
                        }
                        return new F(j4);
                    case 1:
                        C0241y c0241y = (C0241y) obj;
                        c0241y.f2838c = true;
                        return C.j(c0241y.f2837b, c0241y.f2836a);
                    default:
                        G g3 = (G) obj;
                        int i102 = g3.f2837b;
                        if (i102 == 0) {
                            return X.f2702i;
                        }
                        if (i102 == 1) {
                            Object obj2 = g3.f2836a[0];
                            Objects.requireNonNull(obj2);
                            return new Z(obj2);
                        }
                        H j5 = H.j(i102, g3.f2836a);
                        g3.f2837b = j5.size();
                        g3.f2838c = true;
                        return j5;
                }
            }
        }, new Collector.Characteristics[0]);
    }
}
