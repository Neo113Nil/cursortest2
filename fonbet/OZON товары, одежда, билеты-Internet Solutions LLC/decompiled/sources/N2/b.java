package N2;

import U7.C4056a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<C4056a> f18442a = new ArrayList<>();

    public final void a(@NotNull C4056a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f18442a.add(listener);
    }

    public final void b(@NotNull C4056a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f18442a.remove(listener);
    }
}
