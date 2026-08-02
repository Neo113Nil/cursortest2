package WZ;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashSet<s> f33402a = new HashSet<>();

    public final void a() {
        this.f33402a.clear();
    }

    public final boolean b(@NotNull List<s> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Iterator<T> it = data.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 = this.f33402a.add((s) it.next());
        }
        return z11;
    }
}
