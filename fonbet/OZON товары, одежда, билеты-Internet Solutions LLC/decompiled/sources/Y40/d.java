package Y40;

import android.graphics.Rect;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<RecyclerItem> f34590a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rect f34591b;

    public d(@NotNull Rect padding, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f34590a = list;
        this.f34591b = padding;
    }

    @NotNull
    public final List<RecyclerItem> a() {
        return this.f34590a;
    }

    @NotNull
    public final Rect b() {
        return this.f34591b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f34590a, dVar.f34590a) && Intrinsics.d(this.f34591b, dVar.f34591b);
    }

    public final int hashCode() {
        return this.f34591b.hashCode() + (this.f34590a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "WidgetsItem(list=" + this.f34590a + ", padding=" + this.f34591b + ")";
    }
}
