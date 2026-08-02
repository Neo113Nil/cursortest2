package E2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f7344a;

    public e(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f7344a = type;
    }

    @NotNull
    public final String a() {
        return this.f7344a;
    }
}
