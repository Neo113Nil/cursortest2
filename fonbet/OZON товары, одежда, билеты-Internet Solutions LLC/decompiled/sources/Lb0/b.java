package Lb0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16678a;

    public b(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f16678a = description;
    }

    @NotNull
    public final String a() {
        return this.f16678a;
    }
}
