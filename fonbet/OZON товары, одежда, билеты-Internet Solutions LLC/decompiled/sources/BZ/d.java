package BZ;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f3321a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3322b;

    public d(@NotNull String name, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f3321a = name;
        this.f3322b = i11;
    }

    public static d a(d dVar, String name, int i11, int i12) {
        if ((i12 & 1) != 0) {
            name = dVar.f3321a;
        }
        if ((i12 & 2) != 0) {
            i11 = dVar.f3322b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        return new d(name, i11);
    }

    @NotNull
    public final String b() {
        return this.f3321a;
    }

    public final int c() {
        return this.f3322b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3322b == dVar.f3322b && Intrinsics.d(this.f3321a, dVar.f3321a);
    }

    public final int hashCode() {
        return this.f3321a.hashCode() + (this.f3322b * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MiniAppConfig(name='");
        sb2.append(this.f3321a);
        sb2.append("', themeId=");
        return K00.b.e(this.f3322b, ")", sb2);
    }
}
