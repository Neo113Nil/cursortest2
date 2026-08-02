package Oe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Q extends AbstractC3706z {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f20268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(@NotNull Me.f primitive) {
        super(primitive);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f20268b = primitive.f() + "Array";
    }

    @Override // Me.f
    @NotNull
    public final String f() {
        return this.f20268b;
    }
}
