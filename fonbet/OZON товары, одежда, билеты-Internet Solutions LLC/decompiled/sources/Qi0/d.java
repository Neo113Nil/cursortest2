package Qi0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23486a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23487b;

    public d(@NotNull String message, @NotNull String locator) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(locator, "locator");
        this.f23486a = message;
        this.f23487b = locator;
    }

    @NotNull
    public final String a() {
        return this.f23486a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f23486a, dVar.f23486a) && Intrinsics.d(this.f23487b, dVar.f23487b);
    }

    public final int hashCode() {
        return this.f23487b.hashCode() + (this.f23486a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationVO(message=");
        sb2.append(this.f23486a);
        sb2.append(", locator=");
        return o0.c(sb2, this.f23487b, ")");
    }
}
