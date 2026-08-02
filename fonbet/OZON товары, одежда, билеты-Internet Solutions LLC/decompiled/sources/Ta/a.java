package Ta;

import Ua.C4057a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4057a f26973a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Na.a f26974b;

    public a(@NotNull C4057a c4057a, @NotNull Na.a array) {
        Intrinsics.checkNotNullParameter(c4057a, "native");
        Intrinsics.checkNotNullParameter(array, "array");
        this.f26973a = c4057a;
        this.f26974b = array;
    }

    @NotNull
    public final Na.a a() {
        return this.f26974b;
    }

    @NotNull
    public final C4057a b() {
        return this.f26973a;
    }
}
