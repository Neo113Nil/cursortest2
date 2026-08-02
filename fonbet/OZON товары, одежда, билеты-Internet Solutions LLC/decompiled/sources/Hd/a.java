package Hd;

import java.util.Set;
import je.G0;
import je.Y;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.i0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f10833a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final G0 f10834b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f10835c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f10836d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10837e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<i0> f10838f;

    /* renamed from: g, reason: collision with root package name */
    private final Y f10839g;

    public /* synthetic */ a(G0 g02, boolean z11, boolean z12, Set set, int i11) {
        this(g02, c.INFLEXIBLE, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? null : set, null);
    }

    public static a a(a aVar, c cVar, boolean z11, Set set, Y y11, int i11) {
        G0 howThisTypeIsUsed = aVar.f10834b;
        if ((i11 & 2) != 0) {
            cVar = aVar.f10835c;
        }
        c flexibility = cVar;
        if ((i11 & 4) != 0) {
            z11 = aVar.f10836d;
        }
        boolean z12 = z11;
        boolean z13 = aVar.f10837e;
        if ((i11 & 16) != 0) {
            set = aVar.f10838f;
        }
        Set set2 = set;
        if ((i11 & 32) != 0) {
            y11 = aVar.f10839g;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z12, z13, set2, y11);
    }

    public final Y b() {
        return this.f10839g;
    }

    @NotNull
    public final c c() {
        return this.f10835c;
    }

    @NotNull
    public final G0 d() {
        return this.f10834b;
    }

    public final Set<i0> e() {
        return this.f10838f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(aVar.f10839g, this.f10839g) && aVar.f10834b == this.f10834b && aVar.f10835c == this.f10835c && aVar.f10836d == this.f10836d && aVar.f10837e == this.f10837e;
    }

    public final boolean f() {
        return this.f10837e;
    }

    public final boolean g() {
        return this.f10836d;
    }

    @NotNull
    public final a h(boolean z11) {
        return a(this, null, z11, null, null, 59);
    }

    public final int hashCode() {
        Y y11 = this.f10839g;
        int hashCode = y11 != null ? y11.hashCode() : 0;
        int hashCode2 = this.f10834b.hashCode() + (hashCode * 31) + hashCode;
        int hashCode3 = this.f10835c.hashCode() + (hashCode2 * 31) + hashCode2;
        int i11 = (hashCode3 * 31) + (this.f10836d ? 1 : 0) + hashCode3;
        return (i11 * 31) + (this.f10837e ? 1 : 0) + i11;
    }

    @NotNull
    public final a i(Y y11) {
        return a(this, null, false, null, y11, 31);
    }

    @NotNull
    public final a j(@NotNull c flexibility) {
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return a(this, flexibility, false, null, null, 61);
    }

    public final a k(i0 typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Set<i0> set = this.f10838f;
        return a(this, null, false, set != null ? e0.g(set, typeParameter) : e0.h(typeParameter), null, 47);
    }

    @NotNull
    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f10834b + ", flexibility=" + this.f10835c + ", isRaw=" + this.f10836d + ", isForAnnotationParameter=" + this.f10837e + ", visitedTypeParameters=" + this.f10838f + ", defaultType=" + this.f10839g + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull G0 howThisTypeIsUsed, @NotNull c flexibility, boolean z11, boolean z12, Set<? extends i0> set, Y y11) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f10833a = set;
        this.f10834b = howThisTypeIsUsed;
        this.f10835c = flexibility;
        this.f10836d = z11;
        this.f10837e = z12;
        this.f10838f = set;
        this.f10839g = y11;
    }
}
