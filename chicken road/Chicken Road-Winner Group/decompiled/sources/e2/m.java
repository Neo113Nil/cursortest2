package e2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m extends l {
    public static void V(ArrayList arrayList, List elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        arrayList.addAll(elements);
    }

    public static void W(Collection collection, Object[] elements) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        kotlin.jvm.internal.j.e(elements, "elements");
        List asList = Arrays.asList(elements);
        kotlin.jvm.internal.j.d(asList, "asList(...)");
        collection.addAll(asList);
    }
}
