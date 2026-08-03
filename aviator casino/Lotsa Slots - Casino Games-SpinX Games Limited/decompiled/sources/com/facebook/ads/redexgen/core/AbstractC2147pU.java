package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.pU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2147pU {
    public static java.lang.String[] A00 = {"WYbfQWuNAjMhMignGLPBKOO7t37dd6pm", "aU7tMP21nVkp4lxoHIMaaJjXF", "KfRhaqKZcjkewaNyxSPNTetlEHftSMTF", "LloEdWhimr4Sj9kwGGxmGk8", "ZUp1YfD37WiDDWuGnJxBVJeZNuRjo", "b9uampRf3yYNP3BKa", "TYkujE9wMI8l0e1bGcChqn19YW9nXTi", "MiH9fLUFy6MgEc5RrTOKVqlzeB7MpQo7"};

    public static int A00(@javax.annotation.CheckForNull java.util.List<?> list, java.lang.Object element) {
        if (list instanceof java.util.RandomAccess) {
            return A02(list, element);
        }
        java.util.ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (com.facebook.ads.redexgen.core.CB.A01(element, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int A01(@javax.annotation.CheckForNull java.util.List<?> list, java.lang.Object element) {
        if (list instanceof java.util.RandomAccess) {
            return A03(list, element);
        }
        java.util.ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (com.facebook.ads.redexgen.core.CB.A01(element, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int A02(@javax.annotation.CheckForNull java.util.List<?> list, java.lang.Object element) {
        int size = list.size();
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (list.get(i) == null) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (element.equals(list.get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public static int A03(@javax.annotation.CheckForNull java.util.List<?> list, java.lang.Object element) {
        if (element == null) {
            int size = list.size();
            if (A00[2].charAt(2) == 'd') {
                throw new java.lang.RuntimeException();
            }
            A00[6] = "sSXsk6OcN1QGC";
            for (int i = size - 1; i >= 0; i--) {
                if (list.get(i) == null) {
                    return i;
                }
            }
            return -1;
        }
        int i2 = list.size();
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (element.equals(list.get(i3))) {
                return i3;
            }
        }
        return -1;
    }

    public static <E> java.util.ArrayList<E> A04() {
        return new java.util.ArrayList<>();
    }

    public static <E> java.util.ArrayList<E> A05(java.util.Iterator<? extends E> elements) {
        java.util.ArrayList<E> list = A04();
        com.facebook.ads.redexgen.core.AbstractC2126p9.A0A(list, elements);
        return list;
    }

    public static boolean A06(@javax.annotation.CheckForNull java.util.List<?> thisList, java.lang.Object other) {
        if (other == com.facebook.ads.redexgen.core.AbstractC1866ki.A04(thisList)) {
            return true;
        }
        if (!(other instanceof java.util.List)) {
            return false;
        }
        java.util.List list = (java.util.List) other;
        int size = thisList.size();
        if (size != list.size()) {
            return false;
        }
        boolean z = thisList instanceof java.util.RandomAccess;
        if (A00[7].charAt(4) == 'F') {
            throw new java.lang.RuntimeException();
        }
        A00[0] = "rcHl15RocZyTXvjAlguJbKcz1P7sPU36";
        if (z && (list instanceof java.util.RandomAccess)) {
            for (int i = 0; i < size; i++) {
                if (!com.facebook.ads.redexgen.core.CB.A01(thisList.get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return com.facebook.ads.redexgen.core.AbstractC2126p9.A0F(thisList.iterator(), list.iterator());
    }
}
