package T00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f26442a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26443b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f26444c;

    public c() {
        this(null, null, null);
    }

    public final String a() {
        return this.f26443b;
    }

    public final String b() {
        return this.f26442a;
    }

    public final Boolean c() {
        return this.f26444c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f26442a, cVar.f26442a) && Intrinsics.d(this.f26443b, cVar.f26443b) && Intrinsics.d(this.f26444c, cVar.f26444c);
    }

    public final int hashCode() {
        String str = this.f26442a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26443b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f26444c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LayoutTrackingInfo(miniapp=");
        sb2.append(this.f26442a);
        sb2.append(", marketplaceId=");
        sb2.append(this.f26443b);
        sb2.append(", teensMode=");
        return D3.g.d(sb2, this.f26444c, ")");
    }

    public c(String str, String str2, Boolean bool) {
        this.f26442a = str;
        this.f26443b = str2;
        this.f26444c = bool;
    }
}
