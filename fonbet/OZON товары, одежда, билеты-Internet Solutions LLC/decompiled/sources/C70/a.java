package C70;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f4468a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4469b;

    public a(@NotNull String from, String str) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f4468a = from;
        this.f4469b = str;
    }

    @NotNull
    public final String a() {
        return this.f4468a;
    }

    public final String b() {
        return this.f4469b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f4468a, aVar.f4468a) && Intrinsics.d(this.f4469b, aVar.f4469b);
    }

    public final int hashCode() {
        int hashCode = this.f4468a.hashCode() * 31;
        String str = this.f4469b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperationFromTo(from=");
        sb2.append(this.f4468a);
        sb2.append(", to=");
        return o0.c(sb2, this.f4469b, ")");
    }
}
