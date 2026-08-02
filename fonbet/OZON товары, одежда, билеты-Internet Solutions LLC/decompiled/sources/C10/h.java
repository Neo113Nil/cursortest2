package C10;

import T7.E;
import androidx.recyclerview.widget.RecyclerView;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f4331a;

    private /* synthetic */ h(Object obj) {
        this.f4331a = obj;
    }

    public static final /* synthetic */ h a(Object obj) {
        return new h(obj);
    }

    @NotNull
    public static Object b(@NotNull RecyclerView.n decoration) {
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        return decoration instanceof i ? ((i) decoration).a() : decoration.getClass();
    }

    public final /* synthetic */ Object c() {
        return this.f4331a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return Intrinsics.d(this.f4331a, ((h) obj).f4331a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4331a.hashCode();
    }

    public final String toString() {
        return E.c(this.f4331a, ")", new StringBuilder("DecoratorKey(key="));
    }
}
