package O20;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f19895a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<b> f19896b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f19897c;

    /* renamed from: d, reason: collision with root package name */
    private final Q20.a f19898d;

    public k() {
        this((String) null, (List) null, (Q20.a) null, 15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k a(k kVar, ArrayList arrayList, String searchQuery, Q20.a aVar, int i11) {
        String sourceName = kVar.f19895a;
        List resources = arrayList;
        if ((i11 & 2) != 0) {
            resources = kVar.f19896b;
        }
        if ((i11 & 4) != 0) {
            searchQuery = kVar.f19897c;
        }
        if ((i11 & 8) != 0) {
            aVar = kVar.f19898d;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new k(sourceName, (List<b>) resources, searchQuery, aVar);
    }

    @NotNull
    public final List<b> b() {
        return this.f19896b;
    }

    @NotNull
    public final String c() {
        return this.f19897c;
    }

    @NotNull
    public final String d() {
        return this.f19895a;
    }

    public final Q20.a e() {
        return this.f19898d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f19895a, kVar.f19895a) && Intrinsics.d(this.f19896b, kVar.f19896b) && Intrinsics.d(this.f19897c, kVar.f19897c) && Intrinsics.d(this.f19898d, kVar.f19898d);
    }

    public final int hashCode() {
        int a11 = G.g.a(G.g.b(this.f19895a.hashCode() * 31, 31, this.f19896b), 31, this.f19897c);
        Q20.a aVar = this.f19898d;
        return a11 + (aVar == null ? 0 : aVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ResourceListUiState(sourceName=" + this.f19895a + ", resources=" + this.f19896b + ", searchQuery=" + this.f19897c + ", stub=" + this.f19898d + ")";
    }

    public k(String str, List list, Q20.a aVar, int i11) {
        this((i11 & 1) != 0 ? "" : str, (List<b>) ((i11 & 2) != 0 ? K.f71697a : list), "", (i11 & 8) != 0 ? null : aVar);
    }

    public k(@NotNull String sourceName, @NotNull List<b> resources, @NotNull String searchQuery, Q20.a aVar) {
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f19895a = sourceName;
        this.f19896b = resources;
        this.f19897c = searchQuery;
        this.f19898d = aVar;
    }
}
