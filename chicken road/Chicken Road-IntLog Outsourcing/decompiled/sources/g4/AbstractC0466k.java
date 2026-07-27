package g4;

import java.util.ArrayList;
import java.util.List;

/* renamed from: g4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0466k extends K1.b {
    public static List A0(Object... elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return elements.length > 0 ? AbstractC0464i.M(elements) : C0471p.f5750a;
    }

    public static ArrayList B0(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0462g(objArr, true));
    }

    public static void C0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static int z0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        return list.size() - 1;
    }
}
