package D20;

import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f5594a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f5595b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f5596c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5597d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f5598e;

    public a(@NotNull String groupName, @NotNull String artifactName, @NotNull String version, boolean z11) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(artifactName, "artifactName");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f5594a = groupName;
        this.f5595b = artifactName;
        this.f5596c = version;
        this.f5597d = z11;
        this.f5598e = groupName + ProductContainerDTO.RATIO_DELIMITER + artifactName + ProductContainerDTO.RATIO_DELIMITER + version;
    }

    @NotNull
    public final String a() {
        return this.f5595b;
    }

    @NotNull
    public final String b() {
        return this.f5594a;
    }

    @NotNull
    public final String c() {
        return this.f5598e;
    }

    @NotNull
    public final String d() {
        return this.f5596c;
    }

    public final boolean e() {
        return this.f5597d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f5594a, aVar.f5594a) && Intrinsics.d(this.f5595b, aVar.f5595b) && Intrinsics.d(this.f5596c, aVar.f5596c) && this.f5597d == aVar.f5597d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5597d) + g.a(g.a(this.f5594a.hashCode() * 31, 31, this.f5595b), 31, this.f5596c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency(groupName=");
        sb2.append(this.f5594a);
        sb2.append(", artifactName=");
        sb2.append(this.f5595b);
        sb2.append(", version=");
        sb2.append(this.f5596c);
        sb2.append(", isTransitive=");
        return Pk0.a.a(")", sb2, this.f5597d);
    }
}
