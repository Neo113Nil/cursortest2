package BZ;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashSet<a> f3319a;

    public b(@NotNull HashSet<a> handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f3319a = handlers;
    }

    public final void a(@NotNull Set<? extends a> handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f3319a.addAll(handlers);
    }

    public final boolean b(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        HashSet<a> hashSet = this.f3319a;
        if (hashSet.isEmpty()) {
            return false;
        }
        Iterator<a> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().canSwitchApp(miniAppName)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final a c(@NotNull String miniAppName) {
        Object obj;
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        Iterator<T> it = this.f3319a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a) obj).canSwitchApp(miniAppName)) {
                break;
            }
        }
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
