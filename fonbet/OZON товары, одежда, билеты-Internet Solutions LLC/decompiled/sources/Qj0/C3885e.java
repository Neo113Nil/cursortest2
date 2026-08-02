package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3885e extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23629a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3885e(@NotNull String url) {
        super(0);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f23629a = url;
    }

    @NotNull
    public final String a() {
        return this.f23629a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3885e) && Intrinsics.d(this.f23629a, ((C3885e) obj).f23629a);
    }

    public final int hashCode() {
        return this.f23629a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("CurrentUrl(url="), this.f23629a, ")");
    }
}
