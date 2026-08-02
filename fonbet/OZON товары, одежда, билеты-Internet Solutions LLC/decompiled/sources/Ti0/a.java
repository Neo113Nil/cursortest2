package Ti0;

import B90.C2618u;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Hi0.a> f27191a;

    public a(@NotNull List<Hi0.a> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f27191a = menuItems;
    }

    @NotNull
    public final List<Hi0.a> a() {
        return this.f27191a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f27191a, ((a) obj).f27191a);
    }

    public final int hashCode() {
        return this.f27191a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C2618u.h(new StringBuilder("MainScreenUIState(menuItems="), this.f27191a, ")");
    }

    public a() {
        this(K.f71697a);
    }
}
