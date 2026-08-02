package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3884d extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23620a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3884d(@NotNull String page) {
        super(0);
        Intrinsics.checkNotNullParameter(page, "page");
        this.f23620a = page;
    }

    @NotNull
    public final String a() {
        return this.f23620a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3884d) && Intrinsics.d(this.f23620a, ((C3884d) obj).f23620a);
    }

    public final int hashCode() {
        return this.f23620a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("CurrentPage(page="), this.f23620a, ")");
    }
}
