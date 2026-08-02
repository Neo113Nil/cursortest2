package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class A0 extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23500a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(@NotNull String name) {
        super(0);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f23500a = name;
    }

    @NotNull
    public final String a() {
        return this.f23500a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A0) && Intrinsics.d(this.f23500a, ((A0) obj).f23500a);
    }

    public final int hashCode() {
        return this.f23500a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("WidgetName(name="), this.f23500a, ")");
    }
}
