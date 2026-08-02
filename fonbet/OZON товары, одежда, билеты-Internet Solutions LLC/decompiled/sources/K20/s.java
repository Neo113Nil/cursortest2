package K20;

import B90.C2618u;
import Kk.C3532b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f15160a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15161b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<L20.a> f15162c;

    public s() {
        this(7, null);
    }

    public static s a(s sVar, String search, boolean z11, ArrayList list, int i11) {
        if ((i11 & 1) != 0) {
            search = sVar.f15160a;
        }
        if ((i11 & 2) != 0) {
            z11 = sVar.f15161b;
        }
        sVar.getClass();
        Intrinsics.checkNotNullParameter(search, "search");
        Intrinsics.checkNotNullParameter(list, "list");
        return new s(search, z11, list);
    }

    @NotNull
    public final List<L20.a> b() {
        return this.f15162c;
    }

    @NotNull
    public final String c() {
        return this.f15160a;
    }

    public final boolean d() {
        return this.f15161b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f15160a, sVar.f15160a) && this.f15161b == sVar.f15161b && Intrinsics.d(this.f15162c, sVar.f15162c);
    }

    public final int hashCode() {
        return this.f15162c.hashCode() + C3532b.a(this.f15160a.hashCode() * 31, 31, this.f15161b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DependenciesUiState(search=");
        sb2.append(this.f15160a);
        sb2.append(", transitiveEnabled=");
        sb2.append(this.f15161b);
        sb2.append(", list=");
        return C2618u.h(sb2, this.f15162c, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(@NotNull String search, boolean z11, @NotNull List<? extends L20.a> list) {
        Intrinsics.checkNotNullParameter(search, "search");
        Intrinsics.checkNotNullParameter(list, "list");
        this.f15160a = search;
        this.f15161b = z11;
        this.f15162c = list;
    }

    public s(int i11, ArrayList arrayList) {
        this("", false, (i11 & 4) != 0 ? K.f71697a : arrayList);
    }
}
