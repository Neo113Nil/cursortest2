package Oe;

import Le.InterfaceC3583a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3701u {
    @NotNull
    public static final C3699s a(@NotNull String name, @NotNull InterfaceC3583a primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new C3699s(name, new C3700t(primitiveSerializer));
    }
}
