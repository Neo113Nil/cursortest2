package HZ;

import GZ.j;
import GZ.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f10773a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f10774b;

    public f(@NotNull c cache, @NotNull k routeFactory) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
        this.f10773a = cache;
        this.f10774b = routeFactory;
    }

    @Override // HZ.e
    public final JZ.a a(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        j b11 = k.b(this.f10774b, deeplink, null, 6);
        if (b11 != null) {
            IZ.a b12 = this.f10773a.b(b11);
            if (b12 instanceof IZ.b) {
                return ((IZ.b) b12).getPageInfo();
            }
        }
        return null;
    }
}
