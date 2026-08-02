package P20;

import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<b> f21704a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<b> f21705b;

    /* renamed from: c, reason: collision with root package name */
    private final Q20.a f21706c;

    public e() {
        this(null, null, null, 7);
    }

    public static e a(e eVar, Q20.a aVar) {
        List<b> modules = eVar.f21704a;
        List<b> libraries = eVar.f21705b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(libraries, "libraries");
        return new e(modules, libraries, aVar);
    }

    @NotNull
    public final List<b> b() {
        return this.f21705b;
    }

    @NotNull
    public final List<b> c() {
        return this.f21704a;
    }

    public final Q20.a d() {
        return this.f21706c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f21704a, eVar.f21704a) && Intrinsics.d(this.f21705b, eVar.f21705b) && Intrinsics.d(this.f21706c, eVar.f21706c);
    }

    public final int hashCode() {
        int b11 = G.g.b(this.f21704a.hashCode() * 31, 31, this.f21705b);
        Q20.a aVar = this.f21706c;
        return b11 + (aVar == null ? 0 : aVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "SourceListUiState(modules=" + this.f21704a + ", libraries=" + this.f21705b + ", stub=" + this.f21706c + ")";
    }

    public e(List list, List list2, Q20.a aVar, int i11) {
        this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? K.f71697a : list2, (i11 & 4) != 0 ? null : aVar);
    }

    public e(@NotNull List<b> modules, @NotNull List<b> libraries, Q20.a aVar) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(libraries, "libraries");
        this.f21704a = modules;
        this.f21705b = libraries;
        this.f21706c = aVar;
    }
}
