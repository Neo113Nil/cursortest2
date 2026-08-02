package Xd;

import java.util.List;
import je.N;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z extends C4885b {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final N f34417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@NotNull List<? extends g<?>> value, @NotNull N type) {
        super(value, new y(type));
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f34417c = type;
    }

    @NotNull
    public final N c() {
        return this.f34417c;
    }
}
