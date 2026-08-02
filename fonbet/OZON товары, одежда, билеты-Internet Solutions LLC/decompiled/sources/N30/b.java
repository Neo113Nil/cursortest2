package N30;

import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<a, c> f18668a;

    public b(@NotNull Map<a, c> widgets) {
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        this.f18668a = widgets;
    }

    @NotNull
    public final Map<a, c> a() {
        return this.f18668a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f18668a, ((b) obj).f18668a);
    }

    public final int hashCode() {
        return this.f18668a.hashCode();
    }

    @NotNull
    public final String toString() {
        return P.f(new StringBuilder("WidgetConfig(widgets="), this.f18668a, ")");
    }
}
