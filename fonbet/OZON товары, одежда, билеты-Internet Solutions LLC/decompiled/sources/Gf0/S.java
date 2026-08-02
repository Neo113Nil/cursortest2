package Gf0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class S implements C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qf0.b f10156a;

    public S(@NotNull qf0.b networkMode) {
        Intrinsics.checkNotNullParameter(networkMode, "networkMode");
        this.f10156a = networkMode;
    }

    @NotNull
    public final qf0.b a() {
        return this.f10156a;
    }
}
