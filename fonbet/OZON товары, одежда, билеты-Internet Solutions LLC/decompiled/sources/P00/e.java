package P00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final ForkJoinPool f21469a = ForkJoinPool.commonPool();

    @NotNull
    public final ArrayList a(@NotNull ArrayList tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        List invokeAll = this.f21469a.invokeAll(tasks);
        Intrinsics.checkNotNullExpressionValue(invokeAll, "invokeAll(...)");
        List list = invokeAll;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Future) it.next()).get());
        }
        return arrayList;
    }
}
