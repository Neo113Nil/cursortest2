package Bl0;

import Am.C2438a;
import B0.A0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class j0 {
    public static final void a(int i11, List list) {
        int size = list.size();
        if (i11 < 0 || i11 >= size) {
            throw new IndexOutOfBoundsException(Cm.e.c("Index ", i11, " is out of bounds. The list has ", " elements.", size));
        }
    }

    public static final void b(int i11, int i12, List list) {
        int size = list.size();
        if (i11 > i12) {
            throw new IllegalArgumentException(Cm.e.c("Indices are out of order. fromIndex (", i11, ") is greater than toIndex (", ").", i12));
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(T7.E.a(i11, "fromIndex (", ") is less than 0."));
        }
        if (i12 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is more than than the list size (" + size + ')');
    }

    public static final void c(ArrayList arrayList, Function1 function1) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
            it.remove();
        }
    }

    public static final void d(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(A0.a(i11, i12, "index: ", ", size: "));
        }
    }

    public static final void e(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(A0.a(i11, i12, "index: ", ", size: "));
        }
    }

    public static final void f(int i11, int i12, int i13) {
        if (i11 < 0 || i12 > i13) {
            StringBuilder a11 = C2438a.a("fromIndex: ", i11, ", toIndex: ", ", size: ", i12);
            a11.append(i13);
            throw new IndexOutOfBoundsException(a11.toString());
        }
        if (i11 > i12) {
            throw new IllegalArgumentException(A0.a(i11, i12, "fromIndex: ", " > toIndex: "));
        }
    }
}
