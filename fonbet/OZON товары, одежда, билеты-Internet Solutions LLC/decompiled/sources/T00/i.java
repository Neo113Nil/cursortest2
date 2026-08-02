package T00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f26472a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f26473b;

    public i(@NotNull String state, @NotNull m layout) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f26472a = state;
        this.f26473b = layout;
    }

    @NotNull
    public final m a() {
        return this.f26473b;
    }

    @NotNull
    public final String b() {
        return this.f26472a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.network.decode.model.RawJsonWidget");
        i iVar = (i) obj;
        return Intrinsics.d(this.f26472a, iVar.f26472a) && Intrinsics.d(this.f26473b, iVar.f26473b);
    }

    public final int hashCode() {
        return this.f26473b.hashCode() + (this.f26472a.hashCode() * 31);
    }
}
