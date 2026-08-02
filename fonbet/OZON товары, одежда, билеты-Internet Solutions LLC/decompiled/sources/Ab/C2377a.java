package Ab;

import B3.D;
import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ab.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C2377a {

    /* renamed from: a, reason: collision with root package name */
    private final int f686a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f687b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f688c;

    public C2377a(int i11, @NotNull String message, @NotNull String status) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f686a = i11;
        this.f687b = message;
        this.f688c = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2377a)) {
            return false;
        }
        C2377a c2377a = (C2377a) obj;
        return this.f686a == c2377a.f686a && Intrinsics.d(this.f687b, c2377a.f687b) && Intrinsics.d(this.f688c, c2377a.f688c);
    }

    public final int hashCode() {
        return this.f688c.hashCode() + g.a(Integer.hashCode(this.f686a) * 31, 31, this.f687b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResponseError(code=");
        sb2.append(this.f686a);
        sb2.append(", message=");
        sb2.append(this.f687b);
        sb2.append(", status=");
        return D.c(sb2, this.f688c, ')');
    }
}
