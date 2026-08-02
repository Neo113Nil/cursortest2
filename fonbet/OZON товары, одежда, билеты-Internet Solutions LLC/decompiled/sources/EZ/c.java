package EZ;

import ed.C6345a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<Class<? extends a<?>>, a<pZ.f>> f7724a;

    public c(@NotNull Collection<? extends a<?>> handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f7724a = new HashMap<>();
        a(handlers);
    }

    @Override // EZ.b
    public final void a(@NotNull Collection<? extends a<? extends pZ.f>> navigationHandlers) {
        Intrinsics.checkNotNullParameter(navigationHandlers, "navigationHandlers");
        Iterator<T> it = navigationHandlers.iterator();
        while (it.hasNext()) {
            c((a) it.next());
        }
    }

    @Override // EZ.b
    @NotNull
    public final a<pZ.f> b(@NotNull pZ.f destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Class b11 = C6345a.b(destination.getNavigator());
        a<pZ.f> aVar = this.f7724a.get(b11);
        if (aVar != null) {
            return aVar;
        }
        throw new NoSuchElementException(Sh.b.c("Not found navigator ", b11.getSimpleName(), " for ", destination.getClass().getSimpleName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@NotNull a<? extends pZ.f> navigationHandler) {
        Intrinsics.checkNotNullParameter(navigationHandler, "navigationHandler");
        this.f7724a.putIfAbsent(navigationHandler.getClass(), navigationHandler);
    }
}
