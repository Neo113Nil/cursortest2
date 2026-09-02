package L0;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j extends i {
    public static void R(Collection collection, Object[] elements) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        kotlin.jvm.internal.j.e(elements, "elements");
        List asList = Arrays.asList(elements);
        kotlin.jvm.internal.j.d(asList, "asList(...)");
        collection.addAll(asList);
    }
}
