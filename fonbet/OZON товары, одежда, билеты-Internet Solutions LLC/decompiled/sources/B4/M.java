package B4;

import B4.d0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class M extends J<L> {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final d0 f2543g;

    /* renamed from: h, reason: collision with root package name */
    private String f2544h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ArrayList f2545i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(@NotNull d0 provider, @NotNull String startDestination, String str) {
        super(provider.c(d0.a.a(O.class)), str);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        provider.getClass();
        Intrinsics.checkNotNullParameter(O.class, "navigatorClass");
        this.f2545i = new ArrayList();
        this.f2543g = provider;
        this.f2544h = startDestination;
    }

    @Override // B4.J
    @NotNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final L b() {
        L l11 = (L) super.b();
        ArrayList nodes = this.f2545i;
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        Iterator it = nodes.iterator();
        while (it.hasNext()) {
            H h11 = (H) it.next();
            if (h11 != null) {
                l11.A(h11);
            }
        }
        String str = this.f2544h;
        if (str != null) {
            l11.K(str);
            return l11;
        }
        if (d() != null) {
            throw new IllegalStateException("You must set a start destination route");
        }
        throw new IllegalStateException("You must set a start destination id");
    }

    public final <D extends H> void g(@NotNull J<? extends D> navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "navDestination");
        this.f2545i.add(navDestination.b());
    }

    @NotNull
    public final d0 h() {
        return this.f2543g;
    }
}
