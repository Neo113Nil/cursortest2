package Y40;

import B0.C2454a;
import B90.C2618u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34585a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34586b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34587c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f34588d;

    /* renamed from: e, reason: collision with root package name */
    private final Float f34589e;

    public c(@NotNull String id2, int i11, String str, @NotNull ArrayList framesList, Float f7) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(framesList, "framesList");
        this.f34585a = id2;
        this.f34586b = i11;
        this.f34587c = str;
        this.f34588d = framesList;
        this.f34589e = f7;
    }

    @NotNull
    public final List<b> a() {
        return this.f34588d;
    }

    @NotNull
    public final String b() {
        return this.f34585a;
    }

    public final Float c() {
        return this.f34589e;
    }

    public final int d() {
        return this.f34586b;
    }

    public final String e() {
        return this.f34587c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f34585a, cVar.f34585a) && this.f34586b == cVar.f34586b && Intrinsics.d(this.f34587c, cVar.f34587c) && this.f34588d.equals(cVar.f34588d) && Intrinsics.d(this.f34589e, cVar.f34589e);
    }

    public final int hashCode() {
        int a11 = C2454a.a(this.f34586b, C2454a.a(2, this.f34585a.hashCode() * 31, 31), 31);
        String str = this.f34587c;
        int b11 = C2618u.b(this.f34588d, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31);
        Float f7 = this.f34589e;
        return b11 + (f7 != null ? f7.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "OnboardingUI(id=" + this.f34585a + ", cbottomVersion=2, selectedFrame=" + this.f34586b + ", widgetName=" + this.f34587c + ", framesList=" + this.f34588d + ", ratio=" + this.f34589e + ")";
    }
}
