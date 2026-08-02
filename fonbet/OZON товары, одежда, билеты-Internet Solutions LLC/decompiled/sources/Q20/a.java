package Q20;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f22943a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22944b;

    public a(@NotNull String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f22943a = title;
        this.f22944b = str;
    }

    public final String a() {
        return this.f22944b;
    }

    @NotNull
    public final String b() {
        return this.f22943a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f22943a, aVar.f22943a) && Intrinsics.d(this.f22944b, aVar.f22944b);
    }

    public final int hashCode() {
        int hashCode = this.f22943a.hashCode() * 31;
        String str = this.f22944b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocalizationStubVo(title=");
        sb2.append(this.f22943a);
        sb2.append(", subtitle=");
        return o0.c(sb2, this.f22944b, ")");
    }
}
