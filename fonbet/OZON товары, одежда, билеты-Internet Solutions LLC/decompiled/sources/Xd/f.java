package Xd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sd.b f34398a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34399b;

    public f(@NotNull Sd.b classId, int i11) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f34398a = classId;
        this.f34399b = i11;
    }

    @NotNull
    public final Sd.b a() {
        return this.f34398a;
    }

    public final int b() {
        return this.f34399b;
    }

    public final int c() {
        return this.f34399b;
    }

    @NotNull
    public final Sd.b d() {
        return this.f34398a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f34398a, fVar.f34398a) && this.f34399b == fVar.f34399b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34399b) + (this.f34398a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        int i11;
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        while (true) {
            i11 = this.f34399b;
            if (i12 >= i11) {
                break;
            }
            sb2.append("kotlin/Array<");
            i12++;
        }
        sb2.append(this.f34398a);
        for (int i13 = 0; i13 < i11; i13++) {
            sb2.append(">");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
