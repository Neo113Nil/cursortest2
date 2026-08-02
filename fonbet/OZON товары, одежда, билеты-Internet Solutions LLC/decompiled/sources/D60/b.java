package D60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f6098a;

    public b(@NotNull a authorized) {
        Intrinsics.checkNotNullParameter(authorized, "authorized");
        this.f6098a = authorized;
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return C7714v.a0(this.f6098a);
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "user";
    }
}
