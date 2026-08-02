package K1;

import Sc.InterfaceC3999a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes8.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f15017a;

    public W(@NotNull String str) {
        this.f15017a = str;
    }

    @NotNull
    public final String a() {
        return this.f15017a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof W) {
            return Intrinsics.d(this.f15017a, ((W) obj).f15017a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15017a.hashCode();
    }

    @NotNull
    public final String toString() {
        return B3.D.c(new StringBuilder("UrlAnnotation(url="), this.f15017a, ')');
    }
}
