package K60;

import D3.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f15294a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15295b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f15296c;

    public a(@NotNull String tabId, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        this.f15294a = tabId;
        this.f15295b = str;
        this.f15296c = bool;
    }

    public final Boolean a() {
        return this.f15296c;
    }

    @NotNull
    public final String b() {
        return this.f15294a;
    }

    public final String c() {
        return this.f15295b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f15294a, aVar.f15294a) && Intrinsics.d(this.f15295b, aVar.f15295b) && Intrinsics.d(this.f15296c, aVar.f15296c);
    }

    public final int hashCode() {
        int hashCode = this.f15294a.hashCode() * 31;
        String str = this.f15295b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f15296c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GoSpa(tabId=");
        sb2.append(this.f15294a);
        sb2.append(", url=");
        sb2.append(this.f15295b);
        sb2.append(", replace=");
        return g.d(sb2, this.f15296c, ")");
    }
}
