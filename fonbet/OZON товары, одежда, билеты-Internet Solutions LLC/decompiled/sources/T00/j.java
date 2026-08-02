package T00;

import T7.E;
import java.util.List;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f26474a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f26475b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, List<j>> f26476c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f26477d;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull m layout, @NotNull Object parsedDTO, @NotNull Map<String, ? extends List<j>> parsedPlaceholders, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(parsedDTO, "parsedDTO");
        Intrinsics.checkNotNullParameter(parsedPlaceholders, "parsedPlaceholders");
        this.f26474a = layout;
        this.f26475b = parsedDTO;
        this.f26476c = parsedPlaceholders;
        this.f26477d = map;
    }

    @NotNull
    public final m a() {
        return this.f26474a;
    }

    @NotNull
    public final Object b() {
        return this.f26475b;
    }

    @NotNull
    public final Map<String, List<j>> c() {
        return this.f26476c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.String>] */
    public final Map<String, String> d() {
        return this.f26477d;
    }

    @NotNull
    public final m e() {
        return this.f26474a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f26474a, jVar.f26474a) && Intrinsics.d(this.f26475b, jVar.f26475b) && Intrinsics.d(this.f26476c, jVar.f26476c) && Intrinsics.d(this.f26477d, jVar.f26477d);
    }

    @NotNull
    public final Object f() {
        return this.f26475b;
    }

    public final int hashCode() {
        int a11 = D40.c.a(this.f26476c, H00.a.c(this.f26474a.hashCode() * 31, 31, this.f26475b), 31);
        Object obj = this.f26477d;
        return a11 + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RawWidget(layout=");
        sb2.append(this.f26474a);
        sb2.append(", parsedDTO=");
        sb2.append(this.f26475b);
        sb2.append(", parsedPlaceholders=");
        sb2.append(this.f26476c);
        sb2.append(", preparedPlaceholders=");
        return E.c(this.f26477d, ")", sb2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@NotNull m layout, @NotNull Object dto) {
        this(layout, dto, U.c(), U.c());
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(dto, "dto");
    }
}
