package X3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r extends q {
    public static void T(List list, Comparator comparator) {
        kotlin.jvm.internal.l.f("<this>", list);
        kotlin.jvm.internal.l.f("comparator", comparator);
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
